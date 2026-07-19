import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] marks) {

        int length = marks.length;

        for (int pass = 0; pass < length - 1; pass++) {

            boolean swapped = false;

            for (int index = 0; index < length - pass - 1; index++) {

                if (marks[index] > marks[index + 1]) {

                    int temp = marks[index];
                    marks[index] = marks[index + 1];
                    marks[index + 1] = temp;

                    swapped = true;

                }

            }

            if (!swapped) {
                break;
            }

        }

    }

    public static void main(String[] args) {

        int[] studentMarks = {78, 45, 92, 61, 55, 88};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(studentMarks));

        bubbleSort(studentMarks);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(studentMarks));

    }

}