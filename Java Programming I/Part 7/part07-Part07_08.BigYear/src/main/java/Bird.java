/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations = 0;
    
    public Bird() {
        
    }

    public int getObservations() {
        return this.observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }
    
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        if (this.observations == 1) {
            return this.name + " (" + this.latinName + "): " + this.observations + " observation";
        }
        
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }

    void observation() {
        this.observations++;
    }
}
