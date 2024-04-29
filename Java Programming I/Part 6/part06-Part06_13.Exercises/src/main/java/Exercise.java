/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Exercise {
    private String exerciseName;
    private boolean completed;
    
    public Exercise(String name) {
        this.exerciseName = name;
        this.completed = false;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }
    
    
}
