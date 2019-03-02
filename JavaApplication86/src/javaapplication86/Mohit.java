
package javaapplication86;


public class Mohit {
   private String name;
   private Area circle;

    public Mohit(String name, Area circle1) {
        this.name = name;
        this.circle = circle;
    }

    
    
    public String info (String name, Area circle1){
        return name+circle1;
    }

    public String getName() {
        return name;
    }

    public Area getCircle() {
        return circle;
    }

    @Override
    public String toString() {
        return " Mohit {"  + "name = " + name + ", circle = " + circle + '}';
    }
   
   
}
