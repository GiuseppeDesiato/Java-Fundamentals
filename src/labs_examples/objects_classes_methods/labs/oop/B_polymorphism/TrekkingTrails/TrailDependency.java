package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class TrailDependency {

    Trails trekking;

    public TrailDependency(Trails trekkingTrails) {
        this.trekking = trekkingTrails;
    }

    public void trailMethods(){
        System.out.println("-------START-------");
        trekking.accessible();
        trekking.length();
        trekking.altitude();
        trekking.numHours(4);
        System.out.println("--------END--------");
    }

    public void setTrekkingTrails(Trails trekkingTrails) {
        this.trekking = trekkingTrails;
    }
}
