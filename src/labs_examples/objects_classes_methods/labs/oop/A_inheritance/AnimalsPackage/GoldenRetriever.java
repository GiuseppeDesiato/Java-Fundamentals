package labs_examples.objects_classes_methods.labs.oop.A_inheritance.AnimalsPackage;

public class GoldenRetriever extends Dog{

    public String color;

    public GoldenRetriever(String area, int age, int legs, boolean longFur, String color) {
        super(area, age, legs, longFur);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("the golden retriever eats lean beef");
    }

    @Override
    public String toString() {
        return "GoldenRetriever{" +
                "area='" + area + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

