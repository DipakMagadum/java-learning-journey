public class LinearSearch {

    public static int search(int[] numbers, int target) {

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] == target) {
                return index;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] marks = {72, 85, 91, 67, 88, 95};

        int target = 88;

        int position = search(marks, target);

        if (position != -1) {

            System.out.println(
                    "Element found at index : " + position
            );

        } else {

            System.out.println("Element not found.");

        }

    }

}