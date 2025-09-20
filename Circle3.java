class Circle3 {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle3 x = new Circle3(); 
        x.radius = 23;

        Circle3 y = new Circle3();
        y.radius = 34;

        Circle3 z = new Circle3();
        z.radius = 52;

         System.out.println(x.radius);
         System.out.println(y.radius);
         System.out.println(z.radius);
         System.out.println(Circle3.pi);

    }
}
