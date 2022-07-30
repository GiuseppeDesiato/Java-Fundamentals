package labs_examples.multi_threading;

public class CounterThread extends Thread {

    Counter counter = null;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
        }
    }
}
