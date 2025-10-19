class AA {
    void walk() {
        System.out.println("I can Walk");
    }
}

class BB extends AA {
    void talk() {
        System.out.println("I can Talk");
    }
}

class CC extends BB {
    void laugh() {
        System.out.println("I can Laugh");
    }
}

class G extends CC {
    public static void main(String[] args) {
        G x = new G();   // Object of G, inherits everything

        x.walk();   // from AA
        x.talk();   // from BB
        x.laugh();  // from CC
    }
}
