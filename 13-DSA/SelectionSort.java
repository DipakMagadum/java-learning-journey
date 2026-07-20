import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] prices) {

        int length = prices.length;

        for (int current = 0; current < length - 1; current++) {

            int minimumIndex = current;

            for (int next = current + 1; next < length; next++) {

                if (prices[next] < prices[minimumIndex]) {

                    minimumIndex = next;

                }

            }

            if (minimumIndex != current) {

                int temp = prices[current];
                prices[current] = prices[minimumIndex];
                prices[minimumIndex] = temp;

            }

        }

    }

    public static void main(String[] args) {

        int[] productPrices = {450, 120, 300, 180, 250, 500};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(productPrices));

        selectionSort(productPrices);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(productPrices));

    }

}