package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.MusicInstruments;

public class AltoSax implements Instruments {


    @Override
    public boolean play() {
        return false;
    }

    @Override
    public void sound() {
        System.out.println("jazzy");
    }

    //sound method overloading
    public void sound(String sound) {
        System.out.println("My favourite sax sound is: " + sound);
    }

    @Override
    public void lowNote() {
        System.out.println("Db3");
    }

    @Override
    public void highNote() {
        System.out.println("not defined");
    }

    //highNote Method overloading
    public void highNote(String note){
        System.out.println("The highest note in the ordinary range is: " + note);
    }

}
