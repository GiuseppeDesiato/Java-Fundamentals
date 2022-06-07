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

        System.out.println("Hello " + input + "! Welcome to SUMMIT.");
        System.out.println(" ");


        while(true){
            System.out.println("Do yo want to explore a new trail? (y/n)");
            String answer1 = scanner.next().toLowerCase();

            if (!(answer1.equals("y") || answer1.equals("n"))) {
                System.out.println("Wrong answer. Please type 'y' or 'n'.");
            } else if (answer1.equals("y")) {
                System.out.println("Great! Let's discover your preferences!");
                break;
            } else {
                System.out.println("Ok, please explore our home page and see if you find something interesting.");
                return;
            }

        }
        System.out.println("How would you define your level of expertise?");

    }

}
