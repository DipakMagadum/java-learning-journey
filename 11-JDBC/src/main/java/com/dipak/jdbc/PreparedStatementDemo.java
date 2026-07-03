package com.dipak.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "12345678";

        String query = "INSERT INTO students(name, course, marks) VALUES (?, ?, ?)";

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setString(1, "Rahul");
            preparedStatement.setString(2, "BCA");
            preparedStatement.setInt(3, 88);

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Student added successfully.");
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Unable to insert student.");
            System.out.println(e.getMessage());
        }
    }
}