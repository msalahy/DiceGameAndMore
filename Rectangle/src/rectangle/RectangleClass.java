
package rectangle;


public class RectangleClass {

    private double length;
    private double width;
    
    public RectangleClass() {
        this.length=0.0;
        this.length=1.0;
    }

    public RectangleClass(double length, double width) {
        length = length;
        width = width;
        
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    
    public double area(double length, double width){
        return length*width;
    }
    
    public double area(){
        return length*width;
    }
    
    
}
