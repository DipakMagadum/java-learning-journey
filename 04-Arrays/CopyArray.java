public class CopyArray {

    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};
        int[] copied = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copied[i] = original[i];
        }

        System.out.println("Copied Array:");

        for (int i = 0; i < copied.length; i++) {
            System.out.println(copied[i]);
        }
    }
}