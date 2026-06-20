import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Dipak");
        students.put(102, "Rohit");
        students.put(103, "Amit");

        System.out.println(students);

        System.out.println("Student 102: " + students.get(102));
    }
}