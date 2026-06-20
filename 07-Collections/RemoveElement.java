import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");

        System.out.println("Before Removal: " + products);

        products.remove("Mouse");

        System.out.println("After Removal: " + products);
    }
}