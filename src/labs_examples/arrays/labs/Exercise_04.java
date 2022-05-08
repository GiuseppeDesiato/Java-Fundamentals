package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] irregular = new int[3][];

        irregular[0] = new int[2]; // array at index 0 will have 2 elements
        irregular[1] = new int[4]; // array at index 1 will have 4 elements
        irregular[2] = new int[3]; // array at index 2 will have 3 elements

        int count = 0;
        for (int i = 0; i < irregular.length; i++){
            for (int x = 0; x <irregular[i].length; x++){
                irregular[i][x] = count;
                count+=2;
            }
        }

        for (int[] vali : irregular){
            for (int valx : vali ){
                System.out.print(valx + " | ");
            }
            System.out.println(" ");

        }

    }

}
