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
public class UsuariosDatos extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    ControladorPersona controladorPersona;

    public UsuariosDatos(JButton b) {
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
        panelesCrudCliente = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        apellido3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        telefono3 = new javax.swing.JLabel();
        direccion3 = new javax.swing.JLabel();
        actulizarM = new javax.swing.JButton();
        txtCedulaMM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtCelularM = new javax.swing.JTextField();
        txtDepartamentoM = new javax.swing.JTextField();
        nombre5 = new javax.swing.JLabel();
        direcion9 = new javax.swing.JLabel();
        txtPesoM = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtCelularE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        direcion7 = new javax.swing.JLabel();
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

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setEnabled(false);

        nombre3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre3.setText("CEDULA:");

        apellido3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido3.setText("APELLIDOS: ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        telefono3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono3.setText("TELEFONO:");

        direccion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion3.setText("Departamento:");

        actulizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarM.setText("ACTUALIZAR");
        actulizarM.setEnabled(false);
        actulizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMActionPerformed(evt);
            }
        });

        txtCedulaMM.setEditable(false);
        txtCedulaMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMMActionPerformed(evt);
            }
        });
        txtCedulaMM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMMKeyTyped(evt);
            }
        });

        txtNombreM.setEditable(false);
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMKeyTyped(evt);
            }
        });

        txtApellidoM.setEditable(false);
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });

        txtCelularM.setEditable(false);
        txtCelularM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularMKeyTyped(evt);
            }
        });

        txtDepartamentoM.setEditable(false);
        txtDepartamentoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartamentoMKeyTyped(evt);
            }
        });

        nombre5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre5.setText("NOMBRE: ");

        direcion9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion9.setText("PESO:");

        txtPesoM.setEditable(false);
        txtPesoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoMKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(direccion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellido3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefono3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                            .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel36)
                                .addGap(395, 395, 395))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCedulaMM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                        .addComponent(txtNombreM, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDepartamentoM, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCelularM, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(direcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(actulizarM)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre5))
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido3)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelularM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartamentoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion9)
                    .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(actulizarM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 350));

        panelesCrudCliente.addTab("MODIFICAR", jPanel8);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("CONTRACEÑA ACTUAL: ");

        apellido4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido4.setText("NUEVA CONTRACEÑA: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoE.setEditable(false);

        txtNombreE.setEditable(false);

        txtCelularE.setEditable(false);

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnEliminar.setText("CAMBIAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        direcion7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion7.setText("REPETIR CONTRACEÑA:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(apellido4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(direcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoE)
                            .addComponent(txtCelularE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(nombre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(75, 75, 75))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(nombre4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellido4)
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelularE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direcion7))))
                .addGap(52, 52, 52)
                .addComponent(btnEliminar)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, -1, -1));

        panelesCrudCliente.addTab("CAMBIAR CONTRACEÑA", jPanel4);

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("MIS DATOS");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(controladorCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(controladorCliente)
                .addGap(34, 34, 34)
                .addComponent(panelesCrudCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged
        
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        if (codAux != -500) {
//            int resp = JOptionPane.showConfirmDialog(this, "SEGURO DECESAS ELMINAR AL CLIENTE");
//            if (JOptionPane.OK_OPTION == resp) {
//                controladorPersona.eliminar(codAux);
//                JOptionPane.showMessageDialog(this, "CLIENTE ELMINADO", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
//                txtNombreE.setText("");
//                txtApellidoE.setText("");
//                txtCelularE.setText("");
//                txtDepartamentoE.setText("");
//                txtRolE.setText("");
//                txtPesoE.setText("");
//                btnEliminar.setEnabled(false);
//                codAux = -500;
//
//            } else {
//                txtNombreE.setText("");
//                txtApellidoE.setText("");
//                txtCelularE.setText("");
//                txtDepartamentoE.setText("");
//                txtRolE.setText("");
//                txtPesoE.setText("");
//                btnEliminar.setEnabled(false);
//                codAux = -500;
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "REVISE EL CAMPO DE CEDULA", "CLIENTE", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPesoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoMKeyTyped

    }//GEN-LAST:event_txtPesoMKeyTyped

    private void txtDepartamentoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartamentoMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDepartamentoMKeyTyped

    private void txtCelularMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCelularMKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtNombreMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMKeyTyped

    private void txtCedulaMMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaMMKeyTyped

    private void txtCedulaMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMMActionPerformed

    private void actulizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMActionPerformed
//        if (codAux != -500) {
//
//            boolean bander = true;
//            if (0 >= txtCedulaMM.getText().length()) {
//                bander = false;
//            }
//            if (0 >= txtNombreM.getText().length()) {
//                bander = false;
//            }
//            if (0 >= txtApellidoM.getText().length()) {
//                bander = false;
//            }
//            if (0 >= txtCelularM.getText().length()) {
//                bander = false;
//            }
//            if (0 >= txtDepartamentoM.getText().length()) {
//                bander = false;
//            }
//            if (0 >= txtPesoM.getText().length()) {
//                bander = false;
//            }
//            if (0 >= txtContraM.getText().length()) {
//                bander = false;
//            }
//            if (0 == comboRolM.getSelectedIndex()) {
//                bander = false;
//            }
//            if (bander) {
//                try {
//                    Persona persona = new Persona(codAux, txtCedulaMM.getText(), txtNombreM.getText(),
//                            txtApellidoM.getText(), txtDepartamentoM.getText(), Float.parseFloat(txtPesoM.getText()),
//                            txtCelularM.getText(), comboRolM.getSelectedItem().toString(), txtContraM.getText());
//                    controladorPersona.edit(persona);
//
//                    codAux = -500;
//                    txtCedulaMM.setText("");
//                    txtNombreM.setText("");
//                    txtApellidoM.setText("");
//                    txtCelularM.setText("");
//                    txtDepartamentoM.setText("");
//                    txtPesoM.setText("");
//                    txtContraM.setText("");
//                    comboRolM.setSelectedIndex(0);
//
//                    txtCedulaMM.setEditable(false);
//                    txtNombreM.setEditable(false);
//                    txtApellidoM.setEditable(false);
//                    txtCelularM.setEditable(false);
//                    txtDepartamentoM.setEditable(false);
//                    actulizarM.setEnabled(false);
//                    txtPesoM.setEditable(false);
//                    txtContraM.setEditable(false);
//                    txtRolB.setEnabled(false);
//                    JOptionPane.showMessageDialog(this, "Persona ACTUALIZADA");
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//
//            } else {
//                JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "PERSONAS", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "POR FAVOR BUSQUE A LA PERSONA", "PERSONAS", JOptionPane.ERROR_MESSAGE);
//
//        }
    }//GEN-LAST:event_actulizarMActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actulizarM;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido4;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JLabel direccion3;
    private javax.swing.JLabel direcion7;
    private javax.swing.JLabel direcion9;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JLabel telefono3;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtCedulaMM;
    private javax.swing.JTextField txtCelularE;
    private javax.swing.JTextField txtCelularM;
    private javax.swing.JTextField txtDepartamentoM;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtPesoM;
    // End of variables declaration//GEN-END:variables
}
