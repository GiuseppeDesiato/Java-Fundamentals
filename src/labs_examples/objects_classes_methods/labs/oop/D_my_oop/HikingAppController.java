package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class HikingAppController {

    public static void main(String[] args) {

        System.out.println("WELCOME TO SUMMIT");
        System.out.println("");
        System.out.println("-----------");
        System.out.println("Press ENTER");
        System.out.println("-----------");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Hiker hiker = new Hiker();
        Trail trail = new Trail();
        TrailDatabase trailDatabase = new TrailDatabase();

        hiker.profile();

        trailDatabase.addEasyTrails();
        trailDatabase.addModTrails();
        trailDatabase.addHardTrails();

        String menu1 = "";
        boolean displayMenu = true;
        //MAIN MENU
        do {
            System.out.println("//////////");
            System.out.println("MAIN MENU:");
            System.out.println("//////////");

            System.out.println("1. explore trails");
            System.out.println("2. add a trail");
            System.out.println("3. update trail info");
            System.out.println("4. update hiker profile");
            System.out.println("5. quit");

            System.out.println("Please selece a number. (1-5)");
            menu1 = scanner.next();

            switch(menu1) {
                case "1":
                    System.out.println("1. explore trails");
                    System.out.println(" ");
                    System.out.println("Thank you!");
                    System.out.println(" ");
                    System.out.println("Now, let's narrow down your preferences for today's hike.");
                    System.out.println(" ");

                    while (true) {
                        System.out.println("------------");
                        System.out.println("TRAILS MENU:");
                        System.out.println("------------");
                        System.out.println("Difficulty: 1 (easy) / 2 (moderate) / 3 (hard)");
                        trail.difficulty = scanner.next().toLowerCase();

                        if (!(trail.difficulty.equals("1") || trail.difficulty.equals("2") || trail.difficulty.equals("3"))) {
                            System.out.println("Wrong answer. Please type easy, moderate or hard.");
                        } else if (trail.isEasy()) {
                            int counter = 1;
                            for (Trail t : trailDatabase.easyTrails) {
                                System.out.println(counter + ":" + t.getName());
                                counter++;
                            }
                            System.out.println("");
                            System.out.println("Please select a trail number: ");
                            String trailNum = scanner.next();
                            System.out.println(" ");

                        } else if (trail.isModerate()) {
                            int counter = 1;
                            for (Trail t : trailDatabase.modTrails) {
                                System.out.println(counter + ":" + t.getName());
                                counter++;
                            }
                            System.out.println("");
                            System.out.println("Please select a trail number: ");
                            String trailNum = scanner.next();
                            System.out.println(" ");

                        } else {
                            int counter = 1;
                            for (Trail t : trailDatabase.hardTrails) {
                                System.out.println(counter + ":" + t.getName());
                                counter++;
                            }
                            System.out.println("");
                            System.out.println("Please select a trail number: ");
                            String trailNum = scanner.next();
                            System.out.println(" ");
                        }
                        break;
                    }
                    break;

                case "2":
                    System.out.println("2. add a trail");
                    break;
                case "3":
                    System.out.println("3. update trail info");
                    break;
                case "4":
                    System.out.println("4. update hiker profile");
                    break;
                case "5":
                    System.out.println("5. quit");
                    displayMenu = false;
                    break;
                default:
                    System.out.println("Wrong input. Please select a number from 1 to 5");

            }
        } while(displayMenu);


        System.out.println(" ");
        System.out.println("Thank you!");
        System.out.println("Now, let's narrow down your preferences for today's hike");
        System.out.println(" ");

        while (true) {
            System.out.println("Difficulty: (easy / moderate / hard)");
            trail.difficulty = scanner.next().toLowerCase();
            if (!(trail.difficulty.equals("easy") || trail.difficulty.equals("moderate") || trail.difficulty.equals("hard"))) {
                System.out.println("Wrong answer. Please type easy, moderate or hard.");
            } else {
                break;
            }
        }

        if (trail.isEasy()) {
            trailDatabase.printEasyTrails();
        } else if (trail.isModerate()) {
            trailDatabase.printModTrails();
        } else {
            trailDatabase.printHardTrails();
        }

    }

}
