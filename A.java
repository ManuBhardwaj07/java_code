class A1 {
    void pro() {
        System.out.println("pro() in Parent class A1");
    }
}

class A extends A1 {
    // method overriding
    void pro() {
        System.out.println("pro() in Child class A");
    }

    public static void main(String[] args) {
        A obj = new A();      // create object of child class
        obj.pro();            // calls overridden method in child
    }
}
