import java.util.ArrayList;

public class IterateArrayList {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Spring Boot");
        courses.add("MySQL");

        for (String course : courses) {
            System.out.println(course);
        }
    }
}