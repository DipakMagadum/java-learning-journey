import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String email = null;

        Optional<String> optionalEmail = Optional.ofNullable(email);

        if (optionalEmail.isPresent()) {
            System.out.println(optionalEmail.get());
        } else {
            System.out.println("Email is not available");
        }
    }
}