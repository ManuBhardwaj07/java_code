class B {
    public static void main(String[] args) {
        try {
            int[] x = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative");
        }

        try {
            int[] y = new int[2];
            System.out.println(y[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access");
        }
    }
}
