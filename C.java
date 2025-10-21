class C1 {
    void pro(int w) {
        System.out.println("pro(int w) in Parent class C1");
    }
}

class C extends C1 {
    // method overloading (different parameter type)
    void pro(byte w) {
        System.out.println("pro(byte w) in Child class C");
    }

    public static void main(String[] args) {
        C obj = new C();

        obj.pro(10);          // calls pro(int w)
        obj.pro((byte) 5);    // calls pro(byte w)
    }
}
