
package rectangle;


public class Rectangle {

    public Rectangle(double par, double par1) {
    }


    public static void main(String[] args) {
        
        
        RectangleClass box1, box2;
        box1 = new RectangleClass();
        box2 = new RectangleClass(5.0, 10.1);
        
        box1.setLength(10);
        box1.setWidth(12);
                
        box2.setLength(14);
        box2.setWidth(100);
        
        
        System.out.println("The dimentions for box1 is "+box1.getLength() +" and "+box1.getWidth()+" and the area is "+box1.area());
        System.out.println("The dimentions for box2 is "+box2.getLength() +" and "+box2.getWidth()+" and the area is "+box2.area());
    }
    
}
