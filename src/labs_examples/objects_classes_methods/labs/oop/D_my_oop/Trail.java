package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import labs_examples.arrays.ArrayList;

import java.util.Scanner;

public class Trail {

    String name;
    double miles;
    double time;
    double elevation;
    String difficulty;
    boolean isLoop;
    boolean kidFriendly;

    public Trail(String name, double miles, double time, double elevation, String difficulty, boolean isLoop, boolean kidFriendly) {
        this.name = name;
        this.miles = miles;
        this.time = time;
        this.elevation = elevation;
        this.difficulty = difficulty;
        this.isLoop = isLoop;
        this.kidFriendly = kidFriendly;
    }

    public Trail() {
    }

    Scanner scanner = new Scanner(System.in);



    public void trailSpec(){

        System.out.println("Max Mileage: ");
        double miles = scanner.nextDouble();

        System.out.println("Max Time: (hh.mm)");
        double time = scanner.nextDouble();

        System.out.println("Max Elevation Gain: ");
        double elevation = scanner.nextDouble();

        System.out.println("Difficulty: (easy / moderate / hard)");
        String difficulty = scanner.next().toLowerCase();

        System.out.println("kid-friendly: (y/n)");
        String dog= scanner.next().toLowerCase();

        return;
    }
}
