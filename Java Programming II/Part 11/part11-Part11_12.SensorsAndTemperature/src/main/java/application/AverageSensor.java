/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hugo
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> sensorReadings;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        sensorReadings = new ArrayList();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return sensorReadings;
    }
    
    @Override
    public int read() {
        if (sensors.isEmpty() || this.isOn() == false) {
            throw new IllegalArgumentException();
        }
        
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        
        this.sensorReadings.add(sum / sensors.size());
        return sum / sensors.size();
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            boolean checkSensor = sensor.isOn();
            
            if (checkSensor == false) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }
    
    
}
