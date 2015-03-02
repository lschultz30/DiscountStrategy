
package discountstrategy;

/**
 *
 * @author Lane Schultz
 */
public class CashRegister {
     private ReceiptStrategy receipt;

   
    public CashRegister(String customerID) {
    }

  
    public CashRegister(int customerID) {
        receipt = new PrintedReceipt();

    }

    //public methods
    public final void addProductToReceipt(String prodID, int quantity) {
        receipt.addProductToReceipt(prodID, quantity);
    }

    public final void setReceiptType(ReceiptStrategy receipt) {
        if (receipt == null) {
            throw new NullPointerException();
        }
        this.receipt = receipt;
    }

    public final void printReceipt() {

    }
}