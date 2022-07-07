package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06 {

    public static void main(String[] args) {
        Print100 obj = new Print100();

        PrintThread_01 p_01 = new PrintThread_01("t1: ", obj);
        PrintThread_02 p_02 = new PrintThread_02("t2: ", obj);

        p_01.start();
        p_02.start();

        try {
            p_01.join();
            p_02.join();
        } catch(Exception e) {
            System.out.println("Interrupted");
        }
    }
}


class Print100 {

    public synchronized void print100(String msg) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(msg + i);
            try {
                Thread.sleep(50);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


class PrintThread_01 extends Thread {
    private Thread t;
    Print100 p100;
    String msg = " ";

    PrintThread_01(String msg, Print100 p100){
        this.msg = msg;
        this.p100 = p100;
    }

    @Override
    public void run() {
        synchronized (p100) {
            p100.print100(msg);
            try {
                p100.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
    }
}

class PrintThread_02 extends Thread {
    private Thread t;
    Print100 p100;
    String msg = " ";

    PrintThread_02(String msg, Print100 p100){
        this.msg = msg;
        this.p100 = p100;
    }

    @Override
    public void run() {
        synchronized (p100) {
            p100.print100(msg);
            try {
                p100.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        notifyAll();
    }
}