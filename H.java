// Superhero classes
class SpiderMan {
    // you can add more features later
}

class ShaktiMan {
    // you can add more features later
}

class SuperMan {
    // you can add more features later
}

// Main class with overloaded methods
class H {
    static void inviteForLunch(SpiderMan a) {
        System.out.println("---- step-1");
        System.out.println("---- step-2");
        System.out.println("---- step-3");
        System.out.println("---- step-4");
        System.out.println("---- step-5");
        System.out.println("**********************");
    }

    static void inviteForLunch(ShaktiMan x) {
        System.out.println("---- step-1");
        System.out.println("---- step-2");
        System.out.println("---- step-3");
        System.out.println("---- step-4");
        System.out.println("---- step-5");
        System.out.println("***********----***********");
    }

    static void inviteForLunch(SuperMan x) {
        System.out.println("---- step-1");
        System.out.println("---- step-2");
        System.out.println("---- step-3");
        System.out.println("---- step-4");
        System.out.println("---- step-5");       
        System.out.println("***********^^^^***********");
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
