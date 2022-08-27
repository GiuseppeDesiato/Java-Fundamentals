package labs_examples.datatypes_operators;

public class area_of_a_circle {

    public static void main(String[] args) {

        //area calculation
        float r = 10f;
        double area = Math.PI * (r * 2);

        System.out.println("The area of the circle is A = " + area);
        String rounded = String.format("%.2f",+ area);
        System.out.println("The rounded value of the area of the circle is A = " + rounded);

    }
}
