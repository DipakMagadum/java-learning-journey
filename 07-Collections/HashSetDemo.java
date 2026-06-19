import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Kolhapur");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Pune");

        System.out.println(cities);
    }
}