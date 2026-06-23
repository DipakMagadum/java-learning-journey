import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Java File Handling Practice");
            writer.write("\nLearning how to write data into files.");

            writer.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {

            System.out.println("Unable to write data to file.");
        }
    }
}