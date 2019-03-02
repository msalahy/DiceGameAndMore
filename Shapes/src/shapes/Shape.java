package shapes;
public abstract class Shape
{
   protected String shapeName;

   // abstract getArea method must be implemented by concrete subclasses
   public abstract double getArea();
   
   public String getName()
   {
      return shapeName;
   }
} // end class Shape
