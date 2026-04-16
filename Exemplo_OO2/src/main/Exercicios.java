/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Exercicios {
    
    public static void exemplo() {
        String x = JOptionPane.showInputDialog(null, "Digite a tabuada desejada");
        double tab = Double.parseDouble(x);
        String show = "";
        for (int c = 1; c <= 10; c++) {
            show = show + tab+" x "+c+" = "+(tab*c)+ "\n";
        }
    }
    
    public static void exe1 () {
        String show = "";
        for (int c = 1; c <= 100; c++) {
            if (c % 3 == 0) {
                show = show + c + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, show, "MULTIPLOS DE 3", 1);
    }
    
    public static void exe2() {
        String x = JOptionPane.showInputDialog(null, "Digite o 1° valor");
        Double n1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o 2° valor");
        Double n2 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o 3° valor");
        Double n3 = Double.parseDouble(x);
        String show = "";
        if (n1 < n2 && n1 < n3) {
            show += "Menor número: "+n1+"\n";
            if (n2 < n3) {
                show += "Número médio: "+n2+"\n";
                show += "Maior número: "+n3+"\n";
            } else {
                show += "Número médio: "+n3+"\n";
                show += "Maior número: "+n2+"\n";
            }
            JOptionPane.showMessageDialog(null, show, "ORDENAGEM", 1);
        } else if (n2 < n1 && n2 < n3) {
            show += "Menor número: "+n2+"\n";
            if (n1 < n3) {
                show += "Número médio: "+n1+"\n";
                show += "Maior número: "+n3+"\n";
            } else {
                show += "Número médio: "+n3+"\n";
                show += "Maior número: "+n1+"\n";
            }
            JOptionPane.showMessageDialog(null, show, "ORDENAGEM", 1);
        } else {
            show += "Menor número: "+n3+"\n";
            if (n1 < n2) {
                show += "Número médio: "+n1+"\n";
                show += "Maior número: "+n2+"\n";
            } else {
                show += "Número médio: "+n2+"\n";
                show += "Maior número: "+n1+"\n";
            }
            JOptionPane.showMessageDialog(null, show, "ORDENAGEM", 1);
        }
    }
    
    public static void exe3() {
        String show = "";
        for (int i = 7; i < 200; i = i + 7) {
            show = show + i + "\n";
        
        }
        JOptionPane.showMessageDialog(null, show, "MULTIPLOS DE 7 MENORES QUE 200",1);
    }
    
    public static void exe4() {
        String show = "";
        for (int ct = 1; ct < 100; ct++) {
            if (ct % 4 == 0) {
                show = show + ct + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, show, "MULTIPLOS DE 4 MENORES QUE 100", 1);
    }
    
    public static void exe5() {
        String x = JOptionPane.showInputDialog(null, "digite um número");
        double n = Double.parseDouble(x);
        String show = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                show = show + i + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, show, "Divisores de "+ n, 1);
    }
}
