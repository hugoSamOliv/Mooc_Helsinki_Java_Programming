
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
public class Database {
    private ArrayList<Bird> birds;
    
    
    public Database() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
    
    public void all() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void one(int number) {
        System.out.println(this.birds.get(number));
    }

    public ArrayList<Bird> getBirds() {
        return this.birds;
    }
    
    
}
