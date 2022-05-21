package labs_examples.objects_classes_methods.labs.oop.A_inheritance.AnimalsPackage;

public class Dog extends Animals{

    private boolean longFur;


    public Dog(String area, int age, int legs, boolean longFur) {
        super(area, age, legs);
        this.longFur = longFur;
    }

    @Override
    public void verse() {
        System.out.println("the dog barks");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "area='" + area + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                ", longFur=" + longFur +
                '}';
    }

    public boolean isLongFur() {
        return longFur;
    }

    public void setLongFur(boolean longFur) {
        this.longFur = longFur;
    }
}

