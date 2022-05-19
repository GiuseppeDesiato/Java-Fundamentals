package labs_examples.objects_classes_methods.labs.objects;

public class Boat {

    public static void main(String[] args) {

        Cabin cabin1 = new Cabin(5.4, 80.4);

        Cabin cabin2 = new Cabin("white");

        Cabin cabin3 = new Cabin(30, 80.4, 10);


    }
}

class Cabin{

    int cabinNumber;
    double cabinDimension;
    double boatDimension;
    double length;
    double heigth;
    String color;

    public Cabin(double cabinDimension, double boatDimension) {
        this.cabinDimension = cabinDimension;
        this.boatDimension = boatDimension;
    }

    public Cabin(String color) {
        this.color = color;
    }

    public Cabin(int cabinNumber, double length, double heigth) {
        this.cabinNumber = cabinNumber;
        this.length = length;
        this.heigth = heigth;
    }
}
