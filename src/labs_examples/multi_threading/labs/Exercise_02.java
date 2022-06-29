package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {

    public static void main(String[] args) {

        ExtThread extThread = new ExtThread();
    }

    static class ExtThread extends Thread {

        ExtThread(){
            super("I am creating a Thread using the Thread class");
            start();
        }

        @Override
        public void run() {
            try {
                for (int count = 0; count < 3; count++) {
                    Thread.sleep(500);
                    System.out.println(getName());
                }
            }

            catch (InterruptedException exc) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}