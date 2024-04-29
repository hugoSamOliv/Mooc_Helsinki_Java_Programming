
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
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList newList, Scanner newScanner) {
        this.todoList = newList;
        this.scanner = newScanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("list")) {
            this.list();
        } else if (command.equals("remove")) {
            this.remove();
        }
    }
    
    public void add() {
        System.out.println("To add:");
        String todoTask = this.scanner.nextLine();
        
        todoList.add(todoTask);
    }
    
    public void list() {
        todoList.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int index = Integer.parseInt(scanner.nextLine());
        
        todoList.remove(index);
    }
}
