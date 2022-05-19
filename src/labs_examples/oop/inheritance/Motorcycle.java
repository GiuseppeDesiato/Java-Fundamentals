package labs_examples.oop.inheritance;

public class Motorcycle extends Vehicle {

    private int cc;
    private boolean twoSeat;

    public Motorcycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }

    @Override // method overriding
    public void accelerate(double mph){
        System.out.println("motorcycle accelerating by " + mph + " mph.");
        // steps to accelerate a motorcycle
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }
}
