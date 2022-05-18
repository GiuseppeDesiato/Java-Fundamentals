package labs_examples.objects_classes_methods.labs;

public class ObjectsRepl {

    public static void main(String[] args) {
        // please demonstrate how to create two unique Object
        // of the Person class below

        Person personOne = new Person();
        Person personTwo = new Person();


        // please demontsrate how to set the object's instance vars

        personOne.name = "Joe";
        personTwo.age = 34;

        personTwo.name = "Juls";
        personTwo.age = 33;

        // please print out the name and age of both Person objects
        // using the object to get the values

        System.out.println("personOne name is " + personOne.name + " and personOne age is " + personOne.age);
        System.out.println("personTwo name is " + personTwo.name + " and personTwo age is " + personTwo.age);

    }
}

class Person {
    public String name;
    public int age;

}
