
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
public class Hold {
    
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public int suitcasesWeight() {
        int suitcasesWeight = 0;
        
        for (Suitcase suitcaseInHold : suitcases) {
            suitcasesWeight += suitcaseInHold.totalWeight();
        }
        
        return suitcasesWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.suitcasesWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.suitcasesWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
