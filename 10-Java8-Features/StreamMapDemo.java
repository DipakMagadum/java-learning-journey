import java.util.Arrays;
import java.util.List;

public class StreamMapDemo {

    public static void main(String[] args) {

        List<String> technologies = Arrays.asList(
                "java",
                "spring boot",
                "react"
        );

        technologies.stream()
                .map(technology -> technology.toUpperCase())
                .forEach(technology -> System.out.println(technology));
    }
}