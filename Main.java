// Simple Calculator By: 0xYazan

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables to store the numbers and the result
        int num1, num2;
        int result = 0; // Initialize result to 0

        // Variable to store the chosen operation
        char operation;

        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();

        // Prompt user to choose an operation
        System.out.println("Choose an operation: \n(+) Addition\n(-) Subtraction\n(*) Multiplication\n(/) Division ");
        operation = scanner.next().charAt(0); // Read the first character of the user input

        // Switch statement to perform the chosen operation
        switch (operation) {
            case '+': // Addition
                result = num1 + num2;
                break;

            case '-': // Subtraction
                result = num1 - num2;
                break;

            case '*': // Multiplication
                result = num1 * num2;
                break;

            case '/': // Division
                if (num2 != 0) { // Check to prevent division by zero
                    result = num1 / num2;
                } else {
                    System.out.println("Error: You can't divide by 0"); // Error message for division by zero
                    return; // Exit the program
                }
                break;

            default: // Handle invalid operation input
                System.out.println("Invalid operation chosen");
                return; // Exit the program
        }

        // Display the result of the calculation
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

        scanner.close();
    }
}
