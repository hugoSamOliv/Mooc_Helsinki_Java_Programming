
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int max = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int min = Integer.valueOf(scanner.nextLine());
        
        for (; min <= max; min++) {
            System.out.println(min);
        }
    }
}
