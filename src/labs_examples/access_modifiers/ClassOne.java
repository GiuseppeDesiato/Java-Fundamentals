package labs_examples.access_modifiers;

public class ClassOne {

    public int publicVar;
    protected int protectedVar;
    private int privateVar;

    public void changePrivateVar(int val){
        if (val >= 0 && val <= 1000 ){
            privateVar = val;
        }
    }

    /*
    ACCESS MODIFIERS - affect classes, instances variables and methods
                       they  play a large role in Encapsulation - one of the primary
                       tenants of Object-Oriented Programming

              public
                  AVAILABLE ANYWHERE
                  any class, instance variable or method that is marked "public"
                  can be openly accessible from anywhere in the application.
                  it can also be accessed by external application that are using
                  this application

              private
                  ONLY AVAILABLE IN THE SAME CLASS
                  never write a private class, otherwise it would be not accessible.
                  the only two access modifiers are public or default (no need to write default).
                  ony accessible from within the class where the private variable or
                  method is declared. We do not have a thing such as a private class.

              protected
                  ONLY AVAILABLE ONLY IN THE SAME PACKAGE
                  only accessible by classes (and their members) that are declared in
                  the same package as the variable or method that is declared "protected".
                  In addition, subclasses whether they are in the same package or not, can
                  access protected members.

              default
                  There is no access modifier on the class, instance variable or method.
                  the same as protected (only accessible in the same package) but not accessible by subclasses.

     */

}
