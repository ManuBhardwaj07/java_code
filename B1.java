class B1 {
    // Legal Method Overloading (Parameter-Body Must Mismatch: Count, Sequence or Type)
    void pro() {
        System.out.println("Hello");
    }

    void pro(int y) {
        System.out.println("Hi " + "Manu bhardwaj");
    }

    public static void main(String[] args) {
        B1 obj = new B1();
        obj.pro();       // calls pro() with no parameters
        obj.pro(10);     // calls pro(int y)
    }
}
