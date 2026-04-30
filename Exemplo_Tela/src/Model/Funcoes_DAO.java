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
public class Funcoes_DAO {
    public static void fechar() {
        // System.exit(0);
//        String x = JOptionPane.showInputDialog(null, "Deseja realmente sair? \n1 - Sim\n0 - Não");;
//        int op = Integer.parseInt(x);
//        if (op == 1) {
//            System.exit(0);
//        } else if(op == 0) {
//            JOptionPane.showMessageDialog(null, "Voltando ao sistema...");
//        } else {
//            JOptionPane.showMessageDialog(null, "Opção Inválida");
//        }
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");
        if (op == 0) {
            System.exit(0);
        } else if(op == 1) {
            JOptionPane.showMessageDialog(null, "Voltando ao sistema...");
        } else if(op == 2){
        } else {
            JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
    }
}
