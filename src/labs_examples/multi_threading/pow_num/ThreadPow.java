package labs_examples.multi_threading.pow_num;

public class ThreadPow implements Runnable{

    Thread thread;
    private Power power;

    public ThreadPow(Power power) {
        this.power = power;
        thread = new Thread("t1");
        thread.start();
    }

    @Override
    public void run(){
        power.printPower(4);
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }
}
