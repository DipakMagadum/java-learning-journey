class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self start");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with push button");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Vehicle vehicle;

        vehicle = new Bike();
        vehicle.start();

        vehicle = new Car();
        vehicle.start();
    }
}