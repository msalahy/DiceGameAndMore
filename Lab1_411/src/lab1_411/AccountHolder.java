
package lab1_411;

public class AccountHolder {
    
    double balance; 
    static double annualInterestRate;
    // constructor

    public AccountHolder( double balance) {
        this.balance = balance < 0 ? 0 : balance;
    }
    
    public void deposit (double balance){    
        this.balance +=balance;
    }
        
    public void withdraw (double balance){    
        this.balance -=balance;
    }

    // comment here
    /*
    
    
    */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return String.format("$%.2f", balance);
    }
    
    
    
}
