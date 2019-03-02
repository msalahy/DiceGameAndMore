
package metricdemo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MetricDemo {

    public static void main(String[] args) {
     
        double miles, kilos;
        
        Scanner keyboard = new Scanner(System.in);
    // Metric met = new Metric();
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        System.out.println("enter a distance in miles: ");
        miles=keyboard.nextDouble();
        
        kilos = Metric.mileToKilometers(miles);
        System.out.println(fmt.format(miles)+" miels equals "+ fmt.format(kilos)+" kilometers");
        
        System.out.println("enter a distance in kilometers: ");
        kilos=keyboard.nextDouble();
        
        miles = Metric.kilometersToMile(kilos);
        System.out.println(fmt.format(kilos)+" kilomers tequals "+ fmt.format(miles)+" miles ");
        
        
        
    }
    
}
