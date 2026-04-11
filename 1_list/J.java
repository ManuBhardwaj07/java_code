import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");
        x.add("yamraj");

        for(String str : x) {
            System.out.println(str.toUpperCase());
        }
    }
}