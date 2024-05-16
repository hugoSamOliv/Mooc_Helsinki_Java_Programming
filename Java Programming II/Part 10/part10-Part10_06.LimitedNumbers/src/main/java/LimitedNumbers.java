
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            
            if (Integer.parseInt(input) < 0) {
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .filter(s -> s >= 1 && s <= 5)
                .forEach(s -> System.out.println(s));
    }
}
