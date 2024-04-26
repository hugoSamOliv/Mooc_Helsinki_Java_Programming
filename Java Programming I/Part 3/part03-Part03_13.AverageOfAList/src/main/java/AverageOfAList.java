
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int userValue;
        
        // Adds integers to the ArrayList and
        // breaks if said integer is -1
        while (true) {
            userValue = Integer.valueOf(scanner.nextLine());
            
            if (userValue == -1) {
                break;
            }
            
            list.add(userValue);
        }
        
        // Declares variables for the sum
        // of the numbers in the list, and for
        // the numbers of numbers in the list
        int sum = 0;
        int count = 0;
        
        // For each integer in the list,
        // assign it to a variable of Integer type,
        // which name is number. For each number of
        // the list, make the sum of it with the previous
        // number of the list, and count how many times
        // this happens
        for (Integer number : list) {
            sum += number;
            count++;
        }
        
        // Print the average of the numbers on the list,
        // and change it to double type
        System.out.println("Average: " + ((double) sum / count));
    }
}
