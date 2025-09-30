final class D1 {
        int y = 50;
      D1 () {
            System.out.println("Constructor of D1");
        }
}

class D {
    public static void main(String[] args) {
        D1 x = new D1();
    }
    void pro() {
        D1 obj = new D1();
        System.out.println(obj.y);
    }
}
  