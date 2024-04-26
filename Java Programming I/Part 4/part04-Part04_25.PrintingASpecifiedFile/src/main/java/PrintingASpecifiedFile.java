import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileToRead = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(fileToRead))) {
            while (scanFile.hasNextLine()) {
                String wordInFile = scanFile.nextLine();
                System.out.println(wordInFile);
            }
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}
