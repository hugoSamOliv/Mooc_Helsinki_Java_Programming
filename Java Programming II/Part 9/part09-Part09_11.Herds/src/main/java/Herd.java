
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Herd implements Movable {
    private List<Movable> movableObjects;

    public Herd() {
        movableObjects = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        movableObjects.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movableObjects) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String movableObjectsString = "";
        for (Movable movable : movableObjects) {
            movableObjectsString += movable.toString() + "\n";
        }
        
        return movableObjectsString;
    }
    
    
}
