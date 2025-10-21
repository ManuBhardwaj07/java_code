class I1 {
    float pro() {
        System.out.println("pro() in Parent class I1");
        return 8.9f;
    }    
}

class I extends I1 {
    // legal method overriding
    float pro() {
        System.out.println("pro() in Child class I");
        return 1.1f;
    }

    public static void main(String[] args) {
        I obj = new I();
        float result = obj.pro();  // calls overridden method in child
        System.out.println("Returned value: " + result);
    }
}
