
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        
        while (!text.equals("")) {
            String[] words = text.split(" ");
            
            System.out.println(words[0]);
            
            text = scanner.nextLine();
        }
    }
}
