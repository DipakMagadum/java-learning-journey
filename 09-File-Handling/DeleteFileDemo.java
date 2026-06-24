import java.io.File;

public class DeleteFileDemo {

    public static void main(String[] args) {

        File file = new File("notes.txt");

        if (file.delete()) {

            System.out.println("File deleted successfully.");

        } else {

            System.out.println("Unable to delete file.");
        }
    }
}