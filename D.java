class D {
    public static void main(String[] args) {
        D1 a = new D1();
        a.pro(); //Access through instentiaion
        //D1.pro();  // not ok
    }
    
}
class D1 {
    void pro (){
        System.out.println("Namaste ");
    }
}