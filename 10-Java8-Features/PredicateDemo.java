import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEligibleForVote = age -> age >= 18;

        int age = 21;

        if (isEligibleForVote.test(age)) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }
}