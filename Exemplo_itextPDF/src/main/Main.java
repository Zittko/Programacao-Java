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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        String data1 = localDate.format(formatter);
        String data2 = localDate.format(formatter2);
        String hora = localTime.format(DateTimeFormatter.ofPattern("HH:mm"));

        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 36, 36, 36, 36);

            //cria a stream de saída
            os = new FileOutputStream("C://Users//reido//OneDrive//Documents//Programacao-Java//out.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();
            Font f1 = new Font(FontFamily.HELVETICA, 30, Font.BOLD);
            Font f2 = new Font(FontFamily.UNDEFINED, 14, Font.BOLD);
            Font brSpacing = new Font(FontFamily.UNDEFINED, 10, Font.BOLD);
            //adiciona o texto ao PDF
            String doutor = JOptionPane.showInputDialog(null, "DIGITE O NOME DO(A) MEDICO(A)");
            String valorDias = JOptionPane.showInputDialog(null, "QUANTOS DIAS O(A) PACIENTE FICARÁ AUSENTE?");
            int dias = Integer.parseInt(valorDias);
            Paragraph titulo = new Paragraph("ATESTADO MÉDICO", f1);
            titulo.setAlignment(Element.ALIGN_CENTER);
            Image imgLogo = Image.getInstance("C://Users//reido//OneDrive//Documents//Programacao-Java//Exemplo_itextPDF//src//main//hapvida.png");
            Image imgAss = Image.getInstance("C://Users//reido//OneDrive//Documents//Programacao-Java//Exemplo_itextPDF//src//main//assinatura.png");
            imgLogo.setAbsolutePosition(0, 750);
            imgAss.setAbsolutePosition(180, 340);
            Paragraph par = new Paragraph("  Atesto que atendi nesta data o(a) Sr(a) " + doutor.toUpperCase() + " às " + hora + ", sendo necessário seu afastamento do local de trabalho ou escola por " + dias +" dia(s), a partir de " + data2 + ", tendo como causa do atendimento o código abaixo:", f2);
            Paragraph br = new Paragraph("      ", brSpacing);
            Paragraph pLocaData = new Paragraph("SÂO PAULO, "+ data1 + ".");
            Paragraph assMed = new Paragraph("Assinatura do Médico", f2);
            Paragraph linhaAss = new Paragraph("__________________________________");
            
            linhaAss.setAlignment(Element.ALIGN_CENTER);
            assMed.setAlignment(Element.ALIGN_CENTER);
            pLocaData.setAlignment(Element.ALIGN_CENTER);
            doc.add(imgLogo);
            doc.add(titulo);
            doc.add(new Paragraph("_____________________________________________________________________________"));
            for (int i = 1; i <= 4; i++) {doc.add(br);}
            doc.add(par);
            for (int i = 1; i <= 2; i++) {doc.add(br);}
            doc.add(new Paragraph("CID 10-J11"));
            doc.add(new Paragraph("............................."));
            doc.add(new Paragraph("Codigo da Doença", f2));
            doc.add(br);
            doc.add(pLocaData);
            doc.add(br);
            doc.add(assMed);
            doc.add(imgAss);
            for (int i = 1; i <= 6; i++) {doc.add(br);}
            doc.add(linhaAss);

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
        
        Desktop.getDesktop().open(new File("C://Users//reido//OneDrive//Documents//Programacao-Java//out.pdf"));
    }
    
}