package labs_examples.arrays;


import java.util.ArrayList;

public class ArrayListExer {

    public static void main(String[] args) {

        // please demonstrate how to declare an ArrayList below

        ArrayList<String> arrayList = new ArrayList<>();

        // please demonstrate how to add values to an array ArrayList

        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Peach");

        // please demonstrate how to remove values from an ArrayList
        arrayList.remove("Apple");


        // please demonstrate how to retrieve values from an ArrayList

        int indexOf = arrayList.indexOf("Peach");
        System.out.println(indexOf);

        // please demonstrate at least two other useful methods available
        // to us when we use ArrayLists

        boolean empty = arrayList.isEmpty();
        System.out.println(empty);

        boolean cont = arrayList.contains("Carrot");
        System.out.println(cont);

        for(String s : arrayList){
            System.out.println(s);
        }

        System.out.println(arrayList.get(1));

    }
}
