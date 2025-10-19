interface LivingBeing {
}

class Animal implements LivingBeing {
}

class Dog extends Animal {
}

class BDog extends Dog {
}

class Cat extends Animal {
}

public class F {
    public static void main(String[] args) {
        BDog x = new BDog();

        System.out.println(x instanceof BDog);       // true
        System.out.println(x instanceof Dog);        // true
        System.out.println(x instanceof Animal);     // true
        System.out.println(x instanceof LivingBeing);// true
        System.out.println(x instanceof Object);     // true

        // Uncommenting below line will cause a compile-time error if Cat is unrelated
        // System.out.println(x instanceof Cat);
    }    
}
