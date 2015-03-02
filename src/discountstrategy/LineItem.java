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
public class LineItem {
    private Product product;
    private int qty;
    private FakeDatabase database;

    public LineItem() {
    }

    public LineItem(Product product, int qty, FakeDatabase database) {
        this.product = product;
        this.qty = qty;
        this.database = database;
    }
    
    
    
}
