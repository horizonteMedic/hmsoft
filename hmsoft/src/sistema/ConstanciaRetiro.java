/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Richard
 */
public class ConstanciaRetiro extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
 clsFunciones  oFunc = new clsFunciones();
    public ConstanciaRetiro() {
        initComponents();
        activar(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContrata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FechaRetiro = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atxtDiagnostico = new javax.swing.JTextArea();
        FechaHoy = new com.toedter.calendar.JDateChooser();
        txtExamen = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnImp = new javax.swing.JButton();
        txtimp = new javax.swing.JTextField();

        setClosable(true);
        setTitle("CONSTANCIA MÉDICA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Constancia Médica"));

        jLabel2.setText("El que suscribe");

        jLabel1.setText("Deja constancia que El Sr(a): ");

        jLabel3.setText(", de ");

        jLabel4.setText("años de edad, ");

        jLabel5.setText("identificado con DNI:");

        jLabel6.setText(", con cargo: ");

        jLabel7.setText(", trabajador de la empresa ");

        jLabel8.setText(", en la ");

        jLabel9.setText(";  pasó examen médico de");

        jLabel10.setText(", presentando los siguientes diagnosticos: ");

        jLabel11.setText("  en C.M HORIZONTE MEDIC el día  ");

        atxtDiagnostico.setColumns(20);
        atxtDiagnostico.setRows(5);
        jScrollPane1.setViewportView(atxtDiagnostico);

        FechaHoy.setDateFormatString("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FechaRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(FechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCargo))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel7)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(29, 29, 29)
                                            .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 44, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnGuardar.setText("Guardar/Actualizar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("N° Ficha :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenKeyTyped(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpActionPerformed(evt);
            }
        });

        txtimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnGuardar)
                        .addGap(2, 2, 2)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtimp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(btnImp)
                        .addComponent(txtimp)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static com.toedter.calendar.JDateChooser FechaNacimiento;
    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        //activar(true);
       
         FechaNacimiento = new com.toedter.calendar.JDateChooser();
       if(!txtNorden.getText().isEmpty()){
        if(!OrdenExiste()){  
               
       String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,d.sexo_pa,"
                + "n.razon_empresa,n.razon_contrata ,n.n_orden, n.cargo_de, txtobservacionesfm, n.nom_examen "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
               + "INNER JOIN anexo7c AS a ON (a.n_orden = n.n_orden) "
               + "WHERE n.n_orden ='"+txtNorden.getText().toString() +"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombre.setText(oConn.setResult.getString("nombre"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa")); 
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtDNI.setText(oConn.setResult.getString("cod_pa"));
                        txtCargo.setText(oConn.setResult.getString("cargo_de"));
                      //  txtSexo.setText(oConn.setResult.getString("sexo_pa").equals("M")?"MASCULINO" : "FEMENINO");    
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        atxtDiagnostico.setText(oConn.setResult.getString("txtobservacionesfm"));
                        txtExamen.setText(oConn.setResult.getString("nom_examen"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtNorden.setEditable(false);
                     //   FechaHoy.requestFocusInWindow();
                         Fecha();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());}
       
        }
           } 
    }//GEN-LAST:event_txtNordenActionPerformed
