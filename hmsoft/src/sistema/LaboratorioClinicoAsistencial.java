package sistema;



import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import autocomplete.ajTextFieldConsulta;
import java.awt.Component;
import java.awt.*;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DEYMER
 */
public final class LaboratorioClinicoAsistencial extends javax.swing.JInternalFrame {
clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    DefaultTableModel model;
    DefaultTableModel ticket;
    Integer codigo;
   LaboratorioClinicoAsistencial1 labca;
    public LaboratorioClinicoAsistencial() {
        initComponents();
       //jPanel14.setVisible(false);
        sbTicket();
        new ajTextFieldConsulta.autocompleterText(txtResponsable, "select nombre_user||' '||apellido_user as nombre FROM usuarios WHERE CONCAT(nombre_user,' ',apellido_user)");
        
     sbCargarOcupacional("");
    } 
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmTicket = new javax.swing.JPopupMenu();
        btnEliminar = new javax.swing.JMenuItem();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtNTicket = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTicket = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtExamen = new javax.swing.JTextField();
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        txtImprimir = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnGrabar1 = new javax.swing.JButton();
        txtBuscarNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pmTicket.add(btnEliminar);

        setClosable(true);
        setResizable(true);
        setTitle("Laboratorio Clinico Asistencial");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("N° Ticket :");

        jLabel48.setText("Dni:");

        txtDni.setEditable(false);

        jLabel1.setText("Nombres :");

        txtNombres.setEditable(false);

        jLabel43.setText("Empresa :");

        txtEmpresa.setEditable(false);

        txtNTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNTicketActionPerformed(evt);
            }
        });
        txtNTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNTicketKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNTicketKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNTicketKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(txtNTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel43)
                .addGap(5, 5, 5)
                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel48)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(txtNTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbPacientesMousePressed(evt);
            }
        });
        tbPacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbPacientesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbPacientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbPacientes);

        jTabbedPane1.addTab("PACIENTES INGRESADOS", jScrollPane1);

        jLabel4.setText("Responsable Lab :");

        tbTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTicket.setComponentPopupMenu(pmTicket);
        tbTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTicketMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbTicket);

        txtObservaciones.setColumns(20);
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        jScrollPane3.setViewportView(txtObservaciones);

        jLabel2.setText("Prueba:");

        jLabel7.setText("Fecha :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaExamen, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel7)
                        .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPRIMIR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImprimir)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir))
        );

        btnGrabar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnGrabar1.setText("Actualizar");
        btnGrabar1.setEnabled(false);
        btnGrabar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabar1ActionPerformed(evt);
            }
        });

        txtBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarNombreMousePressed(evt);
            }
        });
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        jLabel5.setText("Nombre :");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("N° Ticket:");

        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnGrabar1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2)
                                .addComponent(jTabbedPane1))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 559, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1))))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         txtNTicket.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tbPacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPacientesKeyReleased
