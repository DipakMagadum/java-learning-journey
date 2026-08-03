import java.util.*;

public class DFSDemo {

    private Map<String, List<String>> employeeNetwork =
            new HashMap<>();

    public void addConnection(String employee, String colleague) {

        employeeNetwork
                .computeIfAbsent(employee, key -> new ArrayList<>())
                .add(colleague);

        employeeNetwork
                .computeIfAbsent(colleague, key -> new ArrayList<>())
                .add(employee);

    }

    public void depthFirstSearch(
            String currentEmployee,
            Set<String> visitedEmployees
    ) {

        visitedEmployees.add(currentEmployee);

        System.out.print(currentEmployee + " ");

        for (String colleague :
                employeeNetwork.get(currentEmployee)) {

            if (!visitedEmployees.contains(colleague)) {

                depthFirstSearch(
                        colleague,
                        visitedEmployees
                );

            }

        }

    }

    public static void main(String[] args) {

        DFSDemo office = new DFSDemo();

        office.addConnection("A", "B");
        office.addConnection("A", "C");
        office.addConnection("B", "D");
        office.addConnection("B", "E");
        office.addConnection("C", "F");
        office.addConnection("E", "G");

        System.out.println("Depth First Search Traversal:");

        office.depthFirstSearch(
                "A",
                new HashSet<>()
        );

    }

}