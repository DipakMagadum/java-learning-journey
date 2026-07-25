import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] marks, int left, int right) {

        if (left < right) {

            int middle = left + (right - left) / 2;

            mergeSort(marks, left, middle);
            mergeSort(marks, middle + 1, right);

            merge(marks, left, middle, right);

        }

    }

    public static void merge(int[] marks, int left, int middle, int right) {

        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int index = 0; index < leftSize; index++) {
            leftArray[index] = marks[left + index];
        }

        for (int index = 0; index < rightSize; index++) {
            rightArray[index] = marks[middle + 1 + index];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = left;

        while (leftIndex < leftSize && rightIndex < rightSize) {

            if (leftArray[leftIndex] <= rightArray[rightIndex]) {

                marks[mergedIndex] = leftArray[leftIndex];
                leftIndex++;

            } else {

                marks[mergedIndex] = rightArray[rightIndex];
                rightIndex++;

            }

            mergedIndex++;

        }

        while (leftIndex < leftSize) {

            marks[mergedIndex] = leftArray[leftIndex];
            leftIndex++;
            mergedIndex++;

        }

        while (rightIndex < rightSize) {

            marks[mergedIndex] = rightArray[rightIndex];
            rightIndex++;
            mergedIndex++;

        }

    }

    public static void main(String[] args) {

        int[] studentMarks = {72, 95, 68, 88, 75, 91, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(studentMarks));

        mergeSort(studentMarks, 0, studentMarks.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(studentMarks));

    }

}