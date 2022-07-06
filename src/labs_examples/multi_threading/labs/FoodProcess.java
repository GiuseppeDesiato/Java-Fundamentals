package labs_examples.multi_threading.labs;

import java.util.Scanner;

public class FoodProcess {

    public synchronized void buy() throws InterruptedException{
        //this is going to run first
            System.out.println("Buy thread running");
            wait();
            System.out.println("Food consumed.");

    }

    public synchronized void eat() throws InterruptedException{
        Thread.sleep(500);
        //due to the .sleep this thread is going to run after the first one.
            System.out.println("Eat thread running");
            notifyAll();
    }
}
