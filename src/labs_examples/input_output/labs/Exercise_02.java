package labs_examples.input_output.labs;


import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_2_no_Buffer_Reader {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/labs_examples/input_output/labs/exercise_1.txt");
            outputStream = new FileWriter("src/labs_examples/input_output/labs/exercise_2_encr.txt");

            int i;

            while ((i = inputStream.read()) != -1) {
                if (i == 'a'){
                    i = '-';
                } else if (i == 'e'){
                    i = '~';
                }
                outputStream.write(i);
                System.out.print((char) i);
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
    }
}

