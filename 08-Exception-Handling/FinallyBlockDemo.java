import java.util.Scanner;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();

            int result = firstNumber / secondNumber;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Division by zero is not allowed.");

        } finally {

            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}