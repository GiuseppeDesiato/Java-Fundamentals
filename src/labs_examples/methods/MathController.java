package labs_examples.methods;

public class MathController {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        int c = CustomMath.multiply(a, b);
        int d = CustomMath.divide(a, b);

        double x = 12.34;
        double y = 45.67;


        double z = CustomMath.multiply(x, y);

        System.out.println(x);
        System.out.println(z);

    }

}
