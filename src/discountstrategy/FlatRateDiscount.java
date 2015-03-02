
package discountstrategy;

/**
 *
 * @author Lane Schultz
 */
public class FlatRateDiscount implements DiscountStrategy{
    private double discountRate = 10;
    

    public FlatRateDiscount(double rate) {
        setDiscountRate(rate);
    }

    public FlatRateDiscount() {
    }
    

@Override
    public final double getDiscountAmt(final double unitPrice, final int qty) {
        return discountRate;
    }
@Override
    public final double getDiscountTotal(final double unitPrice, final int qty){
   
        return unitPrice*qty - getDiscountAmt(unitPrice,qty);
    }
   

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(final double discountRate) {
        this.discountRate = discountRate;
    }

//    public static void main(String[] args) {
//        DiscountStrategy first = new QuantityDiscount(.10,4);
//         double amount = first.getDiscountAmt(100, 3);
//         double total= first.getDiscountTotal(100, 3);
//         System.out.println(amount);
//         System.out.println(total);
//    }


}
