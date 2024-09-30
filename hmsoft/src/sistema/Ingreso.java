
package sistema;

import Caja.Admision;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Consultas.ConsultasEmpresas;
import Consultas.IngresoConsultas;
import autocomplete.ajTextField;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class Ingreso extends javax.swing.JFrame {
   //variales Area Usuario
    static final boolean PROCESO_CODIGO = true;
    static final boolean ADMISION_CODIGO = true;
     static final boolean FARMACIA_CODIGO = true;
    public static String doctor;
    
   clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   public String seded="";
   public JComboBox cboEmpresa;
   public static String  nombresede;
      public static String  ipd;

   String emp;
       public Ingreso()  {
            
        initComponents(); 
           
        Properties props = new Properties();
       
        FileInputStream in = null;
        try {
            in = new FileInputStream("pierola.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            props.load(in);
        } catch (IOException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
           String url = props.getProperty("dataBaseServer");
           String db = props.getProperty("dataBaseCatalog");
           String username = props.getProperty("dataBaseUser");
           String password = props.getProperty("dataBasePassword");
           seded=props.getProperty("nameSede");
           clsGlobales.sedeSede=props.getProperty("nameSede");
           clsGlobales.ipIp=props.getProperty("dataBaseServer");
           ipd= props.getProperty("dataBaseServer");
      if (! oConn.FnBoolConnectionOpen("org.postgresql.Driver", "jdbc:postgresql://"+url+ ":5432/"+ db,username,password))
        {
          JOptionPane.showMessageDialog(null,"No se logro la conexion al Host");
          System.exit(0);
        }
        else
        {
           initComponents(); 
           lbliduser.setVisible(false);
            fecha();
            CargarUsuarios();
            CargarSedes();
        }
        AutoCompleteDecorator.decorate(this.cboUsuarios);
    }
       
       
       
    @Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/med.png"));
    return retValue;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btIngreso = new javax.swing.ButtonGroup();
        lblUsuario_L = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btncancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFechaLogin = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHoraLogin = new javax.swing.JTextField();
        cboUsuarios = new javax.swing.JComboBox();
        lbliduser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        chkSistema = new javax.swing.JCheckBox();
        chkAdmision = new javax.swing.JCheckBox();
        chkFarmacia = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cboSede = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso a \"MEDSOFT\"");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(549, 263));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario_L.setText("Usuario :");
        getContentPane().add(lblUsuario_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 98, -1, -1));

        lblpass.setText("Contraseña :");
        getContentPane().add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 128, -1, -1));

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 125, 123, -1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btncancelar.setText("Cerrar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 225, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Datos de Acceso al Sistema");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 6, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carnet.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, -1, 115));

        lblFecha.setText("Fecha :");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 153, -1, -1));

        txtFechaLogin.setEditable(false);
        txtFechaLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaLoginActionPerformed(evt);
            }
        });
        txtFechaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtFechaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 153, 123, -1));

        lblHora.setText("Hora :");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 187, -1, -1));

        txtHoraLogin.setEditable(false);
        txtHoraLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoraLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoraLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtHoraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 183, 123, -1));

        cboUsuarios.setEditable(true);
        cboUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione algun usuario" }));
        cboUsuarios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboUsuariosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuariosActionPerformed(evt);
            }
        });
        cboUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboUsuariosKeyPressed(evt);
            }
        });
        getContentPane().add(cboUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 93, 256, -1));

        lbliduser.setText("id");
        lbliduser.setEnabled(false);
        getContentPane().add(lbliduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 98, 18, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 225, -1, -1));

        btIngreso.add(chkSistema);
        chkSistema.setSelected(true);
        chkSistema.setText("Sistema");
        chkSistema.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(chkSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 57, -1, -1));

        btIngreso.add(chkAdmision);
        chkAdmision.setText("Admisión");
        chkAdmision.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkAdmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdmisionActionPerformed(evt);
            }
        });
        getContentPane().add(chkAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 57, -1, -1));

        btIngreso.add(chkFarmacia);
        chkFarmacia.setText("Consultas");
        chkFarmacia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFarmaciaActionPerformed(evt);
            }
        });
        getContentPane().add(chkFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 57, -1, -1));

        jLabel14.setText("Ingresos Area :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 61, -1, -1));

        cboSede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione la sede" }));
        cboSede.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboSedePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSedeActionPerformed(evt);
            }
        });
        cboSede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboSedeKeyPressed(evt);
            }
        });
        getContentPane().add(cboSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 25, 230, -1));

        jLabel15.setText("Sede:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 30, -1, -1));

        setSize(new java.awt.Dimension(565, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncancelarActionPerformed

   private void cboUsuariosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboUsuariosPopupMenuWillBecomeInvisible
       
   }//GEN-LAST:event_cboUsuariosPopupMenuWillBecomeInvisible

   private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
 enter(evt);
   }//GEN-LAST:event_formKeyPressed

   private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
enter(evt);
   }//GEN-LAST:event_txtpassKeyPressed

   private void cboUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboUsuariosKeyPressed
 enter(evt); 
 evt.getSource().toString().toUpperCase();
   }//GEN-LAST:event_cboUsuariosKeyPressed

   private void txtFechaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaLoginKeyPressed
