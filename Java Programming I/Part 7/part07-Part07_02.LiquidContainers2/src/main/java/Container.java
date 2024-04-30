/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Container {
    
    private int water;
    
    public int contains() {
        return this.water;
    }
    
    public void add(int amount) {
        if (amount >= 0) {
            this.water += amount;

            if (this.water > 100) {
                this.water = 100;
            }  
        }
    }
    
    public void remove(int amount) {
        this.water -= amount;
        
        if (this.water < 0) {
            this.water = 0;
        }
    }
    
    public String toString() {
        return this.water + "/100";
    }
}
