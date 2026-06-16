public class RemoveSpaces {

    public static void main(String[] args) {

        String text = "Java Programming Language";

        String result = text.replace(" ", "");

        System.out.println("Original String: " + text);
        System.out.println("Without Spaces: " + result);
    }
}