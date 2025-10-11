final class G1 {
    static int t = 4;
}

class G {
    public static void main(String[] args) {
        System.out.println(G1.t);

        G1.t = 43;

        System.out.println(G1.t);
    }
}              
