/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Practice {
    public static void main (String[] args) throws FileNotFoundException{
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("How many itmes do you have? ");
        int numberOfItems = input.nextInt();
        
        InventoryItem[] inventory = new InventoryItem[numberOfItems];
        
        getItems(inventory);
        
        System.out.println("You entered the following: ");

        for(int index =0; index<inventory.length; index++){
            System.out.println("Item "+ (index+1));
            System.out.println("Description: "+inventory[index].getDescription());
            System.out.println("Units: "+ inventory[index].getUnits());
            System.out.println(" ");
        }
    }
    
    
    private static void getItems(InventoryItem[] array){
        
        String description;
        int units;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter data for "+ array.length +" Invongtry items.");
         
         for(int index = 0; index<array.length; index++){
             System.out.println("Enter the descripton for item "+(index+1)+": "); 
             description = input.nextLine();
             
             System.out.println("Enter the units for item "+(index+1)+": "); 
             units = input.nextInt();
             
             input.nextLine();
             
             array[index]= new InventoryItem(description, units);
             System.out.println();
             
    }
    }
}
    
    
    
    
        
  