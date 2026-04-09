package aula8;
import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static void exercicio1(String[] args) {
        Double valor, resultado;
        String x = JOptionPane.showInputDialog(null, "Digite um valor em reais (R$)", "", -1);
        valor = Double.parseDouble(x);
        resultado = valor * 0.1;
        JOptionPane.showMessageDialog(null, "10% de R$"+valor+" é "+resultado, "Resultado 10% do valor", 1);
    }
    
}