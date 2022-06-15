package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try {
            divide(9, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int divide(int a, int b) throws Exception{

        return a/b;

    }

}