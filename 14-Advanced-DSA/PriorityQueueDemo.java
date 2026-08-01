import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> patientPriorities =
                new PriorityQueue<>();

        patientPriorities.offer(3);
        patientPriorities.offer(1);
        patientPriorities.offer(5);
        patientPriorities.offer(2);
        patientPriorities.offer(4);

        System.out.println("Patients are being treated based on priority:");

        while (!patientPriorities.isEmpty()) {

            System.out.println(
                    "Treating Patient with Priority : "
                            + patientPriorities.poll()
            );

        }

    }

}