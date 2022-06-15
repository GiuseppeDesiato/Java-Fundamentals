package labs_examples.exception_handling.labs;

import java.sql.SQLOutput;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int nums[] = {10, 5, 3, 6, 0, 1};

        for (int i = 0; i < nums.length; i++){
            try{
                System.out.println(nums[i] / nums[i + 1]);
            } catch (ArithmeticException e){
               System.out.println("This operation generates an Arithmetic exception.");
            } catch (ArrayIndexOutOfBoundsException e1){
               System.out.println("This operation generates an out of bound exception.");
            }
        }
    }
}
