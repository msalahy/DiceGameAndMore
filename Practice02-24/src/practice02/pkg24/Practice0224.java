
package practice02.pkg24;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Practice0224 {
    public static void main(String [] args){
        

         Scanner input = new Scanner(System.in);
         
         String item = "Cheese";
         RetailItem retail = new RetailItem(item);
         
         System.out.println("What item do you have in the class? ");
         String newItem = input.nextLine();
         retail.setItemForSale(newItem);
         RetailItem newRetail = new RetailItem(newItem);
         
         CashRegister cashRegister = new CashRegister(newRetail, 10, 10);
         System.out.println(cashRegister.toString());
        
    }
}




