package labs_examples.objects_classes_methods.labs.oop.A_inheritance.AnimalsPackage;

public class Mustang extends Animals{

    public int avePrice;

    public Mustang(String area, int age, int legs, int avePrice) {
        super(area, age, legs);
        this.avePrice = avePrice;
    }

    @Override
    public void verse() {
        System.out.println("the horse mustang neighs");
    }

    @Override
    public String toString() {
        return "Mustang{" +
                "area='" + area + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                ", avePrice=" + avePrice +
                '}';
    }

    public int getAvePrice() {
        return avePrice;
    }

    public void setAvePrice(int avePrice) {
        this.avePrice = avePrice;
    }
}
