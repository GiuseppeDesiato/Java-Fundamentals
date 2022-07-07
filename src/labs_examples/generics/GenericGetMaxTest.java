package labs_examples.generics;

public class GenericGetMaxTest {

    public static void main(String[] args) {

        int a = GenericGetMaxTest.getMax(1889, 1289, 1285);
        System.out.println("the max value is: " + a);

    }


    public static <T extends Comparable<T>> T getMax(T val1, T val2, T val3) {
        T max = val1;   // assume x is initially the largest

        if(val2.compareTo(max) > 0){
            max = val2;   // y is the largest so far
        }

        if(val3.compareTo(val2) > 0) {
            max = val3;   // z is the largest now
        }
        return max;   // returns the largest object
    }
}
