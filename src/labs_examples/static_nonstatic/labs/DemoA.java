package labs_examples.static_nonstatic.labs;

public class DemoA {

    public static void main(String[] args) {

        DemoB demoB = new DemoB();

        DemoA demoA = new DemoA();
        demoA.nonStaticSameClass();

        demoA.nonStaticOtherClassTwo(demoB);
    }

    //1) A static method calling another static method in the same class
    //2) A static method calling a non-static method in the same class
    public static void printStaticNonStatic(){
        printStaticTwo();
        printStaticNonStatic();
    }

    //3) A static method calling a static method in another class
    public static void staticFromOtherCLass(){
        DemoB.multiply(8,9);
    }

    //4) A static method calling a non-static method in another class
    public static void nonStaticFromOtherCLass(DemoB demob){
        demob.sum(10, 30);
    }

    //5) A non-static method calling a non-static method in the same class
    public void nonStaticSameClass(){
        int a = 6;
        int b = 2;
        System.out.println(divide(a,b));
    }

    //A non-static method calling a non-static method in another class
    public void nonStaticOtherClassTwo(DemoB demoB){
        demoB.modulo(12, 4);
    }


    //A non-static method calling a static method in the same class
    public void nonStaticSameClassTwo(DemoA demoA){
        demoA.nonStaticSameClassTwo(demoA);
    }

    //A non-static method calling a static method in another class
    public void nonStaticTwo(DemoB demoB){
        DemoB.multiply(10, 5);
    }

    public static void printStaticTwo(){
        System.out.println("This is a static method");
    }

    public void printNonStatic(){
        System.out.println("This is a non static method");
    }

    public int divide(int a, int b){
        return a / b;
    }


}
