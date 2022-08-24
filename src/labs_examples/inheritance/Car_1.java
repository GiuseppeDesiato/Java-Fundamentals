package labs_examples.inheritance;

public class Car_1 extends Vehicle{

    private String motor;

    public Car_1(double currentSpeed, double maxSpeed, String manufacturingDate, String motor) {
        super(currentSpeed, maxSpeed, manufacturingDate);
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
