
package javacourse;

import java.util.Scanner;

public class JavaCourse {
    public static void main(String[] args) {
        int i, j, k;
        for(i=5; i>=1; i--){
            for(j=5-i; j>=1; j--)
                System.out.print(" ");
                for(k=0; k<i; k++)
                    System.out.print("* ");
                  System.out.println();  
        }  
    }
}






















 
//        String joe = null;
//        String name = joe;
//        int age = 25;
//        double annualPay=100000;
//        
//        System.out.println("My name is "+name+" I am "+age+" years' old"+"I wish to recieve "+annualPay+" incomoe." );
//     
//        System.out.println("Name : \n Mohammad"
//                + " \n address: Chicago");
//        
//        double deposit = 0;
//        double withdraw =0;
//        double interstRate=0;
//        double startingBalance;
//        
//        System.out.println(Math.pow(3, 3));
//        Scanner st = new Scanner(System.in);
//                
//        System.out.println("What is your current balance? "+"");
//        startingBalance = st.nextDouble();
//        
//        System.out.println("How much you want to deposit? ");
//        deposit = st.nextDouble();  
//        
//        System.out.println("How much you want to withdraw ?");
//        withdraw = st.nextDouble(); 
//        
//        System.out.println(" What is the interest rate ?");
//        interstRate = st.nextDouble(); 
//        
//        double firstCalc = (startingBalance+deposit)-withdraw;
//        
//        double balance = (((startingBalance+deposit)-withdraw)*interstRate/100)+firstCalc;
//
//        System.out.println("Your current balance is "+balance);
//       
//    }
//    
//}
