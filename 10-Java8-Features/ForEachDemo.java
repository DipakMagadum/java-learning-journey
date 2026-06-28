import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> books = Arrays.asList(
                "Atomic Habits",
                "Clean Code",
                "Effective Java"
        );

        books.forEach(book -> System.out.println(book));
    }
}