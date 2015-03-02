/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Lane Schultz
 */
public class QuantityDiscount implements DiscountStrategy{
    private double discountRate = 0.13;
    private int minQty = 3;

    public QuantityDiscount(double rate, int minQty) {
        setDiscountRate(rate);
        setMinQty(minQty);
    }

@Override
    public final double getDiscountAmt(final double unitPrice, final int qty) {
        if(qty >= minQty) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
    }
@Override
    public final double getDiscountTotal(final double unitPrice, final int qty){
    if(qty >= minQty) {
            return unitPrice * qty - getDiscountAmt(unitPrice,qty);
        } else {
            return unitPrice * qty;
        }
    }
    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(final int minQty) {
        this.minQty = minQty;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(final double discountRate) {
        this.discountRate = discountRate;
    }
}
