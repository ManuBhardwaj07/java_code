import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class H {
    public static void main(String[] args) {
        System.out.println("main start");
        aaa();
        System.out.println("main end");
    }
    
    static void aaa() {
        System.out.println("aaa start");
        bbb();
        System.out.println("aaa end");
    }
    
    static void bbb() {
        System.out.println("bbb start");
        ccc();
        System.out.println("bbb end");
    }
    
    static void ccc() {
        System.out.println("ccc start");
        try (FileReader x = new FileReader("Bablu.txt")) {
            // resource opened; no read needed for this example
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
        System.out.println("ccc end");
    }
}
