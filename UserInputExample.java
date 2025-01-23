import java.util.Scanner; // Import the Scanner class

class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        // Take String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read a string

        // Take integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read an integer

        // Take double input
        System.out.print("Enter your height (in cm): ");
        double height = sc.nextDouble(); // Read a double

        // Output the user inputs
        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + " cm tall.");
        
        sc.close(); // Close the Scanner
    }
}
