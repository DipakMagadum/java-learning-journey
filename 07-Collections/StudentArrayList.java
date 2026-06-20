import java.util.ArrayList;

public class StudentArrayList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Dipak");
        students.add("Rohit");
        students.add("Sneha");
        students.add("Priya");

        System.out.println("Students List:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}