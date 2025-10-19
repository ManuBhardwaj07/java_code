// Grandparent class
class L3 {
    void grandparentMethod() {
        System.out.println("Method in L3 (Grandparent)");
    }
}

// Parent class
class L2 extends L3 {
    void parentMethod() {
        System.out.println("Method in L2 (Parent)");
    }
}

// Child class
class L1 extends L2 {
    void childMethod() {
        System.out.println("Method in L1 (Child)");
    }
}

// Sub-child class
class L extends L1 {
    void subChildMethod() {
        System.out.println("Method in L (Sub-child)");
    }
}

// Main class
public class LDemo {
    public static void main(String[] args) {
        L obj = new L();

        obj.grandparentMethod();  // from L3
        obj.parentMethod();       // from L2
        obj.childMethod();        // from L1
        obj.subChildMethod();     // from L
    }
}
