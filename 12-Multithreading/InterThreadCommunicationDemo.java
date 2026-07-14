class Restaurant {

    private boolean foodReady = false;

    public synchronized void prepareFood() {

        System.out.println("Chef is preparing the food...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Preparation interrupted.");
        }

        foodReady = true;

        System.out.println("Chef: Food is ready.");

        notify();

    }

    public synchronized void serveFood() {

        while (!foodReady) {

            try {

                System.out.println("Customer is waiting for the food...");
                wait();

            } catch (InterruptedException e) {

                System.out.println("Customer was interrupted.");

            }

        }

        System.out.println("Customer received the food.");

    }

}

public class InterThreadCommunicationDemo {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Thread customer = new Thread(() -> {

            restaurant.serveFood();

        });

        Thread chef = new Thread(() -> {

            restaurant.prepareFood();

        });

        customer.start();
        chef.start();

    }

}