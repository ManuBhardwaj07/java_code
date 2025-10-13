class O1 {
    final int y = 11;

    final void pro() {
        System.out.println("Hi");
    }
}

class O {
    public static void main(String[] args) {
        O1 a = new O1();

        System.out.println(a.y);
        a.pro();
    }    
}