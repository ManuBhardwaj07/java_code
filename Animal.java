class LivingBeing {
    void makeSound() {
        System.out.println("LivingBeing making some sound...");
    }
}

class Animal extends LivingBeing {
    // method overriding
    void makeSound() {
        System.out.println("Some Random Sound...");
    }

    public static void main(String[] args) {
        Animal obj = new Animal();   // create object of subclass
        obj.makeSound();             // calls overridden method
    }
}
