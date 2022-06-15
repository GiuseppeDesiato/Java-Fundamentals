package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to divide two numbers? (y/n)");
        String answer = scanner.next();

        while (answer.equals("y")) {

            System.out.println("Numerator: ");
            int a = scanner.nextInt();
            System.out.println("Denominator: ");
            int b = scanner.nextInt();

            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Error. Cannot divide by 0");
            } finally {
                System.out.println("This message runs anyway");
            }

            System.out.println("Do you want to continue? (y/n)");
            answer = scanner.next();
            if(answer.equals("n")){
                System.out.println("Ok. Ciao");
                break;
            }
        }
    }
}