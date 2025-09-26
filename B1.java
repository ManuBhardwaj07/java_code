import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class B1 {
    static File a;
    static Date b;
    static DateFormat c;
    static ArrayList<String> d;

    public static void main(String[] args) {
        
        a = new File("test.txt");  
        b = new Date();             
        c = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
        d = new ArrayList<>();     
     
        System.out.println("File path: ");
        System.out.println("Current Date: ");
        System.out.println("Formatted Date: ");
        System.out.println("ArrayList contents: ");
    }
}