public class ThrowDemo {

    public static void validateAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote.");
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {

        try {

            validateAge(16);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }
    }
}