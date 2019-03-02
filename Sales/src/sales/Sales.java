
package sales;


import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;



public class Sales {


    public static void main(String[] args) {

        System.out.println(attendedExam());
    }
    
    public static int[] attendedExam(){
        int[] test = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Have you been in the exam : ");
        
        String attendedExam = input.nextLine();
        
        boolean flag = true;
        while(flag){
            if(attendedExam.charAt(0)=='N'||attendedExam.charAt(0)=='n'){
                System.out.println("You dont have any record. ");
                flag = false;
            }
            else{
            System.out.println("How many exam have you attended: ");
            int numberOfExam = input.nextInt();
           
            test = new int[numberOfExam];
            
            for(int index = 0; index<test.length; index++)
            {
                System.out.println("Enter your score for first exam: ");
                test[index] = input.nextInt();
            }
                System.out.println("You attended "+numberOfExam+" exam(s)");
                System.out.println("Your scores are as follow: ");
            System.out.println("List of scores: "+Arrays.toString(test));
                
        }
            flag=false;
        }
        return test;
        
        
        
    }
}
    