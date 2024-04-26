/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Games {
    
    private int homePoints;
    private int visitingPoints;
    private String homeTeam;
    private String visitingTeam;
    
    public Games() {
        
    }
    
    public Games(String homeTeam, int homePoints, String visitingTeam, int visitingPoints) {
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
    }
    
    public int getHomePoints() {
        return this.homePoints;
    }
    
    public int getVisitingPoints() {
        return this.visitingPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
}
