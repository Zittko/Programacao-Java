/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Operacoes_DAO {
    public static String x = "";
    public static double n1 = 0, n2 = 0;
    public static void Soma() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        n1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor");
        n2 = Double.parseDouble(x);
        JOptionPane.showMessageDialog(null, "O resultado de "+n1+" + "+n2+" é: "+(n1+n2));
    }
    
    public static void Subtracao() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        n1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor");
        n2 = Double.parseDouble(x);
        JOptionPane.showMessageDialog(null, "O resultado de "+n1+" - "+n2+" é: "+(n1-n2));
    }
    public static void Divisao() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        n1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor");
        n2 = Double.parseDouble(x);
        JOptionPane.showMessageDialog(null, "O resultado de "+n1+" / "+n2+" é: "+(n1/n2));
    }
    public static void Mult() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
        n1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor");
        n2 = Double.parseDouble(x);
        JOptionPane.showMessageDialog(null, "O resultado de "+n1+" * "+n2+" é: "+(n1*n2));
    }
}
