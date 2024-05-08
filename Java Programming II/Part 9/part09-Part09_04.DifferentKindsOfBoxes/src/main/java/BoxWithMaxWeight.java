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
public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int amount = item.getWeight();
        for (Item itemInList : items) {
            amount+= itemInList.getWeight();
        }
        
        if (amount <= capacity) {
            items.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        
        return false;
    }
}
