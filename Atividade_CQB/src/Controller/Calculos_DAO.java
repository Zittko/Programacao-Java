package Controller;

import static View.Menu_GUI.*;

public class Calculos_DAO {
    public static void calcParede() {
        float altura = Float.parseFloat(HEIGHT_TXT.getText());
        float largura = Float.parseFloat(WIDTH_TXT.getText());
        float aParede = altura * largura;
        float aBloco = (float) (0.18 * 0.38);
        float qBloco = aParede/aBloco;
        float pMat = (float) (qBloco * 0.1);
        HEIGHT_TXT.setText("");
        WIDTH_TXT.setText("");
        MQUAD_TXT.setText(String.format("%.2f", aParede) + "m²");
        NBLOCKS_TXT.setText(String.valueOf(Math.ceil(qBloco)) + " blocos");
        PCT_TXT.setText(String.valueOf(Math.ceil(pMat)) + " blocos");
    }
    
    
    
}
