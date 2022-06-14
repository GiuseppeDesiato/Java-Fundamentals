package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class HikingAppController {

    public static void main(String[] args) {

        System.out.println("Hiker name: ");
        HikingCore();


    }

    public static void HikingCore(){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Hiker hiker = new Hiker(input);
        Trail trail = new Trail();
        TrailDatabase trailDatabase = new TrailDatabase();
        trailDatabase.addList();
        trailDatabase.addEasyTrails();
        trailDatabase.addModTrails();
        trailDatabase.addHardTrails();

        System.out.println("Hello " + input + "! Welcome to SUMMIT.");
        System.out.println(" ");

        trail.doExplore();

        //hiker.profile(); //level, age, height, weight

        System.out.println(" ");
        System.out.println("Thank you!");
        System.out.println("Now, let's narrow down your preferences for today's hike");
        System.out.println(" ");

        trail.trailDifficulty();

        if(trail.isEasy()){
            trailDatabase.printEasyTrails();
        } else if(trail.isModerate()){
            trailDatabase.printModTrails();
        } else{
            trailDatabase.printHardTrails();
        }
    }
}
