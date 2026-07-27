import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] prices, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);

        }

    }

    public static int partition(int[] prices, int low, int high) {

        int pivot = prices[high];
        int smallerElementIndex = low - 1;

        for (int current = low; current < high; current++) {

            if (prices[current] < pivot) {

                smallerElementIndex++;

                int temp = prices[smallerElementIndex];
                prices[smallerElementIndex] = prices[current];
                prices[current] = temp;

            }

        }

        int temp = prices[smallerElementIndex + 1];
        prices[smallerElementIndex + 1] = prices[high];
        prices[high] = temp;

        return smallerElementIndex + 1;

    }

    public static void main(String[] args) {

        int[] productPrices = {450, 120, 300, 180, 250, 500, 100};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(productPrices));

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(productPrices));

    }

}