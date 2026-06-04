package main;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws Exception {

        Document doc = null;
        OutputStream os = null;
        LocalDate localDate = LocalDate.now();//For reference
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LL yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        String data1 = localDate.format(formatter);
        String data2 = localDate.format(formatter2);
        String hora = localTime.format(DateTimeFormatter.ofPattern("HH:mm"));

        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 36, 36, 36, 36);

            //cria a stream de saída
            os = new FileOutputStream("C://Users//Laboratorio-Info//Documents//Programacao-Java//out.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();
            Font f1 = new Font(FontFamily.HELVETICA, 30, Font.BOLD);
            Font f2 = new Font(FontFamily.UNDEFINED, 16, Font.BOLD);
            Font brSpacing = new Font(FontFamily.UNDEFINED, 20, Font.BOLD);
            //adiciona o texto ao PDF
            String doutor = JOptionPane.showInputDialog(null, "DIGITE O NOME DO(A) MEDICO(A)");
            String valorDias = JOptionPane.showInputDialog(null, "QUANTOS DIAS O(A) PACIENTE FICARÁ AUSENTE?");
            int dias = Integer.parseInt(valorDias);
            Paragraph par = new Paragraph("ATESTADO MÉDICO", f1);
            Paragraph line = new Paragraph("_____________________________________________________________________________");
            par.setAlignment(Element.ALIGN_CENTER);
            Image img = Image.getInstance("C://Users//Laboratorio-Info//Documents//Programacao-Java//Exemplo_itextPDF//src//main//hapvida.png");
            img.setAbsolutePosition(0, 750);
            Paragraph p2 = new Paragraph("  Atesto que atendi nesta data o(a) Sr(a) " + doutor.toUpperCase() + " às " + hora + ", sendo necessário seu afastamento do local de trabalho ou escola por " + dias +" dia(s), a partir de " + data2 + ", tendo como causa do atendimento o código abaixo:", f2);
            Paragraph br = new Paragraph("      ", brSpacing);
            Paragraph cod = new Paragraph("CID 10-J11");
            Paragraph dot = new Paragraph(".............................");
            doc.add(img);
            doc.add(par);
            doc.add(line);
            doc.add(br);
            doc.add(br);
            doc.add(br);
            doc.add(p2);
            doc.add(br);
            doc.add(br);
            doc.add(cod);
            doc.add(dot);

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        
        Desktop.getDesktop().open(new File("C://Users//Laboratorio-Info//Documents//Programacao-Java//out.pdf"));
    }
    
}
