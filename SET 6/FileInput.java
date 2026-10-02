import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {

        FileInputStream file = null;

        try {
            file = new FileInputStream("input.txt");

            int ch;
            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            try {
                if (file != null) {
                    file.close();
                }
            }
            catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}