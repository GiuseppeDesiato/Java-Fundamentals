package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_03_3a {

    public static void main(String[] args) throws IOException {

        FileInputStream file = null;
        BufferedInputStream input = null;

        try {
            file = new FileInputStream("src/labs_examples/input_output/labs/exercise_1.txt");
            input = new BufferedInputStream(file);

            int i = input .read();

            while (i != -1) {
                if (i == '.'){
                    System.out.println();
                }
                System.out.print((char) i);
                i = input.read();
            }
        }

        catch (Exception e) {
            e.getStackTrace();
        }

        finally {
            if (input != null) {
                input.close();
            }
        }

    }

}
