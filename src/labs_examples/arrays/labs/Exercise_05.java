package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strA = new String[8];


        for (int i = 0; i < strA.length; i++ ){
            strA[i] = sc.next();
        }

        for (int x = strA.length - 1; x >=0 ; x-=2){
            System.out.println(strA[x]);
        }

    }

}
