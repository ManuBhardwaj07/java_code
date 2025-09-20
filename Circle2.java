class Circle2 {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle2 x = new Circle2(); 
        x.radius = 23;

        Circle2 y = new Circle2();
        y.radius = 34;

        x.calArea();  
        y.calArea();   
    }

    void calArea() {   
        System.out.println(pi * radius * radius);
    }
}
