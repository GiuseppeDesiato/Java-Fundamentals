package labs_examples.multi_threading.pow_num;

public class ThreadPow implements Runnable{

    Thread thread;
    private Power power;

    public ThreadPow(Power power) {
        this.power = power;
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }
}
