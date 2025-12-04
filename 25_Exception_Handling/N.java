import java.io.FileNotFoundException;
import java.io.FileReader;

class N1 {
    N1() throws FileNotFoundException {
        System.out.println("N1() start");        
        FileReader x = new FileReader("Bablu.txt");
        System.out.println("N1() end");        
    }
}

public class N extends N1 {
    N() throws FileNotFoundException {
        super();
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main() start");        
        N a = new N();
        System.out.println("main() end");
    }
}