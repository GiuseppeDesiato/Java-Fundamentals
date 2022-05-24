package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class MountWachusett implements Trail {

    private double length;
    private double hours;
    private int elevation;


    public MountWachusett(double length, double hours, int elevation) {
        this.length = length;
        this.hours = hours;
        this.elevation = elevation;
    }

    //METHODS
    @Override
    public boolean accessible() {
        return true;
    }

    @Override
    public void length() {
        System.out.println("variable length");
    }
    //length method overload
    public void length(double meters) {
        System.out.println("The longest trail is " + meters + " meters long.");
    }

    @Override
    public void altitude() {
        System.out.println(" Mount Wachusett altitude is 611.4 meters" );
    }
    //altitude method overload
    public void altitude(double meters) {
        System.out.println("The chosen trail max altitude is " + meters );
    }

    @Override
    public void numHours(int hours) {
        System.out.println("To complete the trail you will take " + hours + " hours");
    }


    //GETTERS & SETTERS
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }
}
