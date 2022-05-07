package labs_examples.arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] intArray = new int[5]; // when using an array you have to define its length

        intArray[0] = 97;
        intArray[1] = 17;
        intArray[2] = 56;
        intArray[3] = 14;
        intArray[4] = 39;

        for(int i = 0; i < intArray.length; i++){
            System.out.println("The array value at the index of "
                    + i + " is " + intArray[i]);
        }

        // alternative array's declaration syntax. not common
        int[] intArray2 = {56,78,45,89,13};

        System.out.println(intArray2[2]);

    }

    //method for printing the value of an Array
    public static void printArray(int[] vals){
        for (int i = 0; i < vals.length; i++){
            System.out.println(vals[i]);
        }
    }

}
