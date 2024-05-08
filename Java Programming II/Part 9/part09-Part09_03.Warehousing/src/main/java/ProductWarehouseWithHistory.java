/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyStatus;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        historyStatus = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        historyStatus.add(initialBalance);
    }
    
    public String history() {
        return this.historyStatus.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.historyStatus.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        this.historyStatus.add(this.getBalance());
        return received;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.historyStatus.maxValue());
        System.out.println("Smallest amount of product: " + this.historyStatus.minValue());
        System.out.println("Average: " + this.historyStatus.average());
    }
}
