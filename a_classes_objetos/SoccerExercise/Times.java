package a_classes_objetos.SoccerExercise;

import java.util.ArrayList;
import java.util.List;

class Times {
    private String nome;
    private List<Jogador> jogadores;

    public Times(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void cadastrarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> listarJogadores() {
        return jogadores;
    }

    public Jogador jogadorComMaisGols() {
        Jogador jogadorMaisGols = null;
        int maxGols = -1;

        for (Jogador jogador : jogadores) {
            if (jogador.getGolsMarcados() > maxGols) {
                maxGols = jogador.getGolsMarcados();
                jogadorMaisGols = jogador;
            }
        }

        return jogadorMaisGols;
    }

    public int totalGolsTime() {
        int totalGols = 0;

        for (Jogador jogador : jogadores) {
            totalGols += jogador.getGolsMarcados();
        }

        return totalGols;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}