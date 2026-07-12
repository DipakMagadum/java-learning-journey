public class ThreadPriorityDemo extends Thread {

    public ThreadPriorityDemo(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {

        for (int ticket = 1; ticket <= 3; ticket++) {

            System.out.println(
                    getName() +
                    " is processing ticket " +
                    ticket
            );

            try {

                Thread.sleep(300);

            } catch (InterruptedException e) {

                System.out.println(getName() + " interrupted.");
            }

        }

    }

    public static void main(String[] args) {

        ThreadPriorityDemo vipCounter =
                new ThreadPriorityDemo("VIP Counter");

        ThreadPriorityDemo regularCounter =
                new ThreadPriorityDemo("Regular Counter");

        vipCounter.setPriority(Thread.MAX_PRIORITY);
        regularCounter.setPriority(Thread.MIN_PRIORITY);

        vipCounter.start();
        regularCounter.start();

        System.out.println("VIP Priority : " + vipCounter.getPriority());
        System.out.println("Regular Priority : " + regularCounter.getPriority());

    }

}