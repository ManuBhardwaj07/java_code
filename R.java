class R1 {
    final static int y = 123;

    static final void pro() {
        System.out.println("Manu bhardwaj");
    }
}

class R extends R1 {
    public static void main(String[] args) {
        System.out.println(R1.y);

        R.pro();
    }
}