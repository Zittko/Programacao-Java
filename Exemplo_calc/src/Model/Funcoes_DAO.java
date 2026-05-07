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
    public static int n1 = 0, n2 = 0, res = 0;
    public static void sum() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        res = n1 + n2;
        RESULT_TXT.setText(String.valueOf(res));
        RESULT_TXT.setCaretColor(Color.red);
    }
    public static void sub() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        res = n1 - n2;
        RESULT_TXT.setText(String.valueOf(res));
    }
    public static void mult() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        res = n1 *n2;
        RESULT_TXT.setText(String.valueOf(res));
    }
    public static void div() {
        n1 = Integer.parseInt(VALUE1_TXT.getText());
        n2 = Integer.parseInt(VALUE2_TXT.getText());
        res = n1 / n2;
        RESULT_TXT.setText(String.valueOf(res));
    }
    public static void clear() {
        VALUE1_TXT.setText("");
        VALUE2_TXT.setText("");
        RESULT_TXT.setText("");
    }
}
