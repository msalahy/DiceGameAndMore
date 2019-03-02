
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        getStarted();
        
    }
    
    public static void getStarted(){
        Tempreture tem = new Tempreture();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To change from Farenhit to Celcious type FC.\n"
                + " To change from Celcious to Farenhit type CF.\n");
        String letterChoice; 
        letterChoice = scanner.nextLine();
        boolean flag = true;
        while(flag){
            switch (letterChoice.substring(0,2)){
                case "FC":
                    System.out.println("What is the Farenhite ? ");
                    double fe=scanner.nextDouble();
                    tem.setCtemp(fe);
                    System.out.println("Celcious is : "+tem.getCtemp()); 
                    flag=false;
                break;
                    
                case "CF":
                    System.out.println("What is the Celcious? ");
                    double ce=scanner.nextDouble();
                    tem.setCtemp(ce);
                    System.out.println("Farenhite is : "+tem.getFtemp()); 
                    flag=false;
                break;
                
                default:
                    System.out.println("Please enter a correct selecion: ");
                    letterChoice = scanner.nextLine();
                break;
                    
        
            }   
        }
    }
}
