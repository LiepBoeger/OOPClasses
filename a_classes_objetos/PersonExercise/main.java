import javax.swing.JOptionPane;

public class main {
    public static void principal(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pessoas: "));
        Pessoa pessoas[] = new Pessoa[n];
        String resultado = "";

        for (int i = 0; i < n; i++){
            Pessoa p = new Pessoa();
            p.cadastrar();
            pessoas[i] = p;
            resultado = p.exibir_dados();
        }

        JOptionPane.showMessageDialog(null, resultado);
    }    
}
