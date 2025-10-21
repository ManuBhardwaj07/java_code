// Base class
class SuperHuman {
    // common properties or methods can be added here
}

// Subclasses
class SpiderMan extends SuperHuman {
}

class ShaktiMan extends SuperHuman {
}

class SuperMan extends SuperHuman {
}

// Main class renamed to E
class E {
    static void inviteForLunch(SuperHuman a) {
        System.out.println("---- step-1");
        System.out.println("---- step-2");
        System.out.println("---- step-3");
        System.out.println("---- step-4");
        System.out.println("---- step-5");
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        SpiderMan x = new SpiderMan();
        inviteForLunch(x);

        ShaktiMan y = new ShaktiMan();
        inviteForLunch(y);

        SuperMan z = new SuperMan();
        inviteForLunch(z);
    }    
}
