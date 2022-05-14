package labs_examples.objects_classes_methods.labs.methods;

public class Customer {

    public int age;
    public double weight;
    public String name;

    public Customer(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
