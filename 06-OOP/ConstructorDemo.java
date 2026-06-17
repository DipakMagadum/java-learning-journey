public class ConstructorDemo {

    String name;

    ConstructorDemo() {
        name = "Dipak";
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        ConstructorDemo student = new ConstructorDemo();

        student.display();
    }
}