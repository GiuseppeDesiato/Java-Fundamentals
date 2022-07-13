package labs_examples.multi_threading.additional;

public class BasicThread3 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new NewThread2());

        thread.setName("Thread Giugia");
        thread.start();

    }

    public static class NewThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("We are in: " + Thread.currentThread().getName());
        }
    }

}
