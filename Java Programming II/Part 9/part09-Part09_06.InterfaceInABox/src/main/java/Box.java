
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
public class Box implements Packable{
    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable item) {
        if (this.checksCapacity(item)) {
            items.add(item);
        }
    }
    
    public boolean checksCapacity(Packable item) {
        double totalWeight = this.calculatesTotalWeight(item);
        
        return totalWeight <= capacity;
    }
    
    public double weight() {
        double totalWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).weight();
        }
        
        return totalWeight;
    }
    
    public double calculatesTotalWeight(Packable item) {
        double totalWeight = item.weight();
        for (int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).weight();
        }
        
        return totalWeight;
    }
    

    @Override
    public String toString() {
        double totalWeight = this.weight();
        
        return "Box: " + items.size() + " items, total weight " + totalWeight + " kg";
    }
    
    
    
}
