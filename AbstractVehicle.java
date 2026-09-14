abstract class Vehicle {
    abstract void start();

    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is started");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is started");
    }
}

public class AbstractVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.display();
        car.start();

        bike.display();
        bike.start();
    }
}
