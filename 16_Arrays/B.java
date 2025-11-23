class B {
    int[] x = {10, 20, 30};

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(java.util.Arrays.toString(obj.x)); // prints array contents
    }
}
// Output: [10, 20, 30]