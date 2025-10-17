interface LivingBeing {
    void breathe();
    void grow();
}

// Implementing interface in Human class
class Human implements LivingBeing {
    public void breathe() {
        System.out.println("Human breathes through lungs.");
    }

    public void grow() {
        System.out.println("Human grows by eating food.");
    }
}

// Implementing interface in Plant class
class Plant implements LivingBeing {
    public void breathe() {
        System.out.println("Plant breathes through stomata.");
    }

    public void grow() {
        System.out.println("Plant grows using sunlight and water.");
    }
}

// Machine does NOT implement LivingBeing — different behavior
class Machine {
    void operate() {
        System.out.println("Machine operates using electricity.");
    }
}

// Animal also implements LivingBeing
class Animal implements LivingBeing {
    public void breathe() {
        System.out.println("Animal breathes through lungs or gills.");
    }

    public void grow() {
        System.out.println("Animal grows by eating food.");
    }
}

// ✅ Only one public class (same name as filename)
public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Plant p = new Plant();
        Machine m = new Machine();
        Animal a = new Animal();

        h.breathe();
        p.grow();
        m.operate();
        a.breathe();
    }
}
