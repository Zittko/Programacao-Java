/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import View.Inicio_GUI.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Mensagem_DAO {
    public static void call() {
        JOptionPane.showMessageDialog(null, "Cadastro de cliente");
    }
    
    public static void sair() {
        System.exit(0);
    }
    
}
