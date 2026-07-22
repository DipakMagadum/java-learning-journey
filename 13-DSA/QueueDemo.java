import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.offer("Rahul");
        customers.offer("Priya");
        customers.offer("Amit");
        customers.offer("Sneha");

        System.out.println("Customers in Queue:");
        System.out.println(customers);

        System.out.println("\nServing Customer:");

        String servedCustomer = customers.poll();

        System.out.println("Served : " + servedCustomer);

        System.out.println("\nNext Customer:");

        System.out.println(customers.peek());

        System.out.println("\nRemaining Queue:");

        System.out.println(customers);

    }

}