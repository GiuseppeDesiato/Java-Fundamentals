package labs_examples.exception_handling;

public class TestException {

    public int division(int a, int b){

        try {
            return a/b;
        } catch (ArithmeticException exc){
            return -1;
        }

    }
}
