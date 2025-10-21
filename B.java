class B1 {
    void pro() {
        System.out.println("pro() in Parent class B1");
    }
}

class B extends B1 {
    // method overloading (different parameter list)
    void pro(int x) {
        System.out.println("pro(int x) in Child class B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.pro();      // calls parent class method
        obj.pro(10);    // calls overloaded method in child
    }
}
