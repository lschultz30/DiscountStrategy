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
public interface DatabaseStrategy {
    public abstract Customer getCustomers(final String custId);
    public abstract Product getProduct(final String prodId);
}
