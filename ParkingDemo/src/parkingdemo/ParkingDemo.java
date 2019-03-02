
package parkingdemo;


public class ParkingDemo {

    public static void main(String[] args) {
        
        ParkedCar parkedCar = new ParkedCar("Sentra", "Nissan", "RED", "3453cd", 45);
        ParkingMeter parkingMeter = new ParkingMeter(60);
        parkingMeter.getPaid();
    }
    
}
