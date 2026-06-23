import java.io.File;

public class FileExistsDemo {

    public static void main(String[] args) {

        File file = new File("notes.txt");

        if (file.exists()) {

            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());

        } else {

            System.out.println("File does not exist.");
        }
    }
}