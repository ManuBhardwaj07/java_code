class Circle4 {
    int radius ;
    static float pi = 3.14f ;

    public static void main(String[] args) {
        Circle x = new Circle();
        x.radius = 20;
         
        Circle y = new Circle();
        y.radius = 90;
           //defineCircle();
         x.calcAreaCircle();
         y.calcAreaCircle();
    }

    void calcAreaCircle() {
        System.out.println(pi*radius*radius);
    }
    void defineArea(){
        System.out.println("A circle is a round , two- dimentional geometric shape defined as tjhe set of all points in a plane that are equidistant from a given point called the center.");
    }
}