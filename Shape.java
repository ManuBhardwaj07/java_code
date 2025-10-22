public class Shape {
    int l;
    int h;
    int w;
    
    // Constructor Overloading examples
    Shape(int l) { 
        this.l = l;
        System.out.println("85");
    }   
    
    Shape(int l, int w) {
        this.l = l;
        this.w = w;
        System.out.println("25");
    }

    Shape(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println("52");
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Shape s1 = new Shape(10);
        Shape s2 = new Shape(10, 20);
        Shape s3 = new Shape(10, 20, 30);
    }
}
