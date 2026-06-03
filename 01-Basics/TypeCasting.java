public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting
        int number = 10;
        double value = number;

        System.out.println(value);

        // Explicit Type Casting
        double price = 99.99;
        int newPrice = (int) price;

        System.out.println(newPrice);
    }
}