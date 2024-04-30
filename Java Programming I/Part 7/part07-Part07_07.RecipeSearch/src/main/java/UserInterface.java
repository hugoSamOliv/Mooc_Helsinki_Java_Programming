
import java.util.ArrayList;
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
    private ArrayList<Recipe> recipes;
    private Scanner scanner;
    
    public UserInterface(ArrayList<Recipe> recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient \n");
            System.out.println("Enter command: ");
            String command = this.scanner.nextLine();
            String search;
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : this.recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : this.recipes) {
                    if (recipe.getName().contains(word)){
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxTime = Integer.parseInt(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe recipe : this.recipes) {
                    if (recipe.getTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : this.recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            System.out.println();
        }
    }
}
