class A {
    public static void main(String[] args) {
        String x = new String("mohan");
        String y = new String("mohan");

        System.out.println(x == y);
    }
}

 // output : false
// Explanation: In class A, two different String objects are created using the 'new' keyword