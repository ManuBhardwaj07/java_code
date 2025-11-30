class Animal extends LivingBeing {
    void aaa() {
        System.out.println("aaa() in Animal");
    }
}
class LivingBeing {
    void bbb() {
        System.out.println("bbb() in LivingBeing");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.aaa();
        a.bbb();
    }
}