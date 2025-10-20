// Base class
class Vehicle {
    // Vehicle properties or methods (optional)
}

// Car inherits from Vehicle
class Car extends Vehicle {
    // Car properties or methods (optional)
}

// SportsCar inherits from Car
class SportsCar extends Car {
    // SportsCar properties or methods (optional)
}

// First main class
class H {
    public static void main(String[] args) {
        SportsCar x = new SportsCar();

        System.out.println(x instanceof SportsCar); // true
        System.out.println(x instanceof Car);       // true
        System.out.println(x instanceof Vehicle);   // true
        System.out.println(x instanceof Object);    // true
    }    
}


