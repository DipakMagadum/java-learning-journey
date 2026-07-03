package com.dipak.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "12345678";

        String query = """
                DELETE FROM students
                WHERE name = 'Dipak'
                """;

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            Statement statement = connection.createStatement();

            int rowsDeleted = statement.executeUpdate(query);

            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Unable to delete student record.");
            System.out.println(e.getMessage());

        }

    }

}