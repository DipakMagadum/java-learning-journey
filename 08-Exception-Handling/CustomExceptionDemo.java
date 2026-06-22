class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void validateMarks(int marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }

        System.out.println("Marks entered successfully.");
    }

    public static void main(String[] args) {

        try {

            validateMarks(120);

        } catch (InvalidMarksException e) {

            System.out.println(e.getMessage());
        }
    }
}