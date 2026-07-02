package com.dipak.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "12345678";

        String query = """
                INSERT INTO students(name, course, marks)
                VALUES ('Dipak', 'MCA', 85)
                """;

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            Statement statement = connection.createStatement();

            int rowsAffected = statement.executeUpdate(query);

            System.out.println(rowsAffected + " record inserted successfully.");

            statement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Unable to insert data.");
            System.out.println(e.getMessage());
        }
    }
}