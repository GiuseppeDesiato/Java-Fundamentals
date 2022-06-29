package labs_examples.multi_threading;

public class TestExtendingThread2 {

    public static void main(String[] args) {

        MultiThreading multiThreading = new MultiThreading();

    }

    /**
     * Implement the Runnable interface
     *
     * Methods to use:
     *
     * super();
     * start();
     * Thread.sleep();
     *
     */

    static class MultiThreading extends Thread {

        // Constructor
        MultiThreading() {
            // 1. Call the constructor in the parent class
            super("Hello MultiThreading!");
            // 2. Start the thread
            start();

        }

        // 3. Override the "public void run()" method from the parent Thread class
        // 4. Print "Hello MultiThreading!" every 200 ms, 5 times.
        // 5. Catch any InterrupedExceptions.
        @Override
        public void run(){
            try {
                for(int count=0; count<5; count++) {
                    // put this thread to sleep for 400 milliseconds
                    Thread.sleep(200);
                    System.out.println(getName());
                }
            }
            // catch the potential exception
            catch(InterruptedException exc) {
                System.out.println(getName() + " interrupted.");
            }
        }

    }
}
