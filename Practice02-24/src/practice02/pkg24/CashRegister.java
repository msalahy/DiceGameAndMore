
package practice02.pkg24;


public class CashRegister {
    RetailItem retailItem;
    private double price;
    private int itemQuantity;
    double subTotalPrice;

    public CashRegister(RetailItem retailItem1, double price1, int itemQuantity1) {
        this.retailItem = retailItem1;
        this.price = price1;
        this.itemQuantity=itemQuantity1;
        
    }
    
    public double getSubtotal(){
            this.subTotalPrice = this.price*this.itemQuantity;
            return subTotalPrice;
    }
    public double getTax(){
        getSubtotal();
        double tax = subTotalPrice*6/100;
        return tax;
    }
    
    public double getTotal(){
        double totalMoney = getTax()+subTotalPrice;
        return totalMoney;
    }

    @Override
    public String toString() {
        return " CashRegister { " + " retailItem = " + retailItem + ", price = " + price + ", itemQuantity=" + itemQuantity + 
                ", tax = " + getTax() + ", subTotalPrice = " + getSubtotal() + '}' + "And the totaol price is "+getTotal();
    }
    
    
}
