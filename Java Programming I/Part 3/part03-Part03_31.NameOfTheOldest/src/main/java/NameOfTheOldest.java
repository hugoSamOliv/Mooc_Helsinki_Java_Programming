
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Text and counting variables
        String text = scanner.nextLine();
        int older = 0;
        String oldest = "";
        
        // Loop that ends when the text
        // variable is equal to an empty string
        while (!text.equals("")) {
            
            // Split variable text into a array, 
            // containing the name and age on the text
            // textFormat = name,age;
            // So, word[0] is a string of text,
            // and word[1] is a string of a 'number'
            String[] wordAndInt = text.split(",");
            
            // Check if the word[1] (conversion to int)
            // is larger than the variable older; if so,
            // change older to hold the integer value of
            // word[1] (conversion to int) and change the
            // value of the String variable oldest, to hold
            // the String in word[0], since, the bigger older
            // is, we will always associate the word that is in 
            // the array together with older to the variable oldest
            if (Integer.valueOf(wordAndInt[1]) > older) {
                older = Integer.valueOf(wordAndInt[1]);
                oldest = wordAndInt[0];
            }
            
            // Scan text for next loop check
            text = scanner.nextLine();
        }
        
        // Print the name of the oldest person
        System.out.println("Name of the oldest: " + oldest);

    }
}
