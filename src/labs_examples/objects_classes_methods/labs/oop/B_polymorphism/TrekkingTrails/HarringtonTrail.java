package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class HarringtonTrail extends MountWachusett{


    public HarringtonTrail(double length, double hours, int elevation) {
        super(length, hours, elevation);
    }

    @Override
    public boolean accessible() {
        return super.accessible();
    }

    @Override
    public void length() {
        System.out.println("The Harrington trail has a length of " + getLength() + " Km.");
    }

    @Override
    public void altitude() {
        System.out.println("The max elevation of the Harrington trail is " + getElevation());
    }

    @Override
    public void numHours(int hours) {
        System.out.println("The time to complete the Harrington trail is " + getHours());
    }
}
