import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        scanFileIntoObject(recipes, file);
        
        UserInterface ui = new UserInterface(recipes, scanner);

        ui.start();
        
    }
    
    public static void scanFileIntoObject(ArrayList<Recipe> recipes, String file) {
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            String separatedText = "";
            while (scanFile.hasNextLine()) {
                String fileText = scanFile.nextLine();
                
                if (fileText.isEmpty() || !scanFile.hasNextLine()) {
                    String[] splitText = separatedText.split(",");
                    
                    String name = splitText[0];
                    int time = Integer.parseInt(splitText[1]);
                    ArrayList<String> ingredients = new ArrayList<>();
                    
                    for (int i = 2; i < splitText.length; i++) {
                        ingredients.add(splitText[i]);
                    }
                    
                    recipes.add(new Recipe(name, time, ingredients));
                    
                    separatedText = "";
                    continue;
                }
                
                separatedText = separatedText + fileText + ",";
            }
        } catch (Exception e) {

        }
    }

}
