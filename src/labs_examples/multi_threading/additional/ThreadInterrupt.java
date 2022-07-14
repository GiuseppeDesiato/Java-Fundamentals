package labs_examples.multi_threading.additional;

public class ThreadInterrupt {

    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());

        thread.start();
        System.out.println("Starting the thread");

        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}

