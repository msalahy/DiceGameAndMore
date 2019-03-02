
package javaapplication86;

public class Area {
    
   public double width;
   public double length;
    
    public Area(double width, double length) {
        this.width = width;
        this.length = length;
    }
   
    public void getArea(){
        double area = this.length*this.length;
    }

    @Override
    public String toString() {
        return "Area{ " + "width = " + width + ", length = " + length + '}';
    }
    
}
