class F {
    // Legal Method Overloading (Parameter-Body Must Mismatch by Count)
    void pro(int y) {
        System.out.println("Anshul Shivedi");
    }

    void pro(int y, int z) {
        System.out.println("manu bhardwaj");
    }    

    public static void main(String[] args) {
        F obj = new F();
        obj.pro(10);         // calls pro(int)
        obj.pro(10, 20);     // calls pro(int, int)
    }
}
