/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sun.misc.BASE64Decoder;

public final class ConsentimientoDosajeMCBoroo extends javax.swing.JInternalFrame {
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    DefaultTableModel model;

    public ConsentimientoDosajeMCBoroo() {
        initComponents();
        sbCargarDatosMC("");

    }
    private com.toedter.calendar.JDateChooser FechaNacimiento;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btmarihuana = new javax.swing.ButtonGroup();
        btcocaina = new javax.swing.ButtonGroup();
        btchk3 = new javax.swing.ButtonGroup();
        btchk4 = new javax.swing.ButtonGroup();
        btchk5 = new javax.swing.ButtonGroup();
        btchk6 = new javax.swing.ButtonGroup();
        btchk7 = new javax.swing.ButtonGroup();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chk5_SI = new javax.swing.JCheckBox();
        chk5_NO = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        chk6_SI = new javax.swing.JCheckBox();
        chk6_NO = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        chk7_SI = new javax.swing.JCheckBox();
        chk7_NO = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_chk3 = new javax.swing.JTextField();
        txt_chk4 = new javax.swing.JTextField();
        txt_chk5 = new javax.swing.JTextField();
        txt_chk6 = new javax.swing.JTextField();
        txt_chk7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_chk71 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_chk72 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Consentimiento para realizar Dosaje de Marihuana y Cocaína");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("YO :");

        txtNombres.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DE :");

        txtEdad.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Con DNI :");

        txtDni.setEditable(false);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro: Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha :");

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel6.setText("Consumo de Marihuana");

        jLabel7.setText("Consumo de Cocaina");

        jLabel8.setText("- ¿Padece de alguna enfermedad?");

        btmarihuana.add(chk1_SI);
        chk1_SI.setText("SI");

        btcocaina.add(chk2_SI);
        chk2_SI.setText("SI");

        btchk3.add(chk3_SI);
        chk3_SI.setText("SI");

        btmarihuana.add(chk1_NO);
        chk1_NO.setText("NO");

        btchk3.add(chk3_NO);
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

        jLabel11.setText("- ¿Consume algún tipo de medicamento?");

        btchk4.add(chk4_SI);
        chk4_SI.setText("SI");

