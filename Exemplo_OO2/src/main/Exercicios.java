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
    
    public static void exe3() {
        String show = "";
        for (int c = 1; c <= 100; c++) {
            if (c % 3 == 0) {
                show = show + c + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, show, "MULTIPLOS DE 3", 1);
    }
    
    public static void exe4() {
        int a = 0, b = 0, c = 0, t = 0;
        String x = "";
        
        x = JOptionPane.showInputDialog(null, "Digite o valor 1");
        a = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite o valor 1");
        b = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite o valor 1");
        c = Integer.parseInt(x);
        
        for (int cont = 1; cont <= 3; cont++) {
            if (a > b) {
                t = a;
                a = b;
                b = c;
            } else if (b > c) {
                t = b;
                b = c;
                c = t;
            }
        }
        
        JOptionPane.showMessageDialog(null, a+"/n"+b+"/n"+c);
    }
    
    public static void exe5() {
        String show = "";
        for (int i = 7; i < 200; i = i + 7) {
            show = show + i + "\n";
        
        }
        JOptionPane.showMessageDialog(null, show, "MULTIPLOS DE 7 MENORES QUE 200",1);
    }
    
    public static void exe6() {
        String show = "";
        for (int ct = 1; ct < 100; ct++) {
            if (ct % 4 == 0) {
                show = show + ct + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, show, "MULTIPLOS DE 4 MENORES QUE 100", 1);
    }
    
    public static void exe7() {
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
    
    public static void exe8() {
        String x = "";
        double soma = 0, media;
        int num;
        for (int i = 1; i <= 10; i++) {
            x = JOptionPane.showInputDialog(null, "Digite a idade do aluno " + i);
            num = Integer.parseInt(x);
            soma += num;
        }
        media = (soma / 10);
        JOptionPane.showMessageDialog(null, "A média de idade dos 10 alunos é: "+media, "MEDIA", -1);
    }
}
