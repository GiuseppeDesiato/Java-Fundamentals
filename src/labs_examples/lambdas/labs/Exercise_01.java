package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // 2)
        NoParam noParam = () -> {
            System.out.println("Implementation of an abstract method with no parameters");
        };
        noParam.method1();

        // Anonymous inner class
        NoParam noParamAnon = new NoParam() {
            @Override
            public void method1() {
                System.out.println("Example using an anonymous inner class");
            }
        };
        noParamAnon.method1();

        // 4)
        OneParam oneParam = (double a) -> {
            return a * a;
        };
        double x = oneParam.method2(5.2);
        System.out.println("Implementation of a one-parameter interface using lambda: " + x);

        OneParam oneParam2 = new OneParam() {
            @Override
            public double method2(double a) {
                return a + a;
            }
        };
        double y = oneParam2.method2(6.5);
        System.out.println("Implementation of a one-parameter interface using an anonymous inner class: " + x);


        // 6)
        TwoParam twoParam = (int a, int b) -> {
            return a / b;
        };
        int q = twoParam.method3(6, 3);
        System.out.println("Implementation of a two-parameter interface using lambda: " + q);

        TwoParam twoParam2 = new TwoParam() {
            @Override
            public int method3(int a, int b) {
                return a * b;
            }
        };
        int w = twoParam2.method3(6, 5);
        System.out.println("Implementation of a two-parameter interface using an anonymous inner class: " + w);

        // 7) use of built-in functional interface

        BiFunction <Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
            return a - b;
        };
        int r = biFunction.apply(5, 3);
        System.out.println("BiFunction : " + r);


        DoubleFunction <Double> doubleFunction = (double a) -> {
            return Math.pow(a, a);
        };
        double t = doubleFunction.apply(6);
        System.out.println("DoubleFunction: " + t);

    }
}


// 1)
interface NoParam {
    public void method1();
}

// 3)

interface OneParam {
    public double method2 (double a);
}

//

interface TwoParam {
    public int method3 (int a, int b);
}