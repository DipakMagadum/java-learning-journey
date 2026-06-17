class Employee {

    String company = "Google";

    void showCompany() {
        System.out.println("Company: " + company);
    }
}

public class InheritanceDemo extends Employee {

    String employeeName = "Dipak";

    void showEmployee() {
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {

        InheritanceDemo employee = new InheritanceDemo();

        employee.showEmployee();
        employee.showCompany();
    }
}