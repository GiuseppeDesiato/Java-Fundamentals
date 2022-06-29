package labs_examples.multi_threading;

public class TestExtendingThread {
    public static void main(String[] args) {

        // Step 1) demonstrate creating a new Thread using the MyThread class below
        MyThread myThread = new MyThread("my thread 1");

        // Step 2) demonstrate creating (and starting) a new Thread using the MyOtherThread class below
        MyOtherThread myOtherThread = new MyOtherThread();
        myOtherThread.setName("my thread 2");
        myOtherThread.start();

    }
}

class MyThread extends Thread {

    public MyThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + getName() + "!");
    }
}

class MyOtherThread extends Thread {

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + getName() + "!");
    }
}

