package labs_examples.lambdas.labs;

import java.util.function.*;
/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        //1. IntFunction
        IntFunction <Integer> intFunction = (a) -> {
            if (a > 10)
                return a + a;
            else
                return a * a;
        };
        int q = intFunction.apply(12);
        System.out.println(q);


        //2. BiPredicate
        BiPredicate <Double, Double> biPredicate = (a, b) -> {
            if (a > b)
                return true;
            else
                return false;
        };
        boolean b = biPredicate.test(678.3, 567.3);
        System.out.println(b);


        //3. BinaryOperator
        BinaryOperator <Double> binaryOp = (x, y) -> {
          return Math.pow(x,y);
        };
        double s = binaryOp.apply(3.3, 2.2);
        System.out.println(s);


        //4. Consumer
        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };
        consumer.accept("Hello!");


        //5. Function
        Function<String, Integer> function = (x) -> {
            return x.length();
        };
        int l = function.apply("Gigio");
        System.out.println(l);


        //6. IntBinaryOperator
        IntBinaryOperator intBinary = (c, d) -> {
            return (c * d) + c;
        };
        int w = intBinary.applyAsInt(23,34);
        System.out.println(w);


        //7. IntToDoubleFunction. Takes an int and give a double
        IntToDoubleFunction funct = (a) -> {
            return a;
        };
        System.out.println(funct.applyAsDouble(15));


        //8. DoubleBinaryOperator
        DoubleBinaryOperator doubleBinary = (k, j) -> {
            return k * j;
        };
        System.out.println(doubleBinary.applyAsDouble(78,90));


        //9. BiConsumer
        BiConsumer <Integer, Double> biConsumer = (v, n) -> {
            System.out.println(v * n);
        };
        biConsumer.accept(45, 98.6);


        //10. BooleanSupplier
        BooleanSupplier booleanS = () -> true;
        System.out.println(booleanS.getAsBoolean());

    }
}