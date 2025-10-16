// Abstract class
abstract class Animal {
    // Abstract method 
    abstract void sound();

    // Non-abstract method 
    void sleep() {
        System.out.println("Animals sleep...");
    }
}

// Subclass (inheriting from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Dog barks 🐶");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // 
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
