class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Dipak");
        student.setAge(22);

        student.displayDetails();
    }
}