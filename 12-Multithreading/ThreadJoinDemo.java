public class ThreadJoinDemo extends Thread {

    @Override
    public void run() {

        for (int file = 1; file <= 5; file++) {

            System.out.println("Downloading File " + file);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println("Download interrupted.");
            }

        }

    }

    public static void main(String[] args) {

        ThreadJoinDemo downloadThread = new ThreadJoinDemo();

        downloadThread.start();

        try {

            downloadThread.join();

        } catch (InterruptedException e) {

            System.out.println("Main thread interrupted.");
        }

        System.out.println("All files downloaded successfully.");
    }

}