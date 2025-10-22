class D {
    // Legal Method Overloading (Parameter-Body Must Mismatch by Type)
    void pro(int y) {
        System.out.println("Hello");
    }

    void pro(byte y) {
        System.out.println("Hi");
    }    

    public static void main(String[] args) {
        D obj = new D();
        obj.pro(10);        // calls pro(int y)
        obj.pro((byte)10);  // calls pro(byte y)
    }
}
