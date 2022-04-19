
package aula8;

import java.text.ParseException;
import javax.swing.JOptionPane;

public class Empresa {
    public static void main(String[] args) throws ParseException {
        
        Funcionario f = new Funcionario();
        
        f.setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcionário: "));
        f.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CPF do funcionário: ")));
        f.setRg(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o RG do funcionário: ")));
        f.setDataNascimento(JOptionPane.showInputDialog(null, "Digite a data de nascimento do funcionário: "));
        JOptionPane.showMessageDialog(null, f.resultado());
    }
    
}
