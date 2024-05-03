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
    private int substance;
    
    public Container() {
        this.substance = 0;
    }
    
    public int contains() {
        return this.substance;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.substance += amount;
        }
        
        if (this.substance > 100) {
            this.substance = 100;
        }
    }
    
    public void remove(int amount) {
        this.substance -= amount;
        
        if (this.substance < 0) {
            this.substance = 0;
        }
    }
    
    public String toString() {
        return this.substance + "/100";
    }
}
