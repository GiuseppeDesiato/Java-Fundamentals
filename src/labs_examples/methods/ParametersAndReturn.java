package labs_examples.methods;

public class ParametersAndReturn {

    public static void main(String[] args) {

        // please write the four methods as instructed below
        // then call each method from here within the main()

        int a = 2;
        int b = 6;

        int x = multiply(a, b);
        System.out.println(x);
        int y = divide(a, b);
        System.out.println(y);
        boolean w = isOdd(a);
        System.out.println(w);
        revString("Ciao come stai?");


    }

    // please write a static multiply() method below that takes
    // two parameters (argumets) and returns the result of
    // multiplying them together

    public static int multiply(int a, int b){
        return a * b;
    }

    // please write a static divide() method below that takes
    // two parameters (argumets) and returns the result of
    // dividing the first parameter by the second parameters

    public static int divide(int a, int b){
        return a / b;
    }

    // please write a static isOdd() method that takes one numeric
    // parameter and returns a true (boolean) if the parameter is odd

    public static boolean isOdd(int a){
        if (a % 2 != 0) {
            return true;
        }
        return false;
    }

    // please write a method that will take in a String (as an argument)
    // and return that String in reverse order. For instance, if you pass
    // in the String "programming is cool" the method will return the
    // String "looc si gnimmargorp"

    public static void revString(String str){
        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
