// Practicing aggregation of classes

import java.util.List;
import java.util.ArrayList;

// Player class 
class Player { 
  
    private int id;
    private String team;
    private String name;

    public Player(int id, String team, String name) {
        this.id = id;
        this.team = name;
        this.name = name;
    }

} 
  
/* Team class contains a list of Player
Objects.*/
class Team { 
  
    private List<Player> players;
    private String name;

    public Team(List<Player> players, String name) {
        this.players = players;
        this.name = name;
    }
    
    public List<Player> getPlayers() {
        return this.players;
    }
  
} 
  
/* School class contains a list of Team 
Objects.*/
class School { 
  
    private List<Team> teams;
    private String schoolName;

    public School(List<Team> teams, String schoolName) {
        this.teams = teams;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return this.schoolName;
    }
    
    public int getTotalPlayersInSchool() {
        int count = 0;
        for(Team team: this.teams) {
            count += team.getPlayers().size();
        }
        
        return count;
    }
  
}  
  
class SchoolDemo { 
  
    public static void main (String[] args) { 
        Player harris = new Player(1, "Red", "Harris");
        Player carol = new Player(2, "Red", "Carol");
        Player johnny = new Player(1, "Blue", "Johhny");
        Player sarah = new Player(2, "Blue", "Sarah");

        List<Player> redPlayers = new ArrayList<Player>();
        redPlayers.add(harris);
        redPlayers.add(carol);
        Team red = new Team(redPlayers, "Red");

        List<Player> bluePlayers = new ArrayList<Player>();
        bluePlayers.add(johnny);
        bluePlayers.add(sarah);
        Team blue = new Team(bluePlayers, "Blue");

        List<Team> allTeams = new ArrayList<Team>();
        allTeams.add(red);
        allTeams.add(blue);
        School schoolOfColors = new School(allTeams, "School of colors");
        int numOfPlayers = schoolOfColors.getTotalPlayersInSchool();
        System.out.println(schoolOfColors.getSchoolName() + " has " + numOfPlayers + " players");
    }
  
} 
