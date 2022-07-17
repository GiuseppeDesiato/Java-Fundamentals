package labs_examples.lambdas;

public class LambdaExpressionTest2 {

    public static void main(String[] args) {

        Lambda2 lambda2a = (double a, double b) -> {
            return a / b;
        };

        double x = lambda2a.op(678.3, 26.2);
        System.out.println(x);

        Lambda2 lambda2b = (double a, double b) -> {
            return a - b;
        };

        double y = lambda2b.op(678.3, 26.2);
        System.out.println(y);

        //--------------------------------
        // lambda from a generic interface

        GenInter<Integer> genIn1 = (Integer val1, Integer val2) -> {
            return val1 * val2;
        };
        System.out.println(genIn1.op(567, 789));


        GenInter<Double> genIn2 = (Double val1, Double val2) -> {
            return val1 * val2;
        };
        System.out.println(genIn2.op(567.22, 789.3));

    }
}

@FunctionalInterface
interface Lambda2{

    public double op(double a, double b);
}

// generic interface
@FunctionalInterface
interface GenInter<T>{

    public T op(T a, T b);
}