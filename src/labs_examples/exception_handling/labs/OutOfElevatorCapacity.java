package labs_examples.exception_handling.labs;

public class OutOfElevatorCapacity extends Exception{

    @Override
    public String toString() {
        return "Cannot operate. \n" +
                "There are two many people on this elevator. Max 6 people per ride.";
    }
}
