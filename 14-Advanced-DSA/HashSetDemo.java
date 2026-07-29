import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> employeeIds = new HashSet<>();

        employeeIds.add("EMP101");
        employeeIds.add("EMP102");
        employeeIds.add("EMP103");
        employeeIds.add("EMP101");
        employeeIds.add("EMP104");
        employeeIds.add("EMP102");

        System.out.println("Registered Employee IDs:");

        System.out.println(employeeIds);

        System.out.println("\nChecking Employee ID EMP103:");

        if (employeeIds.contains("EMP103")) {

            System.out.println("Employee ID Found.");

        } else {

            System.out.println("Employee ID Not Found.");

        }

        System.out.println("\nRemoving Employee ID EMP102...");

        employeeIds.remove("EMP102");

        System.out.println(employeeIds);

        System.out.println("\nTotal Unique Employees:");

        System.out.println(employeeIds.size());

    }

}