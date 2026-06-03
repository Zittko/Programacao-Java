package Model;

import static View.Inicio_GUI.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;



public class Pesquisa_DAO {
    public static String rua;
    public static String bairro;
    public static String cidade;
    public static String uf;
    public static void buscarCep(String cep) 
    {
        String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
                       
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
           
                             
            rua = array[7];
            cidade = array[23];
            bairro = array[19];
            uf = array[27];
            
            rua_txt.setText(rua);
            bairro_txt.setText(bairro);
            cidade_txt.setText(cidade);
            estado_txt.setText(uf);
            ok_img.setVisible(true);
            erro_img.setVisible(false);
            msg_txt.setText("CEP ENCONTRADO");
        
            
        } catch (Exception e) {
          //  throw new RuntimeException(e);
            cep_txt.setText("");
            rua_txt.setText("");
            bairro_txt.setText("");
            cidade_txt.setText("");
            estado_txt.setText("");
            erro_img.setVisible(true);
            msg_txt.setText("CEP NÃO ENCONTRADO");
        }
    }

}
