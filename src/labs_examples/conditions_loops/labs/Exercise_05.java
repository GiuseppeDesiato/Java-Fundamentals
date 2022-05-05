package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, you will be asked to input two numbers (upper and lower bound)");
        System.out.println("Please enter the upper bound number: ");
        int upperNum = scanner.nextInt();
        System.out.println("Please enter the upper lower number: ");
        int lowerNum = scanner.nextInt();

        /*int sum = 0;
        while(lowerNum <= upperNum){
            sum += lowerNum;
            lowerNum++;*/

        int sum = 0;
        for (int i = lowerNum; i <= upperNum; i++){
            sum += i;
        }
        System.out.println("the sum of all numbers bewteen lower and upper bound is: " + sum);

        double average = (double) sum / upperNum;
        System.out.println("the average is: " + average);

    }
}
