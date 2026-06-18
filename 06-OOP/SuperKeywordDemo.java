class Person {

    String name = "Dipak";
}

class Student extends Person {

    String name = "Kiran";

    void displayNames() {

        System.out.println("Student Name: " + name);
        System.out.println("Person Name: " + super.name);
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.displayNames();
    }
}