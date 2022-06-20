package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream =
                     new FileInputStream("src/labs_examples/input_output/labs/exercise_1.txt");
             BufferedInputStream buffInputStr =
                     new BufferedInputStream(inputStream);
             FileOutputStream outputStream =
                     new FileOutputStream("src/labs_examples/input_output/labs/exercise_1_out.txt")) {

            byte[] buffer = new byte[5];
            int bytesRead = 0;
            // this while loop will read the file 5 bytes at a time
            while ((bytesRead = buffInputStr.read(buffer)) != -1) {
                //print out bytes read to the console
                System.out.print(new String(buffer, 0, bytesRead));
                //print out bytes read to the new file
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}