/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author hugo
 */
public class StandardSensor implements Sensor {

    private int sensorNumber;
    
    public StandardSensor(int number) {
        this.sensorNumber = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public int read() {
        return this.sensorNumber;
    }
    
    @Override
    public void setOff() {
        
    }

    @Override
    public void setOn() {
        
    }
    
    
    
}
