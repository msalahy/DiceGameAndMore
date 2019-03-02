
package newpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mohammadsalehi
 */
public class NewPractice {


    public static void main(String[] args) {
        
        
        
        ArrayList <String> nameList = new ArrayList <String>();
        
        nameList.add("James");
        nameList.add("Mohammad");
        System.out.println(nameList);
        nameList.add(1, "Nemat");
        System.out.println(nameList);
        System.out.println(nameList.size());
        nameList.remove("James");
        System.out.println(nameList);
        
        nameList.add("Mohammad");
        System.out.println(nameList);
        nameList.remove("andfd");
        System.out.println(nameList.get(1));
        
        System.out.println(nameList);
        nameList.add(2, "wow");
        System.out.println(nameList);
        ArrayList <String> nameLists = new ArrayList <String>(12);
        System.out.println(nameLists);
        
        
    }

}




//        int [] numbers = {10, 20, 30, 40, 50};
//        
//        PrintWriter outputFile = new PrintWriter("Values.txt");
//        
//        for (int i = 0; i< numbers.length; i++){
//            outputFile.println(numbers[i]);
//        }
//        outputFile.close();
//        
//        
//        
//        final int elementSize = 5;
//        int[] number = new int[elementSize];
//        int i = 0;
//        
//        File file = new File("Values.txt");
//        Scanner inputFile = new Scanner(file);
//        while(inputFile.hasNext()&& i<number.length)
//        {
//            number[i] = inputFile.nextInt();
//            System.out.println(number[i]);
//            i++;
//        }
//        
//        inputFile.close();

