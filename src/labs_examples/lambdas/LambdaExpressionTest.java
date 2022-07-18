package labs_examples.lambdas;

public class LambdaExpressionTest {

    public static void main(String[] args) {

        // Step 1) Create a lambda expression using the interface below

        LambdaInter lambda = (a, b) -> {
            return a + b;
        };

        // Step 2) call the apply() method on the lambda object

        int result1 = lambda.apply(7, 9);
        System.out.println(result1);

        // Step 3) redefine the lambda

        lambda = (a, b) -> {
            return a * b;
        };

        // Step 4) call the apply() method again

        int result2 = lambda.apply(5, 4);
        System.out.println(result2);


    }
}

@FunctionalInterface
interface LambdaInter {
    public int apply(int a, int b);
}

