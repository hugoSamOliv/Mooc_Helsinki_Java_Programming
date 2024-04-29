
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner newScanner, SimpleDictionary newDictionary) {
        this.scanner = newScanner;
        this.dictionary = newDictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            } 
            
            commandProcessing(command);
            
        }
        
        System.out.println("Bye bye!");
    }
    
    public void commandProcessing(String input) {
        
        if (input.equals("add")) {
            this.add();
        } else if (input.equals("search")) {
            this.search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation:");
        String translation = this.scanner.nextLine();

        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated: ");
        String wordSearched = this.scanner.nextLine();

        String translatedWord = this.dictionary.translate(wordSearched);

        if (translatedWord == null) {
            System.out.println("Word "+ wordSearched +" was not found");
        } else {
            System.out.println("Translation: " + translatedWord);  
        }

    }
}
