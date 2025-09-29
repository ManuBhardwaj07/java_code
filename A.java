class A1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.pro();
        obj.info();
        obj.abc(); 
    }
    void pro() {
        System.out.println("pro() in Parent C1");
    }

    void info() {
        System.out.println("info() in Parent C1");
    }
    void abc(){
        System.out.println("abc() in Parent C1");
    }
}

class A extends A1 {
    void pro() {
        System.out.println("pro() in Child class C");
    }

    void info() {
        System.out.println("info() in Child class C");
    }
     void abc(){
        System.out.println("abc() in child class C1");
    }
}