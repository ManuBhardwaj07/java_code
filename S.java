class S {
    void pro() {
        final int x;

        x = 11;

        System.out.println(x);
    }

    public static void main(String[] args) {
        S a = new S();

        a.pro();
    }    
}