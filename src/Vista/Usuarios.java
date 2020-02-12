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
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
public class Usuarios extends javax.swing.JInternalFrame {

    private JButton b;
    private DefaultTableModel modelo;
    private String cabecera[];
    private DefaultTableModel modelotabla;
    private int codAux;

    ControladorPersona controladorPersona;

    public Usuarios(JButton b) {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        direcion5 = new javax.swing.JLabel();
        direcion6 = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<String>();
        txtDepartamento = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        direcion11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        agregarClientes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        listadeClientes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarclientes = new javax.swing.JLabel();
        txtCedulaB = new javax.swing.JTextField();
        ingreseCedula = new javax.swing.JLabel();
        panelBuscarCliente = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        apillido2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtApellidoB = new javax.swing.JTextField();
        txtNombreB = new javax.swing.JTextField();
        txtCelularB = new javax.swing.JTextField();
        telefono2 = new javax.swing.JLabel();
        direcion2 = new javax.swing.JLabel();
        txtDepartamentoB = new javax.swing.JTextField();
        direcion3 = new javax.swing.JLabel();
        txtPesoB = new javax.swing.JTextField();
        direcion4 = new javax.swing.JLabel();
        txtRolB = new javax.swing.JTextField();
        buscar1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cedula3 = new javax.swing.JLabel();
        txtCedulaM = new javax.swing.JTextField();
        modificarcliente = new javax.swing.JLabel();
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
        direcion10 = new javax.swing.JLabel();
        comboRolM = new javax.swing.JComboBox<String>();
        direcion12 = new javax.swing.JLabel();
        txtCorreoM = new javax.swing.JTextField();
        buscar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        eliminarcliente = new javax.swing.JLabel();
        cedula4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtCelularE = new javax.swing.JTextField();
        telefono4 = new javax.swing.JLabel();
        direccion4 = new javax.swing.JLabel();
        txtDepartamentoE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        direcion7 = new javax.swing.JLabel();
        txtPesoE = new javax.swing.JTextField();
        txtRolE = new javax.swing.JTextField();
        direcion8 = new javax.swing.JLabel();
        txtCedulaE = new javax.swing.JTextField();
        buscar3 = new javax.swing.JButton();
        controladorCliente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("NOMBRE:   ");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 37, 150, -1));

        apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido.setText("APELLIDOS:   ");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 67, 140, -1));

        cedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula.setText("CEDULA:   ");
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 11, 140, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 11, 146, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 67, 146, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 37, 146, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        direccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion.setText("DEPARTAMENTO:");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 122, 130, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono.setText("TELEFONO:");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 96, 120, -1));

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 96, 146, -1));

        direcion5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion5.setText("PESO:");
        jPanel1.add(direcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        direcion6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion6.setText("ROL:");
        jPanel1.add(direcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, -1));

        comboRol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "ADMIN", "USER" }));
        jPanel1.add(comboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 140, -1));

        txtDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartamentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 122, 146, -1));

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 146, -1));

        direcion11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion11.setText("Correo:");
        jPanel1.add(direcion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 146, -1));

        agregarClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        agregarClientes.setText("Agregar Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarClientes))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(agregarClientes)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelesCrudCliente.addTab("CREAR", jPanel2);

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

        listadeClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        listadeClientes.setText("LISTA DE CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(listadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(listadeClientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarclientes.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        buscarclientes.setText("BUSCAR CLIENTES");
        jPanel6.add(buscarclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 298, 37));

        txtCedulaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaBKeyTyped(evt);
            }
        });
        jPanel6.add(txtCedulaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 64, 153, -1));

        ingreseCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula.setText("INGRESE CEDULA: ");
        jPanel6.add(ingreseCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 164, 20));

        nombre2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre2.setText("NOMBRE: ");

        apillido2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apillido2.setText("APELLIDOS: ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoB.setEditable(false);

        txtNombreB.setEditable(false);

        txtCelularB.setEditable(false);

        telefono2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono2.setText("TELEFONO:");

        direcion2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion2.setText("DEPARTAMENTO:");

        txtDepartamentoB.setEditable(false);

        direcion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion3.setText("PESO");

        txtPesoB.setEditable(false);

        direcion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion4.setText("ROL");

        txtRolB.setEditable(false);

        javax.swing.GroupLayout panelBuscarClienteLayout = new javax.swing.GroupLayout(panelBuscarCliente);
        panelBuscarCliente.setLayout(panelBuscarClienteLayout);
        panelBuscarClienteLayout.setHorizontalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(direcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apillido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombreB)
                                .addComponent(txtApellidoB)
                                .addComponent(txtCelularB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDepartamentoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(direcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(txtRolB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                                .addComponent(direcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPesoB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelBuscarClienteLayout.setVerticalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre2)
                            .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apillido2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCelularB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direcion2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepartamentoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(direcion4)
                    .addComponent(txtRolB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel6.add(panelBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 300));

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar1.setText("BUSCAR");
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        jPanel6.add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        panelesCrudCliente.addTab("BUSCAR", jPanel6);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula3.setText("CEDULA: ");
        jPanel8.add(cedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 158, -1));

        txtCedulaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyTyped(evt);
            }
        });
        jPanel8.add(txtCedulaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, -1));

        modificarcliente.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        modificarcliente.setText("MODIFICAR CLIENTE");
        jPanel8.add(modificarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 253, -1));

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

        direcion10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion10.setText("ROL:");

        comboRolM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboRolM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "ADMIN", "USER" }));

        direcion12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion12.setText("Correo:");

        txtCorreoM.setEditable(false);
        txtCorreoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoMKeyTyped(evt);
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
                                .addGap(372, 372, 372))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPesoM, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCedulaMM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                        .addComponent(txtNombreM, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDepartamentoM, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCelularM, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(actulizarM)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboRolM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direcion12)
                            .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel36)
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion10)
                    .addComponent(comboRolM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(actulizarM)
                .addContainerGap())
        );

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 350));

        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar2.setText("BUSCAR");
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        jPanel8.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        panelesCrudCliente.addTab("MODIFICAR", jPanel8);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarcliente.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        eliminarcliente.setText("Eliminar Cliente");
        jPanel4.add(eliminarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, 331, 32));

        cedula4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula4.setText("CEDULA: ");
        jPanel4.add(cedula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 42, 165, 26));

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("NOMBRE: ");

        apellido4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido4.setText("APELLIDOS: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoE.setEditable(false);

        txtNombreE.setEditable(false);

        txtCelularE.setEditable(false);

        telefono4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono4.setText("TELEFONO:");

        direccion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion4.setText("DEPARTAMENTO:");

        txtDepartamentoE.setEditable(false);

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        direcion7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion7.setText("PESO");

        txtPesoE.setEditable(false);

        txtRolE.setEditable(false);

        direcion8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion8.setText("ROL");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(direccion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDepartamentoE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoE)
                                .addComponent(txtCelularE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPesoE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRolE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnEliminar)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direcion7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
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
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre4)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apellido4)
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono4)
                            .addComponent(txtCelularE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion4)
                            .addComponent(txtDepartamentoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direcion7))
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcion8)
                    .addComponent(txtRolE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnEliminar))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, -1, -1));

        txtCedulaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEKeyTyped(evt);
            }
        });
        jPanel4.add(txtCedulaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 47, 153, -1));

        buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        buscar3.setText("BUSCAR");
        buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar3ActionPerformed(evt);
            }
        });
        jPanel4.add(buscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 38, -1, -1));

        panelesCrudCliente.addTab("ELIMINAR", jPanel4);

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("CONTROLADOR CLIENTES");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteP.png"))); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(controladorCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(controladorCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelesCrudCliente)
                .addContainerGap())
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
            List<Persona> lista = controladorPersona.findAll();
            if (!lista.isEmpty()) {
                modelotabla = new DefaultTableModel();
                Object[] datoscliente;
                modelotabla.addColumn("ID");
                modelotabla.addColumn("CEDULA");
                modelotabla.addColumn("NOMBRES");
                modelotabla.addColumn("APELLIDOS");
                modelotabla.addColumn("TELEFONO");
                modelotabla.addColumn("DEPARTAMERNTO");
                modelotabla.addColumn("PESO");
                modelotabla.addColumn("ROL");
                tabla.setModel(modelotabla);
                datoscliente = new Object[8];

                for (Persona persona : lista) {
                    datoscliente[0] = persona.getIdPersona();
                    datoscliente[1] = persona.getCedula();
                    datoscliente[2] = persona.getNombre();
                    datoscliente[3] = persona.getApellido();
                    datoscliente[4] = persona.getCelular();
                    datoscliente[5] = persona.getDepartameto();
                    datoscliente[6] = persona.getPeso();
                    datoscliente[7] = persona.getRol();
                    modelotabla.addRow(datoscliente);
                    tabla.setModel(modelotabla);
                }

            } else {
                JOptionPane.showMessageDialog(this, "No hay Clientes");
            }

        }
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    private void buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar3ActionPerformed
        Persona persona = controladorPersona.findByCedula(txtCedulaE.getText());
        if (persona == null) {
            txtNombreE.setText("");
            txtApellidoE.setText("");
            txtCelularE.setText("");
            txtDepartamentoE.setText("");
            txtRolE.setText("");
            txtPesoE.setText("");
            JOptionPane.showMessageDialog(this, "Persona No econtrada");
            codAux = -500;
            btnEliminar.setEnabled(false);
        } else {
            codAux = persona.getIdPersona();
            txtNombreE.setText(persona.getNombre());
            txtApellidoE.setText(persona.getApellido());
            txtCelularE.setText(persona.getCelular());
            txtDepartamentoE.setText(persona.getDepartameto());
            txtRolE.setText(persona.getRol());
            txtPesoE.setText(String.valueOf(persona.getPeso()));
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_buscar3ActionPerformed

    private void txtCedulaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaEKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (codAux != -500) {
            int resp = JOptionPane.showConfirmDialog(this, "SEGURO DECESAS ELMINAR AL CLIENTE");
            if (JOptionPane.OK_OPTION == resp) {
                controladorPersona.eliminar(codAux);
                JOptionPane.showMessageDialog(this, "CLIENTE ELMINADO", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtCelularE.setText("");
                txtDepartamentoE.setText("");
                txtRolE.setText("");
                txtPesoE.setText("");
                btnEliminar.setEnabled(false);
                codAux = -500;

            } else {
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtCelularE.setText("");
                txtDepartamentoE.setText("");
                txtRolE.setText("");
                txtPesoE.setText("");
                btnEliminar.setEnabled(false);
                codAux = -500;
            }
        } else {
            JOptionPane.showMessageDialog(this, "REVISE EL CAMPO DE CEDULA", "CLIENTE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed

        Persona persona = controladorPersona.findByCedula(txtCedulaM.getText());
        if (persona == null) {
            codAux = -500;
            txtCedulaMM.setText("");
            txtNombreM.setText("");
            txtApellidoM.setText("");
            txtCelularM.setText("");
            txtDepartamentoM.setText("");
            txtPesoM.setText("");
            txtCorreoM.setText("");
            comboRolM.setSelectedIndex(0);

            txtCedulaMM.setEditable(false);
            txtNombreM.setEditable(false);
            txtApellidoM.setEditable(false);
            txtCelularM.setEditable(false);
            txtDepartamentoM.setEditable(false);
            actulizarM.setEnabled(false);
            txtPesoM.setEditable(false);
            txtCorreoM.setEditable(false);
            txtRolB.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Persona No econtrada");
        } else {
            codAux = persona.getIdPersona();
            txtCedulaMM.setText(persona.getCedula());
            txtNombreM.setText(persona.getNombre());
            txtApellidoM.setText(persona.getApellido());
            txtCelularM.setText(persona.getCelular());
            txtDepartamentoM.setText(persona.getDepartameto());
            comboRolM.setSelectedItem(persona.getRol());
            txtPesoM.setText(String.valueOf(persona.getPeso()));
            txtCorreoM.setText(persona.getContracenia());

            txtCedulaMM.setEditable(true);
            txtNombreM.setEditable(true);
            txtApellidoM.setEditable(true);
            txtCelularM.setEditable(true);
            txtDepartamentoM.setEditable(true);
            actulizarM.setEnabled(true);
            txtPesoM.setEditable(true);
            txtCorreoM.setEditable(true);
            txtRolB.setEnabled(true);
        }
    }//GEN-LAST:event_buscar2ActionPerformed

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
        if (codAux != -500) {

            boolean bander = true;
            if (0 >= txtCedulaMM.getText().length()) {
                bander = false;
            }
            if (0 >= txtNombreM.getText().length()) {
                bander = false;
            }
            if (0 >= txtApellidoM.getText().length()) {
                bander = false;
            }
            if (0 >= txtCelularM.getText().length()) {
                bander = false;
            }
            if (0 >= txtDepartamentoM.getText().length()) {
                bander = false;
            }
            if (0 >= txtPesoM.getText().length()) {
                bander = false;
            }
            if (0 >= txtCorreoM.getText().length()) {
                bander = false;
            }
            if (0 == comboRolM.getSelectedIndex()) {
                bander = false;
            }
            if (bander) {
                try {
                    String subject = "CONTRASEÑA DEL SISTEMA";
                    String contra = "";
                    for (int i = 0; i < 10; i++) {
                        int valorDado = (int) Math.floor(Math.random() * 6 + 1);
                        contra += valorDado + "";
                    }
                    String body = contra;
                    String[] to = {txtCorreo.getText()};
                    sendFromGMail("sistemariego3@gmail.com", "chico@08", to, subject, contra);

                    Persona persona = new Persona(codAux, txtCedulaMM.getText(), txtNombreM.getText(),
                            txtApellidoM.getText(), txtDepartamentoM.getText(), Float.parseFloat(txtPesoM.getText()),
                            txtCelularM.getText(), comboRolM.getSelectedItem().toString(), contra, txtCorreoM.getText(), true);
                    controladorPersona.edit(persona);

                    codAux = -500;
                    txtCedulaMM.setText("");
                    txtNombreM.setText("");
                    txtApellidoM.setText("");
                    txtCelularM.setText("");
                    txtDepartamentoM.setText("");
                    txtPesoM.setText("");
                    txtCorreoM.setText("");
                    comboRolM.setSelectedIndex(0);

                    txtCedulaMM.setEditable(false);
                    txtNombreM.setEditable(false);
                    txtApellidoM.setEditable(false);
                    txtCelularM.setEditable(false);
                    txtDepartamentoM.setEditable(false);
                    actulizarM.setEnabled(false);
                    txtPesoM.setEditable(false);
                    txtCorreoM.setEditable(false);
                    txtRolB.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Persona ACTUALIZADA");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "PERSONAS", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "POR FAVOR BUSQUE A LA PERSONA", "PERSONAS", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_actulizarMActionPerformed

    private void txtCedulaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyTyped

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
        Persona persona = controladorPersona.findByCedula(txtCedulaB.getText());
        if (persona == null) {
            txtNombreB.setText("");
            txtApellidoB.setText("");
            txtCelularB.setText("");
            txtDepartamentoB.setText("");
            txtRolB.setText("");
            txtPesoB.setText("");
            JOptionPane.showMessageDialog(this, "Persona No econtrada");
        } else {
            txtNombreB.setText(persona.getNombre());
            txtApellidoB.setText(persona.getApellido());
            txtCelularB.setText(persona.getCelular());
            txtDepartamentoB.setText(persona.getDepartameto());
            txtRolB.setText(persona.getRol());
            txtPesoB.setText(String.valueOf(persona.getPeso()));
        }

    }//GEN-LAST:event_buscar1ActionPerformed

    private void txtCedulaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaBKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaBKeyTyped

    private void txtDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartamentoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDepartamentoKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean bander = true;
        if (0 >= txtCedula.getText().length()) {
            bander = false;
        }
        if (0 >= txtNombre.getText().length()) {
            bander = false;
        }
        if (0 >= txtApellido.getText().length()) {
            bander = false;
        }
        if (0 >= txtCelular.getText().length()) {
            bander = false;
        }
        if (0 >= txtDepartamento.getText().length()) {
            bander = false;
        }
        if (0 >= txtPeso.getText().length()) {
            bander = false;
        }

        if (0 == comboRol.getSelectedIndex()) {
            bander = false;
        }
        if (bander) {
            String subject = "CONTRASEÑA DEL SISTEMA";
            String contra = "";
            for (int i = 0; i < 10; i++) {
                int valorDado = (int) Math.floor(Math.random() * 6 + 1);
                contra += valorDado + "";
            }
            String body = contra;
            String[] to = {txtCorreo.getText()};
            sendFromGMail("sistemariego3@gmail.com", "chico@08", to, subject, contra);
            Persona persona = new Persona(0, txtCedula.getText(), txtNombre.getText(),
                    txtApellido.getText(), txtDepartamento.getText(), Float.parseFloat(txtPeso.getText()),
                    txtCelular.getText(), comboRol.getSelectedItem().toString(), contra, txtCorreo.getText(), true);
            controladorPersona.createPersona(persona);

            JOptionPane.showMessageDialog(this, "Usuario Ingresado");

            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtDepartamento.setText("");
            txtPeso.setText("");
            txtCelular.setText("");
            comboRol.setSelectedItem(0);

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "USUARIO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void sendFromGMail(String correoEnvia, String pass, String[] correoResive, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", correoEnvia);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(correoEnvia));
            InternetAddress[] toAddress = new InternetAddress[correoResive.length];

            for (int i = 0; i < correoResive.length; i++) {
                toAddress[i] = new InternetAddress(correoResive[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, correoEnvia, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException ae) {
            ae.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
        }
    }

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed

    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actulizarM;
    private javax.swing.JLabel agregarClientes;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido4;
    private javax.swing.JLabel apillido2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton buscar1;
    private javax.swing.JButton buscar2;
    private javax.swing.JButton buscar3;
    private javax.swing.JLabel buscarclientes;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel cedula4;
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JComboBox<String> comboRolM;
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccion3;
    private javax.swing.JLabel direccion4;
    private javax.swing.JLabel direcion10;
    private javax.swing.JLabel direcion11;
    private javax.swing.JLabel direcion12;
    private javax.swing.JLabel direcion2;
    private javax.swing.JLabel direcion3;
    private javax.swing.JLabel direcion4;
    private javax.swing.JLabel direcion5;
    private javax.swing.JLabel direcion6;
    private javax.swing.JLabel direcion7;
    private javax.swing.JLabel direcion8;
    private javax.swing.JLabel direcion9;
    private javax.swing.JLabel eliminarcliente;
    private javax.swing.JLabel ingreseCedula;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listadeClientes;
    private javax.swing.JLabel modificarcliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel telefono3;
    private javax.swing.JLabel telefono4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoB;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaB;
    private javax.swing.JTextField txtCedulaE;
    private javax.swing.JTextField txtCedulaM;
    private javax.swing.JTextField txtCedulaMM;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelularB;
    private javax.swing.JTextField txtCelularE;
    private javax.swing.JTextField txtCelularM;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoM;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDepartamentoB;
    private javax.swing.JTextField txtDepartamentoE;
    private javax.swing.JTextField txtDepartamentoM;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPesoB;
    private javax.swing.JTextField txtPesoE;
    private javax.swing.JTextField txtPesoM;
    private javax.swing.JTextField txtRolB;
    private javax.swing.JTextField txtRolE;
    // End of variables declaration//GEN-END:variables
}
