
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("");
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] partsOfInput = input.split(" ");
            String command = partsOfInput[0];
            int amount = Integer.parseInt(partsOfInput[1]);
            
            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else if (command.equals("move")) {
                if (firstContainer.contains() == 0) {
                    continue;
                }
                
                int wastedWater = firstContainer.contains() - amount;
                firstContainer.remove(amount);
                
                if (wastedWater < 0) {
                    wastedWater *= -1; 
                    secondContainer.add(amount - wastedWater);
                } else {
                    secondContainer.add(amount);
                }
                
            }

        }
    }

}
