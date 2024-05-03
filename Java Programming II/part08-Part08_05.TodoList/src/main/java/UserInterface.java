
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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList newList, Scanner newScanner) {
        this.list = newList;
        this.scanner = newScanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            
            this.processCommands(command);
        }
    }

    private void processCommands(String command) {
        if (command.equals("add")) {
            this.addToList();
        } else if (command.equals("list")) {
            this.printList();
        } else if (command.equals("remove")) {
            this.removeTask();
        }
    }
    
    private void addToList() {
        System.out.println("To add:");
        String newTask = this.scanner.nextLine();
        this.list.add(newTask);
    }


    private void printList() {
        this.list.print();
    }

    private void removeTask() {
        System.out.println("Which one is removed?");
        int index = Integer.parseInt(this.scanner.nextLine());
        this.list.remove(index);
    }
}
