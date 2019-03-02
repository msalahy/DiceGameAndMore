/*
 Mohammad Salahy
02-09-2019
-//AccountHolderTest.java
-lab 1
*/
package accountholdertest;

// Needed Java librarires imported
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountHolderTest {

    public static void main(String[] args) {
        
        System.out.println("*************** Welcome to IIT Bank ***************");
        System.out.println();
        getStarted();   
    }
    
    /*
    This method mainly intialized everything and get the applicaiton to starts.
    It also asks to user's input.
    */
    public static void getStarted(){
        Scanner scanner = new Scanner(System.in);
        String letterChoice; 
        System.out.println("Do you want to open an account with us? Type yes or no.");
        letterChoice = scanner.nextLine();
        boolean flag = true;
        while(flag){
            switch (letterChoice.charAt(0)){
                case 'Y':
                case 'y':
                    double balance =0;
                    double interestRate =0;
                    boolean choice = true;
                    while(choice){
                        try {
                            System.out.println("Please kinldy enter your initial bank balance: ");
                            balance = scanner.nextDouble(); 
                            choice=false;
                        }
                        catch(InputMismatchException x){
                            scanner.next(); 
                            System.out.println("Error! I only accept numbers!");
                        }
                    }

                    /*
                    Constructor for the Account Holder Class that accept the initial balance;
                    */
                    AccountHolder accountHolder = new AccountHolder(balance);
                    scanner.nextLine();

                    /*
                     Asking for the amount that user want to deposit. 
                    */
                    System.out.println("How much you want to deposit? ");
                    double depositAmount = scanner.nextDouble();
                    accountHolder.deposit(depositAmount);

                    /*
                     Asking for the amount that user want to withdraw. 
                    */
                    System.out.println("How much you want to withdraw? ");
                    double withdrawAmount = scanner.nextDouble();
                    accountHolder.withdrawal(withdrawAmount);

                    /*
                    The user must enter an interest rate of bigger than zero and smaller than 1.
                    */
                    System.out.println("What is the interest rate? ");
                    interestRate = scanner.nextDouble();
                    accountHolder.modifyMonthlyInterest(interestRate); 

                    /*
                    Printing the result with the author signature and date. 
                    */
                    System.out.printf("%s%.2f%s%.2f%s\n", "Your ",accountHolder.totalMoney()," for 1 year at ",
                            accountHolder.getAnnualInterestRate()," interest: ");
                    System.out.printf("%-10s%10.2f\n", "Base", accountHolder.totalMoney());

                    for (int x=1; x<=12; x++)
                    {
                        System.out.printf("%-10s%10.2f\n",("Month " + x), accountHolder.monthlyInterest());
                    }

                    System.out.println();
                    String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    System.out.println("Current date = " + timeStamp + "\nProgrammed by Mohammad Salahy.\n");
                    System.out.println("*************** Thank you for using IIT Bank. ***************");
                    flag = false;
                break;
                case 'N':
                case 'n':
                    System.out.println("Thank for taking a look at Bank IIT. ");
                flag = false;
                break;
                default:
                    System.out.println("Please renter your choice.");
                    System.out.println("Do you want to open an account with us? Type Y for yes and N for No.");
                    letterChoice = scanner.nextLine();
                break;

            }
            
        }
    }
}

    



  
