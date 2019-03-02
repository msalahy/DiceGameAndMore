
package commmision;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Commmision {


    public static void main(String[] args) {
        
        double sales, adavancePay;
        DecimalFormat dollar = new DecimalFormat ("#,##0.00");
        DecimalFormat percent = new DecimalFormat ("#0%");       
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This progrma will dispaly a pay report for a salesperson.");
        System.out.println("Enter the following information: ");
        
        System.out.println("Amount of sales: $");
        sales = keyboard.nextDouble();
        
        System.out.println("Amount of advance payment : $");
        adavancePay = keyboard.nextDouble();
        
        SalesCommision payInfo = new SalesCommision(sales, adavancePay);
        
        System.out.println("\nPay Report");
        System.out.println("---------------------------");
        System.out.println("Sales : $"+dollar.format(payInfo.getSales()));
        System.out.println("Commission Rate : $"+percent.format(payInfo.getRate()));
        System.out.println("Commission : $"+dollar.format(payInfo.getCommission()));
        System.out.println("Advance payment: $"+dollar.format(payInfo.getAdvance()));
        System.out.println("Remaining pay: $"+dollar.format(payInfo.getPay()));
        

        
        
    }
    
}
