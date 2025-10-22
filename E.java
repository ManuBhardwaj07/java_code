class E {
    // Legal Method Overloading (Parameter-Body Must Mismatch: Sequence)
    void pro(int y, float z) {
        System.out.println("Namaskar");
    }

    void pro(float y, int z) {
        System.out.println("Namaste");
    }    

    public static void main(String[] args) {
        E obj = new E();
        obj.pro(10, 5.5f);    // calls pro(int, float)
        obj.pro(5.5f, 10);    // calls pro(float, int)
    }
}
