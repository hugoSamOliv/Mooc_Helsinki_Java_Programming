
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> multiDictionary;
    
    public DictionaryOfManyTranslations() {
        multiDictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        multiDictionary.putIfAbsent(word, new ArrayList<>());
        
        multiDictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if (multiDictionary.keySet().isEmpty() || !multiDictionary.containsKey(word)) {
            return new ArrayList<>();
        }
        
        return multiDictionary.get(word);
    }
    
    public void remove(String word) {
        multiDictionary.remove(word);
    }
}
