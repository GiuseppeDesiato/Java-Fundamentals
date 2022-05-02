package labs_examples.variables;

import java.awt.*;

public class Variables {

    double val =  123.45; /* variable declared outside any methods - at the class level. Is a global variable or field.
                            this means that val can be used anywhere
                            */

    public static void main(String[] args) {
        int x = multiply(5, 9);

        Person myPerson = new Person("John",56);
        myPerson.age = 45; //changing the value associated with age
        Person myPerson2 = new Person("Cindee", 34);
        Person myPerson3 = new Person("Giovanni", 23);

        System.out.println(myPerson.toString());
        System.out.println(myPerson2.toString());
        System.out.println(myPerson3.toString());
    }

    public static int multiply(int a, int b){ // a and b are local variable
        int result = a * b;
        printNum(result);
        return result;
    }

    public static void printNum(int numToPrint){
        System.out.println(numToPrint);
    }
}
