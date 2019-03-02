
package extendsdemo;

import java.util.Scanner;


public class ExtendsDemo {


    public static void main(String[] args) {
        double length, width, height;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Enter the following dimentions: ");
        System.out.print("Length: ");
        length = keyboard.nextDouble();
        System.out.print("Width: ");
        width = keyboard.nextDouble();
        System.out.print("Height: ");
        height = keyboard.nextDouble();
        
        
        Cube myCube = new Cube(length, width, height);
        System.out.println();
        
        
        
        System.out.println("Here are the properties of the cube.");
        System.out.println("Length :"+ myCube.getLength());
        System.out.println("Width : "+myCube.getWidth());
        System.out.println("Height: "+myCube.getHeight());
        System.out.println("Base Area: "+myCube.getArea());
        System.out.println("Sureface Area :"+myCube.getSurfaceArea());
        System.out.println("Volume : " + myCube.getVolume());
    }
    
    
    
}
