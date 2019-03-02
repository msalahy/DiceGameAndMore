/*
 Mohammad Salahy
02-09-2019
AccountHolder.java
lab 1
*/
package accountholdertest;

// Needed java packages imported. 
import java.util.Scanner;

class AccountHolder {
    Scanner scanner = new Scanner(System.in);
    static double annualInterestRate = 0.04;
    double balance;
    
    /*
    If the balance is less than zere; it will not go furher.
    It asks the users again to enter a positive balance;
    */
    public AccountHolder(double balance) {
        boolean flag = true;
        while(flag){
            if(balance<0){
                System.out.println("Please enter a positive account balance.");
                balance=scanner.nextDouble();
            }
            else {
                flag = false; 
            }
        }
        this.balance=balance;   
    }
    
    
    /*
    This method gets the deposit amount and add it to the base balance.
    */
    public void deposit(double balance){
        boolean flag = true;
        while(flag){
            if(balance<0){
                System.out.println("Please enter a positive deposit amount.");
                balance=scanner.nextDouble();
            }
            else {
                flag = false; 
            }
        }
        this.balance+=balance;
        //System.out.println("New Balance after deposit is."+this.balance);
    }
     
    
    /*
    This method gets the a positiv number from the user.
    If a withdrawal allows the account balance to drop below $0,
    this method will add a fee charge of $35 to the balance.
    */
    public void withdrawal(double balance){
        boolean flag = true;
        while(flag){
            if(balance<0){
                System.out.println("Please enter a positive withdrawal amount.");
                balance=scanner.nextDouble();
            }
            else{
                flag = false; 
            }
        }
        this.balance-=balance;
        if(this.balance<0){
            System.out.println("There is a -35 penalty fee for negative balance withdrawal.");
            this.balance=this.balance-35;
            System.out.println("You new balance after fee is: "+this.balance);
        }
    }
    
    
    /*
    This method gives the total money after deposit and withdrwal. 
    */
    public double totalMoney(){
        return this.balance;
    }
    

    /*
    This method modifyes the interest rate. 
    Interest rate should be greater than or equal to 0 and less then or equal to 1.0
    */
    public void modifyMonthlyInterest (double rateUpdate){
        boolean rate = true;
        while(rate){
             if(rateUpdate>0 && rateUpdate<1){
                 rate = false;
            }
             else {
                System.out.println("Please enter the interest"
                        + " rate bigger to 0 and smaller"
                        + " to 1.");
                rateUpdate = scanner.nextDouble();
                rate=true;
            }       
        }
        annualInterestRate = rateUpdate;
    }

   
    
    /*
    This method only returns the current annual
    Interest Rate after being modified. 
    */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    
    
    /*
    This method give the new monlthly balance after the monthly interest rate. 
    */
    public double monthlyInterest(){
        return this.balance += this.balance * (annualInterestRate / 12.0);
    }

}

