// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }
}

// Main class (file name should match this class name)
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();  // Upcasting
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
