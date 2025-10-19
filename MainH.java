// Parent class
class H1 {
    void greet() {
        System.out.println("Hello from H1 (Parent class)");
    }
}

// Child class (Single Inheritance)
class H extends H1 {
    void greetChild() {
        System.out.println("Hello from H (Child class)");
    }
}

// Main class to run the program
public class MainH {
    public static void main(String[] args) {
        H child = new H();

        child.greet();       // Method from parent class H1
        child.greetChild();  // Method from child class H
    }
}
