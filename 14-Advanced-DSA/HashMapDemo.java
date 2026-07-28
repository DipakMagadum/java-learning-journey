import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> studentResults = new HashMap<>();

        studentResults.put(101, "Pass");
        studentResults.put(102, "Fail");
        studentResults.put(103, "Pass");
        studentResults.put(104, "Distinction");

        System.out.println("Student Results:");

        for (Map.Entry<Integer, String> entry : studentResults.entrySet()) {

            System.out.println(
                    "Roll No: " + entry.getKey()
                            + " -> "
                            + entry.getValue()
            );

        }

        System.out.println("\nResult of Roll No 103:");

        System.out.println(studentResults.get(103));

        System.out.println("\nUpdating Result of Roll No 102...");

        studentResults.put(102, "Pass");

        System.out.println(studentResults);

        System.out.println("\nRemoving Roll No 101...");

        studentResults.remove(101);

        System.out.println(studentResults);

    }

}