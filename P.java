class P1 {
    final int y = 7;

    final void pro() {
        System.out.println("Hiiiiiiiiii!!!");
    }
}

class P extends P1 { 
    public static void main(String[] args) {
        P1 a = new P1();

        System.out.println(a.y);
        a.pro();
    }
}