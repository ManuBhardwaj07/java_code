// Interface 1
interface I1 {
    void method1();
}

// Interface 2
interface I2 {
    void method2();
}

// Class implements multiple interfaces
class I implements I1, I2 {
    public void method1() {
        System.out.println("Method from I1");
    }

    public void method2() {
        System.out.println("Method from I2");
    }
}

// Main class
public class IMain {
    public static void main(String[] args) {
        I obj = new I();

        obj.method1();  // From I1
        obj.method2();  // From I2
    }
}
