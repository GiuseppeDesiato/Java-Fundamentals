package labs_examples.variable_scope;

public class VariableScope {

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.make = "Hyunday";
        myCar.model = "Sonata";
        myCar.year = 2009;

    }

    static int globalVar = 10; // global variable also known as field

    public static int multiply(int a, int b){
        int result = a * b * globalVar;
        return result;
    }

    public static int divide(int a, int b){
        int result2 = globalVar / a / b;
        return result2;
    }
}
