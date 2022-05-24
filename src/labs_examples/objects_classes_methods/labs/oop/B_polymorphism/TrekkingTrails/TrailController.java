package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class TrailController {

    public static void main(String[] args) {

        LoopTrail loop = new LoopTrail(9.8, 3, 583);
        WestSideTrail west = new WestSideTrail(4.3, 1.27, 286);
        HarringtonTrail harr = new HarringtonTrail(4.8, 1.38, 251);

        TrailDependency trail = new TrailDependency(loop);
        trail.trailMethods();

        trail.setTrekkingTrails(west);
        trail.trailMethods();

        trail.setTrekkingTrails(harr);
        trail.trailMethods();





    }
}
