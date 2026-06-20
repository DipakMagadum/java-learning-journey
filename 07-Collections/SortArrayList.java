import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(85);
        marks.add(71);

        System.out.println("Before Sorting: " + marks);

        Collections.sort(marks);

        System.out.println("After Sorting: " + marks);
    }
}