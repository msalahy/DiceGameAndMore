
package errorcatcher;


import java.io.*;
import java.util.*;


public class MultiCatch {
    
    public static void main (String[] args){
       String name;
        String filename = null;
        String friendName;
        int numberOfFriends;
       
        Scanner keyboard = new Scanner (System.in);
        try {
            
        System.out.println("How many friends do you have ? ");
        numberOfFriends = keyboard.nextInt();
        
        keyboard.nextLine();
        
        System.out.println("Enter the file name: ");
        filename = keyboard.nextLine();
        
        PrintWriter outputFile = new PrintWriter (filename);
        for(int i =1; i<=numberOfFriends; i++)
        {
            System.out.println("Enter the name of friend number "+i+" : ");
            friendName = keyboard.nextLine();
            
            outputFile.println(friendName);
        }
        outputFile.close();
            
        }
        catch (FileNotFoundException e){ 
            System.out.println("File not found.");
            
        } 
    
       try{
           
           File file = new File(filename);
           Scanner inputFile = new Scanner(file);
           
           while(inputFile.hasNextLine())
           {
               name = inputFile.nextLine();
               System.out.println(name);
           }
           inputFile.close();
           
           
       }
       catch(FileNotFoundException | InputMismatchException ex)
       {
           System.out.println("Error process the file. ");
       }
        
    }
    
    
}
