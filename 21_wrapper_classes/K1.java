class K1 {
    public static void main(String[] args) {
        byte g = pro();    // works now
        System.out.println(g);
    }   
    
    static byte pro() {
        return (byte)200;   // explicit narrowing cast
    }
}
