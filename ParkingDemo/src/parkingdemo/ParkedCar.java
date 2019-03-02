
package parkingdemo;

public class ParkedCar {
    private String carModel;
    private String Make;
    private String color;
    private String licnse;
    private int minutesPaid;

    public ParkedCar(String carModel, String Make, String color, String licnse, int minutesPaide) {
        this.carModel = carModel;
        this.Make = Make;
        this.color = color;
        this.licnse = licnse;
        this.minutesPaid = minutesPaide;
    }
    public ParkedCar(){
       this.minutesPaid = minutesPaid; 
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicnse() {
        return licnse;
    }

    public void setLicnse(String licnse) {
        this.licnse = licnse;
    }

    public int getMinutesPaid() {
        return minutesPaid;
    }

    public void setMinutesPaid(int minutesParked) {
        this.minutesPaid = minutesPaid;
    }

    @Override
    public String toString() {
        return "ParkedCar{" + "carModel=" + carModel + ", Make=" + Make + ", color=" + color + ", licnse=" + licnse + ", minutesParked=" + minutesPaid + '}';
    }
    
    
    
    
}
