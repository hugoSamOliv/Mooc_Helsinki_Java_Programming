
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {     
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item listItems : this.items) {
            totalWeight += listItems.getWeight();
        }
        
        return totalWeight;
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() +" kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() +" kg)";
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
