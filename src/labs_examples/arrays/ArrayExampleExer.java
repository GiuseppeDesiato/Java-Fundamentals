package labs_examples.arrays;

public class ArrayExampleExer {

        public static void main(String[] args) {
            // please demonstrate how to declare and initialize a
            // String array of size five below

            String[] strArray = new String[5];

            // once initialized, please populate each index of the array
            strArray[0] = "ciao";
            strArray[1] = "bella";
            strArray[2] = "hey";
            strArray[3] = "oh";
            strArray[4] = "grandissimo";

            // once populated, please print out each element in the array
            // using a For Loop
            for(int i = 0; i < strArray.length; i++){
                System.out.println(strArray[i]);
            }

            char[] letters = {'k', 'd', 'm', 'i', 'e', 'f', 'g', 'h'};
            System.out.println(letters[letters.length - 1]);
        }
    }

