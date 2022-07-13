package labs_examples.multi_threading.additional;

import java.sql.SQLOutput;

public class BasicThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in: " + Thread.currentThread().getName());
                System.out.println("Current thread priority is set to: " + Thread.currentThread().getPriority());
            }
        });
        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Before starting the thread, we are in thread: " +  Thread.currentThread().getName());

        Thread.sleep(500);
        System.out.println("The new thread will start now.");

        Thread.sleep(500);
        thread.start();

    }


}
