package Vista;

import Controlador.ControladorArduino;
import Controlador.ControladorPersona;
import Modelo.Persona;
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
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class VentanaRiego extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    ControladorArduino controladorArduino;

    public VentanaRiego() {
    }

    public VentanaRiego(JButton b, ControladorArduino controladorArduino) {
        initComponents();
        this.b = b;
        cabecera = null;
        modelo = new DefaultTableModel();
        modelotabla = new DefaultTableModel();
        this.controladorArduino = controladorArduino;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        txtTemperatura = new javax.swing.JLabel();
        txtHumedad = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        txtRegadera = new javax.swing.JLabel();
        controladorCliente1 = new javax.swing.JLabel();
        cedula2 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        txtSol = new javax.swing.JLabel();
        nombre4 = new javax.swing.JLabel();
        txtLluvia = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtRegadera1 = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTemperatura.setFont(new java.awt.Font("Sitka Heading", 3, 100)); // NOI18N
        txtTemperatura.setText("20.3");
        getContentPane().add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 260, 110));

        txtHumedad.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        txtHumedad.setText("Suelo Humedo");
        getContentPane().add(txtHumedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 370, 40));

        nombre1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre1.setText("REGADERA");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 140, -1));

        txtRegadera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regadera.gif"))); // NOI18N
        getContentPane().add(txtRegadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 300, 290));

        controladorCliente1.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente1.setText("DATOS ACTUALES RIEGO");
        getContentPane().add(controladorCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        cedula2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        cedula2.setText("C");
        getContentPane().add(cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 50, 40));

        nombre3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre3.setText("TEMPERATURA");
        getContentPane().add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, -1));

        txtSol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sol.png"))); // NOI18N
        getContentPane().add(txtSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 220, 220));

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("LLUVIA / SOL");
        getContentPane().add(nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 140, -1));

        txtLluvia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lluvia.png"))); // NOI18N
        getContentPane().add(txtLluvia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 220, 160));

        jButton1.setText("CARGAR DATOS ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        txtRegadera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave.jpg"))); // NOI18N
        getContentPane().add(txtRegadera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 300, 290));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            txtTemperatura.setText(controladorArduino.getRiego().getTemperatura());
            String humString = controladorArduino.getRiego().getHumedad();
            if (humString.equals("SI")) {
                txtHumedad.setText("Suelo Humedo");
            } else {
                txtHumedad.setText("Suelo Seco");
            }
            String lluString = controladorArduino.getRiego().getLluvia();
            if (lluString.equals("NO")) {
                txtSol.setVisible(true);
                txtLluvia.setVisible(false);
            } else {
                txtSol.setVisible(false);
                txtLluvia.setVisible(true);
            }

            String regString = controladorArduino.getRiego().getRegadera();
            if (regString.equals("ACTIVO")) {
                txtRegadera.setVisible(true);
                txtRegadera1.setVisible(false);
            } else {
                txtRegadera.setVisible(false);
                txtRegadera1.setVisible(true);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cedula2;
    private javax.swing.JLabel controladorCliente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel txtHumedad;
    private javax.swing.JLabel txtLluvia;
    private javax.swing.JLabel txtRegadera;
    private javax.swing.JLabel txtRegadera1;
    private javax.swing.JLabel txtSol;
    private javax.swing.JLabel txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
