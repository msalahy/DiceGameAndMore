
package parkingdemo;


public class ParkingMeter {
    
    private int minutesParked;
    
    public ParkingMeter(int minutesParked) {
        
        this.minutesParked = minutesParked;
    }
    
    ParkedCar parkedCar = new ParkedCar();

    
    public void getPaid(){
        if(this.minutesParked>parkedCar.getMinutesPaid()){
            System.out.println("You have to pay 25 dollors.");
        }
        else{
            System.out.println("You are good. ");
        }
        
    }
    
    
}


