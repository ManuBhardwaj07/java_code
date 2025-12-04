import java.io.EOFException;
import java.io.FileNotFoundException;

class Y {
    public static void main(String[] args) throws FileNotFoundException, EOFException {
        if(12 < 13) {
            throw new FileNotFoundException();
        }

        throw new EOFException();
    }    
}


//              -----------IOException  (Parent)-------------
//                   ^                              ^ 
//                  /                                \
// FileNotFoundException (Child)                    EOFException