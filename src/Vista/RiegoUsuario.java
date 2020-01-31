package Vista;

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
public class RiegoUsuario extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    ControladorPersona controladorPersona;

    public RiegoUsuario(JButton b) {
        initComponents();
        this.b = b;
        cabecera = null;
        modelo = new DefaultTableModel();
        modelotabla = new DefaultTableModel();
        controladorPersona = new ControladorPersona();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        controladorCliente = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tctHoraFin = new javax.swing.JTextField();
        btnIniciar1 = new javax.swing.JButton();
        cedula1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        txtHoraIni1 = new javax.swing.JTextField();
        tctHoraFin1 = new javax.swing.JTextField();
        nombre2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
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

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("DATOS ACTUALES RIEGO");
        getContentPane().add(controladorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 25, -1, -1));

        cedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula.setText("HORA:");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("AMBIENTE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 114, -1));

        tctHoraFin.setText("58%");
        tctHoraFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tctHoraFinKeyTyped(evt);
            }
        });
        getContentPane().add(tctHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 146, -1));

        btnIniciar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIniciar1.setForeground(new java.awt.Color(0, 0, 255));
        btnIniciar1.setText("ACTUALIZAR DATOS");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 340, 130));

        cedula1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula1.setText("TEMPERATURA:");
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, -1));

        nombre1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre1.setText("FECHA:");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 67, 140, -1));

        txtHoraIni1.setText("20/20/2020");
        txtHoraIni1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoraIni1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraIni1KeyTyped(evt);
            }
        });
        getContentPane().add(txtHoraIni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 67, 146, -1));

        tctHoraFin1.setText("3:00 PM");
        tctHoraFin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tctHoraFin1KeyTyped(evt);
            }
        });
        getContentPane().add(tctHoraFin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 104, 146, -1));

        nombre2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre2.setText("HUMEDAD");
        getContentPane().add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 114, -1));

        jSlider1.setMajorTickSpacing(38);
        jSlider1.setMaximum(38);
        jSlider1.setMinimum(10);
        jSlider1.setMinorTickSpacing(15);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(20);
        jSlider1.setAutoscrolls(true);
        jSlider1.setOpaque(false);
        jSlider1.setRequestFocusEnabled(false);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 390, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lluvia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, 160));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void tctHoraFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tctHoraFinKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tctHoraFinKeyTyped

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
    
    }//GEN-LAST:event_btnIniciar1ActionPerformed

    private void txtHoraIni1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraIni1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraIni1KeyPressed

    private void txtHoraIni1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraIni1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraIni1KeyTyped

    private void tctHoraFin1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tctHoraFin1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tctHoraFin1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JTextField tctHoraFin;
    private javax.swing.JTextField tctHoraFin1;
    private javax.swing.JTextField txtHoraIni1;
    // End of variables declaration//GEN-END:variables
}
