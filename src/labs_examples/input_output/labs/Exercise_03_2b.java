package labs_examples.input_output.labs;

import java.io.IOException;
import java.io.StringWriter;

public class Exercise_03_2b {

    public static void main(String[] args) throws IOException {

        String data = "string for the testing the StringWriter class.";

        StringWriter output = null;

        try {
            output = new StringWriter();

            output.write(data);

            System.out.println("Data in the StringWriter: " + output);

        } catch (Exception e) {
            e.getStackTrace();

        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
