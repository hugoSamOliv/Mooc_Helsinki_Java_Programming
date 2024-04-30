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
    private PointsManager manager;
    private Scanner scanner;
    
    public UserInterface() {
        this.manager = new PointsManager();
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        int userInput = 0;
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            userInput = Integer.parseInt(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            
            manager.add(userInput);
        }
        
        System.out.println("Point average (all): " + manager.average());
        if (manager.averagePassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + manager.averagePassing());
        }
        
        System.out.println("Pass percentage: " + manager.passingPercent());
        System.out.println("Grade distribution: ");
        manager.printStars();
    }
}