//        if(evt.getKeyCode() == 40 || evt.getKeyCode() == 38){
//            AltaDesabilitar();
//            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
//            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
//            + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
//            + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
//            + "visual_compl,trab_calientes,manip_alimentos,txtobserv1,txtobserv2,"
//            + "n.color,n.gruposan,n.grupofactorsan,n.cod_clinica,n.precio_adic,n.autoriza "
//            + "FROM n_orden_ocupacional AS n  "
//            + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
//            + "WHERE n.n_orden = " + cod  +agregarConsulta;
//            //      System.out.println("la consulta es:"+Sql);
//
//            oConn.FnBoolQueryExecute(Sql);
//            try {
//                if (oConn.setResult.next()) {
//                    txtDniAlta.setText(oConn.setResult.getString("cod_pa"));
//                    txtNombresAlta.setText(oConn.setResult.getString("nombres_pa"));
//                    txtApellidosAlta.setText(oConn.setResult.getString("apellidos_pa"));
//                    txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
//                    txtContrata.setText(oConn.setResult.getString("razon_contrata"));
//                    txtMedico.setText(oConn.setResult.getString("n_medico"));
//                    txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
//                    cboArea.setSelectedItem(oConn.setResult.getString("area_o"));
//                    cboExamenMedico.setSelectedItem(oConn.setResult.getString("nom_examen"));
//                    cboExplotacion.setSelectedItem(oConn.setResult.getString("nom_ex"));
//                    cboMineralExp.setSelectedItem(oConn.setResult.getString("mineral_po"));
//                    cboAltura.setSelectedItem(oConn.setResult.getString("altura_po"));
//                    txtPrecio.setText(oConn.setResult.getString("precio_po"));
//                    txtFechaAlta.setDate(oConn.setResult.getDate("fecha_apertura_po"));
//                    txtNTicket.setText(oConn.setResult.getString("n_orden"));
//                    cboFormaPago.setSelectedItem(oConn.setResult.getString("tipo_pago"));
//                    chkAltaFist.setSelected(oConn.setResult.getBoolean("n_fisttest"));
//                    chkAltaPsicosen.setSelected(oConn.setResult.getBoolean("n_psicosen"));
//                    chkAltaTestAltura.setSelected(oConn.setResult.getBoolean("n_testaltura"));
//                    chkAltaVisualCom.setSelected(oConn.setResult.getBoolean("visual_compl"));
//                    chkAltaTrabCal.setSelected(oConn.setResult.getBoolean("trab_calientes"));
//                    //                    chkAltaCovid1.setSelected(oConn.setResult.getBoolean("chkcovid1"));
//                    //                    chkAltaCovid2.setSelected(oConn.setResult.getBoolean("chkcovid2"));
//                    chkAltaManipAlimen.setSelected(oConn.setResult.getBoolean("manip_alimentos"));
//                    txtNumColor.setText(oConn.setResult.getString("color"));
//                    txtGrupoSan.setText(oConn.setResult.getString("grupofactorsan"));
//                    jLabel44.setText(oConn.setResult.getString("cod_clinica"));
//                    txtObserv1.setText(oConn.setResult.getString("txtobserv1"));
//                    txtObserv2.setText(oConn.setResult.getString("txtobserv2"));
//                    txtPrecioAdicional.setText(oConn.setResult.getString("precio_adic"));
//                    cboAutorizacion.setSelectedItem(oConn.setResult.getString("autoriza"));
//                    if(nomsede.equals("Trujillo")){
//                        jLabel44.setText(txtNTicket.getText()+" - T");
//                    }else {
//                        jLabel44.setText(txtNTicket.getText()+" - H");
//                    }
//                    txtDniAlta.setEditable(false);
//                    hBotones(true);
//
//                }
//                oConn.setResult.close();
//                oConn.sqlStmt.close();
//            } catch (Exception e) {
//            }
//        }
    }//GEN-LAST:event_tbPacientesKeyReleased

    private void tbPacientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPacientesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPacientesKeyPressed

    private void tbPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacientesMousePressed
         try {
            if (evt.getClickCount() == 2) {
                //     System.out.println("va entrar en el cod de 2 click");
//                String cod = txtNum.getText();
                String codser = tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 5).toString();
                String serv = tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 4).toString();
                
                    if (codser.equals("HM017")||
                        codser.equals("HM021")||
                            codser.equals("HM023")||
                            codser.equals("HM019")) {
//                    Hemograma hemo= new Hemograma();
//                    hemo.setVisible(true);
                        agregaHemograma(codser);
                    } else {
//                    ExamenInmunologico hemo= new ExamenInmunologico();
//                    hemo.setVisible(true);
                        txtExamen.setText(serv);
                        sbServicioAgrega();
                    }
                
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        if (evt.getClickCount() == 1 ) {
            codigo = Integer.valueOf(tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 0).toString());
            String codser = tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 5).toString();
            String Sql = "select tc.n_ticket,d.nombres_pa ||' ' ||d.apellidos_pa as nombres,t.f_ticket ,t.h_ticket, tc.p_descripcion,t.empresa "
                        + "from datos_paciente_asistencial d \n"
                        + "inner join ticket t on(t.cod_pa=d.cod_pa)\n"
                        + "inner join ticket_contenido tc on(t.n_ticket=tc.n_ticket)\n"
            + "WHERE tc.n_ticket = " + codigo ;
            //      System.out.println("la consulta es:"+Sql);
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNTicket.setText(oConn.setResult.getString("n_ticket"));
                    txtNombres.setText(oConn.setResult.getString("nombres"));
                    txtEmpresa.setText(oConn.setResult.getString("empresa"));
                    txtExamen.setText(oConn.setResult.getString("p_descripcion"));
                    txtNum.setText(oConn.setResult.getString("n_ticket"));
                    oPe.fecha(FechaExamen);
                    
                }
                txtImprimir.setText(String.valueOf(codser));
                sbCargarOcupacional(String.valueOf(codigo));
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (Exception e) {
            }
            if(OrdenExiste()){
                sbTicket();
               editarDatos(String.valueOf(codigo));
           } 
        }
    }//GEN-LAST:event_tbPacientesMousePressed

    private void txtNTicketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNTicketKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNTicketKeyTyped

    private void txtNTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNTicketActionPerformed
       
    }//GEN-LAST:event_txtNTicketActionPerformed

    private void txtNTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNTicketKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNTicketKeyPressed

    private void txtNTicketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNTicketKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNTicketKeyReleased

    private void txtNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyReleased
        // TODO add your handling code here:
        sbCargarOcupacional(txtNum.getText());
    }//GEN-LAST:event_txtNumKeyReleased

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int iRow;
        if(tbTicket.getSelectedRow()>= 0){
            if(tbTicket.getRowCount()>1){

                iRow = tbTicket.getSelectedRow();
                DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
                tblDatos.removeRow(iRow);
                tbTicket.setModel(tblDatos);

            }else{
                iRow = tbTicket.getSelectedRow();
                DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
                tblDatos.removeRow(iRow);
                tbTicket.setModel(tblDatos);

            }
        }else{
            oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
        txtNTicket.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        boolean bCommit = false;
        if(OrdenExiste()){
            Eliminar();
            if (oTicketContenido()) {
                bCommit = true;
                oFunc.SubSistemaMensajeInformacion("grabo nuevo ");
            }
            if (bCommit) {
                // Realiza la confirmación de la transaccion
//                oConn.SubCommit();
                imprimir();
                Limpiar();
                editarDatos(txtNum.getText());
            } else {
                oConn.SubRollBack();
            }
        }else{
            if (validar()) {
                // Inicia la transacción colocando el commit a false
                oConn.SubAutoCommit(false);
                // Intenta ejecutar cada uno de los procesos
                if (oTicketDetalle()) {
                    if (oTicketContenido()) {
                        oFunc.SubSistemaMensajeInformacion("grabo ");
                        bCommit = true;
                    }
                }
                // Verifica si debe hacer commit
                if (bCommit) {
                    // Realiza la confirmación de la transaccion
                    oConn.SubCommit();
                    imprimir();
                    Limpiar();
                    editarDatos(String.valueOf(codigo));
                } else {
                    oConn.SubRollBack();
                }

            }
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed
        // TODO add your handling code here:
        //        print (Integer.parseInt(txtImprimir.getText()));
    }//GEN-LAST:event_txtImprimirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        print (txtImprimir.getText(),codigo);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnGrabar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabar1ActionPerformed
        // TODO add your handling code here:
        //         actualizar();
        //         Limpiar();
    }//GEN-LAST:event_btnGrabar1ActionPerformed

    private void txtBuscarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreMousePressed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        sbCargarOcupacional(txtBuscarNombre.getText());
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNum.setText(null);
        sbCargarOcupacional("");
        Limpiar();
