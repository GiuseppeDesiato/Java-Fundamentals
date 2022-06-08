package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class Trail {

    double time;
    double elevation;
    String difficulty;
    boolean isLoop;
    boolean dogFriendly;

    public Trail(double time, double elevation, String difficulty, boolean isLoop, boolean dogFriendly) {
        this.time = time;
        this.elevation = elevation;
        this.difficulty = difficulty;
        this.isLoop = isLoop;
        this.dogFriendly = dogFriendly;
    }

    public Trail() {
    }

    Scanner scanner = new Scanner(System.in);

    public void trailSpec(){

        System.out.println("Max Time: (hh.mm)");
        double time = scanner.nextDouble();

        System.out.println("Max Elevation Gain: ");
        double elevation = scanner.nextDouble();

        System.out.println("Difficulty: (easy / moderate / hard)");
        String difficulty = scanner.next().toLowerCase();

        System.out.println("Dog-friendly: (y/n)");
        String dog= scanner.next().toLowerCase();

        return;
    }
}