enter(evt);        
   }//GEN-LAST:event_txtFechaLoginKeyPressed

   private void txtHoraLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraLoginKeyPressed
enter(evt);
   }//GEN-LAST:event_txtHoraLoginKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(!btIngreso.isSelected(null)){
        validar();
       }else{oFunc.SubSistemaMensajeError("Seleccione Area a Ingresar");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
      validar();
    }//GEN-LAST:event_txtpassActionPerformed

    private void cboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuariosActionPerformed
         cboUsuarios.getEditor().addActionListener(new ActionListener() {
         @Override
     public void actionPerformed(ActionEvent e) {
           
         if(cboUsuarios.getSelectedIndex()<=-1 )
         {
             
         }else{
         
         txtpass.requestFocus();
         }
           
     }});
    }//GEN-LAST:event_cboUsuariosActionPerformed

    private void cboSedePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboSedePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSedePopupMenuWillBecomeInvisible

    private void cboSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSedeActionPerformed

    private void cboSedeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboSedeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSedeKeyPressed

    private void chkSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSistemaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing

    private void chkFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkFarmaciaActionPerformed

    private void chkAdmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdmisionActionPerformed

    private void txtFechaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaLoginActionPerformed
    public static void main(String args[]) {
             new Ingreso().setVisible(true);
    }
    
    public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
        try {
            oConn.sqlStmt.close();
        }  catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    this.dispose();
      //  System.exit(0);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btIngreso;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox cboSede;
    private javax.swing.JComboBox cboUsuarios;
    private javax.swing.JCheckBox chkAdmision;
    private javax.swing.JCheckBox chkFarmacia;
    private javax.swing.JCheckBox chkSistema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario_L;
    private javax.swing.JLabel lbliduser;
    private javax.swing.JLabel lblpass;
    private javax.swing.JTextField txtFechaLogin;
    private javax.swing.JTextField txtHoraLogin;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
