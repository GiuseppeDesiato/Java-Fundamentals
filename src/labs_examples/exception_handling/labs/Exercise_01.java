package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        int nums[] = {4, 6, 0, 3};

        try {
            int x = nums[0] / nums[2];
        } catch (ArithmeticException e){
            System.out.println("Error. It is not possible to divide a number by 0.");
        }
    }
}