package labs_examples.objects_classes_methods.labs.objects;

public class Home {

    public static void main(String[] args) {

        Doors doors = new Doors(10);
        Color1 color1 = new Color1("blue", "white");

        System.out.println("My home has " + doors.numberDoors + " doors. Its outside wall are painted " +
                color1.outsideColor + ", while its inner walls are " + color1.insideColor + ".");
    }
}

class Doors{

    int numberDoors;

    public Doors(int numberDoors){
        this.numberDoors = numberDoors;
    }
}

class Color1{

    String outsideColor;
    String insideColor;

    public Color1(String outsideColor, String insideColor){
        this.outsideColor = outsideColor;
        this.insideColor = insideColor;
    }
}
