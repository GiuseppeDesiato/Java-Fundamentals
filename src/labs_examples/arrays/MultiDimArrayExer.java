package labs_examples.arrays;

public class MultiDimArrayExer {

    public static void main(String[] args) {

        // please demonstrate how to declare a Two-Dimensional Array
        // with a height of 4 and a width of 5 below

        int[][] multiD = new int[4][5];

        // using a nested for loop, please populate every index in the 2-D Array
        int count = 0;
        for (int i = 0; i < multiD.length; i++) {
            for (int x = 0; x < multiD[i].length; x++) {
                multiD[i][x] = count;
                count++;
            }

            // once populated, use a nested for loop to print each element in the 2-D array
        }
        for (int i = 0; i < multiD.length; i++) {
            for (int x = 0; x < multiD[i].length; x++) {
                System.out.print(multiD[i][x] + " | ");
            }
            System.out.println(" ");
        }
    }
}
