
package practice02.pkg24;



public class RetailItem {
    
    public String itemForSale;

    public RetailItem(String item) {
        
        this.itemForSale=item;
        
    }

    public String getItemForSale() {
        return itemForSale;
    }

    public void setItemForSale(String newItem) {
        this.itemForSale = newItem;
    }

    @Override
    public String toString() {
        return "RetailItem{" + "itemForSale=" + itemForSale + '}';
    }
    
    
    
}
