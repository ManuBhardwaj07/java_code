class A {
    void pro() {
        System.out.println("Hello");
    }

    void pro(String msg) {    // different parameter → overloading
        System.out.println("Hi " + msg +"manu bhardwaj");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.pro();             // calls pro() without parameter
        obj.pro("there");      // calls overloaded pro(String)
    }
}
