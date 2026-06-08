import java.util.Scanner;

public class SimpleMenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result: " + (first + second));
                break;

            case 2:
                System.out.println("Result: " + (first - second));
                break;

            case 3:
                System.out.println("Result: " + (first * second));
                break;

            case 4:
                System.out.println("Result: " + (first / second));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}