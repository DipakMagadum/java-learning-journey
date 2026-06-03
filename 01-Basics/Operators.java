public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Relational Operators
        System.out.println(a > b);
        System.out.println(a < b);

        // Logical Operators
        boolean first = true;
        boolean second = false;

        System.out.println(first && second);
        System.out.println(first || second);

        // Increment Operator
        a++;
        System.out.println(a);

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater";

        System.out.println(result);
    }
}