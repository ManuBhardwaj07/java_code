class Animal {
    void makeSound() {
        System.out.println("Some random animal sound...");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Sound...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Sound...");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow Sound...");
    }
}

class Y {
    static void playSound(Cat cat) {
        cat.makeSound();
    }   

    static void playSound(Dog dog) {
        dog.makeSound();
    }

    static void playSound(Cow cow) {
        cow.makeSound();
    }
    
    public static void main(String[] args) {
        Cat cat  = new Cat();
        Dog dog  = new Dog();
        Cow cow  = new Cow();

        playSound(cat);
        playSound(dog);
        playSound(cow);
    }
}
