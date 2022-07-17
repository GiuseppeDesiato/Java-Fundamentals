package labs_examples.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {

        shout("Ciao", 67);
        shout(78.99, 16);
        shout("ok", "Computer");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        printList(integerList);

        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        printList(strList);

    }

    //generic method
    public static <T, V> void shout(T thingToShout1, V thingToShout2){
        System.out.println(thingToShout1 + " " + thingToShout2);
    }

    // ? is a wildcard. we do not know for sure what type of object to pass
    public static void printList(List<?> myList){
        System.out.println(myList);
    }

}
