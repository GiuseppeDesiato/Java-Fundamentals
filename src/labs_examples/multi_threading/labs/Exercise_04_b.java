package labs_examples.multi_threading.labs;

public class Exercise_04_b {

    public static void main(String[] args) {

            //creating PrintNum object.
            PrintNum obj = new PrintNum();

            //creating threads.
            MyThread1 t1=new MyThread1(obj);
            MyThread2 t2=new MyThread2(obj);

            //start threads.
            t1.start();
            t2.start();
        }
}

class PrintNum{

    public void printNum(int n){

        // synchronized block
        synchronized(this){
            System.out.println("Nums multiplied by " + n);

            for(int i = 1; i <= 10; i++){
                System.out.println(n * i);
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread{

    PrintNum pn;

    MyThread1(PrintNum pn){
        this.pn = pn;
    }
    public void run(){
        pn.printNum(2);
    }
}

class MyThread2 extends Thread{

    PrintNum pn;

    MyThread2(PrintNum pn){
        this.pn = pn;
    }
    public void run(){
        pn.printNum(5);
    }
}