package labs_examples.input_output.labs;

import java.io.ByteArrayInputStream;

public class Exercise_03_1a {

    public static void main(String[] args) {

        byte[] array = {50, 20, 30 ,40 ,100};

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.print("The array contains: ");
            for(int i= 0; i < array.length; i++) {

                // Reads the bytes
                int data = input.read();
                if (array[i] != array[array.length-1]){
                    System.out.print(data + ", ");
                } else {
                    System.out.print("and " + data + ".");
                }

            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
