import java.util.Scanner;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean valid = false;

        // Keep asking until user enters a valid integer
        while (!valid) {
            System.out.print("Enter your age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // discard invalid input
            }
        }

        System.out.println(" --------------------- ");
        System.out.println("Age: " + age);

        sc.close();
    }
}
