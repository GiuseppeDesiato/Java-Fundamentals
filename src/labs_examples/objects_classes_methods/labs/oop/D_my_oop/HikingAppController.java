package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class HikingAppController {

    public static void main(String[] args) {

        System.out.println("Hiker name: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Hello " + input + "! Welcome to SUMMIT.");

        Trail trail = new Trail();
        TrailDatabase trailDatabase = new TrailDatabase();
        
        /*
        a sequence of menu items
        all inside a while true.

        first menu:
        explore trails
        add trails (not presented)
        maybe delete trails
        update hiker profile
        quit

        in a while loop
        ask for input (numbers)

        other menu according to the choice
         */

        while(true){

            System.out.println("1. explore trails");
            System.out.println("2. add trails");
            System.out.println("3. maybe delete trails");
            System.out.println("4. update hiker profile");
            System.out.println("5. quit");

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

        //hiker.profile(); //level, age, height, weight

        System.out.println(" ");
        System.out.println("Thank you!");
        System.out.println("Now, let's narrow down your preferences for today's hike");
        System.out.println(" ");

        while(true) {
            System.out.println("Difficulty: (easy / moderate / hard)");
            trail.difficulty = scanner.next().toLowerCase();
            if (!(trail.difficulty.equals("easy") || trail.difficulty.equals("moderate") || trail.difficulty.equals("hard"))) {
                System.out.println("Wrong answer. Please type easy, moderate or hard.");
            } else {
                break;
            }
        }

        if(trail.isEasy()){
            trailDatabase.printEasyTrails();
        } else if(trail.isModerate()){
            trailDatabase.printModTrails();
        } else{
            trailDatabase.printHardTrails();
        }

    }

}
