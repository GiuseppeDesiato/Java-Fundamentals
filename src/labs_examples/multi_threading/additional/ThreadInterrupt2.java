package labs_examples.multi_threading.additional;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class ThreadInterrupt2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationClass(new BigInteger("2"), new BigInteger("10")));

        thread.start();

        //in case of very large number we should interrupt the thread
        //thread.interrupt();
    }

    private static class LongComputationClass implements Runnable {

        private BigInteger base;
        private BigInteger power;

        public LongComputationClass(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow(base, power));
        }


        private BigInteger pow(BigInteger base, BigInteger power){
            BigInteger result = BigInteger.ONE;

            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)){
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("Prematurely interrupted computation");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }
            return result;
        }
    }
}


