// Ingredient classes
class Water { }
class Sugar { }
class TeaLeaves { }
class Milk { }
class Herbs { }

public class L {

    // Overloaded methods — all named prepareTea
    static void prepareTea(Water water, Sugar sugar, TeaLeaves teaLeaves) {
        System.out.println("--- step 1");
        System.out.println("--- step 2");
        System.out.println("--- step 3");
    }    

    static void prepareTea(Water water, Sugar sugar, TeaLeaves teaLeaves, Milk milk) {
        System.out.println("--- step 1");
        System.out.println("--- step 2");
        System.out.println("--- step 3");
        System.out.println("--- step 4");
    }    

    static void prepareTea(Water water, Sugar sugar, Herbs herbs) {
        System.out.println("--- step 1");
        System.out.println("--- step 2");
        System.out.println("--- step 5");
    }    

    public static void main(String[] args) {
        // Create ingredient objects
        Water water = new Water();
        Sugar sugar = new Sugar();
        TeaLeaves teaLeaves = new TeaLeaves();
        Milk milk = new Milk();
        Herbs herbs = new Herbs();

        // Calling overloaded methods
        System.out.println("Preparing Black Tea:");
        prepareTea(water, sugar, teaLeaves);

        System.out.println("\nPreparing Milk Tea:");
        prepareTea(water, sugar, teaLeaves, milk);

        System.out.println("\nPreparing Herb Tea:");
        prepareTea(water, sugar, herbs);
    }
}
