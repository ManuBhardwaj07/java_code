import java.util.Scanner;

// Define the Student class
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Default Name";
        age = 0;
    }
}

// Main class
class F1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student x = new Student();

        // Print default values
        System.out.println(x.name);
        System.out.println(x.age);

        // Take input from user
        System.out.print("Enter your name: ");
        x.name = sc.nextLine();

        System.out.print("Enter your age: ");
        x.age = sc.nextInt();        
        
        // Print updated values
        System.out.println(x.name);
        System.out.println(x.age);
        
        sc.close();
    }    
}