        btchk4.add(chk4_NO);
        chk4_NO.setText("NO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("En los últimos 5 días:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("ANTECEDENTES: ");

        jLabel14.setText("- ¿Tomó mate de coca?");

        btchk5.add(chk5_SI);
        chk5_SI.setText("SI");

        btchk5.add(chk5_NO);
        chk5_NO.setText("NO");

        jLabel15.setText("- ¿Chaccha hoja de coca? ");

        btchk6.add(chk6_SI);
        chk6_SI.setText("SI");

        btchk6.add(chk6_NO);
        chk6_NO.setText("NO");

        jLabel16.setText("<html>- ¿En las últimas 48 horas, se realizó algún<br> tratamiento quirúrgico o dental? </html>");

        btchk7.add(chk7_SI);
        chk7_SI.setText("SI");

        btchk7.add(chk7_NO);
        chk7_NO.setText("NO");

        jLabel17.setText("¿Cuál?");

        jLabel18.setText("¿Cuál?");

        jLabel19.setText("Especifique la fecha:");

        jLabel20.setText("Especifique la fecha:");

        jLabel21.setText("Especifique cuál: ");

        jLabel22.setText("Especifique cuándo:");

        txt_chk71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_chk71ActionPerformed(evt);
            }
        });

        jLabel23.setText("Especifique dónde: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_chk4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                            .addComponent(txt_chk3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_chk7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_chk6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_chk5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_chk71)
                                            .addComponent(txt_chk72, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FechaDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(176, 176, 176)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chk1_SI)
                                            .addComponent(chk2_SI))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chk1_NO)
                                            .addComponent(chk2_NO)))))
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chk5_SI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk5_NO))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(46, 46, 46))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chk3_SI)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chk3_NO))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chk4_SI)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chk4_NO))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chk6_SI, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chk7_SI))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(chk7_NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(chk6_NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))))
                        .addGap(77, 77, 77)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(FechaDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk1_NO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk2_NO))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chk1_SI)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chk2_SI)
                                    .addComponent(jLabel7))))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chk3_SI)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chk3_NO)
                                .addComponent(jLabel17)
                                .addComponent(txt_chk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chk4_SI)
                                .addComponent(chk4_NO)
                                .addComponent(jLabel18)
                                .addComponent(txt_chk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk5_SI)
                            .addComponent(chk5_NO)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(txt_chk5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk6_SI)
                            .addComponent(chk6_NO)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(txt_chk6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk7_SI)
                            .addComponent(chk7_NO)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(txt_chk7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_chk71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_chk72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        if (!txtNorden.getText().isEmpty()) {
            if (!OrdenExiste()) {
                FechaNacimiento = new com.toedter.calendar.JDateChooser();
                String Sql = "select d.nombres_pa||' '||d.apellidos_pa AS nombre, d.cod_pa, d.fecha_nacimiento_pa from datos_paciente AS d "
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) WHERE n.n_orden ='" + txtNorden.getText().toString() + "'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombre"));
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtNorden.setEditable(false);
                        FechaDosaje.requestFocusInWindow();
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())));
                    } else {
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Consentimiento Dosaje:" + ex.getMessage().toString());
                }
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            if (!txtNorden.getText().isEmpty()) {
                if (validar()) {
                    if (Grabar()) {
                        oFunc.SubSistemaMensajeInformacion("Agregado Correctamente");
                        imprimir();
                        Limpiar();
                        sbCargarDatosMC("");
                    }
                }
            } else {
                oFunc.SubSistemaMensajeError("Ingrese Nro Orden");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsentimientoDosajeMCBoroo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        sbCargarDatosMC(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbConsentimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsentimientoMousePressed
        if (evt.getClickCount() == 2) {
            Integer num = Integer.valueOf(tbConsentimiento.getValueAt(tbConsentimiento.getSelectedRow(), 0).toString());
            try {
                reporte(num);
            } catch (IOException ex) {
                Logger.getLogger(ConsentimientoDosajeMCBoroo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbConsentimientoMousePressed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased
        sbCargarDatosMC(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void txt_chk71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_chk71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_chk71ActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed
    private void reporte(Integer cod) throws IOException {
                String dniUsuario=oPe.consultarDni("consentimiento_dosaje_boroo", String.valueOf(cod));
                String dniPaciente=oPe.consultarDniPaciente("consentimiento_dosaje_boroo", "n_orden", String.valueOf(cod));
                String base64Huella="";
                String base64FirmaP="";
                String base64Sello=""; 
       try {
           base64Huella = oPe.consumirApiHuella(dniPaciente);
           base64FirmaP=oPe.consumirApiFirmaEmp(dniPaciente);
           base64Sello=oPe.consumirApiSello(String.valueOf(dniUsuario));           
       } catch (Exception ex) {
           Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
       }

                
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
               if(!base64Huella.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Huella);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("HuellaP",stream);             
              }
              if(!base64FirmaP.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64FirmaP);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("FirmaP",stream);             
              }
              if(!base64Sello.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Sello);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Sello",stream);             
              }    
                    try 
                {   
                    String master="";
                    if(base64Huella.contains("OTROJASPER") || base64FirmaP.contains("OTROJASPER") || base64Sello.contains("OTROJASPER")){
                     master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ConsentimientoDosajeBoroo.jasper";}
                     else
                     master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ConsentimientoDosajeBoroo_Digitalizado.jasper";
   
 

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
        FechaNacimiento.setDate(null);
        txtNorden.setText(null);
        txtNorden.setEditable(true);
        btmarihuana.clearSelection();
        btcocaina.clearSelection();
        btchk3.clearSelection();
        btchk4.clearSelection();
        btchk5.clearSelection();
        btchk6.clearSelection();
        btchk7.clearSelection();
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
                    + "INNER JOIN consentimiento_dosaje_boroo AS c ON (n.n_orden = c.n_orden)"
                    + "where c.n_orden='" + txtBuscarCod.getText() + "'";
        } else {
            Sql = "select d.nombres_pa||''||d.apellidos_pa AS nombres , c.fecha_dosaje,c.n_orden "
                    + "FROM datos_paciente AS d "
                    + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)"
                    + "INNER JOIN consentimiento_dosaje_boroo AS c ON (n.n_orden = c.n_orden)where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%" + valor + "%'";
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
    private javax.swing.ButtonGroup btchk3;
    private javax.swing.ButtonGroup btchk4;
    private javax.swing.ButtonGroup btchk5;
    private javax.swing.ButtonGroup btchk6;
    private javax.swing.ButtonGroup btchk7;
    private javax.swing.ButtonGroup btcocaina;
    private javax.swing.ButtonGroup btmarihuana;
    private javax.swing.JButton btnCrear;
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
    private javax.swing.JCheckBox chk7_NO;
    private javax.swing.JCheckBox chk7_SI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbConsentimiento;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txt_chk3;
    private javax.swing.JTextField txt_chk4;
    private javax.swing.JTextField txt_chk5;
    private javax.swing.JTextField txt_chk6;
    private javax.swing.JTextField txt_chk7;
    private javax.swing.JTextField txt_chk71;
    private javax.swing.JTextField txt_chk72;
    // End of variables declaration//GEN-END:variables
private boolean Grabar() throws SQLException {
        boolean bResult = false;

        String strSqlStmt = "INSERT INTO consentimiento_dosaje_boroo(n_orden, chk1_si, chk1_no, chk2_si, chk2_no, chk3_si, \n"
                + "            chk3_no, txt_chk3, chk4_si, chk4_no, txt_chk4, chk5_si, chk5_no, \n"
                + "            txt_chk5, chk6_si, chk6_no, txt_chk6, chk7_si, chk7_no, txt_chk7, \n"
                + "            txt_chk71, txt_chk72, fecha_dosaje, edad_dosaje,user_registro)";
        strSqlStmt += "values ('" + txtNorden.getText() + "','";
        strSqlStmt += chk1_SI.isSelected() + "','" + chk1_NO.isSelected() + "','";
        strSqlStmt += chk2_SI.isSelected() + "','" + chk2_NO.isSelected() + "','";
        strSqlStmt += chk3_SI.isSelected() + "','" + chk3_NO.isSelected() + "','";
        strSqlStmt += txt_chk3.getText() + "','";
        strSqlStmt += chk4_SI.isSelected() + "','" + chk4_NO.isSelected() + "','";
        strSqlStmt += txt_chk4.getText() + "','";
        strSqlStmt += chk5_SI.isSelected() + "','" + chk5_NO.isSelected() + "','";
        strSqlStmt += txt_chk5.getText() + "','";
        strSqlStmt += chk6_SI.isSelected() + "','" + chk6_NO.isSelected() + "','";
        strSqlStmt += txt_chk6.getText() + "','";
        strSqlStmt += chk7_SI.isSelected() + "','" + chk7_NO.isSelected() + "','";
        strSqlStmt += txt_chk7.getText() + "','" + txt_chk71.getText() + "','";
        strSqlStmt += txt_chk72.getText() + "','" + FechaDosaje.getDate() + "','";
        strSqlStmt += txtEdad.getText() + "','"+clsGlobales.sUser+"')";

        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {

            //oConn.setResult.next();
            bResult = true;
            oConn.sqlStmt.close();
        }

        return bResult;
    }

    private boolean validar() {
        boolean bResultado = true;

        if (((JTextField) FechaDosaje.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha ");
            bResultado = false;
        }
        if (btchk3.isSelected(null)) {
            oFunc.SubSistemaMensajeError("¿Padece de alguna enfermedad?");
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
        if (btchk4.isSelected(null)) {
            oFunc.SubSistemaMensajeError("¿Consume algún tipo de medicamento?");
            bResultado = false;
        }
        if (btchk5.isSelected(null)) {
            oFunc.SubSistemaMensajeError("¿Tomó mate de coca?");
            bResultado = false;
        }
        if (btchk6.isSelected(null)) {
            oFunc.SubSistemaMensajeError("¿Chaccha hoja de coca?");
            bResultado = false;
        }
        if (btchk7.isSelected(null)) {
            oFunc.SubSistemaMensajeError("¿En las últimas 48 horas, se realizó algún tratamiento quirúrgico o dental? ");
            bResultado = false;
        }
        return bResultado;
    }

    public boolean OrdenExiste() {
        boolean bResultado = false;
        if (!txtNorden.getText().isEmpty()) {
            String sQuery;
            sQuery = "Select n_orden from consentimiento_dosaje_boroo Where n_orden =" + txtNorden.getText();
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);
            // Capturo el Error
            try {
                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;
                    oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                    txtNorden.setText(null);
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
                try {
                    printer(Integer.valueOf(txtNorden.getText()));
                } catch (IOException ex) {
                    Logger.getLogger(ConsentimientoDosajeMCBoroo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // PRESIONO NO
            }
        }
    }

    private void printer(Integer cod) throws IOException {
                String dniUsuario=oPe.consultarDni("consentimiento_dosaje_boroo", String.valueOf(cod));
                String dniPaciente=oPe.consultarDniPaciente("consentimiento_dosaje_boroo", "n_orden", String.valueOf(cod));
                String base64Huella="";
                String base64FirmaP="";
                String base64Sello=""; 
       try {
           base64Huella = oPe.consumirApiHuella(dniPaciente);
           base64FirmaP=oPe.consumirApiFirmaEmp(dniPaciente);
           base64Sello=oPe.consumirApiSello(String.valueOf(dniUsuario));           
       } catch (Exception ex) {
           Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
       }

                
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
               if(!base64Huella.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Huella);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("HuellaP",stream);             
              }
              if(!base64FirmaP.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64FirmaP);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("FirmaP",stream);             
              }
              if(!base64Sello.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Sello);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Sello",stream);             
              }    
                    try 
                {   
                    String master="";
                    if(base64Huella.contains("OTROJASPER") || base64FirmaP.contains("OTROJASPER") || base64Sello.contains("OTROJASPER")){
                     master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ConsentimientoDosajeBoroo.jasper";}
                     else
                     master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ConsentimientoDosajeBoroo_Digitalizado.jasper";
   
 
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
