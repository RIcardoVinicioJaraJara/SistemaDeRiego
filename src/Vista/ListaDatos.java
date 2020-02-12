package Vista;

import Controlador.ControladorPersona;
import Controlador.ControladorRiego;
import Modelo.Persona;
import Modelo.Riego;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;

/**
 * VentanaCrudClientes
 *
 * @author Fanny
 */
public class ListaDatos extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    ControladorRiego controladorRiego;

    public ListaDatos(JButton b) {
        initComponents();
        this.b = b;
        cabecera = null;
        modelo = new DefaultTableModel();
        modelotabla = new DefaultTableModel();
        controladorRiego = new ControladorRiego();

        List<Riego> lista = controladorRiego.findAll();
        if (!lista.isEmpty()) {
            modelotabla = new DefaultTableModel();
            Object[] datoscliente;
            modelotabla.addColumn("ID");
            modelotabla.addColumn("TEMPERATURA");
            modelotabla.addColumn("HUMEDAD");
            modelotabla.addColumn("REGADERA");
            modelotabla.addColumn("LLUVIA");
            modelotabla.addColumn("FECHA");
            modelotabla.addColumn("HORA");
            modelotabla.addColumn("PERSONA");
            tabla.setModel(modelotabla);
            datoscliente = new Object[8];

            for (Riego r : lista) {
                datoscliente[0] = r.getIdRiego();
                datoscliente[1] = r.getTemperatura();
                datoscliente[2] = r.getHumedad();
                datoscliente[3] = r.getRegadera();
                datoscliente[4] = r.getLluvia();
                datoscliente[5] = r.getFecha();
                datoscliente[6] = r.getHora();
                datoscliente[7] = r.getPersona().getNombre() + " " + r.getPersona().getApellido();
                modelotabla.addRow(datoscliente);
                tabla.setModel(modelotabla);
            }
            List<String> lisA = controladorRiego.findCout();
            List<String> lisB = controladorRiego.findCout1();
            DefaultPieDataset datos = new DefaultPieDataset();
            for (int i = 0; i < lisA.size(); i++) {
                datos.setValue(lisB.get(i).toString(), Integer.parseInt(String.valueOf(lisA.get(i))));
            }

            JFreeChart ch = ChartFactory.createPieChart3D("Porcentaje de Uso de Riego", datos, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            this.add(cp);
            cp.setBounds(700, 60, 500, 500);
        } else {
            JOptionPane.showMessageDialog(this, "No hay Datos");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelesCrudCliente = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        controladorCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                cerrando(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelesCrudCliente.setBackground(new java.awt.Color(0, 204, 102));
        panelesCrudCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelesCrudClienteStateChanged(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NombreyApellido", "Direccion", "Telefono", "Codigo", "Cedula", "aaaaaaaaaa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("LISTA DE RIEGOS");

        jButton1.setText("IMPRIMIR");

        jButton2.setText("PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controladorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1)
                        .addGap(155, 155, 155)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(controladorCliente)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelesCrudCliente)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged

    }//GEN-LAST:event_panelesCrudClienteStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
