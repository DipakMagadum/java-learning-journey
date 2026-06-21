public class TryCatchDemo {

    public static void main(String[] args) {

        try {

            int firstNumber = 10;
            int secondNumber = 0;

            int result = firstNumber / secondNumber;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program ended.");
    }
}