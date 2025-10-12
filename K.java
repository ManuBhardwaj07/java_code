class K {
    final static int y;
    
    // static initialization block
    static {
        y = 89;
    }

    public static void main(String[] args) {
        System.out.println(y);
    }
}
