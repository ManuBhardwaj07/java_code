class E {
    public static void main(String[] args) {
        int x = 89;

        String y = String.valueOf(x);      // ✔ correct
        // String y = Integer.toString(x); // also correct

        System.out.println(x + 1);  // numeric addition
        System.out.println(y + 1);  // string concatenation
    }    
}
