package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        RunInt_01 runInt_01 = new RunInt_01("First thread");

        RunInt_02 runInt_02 = new RunInt_02();
        runInt_02.thread = new Thread(runInt_02, "Second thread");
        runInt_02.thread.setPriority(10);
        runInt_02.thread.start();


    }
}

class RunInt_01 implements Runnable {
    Thread thread;

    public RunInt_01(String name){
        thread = new Thread(this, name);
        thread.start();
        thread.setPriority(1);
    }
    @Override
    public void run(){
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }
}

class RunInt_02 implements Runnable {
    Thread thread;

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + Thread.currentThread().getName() + "!");
    }
}
