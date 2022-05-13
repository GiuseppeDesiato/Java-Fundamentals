package labs_examples.methods.pass_by_reference;

import labs_examples.classes.Person;

public class PassByRef {

    public static void main(String[] args) {

        Person giuseppe = new Person(36, 75, "Giu");

        System.out.println(giuseppe.toString());

        addYearToPerson(giuseppe);

        System.out.println(giuseppe.toString());

    }

    public static void addYearToPerson(Person person){
        person.age = person.age + 1;
    }

}
