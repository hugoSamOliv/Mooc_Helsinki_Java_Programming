
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
public class TodoList {
    
    private ArrayList<String> taskList;
    
    public TodoList() {
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.taskList.add(task);
    }
    
    public void print() {
        for (int i = 0; i < this.taskList.size(); i++) {
            System.out.println((i + 1) + ": " + this.taskList.get(i));
        }
    }
    
    public void remove(int number) {
        int index = number - 1;
        this.taskList.remove(index); 
    }
}
