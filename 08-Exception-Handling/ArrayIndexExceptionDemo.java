public class ArrayIndexExceptionDemo {

    public static void main(String[] args) {

        int[] marks = {75, 82, 90};

        try {

            System.out.println("Marks: " + marks[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index.");
        }

        System.out.println("Program finished.");
    }
}