private void enter(java.awt.event.KeyEvent evt){
int key = evt.getKeyCode();
     if (key == KeyEvent.VK_ENTER) {
        Toolkit.getDefaultToolkit().beep(); 
        validar();
        }
}
    private void validar() {
        if (cboUsuarios.getSelectedIndex() > 0) {
            nombresede = cboSede.getSelectedItem().toString();
            doctor = cboUsuarios.getSelectedItem().toString();
            // System.out.println("nombre de la sede :"+nombresede);
            String sqlStmt;
            String area;
            // Prepara Variable para realizar el Query
            sqlStmt = "Select rol_user, sistema, admision, farmacia, cmp_user, dni_user, nombre_user, apellido_user, usuario_user, pass_user from usuarios Where usuario_user='" + cboUsuarios.getSelectedItem().toString().trim()+ "' And pass_user='" + String.valueOf(txtpass.getPassword()) + "'";

            oConn.FnBoolQueryExecute(sqlStmt);

            try {
                if (oConn.setResult.next()) {
                    clsGlobales.sNomOperador = oConn.setResult.getString("nombre_user").concat(" ").concat(oConn.setResult.getString("apellido_user"));
                    //area=oConn.setResult.getString("area");
                    clsGlobales.sDniOperador = oConn.setResult.getString("dni_user");
                    clsGlobales.sUser=oConn.setResult.getString("usuario_user");
                    clsGlobales.sCMPOperador = oConn.setResult.getString("cmp_user");
                    clsGlobales.sRol = oConn.setResult.getString("rol_user");

                    if (chkAdmision.isSelected() == true) {
                        if (ADMISION_CODIGO == oConn.setResult.getBoolean("admision")) {
                            Ingreso.this.dispose();
                            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + clsGlobales.sNomOperador);
                            System.out.println("salto el mensaje de bienvenida ");
                            Admision c = new Admision();
                            System.out.println("instancia admision ");
                            c.setVisible(true);
                            System.out.println("lo manda hacer visible ");
                            c.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            oConn.setResult.close();
                        } else {
                            oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Admisión");
                        }
                    }
                    if (chkFarmacia.isSelected() == true) {
                        if (FARMACIA_CODIGO == oConn.setResult.getBoolean("farmacia")) {
//                            IngresoConsultas s = new IngresoConsultas();
                            Ingreso.this.dispose();
                            Asistencial s=new Asistencial();
                            s.setVisible(true);
                            s.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            oConn.setResult.close();
                        } else {
                            oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Farmacia");
                        }
                        oConn.setResult.close();
                    }
                    if (chkSistema.isSelected() == true) {
                        if (PROCESO_CODIGO == oConn.setResult.getBoolean("sistema")) {
                            Ingreso.this.dispose();
                            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + clsGlobales.sNomOperador);
                            String user = oConn.setResult.getString("usuario_user");
                            if ("JAZABACHE".equals(user) || "HM".equals(user) || "AGARCIA".equals(user) || "KREYES".equals(user)
                                    || "MHERRERA".equals(user) || "JPOMA".equals(user) || "VERAG".equals(user)
                                    || "MPAZ".equals(user) || "MMARIÑOS".equals(user) || "JCARDENAS".equals(user)
                                    || "HCERNA".equals(user) || "JCERQUIN".equals(user) || "JCORDOVAP".equals(user)
                                    || "JCORDOVA".equals(user) || "KGUEVARA".equals(user) || "lobo".equals(user) || "MGAMBOA".equals(user)
                                    || "KCANTARO".equals(user)|| "JBRINGAS".equals(user)||"PQUISPE".equals(user)||"DEVELOPER".equals(user)) {
                                Ocupacional1 s = new Ocupacional1();
                                s.setVisible(true);

                            } else {
                                Ocupacional s = new Ocupacional();
                                s.setVisible(true);
                            }

                            oConn.setResult.close();
                        } else {
                            oFunc.SubSistemaMensajeInformacion("No Tiene Autorización para Ingresar a Sistema");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Error: usuario o contraseña incorrectos");

                }
                System.out.println("llego al setment close");
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
                oConn.SubConnectionClose();
            }
        } else {
            oFunc.SubSistemaMensajeError("Usuario incorrecto");
        }

    }

 public void fecha(){
Date dateHoy = new Date();
Date dateHora = new Date();    
        // Variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("hh:mm:ss a");
        // Inicializa Folio y Fecha
        txtFechaLogin.setText(formato.format(dateHoy));
        txtHoraLogin.setText(FormatoHora.format(dateHora));
}
private void CargarSedes(){
      String sQuery;        
        // Prepara el Query
        sQuery ="select nombre_Sede from sede where estado='1' order by cod_Sede";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboSede.addItem(oConn.setResult.getString ("nombre_Sede"));
                     
                 }
                 
                 // Cierra Resultados
              
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.sqlStmt.close();
            oConn.setResult.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        // selecciona
        cboSede.setSelectedItem(seded);
        //cboSede.setSelectedIndex(1);


}

 private void CargarUsuarios(){
      String sQuery;        
        // Prepara el Query
        sQuery ="SELECT usuario_user FROM usuarios";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     cboUsuarios.addItem(oConn.setResult.getString ("usuario_user"));
                     
                 }
                 
                 // Cierra Resultados
               
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            oConn.setResult.close();
            oConn.sqlStmt.close(); 

        } catch (SQLException ex) {
            Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        // selecciona
        cboUsuarios.setSelectedIndex(0);

}
 

public void CerrarJF(){
this.dispose();
}

}

