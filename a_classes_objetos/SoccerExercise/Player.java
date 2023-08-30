package a_classes_objetos.SoccerExercise;

class Player {
    private String name;
    private int shirtNumber;
    private int totalGoals;

    public Player(String name, int shirtNumber, int totalGoals) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.totalGoals = totalGoals;
    }

    public int gettotalGoals() {
        return totalGoals;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "name='" + name + '\'' +
                ", shirtNumber=" + shirtNumber +
                ", totalGoals=" + totalGoals +
                '}';
    }
}