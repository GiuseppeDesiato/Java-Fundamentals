package labs_examples.methods.pass_by_value;

public class PassByVal {

    public static void main(String[] args) {
        double a = 12;
        double b = 14;

        someOtherMethod(a,b);
    }

    public static void someOtherMethod(double a, double b){
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }
}
