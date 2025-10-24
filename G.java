// Define the Student1 class
class Student1 {
    String name;
    int age;
    String college;

    // Parameterized constructor
    Student1(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }
}

// Main class
class G {
    public static void main(String[] args) {
        // Create Student1 object with values
        Student1 x = new Student1("Manu Bhardwaj", 19, "BGIEM");

        // Print the values
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.college);
    }    
}
