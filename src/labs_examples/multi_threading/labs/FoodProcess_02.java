package labs_examples.multi_threading.labs;

public class FoodProcess_02 {

    // Added this to control when we can eat
    // true is we've bought food, false if we need to buy food
    private boolean foodBought = false;

    public void buy(){
        //this is going to run first
        // Because foodBought == false
        synchronized (this) {

            // Added this to control when we can eat
            while (foodBought) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Current thread interrupted");
                }
            }
            // We bought food, so say so and set the flag
            System.out.println("Food bought.");
            foodBought = true;
            // Wake everyone else up
            notifyAll();
        }
    }

    public void eat(){
//        Thread.sleep(500);
        //due to the .sleep this thread is going to run after the first one.
        // Actually no, we don't need to sleep at all - that's why we have synchronization
        synchronized (this) {
            while (!foodBought) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }

            // We can eat, so say so and set the flag
            System.out.println("Eating...");
            foodBought = false;
            // Wake everyone up again
            notifyAll();
        }
    }
}
