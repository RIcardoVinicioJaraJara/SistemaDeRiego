package Vista;

import Controlador.ControladorPersona;
import Controlador.ControladorRiego;
import Modelo.Persona;
import Modelo.Riego;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
//            DefaultPieDataset dataset = new DefaultPieDataset();
            
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("LISTA DE RIEGOS");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controladorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(controladorCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelesCrudCliente)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged
        int x = panelesCrudCliente.getSelectedIndex();
        if (x
                == 1) {

        }
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
