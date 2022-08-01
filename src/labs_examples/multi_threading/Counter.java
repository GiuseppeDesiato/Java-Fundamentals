package labs_examples.multi_threading;

public class Counter {

    int count;
    public synchronized void increment(){
        count++;
    }

}
