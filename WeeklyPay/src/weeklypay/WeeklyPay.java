
package weeklypay;


import java.util.Scanner;
import java.text.DecimalFormat;

public class WeeklyPay {

    public static void main(String[] args) {
        
        String employeeSelection;
        int hoursWorkedPerWeek;
        double hourlyRate;
        double yearlySalary;
        
        Scanner keyboard = new Scanner(System.in);
        
        DecimalFormat dollorSignFormat = new DecimalFormat("#,##0.00");
        
        System.out.println("Do you want to calcuatle the "+" Weekly Salary of an hourly paid employee ? ");
        System.out.println("Or a salary based paid emploee? ");
        System.out.println("Please enter H for hourly based or"+ " S for salary based employee:");
        employeeSelection = keyboard.nextLine();
        
        switch (employeeSelection.charAt(0)){
            case 'H':
            case 'h':
                System.out.println("How many hours did you work in one week? ");
                hoursWorkedPerWeek = keyboard.nextInt();
                System.out.println("What is the hourly pay rate? ");
                hourlyRate = keyboard.nextDouble();
                System.out.println("Your weekly gross pay is $"+dollorSignFormat.format(Pay.getWeeklyPay(hoursWorkedPerWeek, hourlyRate)));
            break;
            
            case 'S':
            case 's':
                System.out.println("What is the annual salary? ");
                yearlySalary = keyboard.nextDouble();
                System.out.println("The weekly gross pay is $"+dollorSignFormat.format(Pay.getWeeklyPay(yearlySalary)));
            break;
           
            default:
                System.out.println("Invalid Slection. ");
            
            
        }
    }
    
}
