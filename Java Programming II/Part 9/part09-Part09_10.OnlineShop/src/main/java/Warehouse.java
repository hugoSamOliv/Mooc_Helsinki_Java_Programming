import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Warehouse {
    
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productsPrice.put(product, price);
        productsStock.put(product, stock);
    }
    
    public int price(String product) {
        if (!productsPrice.containsKey(product)) {
            return -99;
        }
        
        return productsPrice.get(product);
    }
    
    public int stock(String product) {
        if (!productsStock.containsKey(product)) {
            return 0;
        }
        
        return productsStock.get(product);
    }
    
    
    public boolean take(String product) {
        int selectedStock = 0;
        
        if (productsStock.containsKey(product)) {
            selectedStock = productsStock.get(product);
        } else {
            return false;
        }
        
        if (selectedStock == 0) {
            return false;
        }
        
        selectedStock--;
        
        if (selectedStock < 0) {
            productsStock.put(product, 0);
            return false;
        }
        
        productsStock.put(product, selectedStock);
        
        return true;
    }
    
    public Set<String> products() {
        if (productsStock.isEmpty()) {
            return null;
        }
        
        Set<String> products = new HashSet<>();
        for (String productName : productsStock.keySet()) {
            products.add(productName);
        }
        
        return products;
    }
}
