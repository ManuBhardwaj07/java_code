final class F1 {
    int y = 99;

    void pro() {
        System.out.println("Hi");
    }
}

class F {
    public static void main(String[] args) {
        F1 a = new F1();

        System.out.println(a.y);

        a.pro();
    }
}