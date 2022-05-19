package labs_examples.classes;


//POJO = plain old java object. A POJO is a basic class that describes an object.
public class Person {


    //instance variable
    public  int age;
    public double height;
    public String name;

    //constructors
    public Person(){}

    public Person(int age, double height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    //methods
    //...
}
