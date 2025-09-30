class C {
     final int y;
        C() {
            y = 10;
        }
public static void main(String[] args) {
        C obj = new C();
        obj.pro();
    }
    void pro() {
        System.out.println(y);
       
    }
}