package labs_examples.arrays;

import java.util.ArrayList;

public class ForEachLoopArray {

    public static void main(String[] args) {

        // please declare an array or arraylist below

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        // please populate that array or arraylist

        for (int i = 0; i < arrayList.size(); i++ ){
            arrayList.add(i);
        }

        // please use a For Each Loop to print each element
        // in the array or arraylist you declared and populated above

        for (int val : arrayList){
            System.out.println(val);
        }

    }
}
