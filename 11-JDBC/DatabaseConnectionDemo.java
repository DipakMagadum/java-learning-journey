import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "12345678";

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("Database connected successfully.");

            connection.close();

        } catch (SQLException e) {

            System.out.println("Connection failed.");
            System.out.println(e.getMessage());
        }
    }
}