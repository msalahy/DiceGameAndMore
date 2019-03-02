
package filewritedemo;

import java.util.Scanner;
import java.io.*;


public class FileWriteDemo {


    public static void main(String[] args) throws IOException {
        String filename;
        String friendName;
        int numberOfFriends;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("How many friends do you have ? ");
        numberOfFriends = keyboard.nextInt();
        
        keyboard.nextLine();
        
        System.out.println("Enter the file name: ");
        filename = keyboard.nextLine();
        
        PrintWriter outputFile = new PrintWriter (filename);
        for(int i =1; i<=numberOfFriends; i++){
            System.out.println("Enter the name of friend number "+i+" : ");
            friendName = keyboard.nextLine();
            
            outputFile.println(friendName);
        }
        outputFile.close();
        
        
    }
    
}
