
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, item);
        }
    }
    
    public int price() {
        int sum = 0;
        
        for (String product : cart.keySet()) {
            sum += cart.get(product).price();
        }
        
        return sum;
    }
    
    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }
}
