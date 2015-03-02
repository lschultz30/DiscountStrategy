/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.util.Arrays;

/**
 *
 * @author Lane Schultz
 */
public class Startup {
     public static void main(String[] args){
         CashRegister register = new CashRegister("1010");

        register.addProductToReceipt("P0011", 3);
        register.addProductToReceipt("P0340", 1);
        register.addProductToReceipt("P0002", 2);

        register.printReceipt();
         
         
      
    }
}
