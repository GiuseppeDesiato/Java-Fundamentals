package labs_examples.objects_classes_methods.labs;

public class ConstructorRepl {

    public static void main(String[] args) {

        // please write a custom constructor in the Person class
        // as directed below (in the Person class)

        // now use that new constructor to create two unique Person objects

        PersonNew personNewOne = new PersonNew("Joe",34);
        PersonNew personNewTwo = new PersonNew("Juliana",33);

        // now print the instance var values of each object

        System.out.println(personNewOne.name + " " + personNewOne.age);
        System.out.println(personNewTwo.name + " " + personNewTwo.age);

    }
}

class PersonNew {

    String name;
    int age;

    // please create a fully qualified constructor
    // (which is a constructor that takes in "name" and "age")
    // and set the instance variables above from within the constructor

    public PersonNew(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
