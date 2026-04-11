import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(2);
        x.add(5);
        x.add(9);

        System.out.println(x);
        // x.add(3, 7);
        x.add(3, 7);
        System.out.println(x);
    }
}
