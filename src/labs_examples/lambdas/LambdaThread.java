package labs_examples.lambdas;

public class LambdaThread {

    public static void main(String[] args) {

        LThread();

    }

    public static void LThread() {
        Runnable runnable = () -> {
            for(int i = 0; i < 10; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread number: " + i);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        }

    }
