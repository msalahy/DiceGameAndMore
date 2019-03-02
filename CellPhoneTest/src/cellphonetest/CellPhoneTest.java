
package cellphonetest;

import java.util.Scanner;


public class CellPhoneTest {

    public static void main(String[] args) {
        String manufacturer;
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.println("Please enter the Iphone Model? ");
        manufacturer = scanner.nextLine();
        
        CellPhone cellPhone = new CellPhone(manufacturer, "iPhone", 870.90);
        
    }
    
}
