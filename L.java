class L {
    final int y;
    
    L() {
        y = 7;
    }

    public static void main(String[] args) {
        L a = new L();
        System.out.println(a.y);
        L b = new L();
        System.out.println(b.y);
    }
}