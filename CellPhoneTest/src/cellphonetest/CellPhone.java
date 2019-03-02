/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphonetest;

public class CellPhone {
    
    private String manufact;
    private String model;
    private double retailPrice;

    public CellPhone(String man, String mod, double price) {
        this.manufact = man;
        this.model = mod;
        this.retailPrice = price;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    
    
    
    
}
