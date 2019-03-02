
package car;


public class CarClass {
    private String yearModel;
    private String make;
    private double speed;

    public CarClass(String name, String make, double speed) {
        this.yearModel = name;
        this.make = make;
        this.speed = speed;
    }

    public String getName() {
        return yearModel;
    }

    public void setName(String name) {
        this.yearModel = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public void accelerate(){
        this.speed+=5;
    }
    public void brake(){
        this.speed-=5;
    }

    @Override
    public String toString() {
        return "CarClass{" + "yearModel=" + yearModel + ", make=" + make + ", speed=" + speed + '}';
    }
    
    
}
