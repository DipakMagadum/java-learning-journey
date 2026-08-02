import java.util.*;

public class BFSDemo {

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

    public void breadthFirstSearch(String startingEmployee) {

        Queue<String> queue = new LinkedList<>();

        Set<String> visitedEmployees = new HashSet<>();

        queue.offer(startingEmployee);

        visitedEmployees.add(startingEmployee);

        while (!queue.isEmpty()) {

            String currentEmployee = queue.poll();

            System.out.print(currentEmployee + " ");

            for (String colleague :
                    employeeNetwork.get(currentEmployee)) {

                if (!visitedEmployees.contains(colleague)) {

                    visitedEmployees.add(colleague);

                    queue.offer(colleague);

                }

            }

        }

    }

    public static void main(String[] args) {

        BFSDemo office = new BFSDemo();

        office.addConnection("A", "B");
        office.addConnection("A", "C");
        office.addConnection("B", "D");
        office.addConnection("B", "E");
        office.addConnection("C", "F");
        office.addConnection("E", "G");

        System.out.println("Breadth First Search Traversal:");

        office.breadthFirstSearch("A");

    }

}