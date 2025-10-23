// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass redefines the start() method
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine is starting with a key...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick or electric start...");
    }
}

// Main class
public class RedefinitionDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start(); // Calls Car's start()
        v2.start(); // Calls Bike's start()
    }
}
