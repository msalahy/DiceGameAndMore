
package main;


public class Tempreture {
    private double ftemp;
    private double ctemp;

    public Tempreture() {
        this.ftemp = ftemp;
        this.ctemp = ctemp;
    }
    public void setCtemp(double Ctemp) {
        this.ctemp = Ctemp;
    }

        
    public double getFtemp() {
        this.ftemp= ctemp * (9/5)+32;
        return ftemp;
    }
    
    public void setFtemp(double Ftemp) {
        this.ftemp = Ftemp;
    }
    
    public double getCtemp() {
        return ctemp=(5/9)*(ftemp-32);
    }





    
    
    
}
