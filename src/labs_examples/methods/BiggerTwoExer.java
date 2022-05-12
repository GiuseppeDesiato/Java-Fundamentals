package labs_examples.methods;

public class BiggerTwoExer {

    public static void main(String[] args) {

        int[] a = {3, 4};
        int[] b = {5, 2};

        System.out.println(biggerTwo(a, b));

    }

    public static int[] biggerTwo(int[] a, int[] b) {

        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if(sumA >= sumB)
            return a;

        if(sumA < sumB)
            return b;

        return a;
    }

}
