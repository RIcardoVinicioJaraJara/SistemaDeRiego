/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorArduino;
import Controlador.ControladorRiego;
import Modelo.Riego;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author vinic
 */
public class NewClass {

    public static void main(String[] args) {
        ControladorRiego controladorRiego = new ControladorRiego();

        Document document = new Document();

        try {
            Image imagen = Image.getInstance("src/imagenes/logo.jpg");

            PdfWriter.getInstance(document, new FileOutputStream("Informe.pdf"));
            document.open();

            imagen.setAlignment(Element.ALIGN_CENTER);
            document.add(imagen);

            Paragraph titulo = new Paragraph("SISTEMA DE RIEGO",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(Chunk.NEWLINE);

            Paragraph nom = new Paragraph("NOMBRE:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(nom);

            Paragraph nombre = new Paragraph("Francisco Vera",
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            nombre.setAlignment(Element.ALIGN_CENTER);
            document.add(nombre);
            document.add(Chunk.NEWLINE);

            Calendar fe = Calendar.getInstance();
            String fecha = fe.get(Calendar.YEAR) + "/" + (fe.get(Calendar.MONTH) + 1) + "/" + fe.get(Calendar.DAY_OF_MONTH);
            String hora = fe.get(Calendar.HOUR) + ":" + fe.get(Calendar.MINUTE) + ":" + fe.get(Calendar.SECOND);

            Paragraph fee = new Paragraph("FECHA:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(fee);

            Paragraph fechaa = new Paragraph(fecha,
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            fechaa.setAlignment(Element.ALIGN_CENTER);
            document.add(fechaa);

            document.add(Chunk.NEWLINE);

            Paragraph hoo = new Paragraph("HORA:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(hoo);

            Paragraph horaa = new Paragraph(hora,
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            horaa.setAlignment(Element.ALIGN_CENTER);
            document.add(horaa);

            document.add(Chunk.NEXTPAGE);

            Paragraph t1 = new Paragraph("DATOS GENERALES",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            t1.setAlignment(Element.ALIGN_CENTER);
            document.add(t1);
            document.add(Chunk.NEWLINE);

            PdfPTable table = new PdfPTable(8);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell(new Paragraph("ID",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("TEMPERA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("HUMEDAD",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("REGADERA",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("LLUVIA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("FECHA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("HORA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("PERSONA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            List<Riego> lsRiego = controladorRiego.findAll();

            for (Riego lsRiego1 : lsRiego) {
                table.addCell(lsRiego1.getIdRiego() + "");
                table.addCell(lsRiego1.getTemperatura() + "");
                table.addCell(lsRiego1.getHumedad() + "");
                table.addCell(lsRiego1.getRegadera() + "");
                table.addCell(lsRiego1.getLluvia() + "");
                table.addCell(lsRiego1.getFecha() + "");
                table.addCell(lsRiego1.getHora() + "");
                table.addCell(lsRiego1.getPersona().getNombre() + "");
            }

            document.add(table);

            document.add(Chunk.NEXTPAGE);

            t1 = new Paragraph("DATOS TABULABLES",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            t1.setAlignment(Element.ALIGN_CENTER);
            document.add(t1);
            document.add(Chunk.NEWLINE);

            table = new PdfPTable(2);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell(new Paragraph("CANTIDAD DE USO",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("NOMBRE PERSONA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            document.add(Chunk.NEWLINE);

            List<String> lisA = controladorRiego.findCout();
            List<String> lisB = controladorRiego.findCout1();

            DefaultPieDataset datos = new DefaultPieDataset();
            for (int i = 0; i < lisA.size(); i++) {
                table.addCell(lisB.get(i).toString());
                table.addCell((String.valueOf(lisA.get(i))));
                datos.setValue(lisB.get(i).toString(), Integer.parseInt(String.valueOf(lisA.get(i))));
            }
            document.add(table);

            JFreeChart ch = ChartFactory.createPieChart3D("Porcentaje de Uso de Riego", datos, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            OutputStream out = new FileOutputStream("tabulacion.png");
            ChartUtilities.writeChartAsPNG(out,
                    ch,
                    500,
                    500);

            imagen = Image.getInstance("tabulacion.png");
            imagen.setAlignment(Element.ALIGN_CENTER);
            document.add(imagen);

            document.close();
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("Informe.pdf"));

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }

}
