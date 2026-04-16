/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Menu_GUI {
    
    public static void Menu () {
        String x = JOptionPane.showInputDialog(null, "Calculadora \n1- Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
        int op = Integer.parseInt(x);
        switch(op) {
            case 1:
                Model.Operacoes_DAO.Soma();
                break;
            case 2:
                Model.Operacoes_DAO.Subtracao();
                break;
            case 3:
                Model.Operacoes_DAO.Divisao();
                break;
            case 4:
                Model.Operacoes_DAO.Mult();
                break;
            default:
                break;
        }
    }
    
}
