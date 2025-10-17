// Interface
interface Jumpable {
    void jump();
}

// Base class Vehicle
class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving.");
    }
}

// SportsCar extends Vehicle and implements Jumpable
class SportsCar extends Vehicle implements Jumpable {
    public void jump() {
        System.out.println("SportsCar can jump over obstacles!");
    }
}

// Base class Toy
class Toy {
    void play() {
        System.out.println("Playing with toy.");
    }
}

// Ball extends Toy and implements Jumpable
class Ball extends Toy implements Jumpable {
    public void jump() {
        System.out.println("Ball can bounce!");
    }
}

// Base class Animal
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Rabbit extends Animal and implements Jumpable
class Rabbit extends Animal implements Jumpable {
    public void jump() {
        System.out.println("Rabbit can jump high!");
    }
}

// Public class with main method
public class JumpDemo {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        Ball b = new Ball();
        Rabbit r = new Rabbit();

        sc.drive();
        sc.jump();

        b.play();
        b.jump();

        r.eat();
        r.jump();
    }
}
