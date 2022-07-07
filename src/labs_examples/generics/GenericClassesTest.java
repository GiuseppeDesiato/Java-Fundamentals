package labs_examples.generics;

public class GenericClassesTest {

    public static void main(String[] args) {

        // Step 1) Create an object of the Generic class below and call the print() method on it

        MyGeneric<Integer, Double> gen1 = new MyGeneric(89, 789.2);
        gen1.print();

        // Step 2) Create another object of the Generic class below using a different data type and call the print() method on it

        MyGeneric<String, Integer> gen2 = new MyGeneric("Hello Giu!", 178);
        gen2.print();
        // Step 3) modify the class below to require two generic types - then modify your objects above so it still works
    }
}

 class MyGeneric <T, V> {

     T val1;
     V val2;

     public MyGeneric(T val1, V val2) {
         this.val1 = val1;
         this.val2 = val2;

     }

     public void print() {
         System.out.println(val1 + " " + val2);

     }
 }