public boolean OrdenExiste()
    {
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from orden_retiro Where n_orden ="+txtNorden.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed
private boolean Grabar() throws SQLException{
        boolean bResult = false;
              
       String strSqlStmt ="INSERT INTO orden_retiro(n_orden,fecha_hoy, fecha_retiro,edad)";       
            strSqlStmt+= "values ('"+ txtNorden.getText().toString()+"','"+FechaHoy.getDate()+
                    "','"+FechaHoy.getDate()+"','"+txtEdad.getText().toString()+"' )";
           
          
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                
//                   oConn.setResult.next();
            
                   bResult = true;
                       oFunc.SubSistemaMensajeInformacion("Orden Registrada");
               }
              
              
                return bResult;       
        }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         if(OrdenExiste()){  
            Actualizar();
         }else{
              if(!txtNorden.getText().isEmpty()){
            try {
              
                if(Grabar()){
                    imprimir();
                    limpiar();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConstanciaRetiro.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
         }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
       oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "n.razon_empresa,n.razon_contrata ,n.n_orden, n.cargo_de, txtobservacionesfm, "
                + "n.nom_examen, o.fecha_hoy, o.fecha_retiro, o.edad "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "INNER JOIN anexo7c AS a ON (a.n_orden = n.n_orden) "
                + "INNER JOIN orden_retiro AS o ON (o.n_orden = n.n_orden) "
               + "WHERE n.n_orden ='"+txtNorden.getText().toString() +"'";
         oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombre.setText(oConn.setResult.getString("nombre"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa")); 
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtDNI.setText(oConn.setResult.getString("cod_pa"));
                        txtCargo.setText(oConn.setResult.getString("cargo_de"));
                       
                        atxtDiagnostico.setText(oConn.setResult.getString("txtobservacionesfm"));
                        txtExamen.setText(oConn.setResult.getString("nom_examen"));
                        Fecha();
//                        FechaHoy.setDate(oConn.setResult.getDate("fecha_hoy"));
                        FechaRetiro.setDate(oConn.setResult.getDate("fecha_retiro"));
                        txtEdad.setText(oConn.setResult.getString("edad") );
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
        if(!txtimp.getText().isEmpty()){
            print(Integer.valueOf(txtimp.getText().toString()));
        }
    }//GEN-LAST:event_btnImpActionPerformed

    private void txtimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimpActionPerformed

    }//GEN-LAST:event_txtimpActionPerformed
    private void print(Integer cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                 String c=txtExamen.getText().toString();
                    if ("ANUAL".equals(c) || "RETIRO".equals(c)) {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ConstanciaRetiro.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("CONSTANCIA DE RETIRO");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                    }
                    if ("PRE-OCUPACIONAL".equals(c)) {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ConstanciaRetiro1.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("CONSTANCIA DE RETIRO");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                    }
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
    private void Actualizar(){
        String sCodigo=txtNorden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE orden_retiro\n" +
                    "   SET  fecha_hoy='"+FechaHoy.getDate()+"',"
                + " fecha_retiro='"+FechaRetiro.getDate()+"', edad='"+txtEdad.getText().toString()+"'" +
                " WHERE n_orden='" + sCodigo + "'";
            
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            imprimir();
            limpiar();
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        
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
   private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                     String c=txtExamen.getText().toString();
                    if ("ANUAL".equals(c) || "RETIRO".equals(c)) {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ConstanciaRetiro.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("CONSTANCIA DE RETIRO");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                    }
                    if ("PRE-OCUPACIONAL".equals(c)) {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ConstanciaRetiro1.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("CONSTANCIA DE RETIRO");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                    }
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
    private void activar(boolean b){
    txtNombre.setEnabled(b);
    txtDNI.setEnabled(b);
    txtCargo.setEnabled(b);
    txtContrata.setEnabled(b);
    txtEmpresa.setEnabled(b);
    txtEdad.setEnabled(b);
    FechaHoy.setEnabled(b);
    FechaRetiro.setEnabled(b);
    txtExamen.setEditable(b);
   // atxtDiagnostico.setEnabled(!b);
}
private void limpiar(){
txtNombre.setText(null);
txtDNI.setText(null);
txtCargo.setText(null);
txtContrata.setText(null);
txtEmpresa.setText(null);
txtEdad.setText(null);
FechaHoy.setDate(null);
FechaRetiro.setDate(null);
atxtDiagnostico.setText(null);
txtNorden.setText(null);
txtNorden.setEditable(true);
txtNorden.requestFocus();
txtExamen.setText(null);
}
void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaHoy.setDate(fechaDate);
FechaRetiro.setDate(fechaDate);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaHoy;
    private com.toedter.calendar.JDateChooser FechaRetiro;
    private javax.swing.JTextArea atxtDiagnostico;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImp;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtExamen;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtimp;
    // End of variables declaration//GEN-END:variables
}