package aula8;

import javax.swing.JOptionPane;

public class Aula8 {

    public static void aula8(String[] args) {
        float n1, n2 , n3, media;
        String x = JOptionPane.showInputDialog(null, "Digite a primeira nota", "Notas", -1);
        n1 = Float.parseFloat(x);
        String y = JOptionPane.showInputDialog(null, "Digite a segunda nota", "Notas", -1);
        n2 = Float.parseFloat(y);
        String z = JOptionPane.showInputDialog(null, "Digite a terceira nota", "Notas", -1);
        n3 = Float.parseFloat(z);
        media = (n1 + n2 + n3)/3;
        JOptionPane.showMessageDialog(null, "A média do aluno é: "+media);
    }
    
}