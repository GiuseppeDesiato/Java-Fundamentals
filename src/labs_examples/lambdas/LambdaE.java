package labs_examples.lambdas;

import java.util.function.BiPredicate;

public class LambdaE {

    public static void main(String[] args) {

        LambdaExample l = (double a, double b) -> {
            if(a > b){
                return a * b;
            } else {
                return a + b;
            }
        };

        double result = l.calculate(78.3, 67.88);
        System.out.println(result);

        // using the BiPredicate functional interface
        // BiPredicate is Built-In Functional Interface... there are a lot of built-in functional interfaces
        BiPredicate<Integer, String> longerThan = (i, s) -> {
            if(s.length() > i){
                return true;
            } else {
                return false;
            }
        };

        //.test is the abstract method in the BiPredicate Functional Interface
        System.out.println(longerThan.test(5, "Hello"));



    }
}
