public class EvenOddMethod {

    public static void checkNumber(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(7);
    }
}