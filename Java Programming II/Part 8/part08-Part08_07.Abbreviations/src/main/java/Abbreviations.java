
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
public class Abbreviations {
    HashMap<String, String> dictionary;

    public Abbreviations() {
    this.dictionary = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.dictionary.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.dictionary.containsKey(abbreviation)) {
            return true;
        }
        
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.dictionary.get(abbreviation);
    }
}
