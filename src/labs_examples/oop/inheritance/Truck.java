package labs_examples.oop.inheritance;


//POJO
public class Truck extends Vehicle {

    private double bedCapacity;

    //default constructor
    public Truck(String make, String model, double miles, double bedCapacity) {
        super(make, model, miles);
        this.bedCapacity = bedCapacity;
    }

    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}
