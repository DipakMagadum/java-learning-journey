public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        int totalMarks = 500;
        int subjects = 0;

        try {

            int average = totalMarks / subjects;

            System.out.println("Average Marks: " + average);

        } catch (ArithmeticException e) {

            System.out.println("Number of subjects cannot be zero.");
        }
    }
}