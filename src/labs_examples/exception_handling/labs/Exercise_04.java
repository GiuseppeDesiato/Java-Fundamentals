package labs_examples.exception_handling.labs;

import jdk.nashorn.internal.runtime.ECMAException;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 0;
        int d = 2;

        try{
            int i = a / 0;
            System.out.println(i);
        } catch (Exception one){
            System.out.println(one);
            try {
                int j = d / c;
                System.out.println(j);
            } catch (Exception two){
                System.out.println(two);
            }
        }
    }
}
