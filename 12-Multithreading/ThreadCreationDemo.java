public class ThreadCreationDemo extends Thread {

    @Override
    public void run() {

        for (int step = 1; step <= 5; step++) {

            System.out.println(
                    "Child Thread : Learning Step " + step
            );

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println("Thread execution interrupted.");

            }

        }

    }

    public static void main(String[] args) {

        System.out.println("Main thread started.");

        ThreadCreationDemo learningThread =
                new ThreadCreationDemo();

        learningThread.start();

        System.out.println("Main thread finished.");
    }

}