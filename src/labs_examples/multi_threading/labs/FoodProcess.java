package labs_examples.multi_threading.labs;

import java.util.Scanner;

public class FoodProcess {

    public void buy() throws InterruptedException{
        //this is going to run first
        synchronized (this){
            System.out.println("Buy thread running");
            wait();
            System.out.println("Food consumed.");
        }

    }

    public void eat() throws InterruptedException{
        Thread.sleep(500);
        //due to the .sleep this thread is going to run after the first one.
        synchronized (this){
            System.out.println("Eat thread running");
            notify();
        }
    }
}
