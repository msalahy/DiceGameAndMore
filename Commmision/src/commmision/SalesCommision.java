
package commmision;


public class SalesCommision {
    
    private double sales, rate , commission, advance , pay;

    public SalesCommision(double s, double a) {
        this.sales = s;
        this.advance = a;
        calculatePay();
        
    }
    
    private void setRate(){
        if(sales<10000)
            rate = 0.05;
        if(sales<15000)
            rate = 0.1;
        if(sales<18000)
            rate = 0.12;
        if(sales<22000)
            rate = 0.14; 
        else
            rate = 0.16;
    }
    private void calculatePay(){
        setRate();
        commission = sales*rate;
        pay = commission-advance;
               
    }

    public double getSales() {
        return sales;
    }

    public double getRate() {
        return rate;
    }

    public double getCommission() {
        return commission;
    }

    public double getAdvance() {
        return advance;
    }

    public double getPay() {
        return pay;
    }
    
    
    
}
