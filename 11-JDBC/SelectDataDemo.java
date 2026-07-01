import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "root";

        String query = "SELECT * FROM students";

        try {

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("ID\tName\tCourse\tMarks");

            while (resultSet.next()) {

                System.out.println(
                        resultSet.getInt("id") + "\t"
                                + resultSet.getString("name") + "\t"
                                + resultSet.getString("course") + "\t"
                                + resultSet.getInt("marks")
                );
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Unable to fetch records.");
            System.out.println(e.getMessage());
        }
    }
}