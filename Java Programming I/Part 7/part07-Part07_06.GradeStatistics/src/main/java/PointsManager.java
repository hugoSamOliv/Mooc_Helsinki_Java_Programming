
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
public class PointsManager {
    private ArrayList<Integer> points;
    private int passingCount;
            
    public PointsManager() {
        this.points = new ArrayList<>();
    }
    
    public void add(int number) {
        if (number >= 0 && number <= 100){
            this.points.add(number); 
        }
        
        if (number >= 50 && number <= 100) {
            this.passingCount++;
        }
    }

    public double average() {
        int sum = 0;
        for (Integer point : this.points) {
            sum += point;
        }
        
        return (double) sum / this.points.size();
    }

    public double averagePassing() {
        if (this.passingCount == 0) {
            return -1;
        }
        
        int sumPassing = 0;
        for (Integer pointsPassing : this.points) {
            if (pointsPassing >= 50) {
                sumPassing += pointsPassing;
            }
        }
        
        return (double) sumPassing / this.passingCount;
    }

    public double passingPercent() {
        return this.passingCount * 100.0 / this.points.size();
    }
    
    public int[] grade() {
        int[] grade = {0, 0, 0, 0, 0, 0};
        
        for (Integer point : this.points) {
            if (point < 50) {
                grade[0]++;
            } else if (point < 60) {
                grade[1]++;
            } else if (point < 70) {
                grade[2]++;
            } else if (point < 80) {
                grade[3]++;
            } else if (point < 90) {
                grade[4]++;
            } else if (point >= 90) {
                grade[5]++;
            }
        }
        
        return grade;
    }
    
    public void printStars() {
        int[] gradeToPrint = grade();
        
        for (int i = 5; i >= 0; i--) {
            int starsCount = gradeToPrint[i];
            System.out.print(i + ": ");
            for (int j = 0; j < starsCount; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
