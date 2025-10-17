interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird can fly!");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane can fly!");
    }
}

public class FlyTest {
    public static void main(String[] args) {
        Flyable b = new Bird();
        Flyable a = new Airplane();

        b.fly();
        a.fly();
    }
}
