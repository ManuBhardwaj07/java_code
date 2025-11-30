class G {
    public static void main(String[] args) {
        Animal x = new Cat();
        // Widenning Conversion... Type-Casting Not required...

        System.out.println(x);
    }    
}
class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat instance";
    }
}