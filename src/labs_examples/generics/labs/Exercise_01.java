package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01{
    public static void main(String[] args) {

        TestGen <String, String> gen1 = new TestGen("Hello", "World");
        TestGen <Integer, Double> gen2 = new TestGen(123, 24.5);
        TestGen <String, Double> gen3 = new TestGen("I am", 5.9);

        gen1.print();
        gen2.print();
        gen3.print();

    }
}


class TestGen<T, V>{

    private T val1;
    private V val2;

    public TestGen(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public void print() {
        System.out.println(val1 + " " + val2);
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public V getVal2() {
        return val2;
    }

    public void setVal2(V val2) {
        this.val2 = val2;
    }
}