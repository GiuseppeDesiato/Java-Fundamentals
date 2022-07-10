package labs_examples.generics.labs;


import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(0,1);
        listNum.add(1, 100);
        listNum.add(2, 49);
        Demo demo = new Demo();

        System.out.println(demo.sumArray(listNum));

    }
}

class Demo{

    public static double sumArray(ArrayList<? extends Number> list){ // "?" means any type of arraylist that extends Number

        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}