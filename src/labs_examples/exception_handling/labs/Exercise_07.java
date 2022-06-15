package labs_examples.exception_handling.labs;

import videos_source_code.exceptions.UnderAgeException;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {

    public static void main(String[] args) {

        try {
            numPeople();
        } catch (OutOfElevatorCapacity e) {
            System.out.println(e.toString());;
        }

    }

    public static void numPeople() throws OutOfElevatorCapacity {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Before activating the elevator");
        System.out.println("it is important to check the max number of people allowed.");
        System.out.println("Are there more than 6 people? (y/n)");
        String response = scanner.next();

        if(response.equalsIgnoreCase("n")) {
            throw new OutOfElevatorCapacity();
        }
        System.out.println("Thanks! Please, select your floor");
    }

}