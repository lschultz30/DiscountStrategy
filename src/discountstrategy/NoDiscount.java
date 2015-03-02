package discountstrategy;

/**
 *
 * @author Lane Schultz
 */
public class NoDiscount implements DiscountStrategy {
   private double discountRate = 0;

    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        return 0;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = 0;
    } 

    @Override
    public double getDiscountTotal(double unitPrice, int qty) {
        return discountRate;
    }
}
