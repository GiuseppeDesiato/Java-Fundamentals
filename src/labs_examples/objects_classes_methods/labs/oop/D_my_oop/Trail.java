package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Trail {

    String name = " ";
    double miles = 0;
    double time = 0;
    double elevation = 0;
    String difficulty = " ";
    boolean isLoop = false;
    boolean kidFriendly = false;

    Scanner scanner = new Scanner(System.in);
    TrailDatabase trailDatabase = new TrailDatabase();

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

    public void doExplore(){

        while(true){
            System.out.println("Do yo want to explore a new trail? (y/n)");
            String answer1 = scanner.next().toLowerCase();

            if (!(answer1.equals("y") || answer1.equals("n"))) {
                System.out.println("Wrong answer. Please type 'y' or 'n'.");
            } else if (answer1.equals("y")) {
                System.out.println("Great! Tell us more about you!");
                System.out.println(" ");
                break;
            } else {
                System.out.println("Ok, please explore our home page and see if you find something interesting.");
                return;
            }
        }
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

    public boolean isEasy() {
        return difficulty.equals("easy");
    }
    public boolean isModerate() {
        return difficulty.equals("moderate");
    }
    public boolean isHard() {
        return difficulty.equals("hard");

    }

    public boolean trailType1 (Trail trail){
        if(miles <= 2 || time <= 2 || elevation <= 150 || difficulty.equals("easy")){
            return true;
        }
        return false;
    }
/*
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

 */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
