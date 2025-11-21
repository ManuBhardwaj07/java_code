class A {
    {
        System.out.println("Instance block running...");
    }

    A() {
        System.out.println("Constructor running...");
    }
}

public class Test {
    public static void main(String[] args) {
        new A();
        new A();
    }
}
