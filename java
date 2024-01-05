import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input as a string
        String name = scanner.nextLine();

        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the world of Java!");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
