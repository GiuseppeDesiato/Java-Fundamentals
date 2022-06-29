package labs_examples.multi_threading;

public class TestRunnable2 {

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

    static class MultiThreading implements Runnable {

        /* 1. Create a reference to Thread */
        Thread thread;

        MultiThreading() {
            //2. Initialize the thread reference with a parameter of 'this'
            //3. Start the thread.
            super();
            thread = new Thread(this, "Hello Multithreading!");
            thread.start();

        }
        // 4.Override the run() method
        @Override
        public void run() {

            //5. Make run() print 'Hello Multithreading 10 times, once every 100ms'
            //6. Catch any InterruptedExceptions
            try {
                for(int count=0; count<10; count++) {
                    // put this thread to sleep for 400 milliseconds
                    Thread.sleep(100);
                    System.out.println(thread.getName());
                }
            }
            // catch the potential exception
            catch(InterruptedException exc) {
                System.out.println(thread.getName() + " interrupted.");
            }

        }
    }
}
