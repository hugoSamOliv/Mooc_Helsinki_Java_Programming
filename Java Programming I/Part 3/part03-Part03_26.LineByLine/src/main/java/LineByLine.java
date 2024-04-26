
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        
        while (!text.equals("")) {
            String[] words = text.split(" ");
        
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }  
            
            text = scanner.nextLine();
        }
        
    }
}
