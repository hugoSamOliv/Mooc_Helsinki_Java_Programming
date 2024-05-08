
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int value = Integer.parseInt(splitInput[1]);
            
            if (command.equals("add")) {
                first.add(value);
            } else if (command.equals("move")) {
                if (first.contains() == 0) {
                    continue;
                }
                
                if (first.contains() > value) {
                    first.remove(value);
                    second.add(value);
                } else {
                    second.add(first.contains());
                    first.remove(value);
                }
            } else if (command.equals("remove")) {
                second.remove(value);
            }
            
            
        }
    }

}
