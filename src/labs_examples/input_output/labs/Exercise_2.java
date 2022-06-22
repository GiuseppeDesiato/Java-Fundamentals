package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_2 {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        BufferedReader bufferedReader= null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/labs_examples/input_output/labs/exercise_1.txt");
            bufferedReader = new BufferedReader(inputStream);
            outputStream = new FileWriter("src/labs_examples/input_output/labs/exercise_2b_encr.txt");

            int i;

            while ((i = bufferedReader.read()) != -1) {
                if (i == 'a') {
                    i = '-';
                } else if (i == 'e') {
                    i = '~';
                }
                outputStream.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close connections
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

        try {
            inputStream = new FileReader("src/labs_examples/input_output/labs/exercise_2b_encr.txt");

            int i;

            while ((i = inputStream.read()) != -1) {
                if (i == '-') {
                    i = 'a';
                } else if (i == '~') {
                    i = 'e';
                }
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close connections
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
