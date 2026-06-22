public class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        String age = "Twenty Two";

        try {

            int userAge = Integer.parseInt(age);

            System.out.println("Age: " + userAge);

        } catch (NumberFormatException e) {

            System.out.println("Age should contain only numbers.");
        }

        System.out.println("Program executed successfully.");
    }
}