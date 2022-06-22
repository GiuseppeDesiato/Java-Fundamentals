package labs_examples.input_output.labs;

import java.io.StringReader;

public class Exercise_03_2a {

    public static void main(String[] args) {

        String data = "Random text for testing StringReader class.";

        char[] array = new char[data.length()];

        try {
            StringReader input = new StringReader(data);

            input.read(array);
            System.out.println("Data read from the string:");
            System.out.println(array);

            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

    }
}
