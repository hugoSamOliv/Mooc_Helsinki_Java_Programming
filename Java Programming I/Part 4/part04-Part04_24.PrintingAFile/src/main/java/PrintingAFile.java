
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scanFile = new Scanner(Paths.get("data.txt"))) {
            while (scanFile.hasNextLine()) {
                String wordInFile = scanFile.nextLine();
                
                System.out.println(wordInFile);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
