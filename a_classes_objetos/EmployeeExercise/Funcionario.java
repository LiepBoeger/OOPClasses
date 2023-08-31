package a_classes_objetos.EmployeeExercise;

import javax.swing.JOptionPane;

public class Funcionario {
    private static int totalFuncionarios = 0;
    private static int idadeMinima = 18;

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public static int getIdadeMinima() {
        return idadeMinima;
    }

    public static void contratar(String nome, int idade) {
        if (idade >= idadeMinima) {
            totalFuncionarios++;
            JOptionPane.showMessageDialog(null, "Successfully hired " + nome + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Cannot hire " + nome + " due to age restrictions.");
        }
    }

    public static void main(String[] args) {
        int numEmployees = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employees to hire:"));

        for (int i = 0; i < numEmployees; i++) {
            String nome = JOptionPane.showInputDialog("Enter employee's name:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Enter employee's age:"));
            contratar(nome, idade);
        }

        JOptionPane.showMessageDialog(null, "Total employees in the company: " + getTotalFuncionarios());
    }
}
