import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();
            
            if (userInput.equals("end")) {
                break;
            }
            
            strings.add(userInput);
        }
        
        System.out.println(strings.size());
        
    }
}
