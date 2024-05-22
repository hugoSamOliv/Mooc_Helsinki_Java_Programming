/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author hugo
 */
public class TemperatureSensor implements Sensor{
    
    private boolean switchButton;
    
    public TemperatureSensor() {
        this.switchButton = false;
    }

    @Override
    public boolean isOn() {
        return this.switchButton;
    }

    @Override
    public int read() {
        if (switchButton == false) {
            throw new IllegalArgumentException();
        }
        
        return new Random().nextInt(61) - 30;
    }

    @Override
    public void setOff() {
        this.switchButton = false;
    }

    @Override
    public void setOn() {
        this.switchButton = true;
    }
    
    
}
