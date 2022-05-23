package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.MusicInstruments;

public class InstrumentController {

    public static void main(String[] args) {

        AltoSax sax = new AltoSax();

        System.out.println(sax.play());

        sax.sound();
        sax.sound("harsh");

        sax.lowNote();

        sax.highNote("C7");

    }

}
