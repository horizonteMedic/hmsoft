/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public final class ConsentimientoPanel5D extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    DefaultTableModel model;

    public ConsentimientoPanel5D() {
        initComponents();
        sbCargarDatosMC("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btmarihuana = new javax.swing.ButtonGroup();
        btcocaina = new javax.swing.ButtonGroup();
        btcoca = new javax.swing.ButtonGroup();
        bt4 = new javax.swing.ButtonGroup();
        bt5 = new javax.swing.ButtonGroup();
        bt6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        FechaDosaje = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chk1_SI = new javax.swing.JCheckBox();
        chk2_SI = new javax.swing.JCheckBox();
        chk3_SI = new javax.swing.JCheckBox();
        chk1_NO = new javax.swing.JCheckBox();
        chk3_NO = new javax.swing.JCheckBox();
        chk2_NO = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsentimiento = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chk4_SI = new javax.swing.JCheckBox();
        chk4_NO = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        chk5_SI = new javax.swing.JCheckBox();
        chk5_NO = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        chk6_SI = new javax.swing.JCheckBox();
        chk6_NO = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consentimiento Panel 5D");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("YO :");

        txtNombres.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DE :");

        txtEdad.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Con DNI :");

        txtDni.setEditable(false);

        jLabel4.setText("Nro: Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha :");

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnCrear.setText("Grabar/actualizar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel6.setText("Consumo de Marihuana");

        jLabel7.setText("Consumo de Cocaina");

        jLabel8.setText("Consumo de hoja de COCA en los 14 días previos");

        btmarihuana.add(chk1_SI);
        chk1_SI.setText("SI");

        btcocaina.add(chk2_SI);
        chk2_SI.setText("SI");

        btcoca.add(chk3_SI);
        chk3_SI.setText("SI");

        btmarihuana.add(chk1_NO);
        chk1_NO.setText("NO");

        btcoca.add(chk3_NO);
        chk3_NO.setText("NO");

        btcocaina.add(chk2_NO);
        chk2_NO.setText("NO");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Nombres :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tbConsentimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsentimiento.getTableHeader().setReorderingAllowed(false);
        tbConsentimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbConsentimientoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbConsentimiento);
        if (tbConsentimiento.getColumnModel().getColumnCount() > 0) {
            tbConsentimiento.getColumnModel().getColumn(0).setResizable(false);
            tbConsentimiento.getColumnModel().getColumn(1).setResizable(false);
            tbConsentimiento.getColumnModel().getColumn(2).setResizable(false);
            tbConsentimiento.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel10.setText("años");

        jLabel35.setText("Codigo:");

        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jLabel11.setText("CONSUMO DE ANFETAMINAS");

        bt4.add(chk4_SI);
        chk4_SI.setText("SI");

        bt4.add(chk4_NO);
        chk4_NO.setText("NO");

        jLabel12.setText("CONSUMO DE METHANFETAMINAS ");

        bt5.add(chk5_SI);
        chk5_SI.setText("SI");

        bt5.add(chk5_NO);
        chk5_NO.setText("NO");

        jLabel13.setText("CONSUMO DE BENZODIACEPINAS");

        bt6.add(chk6_SI);
        chk6_SI.setText("SI");

        bt6.add(chk6_NO);
        chk6_NO.setText("NO");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chk6_SI))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(chk5_SI))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(chk1_SI)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(5, 5, 5)
                                                        .addComponent(jLabel10)
                                                        .addGap(28, 28, 28))
                                                    .addComponent(chk2_SI)
                                                    .addComponent(chk3_SI))
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(chk4_SI))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(chk1_NO)
                                                .addComponent(chk2_NO)
                                                .addComponent(chk3_NO))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(chk4_NO)
                                            .addComponent(chk5_NO)
                                            .addComponent(chk6_NO)))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar)
                            .addComponent(jLabel5)
                            .addComponent(FechaDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(chk1_SI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(chk2_SI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(chk3_SI)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk1_NO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk2_NO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk3_NO)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk4_NO)
                            .addComponent(chk4_SI)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk5_NO)
                            .addComponent(chk5_SI)
                            .addComponent(jLabel12))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk6_NO)
                            .addComponent(chk6_SI)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnLimpiar))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if (!txtNorden.getText().isEmpty()) {
            if (!OrdenExiste()) {
                String Sql = "select d.nombres_pa||' '||d.apellidos_pa AS nombre, d.cod_pa, d.fecha_nacimiento_pa from datos_paciente AS d "
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) WHERE n.n_orden ='" + txtNorden.getText()+ "'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombre"));
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtNorden.setEditable(false);
                        FechaDosaje.requestFocusInWindow();
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                        oPe.fecha(FechaDosaje);
                    } else {
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Consentimiento Dosaje:" + ex.getMessage().toString());
                }
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
            if (!txtNorden.getText().isEmpty()) {
                if(OrdenExiste()){
                    if(validar()){
                        Actualizar();
                        imprimir();
                        Limpiar();
                        sbCargarDatosMC("");
                    }
                }else if(validar()) {
                    try {
                        if (Grabar()) {
                            oFunc.SubSistemaMensajeInformacion("Agregado Correctamente");
                            imprimir();
                            Limpiar();
                            sbCargarDatosMC("");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ConsentimientoPanel5D.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                oFunc.SubSistemaMensajeError("Ingrese Nro Orden");
            }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        sbCargarDatosMC(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbConsentimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsentimientoMousePressed
        if (evt.getClickCount() == 2) {
            Integer num = Integer.valueOf(tbConsentimiento.getValueAt(tbConsentimiento.getSelectedRow(), 0).toString());
            reporte(num);
        }
    }//GEN-LAST:event_tbConsentimientoMousePressed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        sbCargarDatosMC(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
     JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
            String Sql="SELECT d.nombres_pa||' '||d.apellidos_pa AS nombre, d.cod_pa, d.fecha_nacimiento_pa ,"
            + "m.* " +
            "       FROM datos_paciente AS d \n" +
            "       INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n" +
            "       INNER JOIN consentimiento_panel5d AS m ON (m.n_orden = n.n_orden)\n" +
            "       WHERE n.n_orden ="+txtNorden.getText();
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombres.setText(oConn.setResult.getString("nombre"));
                    txtDni.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                    FechaDosaje.setDate(oConn.setResult.getDate("fecha_dosaje"));
                    chk1_SI.setSelected(oConn.setResult.getBoolean("chk1_si"));
                    chk1_NO.setSelected(oConn.setResult.getBoolean("chk1_no"));
                    chk2_SI.setSelected(oConn.setResult.getBoolean("chk2_si"));
                    chk2_NO.setSelected(oConn.setResult.getBoolean("chk2_no"));
                    chk3_SI.setSelected(oConn.setResult.getBoolean("chk3_si"));
                    chk3_NO.setSelected(oConn.setResult.getBoolean("chk3_no"));
                    chk4_SI.setSelected(oConn.setResult.getBoolean("chk4_si"));
                    chk4_NO.setSelected(oConn.setResult.getBoolean("chk4_no"));
                    chk5_SI.setSelected(oConn.setResult.getBoolean("chk5_si"));
                    chk5_NO.setSelected(oConn.setResult.getBoolean("chk5_no"));
                    chk6_SI.setSelected(oConn.setResult.getBoolean("chk6_si"));
                    chk6_NO.setSelected(oConn.setResult.getBoolean("chk6_no"));
                    
                }else{
                    oFunc.SubSistemaMensajeError("N° orden no registrado");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha consentimiento panel 5d:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    private void reporte(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/ConsentimientoPanel5d.jasper";
            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Consentimiento Dosaje.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperViewer.viewReport(myPrint, false);
            //JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
            //JasperPrintManager.printReport(jasperPrint,true);
        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Limpiar() {
        txtNombres.setText(null);
        txtEdad.setText(null);
        txtDni.setText(null);
        FechaDosaje.setDate(null);
        txtNorden.setText(null);
        btcoca.clearSelection();
        btmarihuana.clearSelection();
        btcocaina.clearSelection();
        bt4.clearSelection();
        bt5.clearSelection();
        bt6.clearSelection();
//        txtNorden.setEditable(true);
        txtNorden.requestFocus();
    }

    void sbCargarDatosMC(String valor) {
        String[] titulos = {"N°Orden", "Nombres", "Fecha"};
        String[] registros = new String[3];
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        String Sql = "";
        if (!txtBuscarCod.getText().isEmpty()) {
            Sql = "select d.nombres_pa||''||d.apellidos_pa AS nombres , c.fecha_dosaje,c.n_orden "
                    + "FROM datos_paciente AS d "
                    + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)"
                    + "INNER JOIN consentimiento_panel5d AS c ON (n.n_orden = c.n_orden)"
                    + "where c.n_orden='" + txtBuscarCod.getText() + "'";
        } else {
            Sql = "select d.nombres_pa||''||d.apellidos_pa AS nombres , c.fecha_dosaje,c.n_orden "
                    + "FROM datos_paciente AS d "
                    + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)"
                    + "INNER JOIN consentimiento_panel5d AS c ON (n.n_orden = c.n_orden)where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%" + valor + "%'";
        }
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if (oConn.FnBoolQueryExecute(Sql)) {
            try {
                while (oConn.setResult.next()) {
                    registros[0] = oConn.setResult.getString("n_orden");
                    registros[1] = oConn.setResult.getString("nombres");
                    registros[2] = formato.format(oConn.setResult.getDate("fecha_dosaje"));
                    model.addRow(registros);
                }
                // Coloca el Modelo de Nueva Cuenta
                tbConsentimiento.setModel(model);
                tabla();
                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    void tabla() {
        tbConsentimiento.setFont(new java.awt.Font("Tahoma", 0, 11));
        tbConsentimiento.setModel(model);
        tbConsentimiento.getColumnModel().getColumn(0).setPreferredWidth(120);
        tbConsentimiento.getColumnModel().getColumn(1).setPreferredWidth(400);
        tbConsentimiento.getColumnModel().getColumn(2).setPreferredWidth(200);
        tbConsentimiento.getTableHeader().setReorderingAllowed(false);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaDosaje;
    private javax.swing.ButtonGroup bt4;
    private javax.swing.ButtonGroup bt5;
    private javax.swing.ButtonGroup bt6;
    private javax.swing.ButtonGroup btcoca;
    private javax.swing.ButtonGroup btcocaina;
    private javax.swing.ButtonGroup btmarihuana;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chk1_NO;
    private javax.swing.JCheckBox chk1_SI;
    private javax.swing.JCheckBox chk2_NO;
    private javax.swing.JCheckBox chk2_SI;
    private javax.swing.JCheckBox chk3_NO;
    private javax.swing.JCheckBox chk3_SI;
    private javax.swing.JCheckBox chk4_NO;
    private javax.swing.JCheckBox chk4_SI;
    private javax.swing.JCheckBox chk5_NO;
    private javax.swing.JCheckBox chk5_SI;
    private javax.swing.JCheckBox chk6_NO;
    private javax.swing.JCheckBox chk6_SI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbConsentimiento;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    // End of variables declaration//GEN-END:variables
private boolean Grabar() throws SQLException {
        boolean bResult = false;
        String strSqlStmt = "INSERT INTO consentimiento_panel5d(\n" +
"            n_orden, fecha_dosaje, chk1_si, chk1_no, chk2_si, chk2_no, chk3_si, \n" +
"            chk3_no, chk4_si, chk4_no, chk5_si, chk5_no, chk6_si, chk6_no, \n" +
"            edad_dosaje)";
        strSqlStmt += "values ('" + txtNorden.getText()+ "','" + FechaDosaje.getDate() + "','";
        strSqlStmt += chk1_SI.isSelected() + "','" + chk1_NO.isSelected() + "','";
        strSqlStmt += chk2_SI.isSelected() + "','" + chk2_NO.isSelected() + "','";
        strSqlStmt += chk3_SI.isSelected() + "','" + chk3_NO.isSelected() + "','";
        strSqlStmt += chk4_SI.isSelected() + "','" + chk4_NO.isSelected() + "','"; 
        strSqlStmt += chk5_SI.isSelected() + "','" + chk5_NO.isSelected() + "','";
        strSqlStmt += chk6_SI.isSelected() + "','" + chk6_NO.isSelected() + "','" 
                + txtEdad.getText() + "')";
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            //oConn.setResult.next();
            bResult = true;
            oConn.sqlStmt.close();
        }
        return bResult;
    }

   private void Actualizar() {
        String strSqlStmt = "UPDATE consentimiento_panel5d\n" +
        "   SET  fecha_dosaje='" + FechaDosaje.getDate()+ "', "
                + "chk1_si='"+chk1_SI.isSelected()+"', "
                + "chk1_no='"+chk1_NO.isSelected()+"', "
                + "chk2_si='"+chk2_SI.isSelected()+"', "
                + "chk2_no='"+chk2_NO.isSelected()+"', "
                + "chk3_si='"+chk3_SI.isSelected()+"', "
                + "chk3_no='"+chk3_NO.isSelected()+"', "
                + "chk4_si='"+chk4_SI.isSelected()+"', "
                + "chk4_no='"+chk4_NO.isSelected()+"', "
                + "chk5_si='"+chk5_SI.isSelected()+"', "
                + "chk5_no='"+chk5_NO.isSelected()+"', " 
                + "chk6_si='"+chk6_SI.isSelected()+"', "
                + "chk6_no='"+chk6_NO.isSelected()+"', "
                + "edad_dosaje='" + txtEdad.getText() + "'" +
        " WHERE n_orden=" + txtNorden.getText()+ ";"
                ;
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            //oConn.setResult.next();
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsentimientoPanel5D.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean validar() {
        boolean bResultado = true;
        if (((JTextField) FechaDosaje.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        }
        if (btcoca.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Consumio Hoja de coca?");
            bResultado = false;
        }
        if (btcocaina.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Consumo de cocaina?");
            bResultado = false;
        }
        if (btmarihuana.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Consumo de Marihuana?");
            bResultado = false;
        }
        if (bt4.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Consumio de ANFETAMINAS?");
            bResultado = false;
        }
        if (bt5.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Consumo de METHANFETAMINAS?");
            bResultado = false;
        }
        if (bt6.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Consumo de BENZODIACEPINAS?");
            bResultado = false;
        }
        return bResultado;
    }

    public boolean OrdenExiste() {
        boolean bResultado = false;
        if (!txtNorden.getText().isEmpty()) {
            String sQuery;
            sQuery = "Select n_orden from consentimiento_panel5d Where n_orden =" + txtNorden.getText();
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);
            // Capturo el Error
            try {
                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;
                }
                // Cierro los Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {

            }
        }
        return bResultado;
    }

    private void imprimir() {
        int seleccion = JOptionPane.showOptionDialog(
                this, // Componente padre
                "¿Desea Imprimir ?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                printer(Integer.valueOf(txtNorden.getText()));
            } else {
                // PRESIONO NO
            }
        }

    }

    private void printer(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/ConsentimientoPanel5d.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Consentimiento Dosaje.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            //JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);

            //      JasperViewer.viewReport(myPrint,false);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(CertificacionMedicaTrabajoAltura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
