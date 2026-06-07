import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println(first + " is largest");
        } else if (second > first) {
            System.out.println(second + " is largest");
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}