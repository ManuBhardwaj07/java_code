class B1 { 
    public static void main(String[] args) {
        B obj = new B();
        obj.pro();
        obj.info();
        obj.display();
    }
    void pro() {
        System.out.println("pro() in Parent B1");
    }

    final void info() {
        System.out.println("info() in Parent B1");
    }
    void display(){
        System.out.println("display() I'm Mohit bhardwaj");
    }
}


class B extends B1 {
    void pro() {
        System.out.println("pro() in Child class B");
    }

    // void info() {
    //     System.out.println("info() in Child class D");
    // }

    void display(){
        System.out.println("display() I'm Manu bhardwaj");
    }
}
