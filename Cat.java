class Animal {
    void makeSound() {
        System.out.println("Some Random Sound...");
    }
}

class Cat extends Animal {
    // method overriding
    void makeSound() {
        System.out.println("Cat Sound...");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();   // create object of subclass
        obj.makeSound();       // calls overridden method in Cat
    }
}
