class Circle5 {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle5 x = new Circle5();
        x.radius = 10;
        
        Circle5 y = new Circle5();
        y.radius = 100;

        x.calcArea();
        y.calcArea();
    
        defineCircle();

        System.out.println(x.getPi());
        System.out.println(y.getPi());
    }
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }    
    
    static void defineCircle(){
        System.out.println("A circle is a round, two-dimensional geometric shape defined as the set of all points in a plane that are equidistant from a fixed central point");
    }    

    float getPi() {
        return pi;
    }
}
