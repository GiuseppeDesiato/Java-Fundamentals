package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class HikingAppController {

    public static void main(String[] args) {

        System.out.println("Hiker name: ");
        HikingCore();

        ArrayList<Trail> list = new ArrayList<>();

        list.add(TrailDatabase.coldSpringPark);
        list.add(TrailDatabase.charlesRiver);
        list.add(TrailDatabase.beaverBrookNorth);
        list.add(TrailDatabase.pineHill);
        list.add(TrailDatabase.prospectHill);
        list.add(TrailDatabase.borderlandState);
        list.add(TrailDatabase.storerConservation);
        list.add(TrailDatabase.rockCircuit);
        list.add(TrailDatabase.buckHill);
        list.add(TrailDatabase.skylineTrail);
        list.add(TrailDatabase.landMine);
        list.add(TrailDatabase.monadnock);
        list.add(TrailDatabase.midstate);
    }

    public static void HikingCore(){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Hiker hiker = new Hiker(input);
        Trail trail = new Trail();

        System.out.println("Hello " + input + "! Welcome to SUMMIT.");
        System.out.println(" ");

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

        hiker.profile(); //level, age, height, weight
        System.out.println(" ");

        System.out.println("Thank you!");
        System.out.println("Now, let's narrow down your preferences for today's hike");
        System.out.println(" ");

        trail.trailSpec();//time, elevation, difficulty, dog

        if(trail.miles <= 10){

        }

    }

}
