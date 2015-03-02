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
public class Product {
    private String productID;
    private String productName;
    private double unitPrice;
    private DiscountStrategy discounts;
    private int qty;
    
     //constructor

    public Product(String productID, String productName, double unitPrice, DiscountStrategy discounts, int qty) {
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.discounts = discounts;
        this.qty = qty;
    }

    Product(String p0011, String duck_Cap, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public double getTotalDiscount() {
        return discounts.getDiscountAmt(unitPrice, qty);
    }
    
    
    //setters and getters
    public final String getProductID() {
        return productID;
    }
    
    public final void setProductID(final String productID) {
        if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
