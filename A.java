class A {
    // Instance variable
    String abc;

    // Constructor
    A() {
        abc = "Hello, I am abc!";
    }

    // Method
    void mno() {
        System.out.println("mno() method called");
    }

    public static void main(String[] args) {
        A x = new A();

        // Accessing instance variable
        System.out.println(x.abc);

        // Calling method
        x.mno();
    }
}
