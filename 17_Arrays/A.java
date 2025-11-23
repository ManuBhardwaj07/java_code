class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class A {
    public static void main(String[] args) {
        Animal[] y = new Animal[2];

        y[0] = new Dog(); // ✅ ok
        y[1] = new Cat(); // ✅ ok
        System.out.println("No exception!");
    }
}
