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
                "Escolha uma op��o:\n" +
                "1 - Cadastrar Professor\n" +
                "2 - Cadastrar Disciplina\n" +
                "3 - Realizar Matr�cula\n" +
                "4 - Informar Notas\n" +
                "5 - Listar Disciplinas de um Aluno com M�dia\n" +
                "6 - Listar Disciplinas Lecionadas por Professores com P�s-Gradua��o\n" +
                "7 - Sair"
            );

            switch (opcao) {
                case "1":
                    String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor:");
                    int formacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a forma��o do professor (1 - gradua��o, 2 - especializa��o, 3 - p�s gradua��o):"));
                    Professor professor = new Professor(nomeProfessor, formacao);
                    professores.add(professor);
                    JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                    break;

                case "2":
                    String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
                    int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga hor�ria da disciplina:"));
                    String nomeProfessorDisciplina = JOptionPane.showInputDialog("Digite o nome do professor que lecionar� a disciplina:");
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
                        JOptionPane.showMessageDialog(null, "Professor n�o encontrado. Cadastre o professor primeiro.");
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
                    StringBuilder disciplinasPosGraduacao = new StringBuilder("Disciplinas lecionadas por professores com p�s-gradua��o:\n");

                case "7":
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
                    break;
            }
        }
    }
}
