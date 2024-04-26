
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int positiveSum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                positiveSum = positiveSum + number;
                positiveCount = positiveCount + 1;
            }
        }
        
        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + ((double) positiveSum / positiveCount));
        }
    }
}
