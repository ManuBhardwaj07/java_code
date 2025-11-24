class G {
    public static void main(String[] args) {
        System.out.println(args instanceof Object);     // true
        System.out.println(args instanceof String[]);   // true

        System.out.println(args[0] instanceof Object);  // true
        System.out.println(args[0] instanceof String);  // true
    }
}
