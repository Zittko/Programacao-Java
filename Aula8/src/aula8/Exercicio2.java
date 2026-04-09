package aula8;
import javax.swing.JOptionPane;

public class Exercicio2 {
    
    public static void main(String[] args) {
        float n1, n2, soma, sub, mult, div;
        String x = JOptionPane.showInputDialog(null, "Digite o número 1", "", -1);
        n1 = Float.parseFloat(x);
        String y = JOptionPane.showInputDialog(null, "Digite o número 2", "", -1);
        n2 = Float.parseFloat(y);
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+soma, "SOMA", 1);
        JOptionPane.showMessageDialog(null, n1+" - "+n2+" = "+sub, "SUBTRAÇÃO", 1);
        JOptionPane.showMessageDialog(null, n1+" * "+n2+" = "+mult, "MULTIPLICAÇÃO", 1);
        JOptionPane.showMessageDialog(null, n1+" / "+n2+" = "+div, "DIVISÃO", 1);
    }
    
}
