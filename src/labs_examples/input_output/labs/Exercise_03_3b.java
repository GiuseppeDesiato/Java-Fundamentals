package labs_examples.input_output.labs;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Exercise_03_3b {

    public static void main(String[] args) {

        String data = "Test string to be printed in a new file.";

        FileWriter file = null;
        BufferedWriter output = null;

        try {
            file = new FileWriter("src/labs_examples/input_output/labs/exercise_03_3b.txt");
            output = new BufferedWriter(file);

            output.write(data);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

}
