package labs_examples.generics;

public class BoundedTypeTest {

    public static void main(String[] args) {

        // Step 1) create the generic method as instructed in the NumericExample class

        // Step 2) call that method and pass two doubles
        NumericExample numericExample1 = new NumericExample();
        double a = numericExample1.sum(3889.378, 26778.415);
        System.out.println(a);

        // Step 3) call that method and pass two ints
        double b = numericExample1.sum(8, 7);
        System.out.println(b);

        // Step 4) call that method and pass two floats
        double c = numericExample1.sum(8.2, 7.8);
        System.out.println(c);

        // Step 5) call that method and pass one int and one double
        double d = numericExample1.sum(2, 78.3);
        System.out.println(d);

    }
}

class NumericExample {

    // write a generic method below that will return the sum of ANY two numeric values
    // (no matter what their specific data type is) (but remember the values must be Numeric)

    public <V extends Number> double sum(V v1, V v2){
        return v1.doubleValue() + v2.doubleValue();
    }


}

