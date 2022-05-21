package labs_examples.objects_classes_methods.labs.oop.A_inheritance.AnimalsPackage;

public class Cow extends Animals{

    public boolean milk;

    public Cow(String area, int age, int legs, boolean milk) {
        super(area, age, legs);
        this.milk = milk;
    }

    @Override
    public void verse() {
        System.out.println("the cow bellows");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "milk=" + milk +
                '}';
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }
}
