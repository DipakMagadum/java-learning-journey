interface Greeting {

    void sayHello();
}

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        Greeting greeting = () -> System.out.println("Welcome to Java 8");

        greeting.sayHello();
    }
}