package labs_examples.generics;

public class GenericArrayTest3 {

        public static void main(String[] args) {
            // Step 1) create an array of 5 strings then call the printArray() method and pass the String array

            String[] strArray = {"Gigio!", "Ciao,", "come", "stai", "today?"};
            GenericArrayTest3.printArray1(strArray);

            // Step 1) create an array of 5 ints then call the printArray() method and pass the int array
            Integer[] intArray = {890, 7, 5, 36, 28};
            GenericArrayTest3.printArray1(intArray);

            // Step 1) create an array of 5 doubles then call the printArray() method and pass the double array
            Double[] doubArray = {89.3, 7.22, 5.1, 3.6, 0.28};
            GenericArrayTest3.printArray1(doubArray);
        }

        public static < E > void printArray1(E[] inputArray) {
            // Display array elements
            for(E element : inputArray) {
                System.out.printf("%s ", element);
            }
            System.out.println();
        }
    }

