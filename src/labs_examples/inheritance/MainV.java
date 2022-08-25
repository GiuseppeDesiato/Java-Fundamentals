package labs_examples.inheritance;

public class MainV {

    public static void main(String[] args) {

        Car_1 car_1 = new Car_1(160, 220, "01-01-2022", "hyunday");
        Moto_1 moto_1 = new Moto_1(250, 300, "03-03-2021", 48);

        car_1.setCurrentSpeed(178.89);
        car_1.setMaxSpeed(230.10);
        double leftSpeed = car_1.leftRange(car_1.getCurrentSpeed(), car_1.getMaxSpeed());
        System.out.println(leftSpeed);

    }
}
