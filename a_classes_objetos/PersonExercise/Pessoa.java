import javax.swing.JOptionPane;

public class Pessoa {
    String nome;
    Double peso;
    Double altura;
    char sexo;

    void cadastrar(){
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
        sexo = JOptionPane.showInputDialog("Informe a altura: ").toUpperCase().charAt(0);
    }

    double calculaIMC(){
        return peso/(altura * altura);
    }

    String avaliacao(){
        String ret = "";
        double imc = calculaIMC();

        if (sexo == 'M') {
            if (imc < 20.7) {
                ret = "Abaixo do peso";
            } else if (imc >= 20.7 && imc < 26.4) {
                ret = "Peso ideal";
            } else if (imc >= 26.5 && imc < 27.8) {
                ret = "Pouco acima do peso";
            } else if (imc >= 27.9 && imc < 31.1) {
                ret = "Acima do peso";
            } else {
                ret = "Obesidade";
            }
        } else if (sexo == 'F') {
            if (imc < 19.1) {
                ret = "Abaixo do peso";
            } else if (imc >= 19.1 && imc < 25.8) {
                ret = "Peso ideal";
            } else if (imc >= 25.9 && imc < 27.3) {
                ret = "Pouco acima do peso";
            } else if (imc >= 27.4 && imc < 32.3) {
                ret = "Acima do peso";
            } else {
                ret = "Obesidade";
            }
        }
        return ret;
    }

    String exibir_dados(){
        return nome + " - " + calculaIMC() + " - " + avaliacao() + "\n";
    }
}