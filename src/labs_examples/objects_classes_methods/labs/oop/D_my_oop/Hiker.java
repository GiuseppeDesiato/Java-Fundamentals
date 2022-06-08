package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class Hiker {

    String name;
    boolean isExpert;
    boolean isBeginner;
    boolean isIntermediate;

    Trail trail;

    Scanner scanner = new Scanner(System.in);

    public Hiker(String name) {
        this.name = name;
    }

    public void profile(){
        System.out.println("How would you define your level of expertise?");
        System.out.println("(beginner / intermediate / expert)");
        String level = scanner.next().toLowerCase();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("Height: ");
        double height = scanner.nextDouble();

        System.out.println("Weight: ");
        double weight = scanner.nextDouble();

        return;
    }


}
