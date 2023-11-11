import com.jgbinegar.DoMathStuff;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        char operation;

        System.out.println("Welcome to the Simple Calculator App");
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                result = DoMathStuff.add(number1, number2);
                break;
            case '-':
                result = DoMathStuff.subtract(number1, number2);
                break;
            case '*':
                result = DoMathStuff.multiply(number1, number2);
                break;
            case '/':
                // Check for division by zero
                if (number2 != 0) {
                    result = DoMathStuff.divide(number1, number2);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
