package labs_examples.input_output.labs;

import java.io.*;

public class Exercise_03_4a {

    public static void main(String[] args) {

        short s = 7;
        int i = 678;
        double d = 78.90;

        String filePath = "src/labs_examples/input_output/labs/dataReadWrite.txt";

        try(DataOutputStream dataOutput =
                    new DataOutputStream(new FileOutputStream(filePath))){

            dataOutput.writeShort(s);
            dataOutput.writeInt(i);
            dataOutput.writeDouble(d);

        } catch (IOException e) {
            System.out.println("write error");
            return;
        }

        try (DataInputStream dataInput =
                new DataInputStream(new FileInputStream(filePath))){

            s = dataInput.readShort();
            System.out.println(s);
            i = dataInput.readInt();
            System.out.println(i);
            d = dataInput.readDouble();
            System.out.println(d);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
