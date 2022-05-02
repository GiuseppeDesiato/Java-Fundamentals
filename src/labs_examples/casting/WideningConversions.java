package labs_examples.casting;

public class WideningConversions {

    public static void main(String[] args)
    {
        int i = 100;
        //convert int "i" to long "l" - no explicit type casting required
        long l = i;
        //convert long "l" to float "f" - no explicit type casting required
        float f = l;
        //convert float "f" to double "d" - no explicit type casting required
        double d = f;

        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
        System.out.println("Double value "+d);
    }

}
