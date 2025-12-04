class V {
    public static void main(String[] args) {
        try {
            int y = 12 / 0;
        } catch(ArithmeticException e) {
            throw new NullPointerException();
        } finally {
            throw new ClassCastException();
        }
    }    
}
