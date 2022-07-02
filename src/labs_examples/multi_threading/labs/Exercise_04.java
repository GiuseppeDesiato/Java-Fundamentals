package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */


public class Exercise_04 {

    public static void main(String[] args) {
        Sync obj = new Sync();

        // two threads which share same objects
        Run_01 r01 = new Run_01(obj);
        Run_01 r02 = new Run_01(obj);

        r01.start();
        r02.start();

    }

    static class Sync{

        //method synchronization
        synchronized public void getObj() {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(200);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    static class Run_01 extends Thread {

        Sync sync;

        Run_01(Sync sync){
            this.sync = sync;
        }

        @Override
        public void run(){
            sync.getObj();
        }
    }
}
