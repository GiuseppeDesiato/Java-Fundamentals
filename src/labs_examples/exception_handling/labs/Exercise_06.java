package labs_examples.exception_handling.labs;

import java.sql.SQLOutput;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        try {
            int y = newArr(11);
            System.out.println(y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is an Index Out Of Bound Exception");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int newArr(int b) throws Exception {
        int[] intArray = {10, 2, 5, 0, 1, 3};
        int x = intArray[0] / intArray[0 + b];
        return x;
    }
}