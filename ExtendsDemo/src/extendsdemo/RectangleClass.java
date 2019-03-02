
package extendsdemo;


public class RectangleClass {

    private double length;
    private double width;
    

    public RectangleClass(double leng, double wid) {
        length = leng;
        width = wid;
        
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
    
    
    public double getArea(){
        return length*width;
    }
    
    
}
