class J {
    final int y;

    J() {             // Constructor 1 (default)
        y = 9;
    }

    J(int a) {        // Constructor 2 (with int)
        y = 23;
    }

    J(String b) {         //Constructor 3 (with String)
        y = 123;  
    }


    void show() {
        System.out.println("Value of y = " + y);
    }

    public static void main(String[] args) {
        J obj1 = new J();
        obj1.show();

        J obj2 = new J( 50);
        obj2.show();

        J obj3 = new J("manu");
        obj3.show();
    }
}
