interface Eatable {
    void eat();
}

class Apple implements Eatable {
    public void eat() {
        System.out.println("Eating Apple");
    }
}

class Banana implements Eatable {
    public void eat() {
        System.out.println("drinking pepsi");
    }
}

public class EatTest {
    public static void main(String[] args) {
        Eatable a1 = new Apple();
        Eatable b1 = new Banana();

        a1.eat();
        b1.eat();
    }
}
