class M {
    final int y;
    
    M(int q) {
        y = q;
    }

    public static void main(String[] args) {
        M a = new M(7);
        System.out.println(a.y);
        M b = new M(11);
        System.out.println(b.y);
        M c = new M(19);
        System.out.println(c.y);
    }
}