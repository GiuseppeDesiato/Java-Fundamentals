package labs_examples.multi_threading.pow_num;

public class PowerMain {

    public static void main(String args[]){

        Power obj = new Power();//only one object
        ThreadPow p1 = new ThreadPow(obj);
        ThreadPow p2 = new ThreadPow(obj);


    }
}

