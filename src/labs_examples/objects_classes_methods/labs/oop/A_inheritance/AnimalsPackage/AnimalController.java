package labs_examples.objects_classes_methods.labs.oop.A_inheritance.AnimalsPackage;

public class AnimalController {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Europe and USA", 6,4,true);
        Cow cow1 = new Cow("Multiple", 3, 4, true);
        GoldenRetriever golden = new GoldenRetriever("Multiple", 5, 4, true, "light Brown");
        Mustang mustang = new Mustang("USA", 2,4, 5000);

        dog1.setArea("Japan");
        golden.setLegs(3);

        dog1.verse();
        cow1.verse();
        mustang.verse();
        golden.eat();

        System.out.println(dog1.toString());
        System.out.println(golden.toString());

    }

}
