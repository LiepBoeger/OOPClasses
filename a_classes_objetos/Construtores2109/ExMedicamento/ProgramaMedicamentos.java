package a_classes_objetos.Construtores2109.ExMedicamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class ProgramaMedicamentos {
    private static Map<String, Medicamento> medicamentos = new HashMap<>();
    private static Map<String, Pessoa> pessoas = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            String opcao = JOptionPane.showInputDialog("Escolha uma opcao:\n" +
                    "1 - Cadastrar Medicamento\n" +
                    "2 - Cadastrar Pessoa\n" +
                    "3 - Fazer Prescricao de Medicamento\n" +
                    "4 - Listar Pessoas e Medicamentos Prescritos\n" +
                    "5 - Sair");

            switch (opcao) {
                case "1":
                    cadastrarMedicamento();
                    break;
                case "2":
                    cadastrarPessoa();
                    break;
                case "3":
                    fazerPrescricao();
                    break;
                case "4":
                    listarPessoasEMedicamentos();
                    break;
                case "5":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarMedicamento() {
        String nome = JOptionPane.showInputDialog("Nome do Medicamento:");
        String administracao = JOptionPane.showInputDialog("Administracao (injetavel, topico, ou oral):");

        List<String> contraindicacoes = new ArrayList<>();
        String contraindicacao = JOptionPane.showInputDialog("Contraindicacoes (digite 'fim' para encerrar):");
        while (!contraindicacao.equalsIgnoreCase("fim")) {
            contraindicacoes.add(contraindicacao);
            contraindicacao = JOptionPane.showInputDialog("Contraindicacoes (digite 'fim' para encerrar):");
        }

        List<String> indicacoes = new ArrayList<>();
        String indicacao = JOptionPane.showInputDialog("Indicacoes (digite 'fim' para encerrar):");
        while (!indicacao.equalsIgnoreCase("fim")) {
            indicacoes.add(indicacao);
            indicacao = JOptionPane.showInputDialog("Indicacoes (digite 'fim' para encerrar):");
        }

        Medicamento medicamento = new Medicamento(nome, administracao, contraindicacoes, indicacoes);
        medicamentos.put(nome, medicamento);
        JOptionPane.showMessageDialog(null, "Medicamento cadastrado com sucesso.");
    }

    private static void cadastrarPessoa() {
        String nome = JOptionPane.showInputDialog("Nome da Pessoa:");
        String sintoma = JOptionPane.showInputDialog("Sintoma:");

        List<String> condicoesDeSaude = new ArrayList<>();
        String condicao = JOptionPane.showInputDialog("Condicoes de Saúde (digite 'fim' para encerrar):");
        while (!condicao.equalsIgnoreCase("fim")) {
            condicoesDeSaude.add(condicao);
            condicao = JOptionPane.showInputDialog("Condicoes de Saúde (digite 'fim' para encerrar):");
        }

        Pessoa pessoa = new Pessoa(nome, sintoma, condicoesDeSaude);
        pessoas.put(nome, pessoa);
        JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso.");
    }

    private static void fazerPrescricao() {
        String nomePessoa = JOptionPane.showInputDialog("Digite o nome da Pessoa:");
        Pessoa pessoa = pessoas.get(nomePessoa);

        if (pessoa == null) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
            return;
        }

        String nomeMedicamento = JOptionPane.showInputDialog("Digite o nome do Medicamento:");
        Medicamento medicamento = medicamentos.get(nomeMedicamento);

        if (medicamento == null) {
            JOptionPane.showMessageDialog(null, "Medicamento não encontrado.");
            return;
        }

        pessoa.prescreverMedicamento(medicamento);
    }

    private static void listarPessoasEMedicamentos() {
        StringBuilder output = new StringBuilder();

        for (Pessoa pessoa : pessoas.values()) {
            output.append("Nome da Pessoa: ").append(pessoa.getNome()).append("\n");
            output.append("Sintoma: ").append(pessoa.getSintoma()).append("\n");
            output.append("Condiçoes de Saúde: ").append(pessoa.getCondicoesDeSaude()).append("\n");
            output.append("Medicamentos Prescritos:\n");
            for (Medicamento medicamento : pessoa.getMedicamentosPrescritos()) {
                output.append("- Nome: ").append(medicamento.getNome()).append(", Administração: ").append(medicamento.getAdministracao()).append("\n");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}