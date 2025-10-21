class Animal {
    // base class
}

class K1 {
    Animal pro() {
        System.out.println("pro() in Parent class K1");
        return new Animal();
    }    
}

// ✅ Legal overriding — return type is the same (Animal)
class K extends K1 {
    Animal pro() {
        System.out.println("pro() in Child class K");
        return new Animal();
    }

    public static void main(String[] args) {
        K obj = new K();
        obj.pro();
    }
}
