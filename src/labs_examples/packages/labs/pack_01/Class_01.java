package labs_examples.packages.labs.pack_01;

import labs_examples.packages.labs.pack_02.Class_02;

public class Class_01 {

    public static void main(String[] args) {

        Class_02 class_02 = new Class_02();
        class_02.print02();
    }


    protected void printClass01(){
        System.out.println("this method is protected and belongs to Class_01");
    }

    public void print01(){
        System.out.println("this method in Class_01 is public");
    }

}
