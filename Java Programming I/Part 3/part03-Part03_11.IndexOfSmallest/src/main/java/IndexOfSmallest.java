
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ArrayList of integers
        ArrayList<Integer> intList = new ArrayList<>();
        
        // Variable for input
        int number;
        
        // Loop that adds numbers to the intList ArrayList
        // ADDS NUMBERS THE ARRAYLIST OF INTEGERS
        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            
            // Checks if number is equal to 9999, 
            // if so, breaks loop.
            if (number == 9999) {
                break;
            }
            
            // Adds number to the ArrayList
            intList.add(number);
        }
        
        // Space for visibility
        System.out.println("");
        
        // Gets first element of the ArrayList,
        // and call it smallest, for comparison later.
        int smallest = intList.get(0);
        
        // Compare the first element with the others
        // of the list. If such elements are smaller
        // than the first element, assign these elements
        // to the smallest variable.
        // SORTS THE SMALLEST ELEMENT
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < smallest) {
                smallest = intList.get(i);
            }
        }
        
        // Prints the smallest element
        System.out.println("Smallest number: " + smallest);
        
        // "Runs" through the ArrayList to get
        // the index where we can find the smallest element,
        // prints that to the console.
        // GETS INDEXES OF SMALLEST ELEMENT
        for (int k = 0; k < intList.size(); k++) {
            if (intList.get(k) == smallest) {
                System.out.println("Found at index: " + k);
            }
        }   
    }
}
