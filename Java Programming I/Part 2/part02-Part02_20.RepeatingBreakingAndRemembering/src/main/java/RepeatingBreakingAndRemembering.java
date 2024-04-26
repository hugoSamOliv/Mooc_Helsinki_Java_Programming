
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        
        int check = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        while (check != -1) {
            System.out.println("Give numbers:");
            check = Integer.valueOf(scanner.nextLine());
            
            if (check != -1) {
                if (check % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                sum = sum + check;
                count = count + 1;
            }
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        

    }
}
