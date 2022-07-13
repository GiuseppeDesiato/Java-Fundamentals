package labs_examples.multi_threading.additional;

public class BasicThread2 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new NewThread();

        thread.setName("Thread Gigio");
        thread.start();

    }

    public static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("We are in: " + this.getName());
        }
    }
}
