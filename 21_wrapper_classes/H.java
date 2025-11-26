class H {
    public static void main(String[] args) {
        pro((byte)2);   // explicit cast
    }   
    
    static void pro(Byte x) {   // wrapper Byte
        System.out.println(x);
    }
}
