// Parent class
class K {
    void greet() {
        System.out.println("Hello from parent K");
    }
}

// Child class 1
class K1 extends K {
    void greetK1() {
        System.out.println("Hello from child K1");
    }
}

// Child class 2
class K2 extends K {
    void greetK2() {
        System.out.println("Hello from child K2");
    }
}

// Child class 3
class K3 extends K {
    void greetK3() {
        System.out.println("Hello from child K3");
    }
}

// Main class
public class KDemo {
    public static void main(String[] args) {
        K1 obj1 = new K1();
        K2 obj2 = new K2();
        K3 obj3 = new K3();

        obj1.greet();     // Parent method
        obj1.greetK1();   // Child1 method

        obj2.greet();     // Parent method
        obj2.greetK2();   // Child2 method

        obj3.greet();     // Parent method
        obj3.greetK3();   // Child3 method
    }
}
