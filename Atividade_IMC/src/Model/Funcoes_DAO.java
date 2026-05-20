
package Model;
import static View.Inicio_GUI.*;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
    public static String nome="", classificacao="";
    public static float altura=0, peso=0, resp=0;
    public static int idade=0;
    public static void getInfo() {
        nome = NOME_TXT.getText();
        peso = Float.parseFloat(PESO_TXT.getText());
        idade = Integer.parseInt(IDADE_TXT.getText());
        altura = Float.parseFloat(ALTURA_TXT.getText());
        
    }
    public static void showRes() {
        PessoaNOME_TXT.setText(nome);
        PessoaNOME_TXT.setVisible(true);
        PessoaIDADE_TXT.setText(String.valueOf(idade));
        PessoaIDADE_TXT.setVisible(true);
        PessoaALT_TXT.setText(String.valueOf(altura));
        PessoaALT_TXT.setVisible(true);
        PessoaPESO_TXT.setText(String.valueOf(peso));
        PessoaPESO_TXT.setVisible(true);
        PessoaCLASS_TXT.setText(classificacao);
        PessoaCLASS_TXT.setVisible(true);
        PessoaIMC_TXT.setText(String.valueOf(resp));
        PessoaIMC_TXT.setVisible(true);
    }
    public static void calcular(){
        getInfo();
        resp = peso / (altura * altura);
        if(resp < 16 ){
            classificacao = "Magreza Grau III";
        }else if(resp < 16.9){
            classificacao = "Magreza Grau II";
        }else if(resp < 18.4){
            classificacao = "Magreza Grau I";
        }else if(resp < 24.9){
            classificacao = "Eutrofia";
        }else if(resp < 29.9){
            classificacao = "Pré-obesidade";
        }else if(resp < 34.9){
            classificacao = "Obesidade moderada (grau I)";
        }else if(resp < 39.9){
            classificacao = "Obesidade severa (grau II)";
        }else{
            classificacao = "Obesidade muito severa (grau III)";
        }
        NOME_TXT.setText("");
        ALTURA_TXT.setText("");
        PESO_TXT.setText("");
        IDADE_TXT.setText("");
    }
    public static void sair(){
        System.exit(0);
    }
    public static void limpar(){
        NOME_TXT.setText("");
        ALTURA_TXT.setText("");
        PESO_TXT.setText("");
        IDADE_TXT.setText("");
        PessoaNOME_TXT.setText("");
        PessoaIDADE_TXT.setText("");
        PessoaALT_TXT.setText("");
        PessoaPESO_TXT.setText("");
        PessoaCLASS_TXT.setText("");
        PessoaIMC_TXT.setText("");
    }
}
