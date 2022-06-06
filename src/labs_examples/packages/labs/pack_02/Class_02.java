package labs_examples.packages.labs.pack_02;

import labs_examples.packages.labs.pack_01.Class_01;

public class Class_02 {

    public static void main(String[] args) {

        Class_01 class_01 = new Class_01();
        class_01.print01();

        Class_02 class_02 = new Class_02();
        class_02.printClass02();

    }

    protected void printClass02(){
        System.out.println("this method is protected and belongs to Class_02");
    }

    public void print02(){
        System.out.println("this method in Class_02 is public");
    }

}
