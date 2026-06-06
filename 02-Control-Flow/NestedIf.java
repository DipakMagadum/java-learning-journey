import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have voter ID? (true/false): ");
        boolean hasVoterId = sc.nextBoolean();

        if (age >= 18) {

            if (hasVoterId) {
                System.out.println("You can vote");
            } else {
                System.out.println("You need a voter ID");
            }

        } else {
            System.out.println("You are not eligible to vote");
        }

        sc.close();
    }
}