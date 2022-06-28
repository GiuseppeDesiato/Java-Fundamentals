package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class Hiker {

    private String name;
    private String level;
    private boolean isExpert;
    private boolean isBeginner;
    private boolean isIntermediate;

    Trail trail;

    Scanner scanner = new Scanner(System.in);
    String input = "";

    public Hiker() {
    }

    public Hiker(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public void profile() {

        boolean isDone = true;
        while (isDone) {

            System.out.println("1. Create a new user profile.");
            System.out.println("2. Returning user");
            input = scanner.next();

            String name;

            switch (input) {
                case "1":
                    System.out.println("New User");

                    System.out.println("Name: ");
                    name = scanner.next();

                    System.out.println("Hi" + name + "!" + " how would you define your level of expertise?");
                    System.out.println("1. (beginner) / 2. (intermediate) / 3 (expert)");
                    String level = scanner.next();

                    System.out.println("Great, thank you " +  name + "!");
                    System.out.println(" ");

                    isDone = false;
                    break;

                case "2":
                    System.out.println("Returning User");

                    System.out.println("Name: ");
                    name = scanner.next();

                    System.out.println("Hi " +  name + "!" + " Welcome back!");
                    System.out.println(" ");

                    isDone = false;
                    break;

                default:
                    System.out.println("Please choose between option 1 or 2.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

