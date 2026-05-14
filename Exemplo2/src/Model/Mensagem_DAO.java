/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import static View.Inicio_GUI.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Mensagem_DAO {
    public static void call() {
        String x = NOME_TXT.getText();
        Imagem1.setVisible(true);
        JOptionPane.showMessageDialog(null, "O nome digitado foi: "+x);
    }
    
    public static void sair() {
        System.exit(0);
    }
    
}
