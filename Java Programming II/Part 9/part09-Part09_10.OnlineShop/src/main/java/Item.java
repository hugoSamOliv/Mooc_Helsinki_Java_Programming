/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Item {
    private String product;
    private int qty;
    private int price;

    public Item(String product, int qty, int price) {
        this.product = product;
        this.qty = qty;
        this.price = price;
    }
    
    public int price() {
        return price * qty;
    }
    
    public void increaseQuantity() {
        qty++;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
}
