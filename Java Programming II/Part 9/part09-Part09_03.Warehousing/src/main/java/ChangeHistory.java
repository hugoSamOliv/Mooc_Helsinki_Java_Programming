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
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double biggest = this.history.get(0);
        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) > biggest) {
                biggest = this.history.get(i);
            }
        }
        
        return biggest;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double smallest = this.history.get(0);
        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) < smallest) {
                smallest = this.history.get(i);
            }
        }
        
        return smallest;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (Double number : this.history) {
            sum += number;
        }
        
        return sum / this.history.size();
    }
}
