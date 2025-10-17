// Parent class
class Human {
    void eat() {
        System.out.println("Human eats food.");
    }
}

// First interface
interface Intelligent {
    void think();
}

// Second interface
interface Smart {
    void communicate();
}

// Child class that extends Human and implements two interfaces
class American extends Human implements Smart, Intelligent {
    public void think() {
        System.out.println("American thinks creatively.");
    }

    public void communicate() {
        System.out.println("American communicates confidently.");
    }
}

// Public class with main method
public class Test {
    public static void main(String[] args) {
        American a = new American();
        a.eat();          // from Human class
        a.think();        // from Intelligent interface
        a.communicate();  // from Smart interface
    }
}
