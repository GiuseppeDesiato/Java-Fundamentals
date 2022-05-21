package labs_examples.objects_classes_methods.labs.oop.A_inheritance.AnimalsPackage;

public class Animals {

    protected String area;
    protected int age;
    protected int legs;


    public Animals(String area, int age, int legs) {
        this.area = area;
        this.age = age;
        this.legs = legs;
    }

    //methods
    public void verse(){
        System.out.println("the animal emits its sound");
    }
    public void eat(){
        System.out.println("the animal eats");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "area='" + area + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }

    //Getters and Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
