package labs_examples.access_modifiers;

public class AccessModExer {

    public static void main(String[] args) {

        AccessMod obj = new AccessMod();

        obj.publicVar = "Cube";
        obj.protectedVar = "Shiny";

        // try to set each instance var on the "obj" object
        // hint - only two will work
    }
}

class AccessMod {

    public String publicVar;
    protected String protectedVar;
    private String privateVar;

}


