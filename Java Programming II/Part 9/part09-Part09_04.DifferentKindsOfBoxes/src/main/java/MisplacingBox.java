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
public class MisplacingBox extends Box {
    private ArrayList<Item> hiddenItems;
    
    public MisplacingBox() {
        this.hiddenItems = new ArrayList<>();
    }
    
    public void add(Item item) {
        hiddenItems.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
}
