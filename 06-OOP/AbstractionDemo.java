abstract class Employee {

    abstract void work();

    void login() {
        System.out.println("Employee logged in");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer is working on a project");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.login();
        developer.work();
    }
}