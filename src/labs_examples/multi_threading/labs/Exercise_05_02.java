package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05_02 {

    public static void main(String[] args) throws InterruptedException {

        // We need one new FoodProcess for both threads
        // We only need one to synchronize on.
        FoodProcess_02 foodProcess = new FoodProcess_02();

        // Create our buyer and eater threads
        // Pass in the FoodBuyer object we created so they can sync
        FoodBuyer t1 = new FoodBuyer(foodProcess);
        t1.thread = new Thread(t1, "Buy");
        t1.thread.start();

        FoodEater t2 = new FoodEater(foodProcess);
        t2.thread = new Thread(t2, "Eat");
        t2.thread.start();

        /*
        These are unnecessary, but harmless
        t1.thread.join();
        t2.thread.join();
         */

    }
}

// Renaming this to something more meaningful
//class RunT_01 implements Runnable {
class FoodBuyer implements Runnable {
    Thread thread;
    // We don't create a new object here -- it will be passed in
    // We just need a placeholder for it
    private FoodProcess_02 foodProcess;

    // Need to know when to stop buying food
    // Without this, we'll run forever.
    static int foodToBuy = 5;

    // We need a constructor to store the FoodBuyer
    public FoodBuyer(FoodProcess_02 foodProcess) {
        this.foodProcess = foodProcess;
    }

    @Override
    public void run() {
        // Only run for as much food as we need to buy
        while (foodToBuy > 0) {
            foodProcess.buy();
            foodToBuy -= 1;
        }
    }
}

// Renaming
//class RunT_02 implements Runnable {
class FoodEater implements Runnable {
    Thread thread;

    //Again, we'll pass this in
    private FoodProcess_02 foodProcess;

    private static int food = 0;

    public FoodEater(FoodProcess_02 foodProcess) {
        this.foodProcess = foodProcess;
    }

    @Override
    public void run() {
        // We need to know when to stop eating food
        // Otherwise the thread will never end
        while (food < 5) {
            foodProcess.eat();
            food += 1;
        }
    }
}