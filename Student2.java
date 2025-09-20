   class  Student2 {
    String name;
    int age;
    static int maxAge = 20;
  
    public static void main(String[] args) {
        Student2 x = new Student2();
        
        x.name = "Rajan";
        x.age = 12;

        Student2 y = new Student2();

        y.name = "Gopal";
        y.age = 14;

        x.showInfo();
        y.showInfo();
    }

    void showInfo() {
        System.out.println(name + " - " + age + " - " + maxAge);
    }
}
