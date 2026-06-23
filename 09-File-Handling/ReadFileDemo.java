import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {

    public static void main(String[] args) {

        File file = new File("notes.txt");

        try {

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}