public class RecursionDemo {

    public static void printCountdown(int number) {

        if (number == 0) {
            System.out.println("Liftoff! ");
            return;
        }

        System.out.println(number);

        printCountdown(number - 1);

    }

    public static void main(String[] args) {

        System.out.println("Rocket Launch Countdown:");

        printCountdown(5);

    }

}