package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Trail {

    String name = null;
    double miles = 0;
    double time = 0;
    double elevation = 0;
    String difficulty = null;
    boolean isLoop = false;
    boolean kidFriendly = false;

    Scanner scanner = new Scanner(System.in);

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

    public void trailDifficulty(){
        while(true) {
            System.out.println("Difficulty: (easy / moderate / hard)");
            difficulty = scanner.next().toLowerCase();

            if (!(difficulty.equals("easy") || difficulty.equals("moderate") || difficulty.equals("hard"))) {
                System.out.println("Wrong answer. Please type easy, moderate or hard.");
            } else {
                break;
            }
        }
    }

    TrailDatabase trailDatabase = new TrailDatabase();

    public void printTrailDifficulty(){

        switch (difficulty) {
            case "easy": {
                System.out.println(" ");
                System.out.println("Ok, these easy trails might work for you: ");
                System.out.println(" ");
                trailDatabase.printEasyTrails();
                break;
            }
            case "moderate": {
                System.out.println(" ");
                System.out.println("Ok, these moderate trails might work for you: ");
                System.out.println(trailDatabase.printModTrails());
                break;
            }
            case "hard": {
                System.out.println(" ");
                System.out.println("Ok, these hard trails might work for you: ");
                System.out.println(trailDatabase.printHardTrails());
                break;
            }
        }
    }



    public boolean trailType1 (Trail trail){
        if(miles <= 2 || time <= 2 || elevation <= 150 || difficulty.equals("easy")){
            return true;
        }
        return false;
    }

    public void trailSpec(){

        System.out.println("Difficulty: (easy / moderate / hard)");
        difficulty = scanner.next().toLowerCase();

        System.out.println("Max Mileage: ");
        miles = scanner.nextDouble();

        System.out.println("Max Time: (hh.mm)");
        time = scanner.nextDouble();

        System.out.println("Max Elevation Gain: ");
        elevation = scanner.nextDouble();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
