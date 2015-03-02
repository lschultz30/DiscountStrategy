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
public class PrintedReceipt implements ReceiptStrategy{
    private String prodID;

    @Override
    public void outputReceipt(String data) {
        System.out.println(data);
    }

    @Override
    public void outputMessage(String msg) {
        System.out.println("\n========== Data Entry Error ==========");
        System.out.println(msg);
        System.out.println("=======================================\n");
    }

    @Override
    public boolean outputMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProductToReceipt(String prodID, int quantity) {
        System.out.println(prodID + quantity);
    }

}
