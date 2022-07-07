package labs_examples.generics;

public class GenericArrayTest{

    public static void main(String[] args) {

        Generic<String> g = new Generic<String>();
        String[] sArray = {"one" , "two", "three", "four", "five"};
        System.out.println("first array: ");
        g.printArray(sArray);
        System.out.println(" ");

        Generic<Integer> i = new Generic<Integer>();
        Integer[] iArray = {1 , 2, 3, 4, 5};
        System.out.println("second array: ");
        i.printArray(iArray);

    }

    static class Generic<E> {

        public void printArray(E[] array){

            for(E x : array){
                System.out.println(x);
            }

        }
    }
}
