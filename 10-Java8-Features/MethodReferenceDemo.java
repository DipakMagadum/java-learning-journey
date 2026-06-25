import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void printCourse(String course) {
        System.out.println(course);
    }

    public static void main(String[] args) {

        List<String> courses = Arrays.asList(
                "Java",
                "Spring Boot",
                "React"
        );

        courses.forEach(MethodReferenceDemo::printCourse);
    }
}