
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
public class IOU {
    private HashMap<String, Double> oweList;
    
    public IOU() {
        oweList = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        oweList.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (oweList.containsKey(toWhom)) {
            return oweList.get(toWhom);
        }
        
        return 0;
    }
}
