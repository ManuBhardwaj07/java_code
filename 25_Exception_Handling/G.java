import java.io.FileNotFoundException;
import java.io.FileReader;

class G {
    public static void main(String[] args) {
        System.out.println("---- start");    
        try {
            FileReader x = new FileReader("mohan.txt"); 
        } catch(FileNotFoundException e) {
            e.printStackTrace();    
        }
        System.out.println("---- end");    
    }    
}