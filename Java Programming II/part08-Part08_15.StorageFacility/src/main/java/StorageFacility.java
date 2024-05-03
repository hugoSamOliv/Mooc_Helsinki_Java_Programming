
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storages;

    public StorageFacility() {
        storages = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storages.putIfAbsent(unit, new ArrayList<>());
        
        storages.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        if (storages.keySet().isEmpty() || !storages.containsKey(unit)) {
            return new ArrayList<>();
        }
        
        return storages.get(unit);
    }
    
    public void remove(String storageUnit, String item) {
        storages.get(storageUnit).remove(item);
        
        if (storages.get(storageUnit).isEmpty()) {
            storages.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>();
        for (String key : storages.keySet()) {
            keys.add(key);
        }
        
        return keys;
    }
    
}
