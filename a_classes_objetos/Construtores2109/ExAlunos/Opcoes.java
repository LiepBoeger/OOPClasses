import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Opcoes {
    public static void main(String[] args) {
        List<Professor> professores = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                "1 - Cadastrar Professor\n" +
                "2 - Cadastrar Disciplina\n" +
                "3 - Realizar Matrícula\n" +
                "4 - Informar Notas\n" +
                "5 - Listar Disciplinas de um Aluno com Média\n" +
                "6 - Listar Disciplinas Lecionadas por Professores com Pós-Graduação\n" +
                "7 - Sair"
            );

            switch (opcao) {
                case "1":
                    String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor:");
                    int formacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a formação do professor (1 - graduação, 2 - especialização, 3 - pós graduação):"));
                    Professor professor = new Professor(nomeProfessor, formacao);
                    professores.add(professor);
                    JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                    break;

                case "2":
                    String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
                    int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária da disciplina:"));
                    String nomeProfessorDisciplina = JOptionPane.showInputDialog("Digite o nome do professor que lecionará a disciplina:");
                    Professor professorDisciplina = null;
                    for (Professor p : professores) {
                        if (p.getNome().equals(nomeProfessorDisciplina)) {
                            professorDisciplina = p;
                            break;
                        }
                    }
                    if (professorDisciplina != null) {
                        Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHoraria, professorDisciplina);
                        disciplinas.add(disciplina);
                        JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado. Cadastre o professor primeiro.");
                    }
                    break;

                case "3":
                    String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
                    Aluno aluno = new Aluno(nomeAluno);
                    alunos.add(aluno);
                    JOptionPane.showMessageDialog(null, "Aluno matriculado com sucesso!");
                    break;

                case "4":
                    String nomeAlunoNotas = JOptionPane.showInputDialog("Digite o nome do aluno:");

                case "5":
                    String nomeAlunoMedia = JOptionPane.showInputDialog("Digite o nome do aluno:");

                case "6":
                    StringBuilder disciplinasPosGraduacao = new StringBuilder("Disciplinas lecionadas por professores com pós-graduação:\n");

                case "7":
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
