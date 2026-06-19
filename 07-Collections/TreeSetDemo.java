import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(70);
        marks.add(92);
        marks.add(78);
        marks.add(70);

        System.out.println(marks);
    }
}