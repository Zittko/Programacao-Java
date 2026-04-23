package main;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicios {
    public static void exemplo() {
        int[] valor = new int[5];
                     // 0,1,2,3,4,5
        int[] valor2 = {1,2,3,4,5,6};
        double[] valor3 = {1,2.89,3.67,4.56,5,6};
        String[] resp = {"ab", "resposta", "cd", "ef"};
        char [] resp2 = {'a', 'b', 'c', 'd'};
        
        valor[0] = 10;
        valor[1] = 10;
        valor[2] = 10;
        valor[3] = 10;
        valor[4] = 10;
        String show = "";
        for (int c = 0; c <= 4; c++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor "+(c+1));
            valor[c] = Integer.parseInt(x);
            show += valor[c] + " | ";
        }
        JOptionPane.showMessageDialog(null, show);
    }
    
    public static void exe2() {
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] mult = new int[10];
        String show = "";
        
        for (int c = 0; c < 10; c++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor "+(c+1)+" do vetor vet1");
            vet1[c] = Integer.parseInt(x);
        }
        for (int c = 0; c < 10; c++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor "+(c+1)+" do vetor vet2");
            vet2[c] = Integer.parseInt(x);
        }
        for (int c = 0; c < 10; c++) {
            mult[c] = (vet1[c] * vet2[c]);
            show += mult[c]+" | ";
        }
        JOptionPane.showMessageDialog(null, show, "Multiplicação dos vetores", -1);
    }
    
    public static void exe3() {
        int[] valor = new int[20];
        int ct = 0;
        String show = "";
        for (int c = 0; c < 20; c++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor "+(c+1));
            valor[c] = Integer.parseInt(x);
            show += valor[c] + " | ";
            if (valor[c] % 2 == 0) {
                ct ++;
            }
        }
        JOptionPane.showMessageDialog(null, "Números digitados: \n"+show+"\n Números pares contados: "+ct);
    }
    public static void exemplo2() {
        int[] valor = new int[20];
        Random gen = new Random();
        String show = "";
        
        for (int i = 0; i < 20; i++) {
            valor[i] = gen.nextInt(100);
        }
        Arrays.sort(valor);
        for (int i = 0; i < 20; i++) {
            show += valor[i] + " | ";
        }
        JOptionPane.showMessageDialog(null, show);
    }
    
    public static void exe4() {
        int[] valor = new int[10];
        int ct = 0;
        String show = "";
        for (int c = 0; c < 10; c++) {
            String x = JOptionPane.showInputDialog(null, "Digite o valor "+(c+1));
            valor[c] = Integer.parseInt(x);
        }
        Arrays.sort(valor);
        for (int c = 0; c < 10; c++) {
            if (valor[c] % 2 == 0) {
                show += valor[c] + " | ";
            }
        }
        JOptionPane.showMessageDialog(null, "Números pares: \n"+show);
    }
}
