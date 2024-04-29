/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
import java.util.ArrayList;

public class Stack {
    
    ArrayList<String> list = new ArrayList<>();
    
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public void add(String value) {
        this.list.add(0, value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> listValues = new ArrayList<>();
        
        for (String element : this.list) {
            listValues.add(element);
        }
        
        return listValues;
    }
    
    public String take() {
        String takenElement = this.list.get(0);
        this.list.remove(0);
        
        return takenElement;
    }
}
