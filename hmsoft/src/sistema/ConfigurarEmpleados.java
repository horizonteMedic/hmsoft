/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import Digitalizacion.DisableSSLVerification;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/**
 *
 * @author Administrador
 */
public class ConfigurarEmpleados extends javax.swing.JInternalFrame {
        clsConnection oConn = new clsConnection();
        clsFunciones  oFunc = new clsFunciones();
        clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
     DefaultTableModel model;
     String base64Sello=null;
    public ConfigurarEmpleados() {
        initComponents();
        habilitar();
        listaEmpleados();
        popuptable();

    }
    
        public void popuptable(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Editar Registro");

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =jTableEmpleados.getSelectedRow();
     String dni=jTableEmpleados.getValueAt(a,0).toString();
     cargarDataEmpleado(dni);
         //  editarRegistro(hisotriaC);
             //  JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    
    });   
    

    popupMenu.add(menuItem1);   

    jTableEmpleados.setComponentPopupMenu(popupMenu);
  
    }  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldProfesion = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jRadioButtonSistema = new javax.swing.JRadioButton();
        jRadioButtonAdmision = new javax.swing.JRadioButton();
        jRadioButtonFarmacia = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRol = new javax.swing.JTextField();
        jRadioButtonConfigEmp = new javax.swing.JRadioButton();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPsw = new javax.swing.JTextField();
        jTextFieldUser = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jLabelSello = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCmp = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Configuracion Empleados");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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

        jLabel1.setText("DNI:");

        jLabel2.setText("NOMBRES:");

        jLabel3.setText("APELLIDOS:");

        jLabel4.setText("PROFESION:");

        jTextFieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniActionPerformed(evt);
            }
        });

        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });

        jTextFieldProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProfesionActionPerformed(evt);
            }
        });

        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });

        jLabel5.setText("SEXO:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));

        jLabel6.setText("DIRECCION:");

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jRadioButtonSistema.setText("SISTEMA");

        jRadioButtonAdmision.setText("ADMISION");
        jRadioButtonAdmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdmisionActionPerformed(evt);
            }
        });

        jRadioButtonFarmacia.setText("FARMACIA");
        jRadioButtonFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFarmaciaActionPerformed(evt);
            }
        });

        jLabel7.setText("ROL:");

        jTextFieldRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRolActionPerformed(evt);
            }
        });

        jRadioButtonConfigEmp.setText("CONFIGURAR EMPLEADOS");
        jRadioButtonConfigEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConfigEmpActionPerformed(evt);
            }
        });

        jRadioButtonEstado.setText("ESTADO");
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });

        jLabel8.setText("USUARIO:");

        jLabel9.setText("CONTRASEÑA:");

        jTextFieldPsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPswActionPerformed(evt);
            }
        });

        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnGrabar.setMnemonic('g');
        btnGrabar.setText("Actualizar");
        btnGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGrabarMouseClicked(evt);
            }
        });
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEmpleados);

        jLabelSello.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setText("Agregar Firma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Visualizar Firma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("CMP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jComboBoxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonEstado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonSistema)
                                    .addComponent(jRadioButtonAdmision)
                                    .addComponent(jRadioButtonConfigEmp)
                                    .addComponent(jRadioButtonFarmacia))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addGap(9, 9, 9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCmp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(btnGrabar)))))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSello, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jRadioButtonFarmacia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonConfigEmp)
                            .addComponent(jTextFieldCmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(btnGrabar))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonEstado))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonSistema)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonAdmision)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLimpiar)
                                    .addComponent(jTextFieldPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabelSello, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleName("Configuracione Empleados");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
     //   cerrarVentana();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        jTextFieldProfesion.requestFocus();
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jRadioButtonAdmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdmisionActionPerformed

    private void jRadioButtonFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFarmaciaActionPerformed

    private void jRadioButtonConfigEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConfigEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonConfigEmpActionPerformed

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        btnRegistrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
            habilitar();
            limpiar();
            
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseClicked

    }//GEN-LAST:event_btnGrabarMouseClicked

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
     btnActualizar();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void jTextFieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniActionPerformed
        if(!oPe.validar(jTextFieldDni, "usuarios","dni_user"))  {
            oFunc.SubSistemaMensajeError("El Empleado no se encuentra Registrado ");
            jTextFieldNombres.requestFocus();
        }
        else
            oFunc.SubSistemaMensajeError("El Empleado ya se encuentra Registrado!");
        
        
    }//GEN-LAST:event_jTextFieldDniActionPerformed

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        jTextFieldApellidos.requestFocus();
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jTextFieldProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProfesionActionPerformed
        jComboBoxSexo.requestFocus();
    }//GEN-LAST:event_jTextFieldProfesionActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        jTextFieldRol.requestFocus();
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRolActionPerformed
        jTextFieldUser.requestFocus();
    }//GEN-LAST:event_jTextFieldRolActionPerformed

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        jTextFieldPsw.requestFocus();
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jTextFieldPswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPswActionPerformed
        jTextFieldCmp.requestFocus();
    }//GEN-LAST:event_jTextFieldPswActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               if(jTextFieldDni.getText().toString().length()>1)
        {
        FileNameExtensionFilter filtro= new FileNameExtensionFilter("Solo imagenes","png","jpg");

                JFileChooser jfile = new JFileChooser();
        jfile.setFileFilter(filtro);

        int resultado = jfile.showOpenDialog(this);

        if (resultado != JFileChooser.CANCEL_OPTION) {
            File fileName = jfile.getSelectedFile();
            
            //System.out.println("la ruta es: "+fileName.getName());
                    try {
                        byte[] fileContent = Files.readAllBytes(fileName.toPath());
                       // System.out.println(Base64.getEncoder().encodeToString(fileContent));
                        String laBase64=Base64.getEncoder().encodeToString(fileContent);
           comunirApiRegistroArchivoEmpleadoSello(fileName.getName(),jTextFieldDni.getText(),laBase64);
                    } catch (IOException ex) {
                        Logger.getLogger(ConfigurarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(ConfigurarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                    }



        }
        
                            oFunc.SubSistemaMensajeError("SELLO CARGADO");

        }
        else
                                oFunc.SubSistemaMensajeError("Registre un dni");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
                        System.out.println("Base 64 del sello es: " );
                        System.out.println(base64Sello);

            consumirApiSello(jTextFieldDni.getText().toString().trim());
            byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64Sello);
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageBytes));
            jLabelSello.setIcon(new ImageIcon(
            img.getScaledInstance(jLabelSello.getWidth(), jLabelSello.getHeight(), Image.SCALE_DEFAULT)));
            repaint();
        } catch (Exception ex) {
            Logger.getLogger(ConfigurarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
      public void consumirApiSello(String dni) throws Exception {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
         try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/detalleArchivoEmpleado/"+dni+"/SELLOFIRMA");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);


            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
                      if(code!=500){
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                System.out.println("Response line: " + responseLine.trim());
                    response.append(responseLine.trim());
                }
                  System.out.println("Response: " + response.toString());
                     JSONObject objectJson = new JSONObject(response.toString());
                  System.out.println("Response: " + objectJson);
                  System.out.println("Response: " + objectJson.getString("base64"));
                     
         
                     base64Sello=(objectJson.getString("base64"));
                 


                    /*
                    System.out.println("el campo es:"+objectJson.getLong("id_resp"));
                    
                    System.out.println("el campo es:"+objectJson.getString("rucEmpresa"));
                    System.out.println("el campo es:"+objectJson.getString("rucContrata"));
                    System.out.println("el campo es:"+objectJson.getString("cargo"));
                    System.out.println("el campo es:"+objectJson.getString("area"));
                    System.out.println("el campo es:"+objectJson.getString("tipoExamen"));
                    System.out.println("el campo es:"+objectJson.getString("fechaReserva"));
                      */
            }
            
            
            }
            else
                        base64Sello="OTROJASPER";

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
 
           public void comunirApiRegistroArchivoEmpleadoSello(String path, String dniEmp,String base64String) throws Exception {

         try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/registrarArchivoEmpleado");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
  
//            System.out.println(Sql);
            String jsonInputString = "{\n" +
                                    "   \"ruta\": null,\n" +
                                    "   \"nombreArchivo\":\""+path+"\",\n" +
                                    "   \"dni\":"+dniEmp+",\n" +
                                    "  \"extension\": \".jpg\",\n" +
                                    "  \"tipoArchivo\":\"SELLOFIRMA\",\n" +
                                    "  \"base64\":\""+base64String+"\"}";
            System.out.println(jsonInputString);
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                    System.out.println("Response: " + response.toString());
                   
               
            }
 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
   
   
    public void habilitar(){
    jRadioButtonSistema.setSelected(true);
    jRadioButtonAdmision.setSelected(true);
    jRadioButtonFarmacia.setSelected(true);      
    jRadioButtonConfigEmp.setSelected(true);
    jRadioButtonEstado.setSelected(true);        
    }
    
    private void btnRegistrar(){
        if (!jTextFieldDni.getText().isEmpty()){
            if(!oPe.validar(jTextFieldDni,"usuarios","dni_user")){
                
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO usuarios (";
            Query="Values(";
            strSqlStmt += "dni_user";Query += jTextFieldDni.getText().toString().trim();
            strSqlStmt += ",nombre_user";Query += ",'"+jTextFieldNombres.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",apellido_user";Query += ",'"+jTextFieldApellidos.getText().toString().toUpperCase().trim()+ "'";
            strSqlStmt += ",sexo";Query += ",'"+jComboBoxSexo.getSelectedItem().toString().trim()+"'";
            strSqlStmt += ",cmp_user";Query += ",'"+jTextFieldCmp.getText().toString().trim()+ "'";
            strSqlStmt += ",profesion_user";Query += ",'"+jTextFieldProfesion.getText().toString().trim()+ "'";
            strSqlStmt += ",rol_user";Query += ",'"+jTextFieldRol.getText().toString().trim()+ "'";
            strSqlStmt += ",usuario_user";Query += ",'"+jTextFieldUser.getText().toString().trim()+ "'";
            strSqlStmt += ",pass_user";Query += ",'"+jTextFieldPsw.getText().toString().trim()+ "'";
            strSqlStmt += ",direccion";Query += ",'"+jTextFieldDireccion.getText().toString().trim()+ "'";
            strSqlStmt += ",estado";Query += ",'"+jRadioButtonEstado.isSelected()+ "'";
            strSqlStmt += ",sistema";Query += ",'"+jRadioButtonSistema.isSelected()+ "'";
            strSqlStmt += ",admision";Query += ",'"+jRadioButtonAdmision.isSelected()+ "'";
            strSqlStmt += ",farmacia";Query += ",'"+jRadioButtonFarmacia.isSelected()+ "'";
            strSqlStmt += ",config_usuario";Query += ",'"+jRadioButtonConfigEmp.isSelected()+ "'";

       
            System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")")); 
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                oFunc.SubSistemaMensajeInformacion("Se ha registrado el Empleado con Éxito");
               listaEmpleados();
            } else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                    
                    
                    }         
                  
        }   
            else                     
                oFunc.SubSistemaMensajeError("El Dni del Empleado ya esta Registrado ");
    }
    }

        
    private void btnActualizar (){
         if(!jTextFieldDni.getText().isEmpty()){                
            String strSqlStmt;
            String Query ;
            strSqlStmt="UPDATE usuarios ";
            Query="SET "; 
            Query += "nombre_user='"+jTextFieldNombres.getText().toString().toUpperCase().trim()+ "'";
            Query += ",apellido_user='"+jTextFieldApellidos.getText().toString().toUpperCase().trim()+ "'";
            Query += ",usuario_user='"+jTextFieldUser.getText().toString().toUpperCase().trim()+ "'"; 
            Query += ",pass_user='"+jTextFieldPsw.getText().toString().toUpperCase().trim()+ "'"; 
            Query += ",sexo='"+jComboBoxSexo.getSelectedItem().toString().trim()+ "'"; 

            //celular
            String profesion = jTextFieldProfesion.getText().toString().trim();
            Query += ",profesion_user=" + (profesion.isEmpty() ? "NULL" : "'" + profesion + "'");
            //cargo
            String cmp = jTextFieldCmp.getText().toString().trim();
            Query += ",cmp_user=" + (cmp.isEmpty() ? "NULL" : "'" + cmp + "'");
            //correo
            String rol = jTextFieldRol.getText().toString().trim();
            Query += ",rol_user=" + (rol.isEmpty() ? "NULL" : "'" + rol + "'");
            
            String direccion = jTextFieldDireccion.getText().toString().trim();
            Query += ",direccion=" + (direccion.isEmpty() ? "NULL" : "'" + direccion + "'");
                        
            Query += ",estado='"+jRadioButtonEstado.isSelected()+ "'";
            Query += ",sistema='"+jRadioButtonSistema.isSelected()+ "'";
            Query += ",admision='"+jRadioButtonAdmision.isSelected()+ "'";
            Query += ",farmacia='"+jRadioButtonFarmacia.isSelected()+ "'";
            Query += ",config_usuario='"+jRadioButtonConfigEmp.isSelected()+ "'";
           
            Query +=" WHERE dni_user=" + jTextFieldDni.getText().toString().trim() ;
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
            }else{
                 oFunc.SubSistemaMensajeError("error en Actualizar");
                 }            
    }
    
    
    }
      private void listaEmpleados(){
         String [] titulos={"Dni","Nombres","Apellidos","Usuario"};
    String [] registros = new String[4];
            String Sql = "SELECT dni_user,nombre_user,apellido_user, usuario_user FROM USUARIOS";
             oConn.FnBoolQueryExecute(Sql);
            model = new DefaultTableModel(null,titulos){        
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }};
    if (oConn.FnBoolQueryExecute(Sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {        
                    registros[0]= oConn.setResult.getString("dni_user");
                    registros[1]= oConn.setResult.getString("nombre_user");
                    registros[2]= oConn.setResult.getString("apellido_user");
                    registros[3]= oConn.setResult.getString("usuario_user");

                    //registros[3]=oConn.setResult.getString("anexo7c");
                     model.addRow(registros);
                }
                  // Coloca el Modelo de Nueva Cuenta
                  jTableEmpleados.setModel(model);
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     try {
         oConn.sqlStmt.close();
     } catch (SQLException ex) {
         Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
     }
   }

      private void limpiar(){
      jTextFieldNombres.setText(null);
      jTextFieldApellidos.setText(null);
      jTextFieldProfesion.setText(null);
      jTextFieldDireccion.setText(null);
      jTextFieldRol.setText(null);
      jTextFieldUser.setText(null);
      jTextFieldPsw.setText(null);
      jTextFieldCmp.setText(null);

      }
                    private void cargarDataEmpleado(String dni){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="select * from usuarios where dni_user="+dni;
                System.out.println(sQuery);
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
        
                                jTextFieldDni.setText(oConn.setResult.getString ("dni_user"));
                                jTextFieldNombres.setText(oConn.setResult.getString ("nombre_user"));
                                jTextFieldApellidos.setText(oConn.setResult.getString ("apellido_user"));
                                jTextFieldProfesion.setText(oConn.setResult.getString ("profesion_user"));
                                jTextFieldDireccion.setText(oConn.setResult.getString ("direccion"));
                                jTextFieldUser.setText(oConn.setResult.getString ("usuario_user"));
                                jTextFieldPsw.setText(oConn.setResult.getString ("pass_user"));
                                jTextFieldCmp.setText(oConn.setResult.getString ("cmp_user"));
                                jComboBoxSexo.setSelectedItem(oConn.setResult.getString ("sexo"));
                                jRadioButtonSistema.setSelected(oConn.setResult.getBoolean("sistema"));
                                jRadioButtonAdmision.setSelected(oConn.setResult.getBoolean("admision"));
                                jRadioButtonFarmacia.setSelected(oConn.setResult.getBoolean("farmacia"));
                                jRadioButtonConfigEmp.setSelected(oConn.setResult.getBoolean("config_usuario"));
                                jRadioButtonEstado.setSelected(oConn.setResult.getBoolean("estado"));
                                jTextFieldRol.setText(oConn.setResult.getString ("rol_user"));

                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(ConfigurarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
      
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConfigurarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
}
                
                
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSello;
    private javax.swing.JRadioButton jRadioButtonAdmision;
    private javax.swing.JRadioButton jRadioButtonConfigEmp;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JRadioButton jRadioButtonFarmacia;
    private javax.swing.JRadioButton jRadioButtonSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCmp;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldProfesion;
    private javax.swing.JTextField jTextFieldPsw;
    private javax.swing.JTextField jTextFieldRol;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
