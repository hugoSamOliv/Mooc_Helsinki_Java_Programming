
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
    private Database data;
    
    
    public UserInterface() {
        this.data = new Database();
    }
    
    public void start(Scanner scan) {
        while(true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            this.processCommands(command, scan);
            
        }
    }
    
    public void processCommands(String command, Scanner scan) {
        if (command.equals("Add")) {
            this.addCommand(scan);
        } else if (command.equals("Observation")) {
            this.observationCommand(scan);
        } else if (command.equals("All")) {
            this.allCommand();
        } else if (command.equals("One")) {
            this.oneCommand(scan);
        }
    }
    
    public void addCommand(Scanner scan) {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
            
        data.add(name, latinName);
    }
    
    public void observationCommand(Scanner scan) {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        for (int i = 0; i < this.data.getBirds().size(); i++) {
            Bird newBird = this.data.getBirds().get(i);
            if (newBird.getName().equals(name)) {
                this.data.getBirds().get(i).observation();
                break;
            }
            
            if (i == this.data.getBirds().size() - 1) {
                System.out.println("Not a bird!");
            }
        }   
    }
    
    public void allCommand() {
        this.data.all();
    }
    
    public void oneCommand(Scanner scan) {
        if (!this.data.getBirds().isEmpty()) {
            System.out.print("Bird? ");
            String name = scan.nextLine();
            for (Bird bird : this.data.getBirds()) {
                if (bird.getName().equals(name)) {
                    System.out.println(bird);
                }
            }
        }
    }
    
    public void scanner(Scanner scan) {
        
    }
}
