import java.util.Arrays;
import java.util.List;

public class StreamCountDemo {

    public static void main(String[] args) {

        List<String> employees = Arrays.asList(
                "Dipak",
                "Rohit",
                "Priya",
                "Sneha",
                "Amit"
        );

        long totalEmployees = employees.stream()
                .count();

        System.out.println("Total Employees: " + totalEmployees);
    }
}