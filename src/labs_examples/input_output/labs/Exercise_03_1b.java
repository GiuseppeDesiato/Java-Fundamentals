package labs_examples.input_output.labs;

import java.io.ByteArrayOutputStream;

public class Exercise_03_1b {

    public static void main(String[] args) {

        String dataString = "This is a test string.";

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = dataString.getBytes();

            // Writes data to the output stream
            out.write(array);

            // Retrieves data from the output stream in string format
            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            out.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }

    }
}
