/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import static sistema.LaboratorioClinicoCovid.FechaNacimiento;

/**
 *
 * @author USER
 */
public class pruebamolecular extends javax.swing.JFrame {
clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
       public static com.toedter.calendar.JDateChooser FechaNacimiento;
         clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    /**
     * Creates new form pruebamolecular
     */
    public pruebamolecular() {
        initComponents();
        llenarbox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        txtNordenIn = new javax.swing.JTextField();
        FechaExIn = new com.toedter.calendar.JDateChooser();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtNombresIn = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtDniIn = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtEdadIn = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnGrabarIn = new javax.swing.JButton();
        btnLimpiarIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel59.setText("Nº Orden :");

        txtNordenIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenInActionPerformed(evt);
            }
        });
        txtNordenIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenInKeyTyped(evt);
            }
        });

        FechaExIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExInPropertyChange(evt);
            }
        });

        jLabel60.setText("Fecha :");

        jLabel61.setText("Nombres y Apellidos :");

        txtNombresIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresInActionPerformed(evt);
            }
        });

        jLabel62.setText("DNI :");

        jLabel63.setText("Edad :");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar/Mostrar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNordenIn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaExIn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnEditar))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniIn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel63)
                        .addGap(40, 40, 40)
                        .addComponent(txtEdadIn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombresIn, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59)
                        .addComponent(txtNordenIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60))
                    .addComponent(FechaExIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(txtNombresIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtDniIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(txtEdadIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnGrabarIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabarIn.setText("Grabar/Actualizar");
        btnGrabarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarInActionPerformed(evt);
            }
        });

        btnLimpiarIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarIn.setText("Limpiar");
        btnLimpiarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGrabarIn)
                                .addGap(58, 58, 58)
                                .addComponent(btnLimpiarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void llenarbox(){

jComboBox1.addItem("POSITIVO");
jComboBox1.addItem("NEGATIVO");
jComboBox1.addItem("REACTIVO");
jComboBox1.addItem("NO REACTIVO");
}
    private void txtNordenInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenInActionPerformed

        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn.getText().isEmpty()){
            if(!OrdenExisteIn4()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNordenIn.getText() +"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombresIn.setText(oConn.setResult.getString("nombre"));
                        txtDniIn.setText(oConn.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdadIn.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );

                        //System.out.println(pasar);

                        //soloPc(pasar);
                        txtNordenIn.setEditable(false);
                        // FechaHoy.requestFocusInWindow();
                        oPe.fecha(FechaExIn);

                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
                    oConn.setResult.close();
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        }

    }//GEN-LAST:event_txtNordenInActionPerformed
    public boolean OrdenExisteIn4()
     {
        boolean bResultado=false;
        if(!txtNordenIn.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from prueba_moleculares Where n_orden ="+txtNordenIn.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     }
    private void txtNordenInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenInKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenInKeyTyped

    private void FechaExInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExInPropertyChange

    }//GEN-LAST:event_FechaExInPropertyChange

    private void txtNombresInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresInActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                        
            + "n.tipoprueba,ct.resultado,n.fecha_apertura_po " +
            "               FROM datos_paciente AS d \n" +
            "               INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "               INNER JOIN prueba_moleculares AS ct ON (ct.n_orden = n.n_orden) \n" +
            "               WHERE n.n_orden ='"+txtNordenIn.getText() +"'";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombresIn.setText(oConn.setResult.getString("nombre"));
                    txtDniIn.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                   jComboBox1.setSelectedItem(oConn.setResult.getString("resultado"));

                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                }
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarActionPerformed
  public boolean OrdenExisteIn()
    {
        boolean bResultado=false;
        if(!txtNordenIn.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from prueba_moleculares Where n_orden ="+txtNordenIn.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     }  
    private void btnGrabarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarInActionPerformed
          if(OrdenExisteIn()){
                ActualizarIn();
                LimpiarIn();

            }
            else{
                if(!txtNordenIn.getText().isEmpty()){
                    try {
                        if(validarIn()){
                            if(GrabarIn()){
                                LimpiarIn();
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }//GEN-LAST:event_btnGrabarInActionPerformed

    private void btnLimpiarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInActionPerformed
        // TODO add your handling code here:
        LimpiarIn();
        
    }//GEN-LAST:event_btnLimpiarInActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing
      public void ActualizarIn(){
            String sCodigo=txtNordenIn.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE prueba_moleculares\n" +
                    " SET resultado='"+jComboBox1.getSelectedItem()+"'"+
                   
                    " WHERE n_orden="+sCodigo+";";
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                
              //  Limpiar();

            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
            
            try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                     Logger.getLogger(pruebamolecular.class.getName()).log(Level.SEVERE, null, ex);
                }
    }  
    
    private boolean validarIn(){
        boolean bResultado=true;

            if (((JTextField)FechaExIn.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
       private boolean GrabarIn() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO prueba_moleculares(\n" +
"            n_orden, resultado)";       
            strSqlStmt+= "values("+ txtNordenIn.getText()+",'"+jComboBox1.getSelectedItem()+"')";
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   
               }
             
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                     Logger.getLogger(pruebamolecular.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                return bResult;       
        } 
    public void LimpiarIn(){
txtNordenIn.setText("");
FechaExIn.setDate(null);
txtDniIn.setText("");
txtEdadIn.setText("");
txtNombresIn.setText("");
txtNordenIn.setEditable(true);
jComboBox1.setSelectedItem("");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pruebamolecular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pruebamolecular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pruebamolecular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pruebamolecular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pruebamolecular().setVisible(true);
            }
        });
    }

public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
    try {
        oConn.sqlStmt.close();
    } catch (SQLException ex) {
        Logger.getLogger(pruebamolecular.class.getName()).log(Level.SEVERE, null, ex);
    }
  
    this.dispose();
      //  System.exit(0);

    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExIn;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabarIn;
    private javax.swing.JButton btnLimpiarIn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JTextField txtDniIn;
    private javax.swing.JTextField txtEdadIn;
    private javax.swing.JTextField txtNombresIn;
    private javax.swing.JTextField txtNordenIn;
    // End of variables declaration//GEN-END:variables
}
