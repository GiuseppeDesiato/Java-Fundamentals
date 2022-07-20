package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

public class Exercise_03a {

    public static void main(String[] args) {

        //1) static method reference' syntax is className::staticMethodName

        /*
        BiFunction<Integer, Integer, Integer> bifunct = (a, b) -> {
          //return Exercise_03.sum(a, b);
        };
        int x = bifunct.apply(67, 89);
        System.out.println(x);
       */

        BiFunction<Integer, Integer, Integer> bifunct = Exercise_03a::sum;

        int x = bifunct.apply(67, 89);
        System.out.println(x);


    }

    public static int sum (int a, int b){
        return a +  b;
    }
}
