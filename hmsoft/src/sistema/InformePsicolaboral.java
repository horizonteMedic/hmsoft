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
public final class InformePsicolaboral extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;

   public InformePsicolaboral(){
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
        bgCV = new javax.swing.ButtonGroup();
        bgEE = new javax.swing.ButtonGroup();
        bgTF = new javax.swing.ButtonGroup();
        bgAUTOESTIMA = new javax.swing.ButtonGroup();
        bgASERTIVIDAD = new javax.swing.ButtonGroup();
        bgAP5 = new javax.swing.ButtonGroup();
        bgAP6 = new javax.swing.ButtonGroup();
        bgAC1 = new javax.swing.ButtonGroup();
        bgAPSI1 = new javax.swing.ButtonGroup();
        bgAPSI2 = new javax.swing.ButtonGroup();
        bgAPSI3 = new javax.swing.ButtonGroup();
        bgAPSI4 = new javax.swing.ButtonGroup();
        bgAPSI5 = new javax.swing.ButtonGroup();
        bgAPSI6 = new javax.swing.ButtonGroup();
        bgAPSI7 = new javax.swing.ButtonGroup();
        bgAPSI8 = new javax.swing.ButtonGroup();
        bgConclusion = new javax.swing.ButtonGroup();
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
        jLabel123 = new javax.swing.JLabel();
        txtExamen = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txtImprimir = new javax.swing.JTextField();
        btnImprimir5 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        chkApto = new javax.swing.JCheckBox();
        chkNoApto = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel100 = new javax.swing.JLabel();
        chkCV1 = new javax.swing.JCheckBox();
        chkCV2 = new javax.swing.JCheckBox();
        chkCV3 = new javax.swing.JCheckBox();
        chkCV4 = new javax.swing.JCheckBox();
        chkCV5 = new javax.swing.JCheckBox();
        jPanel30 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        chkEE1 = new javax.swing.JCheckBox();
        chkEE2 = new javax.swing.JCheckBox();
        chkEE3 = new javax.swing.JCheckBox();
        chkEE4 = new javax.swing.JCheckBox();
        chkEE5 = new javax.swing.JCheckBox();
        chkTF1 = new javax.swing.JCheckBox();
        chkTF2 = new javax.swing.JCheckBox();
        chkTF3 = new javax.swing.JCheckBox();
        chkTF4 = new javax.swing.JCheckBox();
        chkTF5 = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        chkAutoes1 = new javax.swing.JCheckBox();
        chkAutoes2 = new javax.swing.JCheckBox();
        chkAutoes3 = new javax.swing.JCheckBox();
        chkAutoes4 = new javax.swing.JCheckBox();
        chkAutoes5 = new javax.swing.JCheckBox();
        jLabel106 = new javax.swing.JLabel();
        chkAsert1 = new javax.swing.JCheckBox();
        chkAsert2 = new javax.swing.JCheckBox();
        chkAsert3 = new javax.swing.JCheckBox();
        chkAsert4 = new javax.swing.JCheckBox();
        chkAsert5 = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        chkAnsiedadE1 = new javax.swing.JCheckBox();
        chkAnsiedadE2 = new javax.swing.JCheckBox();
        chkAnsiedadE3 = new javax.swing.JCheckBox();
        chkAnsiedadE4 = new javax.swing.JCheckBox();
        chkAnsiedadE5 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        chkAnsiedadR1 = new javax.swing.JCheckBox();
        chkAnsiedadR2 = new javax.swing.JCheckBox();
        chkAnsiedadR3 = new javax.swing.JCheckBox();
        chkAnsiedadR4 = new javax.swing.JCheckBox();
        chkAnsiedadR5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        chkCSBajo = new javax.swing.JCheckBox();
        chkCSPromedio = new javax.swing.JCheckBox();
        chkCSAlto = new javax.swing.JCheckBox();
        jLabel99 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        txtNivelAlerta = new javax.swing.JTextField();
        txtSomnolencia = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        chkApsico_CI1 = new javax.swing.JCheckBox();
        chkApsico_CI2 = new javax.swing.JCheckBox();
        chkApsico_CI3 = new javax.swing.JCheckBox();
        chkApsico_CI4 = new javax.swing.JCheckBox();
        chkApsico_CI5 = new javax.swing.JCheckBox();
        chkApsico_AC1 = new javax.swing.JCheckBox();
        chkApsico_AC2 = new javax.swing.JCheckBox();
        chkApsico_AC3 = new javax.swing.JCheckBox();
        chkApsico_AC4 = new javax.swing.JCheckBox();
        chkApsico_AC5 = new javax.swing.JCheckBox();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        chkApsico_TEC1 = new javax.swing.JCheckBox();
        chkApsico_TEC2 = new javax.swing.JCheckBox();
        chkApsico_TEC3 = new javax.swing.JCheckBox();
        chkApsico_TEC4 = new javax.swing.JCheckBox();
        chkApsico_TEC5 = new javax.swing.JCheckBox();
        jLabel111 = new javax.swing.JLabel();
        chkApsico_OCM1 = new javax.swing.JCheckBox();
        chkApsico_OCM2 = new javax.swing.JCheckBox();
        chkApsico_OCM3 = new javax.swing.JCheckBox();
        chkApsico_OCM4 = new javax.swing.JCheckBox();
        chkApsico_OCM5 = new javax.swing.JCheckBox();
        jLabel112 = new javax.swing.JLabel();
        chkApsico_AP1 = new javax.swing.JCheckBox();
        chkApsico_AP2 = new javax.swing.JCheckBox();
        chkApsico_AP3 = new javax.swing.JCheckBox();
        chkApsico_AP4 = new javax.swing.JCheckBox();
        chkApsico_AP5 = new javax.swing.JCheckBox();
        jLabel113 = new javax.swing.JLabel();
        chkApsico_TD1 = new javax.swing.JCheckBox();
        chkApsico_TD2 = new javax.swing.JCheckBox();
        chkApsico_TD3 = new javax.swing.JCheckBox();
        chkApsico_TD4 = new javax.swing.JCheckBox();
        chkApsico_TD5 = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        chkApsico_CP1 = new javax.swing.JCheckBox();
        chkApsico_CP2 = new javax.swing.JCheckBox();
        chkApsico_CP3 = new javax.swing.JCheckBox();
        chkApsico_CP4 = new javax.swing.JCheckBox();
        chkApsico_CP5 = new javax.swing.JCheckBox();
        jPanel33 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        chkApsico_M1 = new javax.swing.JCheckBox();
        chkApsico_M2 = new javax.swing.JCheckBox();
        chkApsico_M3 = new javax.swing.JCheckBox();
        chkApsico_M4 = new javax.swing.JCheckBox();
        chkApsico_M5 = new javax.swing.JCheckBox();
        jLabel94 = new javax.swing.JLabel();
        txtEstresLaboral = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Informe Psicolaboral");

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

        jLabel123.setText("Examen: ");

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
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel123)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123)
                    .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel122.setText("OBSRVACIONES");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane15.setViewportView(txtObservaciones);

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

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Conclusión"));

        bgConclusion.add(chkApto);
        chkApto.setText("APTO");
        chkApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAptoActionPerformed(evt);
            }
        });

        bgConclusion.add(chkNoApto);
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

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTO INTELECTUAL:"));

        jLabel88.setText("1- Razonamiento y resolución de problemas:");

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

        jLabel95.setText("2- Memoria");

        jLabel96.setText("3- Atención y concentración");

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

        jLabel97.setText("4- Coordinación viso-motora");

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

        jLabel98.setText("5- Orientación espacial");

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

        jLabel100.setText("6- Comprensión verbal");

        bgCV.add(chkCV1);
        chkCV1.setText("I");
        chkCV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCV1ActionPerformed(evt);
            }
        });

        bgCV.add(chkCV2);
        chkCV2.setText("NPI");
        chkCV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCV2ActionPerformed(evt);
            }
        });

        bgCV.add(chkCV3);
        chkCV3.setText("NP");
        chkCV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCV3ActionPerformed(evt);
            }
        });

        bgCV.add(chkCV4);
        chkCV4.setText("NPS");
        chkCV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCV4ActionPerformed(evt);
            }
        });

        bgCV.add(chkCV5);
        chkCV5.setText("S");
        chkCV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCV5ActionPerformed(evt);
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
                        .addGap(10, 10, 10)
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
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(chkCV1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCV2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCV3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCV4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCV5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkR1)
                        .addComponent(chkR2))
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCV1)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkCV2)
                        .addComponent(chkCV3)
                        .addComponent(chkCV4)
                        .addComponent(chkCV5)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS PERSONALIDAD"));

        jLabel90.setText("1- Estabilidad Emocional");

        bgEE.add(chkEE1);
        chkEE1.setText("B");
        chkEE1.setToolTipText("");
        chkEE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEE1ActionPerformed(evt);
            }
        });

        bgEE.add(chkEE2);
        chkEE2.setText("NPB");
        chkEE2.setToolTipText("");
        chkEE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEE2ActionPerformed(evt);
            }
        });

        bgEE.add(chkEE3);
        chkEE3.setText("NP");
        chkEE3.setToolTipText("");
        chkEE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEE3ActionPerformed(evt);
            }
        });

        bgEE.add(chkEE4);
        chkEE4.setText("NPA");
        chkEE4.setToolTipText("");
        chkEE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEE4ActionPerformed(evt);
            }
        });

        bgEE.add(chkEE5);
        chkEE5.setText("A");
        chkEE5.setToolTipText("");
        chkEE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEE5ActionPerformed(evt);
            }
        });

        bgTF.add(chkTF1);
        chkTF1.setText("B");
        chkTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTF1ActionPerformed(evt);
            }
        });

        bgTF.add(chkTF2);
        chkTF2.setText("NPB");
        chkTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTF2ActionPerformed(evt);
            }
        });

        bgTF.add(chkTF3);
        chkTF3.setText("NP");
        chkTF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTF3ActionPerformed(evt);
            }
        });

        bgTF.add(chkTF4);
        chkTF4.setText("NPA");
        chkTF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTF4ActionPerformed(evt);
            }
        });

        bgTF.add(chkTF5);
        chkTF5.setText("A");
        chkTF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTF5ActionPerformed(evt);
            }
        });

        jLabel101.setText("2- Tolerancia a la Fustración ");

        jLabel103.setText("3- Autoestima");

        bgAUTOESTIMA.add(chkAutoes1);
        chkAutoes1.setText("B");
        chkAutoes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoes1ActionPerformed(evt);
            }
        });

        bgAUTOESTIMA.add(chkAutoes2);
        chkAutoes2.setText("NPB");
        chkAutoes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoes2ActionPerformed(evt);
            }
        });

        bgAUTOESTIMA.add(chkAutoes3);
        chkAutoes3.setText("NP");
        chkAutoes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoes3ActionPerformed(evt);
            }
        });

        bgAUTOESTIMA.add(chkAutoes4);
        chkAutoes4.setText("NPA");
        chkAutoes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoes4ActionPerformed(evt);
            }
        });

        bgAUTOESTIMA.add(chkAutoes5);
        chkAutoes5.setText("A");
        chkAutoes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoes5ActionPerformed(evt);
            }
        });

        jLabel106.setText("4- Asertividad");

        bgASERTIVIDAD.add(chkAsert1);
        chkAsert1.setText("B");
        chkAsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsert1ActionPerformed(evt);
            }
        });

        bgASERTIVIDAD.add(chkAsert2);
        chkAsert2.setText("NPB");
        chkAsert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsert2ActionPerformed(evt);
            }
        });

        bgASERTIVIDAD.add(chkAsert3);
        chkAsert3.setText("NP");
        chkAsert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsert3ActionPerformed(evt);
            }
        });

        bgASERTIVIDAD.add(chkAsert4);
        chkAsert4.setText("NPA");
        chkAsert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsert4ActionPerformed(evt);
            }
        });

        bgASERTIVIDAD.add(chkAsert5);
        chkAsert5.setText("A");
        chkAsert5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsert5ActionPerformed(evt);
            }
        });

        jLabel107.setText("5- Ansiedad ESTADO");

        bgAP5.add(chkAnsiedadE1);
        chkAnsiedadE1.setText("B");
        chkAnsiedadE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadE1ActionPerformed(evt);
            }
        });

        bgAP5.add(chkAnsiedadE2);
        chkAnsiedadE2.setText("NPB");
        chkAnsiedadE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadE2ActionPerformed(evt);
            }
        });

        bgAP5.add(chkAnsiedadE3);
        chkAnsiedadE3.setText("NP");
        chkAnsiedadE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadE3ActionPerformed(evt);
            }
        });

        bgAP5.add(chkAnsiedadE4);
        chkAnsiedadE4.setText("NPA");
        chkAnsiedadE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadE4ActionPerformed(evt);
            }
        });

        bgAP5.add(chkAnsiedadE5);
        chkAnsiedadE5.setText("A");
        chkAnsiedadE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadE5ActionPerformed(evt);
            }
        });

        jLabel108.setText("6- Ansiedad RASGO");

        bgAP6.add(chkAnsiedadR1);
        chkAnsiedadR1.setText("B");
        chkAnsiedadR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadR1ActionPerformed(evt);
            }
        });

        bgAP6.add(chkAnsiedadR2);
        chkAnsiedadR2.setText("NPB");
        chkAnsiedadR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadR2ActionPerformed(evt);
            }
        });

        bgAP6.add(chkAnsiedadR3);
        chkAnsiedadR3.setText("NP");
        chkAnsiedadR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadR3ActionPerformed(evt);
            }
        });

        bgAP6.add(chkAnsiedadR4);
        chkAnsiedadR4.setText("NPA");
        chkAnsiedadR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadR4ActionPerformed(evt);
            }
        });

        bgAP6.add(chkAnsiedadR5);
        chkAnsiedadR5.setText("A");
        chkAnsiedadR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnsiedadR5ActionPerformed(evt);
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
                        .addComponent(chkEE1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEE2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEE3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEE4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEE5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkAutoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAutoes2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAutoes3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAutoes4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAutoes5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkAsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAsert2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAsert3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAsert4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAsert5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkAnsiedadE1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadE2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadE3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadE4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadE5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(chkAnsiedadR1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadR2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadR3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadR4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnsiedadR5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkEE1)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkEE2)
                        .addComponent(chkEE3)
                        .addComponent(chkEE4)
                        .addComponent(chkEE5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTF1)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkTF2)
                        .addComponent(chkTF3)
                        .addComponent(chkTF4)
                        .addComponent(chkTF5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAutoes1)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkAutoes2)
                        .addComponent(chkAutoes3)
                        .addComponent(chkAutoes4)
                        .addComponent(chkAutoes5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAsert1)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkAsert2)
                        .addComponent(chkAsert3)
                        .addComponent(chkAsert4)
                        .addComponent(chkAsert5)))
                .addGap(5, 5, 5)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAnsiedadE1)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkAnsiedadE2)
                        .addComponent(chkAnsiedadE3)
                        .addComponent(chkAnsiedadE4)
                        .addComponent(chkAnsiedadE5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAnsiedadR1)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkAnsiedadR2)
                        .addComponent(chkAnsiedadR3)
                        .addComponent(chkAnsiedadR4)
                        .addComponent(chkAnsiedadR5)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CRITERIOS PSICOLÓGICOS I", jPanel2);

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS CONDUCTUALES"));

        jLabel89.setText("1- Calidad de sueño/ Estrés");

        bgAC1.add(chkCSBajo);
        chkCSBajo.setText("BAJO");
        chkCSBajo.setToolTipText("");
        chkCSBajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCSBajoActionPerformed(evt);
            }
        });

        bgAC1.add(chkCSPromedio);
        chkCSPromedio.setText("PROMEDIO");
        chkCSPromedio.setToolTipText("");
        chkCSPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCSPromedioActionPerformed(evt);
            }
        });

        bgAC1.add(chkCSAlto);
        chkCSAlto.setText("ALTO");
        chkCSAlto.setToolTipText("");
        chkCSAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCSAltoActionPerformed(evt);
            }
        });

        jLabel99.setText("2- Nivel de alerta ante el riego");

        jLabel102.setText("3- Somnolencia");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNivelAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                                    .addComponent(chkCSBajo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkCSPromedio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkCSAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCSBajo)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkCSPromedio)
                        .addComponent(chkCSAlto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99)
                .addGap(1, 1, 1)
                .addComponent(txtNivelAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS PSICOLABORALES"));

        jLabel91.setText("1- Capacidad de influencia");

        bgAPSI1.add(chkApsico_CI1);
        chkApsico_CI1.setText("PD");
        chkApsico_CI1.setToolTipText("");
        chkApsico_CI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CI1ActionPerformed(evt);
            }
        });

        bgAPSI1.add(chkApsico_CI2);
        chkApsico_CI2.setText("NM");
        chkApsico_CI2.setToolTipText("");
        chkApsico_CI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CI2ActionPerformed(evt);
            }
        });

        bgAPSI1.add(chkApsico_CI3);
        chkApsico_CI3.setText("A");
        chkApsico_CI3.setToolTipText("");
        chkApsico_CI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CI3ActionPerformed(evt);
            }
        });

        bgAPSI1.add(chkApsico_CI4);
        chkApsico_CI4.setText("D");
        chkApsico_CI4.setToolTipText("");
        chkApsico_CI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CI4ActionPerformed(evt);
            }
        });

        bgAPSI1.add(chkApsico_CI5);
        chkApsico_CI5.setText("E");
        chkApsico_CI5.setToolTipText("");
        chkApsico_CI5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CI5ActionPerformed(evt);
            }
        });

        bgAPSI2.add(chkApsico_AC1);
        chkApsico_AC1.setText("PD");
        chkApsico_AC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AC1ActionPerformed(evt);
            }
        });

        bgAPSI2.add(chkApsico_AC2);
        chkApsico_AC2.setText("NM");
        chkApsico_AC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AC2ActionPerformed(evt);
            }
        });

        bgAPSI2.add(chkApsico_AC3);
        chkApsico_AC3.setText("A");
        chkApsico_AC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AC3ActionPerformed(evt);
            }
        });

        bgAPSI2.add(chkApsico_AC4);
        chkApsico_AC4.setText("D");
        chkApsico_AC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AC4ActionPerformed(evt);
            }
        });

        bgAPSI2.add(chkApsico_AC5);
        chkApsico_AC5.setText("E");
        chkApsico_AC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AC5ActionPerformed(evt);
            }
        });

        jLabel109.setText("2- Adaptación a los cambios");

        jLabel110.setText("3- Trabajo en equipo y colaboración");

        bgAPSI3.add(chkApsico_TEC1);
        chkApsico_TEC1.setText("PD");
        chkApsico_TEC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TEC1ActionPerformed(evt);
            }
        });

        bgAPSI3.add(chkApsico_TEC2);
        chkApsico_TEC2.setText("NM");
        chkApsico_TEC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TEC2ActionPerformed(evt);
            }
        });

        bgAPSI3.add(chkApsico_TEC3);
        chkApsico_TEC3.setText("A");
        chkApsico_TEC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TEC3ActionPerformed(evt);
            }
        });

        bgAPSI3.add(chkApsico_TEC4);
        chkApsico_TEC4.setText("D");
        chkApsico_TEC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TEC4ActionPerformed(evt);
            }
        });

        bgAPSI3.add(chkApsico_TEC5);
        chkApsico_TEC5.setText("E");
        chkApsico_TEC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TEC5ActionPerformed(evt);
            }
        });

        jLabel111.setText("4- Orientación a la acción y mejora de procesos ");

        bgAPSI4.add(chkApsico_OCM1);
        chkApsico_OCM1.setText("PD");
        chkApsico_OCM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_OCM1ActionPerformed(evt);
            }
        });

        bgAPSI4.add(chkApsico_OCM2);
        chkApsico_OCM2.setText("NM");
        chkApsico_OCM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_OCM2ActionPerformed(evt);
            }
        });

        bgAPSI4.add(chkApsico_OCM3);
        chkApsico_OCM3.setText("A");
        chkApsico_OCM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_OCM3ActionPerformed(evt);
            }
        });

        bgAPSI4.add(chkApsico_OCM4);
        chkApsico_OCM4.setText("D");
        chkApsico_OCM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_OCM4ActionPerformed(evt);
            }
        });

        bgAPSI4.add(chkApsico_OCM5);
        chkApsico_OCM5.setText("E");
        chkApsico_OCM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_OCM5ActionPerformed(evt);
            }
        });

        jLabel112.setText("5- Autonomía y Proactividad ");

        bgAPSI5.add(chkApsico_AP1);
        chkApsico_AP1.setText("PD");
        chkApsico_AP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AP1ActionPerformed(evt);
            }
        });

        bgAPSI5.add(chkApsico_AP2);
        chkApsico_AP2.setText("NM");
        chkApsico_AP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AP2ActionPerformed(evt);
            }
        });

        bgAPSI5.add(chkApsico_AP3);
        chkApsico_AP3.setText("A");
        chkApsico_AP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AP3ActionPerformed(evt);
            }
        });

        bgAPSI5.add(chkApsico_AP4);
        chkApsico_AP4.setText("D");
        chkApsico_AP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AP4ActionPerformed(evt);
            }
        });

        bgAPSI5.add(chkApsico_AP5);
        chkApsico_AP5.setText("E");
        chkApsico_AP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_AP5ActionPerformed(evt);
            }
        });

        jLabel113.setText("6- Toma de decisiones ");

        bgAPSI6.add(chkApsico_TD1);
        chkApsico_TD1.setText("PD");
        chkApsico_TD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TD1ActionPerformed(evt);
            }
        });

        bgAPSI6.add(chkApsico_TD2);
        chkApsico_TD2.setText("NM");
        chkApsico_TD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TD2ActionPerformed(evt);
            }
        });

        bgAPSI6.add(chkApsico_TD3);
        chkApsico_TD3.setText("A");
        chkApsico_TD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TD3ActionPerformed(evt);
            }
        });

        bgAPSI6.add(chkApsico_TD4);
        chkApsico_TD4.setText("D");
        chkApsico_TD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TD4ActionPerformed(evt);
            }
        });

        bgAPSI6.add(chkApsico_TD5);
        chkApsico_TD5.setText("E");
        chkApsico_TD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_TD5ActionPerformed(evt);
            }
        });

        jLabel92.setText("7- Crecimiento personal");

        bgAPSI7.add(chkApsico_CP1);
        chkApsico_CP1.setText("PD");
        chkApsico_CP1.setToolTipText("");
        chkApsico_CP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CP1ActionPerformed(evt);
            }
        });

        bgAPSI7.add(chkApsico_CP2);
        chkApsico_CP2.setText("NM");
        chkApsico_CP2.setToolTipText("");
        chkApsico_CP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CP2ActionPerformed(evt);
            }
        });

        bgAPSI7.add(chkApsico_CP3);
        chkApsico_CP3.setText("A");
        chkApsico_CP3.setToolTipText("");
        chkApsico_CP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CP3ActionPerformed(evt);
            }
        });

        bgAPSI7.add(chkApsico_CP4);
        chkApsico_CP4.setText("D");
        chkApsico_CP4.setToolTipText("");
        chkApsico_CP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CP4ActionPerformed(evt);
            }
        });

        bgAPSI7.add(chkApsico_CP5);
        chkApsico_CP5.setText("E");
        chkApsico_CP5.setToolTipText("");
        chkApsico_CP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_CP5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_CI1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CI2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CI3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CI4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CI5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_AC1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AC2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AC3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AC4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AC5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_TEC1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TEC2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TEC3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TEC4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TEC5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_OCM1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_OCM2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_OCM3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_OCM4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_OCM5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_AP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AP2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AP3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AP4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_AP5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_TD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TD2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TD3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TD4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_TD5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(chkApsico_CP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CP2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CP3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CP4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkApsico_CP5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_CI1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_CI2)
                        .addComponent(chkApsico_CI3)
                        .addComponent(chkApsico_CI4)
                        .addComponent(chkApsico_CI5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_AC1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_AC2)
                        .addComponent(chkApsico_AC3)
                        .addComponent(chkApsico_AC4)
                        .addComponent(chkApsico_AC5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_TEC1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_TEC2)
                        .addComponent(chkApsico_TEC3)
                        .addComponent(chkApsico_TEC4)
                        .addComponent(chkApsico_TEC5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_OCM1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_OCM2)
                        .addComponent(chkApsico_OCM3)
                        .addComponent(chkApsico_OCM4)
                        .addComponent(chkApsico_OCM5)))
                .addGap(5, 5, 5)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_AP1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_AP2)
                        .addComponent(chkApsico_AP3)
                        .addComponent(chkApsico_AP4)
                        .addComponent(chkApsico_AP5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_TD1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_TD2)
                        .addComponent(chkApsico_TD3)
                        .addComponent(chkApsico_TD4)
                        .addComponent(chkApsico_TD5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_CP1)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_CP2)
                        .addComponent(chkApsico_CP3)
                        .addComponent(chkApsico_CP4)
                        .addComponent(chkApsico_CP5)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS PSICOLABORALES"));

        jLabel93.setText("8- Motivación ");

        bgAPSI8.add(chkApsico_M1);
        chkApsico_M1.setText("PD");
        chkApsico_M1.setToolTipText("");
        chkApsico_M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_M1ActionPerformed(evt);
            }
        });

        bgAPSI8.add(chkApsico_M2);
        chkApsico_M2.setText("NM");
        chkApsico_M2.setToolTipText("");
        chkApsico_M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_M2ActionPerformed(evt);
            }
        });

        bgAPSI8.add(chkApsico_M3);
        chkApsico_M3.setText("A");
        chkApsico_M3.setToolTipText("");
        chkApsico_M3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_M3ActionPerformed(evt);
            }
        });

        bgAPSI8.add(chkApsico_M4);
        chkApsico_M4.setText("D");
        chkApsico_M4.setToolTipText("");
        chkApsico_M4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_M4ActionPerformed(evt);
            }
        });

        bgAPSI8.add(chkApsico_M5);
        chkApsico_M5.setText("E");
        chkApsico_M5.setToolTipText("");
        chkApsico_M5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkApsico_M5ActionPerformed(evt);
            }
        });

        jLabel94.setText("9- Estrés laboral ");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel33Layout.createSequentialGroup()
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(101, 101, 101))
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(chkApsico_M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkApsico_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkApsico_M3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkApsico_M4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkApsico_M5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtEstresLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApsico_M1)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkApsico_M2)
                        .addComponent(chkApsico_M3)
                        .addComponent(chkApsico_M4)
                        .addComponent(chkApsico_M5)))
                .addGap(2, 2, 2)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstresLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CRITERIOS PSICOLÓGICOS II", jPanel3);

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
                        .addGap(189, 189, 189)
                        .addComponent(btnActualizar)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiar)))
                .addGap(110, 347, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel121)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
        sQuery  = "Select n_orden from informe_psicolaboral where n_orden="+txtNorden.getText().toString();
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
        txtExamen.setText("");
        txtObservaciones.setText("");
        txtRecomendaciones.setText("");
        bgR.clearSelection();
        bgM.clearSelection();
        bgAC.clearSelection();
        bgCVM.clearSelection();
        bgOE.clearSelection();
        bgCV.clearSelection();
        bgEE.clearSelection();
        bgTF.clearSelection();
        bgAUTOESTIMA.clearSelection();
        bgASERTIVIDAD.clearSelection();
        bgAP5.clearSelection();
        bgAP6.clearSelection();
        bgAC1.clearSelection();
        txtNivelAlerta.setText("");
        txtSomnolencia.setText("");
        bgAPSI1.clearSelection();
        bgAPSI2.clearSelection();
        bgAPSI3.clearSelection();
        bgAPSI4.clearSelection();
        bgAPSI5.clearSelection();
        bgAPSI6.clearSelection();
        bgAPSI7.clearSelection();
        bgAPSI8.clearSelection();
        txtEstresLaboral.setText("");
        bgConclusion.clearSelection();
        
    }
    public void Actualizar(){
            String sCodigo=txtNorden.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE  informe_psicolaboral\n" +
                    " SET fecha='"+FechaEx.getDate()+"',"
                    + "      chkr1='"+chkR1.isSelected()+"', \n" 
                    + "      chkr2='"+chkR2.isSelected()+"', \n" 
                    + "      chkr3='"+chkR3.isSelected()+"',"+
                    "        chkr4='"+chkR4.isSelected()+"',"+
                    "        chkr5='"+chkR5.isSelected()+"',"+
                    "        chkm1='"+chkM1.isSelected()+"',"+
                    "        chkm2='"+chkM2.isSelected()+"',"+
                    "        chkm3='"+chkM3.isSelected()+"',"+
                    "        chkm4='"+chkM4.isSelected()+"',"+
                    "        chkm5='"+chkM5.isSelected()+"',"+
                    "        chkac1='"+chkAC1.isSelected()+"',"+
                    "        chkac2='"+chkAC2.isSelected()+"',"+
                    "        chkac3='"+chkAC3.isSelected()+"',"+
                    "        chkac4='"+chkAC4.isSelected()+"',"+
                    "        chkac5='"+chkAC5.isSelected()+"',"+
                    "        chkcvm1='"+chkCVM1.isSelected()+"',"+
                    "        chkcvm2='"+chkCVM2.isSelected()+"',"+
                    "        chkcvm3='"+chkCVM3.isSelected()+"',"+
                    "        chkcvm4='"+chkCVM4.isSelected()+"',"+
                    "        chkcvm5='"+chkCVM5.isSelected()+"',"+
                    "        chkoe1='"+chkOE1.isSelected()+"',"+
                    "        chkoe2='"+chkOE2.isSelected()+"',"+
                    "        chkoe3='"+chkOE3.isSelected()+"',"+
                    "        chkoe4='"+chkOE4.isSelected()+"',"+
                    "        chkoe5='"+chkOE5.isSelected()+"',"+
                    "        chkcv1='"+chkCV1.isSelected()+"',"+
                    "        chkcv2='"+chkCV2.isSelected()+"',"+
                    "        chkcv3='"+chkCV3.isSelected()+"',"+
                    "        chkcv4='"+chkCV4.isSelected()+"',"+
                   "         chkcv5='"+chkCV5.isSelected()+"',"+
                   "        chkee1='"+chkEE1.isSelected()+"',"+
                   "        chkee2='"+chkEE2.isSelected()+"',"+
                   "        chkee3='"+chkEE3.isSelected()+"',"+
                    "      chkee4='"+chkEE4.isSelected()+"', \n" +
                    "      chkee5='"+chkEE5.isSelected()+"', \n" +
                    "      chktf1='"+chkTF1.isSelected()+"',"+
                    "        chktf2='"+chkTF2.isSelected()+"',"+
                    "        chktf3='"+chkTF3.isSelected()+"',"+
                    "        chktf4='"+chkTF4.isSelected()+"',"+
                    "        chktf5='"+chkTF5.isSelected()+"',"+
                    "        chkautoes1='"+chkAutoes1.isSelected()+"',"+
                    "        chkautoes2='"+chkAutoes2.isSelected()+"',"+
                    "        chkautoes3='"+chkAutoes3.isSelected()+"',"+
                    "        chkautoes4='"+chkAutoes4.isSelected()+"',"+
                    "        chkautoes5='"+chkAutoes5.isSelected()+"',"+
                    "        chkasert1='"+chkAsert1.isSelected()+"',"+
                    "        chkasert2='"+chkAsert2.isSelected()+"',"+
                    "        chkasert3='"+chkAsert3.isSelected()+"',"+
                    "        chkasert4='"+chkAsert4.isSelected()+"',"+
                    "        chkasert5='"+chkAsert5.isSelected()+"',"+
                    "        chkansiedade1='"+chkAnsiedadE1.isSelected()+"',"+
                    "        chkansiedade2='"+chkAnsiedadE2.isSelected()+"',"+
                    "        chkansiedade3='"+chkAnsiedadE3.isSelected()+"',"+
                    "        chkansiedade4='"+chkAnsiedadE4.isSelected()+"',"+
                   "         chkansiedade5='"+chkAnsiedadE5.isSelected()+"',"+
                   "         chkansiedadr1='"+chkAnsiedadR1.isSelected()+"',"+
                   "         chkansiedadr2='"+chkAnsiedadR2.isSelected()+"',"+
                   "         chkansiedadr3='"+chkAnsiedadR3.isSelected()+"',"+
                    "        chkansiedadr4='"+chkAnsiedadR4.isSelected()+"', \n" +
                    "        chkansiedadr5='"+chkAnsiedadR5.isSelected()+"', \n" +
                    "        chkcsbajo='"+chkCSBajo.isSelected()+"',"+
                    "        chkcspromedio='"+chkCSPromedio.isSelected()+"',"+
                    "        chkcsalto='"+chkCSAlto.isSelected()+"',"+
                    "        txtnivelalerta='"+txtNivelAlerta.getText()+"',"+
                    "        txtsomnolencia='"+txtSomnolencia.getText()+"',"+
                    "        chkapsico_ci1='"+chkApsico_CI1.isSelected()+"',"+
                    "        chkapsico_ci2='"+chkApsico_CI2.isSelected()+"',"+
                    "        chkapsico_ci3='"+chkApsico_CI3.isSelected()+"',"+
                    "        chkapsico_ci4='"+chkApsico_CI4.isSelected()+"',"+
                    "        chkapsico_ci5='"+chkApsico_CI5.isSelected()+"',"+
                    "        chkapsico_ac1='"+chkApsico_AC1.isSelected()+"',"+
                    "        chkapsico_ac2='"+chkApsico_AC2.isSelected()+"',"+
                    "        chkapsico_ac3='"+chkApsico_AC3.isSelected()+"',"+
                    "        chkapsico_ac4='"+chkApsico_AC4.isSelected()+"',"+
                    "        chkapsico_ac5='"+chkApsico_AC5.isSelected()+"',"+
                    "        chkapsico_tec1='"+chkApsico_TEC1.isSelected()+"',"+
                    "        chkapsico_tec2='"+chkApsico_TEC2.isSelected()+"',"+
                    "        chkapsico_tec3='"+chkApsico_TEC3.isSelected()+"',"+
                    "        chkapsico_tec4='"+chkApsico_TEC4.isSelected()+"',"+
                    "        chkapsico_tec5='"+chkApsico_TEC5.isSelected()+"',"+
                    "        chkapsico_ocm1='"+chkApsico_OCM1.isSelected()+"',"+
                    "        chkapsico_ocm2='"+chkApsico_OCM2.isSelected()+"',"+
                    "        chkapsico_ocm3='"+chkApsico_OCM3.isSelected()+"',"+
                    "        chkapsico_ocm4='"+chkApsico_OCM4.isSelected()+"',"+
                    "        chkapsico_ocm5='"+chkApsico_OCM5.isSelected()+"',"+
                    "        chkapsico_ap1='"+chkApsico_AP1.isSelected()+"',"+
                    "        chkapsico_ap2='"+chkApsico_AP2.isSelected()+"',"+
                    "        chkapsico_ap3='"+chkApsico_AP3.isSelected()+"',"+
                    "        chkapsico_ap4='"+chkApsico_AP4.isSelected()+"',"+
                   "         chkapsico_ap5='"+chkApsico_AP5.isSelected()+"',"+
                   "        chkapsico_td1='"+chkApsico_TD1.isSelected()+"',"+
                   "        chkapsico_td2='"+chkApsico_TD2.isSelected()+"',"+
                   "        chkapsico_td3='"+chkApsico_TD3.isSelected()+"',"+
                     "        chkapsico_td4='"+chkApsico_TD4.isSelected()+"',"+
                   "         chkapsico_td5='"+chkApsico_TD5.isSelected()+"',"+
                   "        chkapsico_cp1='"+chkApsico_CP1.isSelected()+"',"+
                   "        chkapsico_cp2='"+chkApsico_CP2.isSelected()+"',"+
                   "        chkapsico_cp3='"+chkApsico_CP3.isSelected()+"',"+
                   "         chkapsico_cp4='"+chkApsico_CP4.isSelected()+"',"+
                   "        chkapsico_cp5='"+chkApsico_CP5.isSelected()+"',"+
                   "        chkapsico_m1='"+chkApsico_M1.isSelected()+"',"+
                   "        chkapsico_m2='"+chkApsico_M2.isSelected()+"',"+
                   "        chkapsico_m3='"+chkApsico_M3.isSelected()+"',"+
                   "        chkapsico_m4='"+chkApsico_M4.isSelected()+"',"+
                   "        chkapsico_m5='"+chkApsico_M5.isSelected()+"',"+ 
                   "        txtestreslaboral='"+txtEstresLaboral.getText()+"',"+
                   "        txtobservaciones='"+txtObservaciones.getText()+"',"+
                   "        txtrecomendaciones='"+txtRecomendaciones.getText()+"',"+
                   "        apto='"+chkApto.isSelected()+"',"+
                   "        noapto='"+chkNoApto.isSelected()+"'"+
                    " WHERE n_orden="+sCodigo+";";
               //  System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimir();
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InformePsicolaboral.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }
    
    private boolean Grabar() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO informe_psicolaboral(\n" +
"            n_orden, fecha, chkr1, chkr2, chkr3, chkr4, chkr5, chkm1, chkm2, \n" +
"            chkm3, chkm4, chkm5, chkac1, chkac2, chkac3, chkac4, chkac5, \n" +
"            chkcvm1, chkcvm2, chkcvm3, chkcvm4, chkcvm5, chkoe1, chkoe2, \n" +
"            chkoe3, chkoe4, chkoe5, chkcv1, chkcv2, chkcv3, chkcv4, chkcv5, \n" +
"            chkee1, chkee2, chkee3, chkee4, chkee5, chktf1, chktf2, chktf3, \n" +
"            chktf4, chktf5, chkautoes1, chkautoes2, chkautoes3, chkautoes4, \n" +
"            chkautoes5, chkasert1, chkasert2, chkasert3, chkasert4, chkasert5, \n" +
"            chkansiedade1, chkansiedade2, chkansiedade3, chkansiedade4, chkansiedade5, \n" +
"            chkansiedadr1, chkansiedadr2, chkansiedadr3, chkansiedadr4, chkansiedadr5, \n" +
"            chkcsbajo, chkcspromedio, chkcsalto, txtnivelalerta, txtsomnolencia, \n" +
"            chkapsico_ci1, chkapsico_ci2, chkapsico_ci3, chkapsico_ci4, chkapsico_ci5, \n" +
"            chkapsico_ac1, chkapsico_ac2, chkapsico_ac3, chkapsico_ac4, chkapsico_ac5, \n" +
"            chkapsico_tec1, chkapsico_tec2, chkapsico_tec3, chkapsico_tec4, \n" +
"            chkapsico_tec5, chkapsico_ocm1, chkapsico_ocm2, chkapsico_ocm3, \n" +
"            chkapsico_ocm4, chkapsico_ocm5, chkapsico_ap1, chkapsico_ap2, \n" +
"            chkapsico_ap3, chkapsico_ap4, chkapsico_ap5, chkapsico_td1, chkapsico_td2, \n" +
"            chkapsico_td3, chkapsico_td4, chkapsico_td5, chkapsico_cp1, chkapsico_cp2, \n" +
"            chkapsico_cp3, chkapsico_cp4, chkapsico_cp5, chkapsico_m1, chkapsico_m2, \n" +
"            chkapsico_m3, chkapsico_m4, chkapsico_m5, txtestreslaboral, txtobservaciones, \n" +
"            txtrecomendaciones, apto, noapto)";       
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
                    chkCV1.isSelected()+"','"+
                    chkCV2.isSelected()+"','"+
                    chkCV3.isSelected()+"','"+
                    chkCV4.isSelected()+"','"+
                    chkCV5.isSelected()+"','"+
                    chkEE1.isSelected()+"','"+
                    chkEE2.isSelected()+"','"+    
                    chkEE3.isSelected()+"','"+
                    chkEE4.isSelected()+"','"+    
                    chkEE5.isSelected()+"','"+
                    chkTF1.isSelected()+"','"+
                    chkTF2.isSelected()+"','"+    
                    chkTF3.isSelected()+"','"+
                    chkTF4.isSelected()+"','"+    
                    chkTF5.isSelected()+"','"+
                    chkAutoes1.isSelected()+"','"+
                    chkAutoes2.isSelected()+"','"+    
                    chkAutoes3.isSelected()+"','"+
                    chkAutoes4.isSelected()+"','"+    
                    chkAutoes5.isSelected()+"','"+
                    chkAsert1.isSelected()+"','"+
                    chkAsert2.isSelected()+"','"+    
                    chkAsert3.isSelected()+"','"+
                    chkAsert4.isSelected()+"','"+    
                    chkAsert5.isSelected()+"','"+
                    chkAnsiedadE1.isSelected()+"','"+
                    chkAnsiedadE2.isSelected()+"','"+    
                    chkAnsiedadE3.isSelected()+"','"+
                    chkAnsiedadE4.isSelected()+"','"+    
                    chkAnsiedadE5.isSelected()+"','"+
                    chkAnsiedadR1.isSelected()+"','"+
                    chkAnsiedadR2.isSelected()+"','"+    
                    chkAnsiedadR3.isSelected()+"','"+
                    chkAnsiedadR4.isSelected()+"','"+    
                    chkAnsiedadR5.isSelected()+"','"+
                    chkCSBajo.isSelected()+"','"+
                    chkCSPromedio.isSelected()+"','"+    
                    chkCSAlto.isSelected()+"','"+
                    txtNivelAlerta.getText()+"','"+
                    txtSomnolencia.getText()+"','"+
                    chkApsico_CI1.isSelected()+"','"+
                    chkApsico_CI2.isSelected()+"','"+    
                    chkApsico_CI3.isSelected()+"','"+
                    chkApsico_CI4.isSelected()+"','"+    
                    chkApsico_CI5.isSelected()+"','"+
                    chkApsico_AC1.isSelected()+"','"+
                    chkApsico_AC2.isSelected()+"','"+    
                    chkApsico_AC3.isSelected()+"','"+
                    chkApsico_AC4.isSelected()+"','"+    
                    chkApsico_AC5.isSelected()+"','"+
                    chkApsico_TEC1.isSelected()+"','"+
                    chkApsico_TEC2.isSelected()+"','"+    
                    chkApsico_TEC3.isSelected()+"','"+
                    chkApsico_TEC4.isSelected()+"','"+    
                    chkApsico_TEC5.isSelected()+"','"+
                    chkApsico_OCM1.isSelected()+"','"+
                    chkApsico_OCM2.isSelected()+"','"+    
                    chkApsico_OCM3.isSelected()+"','"+
                    chkApsico_OCM4.isSelected()+"','"+    
                    chkApsico_OCM5.isSelected()+"','"+
                    chkApsico_AP1.isSelected()+"','"+
                    chkApsico_AP2.isSelected()+"','"+    
                    chkApsico_AP3.isSelected()+"','"+
                    chkApsico_AP4.isSelected()+"','"+    
                    chkApsico_AP5.isSelected()+"','"+
                    chkApsico_TD1.isSelected()+"','"+
                    chkApsico_TD2.isSelected()+"','"+    
                    chkApsico_TD3.isSelected()+"','"+
                    chkApsico_TD4.isSelected()+"','"+    
                    chkApsico_TD5.isSelected()+"','"+
                    chkApsico_CP1.isSelected()+"','"+
                    chkApsico_CP2.isSelected()+"','"+    
                    chkApsico_CP3.isSelected()+"','"+
                    chkApsico_CP4.isSelected()+"','"+    
                    chkApsico_CP5.isSelected()+"','"+
                    chkApsico_M1.isSelected()+"','"+
                    chkApsico_M2.isSelected()+"','"+    
                    chkApsico_M3.isSelected()+"','"+
                    chkApsico_M4.isSelected()+"','"+    
                    chkApsico_M5.isSelected()+"','"+  
                    txtEstresLaboral.getText()+"','"+
                    txtObservaciones.getText()+"','"+
                    txtRecomendaciones.getText()+"','"+
                    chkApto.isSelected()+"','"+          
                    chkNoApto.isSelected()+"'"+  
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Informe_Psicolaboral.jasper";
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Informe_Psicolaboral.jasper";
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
                + "d.sexo_pa,n.tipoprueba, n.nom_examen "
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
                        txtExamen.setText(oConn.setResult.getString("nom_examen"));
                        if(txtExamen.getText().equals("PRE-OCUPACIONAL")){
                            txtEstresLaboral.setEnabled(false);
                        }else{
                            txtEstresLaboral.setEnabled(true);
                        }
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
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,n.nom_examen,"
                    + "fecha, chkr1, chkr2, chkr3, chkr4, chkr5, chkm1, chkm2, \n" +
"       chkm3, chkm4, chkm5, chkac1, chkac2, chkac3, chkac4, chkac5, \n" +
"       chkcvm1, chkcvm2, chkcvm3, chkcvm4, chkcvm5, chkoe1, chkoe2, \n" +
"       chkoe3, chkoe4, chkoe5, chkcv1, chkcv2, chkcv3, chkcv4, chkcv5, \n" +
"       chkee1, chkee2, chkee3, chkee4, chkee5, chktf1, chktf2, chktf3, \n" +
"       chktf4, chktf5, chkautoes1, chkautoes2, chkautoes3, chkautoes4, \n" +
"       chkautoes5, chkasert1, chkasert2, chkasert3, chkasert4, chkasert5, \n" +
"       chkansiedade1, chkansiedade2, chkansiedade3, chkansiedade4, chkansiedade5, \n" +
"       chkansiedadr1, chkansiedadr2, chkansiedadr3, chkansiedadr4, chkansiedadr5, \n" +
"       chkcsbajo, chkcspromedio, chkcsalto, txtnivelalerta, txtsomnolencia, \n" +
"       chkapsico_ci1, chkapsico_ci2, chkapsico_ci3, chkapsico_ci4, chkapsico_ci5, \n" +
"       chkapsico_ac1, chkapsico_ac2, chkapsico_ac3, chkapsico_ac4, chkapsico_ac5, \n" +
"       chkapsico_tec1, chkapsico_tec2, chkapsico_tec3, chkapsico_tec4, \n" +
"       chkapsico_tec5, chkapsico_ocm1, chkapsico_ocm2, chkapsico_ocm3, \n" +
"       chkapsico_ocm4, chkapsico_ocm5, chkapsico_ap1, chkapsico_ap2, \n" +
"       chkapsico_ap3, chkapsico_ap4, chkapsico_ap5, chkapsico_td1, chkapsico_td2, \n" +
"       chkapsico_td3, chkapsico_td4, chkapsico_td5, chkapsico_cp1, chkapsico_cp2, \n" +
"       chkapsico_cp3, chkapsico_cp4, chkapsico_cp5, chkapsico_m1, chkapsico_m2, \n" +
"       chkapsico_m3, chkapsico_m4, chkapsico_m5, txtestreslaboral, txtobservaciones, \n" +
"       txtrecomendaciones, apto, noapto \n" +
"                            FROM datos_paciente AS d     \n" +
"                            LEFT JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)     \n" +
"                            LEFT JOIN informe_psicolaboral AS ps ON (ps.n_orden = n.n_orden)  \n" +
"                            WHERE   n.n_orden ="+txtNorden.getText()+";";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombres.setText(oConn.setResult.getString("nombre"));
                    txtDni.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar()))+" AÑOS" );
                    txtExamen.setText(oConn.setResult.getString("nom_examen"));
                    if(txtExamen.getText().equals("PRE-OCUPACIONAL")){
                        txtEstresLaboral.setEnabled(false);
                    }else{
                        txtEstresLaboral.setEnabled(true);
                    }
                    FechaEx.setDate(oConn.setResult.getDate("fecha"));
                    chkR1.setSelected(oConn.setResult.getBoolean("chkr1"));
                    chkR2.setSelected(oConn.setResult.getBoolean("chkr2"));
                    chkR3.setSelected(oConn.setResult.getBoolean("chkr3"));
                    chkR4.setSelected(oConn.setResult.getBoolean("chkr4"));
                    chkR5.setSelected(oConn.setResult.getBoolean("chkr5"));
                    chkM1.setSelected(oConn.setResult.getBoolean("chkm1"));
                    chkM2.setSelected(oConn.setResult.getBoolean("chkm2"));
                    chkM3.setSelected(oConn.setResult.getBoolean("chkm3"));
                    chkM4.setSelected(oConn.setResult.getBoolean("chkm4"));
                    chkM5.setSelected(oConn.setResult.getBoolean("chkm5"));                    
                    chkAC1.setSelected(oConn.setResult.getBoolean("chkac1"));
                    chkAC2.setSelected(oConn.setResult.getBoolean("chkac2"));
                    chkAC3.setSelected(oConn.setResult.getBoolean("chkac3"));
                    chkAC4.setSelected(oConn.setResult.getBoolean("chkac4"));
                    chkAC5.setSelected(oConn.setResult.getBoolean("chkac5"));
                    chkCVM1.setSelected(oConn.setResult.getBoolean("chkcvm1"));
                    chkCVM2.setSelected(oConn.setResult.getBoolean("chkcvm2"));
                    chkCVM3.setSelected(oConn.setResult.getBoolean("chkcvm3"));
                    chkCVM4.setSelected(oConn.setResult.getBoolean("chkcvm4"));
                    chkCVM5.setSelected(oConn.setResult.getBoolean("chkcvm5"));
                    chkOE1.setSelected(oConn.setResult.getBoolean("chkoe1"));
                    chkOE2.setSelected(oConn.setResult.getBoolean("chkoe2"));
                    chkOE3.setSelected(oConn.setResult.getBoolean("chkoe3"));
                    chkOE4.setSelected(oConn.setResult.getBoolean("chkoe4"));
                    chkOE5.setSelected(oConn.setResult.getBoolean("chkoe5"));
                    chkCV1.setSelected(oConn.setResult.getBoolean("chkcv1"));
                    chkCV2.setSelected(oConn.setResult.getBoolean("chkcv2"));
                    chkCV3.setSelected(oConn.setResult.getBoolean("chkcv3"));
                    chkCV4.setSelected(oConn.setResult.getBoolean("chkcv4"));
                    chkCV5.setSelected(oConn.setResult.getBoolean("chkcv5"));
                    chkEE1.setSelected(oConn.setResult.getBoolean("chkee1"));
                    chkEE2.setSelected(oConn.setResult.getBoolean("chkee2"));
                    chkEE3.setSelected(oConn.setResult.getBoolean("chkee3"));
                    chkEE4.setSelected(oConn.setResult.getBoolean("chkee4"));
                    chkEE5.setSelected(oConn.setResult.getBoolean("chkee5"));
                    chkTF1.setSelected(oConn.setResult.getBoolean("chktf1"));
                    chkTF2.setSelected(oConn.setResult.getBoolean("chktf2"));
                    chkTF3.setSelected(oConn.setResult.getBoolean("chktf3"));
                    chkTF4.setSelected(oConn.setResult.getBoolean("chktf4"));
                    chkTF5.setSelected(oConn.setResult.getBoolean("chktf5"));
                    chkAutoes1.setSelected(oConn.setResult.getBoolean("chkautoes1"));
                    chkAutoes2.setSelected(oConn.setResult.getBoolean("chkautoes2"));
                    chkAutoes3.setSelected(oConn.setResult.getBoolean("chkautoes3"));
                    chkAutoes4.setSelected(oConn.setResult.getBoolean("chkautoes4"));
                    chkAutoes5.setSelected(oConn.setResult.getBoolean("chkautoes5"));
                    chkAsert1.setSelected(oConn.setResult.getBoolean("chkasert1"));
                    chkAsert2.setSelected(oConn.setResult.getBoolean("chkasert2"));
                    chkAsert3.setSelected(oConn.setResult.getBoolean("chkasert3"));
                    chkAsert4.setSelected(oConn.setResult.getBoolean("chkasert4"));
                    chkAsert5.setSelected(oConn.setResult.getBoolean("chkasert5"));
                    chkAnsiedadE1.setSelected(oConn.setResult.getBoolean("chkansiedade1"));
                    chkAnsiedadE2.setSelected(oConn.setResult.getBoolean("chkansiedade2"));
                    chkAnsiedadE3.setSelected(oConn.setResult.getBoolean("chkansiedade3"));
                    chkAnsiedadE4.setSelected(oConn.setResult.getBoolean("chkansiedade4"));
                    chkAnsiedadE5.setSelected(oConn.setResult.getBoolean("chkansiedade5"));
                    chkAnsiedadR1.setSelected(oConn.setResult.getBoolean("chkansiedadr1"));
                    chkAnsiedadR2.setSelected(oConn.setResult.getBoolean("chkansiedadr2"));
                    chkAnsiedadR3.setSelected(oConn.setResult.getBoolean("chkansiedadr3"));
                    chkAnsiedadR4.setSelected(oConn.setResult.getBoolean("chkansiedadr4"));
                    chkAnsiedadR5.setSelected(oConn.setResult.getBoolean("chkansiedadr5"));
                    chkCSBajo.setSelected(oConn.setResult.getBoolean("chkcsbajo"));
                    chkCSBajo.setSelected(oConn.setResult.getBoolean("chkcspromedio"));
                    chkCSAlto.setSelected(oConn.setResult.getBoolean("chkcsalto"));
                    txtNivelAlerta.setText(oConn.setResult.getString("txtnivelalerta"));
                    txtSomnolencia.setText(oConn.setResult.getString("txtsomnolencia"));   
                    
                    chkApsico_CI1.setSelected(oConn.setResult.getBoolean("chkapsico_ci1"));
                    chkApsico_CI2.setSelected(oConn.setResult.getBoolean("chkapsico_ci2"));
                    chkApsico_CI3.setSelected(oConn.setResult.getBoolean("chkapsico_ci3"));
                    chkApsico_CI4.setSelected(oConn.setResult.getBoolean("chkapsico_ci4"));
                    chkApsico_CI5.setSelected(oConn.setResult.getBoolean("chkapsico_ci5"));
                    chkApsico_AC1.setSelected(oConn.setResult.getBoolean("chkapsico_ac1"));
                    chkApsico_AC2.setSelected(oConn.setResult.getBoolean("chkapsico_ac2"));
                    chkApsico_AC3.setSelected(oConn.setResult.getBoolean("chkapsico_ac3"));
                    chkApsico_AC4.setSelected(oConn.setResult.getBoolean("chkapsico_ac4"));
                    chkApsico_AC5.setSelected(oConn.setResult.getBoolean("chkapsico_ac5"));
                    chkApsico_TEC1.setSelected(oConn.setResult.getBoolean("chkapsico_tec1"));
                    chkApsico_TEC2.setSelected(oConn.setResult.getBoolean("chkapsico_tec2"));
                    chkApsico_TEC3.setSelected(oConn.setResult.getBoolean("chkapsico_tec3"));
                    chkApsico_TEC4.setSelected(oConn.setResult.getBoolean("chkapsico_tec4"));
                    chkApsico_TEC5.setSelected(oConn.setResult.getBoolean("chkapsico_tec5"));
                    chkApsico_OCM1.setSelected(oConn.setResult.getBoolean("chkapsico_ocm1"));
                    chkApsico_OCM2.setSelected(oConn.setResult.getBoolean("chkapsico_ocm2"));
                    chkApsico_OCM3.setSelected(oConn.setResult.getBoolean("chkapsico_ocm3"));
                    chkApsico_OCM4.setSelected(oConn.setResult.getBoolean("chkapsico_ocm4"));
                    chkApsico_OCM5.setSelected(oConn.setResult.getBoolean("chkapsico_ocm5"));
                    chkApsico_AP1.setSelected(oConn.setResult.getBoolean("chkapsico_ap1"));
                    chkApsico_AP2.setSelected(oConn.setResult.getBoolean("chkapsico_ap2"));
                    chkApsico_AP3.setSelected(oConn.setResult.getBoolean("chkapsico_ap3"));
                    chkApsico_AP4.setSelected(oConn.setResult.getBoolean("chkapsico_ap4"));
                    chkApsico_AP5.setSelected(oConn.setResult.getBoolean("chkapsico_ap5"));
                    chkApsico_TD1.setSelected(oConn.setResult.getBoolean("chkapsico_td1"));
                    chkApsico_TD2.setSelected(oConn.setResult.getBoolean("chkapsico_td2"));
                    chkApsico_TD3.setSelected(oConn.setResult.getBoolean("chkapsico_td3"));
                    chkApsico_TD4.setSelected(oConn.setResult.getBoolean("chkapsico_td4"));
                    chkApsico_TD5.setSelected(oConn.setResult.getBoolean("chkapsico_td5"));
                    chkApsico_CP1.setSelected(oConn.setResult.getBoolean("chkapsico_cp1"));
                    chkApsico_CP2.setSelected(oConn.setResult.getBoolean("chkapsico_cp2"));
                    chkApsico_CP3.setSelected(oConn.setResult.getBoolean("chkapsico_cp3"));
                    chkApsico_CP4.setSelected(oConn.setResult.getBoolean("chkapsico_cp4"));
                    chkApsico_CP5.setSelected(oConn.setResult.getBoolean("chkapsico_cp5"));
                    chkApsico_M1.setSelected(oConn.setResult.getBoolean("chkapsico_m1"));
                    chkApsico_M2.setSelected(oConn.setResult.getBoolean("chkapsico_m2"));
                    chkApsico_M3.setSelected(oConn.setResult.getBoolean("chkapsico_m3"));
                    chkApsico_M4.setSelected(oConn.setResult.getBoolean("chkapsico_m4"));
                    chkApsico_M5.setSelected(oConn.setResult.getBoolean("chkapsico_m5"));
                    txtObservaciones.setText(oConn.setResult.getString("txtestreslaboral"));
                    txtObservaciones.setText(oConn.setResult.getString("txtobservaciones"));
                    txtRecomendaciones.setText(oConn.setResult.getString("txtrecomendaciones"));
                    chkApto.setSelected(oConn.setResult.getBoolean("apto"));
                    chkNoApto.setSelected(oConn.setResult.getBoolean("noapto"));
                    
                    //jTextField9.setText(oConn.setResult.getString("valorigg"));
                }else{
                    oFunc.SubSistemaMensajeError("N° orden no registrado");
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
        print (Integer.parseInt(txtImprimir.getText()));
    }//GEN-LAST:event_txtImprimirActionPerformed

    private void btnImprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir5ActionPerformed
        // TODO add your handling code here:
        print (Integer.parseInt(txtImprimir.getText()));
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
                    Logger.getLogger(InformePsicolaboral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chkCV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCV1ActionPerformed

    private void chkCV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCV2ActionPerformed

    private void chkCV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCV3ActionPerformed

    private void chkCV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCV4ActionPerformed

    private void chkCV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCV5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCV5ActionPerformed

    private void chkEE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEE1ActionPerformed

    private void chkEE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEE2ActionPerformed

    private void chkEE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEE3ActionPerformed

    private void chkEE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEE4ActionPerformed

    private void chkEE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEE5ActionPerformed

    private void chkTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTF1ActionPerformed

    private void chkTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTF2ActionPerformed

    private void chkTF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTF3ActionPerformed

    private void chkTF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTF4ActionPerformed

    private void chkTF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTF5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTF5ActionPerformed

    private void chkAutoes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoes1ActionPerformed

    private void chkAutoes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoes2ActionPerformed

    private void chkAutoes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoes3ActionPerformed

    private void chkAutoes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoes4ActionPerformed

    private void chkAutoes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoes5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoes5ActionPerformed

    private void chkAsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsert1ActionPerformed

    private void chkAsert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsert2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsert2ActionPerformed

    private void chkAsert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsert3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsert3ActionPerformed

    private void chkAsert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsert4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsert4ActionPerformed

    private void chkAsert5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsert5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsert5ActionPerformed

    private void chkAnsiedadE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadE1ActionPerformed

    private void chkAnsiedadE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadE2ActionPerformed

    private void chkAnsiedadE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadE3ActionPerformed

    private void chkAnsiedadE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadE4ActionPerformed

    private void chkAnsiedadE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadE5ActionPerformed

    private void chkAnsiedadR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadR1ActionPerformed

    private void chkAnsiedadR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadR2ActionPerformed

    private void chkAnsiedadR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadR3ActionPerformed

    private void chkAnsiedadR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadR4ActionPerformed

    private void chkAnsiedadR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnsiedadR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnsiedadR5ActionPerformed

    private void chkCSAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCSAltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCSAltoActionPerformed

    private void chkCSPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCSPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCSPromedioActionPerformed

    private void chkCSBajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCSBajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCSBajoActionPerformed

    private void chkApsico_CI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CI1ActionPerformed

    private void chkApsico_CI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CI2ActionPerformed

    private void chkApsico_CI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CI3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CI3ActionPerformed

    private void chkApsico_CI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CI4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CI4ActionPerformed

    private void chkApsico_CI5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CI5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CI5ActionPerformed

    private void chkApsico_AC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AC1ActionPerformed

    private void chkApsico_AC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AC2ActionPerformed

    private void chkApsico_AC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AC3ActionPerformed

    private void chkApsico_AC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AC4ActionPerformed

    private void chkApsico_AC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AC5ActionPerformed

    private void chkApsico_TEC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TEC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TEC1ActionPerformed

    private void chkApsico_TEC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TEC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TEC2ActionPerformed

    private void chkApsico_TEC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TEC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TEC3ActionPerformed

    private void chkApsico_TEC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TEC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TEC4ActionPerformed

    private void chkApsico_TEC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TEC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TEC5ActionPerformed

    private void chkApsico_OCM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_OCM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_OCM1ActionPerformed

    private void chkApsico_OCM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_OCM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_OCM2ActionPerformed

    private void chkApsico_OCM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_OCM3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_OCM3ActionPerformed

    private void chkApsico_OCM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_OCM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_OCM4ActionPerformed

    private void chkApsico_OCM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_OCM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_OCM5ActionPerformed

    private void chkApsico_AP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AP1ActionPerformed

    private void chkApsico_AP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AP2ActionPerformed

    private void chkApsico_AP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AP3ActionPerformed

    private void chkApsico_AP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AP4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AP4ActionPerformed

    private void chkApsico_AP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_AP5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_AP5ActionPerformed

    private void chkApsico_TD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TD1ActionPerformed

    private void chkApsico_TD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TD2ActionPerformed

    private void chkApsico_TD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TD3ActionPerformed

    private void chkApsico_TD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TD4ActionPerformed

    private void chkApsico_TD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_TD5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_TD5ActionPerformed

    private void chkApsico_CP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CP1ActionPerformed

    private void chkApsico_CP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CP2ActionPerformed

    private void chkApsico_CP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CP3ActionPerformed

    private void chkApsico_CP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CP4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CP4ActionPerformed

    private void chkApsico_CP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_CP5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_CP5ActionPerformed

    private void chkApsico_M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_M1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_M1ActionPerformed

    private void chkApsico_M2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_M2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_M2ActionPerformed

    private void chkApsico_M3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_M3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_M3ActionPerformed

    private void chkApsico_M4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_M4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_M4ActionPerformed

    private void chkApsico_M5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkApsico_M5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkApsico_M5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEx;
    private javax.swing.ButtonGroup bgAC;
    private javax.swing.ButtonGroup bgAC1;
    private javax.swing.ButtonGroup bgAP5;
    private javax.swing.ButtonGroup bgAP6;
    private javax.swing.ButtonGroup bgAPSI1;
    private javax.swing.ButtonGroup bgAPSI2;
    private javax.swing.ButtonGroup bgAPSI3;
    private javax.swing.ButtonGroup bgAPSI4;
    private javax.swing.ButtonGroup bgAPSI5;
    private javax.swing.ButtonGroup bgAPSI6;
    private javax.swing.ButtonGroup bgAPSI7;
    private javax.swing.ButtonGroup bgAPSI8;
    private javax.swing.ButtonGroup bgASERTIVIDAD;
    private javax.swing.ButtonGroup bgAUTOESTIMA;
    private javax.swing.ButtonGroup bgCV;
    private javax.swing.ButtonGroup bgCVM;
    private javax.swing.ButtonGroup bgConclusion;
    private javax.swing.ButtonGroup bgEE;
    private javax.swing.ButtonGroup bgM;
    private javax.swing.ButtonGroup bgOE;
    private javax.swing.ButtonGroup bgR;
    private javax.swing.ButtonGroup bgTF;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir5;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkAC1;
    private javax.swing.JCheckBox chkAC2;
    private javax.swing.JCheckBox chkAC3;
    private javax.swing.JCheckBox chkAC4;
    private javax.swing.JCheckBox chkAC5;
    private javax.swing.JCheckBox chkAnsiedadE1;
    private javax.swing.JCheckBox chkAnsiedadE2;
    private javax.swing.JCheckBox chkAnsiedadE3;
    private javax.swing.JCheckBox chkAnsiedadE4;
    private javax.swing.JCheckBox chkAnsiedadE5;
    private javax.swing.JCheckBox chkAnsiedadR1;
    private javax.swing.JCheckBox chkAnsiedadR2;
    private javax.swing.JCheckBox chkAnsiedadR3;
    private javax.swing.JCheckBox chkAnsiedadR4;
    private javax.swing.JCheckBox chkAnsiedadR5;
    private javax.swing.JCheckBox chkApsico_AC1;
    private javax.swing.JCheckBox chkApsico_AC2;
    private javax.swing.JCheckBox chkApsico_AC3;
    private javax.swing.JCheckBox chkApsico_AC4;
    private javax.swing.JCheckBox chkApsico_AC5;
    private javax.swing.JCheckBox chkApsico_AP1;
    private javax.swing.JCheckBox chkApsico_AP2;
    private javax.swing.JCheckBox chkApsico_AP3;
    private javax.swing.JCheckBox chkApsico_AP4;
    private javax.swing.JCheckBox chkApsico_AP5;
    private javax.swing.JCheckBox chkApsico_CI1;
    private javax.swing.JCheckBox chkApsico_CI2;
    private javax.swing.JCheckBox chkApsico_CI3;
    private javax.swing.JCheckBox chkApsico_CI4;
    private javax.swing.JCheckBox chkApsico_CI5;
    private javax.swing.JCheckBox chkApsico_CP1;
    private javax.swing.JCheckBox chkApsico_CP2;
    private javax.swing.JCheckBox chkApsico_CP3;
    private javax.swing.JCheckBox chkApsico_CP4;
    private javax.swing.JCheckBox chkApsico_CP5;
    private javax.swing.JCheckBox chkApsico_M1;
    private javax.swing.JCheckBox chkApsico_M2;
    private javax.swing.JCheckBox chkApsico_M3;
    private javax.swing.JCheckBox chkApsico_M4;
    private javax.swing.JCheckBox chkApsico_M5;
    private javax.swing.JCheckBox chkApsico_OCM1;
    private javax.swing.JCheckBox chkApsico_OCM2;
    private javax.swing.JCheckBox chkApsico_OCM3;
    private javax.swing.JCheckBox chkApsico_OCM4;
    private javax.swing.JCheckBox chkApsico_OCM5;
    private javax.swing.JCheckBox chkApsico_TD1;
    private javax.swing.JCheckBox chkApsico_TD2;
    private javax.swing.JCheckBox chkApsico_TD3;
    private javax.swing.JCheckBox chkApsico_TD4;
    private javax.swing.JCheckBox chkApsico_TD5;
    private javax.swing.JCheckBox chkApsico_TEC1;
    private javax.swing.JCheckBox chkApsico_TEC2;
    private javax.swing.JCheckBox chkApsico_TEC3;
    private javax.swing.JCheckBox chkApsico_TEC4;
    private javax.swing.JCheckBox chkApsico_TEC5;
    private javax.swing.JCheckBox chkApto;
    private javax.swing.JCheckBox chkAsert1;
    private javax.swing.JCheckBox chkAsert2;
    private javax.swing.JCheckBox chkAsert3;
    private javax.swing.JCheckBox chkAsert4;
    private javax.swing.JCheckBox chkAsert5;
    private javax.swing.JCheckBox chkAutoes1;
    private javax.swing.JCheckBox chkAutoes2;
    private javax.swing.JCheckBox chkAutoes3;
    private javax.swing.JCheckBox chkAutoes4;
    private javax.swing.JCheckBox chkAutoes5;
    private javax.swing.JCheckBox chkCSAlto;
    private javax.swing.JCheckBox chkCSBajo;
    private javax.swing.JCheckBox chkCSPromedio;
    private javax.swing.JCheckBox chkCV1;
    private javax.swing.JCheckBox chkCV2;
    private javax.swing.JCheckBox chkCV3;
    private javax.swing.JCheckBox chkCV4;
    private javax.swing.JCheckBox chkCV5;
    private javax.swing.JCheckBox chkCVM1;
    private javax.swing.JCheckBox chkCVM2;
    private javax.swing.JCheckBox chkCVM3;
    private javax.swing.JCheckBox chkCVM4;
    private javax.swing.JCheckBox chkCVM5;
    private javax.swing.JCheckBox chkEE1;
    private javax.swing.JCheckBox chkEE2;
    private javax.swing.JCheckBox chkEE3;
    private javax.swing.JCheckBox chkEE4;
    private javax.swing.JCheckBox chkEE5;
    private javax.swing.JCheckBox chkM1;
    private javax.swing.JCheckBox chkM2;
    private javax.swing.JCheckBox chkM3;
    private javax.swing.JCheckBox chkM4;
    private javax.swing.JCheckBox chkM5;
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
    private javax.swing.JCheckBox chkTF1;
    private javax.swing.JCheckBox chkTF2;
    private javax.swing.JCheckBox chkTF3;
    private javax.swing.JCheckBox chkTF4;
    private javax.swing.JCheckBox chkTF5;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstresLaboral;
    private javax.swing.JTextField txtExamen;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtNivelAlerta;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextArea txtRecomendaciones;
    private javax.swing.JTextField txtSomnolencia;
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
