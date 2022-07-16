package labs_examples.generics;

public class GenericPrint {

    public static void main(String[] args) {

        Printer<Integer> nums = new Printer<>(789);
        nums.print();

        Printer<Double> numsD = new Printer<>(78.988);
        numsD.print();

        Printer<String> str = new Printer<>("Hello");
        str.print();

    }
}
