package a_classes_objetos.Construtores2109.ExMedicamento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Pessoa {
    private String nome;
    private String sintoma;
    private List<String> condicoesDeSaude;
    private List<Medicamento> medicamentosPrescritos;

    public Pessoa(String nome, String sintoma, List<String> condicoesDeSaude) {
        this.nome = nome;
        this.sintoma = sintoma;
        this.condicoesDeSaude = condicoesDeSaude;
        this.medicamentosPrescritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public List<String> getCondicoesDeSaude() {
        return condicoesDeSaude;
    }

    public List<Medicamento> getMedicamentosPrescritos() {
        return medicamentosPrescritos;
    }

    public void prescreverMedicamento(Medicamento medicamento) {
        if (verificarPrescricao(medicamento)) {
            medicamentosPrescritos.add(medicamento);
            JOptionPane.showMessageDialog(null, "Medicamento " + medicamento.getNome() + " prescrito para " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "A prescricao do medicamento " + medicamento.getNome() + " não é recomendada para " + nome);
        }
    }

    private boolean verificarPrescricao(Medicamento medicamento) {
        if (!medicamento.getIndicacoes().contains(sintoma)) {
            return false;
        }
        for (String condicao : condicoesDeSaude) {
            if (medicamento.getContraindicacoes().contains(condicao)) {
                return false;
            }
        }
        return true;
    }
}