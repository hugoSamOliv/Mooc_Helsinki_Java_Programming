
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int number = Integer.parseInt(splitInput[1]);
            
            if (command.equals("add")) {
                if (number > 0) {
                    first += number;
                }
                
                if (first > 100) {
                    first = 100;
                }
            } else if (command.equals("move")) {
                if (first == 0) {
                    continue;
                }
                
                first = first - number;
                
                int numberToMove = 0;
                if (first < 0) {
                    numberToMove = number + first;
                    first = 0;
                } else {
                    numberToMove = number;
                }
                
                second += numberToMove;
                
                if (second > 100) {
                    second = 100;
                }
            } else if (command.equals("remove")) {
                second = second - number;
                if (second < 0) {
                    second = 0;
                }
            }
            
            

        }
    }

}
