package labs_examples.static_nonstatic;

public class MyMathExer {

    public static void main(String[] args) {

        // demonstrate how to invoke both method in the MyMath class below
        MyMath.multiply(4, 5);

        MyMath.divide(6,3);

    }
}

class MyMath{
    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        if (b == 0){
            return -1;
        } else {
            return a/b;
        }
    }
}

