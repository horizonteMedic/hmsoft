/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import autocomplete.AutoCompleteDBLink;
import autocomplete.AutoTextComplete;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdom.Parent;

/**
 *
 * @author admin
 */
public final class ExamenSuficienciaEspaciosConfinados extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;

   public ExamenSuficienciaEspaciosConfinados(){
      initComponents();
      //new ajTextArea.autocompleterText(atxtIntelectual, "razon_empresa", "empresas");
  
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgR = new javax.swing.ButtonGroup();
        bgM = new javax.swing.ButtonGroup();
        bgAC = new javax.swing.ButtonGroup();
        bgCVM = new javax.swing.ButtonGroup();
        bgOE = new javax.swing.ButtonGroup();
        bgE = new javax.swing.ButtonGroup();
        bgNAG = new javax.swing.ButtonGroup();
        bgAEC = new javax.swing.ButtonGroup();
        bgAptitud = new javax.swing.ButtonGroup();
        jPanel28 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        FechaEx = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txtImprimir = new javax.swing.JTextField();
        btnImprimir5 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtAnalisis = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        chkE1 = new javax.swing.JCheckBox();
        chkE2 = new javax.swing.JCheckBox();
        chkNAG1 = new javax.swing.JCheckBox();
        chkNAG2 = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        chkAEC1 = new javax.swing.JCheckBox();
        chkAEC3 = new javax.swing.JCheckBox();
        chkAEC2 = new javax.swing.JCheckBox();
        chkAEC4 = new javax.swing.JCheckBox();
        jPanel29 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        chkR1 = new javax.swing.JCheckBox();
        chkR2 = new javax.swing.JCheckBox();
        chkR3 = new javax.swing.JCheckBox();
        chkR4 = new javax.swing.JCheckBox();
        chkR5 = new javax.swing.JCheckBox();
        chkM1 = new javax.swing.JCheckBox();
        chkM2 = new javax.swing.JCheckBox();
        chkM3 = new javax.swing.JCheckBox();
        chkM4 = new javax.swing.JCheckBox();
        chkM5 = new javax.swing.JCheckBox();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        chkAC1 = new javax.swing.JCheckBox();
        chkAC2 = new javax.swing.JCheckBox();
        chkAC3 = new javax.swing.JCheckBox();
        chkAC4 = new javax.swing.JCheckBox();
        chkAC5 = new javax.swing.JCheckBox();
        jLabel97 = new javax.swing.JLabel();
        chkCVM1 = new javax.swing.JCheckBox();
        chkCVM2 = new javax.swing.JCheckBox();
        chkCVM3 = new javax.swing.JCheckBox();
        chkCVM4 = new javax.swing.JCheckBox();
        chkCVM5 = new javax.swing.JCheckBox();
        jLabel98 = new javax.swing.JLabel();
        chkOE1 = new javax.swing.JCheckBox();
        chkOE2 = new javax.swing.JCheckBox();
        chkOE3 = new javax.swing.JCheckBox();
        chkOE4 = new javax.swing.JCheckBox();
        chkOE5 = new javax.swing.JCheckBox();
        jPanel21 = new javax.swing.JPanel();
        chkApto = new javax.swing.JCheckBox();
        chkNoApto = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("Exámen Suficiencia para Espacios Confinados ");

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel116.setText("Nº Orden :");

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

        FechaEx.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExPropertyChange(evt);
            }
        });

        jLabel117.setText("Fecha :");

        jLabel118.setText("Nombres y Apellidos :");

        jLabel119.setText("DNI :");

        jLabel120.setText("Edad :");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addComponent(jLabel116)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel117)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaEx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel119)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel120)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar)
                        .addComponent(jLabel117))
                    .addComponent(FechaEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPRIMIR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
            }
        });

        btnImprimir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir5)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(btnImprimir5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel99.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel99.setText("CRITERIOS PSICOLÓGICOS");

        jLabel122.setText("ANALISIS Y RESULADOS:");

        txtAnalisis.setColumns(20);
        txtAnalisis.setRows(5);
        jScrollPane15.setViewportView(txtAnalisis);

        jLabel121.setText("RECOMENDACIONES");

        txtRecomendaciones.setColumns(20);
        txtRecomendaciones.setRows(5);
        jScrollPane14.setViewportView(txtRecomendaciones);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setMnemonic('i');
        btnActualizar.setText("guardar y actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS PERSONALIDAD"));

        jLabel100.setText("1- ESTABILIDAD EMOCIONAL");

        bgE.add(chkE1);
        chkE1.setText("INESTABLE");
        chkE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkE1ActionPerformed(evt);
            }
        });

        bgE.add(chkE2);
        chkE2.setText("ESTABLE");
        chkE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkE2ActionPerformed(evt);
            }
        });

        bgNAG.add(chkNAG1);
        chkNAG1.setText("CASO");
        chkNAG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNAG1ActionPerformed(evt);
            }
        });

        bgNAG.add(chkNAG2);
        chkNAG2.setText("NO CASO");
        chkNAG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNAG2ActionPerformed(evt);
            }
        });

        jLabel101.setText("2- NIVEL DE ANSIEDAD GENERAL");

        jLabel103.setText("3- ANSIEDAD A ESPACIOS CONFINADOS");

        bgAEC.add(chkAEC1);
        chkAEC1.setText("NADA");
        chkAEC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAEC1ActionPerformed(evt);
            }
        });

        bgAEC.add(chkAEC3);
        chkAEC3.setText("MODERADAMENTE ANSIOSO");
        chkAEC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAEC3ActionPerformed(evt);
            }
        });

        bgAEC.add(chkAEC2);
        chkAEC2.setText("POCA ANSIEDAD");
        chkAEC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAEC2ActionPerformed(evt);
            }
        });

        bgAEC.add(chkAEC4);
        chkAEC4.setText("ELEVADAMENTE ANSIOSO");
        chkAEC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAEC4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkE1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(chkE2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkNAG1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(chkNAG2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAEC4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkAEC3)
                            .addComponent(chkAEC2)
                            .addComponent(chkAEC1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkE1)
                    .addComponent(chkE2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNAG1)
                    .addComponent(chkNAG2))
                .addGap(5, 5, 5)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAEC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAEC2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAEC3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAEC4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTO INTELECTUAL:"));

        jLabel88.setText("1- RAZONAMIENTO:");

        bgR.add(chkR1);
        chkR1.setText("I");
        chkR1.setToolTipText("");
        chkR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkR1ActionPerformed(evt);
            }
        });

        bgR.add(chkR2);
        chkR2.setText("NPI");
        chkR2.setToolTipText("");
        chkR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkR2ActionPerformed(evt);
            }
        });

        bgR.add(chkR3);
        chkR3.setText("NP");
        chkR3.setToolTipText("");
        chkR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkR3ActionPerformed(evt);
            }
        });

        bgR.add(chkR4);
        chkR4.setText("NPS");
        chkR4.setToolTipText("");
        chkR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkR4ActionPerformed(evt);
            }
        });

        bgR.add(chkR5);
        chkR5.setText("S");
        chkR5.setToolTipText("");
        chkR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkR5ActionPerformed(evt);
            }
        });

        bgM.add(chkM1);
        chkM1.setText("I");
        chkM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkM1ActionPerformed(evt);
            }
        });

        bgM.add(chkM2);
        chkM2.setText("NPI");
        chkM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkM2ActionPerformed(evt);
            }
        });

        bgM.add(chkM3);
        chkM3.setText("NP");
        chkM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkM3ActionPerformed(evt);
            }
        });

        bgM.add(chkM4);
        chkM4.setText("NPS");
        chkM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkM4ActionPerformed(evt);
            }
        });

        bgM.add(chkM5);
        chkM5.setText("S");
        chkM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkM5ActionPerformed(evt);
            }
        });

        jLabel95.setText("2- MEMORIA");

        jLabel96.setText("3- ATENCIÓN Y CONCENTRACIÓN");

        bgAC.add(chkAC1);
        chkAC1.setText("I");
        chkAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAC1ActionPerformed(evt);
            }
        });

        bgAC.add(chkAC2);
        chkAC2.setText("NPI");
        chkAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAC2ActionPerformed(evt);
            }
        });

        bgAC.add(chkAC3);
        chkAC3.setText("NP");
        chkAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAC3ActionPerformed(evt);
            }
        });

        bgAC.add(chkAC4);
        chkAC4.setText("NPS");
        chkAC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAC4ActionPerformed(evt);
            }
        });

        bgAC.add(chkAC5);
        chkAC5.setText("S");
        chkAC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAC5ActionPerformed(evt);
            }
        });

        jLabel97.setText("4- COODINACIÓN VISO-MOTORA");

        bgCVM.add(chkCVM1);
        chkCVM1.setText("I");
        chkCVM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCVM1ActionPerformed(evt);
            }
        });

        bgCVM.add(chkCVM2);
        chkCVM2.setText("NPI");
        chkCVM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCVM2ActionPerformed(evt);
            }
        });

        bgCVM.add(chkCVM3);
        chkCVM3.setText("NP");
        chkCVM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCVM3ActionPerformed(evt);
            }
        });

        bgCVM.add(chkCVM4);
        chkCVM4.setText("NPS");
        chkCVM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCVM4ActionPerformed(evt);
            }
        });

        bgCVM.add(chkCVM5);
        chkCVM5.setText("S");
        chkCVM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCVM5ActionPerformed(evt);
            }
        });

        jLabel98.setText("5- ORIENTACION ESPACIAL");

        bgOE.add(chkOE1);
        chkOE1.setText("I");
        chkOE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOE1ActionPerformed(evt);
            }
        });

        bgOE.add(chkOE2);
        chkOE2.setText("NPI");
        chkOE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOE2ActionPerformed(evt);
            }
        });

        bgOE.add(chkOE3);
        chkOE3.setText("NP");
        chkOE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOE3ActionPerformed(evt);
            }
        });

        bgOE.add(chkOE4);
        chkOE4.setText("NPS");
        chkOE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOE4ActionPerformed(evt);
            }
        });

        bgOE.add(chkOE5);
        chkOE5.setText("S");
        chkOE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOE5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(chkR1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkR2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkR3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkR4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkR5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(chkM1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkM2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkM3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkM4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkM5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(chkAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAC4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAC5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(chkCVM1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCVM2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCVM3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCVM4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCVM5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(chkOE1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOE2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOE3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOE4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOE5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkR1)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkR2)
                        .addComponent(chkR3)
                        .addComponent(chkR4)
                        .addComponent(chkR5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkM1)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkM2)
                        .addComponent(chkM3)
                        .addComponent(chkM4)
                        .addComponent(chkM5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAC1)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkAC2)
                        .addComponent(chkAC3)
                        .addComponent(chkAC4)
                        .addComponent(chkAC5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCVM1)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkCVM2)
                        .addComponent(chkCVM3)
                        .addComponent(chkCVM4)
                        .addComponent(chkCVM5)))
                .addGap(5, 5, 5)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOE1)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkOE2)
                        .addComponent(chkOE3)
                        .addComponent(chkOE4)
                        .addComponent(chkOE5)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bgAptitud.add(chkApto);
        chkApto.setText("APTO");
        chkApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAptoActionPerformed(evt);
            }
        });

        bgAptitud.add(chkNoApto);
        chkNoApto.setText("NO APTO");
        chkNoApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoAptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkApto)
                .addGap(18, 18, 18)
                .addComponent(chkNoApto)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkApto)
                    .addComponent(chkNoApto))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122)
                            .addComponent(jLabel121)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnActualizar)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel122)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel121)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean OrdenExiste()
     {
        boolean bResultado=false;
        if(!txtNorden.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from psicologia_espacios_confinados where n_orden="+txtNorden.getText().toString();
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
    public void limpiar() {
        txtNorden.setText("");
        txtNombres.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        FechaEx.setDate(null);
        txtAnalisis.setText("");
        txtRecomendaciones.setText("");
        bgR.clearSelection();
        bgM.clearSelection();
        bgAC.clearSelection();
        bgCVM.clearSelection();
        bgOE.clearSelection();
        bgE.clearSelection();
        bgNAG.clearSelection();
        bgAEC.clearSelection();
        bgAptitud.clearSelection();

    }
    public boolean OrdenImp() {

        boolean bResultado = false;
        if (!txtImprimir.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from psicologia_espacios_confinados Where n_orden =" + txtImprimir.getText().toString();

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
                oConn.sqlStmt.close();

            } catch (SQLException ex) {

            }
        }
        return bResultado;

    }
    public void Actualizar(){
            String sCodigo=txtNorden.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE  psicologia_espacios_confinados\n" +
                    " SET fecha='"+FechaEx.getDate()+"',"
                    + "      r1='"+chkR1.isSelected()+"', \n" 
                    + "      r2='"+chkR2.isSelected()+"', \n" 
                    + "      r3='"+chkR3.isSelected()+"',"+
                    "        r4='"+chkR4.isSelected()+"',"+
                    "        r5='"+chkR5.isSelected()+"',"+
                    "        m1='"+chkM1.isSelected()+"',"+
                    "        m2='"+chkM2.isSelected()+"',"+
                    "        m3='"+chkM3.isSelected()+"',"+
                    "        m4='"+chkM4.isSelected()+"',"+
                    "        m5='"+chkM5.isSelected()+"',"+
                    "        ac1='"+chkAC1.isSelected()+"',"+
                    "        ac2='"+chkAC2.isSelected()+"',"+
                    "        ac3='"+chkAC3.isSelected()+"',"+
                    "        ac4='"+chkAC4.isSelected()+"',"+
                    "        ac5='"+chkAC5.isSelected()+"',"+
                    "        cvm1='"+chkCVM1.isSelected()+"',"+
                    "        cvm2='"+chkCVM2.isSelected()+"',"+
                    "        cvm3='"+chkCVM3.isSelected()+"',"+
                    "        cvm4='"+chkCVM4.isSelected()+"',"+
                    "        cvm5='"+chkCVM5.isSelected()+"',"+
                    "        oe1='"+chkOE1.isSelected()+"',"+
                    "        oe2='"+chkOE2.isSelected()+"',"+
                    "        oe3='"+chkOE3.isSelected()+"',"+
                    "        oe4='"+chkOE4.isSelected()+"',"+
                    "        oe5='"+chkOE5.isSelected()+"',"+
                    "        e1='"+chkE1.isSelected()+"',"+
                    "        e2='"+chkE2.isSelected()+"',"+
                    "        nag1='"+chkNAG1.isSelected()+"',"+
                    "        nag2='"+chkNAG2.isSelected()+"',"+
                   "        aec1='"+chkAEC1.isSelected()+"',"+
                   "        aec2='"+chkAEC2.isSelected()+"',"+
                   "        aec3='"+chkAEC3.isSelected()+"',"+
                   "        aec4='"+chkAEC4.isSelected()+"',"+
                   "        apto='"+chkApto.isSelected()+"',"+
                   "        noapto='"+chkNoApto.isSelected()+"',"+
                   "        analisis='"+txtAnalisis.getText()+"',"+
                   "        recomendacion='"+txtRecomendaciones.getText()+"'"+

                    " WHERE n_orden="+sCodigo+";";
               //  System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimir();
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExamenSuficienciaEspaciosConfinados.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }
    
    private boolean Grabar() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="insert into psicologia_espacios_confinados(\n" +
"            n_orden, fecha, r1, r2, r3, r4, r5, m1, m2, m3, m4, m5, ac1, \n" +
"            ac2, ac3, ac4, ac5, cvm1, cvm2, cvm3, cvm4, cvm5, oe1, oe2, oe3, \n" +
"            oe4, oe5, e1, e2, nag1, nag2, aec1, aec2, aec3, aec4, apto, noapto, \n" +
"            analisis, recomendacion)";       
            strSqlStmt+= " values("+ txtNorden.getText()+",'"+
                    FechaEx.getDate()+ "','"+
                    chkR1.isSelected()+"','"+
                    chkR2.isSelected()+"','"+
                    chkR3.isSelected()+"','"+
                    chkR4.isSelected()+"','"+
                    chkR5.isSelected()+"','"+
                    chkM1.isSelected()+"','"+
                    chkM2.isSelected()+"','"+
                    chkM3.isSelected()+"','"+
                    chkM4.isSelected()+"','"+
                    chkM5.isSelected()+"','"+
                    chkAC1.isSelected()+"','"+
                    chkAC2.isSelected()+"','"+
                    chkAC3.isSelected()+"','"+
                    chkAC4.isSelected()+"','"+
                    chkAC5.isSelected()+"','"+
                    chkCVM1.isSelected()+"','"+
                    chkCVM2.isSelected()+"','"+
                    chkCVM3.isSelected()+"','"+
                    chkCVM4.isSelected()+"','"+
                    chkCVM5.isSelected()+"','"+
                    chkOE1.isSelected()+"','"+
                    chkOE2.isSelected()+"','"+
                    chkOE3.isSelected()+"','"+
                    chkOE4.isSelected()+"','"+
                    chkOE5.isSelected()+"','"+
                    chkE1.isSelected()+"','"+
                    chkE2.isSelected()+"','"+
                    chkNAG1.isSelected()+"','"+
                    chkNAG2.isSelected()+"','"+
                    chkAEC1.isSelected()+"','"+
                    chkAEC2.isSelected()+"','"+
                    chkAEC3.isSelected()+"','"+    
                    chkAEC4.isSelected()+"','"+          
                    chkApto.isSelected()+"','"+          
                    chkNoApto.isSelected()+"','"+     
                    txtAnalisis.getText()+"','"+
                    txtRecomendaciones.getText()+"'"+
                    " ) ";
           // System.out.println(strSqlStmt);
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   oConn.sqlStmt.close();
               }
                return bResult;       
        }
    
       private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"formatPsicologia_SuficienciaEspaciosC.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
       private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"formatPsicologia_SuficienciaEspaciosC.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO DE PSICOLOGIA");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
    private boolean validar(){
        boolean bResultado=true;

            if (((JTextField)FechaEx.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
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
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) +" AÑOS" );
                        
                        oPe.fecha(FechaEx);
                        //   oPe.fecha(FechaHotel);

                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("psicologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("N° orden regitrado");
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                    + "fecha, r1, r2, r3, r4, r5, m1, m2, m3, m4, m5, ac1, \n" +
"       ac2, ac3, ac4, ac5, cvm1, cvm2, cvm3, cvm4, cvm5, oe1, oe2, oe3, \n" +
"       oe4, oe5, e1, e2, nag1, nag2, aec1, aec2, aec3, aec4, apto, noapto, \n" +
"       analisis, recomendacion \n" +
"                            FROM datos_paciente AS d     \n" +
"                            LEFT JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)     \n" +
"                            LEFT JOIN psicologia_espacios_confinados AS ps ON (ps.n_orden = n.n_orden)  \n" +
"                            WHERE   n.n_orden ="+txtNorden.getText()+";";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombres.setText(oConn.setResult.getString("nombre"));
                    txtDni.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar()))+" AÑOS" );
                    FechaEx.setDate(oConn.setResult.getDate("fecha"));
                    chkR1.setSelected(oConn.setResult.getBoolean("r1"));
                    chkR2.setSelected(oConn.setResult.getBoolean("r2"));
                    chkR3.setSelected(oConn.setResult.getBoolean("r3"));
                    chkR4.setSelected(oConn.setResult.getBoolean("r4"));
                    chkR5.setSelected(oConn.setResult.getBoolean("r5"));
                    chkM1.setSelected(oConn.setResult.getBoolean("m1"));
                    chkM2.setSelected(oConn.setResult.getBoolean("m2"));
                    chkM3.setSelected(oConn.setResult.getBoolean("m3"));
                    chkM4.setSelected(oConn.setResult.getBoolean("m4"));
                    chkM5.setSelected(oConn.setResult.getBoolean("m5"));                    
                    chkAC1.setSelected(oConn.setResult.getBoolean("ac1"));
                    chkAC2.setSelected(oConn.setResult.getBoolean("ac2"));
                    chkAC3.setSelected(oConn.setResult.getBoolean("ac3"));
                    chkAC4.setSelected(oConn.setResult.getBoolean("ac4"));
                    chkAC5.setSelected(oConn.setResult.getBoolean("ac5"));
                    chkCVM1.setSelected(oConn.setResult.getBoolean("cvm1"));
                    chkCVM2.setSelected(oConn.setResult.getBoolean("cvm2"));
                    chkCVM3.setSelected(oConn.setResult.getBoolean("cvm3"));
                    chkCVM4.setSelected(oConn.setResult.getBoolean("cvm4"));
                    chkCVM5.setSelected(oConn.setResult.getBoolean("cvm5"));
                    chkOE1.setSelected(oConn.setResult.getBoolean("oe1"));
                    chkOE2.setSelected(oConn.setResult.getBoolean("oe2"));
                    chkOE3.setSelected(oConn.setResult.getBoolean("oe3"));
                    chkOE4.setSelected(oConn.setResult.getBoolean("oe4"));
                    chkOE5.setSelected(oConn.setResult.getBoolean("oe5"));
                    chkE1.setSelected(oConn.setResult.getBoolean("e1"));
                    chkE2.setSelected(oConn.setResult.getBoolean("e2"));
                    chkNAG1.setSelected(oConn.setResult.getBoolean("nag1"));
                    chkNAG2.setSelected(oConn.setResult.getBoolean("nag2"));
                    chkAEC1.setSelected(oConn.setResult.getBoolean("aec1"));
                    chkAEC2.setSelected(oConn.setResult.getBoolean("aec2"));
                    chkAEC3.setSelected(oConn.setResult.getBoolean("aec3"));
                    chkAEC4.setSelected(oConn.setResult.getBoolean("aec4"));
                    chkApto.setSelected(oConn.setResult.getBoolean("apto"));
                    chkNoApto.setSelected(oConn.setResult.getBoolean("noapto"));
                    txtAnalisis.setText(oConn.setResult.getString("analisis"));
                    txtRecomendaciones.setText(oConn.setResult.getString("recomendacion"));
                    //jTextField9.setText(oConn.setResult.getString("valorigg"));
                }else{
                    oFunc.SubSistemaMensajeError("");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void FechaExPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExPropertyChange

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirActionPerformed

    private void btnImprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir5ActionPerformed
        // TODO add your handling code here:
        if(OrdenImp()){
            print (Integer.parseInt(txtImprimir.getText()));
        }else{
           oFunc.SubSistemaMensajeError("Codigo no existe"); 
        }
    }//GEN-LAST:event_btnImprimir5ActionPerformed

    private void chkR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkR1ActionPerformed

    private void chkR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkR2ActionPerformed

    private void chkR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkR3ActionPerformed

    private void chkR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkR4ActionPerformed

    private void chkR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkR5ActionPerformed

    private void chkM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkM1ActionPerformed

    private void chkM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkM2ActionPerformed

    private void chkM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkM3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkM3ActionPerformed

    private void chkM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkM4ActionPerformed

    private void chkM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkM5ActionPerformed

    private void chkAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAC1ActionPerformed

    private void chkAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAC2ActionPerformed

    private void chkAC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAC3ActionPerformed

    private void chkAC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAC4ActionPerformed

    private void chkAC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAC5ActionPerformed

    private void chkCVM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCVM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCVM1ActionPerformed

    private void chkCVM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCVM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCVM2ActionPerformed

    private void chkCVM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCVM3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCVM3ActionPerformed

    private void chkCVM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCVM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCVM4ActionPerformed

    private void chkCVM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCVM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCVM5ActionPerformed

    private void chkOE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOE1ActionPerformed

    private void chkOE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOE2ActionPerformed

    private void chkOE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOE3ActionPerformed

    private void chkOE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOE4ActionPerformed

    private void chkOE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOE5ActionPerformed

    private void chkE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkE1ActionPerformed

    private void chkE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkE2ActionPerformed

    private void chkNAG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNAG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNAG1ActionPerformed

    private void chkNAG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNAG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNAG2ActionPerformed

    private void chkAEC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAEC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAEC1ActionPerformed

    private void chkAEC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAEC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAEC3ActionPerformed

    private void chkAEC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAEC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAEC2ActionPerformed

    private void chkAEC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAEC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAEC4ActionPerformed

    private void chkNoAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoAptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNoAptoActionPerformed

    private void chkAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAptoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(OrdenExiste()){
             Actualizar();
             limpiar();
        }
        else{
            if(!txtNorden.getText().isEmpty()){
                try {
                    if(validar()){
                        if(Grabar()){
                            imprimir();
                            limpiar();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ExamenSuficienciaEspaciosConfinados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEx;
    private javax.swing.ButtonGroup bgAC;
    private javax.swing.ButtonGroup bgAEC;
    private javax.swing.ButtonGroup bgAptitud;
    private javax.swing.ButtonGroup bgCVM;
    private javax.swing.ButtonGroup bgE;
    private javax.swing.ButtonGroup bgM;
    private javax.swing.ButtonGroup bgNAG;
    private javax.swing.ButtonGroup bgOE;
    private javax.swing.ButtonGroup bgR;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir5;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkAC1;
    private javax.swing.JCheckBox chkAC2;
    private javax.swing.JCheckBox chkAC3;
    private javax.swing.JCheckBox chkAC4;
    private javax.swing.JCheckBox chkAC5;
    private javax.swing.JCheckBox chkAEC1;
    private javax.swing.JCheckBox chkAEC2;
    private javax.swing.JCheckBox chkAEC3;
    private javax.swing.JCheckBox chkAEC4;
    private javax.swing.JCheckBox chkApto;
    private javax.swing.JCheckBox chkCVM1;
    private javax.swing.JCheckBox chkCVM2;
    private javax.swing.JCheckBox chkCVM3;
    private javax.swing.JCheckBox chkCVM4;
    private javax.swing.JCheckBox chkCVM5;
    private javax.swing.JCheckBox chkE1;
    private javax.swing.JCheckBox chkE2;
    private javax.swing.JCheckBox chkM1;
    private javax.swing.JCheckBox chkM2;
    private javax.swing.JCheckBox chkM3;
    private javax.swing.JCheckBox chkM4;
    private javax.swing.JCheckBox chkM5;
    private javax.swing.JCheckBox chkNAG1;
    private javax.swing.JCheckBox chkNAG2;
    private javax.swing.JCheckBox chkNoApto;
    private javax.swing.JCheckBox chkOE1;
    private javax.swing.JCheckBox chkOE2;
    private javax.swing.JCheckBox chkOE3;
    private javax.swing.JCheckBox chkOE4;
    private javax.swing.JCheckBox chkOE5;
    private javax.swing.JCheckBox chkR1;
    private javax.swing.JCheckBox chkR2;
    private javax.swing.JCheckBox chkR3;
    private javax.swing.JCheckBox chkR4;
    private javax.swing.JCheckBox chkR5;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTextArea txtAnalisis;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextArea txtRecomendaciones;
    // End of variables declaration//GEN-END:variables

public int calcularEdad(Calendar fechaNac){
    
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fechaNac.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fechaNac.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha = fechaNac.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha;
    //Si está en ese año pero todavía no los ha cumplido
    if(diff_month<0 || (diff_month==0 && diff_day<0)){
        int factor=1;
        diff_year = diff_year - factor;
    }
    return diff_year;
}




}
