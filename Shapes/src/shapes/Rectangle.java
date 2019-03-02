package shapes;

import javafx.scene.shape.Shape;

public class Rectangle extends Shape {
   private double length, width;

   // constructor 
   public Rectangle( double s1, double s2 )
   {
      length = ( s1 < 0 ? 0 : s1 );
      width = ( s2 < 0 ? 0 : s2 );
      String shapeName = "Rectangle";
   }

   // return the area of a Rectangle
   public double getArea()
   {
      return length * width;
   }
} // end class Rectangle
