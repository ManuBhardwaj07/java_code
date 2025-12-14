class C {
    public static void main(String[] args) {
        C2.bbb();
    }   
}

class C1 {
    static void aaa() {
        C3.ccc();
    } 
}
    
class C2 {
    static void bbb() {
        C1.aaa();
    }
}

class C3 {
    static void ccc() {
        System.out.println("----- start");

        int y = 12/0;

        System.out.println("----- end");
    }
}
