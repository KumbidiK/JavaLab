import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            FileOutputStream file = new FileOutputStream("output.txt", true);

            file.write((text + "\n").getBytes());

            file.close();

            System.out.println("Content written to file successfully.");
        }
        catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        sc.close();
    }
}