
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Games> gameInfo = readGamesInfo(file);
        ArrayList<String> teams = new ArrayList<>();
        
        for (Games newGames : gameInfo) {
            teams.add(newGames.getHomeTeam());
            teams.add(newGames.getVisitingTeam());
        }
        
        int count = 0;
        for (int i = 0; i < teams.size(); i++) {
            if (team.equals(teams.get(i))) {
                count++;
            }
        }
        
        System.out.println("Games: " + count);
        
        int win = 0;
        int loss = 0;
        for (Games game : gameInfo) {
            if (team.equals(game.getHomeTeam())) {
                if (game.getHomePoints() > game.getVisitingPoints()) {
                    win++;
                } else {
                    loss++;
                }
            }
            
            if (team.equals(game.getVisitingTeam())) {
                if (game.getHomePoints() < game.getVisitingPoints()) {
                    win++;
                } else {
                    loss++;
                }
            }
        }
        
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        
    }
    
    public static ArrayList<Games> readGamesInfo(String file) {
        ArrayList<Games> gamesInfo = new ArrayList<>();
        try(Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String rawTeamInfo = scanFile.nextLine();
                
                String[] teamInfo = rawTeamInfo.split(",");
                
                String homeTeam = teamInfo[0];
                String visitingTeam = teamInfo[1];
                int homePoints = Integer.parseInt(teamInfo[2]);
                int visitingPoints = Integer.parseInt(teamInfo[3]);
                
                gamesInfo.add(new Games(homeTeam, homePoints, visitingTeam, visitingPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return gamesInfo;
    }

}
