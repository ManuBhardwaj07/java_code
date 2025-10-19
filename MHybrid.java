// Base class
class M2 {
    void baseMethod() {
        System.out.println("Method in M2 (Base class)");
    }
}

// Interface
interface M3 {
    void interfaceMethod();
}

// Class extending M2 and implementing M3
class M1 extends M2 implements M3 {
    public void interfaceMethod() {
        System.out.println("Method from M3 (Interface) in M1");
    }
    
    void m1Method() {
        System.out.println("Method in M1");
    }
}

// Class extending M1
class M extends M1 {
    void mMethod() {
        System.out.println("Method in M");
    }
}

// Classes extending M
class M4 extends M {
    void m4Method() {
        System.out.println("Method in M4");
    }
}

class M5 extends M {
    void m5Method() {
        System.out.println("Method in M5");
    }
}

// Main class
public class MHybrid {
    public static void main(String[] args) {
        M4 obj4 = new M4();
        M5 obj5 = new M5();

        // Accessing methods via M4
        obj4.baseMethod();         // from M2
        obj4.interfaceMethod();    // from M3
        obj4.m1Method();           // from M1
        obj4.mMethod();            // from M
        obj4.m4Method();           // from M4

        System.out.println();

        // Accessing methods via M5
        obj5.baseMethod();         // from M2
        obj5.interfaceMethod();    // from M3
        obj5.m1Method();           // from M1
        obj5.mMethod();            // from M
        obj5.m5Method();           // from M5
    }
}
