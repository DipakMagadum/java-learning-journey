public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            String value = "Java";

            int number = Integer.parseInt(value);

            int[] marks = {80, 90, 95};

            System.out.println(marks[5]);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number format.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is out of range.");
        }

        System.out.println("Program completed.");
    }
}