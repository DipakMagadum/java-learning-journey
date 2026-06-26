import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(45, 78, 82, 35, 91, 67);

        marks.stream()
                .filter(mark -> mark >= 60)
                .forEach(mark -> System.out.println(mark));
    }
}