package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Trail {

    String name;
    double miles;
    double time;
    double elevation;
    String difficulty;
    boolean isLoop;
    boolean kidFriendly;


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

    public void printEasy (ArrayList<Trail> list){
        for(Trail t : list) {
            System.out.println(t.getName());
        }
    }

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

    public boolean isEasy(){
        if (difficulty.equals("easy")){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
