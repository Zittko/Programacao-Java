package Model;

import static View.Inicio_GUI.*;

public class funcoes_DAO {
    static int cod;
    static String nom;
    static String em;
    static long tel;
    
    public static void salvar() {
        

        

        String url = "jdbc:mysql://localhost/aprender"; // enderço do BD 

        String username = "root";        //nome de um usuário de seu BD 

        String password = "";  // senha do BD 

        nom = nome_txt.getText(); // recebendo o nome 
        em = email_txt.getText(); // recebendo o email 
        tel = Long.valueOf(telefone_txt.getText());// recebendo o telefone 

 

      Controler.conexao.carregaDriver(); 

        

      try {  

                

                    

                

            Connection con = null; 

             

             

    try { 

    con = (Connection) DriverManager.getConnection(url, username, password); 

    } catch (SQLException ex) { 

 

    Logger.getLogger(Tela1.class.getName()).log(Level.SEVERE, null, ex); 

 

             

                   } 

 

            // Recebendo os dados a serem inseridos na tabela 

            String sql = "INSERT INTO cliente(cli_nome,cli_email,cli_tel) values('"+nom+"','"+em+"','"+tel+"')"; 

      

            try { // Tratamento de Erros para inserção 

 

                // Criando varialvel que executara a inserção 

                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql); 

                inserir.execute(); // Executando a inserção 

 

  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1); 

                nome.setText(""); 

                email.setText(""); 

                telefone.setText(""); 

            } catch (Exception ex) { 

                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0); 

            } 

 

        }catch(NumberFormatException erro){ 

            // Tratamento de erro caso o usuario não digite o telefone corretamente 

            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0); 

            telefone.setText(""); 

        } 

 

        

              }
    }
}
