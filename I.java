// Define the Student2 class
class Student2 {
    String name;
    int age;
    String college;

    // Parameterized constructor
    Student2(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }
}

// Main class
class I {
    public static void main(String[] args) {
        // Create Student2 object
        Student2 x = new Student2("Sarvesh Sinha", 21, "HECT");

        // Print details
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.college);
    }    
}
