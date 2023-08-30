package a_classes_objetos.SoccerExercise;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();

        int numteams = Integer.parseInt(JOptionPane.showInputDialog("Number of teams:"));

        for (int i = 0; i < numteams; i++) {
            String teamName = JOptionPane.showInputDialog("Team name " + (i + 1) + ":");
            Team team = new Team(teamName);

            int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Total players for team " + teamName + ":"));

            for (int j = 0; j < numPlayers; j++) {
                String nameplayer = JOptionPane.showInputDialog("Player name" + (j + 1) + " of the team " + teamName + ":");
                int shirtNumber = Integer.parseInt(JOptionPane.showInputDialog("Shirt number of the player " + nameplayer + ":"));
                int totalGoals = Integer.parseInt(JOptionPane.showInputDialog("Total goals of the player " + nameplayer + ":"));

                Player player = new Player(nameplayer, shirtNumber, totalGoals);
                team.newPlayer(player);
            }

            teams.add(team);
        }

        StringBuilder result = new StringBuilder();

        for (Team team : teams) {
            result.append("Team: ").append(team.toString()).append("\n");
            result.append("Players: ").append(team.listPlayers()).append("\n");
            result.append("Plasyer with more goals: ").append(team.playerWithMoreGoals()).append("\n");
            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}