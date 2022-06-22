package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {

        ArrayList<Instrument> instruments = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/files/instruments.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                instruments.add(mapValuesToInstrObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Instrument i : instruments){
            System.out.println(i.toString());
        }

        try(FileWriter output = new FileWriter("src/labs_examples/input_output/files/instruments_02.csv")){
            for(Instrument i : instruments){
                output.write(String.valueOf(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Instrument mapValuesToInstrObject(String[] values) {

        Instrument instrument = new Instrument();

        instrument.setNum(Integer.parseInt(values[0]));
        instrument.setName(values[1]);
        instrument.setFamily(values[2]);
        instrument.setOctaves(Double.parseDouble(values[3]));

        return instrument;
    }
}