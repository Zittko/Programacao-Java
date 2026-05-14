/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Inicio_GUI.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Funcoes_DAO {
    public static double n1 = 0, n2 = 0, res = 0;
    
    public static void getText() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
    }
    public static void showRes() {
        RESULT_TXT.setText(String.valueOf(res));
        RESULT_TXT.setVisible(true);
        RESULT_TXT.setBackground(Color.yellow);
        RESULT2_TXT.setText(String.valueOf(res));
    }
    public static void sum() {
        getText();
        res = n1 + n2;
        showRes();
    }
    public static void sub() {
        getText();
        res = n1 - n2;
        showRes();
    }
    public static void mult() {
        getText();
        res = n1 *n2;
        showRes();
    }
    public static void div() {
        getText();
        res = n1 / n2;
        showRes();
    }
    public static void pct() {
        n1 = Double.parseDouble(VALUE1_TXT.getText());
        n2 = Double.parseDouble(VALUE2_TXT.getText());
        res = n1 * (n2 * 0.01);
        showRes();
    }
    public static void pow() {
        getText();
        double number, val = 0;
        
        for (double i = 1; i <= n2; i++) {
            val += n1 * n1;
        }
        res = n1;
        showRes();
        res = 0;
    }
    public static void clear() {
        VALUE1_TXT.setText("");
        VALUE2_TXT.setText("");
        RESULT2_TXT.setText("");
        RESULT_TXT.setVisible(false);
    }
}
