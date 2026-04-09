package aula8;
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        float Calc1, peso, altura;
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "", -1);
        String x = JOptionPane.showInputDialog(null, "Digite seu peso", "", -1);
        peso = Float.parseFloat(x);
        String y = JOptionPane.showInputDialog(null, "Digite sua altura", "", -1);
        altura = Float.parseFloat(y);
        Calc1 = peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"; Peso: "+peso+"; Altura: "+altura, "APRESENTAÇÃO", 1);
        JOptionPane.showMessageDialog(null, "Seu IMC é: "+Calc1, "IMC", 1);
    }
}
