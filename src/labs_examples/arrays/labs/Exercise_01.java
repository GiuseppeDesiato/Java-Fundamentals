package labs_examples.arrays.labs;

import jdk.internal.org.objectweb.asm.tree.analysis.BasicValue;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Enter a number (" + (i + 1) + "/ 10): ");
            intArray[i] = sc.nextInt();
        }

        // calculate the sum
        int sum = 0;
        for (int val : intArray){
            sum += val;
        }
        System.out.println("The sum of the inserted value is: ");
        System.out.println(sum);

        // calculate the average
        double average = (double) sum / 10;
        System.out.println("The avarage of the inserted value is: ");
        System.out.println(average);

    }
}