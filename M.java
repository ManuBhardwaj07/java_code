// Ingredient classes
class Water { }
class Sugar { }
class TeaLeaves { }
class Milk { }
class Herbs { }

public class M {

    static void prepareBlackTea(Water water, Sugar sugar, TeaLeaves teaLeaves) {
        System.out.println("--- step 1");
        System.out.println("--- step 2");
        System.out.println("--- step 3");
    }    

    static void prepareMilkTea(Water water, Sugar sugar, TeaLeaves teaLeaves, Milk milk) {
        System.out.println("--- step 1");
        System.out.println("--- step 2");
        System.out.println("--- step 3");
        System.out.println("--- step 4");
    }    

    static void prepareHerbTea(Water water, Sugar sugar, Herbs herbs) {
        System.out.println("--- step 1");
        System.out.println("--- step 2");
        System.out.println("--- step 5");
    }    

    public static void main(String[] args) {
        // Creating ingredient objects
        Water water = new Water();
        Sugar sugar = new Sugar();
        TeaLeaves teaLeaves = new TeaLeaves();
        Milk milk = new Milk();
        Herbs herbs = new Herbs();

        // Calling methods
        System.out.println("Preparing Black Tea:");
        prepareBlackTea(water, sugar, teaLeaves);

        System.out.println("\nPreparing Milk Tea:");
        prepareMilkTea(water, sugar, teaLeaves, milk);

        System.out.println("\nPreparing Herb Tea:");
        prepareHerbTea(water, sugar, herbs);
    }
}
