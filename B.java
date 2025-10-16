abstract class B2 {
    abstract void pro();
}

class B1 extends B2 {
    void pro() {
        System.out.println("Namaskar");
    }
}

class B {
    public static void main(String[] args) {
        //  I2 a = new I2();

        B1 a = new B1();
        a.pro();
    }
}