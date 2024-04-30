
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] command = input.split(" ");
            
            if (command[0].equals("add")) {
                if (Integer.valueOf(command[1]) < 0) {
                    continue;
                }
                firstContainer += Integer.parseInt(command[1]);
                if (firstContainer > 100) {
                    firstContainer = 100;
                } else if (firstContainer < 0) {
                    firstContainer = 0;
                }
            } else if (command[0].equals("move")) {
                if (Integer.valueOf(command[1]) < 0 || firstContainer == 0) {
                    continue;
                }
                
                firstContainer -= Integer.parseInt(command[1]);
                int movingWater = Integer.parseInt(command[1]);
                
                if (firstContainer < 0) {
                    movingWater = Integer.parseInt(command[1]) + firstContainer;
                }
                
                if (firstContainer > 100) {
                    firstContainer = 100;
                } else if (firstContainer < 0) {
                    firstContainer = 0;
                }
                
                
                secondContainer +=  movingWater;
                
                if (secondContainer > 100) {
                    secondContainer = 100;
                } else if (secondContainer < 0) {
                    secondContainer = 0;
                }
            } else if (command[0].equals("remove")) {
                if (Integer.valueOf(command[1]) < 0) {
                    continue;
                }
                
                secondContainer -= Integer.parseInt(command[1]);
                
                if (secondContainer > 100) {
                    secondContainer = 100;
                } else if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }
            
            

        }
    }

}
