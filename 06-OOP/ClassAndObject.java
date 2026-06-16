public class ClassAndObject {

    String name = "Dipak";

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        ClassAndObject student = new ClassAndObject();

        student.displayName();
    }
}