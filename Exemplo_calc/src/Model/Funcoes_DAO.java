/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Inicio_GUI.VALUE1_TXT;
import static View.Inicio_GUI.VALUE2_TXT;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Funcoes_DAO {
    public static int n1 = 0, n2 = 0;
    public static void sum() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        JOptionPane.showMessageDialog(null, n1+n2);
    }
    public static void sub() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        JOptionPane.showMessageDialog(null, n1-n2);
    }
    public static void mult() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        JOptionPane.showMessageDialog(null, n1*2);
    }
    public static void div() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        JOptionPane.showMessageDialog(null, n1/n2);
    }
    public static void clear() {
        VALUE1_TXT.setText("");
        VALUE2_TXT.setText("");
    }
}
