import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] scores) {

        for (int current = 1; current < scores.length; current++) {

            int key = scores[current];
            int previous = current - 1;

            while (previous >= 0 && scores[previous] > key) {

                scores[previous + 1] = scores[previous];
                previous--;

            }

            scores[previous + 1] = key;

        }

    }

    public static void main(String[] args) {

        int[] examScores = {72, 95, 68, 88, 75, 91};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(examScores));

        insertionSort(examScores);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(examScores));

    }

}