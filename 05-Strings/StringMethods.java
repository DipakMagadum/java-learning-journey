public class StringMethods {

    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(0));
        System.out.println(text.contains("Java"));
        System.out.println(text.replace("Java", "Spring"));
    }
}