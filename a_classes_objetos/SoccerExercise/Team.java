package a_classes_objetos.SoccerExercise;

import java.util.ArrayList;
import java.util.List;

class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void newPlayer(Player player) {
        players.add(player);
    }

    public List<Player> listPlayers() {
        return players;
    }

    public Player playerWithMoreGoals() {
        Player playerMoreGoals = null;
        int maxGoals = -1;

        for (Player player : players) {
            if (player.gettotalGoals() > maxGoals) {
                maxGoals = player.gettotalGoals();
                playerMoreGoals = player;
            }
        }

        return playerMoreGoals;
    }

    public int totalGoalsTeam() {
        int totalGoals = 0;

        for (Player player : players) {
            totalGoals += player.gettotalGoals();
        }

        return totalGoals;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}