
package extendsdemo;

public class Cube extends RectangleClass {
    
    private double height;

    public Cube(double leng, double wid, double h) {

        super(leng, wid);
        height = h;
    }

    public double getHeight() {
        return height;
    }
    public double getSurfaceArea(){
        return getArea()*6;
    }
    
    public double getVolume(){
        return getArea() * height;
    }
    
}
