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
public class Programar extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    ControladorPersona controladorPersona;
    ControladorArduino controladorArduino;

    public Programar(JButton b, ControladorArduino controladorArduino) {
        initComponents();
        this.b = b;
        cabecera = null;
        modelo = new DefaultTableModel();
        modelotabla = new DefaultTableModel();
        controladorPersona = new ControladorPersona();
        this.controladorArduino = controladorArduino;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        controladorCliente = new javax.swing.JLabel();
        btnIniciar1 = new javax.swing.JButton();
        cedula1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
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

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("PROGRAMAR RIEGO");

        btnIniciar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIniciar1.setForeground(new java.awt.Color(0, 0, 255));
        btnIniciar1.setText("INICIAR");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        cedula1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula1.setText("EN CUENTO MINUTOS DEBE INICIAR:");

        nombre1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre1.setText("CUNTOS MINUTOS DEBE CORRER:");

        txtInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInicioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInicioKeyTyped(evt);
            }
        });

        txtFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFinKeyTyped(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(controladorCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnIniciar1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(controladorCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula1)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre1)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(btnIniciar1)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        try{
        int ini= Integer.parseInt(txtInicio.getText())*10000;
        int fin = Integer.parseInt(txtFin.getText())*10000;
            Thread.sleep(ini);
            controladorArduino.enviarDatos("1");
            Thread.sleep(fin);
            controladorArduino.enviarDatos("2");
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnIniciar1ActionPerformed

    private void txtInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInicioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioKeyPressed

    private void txtInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioKeyTyped

    private void txtFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel nombre1;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    // End of variables declaration//GEN-END:variables
}
