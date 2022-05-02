package labs_examples.casting;

public class NarrowingConversions {

    public static void main(String[] args)
    {
        double x = 1037.67;
        // double "x" is being casted to an (int) "z" below
        int z = (int) x;
        System.out.println("double x = " + x);
        System.out.println("int z = " + z);


        // more examples
        double d = 100.04;
        // cast double "d" to long "l" - explicit type casting required
        long l = (long)d;
        // cast long "l" to int "i" - explicit type casting required
        int i = (int)l;


        System.out.println("Long value " + l);
        System.out.println("int value " + i);
    }

}
