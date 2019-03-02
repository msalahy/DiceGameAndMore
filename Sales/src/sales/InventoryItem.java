/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

public class InventoryItem {
    
    private String description;
    private int units;

    public InventoryItem() {
        description = " ";
        units = 0;
    }

    public InventoryItem(int u) {
        this.description = description;
        this.units = u;
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