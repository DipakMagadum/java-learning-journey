public class MaximumMethod {

    public static int findMaximum(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static void main(String[] args) {

        int result = findMaximum(25, 40);

        System.out.println("Maximum Number: " + result);
    }
}