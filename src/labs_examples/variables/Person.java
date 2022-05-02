package labs_examples.variables;

public class Person {

    /* non-static instance variables. (name and age)
    variables declared outside any method in this class.
    and it is used to actually describe an object of that class.

    with instance variables gets its own copy of the variables
     */
    String name; //non-static
    int age; // non-static
    static int numPersonsCreated; /* a static instance variable is shared across all objects of that class.
                                   it is not like the first two instance variables.
                                   it is a single variable in memory that all objects will have access to
                                  */


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "' numPersonsCreated=" + numPersonsCreated +
                '}';
    }
}
