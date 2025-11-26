class L {
    public static void main(String[] args) {
        byte x = pro();   // autounboxing works
        System.out.println(x);
    }   
    
    static Byte pro() {
        int a = 2;
        return (byte)a;   // explicit cast required
    }
}
