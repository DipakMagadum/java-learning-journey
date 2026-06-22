import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    public static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

        file.close();

        System.out.println("File opened successfully.");
    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (IOException e) {

            System.out.println("File not found.");
        }
    }
}