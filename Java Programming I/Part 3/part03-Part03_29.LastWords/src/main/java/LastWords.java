
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        
        while (!text.equals("")) {
            String[] words = text.split(" ");
            
            System.out.println(words[words.length - 1]);
            
            text = scanner.nextLine();
        }
    }
}
