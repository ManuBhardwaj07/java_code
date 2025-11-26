class J {
    public static void main(String[] args) {
        pro((char)2); // explicitly calling the Character (via autoboxing) example
        pro(Character.valueOf((char)65)); // explicit Character
    }

    static void pro(Character x) {
        System.out.println("Character method: " + x);
    }

    static void pro(char x) {
        System.out.println("char method: " + x);
    }
}
