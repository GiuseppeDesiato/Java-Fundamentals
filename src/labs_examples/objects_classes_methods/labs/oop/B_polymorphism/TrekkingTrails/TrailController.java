package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.TrekkingTrails;

public class TrailController {

    public static void printTrailInfo(Trail trekking){
        System.out.println("-------START-------");
        trekking.accessible();
        trekking.length();
        trekking.altitude();
        trekking.numHours(4);
        System.out.println("--------END--------");
    }
    public static void main(String[] args) {


        LoopTrail loop = new LoopTrail(9.8, 3, 583);
        WestSideTrail west = new WestSideTrail(4.3, 1.27, 286);
        HarringtonTrail harr = new HarringtonTrail(4.8, 1.38, 251);

        printTrailInfo(loop);
        printTrailInfo(west);
        printTrailInfo(harr);

    }
}
