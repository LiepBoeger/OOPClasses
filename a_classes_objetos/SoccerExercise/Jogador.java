package a_classes_objetos.SoccerExercise;

class Jogador {
    private String nome;
    private int numeroCamisa;
    private int golsMarcados;

    public Jogador(String nome, int numeroCamisa, int golsMarcados) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.golsMarcados = golsMarcados;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", golsMarcados=" + golsMarcados +
                '}';
    }
}