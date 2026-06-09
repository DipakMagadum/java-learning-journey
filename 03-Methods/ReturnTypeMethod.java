public class ReturnTypeMethod {

    public static int addNumbers() {

        int a = 10;
        int b = 20;

        return a + b;
    }

    public static void main(String[] args) {

        int result = addNumbers();

        System.out.println("Sum: " + result);
    }
}