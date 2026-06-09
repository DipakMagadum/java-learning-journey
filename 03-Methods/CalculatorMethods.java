public class CalculatorMethods {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int sum = add(10, 5);
        int difference = subtract(10, 5);
        int product = multiply(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
    }
}