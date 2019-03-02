
package inventorydemo;

public class InventoryItem {
    
    private String description;
    private int units;

    public InventoryItem() {
        description = " ";
        units = 0;
    }

    public InventoryItem(String d) {
        this.description = d;
        this.units = units;
    }

    public InventoryItem(String d, int u) {
        description = d;
        units = u;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
