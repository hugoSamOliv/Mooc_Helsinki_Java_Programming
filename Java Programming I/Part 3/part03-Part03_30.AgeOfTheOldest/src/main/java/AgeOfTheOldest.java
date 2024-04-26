
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int older = 0;
        
        while (!text.equals("")) {
            String[] wordAndInt = text.split(",");
            
            if (Integer.valueOf(wordAndInt[1]) > older) {
                older = Integer.valueOf(wordAndInt[1]);
            }
            
            text = scanner.nextLine();
        }
        
        System.out.println("Age of the oldest: " + older);
    }
}
