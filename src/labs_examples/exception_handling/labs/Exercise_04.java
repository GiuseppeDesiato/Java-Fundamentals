package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        try
        {
            System.out.println("Inside main try block");
            // Inner try-catch block1
            try
            {
                System.out.println("Dividing");
                int num = 1989/0;
            }
            catch(ArithmeticException ex) {
                System.out.println(ex);
            }
            // Inner try-catch block2
            try
            {
                int num2 = 100/0;
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
            System.out.println("remaining statements inside main try block");
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        System.out.println("remaining code, normal flow");
    }
}
