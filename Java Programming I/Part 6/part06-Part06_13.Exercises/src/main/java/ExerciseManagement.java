
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
            
    public ArrayList<String> exerciseList() { 
        ArrayList<String> list = new ArrayList<>();
        
        for (Exercise exercise : this.exercises) {
            list.add(exercise.getExerciseName());
        }
        
        return list;    
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String newExercise) {
       for (Exercise exercise : exercises) {
           if (exercise.getExerciseName().equals(newExercise)) {
               exercise.setCompleted(true);
           }
       }
    }
    
    public boolean isCompleted(String newExercise) {
        for (Exercise exercise : this.exercises) {
            if (exercise.getExerciseName().equals(newExercise)) {
                return exercise.isCompleted();
            }
        }
        
        return false;
    }

    public void removeExercise(String newExercise) {
        Exercise exerciseToBeRemoved = this.exercises.get(0);
        for (Exercise exercise : exercises) {
            if (exercise.getExerciseName().equals(newExercise)) {
                exerciseToBeRemoved = exercise;
                break;
            }
        }
        
        this.exercises.remove(exerciseToBeRemoved);
    }

}
