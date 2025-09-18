class A{
    public static void main(String[] args) {
        B x = new B();
        x.bbb();
    }
}

class B{
    void bbb() {
        C x = new C();
        x.ccc();
    }
}

class C {
    void ccc() {
        D x = new D();
        x.ddd();
    }

}

class D {
    void ddd() {
        System.out.println(" I'm Manu Bhardwaj");
    }
}