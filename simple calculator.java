// Simple Calculator By: 0xYazan

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Simple calculator for basic arithmetic operations. \n\n --------------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        float num1, num2, result = 0;
        char operation;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.println("Choose an operation: \n(+) Addition\n(-) Subtraction\n(*) Multiplication\n(/) Division ");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: You can't divide by 0");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operation chosen");
                return;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        scanner.close();
    }
}
