
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int counter = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < counter; i++) {
            printText();
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
