import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Aluno {
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private Map<Disciplina, List<Double>> notas = new HashMap<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Map<Disciplina, List<Double>> getNotas() {
        return notas;
    }
}