
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics data = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
        int temp;
        System.out.println("Enter numbers:");
        while (true) {
            temp = Integer.valueOf(scanner.nextLine());
            
            if (temp == -1) {
                break;
            }
            
            data.addNumber(temp);
            
            if (temp % 2 == 0) {
                evenNumbers.addNumber(temp);
            } else {
                oddNumbers.addNumber(temp);
            }
        }
        
        System.out.println("Sum: " + data.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
        
    }
}
