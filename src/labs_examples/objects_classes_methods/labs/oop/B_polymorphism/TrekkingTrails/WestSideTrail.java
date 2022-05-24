package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class WestSideTrail extends MountWachusett{


    public WestSideTrail(double length, double hours, int elevation) {
        super(length, hours, elevation);
    }

    @Override
    public boolean accessible() {
        return true;
    }

    @Override
    public void length() {
        System.out.println("The West Side Trail has a length of " + getLength() + " length.");
    }

    @Override
    public void altitude() {
        System.out.println("The max elevation of the West Side Trail is " + getElevation());
    }

    @Override
    public void numHours(int hours) {
        System.out.println("The time to complete the West Side Trail is " + getHours());
    }
}
