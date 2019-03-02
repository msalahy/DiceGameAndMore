
package car;


public class Car {


    public static void main(String[] args) {
        CarClass carClass = new CarClass("Toyata", "2009",0 );
        System.out.println(carClass);
        
        carClass.setSpeed(10);
        System.out.println(carClass);
        
        carClass.accelerate();
        System.out.println(carClass);
        
        
        
        boolean flag=true;
        while(flag){
            for(int i =0; i<5; i++){
            carClass.accelerate(); 
            }
            flag = false;
        }
        System.out.println(carClass);
        
        boolean yes=true;
        while(yes){
            for(int i =0; i<5; i++){
            carClass.brake(); 
            }
            yes = false;
        }
        System.out.println(carClass);
           
    }

    }
    
