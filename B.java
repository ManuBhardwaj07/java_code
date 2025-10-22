class B {
    void pro(int x) {
        System.out.println("Integer: " + x);
    }

    void pro(double x) {
        System.out.println("Double: " + x);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.pro(10);       // calls int version
        obj.pro(5.5);      // calls double version
    }
}