//        darResultadoConteo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbTicketMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTicketMousePressed
//         TODO add your handling code here:
        if (evt.getClickCount() == 1 ) {
            String cod = (String) tbTicket.getValueAt(tbTicket.getSelectedRow(), 0);
            txtImprimir.setText(cod);
        }
    }//GEN-LAST:event_tbTicketMousePressed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExamen;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnGrabar1;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPopupMenu pmTicket;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTable tbTicket;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtExamen;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtNTicket;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
 


private void imprimir(){
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir ?", //Mensaje
    "Seleccione una opción", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,    // null para icono por defecto.
    new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
    "Si");
    if (seleccion != -1)
    {
   if((seleccion + 1)==1)
   {
      printer(txtImprimir.getText(),codigo);
   }
   else
   {
      // PRESIONO NO
     }
    }
}
    private void printer(String cod, Integer cod1) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        parameters.put("Cod", cod1);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/LaboratorioAsistencialPrueba.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Laboratorio Clinico.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
//            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
//
//            JasperViewer.viewReport(myPrint, false);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void print(String cod, Integer cod1) {
  //Integer n;
        //n = Integer.parseInt(txtNorden.getText());
        //Pasamos parametros al reporte Jasper. 
        Map parameters = new HashMap();
        // Coloco los valores en los parámetros
        parameters.put("Norden", cod);
        parameters.put("Cod", cod1);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/LaboratorioAsistencialPrueba.jasper";
            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Laboratorio Clinico.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            // Genera el reporte usando el objeto JasperReport e indicando la conexion
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
                    //JasperPrint myPrint = JasperFillManager.fillReport(myReport, null,new JREmptyDataSource());
            // Visualiza el Reporte
            JasperViewer.viewReport(myPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //----------------------------

    
    
//ficha inmonologica
    
   private void sbCargarOcupacional(String valor) {

        try {
            String[] titulos = {"N°Ticket", "Nombres", "Fecha","Hora","Servicios","cod_ser","Condicion"};
            String[] registros = new String[7];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            };
            String Sql ;
           
            if (!txtNum.getText().isEmpty()) {
                // System.out.println("si es este el error ");
                Sql = "select tc.n_ticket,d.nombres_pa ||' ' ||d.apellidos_pa as nombres,t.f_ticket ,t.h_ticket, \n" +
"                        tc.p_descripcion,tc.p_cod,la.la_nticket\n" +
"                        from datos_paciente_asistencial d\n" +
"                        inner join ticket t on(t.cod_pa=d.cod_pa)\n" +
"                        inner join ticket_contenido tc on(t.n_ticket=tc.n_ticket)\n" +
"                        left join laboratorio_asistencial la on(la.la_nticket=tc.n_ticket)\n" +
"                        where  t. n_ticket=" + valor + "\n";
            } else {
                Sql = "select tc.n_ticket,d.nombres_pa ||' ' ||d.apellidos_pa as nombres,t.f_ticket ,t.h_ticket, \n" +
"                        tc.p_descripcion,tc.p_cod,la.la_nticket \n" +
"                        from datos_paciente_asistencial d\n" +
"                        inner join ticket t on(t.cod_pa=d.cod_pa)\n" +
"                        inner join ticket_contenido tc on(t.n_ticket=tc.n_ticket)\n" +
"                        left join laboratorio_asistencial la on(la.la_nticket=tc.n_ticket)\n" 
                        + "where CONCAT(d.nombres_pa,' ',d.apellidos_pa) LIKE '%" + valor + "%' "
                        + "order by tc.n_ticket desc";
            }
            System.out.println("la consulta es:"+Sql);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            if (oConn.FnBoolQueryExecute(Sql)) {
                try {
                    String aux=null,aux1 = null,aux2=null,aux3=null;
                    int t=0;
                    java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                    while (oConn.setResult.next()) {
                        if (t == 0) {
                            aux = oConn.setResult.getString("nombres");
                            aux1=oConn.setResult.getString("n_ticket");
                            aux2=formato.format(oConn.setResult.getDate("f_ticket"));
                            aux3=oConn.setResult.getString("h_ticket");
                            System.out.println("0-" + aux + aux1);
                        }
                        if (aux.equals(oConn.setResult.getString("nombres"))&& 
                                aux1.equals(oConn.setResult.getString("n_ticket"))&&
                                aux2.equals(formato.format(oConn.setResult.getDate("f_ticket")))&&
                                aux3.equals(oConn.setResult.getString("h_ticket"))) {
                            if (t == 0) {
                                registros[0] = oConn.setResult.getString("n_ticket");
                                registros[1] = oConn.setResult.getString("nombres");
                                registros[2] = formato.format(oConn.setResult.getDate("f_ticket"));
                                registros[3]= oConn.setResult.getString("h_ticket");
                            } else {
                                registros[0] = "";
                                registros[1] = "";
                                registros[2] = "";
                                registros[3] = "";
                            }
                        } else {
                            registros[0] = oConn.setResult.getString("n_ticket");
                            registros[1] = oConn.setResult.getString("nombres");
                            registros[2] = formato.format(oConn.setResult.getDate("f_ticket"));
                            registros[3]= oConn.setResult.getString("h_ticket");
                            aux = oConn.setResult.getString("nombres");
                            aux1=oConn.setResult.getString("n_ticket");
                            aux2=formato.format(oConn.setResult.getDate("f_ticket"));
                            aux3=oConn.setResult.getString("h_ticket");
                        }
                        String exa= oConn.setResult.getString("p_cod");
                         System.out.println("llehgo");
                        String s=oConn.setResult.getString("la_nticket");
//                        String inm=oConn.setResult.getString("ld_codserv");
                        System.out.println("in");
                        registros[4]= oConn.setResult.getString("p_descripcion");
                        registros[5]= oConn.setResult.getString("p_cod");
                        if(s != null){
                            registros[6]="COMPLETO";
                        }else{
                            registros[6]="FALTA";
                        }
                       t++;
                        System.out.println("1-"+aux+aux1+aux2+exa);
                        System.out.println("2-"+registros[1]+registros[0] +registros[2]);
                        tbPacientes.setDefaultRenderer(Object.class, new MyCellRenderer());
                        model.addRow(registros);
                    }
                    // Coloca el Modelo de Nueva Cuenta
                    tbPacientes.setModel(model);
//                    tabla();
        tbPacientes.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbPacientes.getColumnModel().getColumn(1).setPreferredWidth(30);
        tbPacientes.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbPacientes.getColumnModel().getColumn(3).setPreferredWidth(10);
        tbPacientes.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbPacientes.getColumnModel().getColumn(5).setPreferredWidth(10);
        tbPacientes.getColumnModel().getColumn(6).setPreferredWidth(10);
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(LaboratorioClinicoAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(LaboratorioClinicoAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public class MyCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        boolean valid = String.valueOf(table.getValueAt(row, 5)).equals("COMPLETO");
            boolean valid = String.valueOf(table.getValueAt(row, 6)).equals("COMPLETO");
            boolean valid1 = String.valueOf(table.getValueAt(row, 6)).equals("OBSERVADO");
            component.setBackground(valid ? Color.green : valid1 ? Color.ORANGE : Color.RED);
            return component;
        }
    }
   //AGREGAR PRUEBAS
   public void sbServicioAgrega() {
        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
        // Prepara los datos vacios iniciales
        Object[] oFila = new Object[6];
        // Para el Query
        // Valida que haya algo en el Codigo
        String codser = tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 5).toString();
        String ser = tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 4).toString();
        String valorr="",grupo="";
        if(codser.equals("HM198")){
            valorr=" <6.0 mg/l"; 
        }else if(codser.equals("HM018")){
             valorr=" Hombre 0 - 10 \n Mujer 0 - 20";
        }else{
            valorr="-";
        }
        if(codser.equals("HM198")||codser.equals("HM018")||codser.equals("HM025")||codser.equals("HM198")){
            grupo="INMUNOLOGIA";
        }else{
             grupo="-";
        }
        if (!txtExamen.getText().isEmpty()) {
            // Prepara el Query
            //Ejecuta el Query
            // Capturo el Error
                    oFila[0] = codser;
                    oFila[1] = ser;
                    oFila[2] = "";
                    oFila[3] = valorr;
                    oFila[4] = grupo;
                    oFila[5] = "";
                    tblDatos.insertRow(0, oFila);
                    tbTicket.setModel(tblDatos);
                // Cierro los Resultados
        }
    }
   public void agregaHemograma(String Valor) {
        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
        // Prepara los datos vacios iniciales
        Object[] oFila = new Object[6];
        // Para el Query
        String sQuery;
        // Valida que haya algo en el Codigo
        if (!txtNTicket.getText().isEmpty()) {
            // Prepara el Query
            sQuery = "SELECT cod_servicio,descripcion, valor_ref,grupo " +
            "  FROM servicio_detalle where cod_servicio ='" +Valor + "'";
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);
            // Capturo el Error
            try {
                while (oConn.setResult.next()) {
                    oFila[0] = oConn.setResult.getString("cod_servicio");
                    oFila[1] = oConn.setResult.getString("descripcion");
                    oFila[2] = "";
                    oFila[3] = oConn.setResult.getString("valor_ref");
                    oFila[4] = oConn.setResult.getString("grupo");
                    oFila[5] = "";
                    tblDatos.insertRow(0, oFila);
                    tbTicket.setModel(tblDatos);
                } 
                // Cierro los Resultados
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("Servicios Hemograma:" + ex.getMessage().toString());
            }
        }
    }
    public void editarDatos(String Valor) {
        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
        // Prepara los datos vacios iniciales
        Object[] oFila = new Object[6];
        // Para el Query
        String sQuery;
        // Valida que haya algo en el Codigo
        if (!txtNTicket.getText().isEmpty()) {
            // Prepara el Query
            sQuery = "SELECT la.la_nticket, la.la_fecha, la.la_responsable, la.la_obsgeneral,"
                    + "ld.ld_codserv,ld.ld_descripcion, \n" +
"       ld.ld_resultado, ld.ld_valorr, ld.ld_grupo, ld.ld_observ\n" +
"  FROM laboratorio_asistencial la\n" +
"  inner join lab_asistencial_detalle ld on(la.la_nticket=ld.ld_nticket)\n" +
"  where la.la_nticket='" +Valor + "'";
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);
            // Capturo el Error
            try {
                while (oConn.setResult.next()) {
                    txtNTicket.setText(oConn.setResult.getString("la_nticket"));
                    FechaExamen.setDate(oConn.setResult.getDate("la_fecha"));
                    txtResponsable.setText(oConn.setResult.getString("la_responsable"));
                    txtObservaciones.setText(oConn.setResult.getString("la_obsgeneral"));
                    oFila[0] = oConn.setResult.getString("ld_codserv");
                    oFila[1] = oConn.setResult.getString("ld_descripcion");
                    oFila[2] = oConn.setResult.getString("ld_resultado");
                    oFila[3] = oConn.setResult.getString("ld_valorr");
                    oFila[4] = oConn.setResult.getString("ld_grupo");
                    oFila[5] = oConn.setResult.getString("ld_observ");;
                    tblDatos.insertRow(0, oFila);
                    tbTicket.setModel(tblDatos);
                } 
                
                // Cierro los Resultados
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("Servicios Hemograma:" + ex.getMessage().toString());
            }
        }
    }
    private void sbTicket() {
        // Declaro un modelo de datos
        ticket = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                if (columnIndex == 2) {
                    return true;
                } else if (columnIndex == 4) {
                    return true;
                } if (columnIndex == 5) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        ticket.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() == 1) {
                    
                }
            }
        });
        // Añadimos columnas al modelo de datos
        ticket.addColumn("COD");
        ticket.addColumn("PRUEBA");
        ticket.addColumn("RESULTADO");
        ticket.addColumn("VALORR");
        ticket.addColumn("GRUPO");
        ticket.addColumn("OBSERVACION");
        // Coloca el Modelo en la Tabla
        tbTicket.setModel(ticket);
        // Directamente
        tbTicket.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbTicket.getColumnModel().getColumn(1).setPreferredWidth(130);
        tbTicket.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbTicket.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbTicket.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbTicket.getColumnModel().getColumn(5).setPreferredWidth(50);
        tbTicket.getTableHeader().setReorderingAllowed(false);
        tbTicket.getTableHeader().setResizingAllowed(false);
        // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbTicket.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
    }
    private boolean validar() {
        boolean bResultado = true;
        if (txtResponsable.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Responsable");
            bResultado = false;
        }
        if (((JTextField) FechaExamen.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        return bResultado;
         }
        return bResultado;
    }
    private boolean oTicketDetalle() {
        // Para los resultados
        boolean bResult = false;
        // Para la sentencia Sql
        String insert;
        String values;
        try{
        // Query para actualizar el Folio
        insert = "INSERT INTO laboratorio_asistencial(\n" +
        " la_nticket, la_fecha,la_responsable, la_obsgeneral)";
        values = "VALUES ('" + txtNTicket.getText() + "','" + FechaExamen.getDate()+ "','"
                + txtResponsable.getText() + "','" 
                + txtObservaciones.getText() + "') ";
//        oFunc.SubSistemaMensajeError(insert+values);
            if (oConn.FnBoolQueryExecuteUpdate(insert + values)) {
                bResult = true;
            }
            oConn.sqlStmt.close();
        }catch(SQLException ex){
            Logger.getLogger(LaboratorioClinicoAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Retorna el Valor
        return bResult;

    }

    private boolean oTicketContenido() {
        // Para los resultados
        boolean bResult = false;
        // Variable para las filas de la Tabla de Productos
        int iFila;
        // Variables para los diferentes datos
        String sCodigoSer,sDescripcion, sResultado, sValorr, sGrupo, sObserv;
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        // Ciclo para grabar el detalle de la venta
        try {
            for (iFila = 0; iFila < tbTicket.getRowCount(); iFila++) {
                //Obtiene dato contenido en una celda de la tabla
                sCodigoSer = tbTicket.getModel().getValueAt(iFila, 0).toString();
                sDescripcion = tbTicket.getModel().getValueAt(iFila, 1).toString();
                sResultado = tbTicket.getModel().getValueAt(iFila, 2).toString();
                sValorr = tbTicket.getModel().getValueAt(iFila, 3).toString();
                sGrupo = tbTicket.getModel().getValueAt(iFila, 4).toString();
                System.out.println(sGrupo);
                sObserv = tbTicket.getModel().getValueAt(iFila, 5).toString();
                // Prepara Query para grabar venta detalle
                strSqlStmt = " INSERT INTO lab_asistencial_detalle";
                strSqlStmt = strSqlStmt + "(ld_nticket,";
                strSqlStmt = strSqlStmt + " ld_codserv,";
                strSqlStmt = strSqlStmt + " ld_descripcion,";
                strSqlStmt = strSqlStmt + " ld_resultado,";
                strSqlStmt = strSqlStmt + " ld_valorr,";
                strSqlStmt = strSqlStmt + " ld_grupo,";
                strSqlStmt = strSqlStmt + " ld_observ)";
                strSqlStmt = strSqlStmt + " Values (";
                strSqlStmt = strSqlStmt + "'" + txtNTicket.getText()  + "'";
                strSqlStmt = strSqlStmt + ",'" + sCodigoSer + "'";
                strSqlStmt = strSqlStmt + ",'" + sDescripcion + "'";
                strSqlStmt = strSqlStmt + ",'" + sResultado + "'";
                strSqlStmt = strSqlStmt + ",'" + sValorr + "'";
                strSqlStmt = strSqlStmt + ",'" + sGrupo + "'";
                strSqlStmt = strSqlStmt + ",'" + sObserv + "')";
                // Ejecuta la Sentencia
//            oFunc.SubSistemaMensajeError(strSqlStmt);
                if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                    bResult = true;
                }
            }
            // break;
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(LaboratorioClinicoAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bResult;
    }
    void Limpiar(){
        txtNTicket.setText(null);
        txtExamen.setText(null);
        txtResponsable.setText(null);
        txtObservaciones.setText(null);
        sbTicket();
    }
    public boolean OrdenExiste(){
        boolean bResultado = false;
        String sQuery = "Select ld_nticket from lab_asistencial_detalle Where ld_nticket=" + txtNTicket.getText();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next()) {
                bResultado = true;
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
        }
        return bResultado;
    }
    public void Eliminar(){
        String sQuery = "DELETE FROM lab_asistencial_detalle\n" +
                        " WHERE ld_nticket=" + txtNTicket.getText();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next()) {
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
        } 
        
    }
            
}
