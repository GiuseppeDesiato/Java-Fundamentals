package labs_examples.oop.inheritance;

public class Sedan extends Vehicle {

    private double trunkCapacity;

    public Sedan(String make, String model, double miles, double trunkCapacity) {
        super(make, model, miles); //the call super must be the first statement in the constructor body
        this.trunkCapacity =  trunkCapacity;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
