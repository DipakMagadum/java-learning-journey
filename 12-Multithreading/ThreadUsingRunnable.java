public class ThreadUsingRunnable implements Runnable {

    @Override
    public void run() {

        for (int task = 1; task <= 5; task++) {

            System.out.println(
                    "Downloading File " + task
            );

            try {

                Thread.sleep(400);

            } catch (InterruptedException e) {

                System.out.println("Download interrupted.");

            }

        }

    }

    public static void main(String[] args) {

        Thread downloadThread =
                new Thread(new ThreadUsingRunnable());

        downloadThread.start();

        System.out.println("Download started...");
    }

}