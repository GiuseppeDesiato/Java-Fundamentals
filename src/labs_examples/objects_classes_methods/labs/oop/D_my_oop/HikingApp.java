package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class HikingApp {

    public static void main(String[] args) {



    }

    public String notString(String str) {
        str = "ciao";
        String n = "not";
        if (!str.contains("not")){

            return n+str;
        }
        return null;
    }
}
