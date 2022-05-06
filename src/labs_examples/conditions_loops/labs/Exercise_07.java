package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a word: ");
        String str = scanner.next();
        System.out.println(str);

        int i = 0;

        while(i < str.length()){
            if(str.charAt(i) == 'a') {
                System.out.println("the first vowel is a");
                break;
            } else if (str.charAt(i) == 'e') {
                System.out.println("the first vowel is e");
                break;
            } else if (str.charAt(i) == 'i') {
                System.out.println("the first vowel is i");
                break;
            } else if (str.charAt(i) == 'o') {
                System.out.println("the first vowel is o");
                break;
            } else if (str.charAt(i) == 'u') {
                System.out.println("the first vowel is u");
                break;
            }
            i++;
            }

        }

}

