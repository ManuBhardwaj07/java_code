class D1 {
    void pro(int a, float b) {
        System.out.println("pro(int, float) in Parent class D1");
    }
}

class D extends D1 {
    // method overloading (different parameter sequence)
    void pro(float a, int b) {
        System.out.println("pro(float, int) in Child class D");
    }

    public static void main(String[] args) {
        D obj = new D();

        obj.pro(10, 2.5f);   // calls pro(int, float)
        obj.pro(3.5f, 20);   // calls pro(float, int)
    }
}
