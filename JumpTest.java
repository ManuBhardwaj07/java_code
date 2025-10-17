// Interface
interface Jumpable {
    void jump();
}

// Class Car implements Jumpable
class Car implements Jumpable {
    public void jump() {
        System.out.println("Car can jump!");
    }
}

// Class Rabbit implements Jumpable
class Rabbit implements Jumpable {
    public void jump() {
        System.out.println("Rabbit can jump high!");
    }
}

// Main class
public class JumpTest {
    public static void main(String[] args) {
        Car c = new Car();
        Rabbit r = new Rabbit();

        c.jump();
        r.jump();
    }
}
