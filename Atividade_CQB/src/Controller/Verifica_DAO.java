package Controller;

import static View.Login_GUI.*;
import View.Menu_GUI;
import javax.swing.JOptionPane;

    public class Verifica_DAO {
        public static int cont = 0;
        
        public static void verifica() {
            String login = LOGIN_TXT.getText();
            String senha = SENHA_TXT.getText();

            if (cont == 3) {
                JOptionPane.showMessageDialog(null, "Número de tentativas excedido");
                System.exit(0);
            } else {
                if (login.equals("ETEC") && senha.equals("a123")) {
                    JOptionPane.showMessageDialog(null, "Seja bem-vindo ao sistema");
                    new Menu_GUI().setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos. \nTente novamente.");
                    LOGIN_TXT.setText("");
                    SENHA_TXT.setText("");
                    cont++;
                }
            }
        }
    
}
