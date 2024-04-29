
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager newManager, Scanner newScanner) {
        this.manager = newManager;
        this.scanner = newScanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - Stop");
            String command = this.scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            processCommand(command);
        }
    }

    private void processCommand(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String newJoke = scanner.nextLine();
            manager.addJoke(newJoke);
        } else if (command.equals("2")) {
            System.out.println(manager.drawJoke());
        } else if (command.equals("3")) {
            System.out.println("Printing the jokes.");
            manager.printJokes();
        }
    }
    
}
