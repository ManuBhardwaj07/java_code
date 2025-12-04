class D {
    public static void main(String[] args) {
        System.out.println("----- start");

        try {
            // explicitly throw an ArithmeticException to demonstrate handling
            throw new ArithmeticException("Explicit arithmetic error");
        } catch (ArithmeticException e) {
            // show the exception message and stack trace (two common handling styles)
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("----- finally");
        }

        System.out.println("----- end");
    }
}