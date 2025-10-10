final class E1 {
    static int y = 2;

    static void pro() {
        System.out.println("Hello");
    }
}

class E {
    public static void main(String[] args) {
        System.out.println(E1.y);

        E1.pro();
    }
}