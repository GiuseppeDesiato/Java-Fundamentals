package labs_examples.oop.inheritance;

import sun.security.rsa.RSASignature;

public class CarController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F150", 120000, 150);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);

        Motorcycle moto = new Motorcycle("Ducati", "Monster", 500, 1000, false);


        System.out.println(truck.getMake()  + " " + truck.getModel()
        + " " + truck.getBedCapacity());
        truck.accelerate(10);

        System.out.println(sedan.getMake() + " " + sedan.getModel() +
                " " + sedan.getTrunkCapacity());
        sedan.accelerate(30);

        System.out.println(moto.getMake() + " " + moto.getModel() +
                " " + moto.getCc());
        moto.accelerate(80);

    }
}
