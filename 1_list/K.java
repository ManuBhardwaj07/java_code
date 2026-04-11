import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("hitesh");
        x.add("ritesh");
        x.add("gitesh");
        x.add("mitesh");
        x.add("kitesh");
        x.add("dharamraj");

        for(Object str : x) {
        String s = (String)str;
        System.out.println(s.toUpperCase());
        }
    }
}