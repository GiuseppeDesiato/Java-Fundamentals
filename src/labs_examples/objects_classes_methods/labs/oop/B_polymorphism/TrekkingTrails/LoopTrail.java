package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;


public class LoopTrail extends MountWachusett{


    public LoopTrail(double length, double hours, int elevation) {
        super(length, hours, elevation);
    }

    @Override
    public boolean accessible() {
        return true;
    }

    @Override
    public void length() {
        System.out.println("The loop trail has a length of " + getLength() + " Km.");;
    }

    @Override
    public void altitude() {
        System.out.println("The max elevation of the Loop Trail is " + getElevation());;
    }

    @Override
    public void numHours(int hours) {
        System.out.println("The time to complete the Loop Trails is " + getHours());;
    }
}
