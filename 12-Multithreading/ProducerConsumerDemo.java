class Warehouse {

    private int products = 0;

    public synchronized void produce() {

        while (products == 1) {

            try {

                wait();

            } catch (InterruptedException e) {

                System.out.println("Producer interrupted.");
            }

        }

        products++;

        System.out.println("Producer added a product.");

        notify();

    }

    public synchronized void consume() {

        while (products == 0) {

            try {

                wait();

            } catch (InterruptedException e) {

                System.out.println("Consumer interrupted.");
            }

        }

        products--;

        System.out.println("Consumer purchased a product.");

        notify();

    }

}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Thread producer = new Thread(() -> {

            for (int count = 1; count <= 5; count++) {

                warehouse.produce();

                try {

                    Thread.sleep(500);

                } catch (InterruptedException e) {

                    System.out.println("Producer stopped.");

                }

            }

        });

        Thread consumer = new Thread(() -> {

            for (int count = 1; count <= 5; count++) {

                warehouse.consume();

                try {

                    Thread.sleep(800);

                } catch (InterruptedException e) {

                    System.out.println("Consumer stopped.");

                }

            }

        });

        producer.start();
        consumer.start();

    }

}