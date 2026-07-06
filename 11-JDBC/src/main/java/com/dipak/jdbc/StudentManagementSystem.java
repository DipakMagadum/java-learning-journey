package com.dipak.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class StudentManagementSystem {

    static final String URL = "jdbc:mysql://localhost:3306/student_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "12345678";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

          System.out.println("\n===== Student Management System =====");
System.out.println("1. Add Student");
System.out.println("2. View Students");
System.out.println("3. Update Student");
System.out.println("4. Delete Student");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

          switch (choice) {

    case 1:
        addStudent();
        break;

    case 2:
        viewStudents();
        break;

    case 3:
        updateStudent();
        break;

    case 4:
        deleteStudent();
        break;

    case 5:
        System.out.println("Thank you!");
        break;

    default:
        System.out.println("Invalid choice.");
}
       } while (choice != 5);

    }

    static void addStudent() {

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        String query =
                "INSERT INTO students(name,course,marks) VALUES(?,?,?)";

        try {

            Connection connection =
                    DriverManager.getConnection(URL, USERNAME, PASSWORD);

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, course);
            preparedStatement.setInt(3, marks);

            preparedStatement.executeUpdate();

            System.out.println("Student added successfully.");

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    static void viewStudents() {

        String query = "SELECT * FROM students";

        try {

            Connection connection =
                    DriverManager.getConnection(URL, USERNAME, PASSWORD);

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            ResultSet resultSet =
                    preparedStatement.executeQuery();

            System.out.println();

            while (resultSet.next()) {

                System.out.println(
                        resultSet.getInt("id")
                                + " | "
                                + resultSet.getString("name")
                                + " | "
                                + resultSet.getString("course")
                                + " | "
                                + resultSet.getInt("marks")
                );
                

            }
            

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }
    static void updateStudent() {

    System.out.print("Enter Student ID: ");
    int id = scanner.nextInt();

    System.out.print("Enter New Marks: ");
    int marks = scanner.nextInt();
    scanner.nextLine();

    String query =
            "UPDATE students SET marks = ? WHERE id = ?";

    try {

        Connection connection =
                DriverManager.getConnection(URL, USERNAME, PASSWORD);

        PreparedStatement preparedStatement =
                connection.prepareStatement(query);

        preparedStatement.setInt(1, marks);
        preparedStatement.setInt(2, id);

        int rowsUpdated = preparedStatement.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }

        preparedStatement.close();
        connection.close();

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

}
static void deleteStudent() {

    System.out.print("Enter Student ID to delete: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    String query = "DELETE FROM students WHERE id = ?";

    try {

        Connection connection =
                DriverManager.getConnection(URL, USERNAME, PASSWORD);

        PreparedStatement preparedStatement =
                connection.prepareStatement(query);

        preparedStatement.setInt(1, id);

        int rowsDeleted = preparedStatement.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("No student found with this ID.");
        }

        preparedStatement.close();
        connection.close();

    } catch (SQLException e) {

        System.out.println("Unable to delete student.");
        System.out.println(e.getMessage());

    }

}
}