import java.util.ArrayList;

class M1 {
    public static void main(String[] args) {
        ArrayList<Object> x = new ArrayList<>();

        x.add(12);
        x.add("om");
        x.add(true);
        x.add(23.56);

        System.out.println(x);
    }
}

// ArrayList allows heterogeneous records...