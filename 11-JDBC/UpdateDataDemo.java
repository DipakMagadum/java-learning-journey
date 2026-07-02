import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "12345678";

        String query = """
                UPDATE students
                SET marks = 90
                WHERE name = 'Dipak'
                """;

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            Statement statement = connection.createStatement();

            int rowsUpdated = statement.executeUpdate(query);

            if (rowsUpdated > 0) {
                System.out.println("Student record updated successfully.");
            } else {
                System.out.println("Student not found.");
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Unable to update student record.");
            System.out.println(e.getMessage());
        }
    }
}