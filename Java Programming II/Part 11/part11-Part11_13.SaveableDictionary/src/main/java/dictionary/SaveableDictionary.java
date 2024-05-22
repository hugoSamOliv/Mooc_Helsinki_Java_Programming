/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class SaveableDictionary {
    private Map<String, String> wordsAndTranslation;
    private String file;
    
    public SaveableDictionary() {
        wordsAndTranslation = new HashMap<>();
    }
    
    public SaveableDictionary(String newFile) {
        this();
        file = newFile;
    }
    
    public boolean load() {
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(":"))
                    .forEach(line -> {
                        this.add(line[0], line[1]);
                    });
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        ArrayList<String> listOfWordsAndTranslations = new ArrayList<>();
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String word : wordsAndTranslation.keySet()) {
                if (!listOfWordsAndTranslations.contains(word)) {
                    writer.println(word + ":" + wordsAndTranslation.get(word));
                    listOfWordsAndTranslations.add(word);
                    listOfWordsAndTranslations.add(wordsAndTranslation.get(word));       
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        if (wordsAndTranslation.containsKey(words) || wordsAndTranslation.containsValue(translation)) {
            return;
        }
        
        wordsAndTranslation.put(words, translation);
        wordsAndTranslation.put(translation, words);
    }
    
    public String translate(String word) {
        try {
            return wordsAndTranslation.get(word);
        } catch (NullPointerException e) {
            return null;
        }
    }
    
    public void delete(String word) {
        wordsAndTranslation.remove(this.translate(word));
        wordsAndTranslation.remove(word);
    }
}
