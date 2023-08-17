import java.util.ArrayList;

import javax.swing.JOptionPane;

public class imc2{
    public static void main(String[] args){

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        String menu = "1 - Cadastrar\n"
                    + "2 - Listar\n"
                    + "3 - Sair";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if (op == 1){
                Pessoa p = new Pessoa();
                p.cadastrar();
                pessoas.add(p);
            }

            if (op == 2){
                String result = "Pessoas cadastradas\n";
                for (Pessoa p: pessoas){
                    result += p.exibir_dados();
                }
                JOptionPane.showMessageDialog(null, result);
            }
        } while(op != 3);
    }
}