
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Recipe {
    private String name;
    private ArrayList<String> ingredients;
    private int time;
    
    public Recipe(String name, int time, ArrayList<String> list) {
        this.ingredients = list;
        this.name = name;
        this.time = time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    
    
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
