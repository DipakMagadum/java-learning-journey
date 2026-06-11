public class SimpleInterestMethod {

    public static double calculateInterest(double principal, double rate, double time) {

        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        double interest = calculateInterest(10000, 8, 2);

        System.out.println("Simple Interest: " + interest);
    }
}