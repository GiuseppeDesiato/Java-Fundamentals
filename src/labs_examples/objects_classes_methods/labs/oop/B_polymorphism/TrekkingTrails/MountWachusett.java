package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class MountWachusett implements Trails{


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
}
