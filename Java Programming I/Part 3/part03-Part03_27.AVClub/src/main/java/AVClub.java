
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scans string for a variable called text
        String text = scanner.nextLine();
        
        // Loop that ends when the text variable
        // is equal to an empty string.
        // (While text doesn't equals "")
        while (!text.equals("")) {
            
            // Assigns each word from the text separated
            // by an empty space to an array.
            String[] words = text.split(" ");
            
            // Loops through the array in search of
            // string that contains "av", then prints
            // it on the screen.
            for (int i = 0; i < words.length; i++) {
                if (words[i].contains("av")) {
                    System.out.println(words[i]);
                }
            }
            
            // Assigns another user input to the text variable.
            text = scanner.nextLine();
        }
        
    }
}
