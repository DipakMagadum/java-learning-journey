public class MethodOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        int firstResult = add(10, 20);
        double secondResult = add(5.5, 2.5);

        System.out.println("Integer Addition: " + firstResult);
        System.out.println("Double Addition: " + secondResult);
    }
}