package a_classes_objetos.SoccerExercise;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<Times> times = new ArrayList<>();

        int numTimes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de times:"));

        for (int i = 0; i < numTimes; i++) {
            String nomeTime = JOptionPane.showInputDialog("Digite o nome do time " + (i + 1) + ":");
            Times time = new Times(nomeTime);

            int numJogadores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de jogadores para o time " + nomeTime + ":"));

            for (int j = 0; j < numJogadores; j++) {
                String nomeJogador = JOptionPane.showInputDialog("Digite o nome do jogador " + (j + 1) + " do time " + nomeTime + ":");
                int numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da camisa do jogador " + nomeJogador + ":"));
                int golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de gols marcados pelo jogador " + nomeJogador + ":"));

                Jogador jogador = new Jogador(nomeJogador, numeroCamisa, golsMarcados);
                time.cadastrarJogador(jogador);
            }

            times.add(time);
        }

        StringBuilder result = new StringBuilder();

        for (Times time : times) {
            result.append("Time: ").append(time.toString()).append("\n");
            result.append("Jogadores: ").append(time.listarJogadores()).append("\n");
            result.append("Jogador com mais gols: ").append(time.jogadorComMaisGols()).append("\n");
            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}