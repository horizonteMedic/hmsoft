/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public class Hepatitis extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
    clsFunciones  oFunc = new clsFunciones();
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   public Hepatitis() {
       
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        FechaEx = new com.toedter.calendar.JDateChooser();
        jPanel17 = new javax.swing.JPanel();
        txtImprimir = new javax.swing.JTextField();
        btnImprimir6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtHepatitisB = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtHepatitisA = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        chkHA = new javax.swing.JCheckBox();
        chkHB = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        txtMetodo = new javax.swing.JTextField();
        rbPositivo = new javax.swing.JRadioButton();
        rbNegativo = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("LABORATORIO");

        jLabel9.setText("Nro Ficha:");

        jLabel10.setText("Nombres:");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel11.setText("Edad: ");

        jLabel118.setText("Fecha :");

        FechaEx.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExPropertyChange(evt);
            }
        });

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPRIMIR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
            }
        });

        btnImprimir6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir6)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImprimir)
            .addComponent(btnImprimir6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("PRUEBAS ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("RESULTADOS ");

        jLabel14.setText("HEPATITIS B (HBsAg) - RAPID TEST");

        txtHepatitisB.setEnabled(false);
        txtHepatitisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHepatitisBActionPerformed(evt);
            }
        });

        jLabel23.setText("HEPATITIS A (HAV) - RAPID TEST");

        txtHepatitisA.setEnabled(false);
        txtHepatitisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHepatitisAActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        jButton2.setText("Guardar/Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtHepatitisA, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jLabel14))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnLimpiar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHepatitisB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtHepatitisA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtHepatitisB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkHA);
        chkHA.setText("HEPATITIS A (HAV)");
        chkHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHAActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkHB);
        chkHB.setText("HEPATITIS B (HBsAg)");
        chkHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHBActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("MARCA :");

        txtMetodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMetodo.setText("RAPID TEST - MONTEST");
        txtMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbPositivo);
        rbPositivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbPositivo.setText("POSITIVO");
        rbPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPositivoActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbNegativo);
        rbNegativo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbNegativo.setText("NEGATIVO");
        rbNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNegativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkHA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkHB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEditar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(FechaEx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(72, 72, 72))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbPositivo)
                                    .addComponent(rbNegativo))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel118)
                        .addComponent(btnEditar))
                    .addComponent(FechaEx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkHA)
                    .addComponent(chkHB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbPositivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNegativo)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HEPATITIS", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        // TODO add your handling code here:
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
            if(!OrdenExiste()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNorden.getText() +"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombre"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) +" AÑOS" );
                        oPe.fecha(FechaEx);
                        //   oPe.fecha(FechaHotel);
                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra registrado");
                    }
                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("toxicologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("N° orden regitrado");
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void FechaExPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExPropertyChange

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirActionPerformed

    private void btnImprimir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir6ActionPerformed
        // TODO add your handling code here:
        print (Integer.parseInt(txtImprimir.getText()));
    }//GEN-LAST:event_btnImprimir6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (OrdenExiste()) {
            Actualizar();
        } else {
            if (!txtNorden.getText().isEmpty()) {
                try {
                    if (validar()) {
                        if (Grabar()) {
                            imprimir();
                            limpiar();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InformePsicolaboral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtHepatitisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHepatitisBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHepatitisBActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,\n" +
"           t.fecha_examen, t.txtmarca, t.txthepatitisa, t.txthepatitisb " +
"                   FROM datos_paciente AS d \n" +
"                   INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)    \n" +
"                   INNER JOIN lhepatitis AS t ON (t.n_orden = n.n_orden)  \n" +
"                   WHERE t.n_orden ="+txtNorden.getText()+";";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombres.setText(oConn.setResult.getString("nombre"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar()))+" AÑOS" );
                    txtMetodo.setText(oConn.setResult.getString("txtmarca"));
                    if(chkHA.isSelected()){
                        txtHepatitisA.setText(oConn.setResult.getString("txthepatitisa"));
                    }else if(chkHB.isSelected()){
                        txtHepatitisB.setText(oConn.setResult.getString("txthepatitisb"));
                    }
                       
                    FechaEx.setDate(oConn.setResult.getDate("fecha_examen"));
                }else{
                    oFunc.SubSistemaMensajeError("N° orden no registrado");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha toxicologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtHepatitisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHepatitisAActionPerformed
        // TODO add your handling code here:
        txtHepatitisB.requestFocus();
    }//GEN-LAST:event_txtHepatitisAActionPerformed

    private void txtMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtMetodoActionPerformed

    private void chkHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHAActionPerformed
        // TODO add your handling code here:
        if(chkHA.isSelected()){
            txtHepatitisA.setEnabled(true);
            txtHepatitisB.setText(null);
            txtHepatitisB.setEnabled(false);
            buttonGroup2.clearSelection();
        }
            
    }//GEN-LAST:event_chkHAActionPerformed

    private void chkHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHBActionPerformed
        // TODO add your handling code here:
        if(chkHB.isSelected()){
            txtHepatitisB.setEnabled(true);
            txtHepatitisA.setText(null);
            txtHepatitisA.setEnabled(false);
            buttonGroup2.clearSelection();
        }
    }//GEN-LAST:event_chkHBActionPerformed

    private void rbPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPositivoActionPerformed
        // TODO add your handling code here:
        if(chkHA.isSelected()){
            txtHepatitisA.setText("POSITIVO");
        }else if(chkHB.isSelected()){
            txtHepatitisB.setText("POSITIVO");
        }
    }//GEN-LAST:event_rbPositivoActionPerformed

    private void rbNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNegativoActionPerformed
        // TODO add your handling code here:
         if(chkHA.isSelected()){
            txtHepatitisA.setText("NEGATIVO");
        }else if(chkHB.isSelected()){
            txtHepatitisB.setText("NEGATIVO");
        }
    }//GEN-LAST:event_rbNegativoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEx;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir6;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkHA;
    private javax.swing.JCheckBox chkHB;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbNegativo;
    private javax.swing.JRadioButton rbPositivo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHepatitisA;
    private javax.swing.JTextField txtHepatitisB;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtMetodo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    // End of variables declaration//GEN-END:variables
    
    public boolean OrdenExiste(){
        boolean bResultado=false;
         if (!txtNorden.getText().isEmpty()) {
             String sQuery;
             sQuery = "Select n_orden from lhepatitis where n_orden=" + txtNorden.getText();
             oConn.FnBoolQueryExecute(sQuery);
             try {
                 if (oConn.setResult.next()) {
                     bResultado = true;
                 }
                 oConn.setResult.close();
             } catch (SQLException ex) {
             }
         }      
        return bResultado;
     }
     private boolean validar() {
        boolean bResultado = true;
        if (((JTextField) FechaEx.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        }
        return bResultado;
    }
   
    public void limpiar() {
        txtNorden.setText("");
        txtNombres.setText("");
        txtEdad.setText("");
        FechaEx.setDate(null);
        txtHepatitisA.setText(null);
        txtHepatitisB.setText(null);
        txtMetodo.setText("RAPID TEST - MONTEST");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }
     private boolean imprimir(){
        boolean im = false;
        int seleccion = JOptionPane.showOptionDialog(
            this, // Componente padre
            "¿Desea Imprimir?", //Mensaje
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
              printer(Integer.valueOf(txtNorden.getText().toString()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
    private void printer(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        String direccionReporte;
        try {
            if(chkHA.isSelected()){
                direccionReporte= System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "LHepatitisA.jasper";
            }else if(chkHB.isSelected()){
                direccionReporte= System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "LHepatitisB.jasper";
            }else
                direccionReporte= System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "LHepatitisB.jasper";
           
            JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
            JasperPrint jasperPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void print(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        String direccionReporte;
        try {
            if(chkHA.isSelected()){
                direccionReporte= System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "LHepatitisA.jasper";
            }else if(chkHB.isSelected()){
                direccionReporte= System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "LHepatitisB.jasper";
            }else
                direccionReporte= System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "LHepatitisB.jasper";
           
            
            JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
            JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
            JasperViewer viewer = new JasperViewer(myPrint, false);
            viewer.setTitle("FORMATO DE LABORATORIO");
            // viewer.setAlwaysOnTop(true);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void Actualizar() {
        String sCodigo = txtNorden.getText();
        String strSqlStmt;
        strSqlStmt = "UPDATE  lhepatitis\n "
                + "   SET fecha_examen='" + FechaEx.getDate() + "',"
                + "       txtmarca='" + txtMetodo.getText() + "',";
                if(chkHA.isSelected()){
                   strSqlStmt += "txthepatitisa='" + txtHepatitisA.getText() + "'";
                }else if(chkHB.isSelected()){
                   strSqlStmt += "txthepatitisb='" + txtHepatitisB.getText() + "'";
                }
                strSqlStmt += "   WHERE n_orden=" + sCodigo + ";";
       
        //  System.out.println(strSqlStmt);
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            imprimir();
            limpiar();
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Hepatitis.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }
     
     private boolean Grabar() throws SQLException {
        boolean bResult = false;
        String strSqlStmt = "INSERT INTO lhepatitis(\n" +
"            n_orden, fecha_examen, txtmarca,txthepatitisa, txthepatitisb)";
        strSqlStmt += " values(" + txtNorden.getText() + ",'"
                + FechaEx.getDate() + "','"
                + txtMetodo.getText() + "','"
                + txtHepatitisA.getText() + "','"
                + txtHepatitisB.getText() + "'"
                + " ) ";
        // System.out.println(strSqlStmt);
//        oFunc.SubSistemaMensajeError(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
//                   oConn.setResult.next();
            oFunc.SubSistemaMensajeInformacion("Examen Registrada");

            bResult = true;
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Hepatitis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bResult;
    }
  
}
