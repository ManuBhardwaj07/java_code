class B {
    public static void main(String[] args) {
        bbb();
    }   
    
    static void aaa() {
        ccc();
    } 

    static void bbb() {
        aaa();
    }

    static void ccc() {
        System.out.println("----- start");

        int y = 12/0;

        System.out.println("----- end");
    }
}
