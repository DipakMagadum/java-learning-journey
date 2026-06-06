import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}