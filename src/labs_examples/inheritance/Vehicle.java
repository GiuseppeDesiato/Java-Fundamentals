package labs_examples.inheritance;

public class Vehicle {
    private double currentSpeed;
    private double maxSpeed;
    private String manufacturingDate;

    public Vehicle(double currentSpeed, double maxSpeed, String manufacturingDate) {
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.manufacturingDate = manufacturingDate;
    }

    public double leftRange (double currentSpeed, double maxSpeed){
        return maxSpeed - currentSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
}
