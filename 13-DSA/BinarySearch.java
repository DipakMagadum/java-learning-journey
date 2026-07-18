public class BinarySearch {

    public static int search(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {

                return middle;

            } else if (numbers[middle] < target) {

                left = middle + 1;

            } else {

                right = middle - 1;

            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 105, 110, 115, 120, 125, 130};

        int target = 120;

        int position = search(employeeIds, target);

        if (position != -1) {

            System.out.println("Element found at index : " + position);

        } else {

            System.out.println("Element not found.");

        }

    }

}