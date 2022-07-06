package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Exercise_06 {

    public static void main(String[] args) throws InterruptedException {
        Print100 obj = new Print100();

        PrintThread_01 printThread_01 = new PrintThread_01(obj);
        PrintThread_02 printThread_02 = new PrintThread_02(obj);

        printThread_01.start();
        printThread_02.start();

        printThread_01.join();
        printThread_02.join();

        }
    }

class Print100{

    public void print100(){
        // synchronized block
        synchronized(this){

            for(int i = 1; i <= 100; i++){
                System.out.println(i);
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

class PrintThread_01 extends Thread {
    Print100 p100;

    PrintThread_01(Print100 p100){
        this.p100 = p100;
    }

    @Override
    public void run() {
        p100.print100();

    }
}

class PrintThread_02 extends Thread {
    Print100 p100;

    PrintThread_02(Print100 p100){
        this.p100 = p100;
    }

    @Override
    public void run() {
        p100.print100();

    }
}