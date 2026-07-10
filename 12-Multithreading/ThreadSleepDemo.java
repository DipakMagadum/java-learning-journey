public class ThreadSleepDemo {

    public static void main(String[] args) {

        System.out.println("Countdown Started");

        for (int number = 5; number >= 1; number--) {

            System.out.println(number);

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println("Countdown interrupted.");
            }

        }

        System.out.println("Time's up!");
    }

}