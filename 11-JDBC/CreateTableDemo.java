import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "root";

        String query = """
                CREATE TABLE IF NOT EXISTS students (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(50),
                    course VARCHAR(50),
                    marks INT
                )
                """;

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

            System.out.println("Table created successfully.");

            statement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Unable to create table.");
            System.out.println(e.getMessage());
        }
    }
}