import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter your age: ");

        // Check if input is an integer
        if (sc.hasNextInt()) {
            age = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter a number.");
            sc.close();
            return; // exit program
        }

        System.out.println(" --------------------- ");
        System.out.println("Age: " + age);

        sc.close();
    }
}
