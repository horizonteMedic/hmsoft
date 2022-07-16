/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class EvaluacionOftalmologica extends javax.swing.JInternalFrame {
        clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   DefaultTableModel model;
    String[]nombres = new String[]{};
    public EvaluacionOftalmologica() {
        initComponents();
        Deshabilitar(true);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgECE1 = new javax.swing.ButtonGroup();
        bgECE2 = new javax.swing.ButtonGroup();
        bgECE3 = new javax.swing.ButtonGroup();
        bgECE4 = new javax.swing.ButtonGroup();
        bgECE5 = new javax.swing.ButtonGroup();
        bgECE6 = new javax.swing.ButtonGroup();
        bgECE7 = new javax.swing.ButtonGroup();
        bgECE8 = new javax.swing.ButtonGroup();
        bgFONormal = new javax.swing.ButtonGroup();
        bgFOAnormal = new javax.swing.ButtonGroup();
        bgCO = new javax.swing.ButtonGroup();
        bgCO_Cerca = new javax.swing.ButtonGroup();
        bgSL = new javax.swing.ButtonGroup();
        bgTEC1 = new javax.swing.ButtonGroup();
        bgTEC2 = new javax.swing.ButtonGroup();
        bgTEC3 = new javax.swing.ButtonGroup();
        bgRefrac = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnEditarAudiom = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtExMedico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtContrata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbECPtosisOD = new javax.swing.JRadioButton();
        rbECPtosisOI = new javax.swing.JRadioButton();
        rbECEstrabismoOD = new javax.swing.JRadioButton();
        rbECEstrabismoOI = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbECConjuntivitisOD = new javax.swing.JRadioButton();
        rbECConjuntivitisOI = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rbECCataratasOD = new javax.swing.JRadioButton();
        rbECCataratasOI = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rbECPterigionOD = new javax.swing.JRadioButton();
        rbECPterigionOI = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtECHallazgos = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        rbECPingueculaOD = new javax.swing.JRadioButton();
        rbECPingueculaOI = new javax.swing.JRadioButton();
        rbECClalacionOI = new javax.swing.JRadioButton();
        rbECClalacionOD = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        rbECOtrosOD = new javax.swing.JRadioButton();
        rbECOtrosOI = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbFONormalOD = new javax.swing.JRadioButton();
        rbFONormalOI = new javax.swing.JRadioButton();
        rbFOAnormalOD = new javax.swing.JRadioButton();
        rbFOAnormalOI = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        txtFOHallazgos = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtCercaSinCorregirOD = new javax.swing.JTextField();
        txtLejosSinCorregirOD = new javax.swing.JTextField();
        txtLejosSinCorregirOI = new javax.swing.JTextField();
        txtCercaSinCorregirOI = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtCercaCorregidaOD = new javax.swing.JTextField();
        txtLejosCorregidaOD = new javax.swing.JTextField();
        txtLejosCorregidaOI = new javax.swing.JTextField();
        txtCercaCorregidaOI = new javax.swing.JTextField();
        txtCercaAgujeroOD = new javax.swing.JTextField();
        txtLejosAgujeroOD = new javax.swing.JTextField();
        txtLejosAgujeroOI = new javax.swing.JTextField();
        txtCercaAgujeroOI = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        txtBinocularSinCorregir = new javax.swing.JTextField();
        txtBinocularCorregida = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtReflejosPupilares = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        rbTECIshihara_normal = new javax.swing.JRadioButton();
        rbTECIshihara_anormal = new javax.swing.JRadioButton();
        rbTECColeres_normal = new javax.swing.JRadioButton();
        rbTECColeres_anormal = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        rbTECEstereopsia_normal = new javax.swing.JRadioButton();
        rbTECEstereopsia_anormal = new javax.swing.JRadioButton();
        txtTECEstereopsia = new javax.swing.JTextField();
        rbTECIshihara_NC = new javax.swing.JRadioButton();
        rbTECColeres_nc = new javax.swing.JRadioButton();
        rbTECEstereopsia_nc = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtPioOD = new javax.swing.JTextField();
        txtPioOI = new javax.swing.JTextField();
        txtPioNA = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        rbCO_si = new javax.swing.JRadioButton();
        rbCO_no = new javax.swing.JRadioButton();
        rbCO_cerca = new javax.swing.JRadioButton();
        rbCO_lejos = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        chkNTCC = new javax.swing.JCheckBox();
        chkNTCL = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        chkRefraccionAplica = new javax.swing.JCheckBox();
        chkRefraccionNoAplica = new javax.swing.JCheckBox();
        jPanel29 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtLejosODSF = new javax.swing.JTextField();
        txtLejosOISF = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txtLejosODCIL = new javax.swing.JTextField();
        txtLejosOICIL = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txtLejosOIEJE = new javax.swing.JTextField();
        txtLejosODEJE = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txtLejosODDIP = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtCercaODSF = new javax.swing.JTextField();
        txtCercaOISF = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        txtCercaODCIL = new javax.swing.JTextField();
        txtCercaOICIL = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtCercaOIEJE = new javax.swing.JTextField();
        txtCercaODEJE = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtCercaODDIP = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        txtAVConRefraccionLejosOD = new javax.swing.JTextField();
        txtAVConRefraccionCercaOD = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        txtAVConRefraccionLejosOI = new javax.swing.JTextField();
        txtAVConRefraccionCercaOI = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        chkINinguna = new javax.swing.JCheckBox();
        chkI2 = new javax.swing.JCheckBox();
        chkI3 = new javax.swing.JCheckBox();
        chkI6 = new javax.swing.JCheckBox();
        chkI7 = new javax.swing.JCheckBox();
        chkI4_cerca = new javax.swing.JCheckBox();
        chkI4_lejos = new javax.swing.JCheckBox();
        chkI5 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        chkR1 = new javax.swing.JCheckBox();
        chkR2_lejos = new javax.swing.JCheckBox();
        chkR2_cerca = new javax.swing.JCheckBox();
        chkR3 = new javax.swing.JCheckBox();
        chkR4 = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtImp = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        setClosable(true);
        setTitle("Evaluación Oftalmológica");
        setToolTipText("");
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

        jLabel1.setText("N° Orden :");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        btnEditarAudiom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarAudiom.setText("Editar");
        btnEditarAudiom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAudiomActionPerformed(evt);
            }
        });

        jLabel7.setText("Ex. Médico :");

        jLabel6.setText("Fecha Ex :");

        jLabel2.setText("DNI :");

        jLabel3.setText("Nombres :");

        jLabel4.setText("Apellidos :");

        jLabel5.setText("Fecha Nac :");

        jLabel8.setText("Contrata :");

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        jLabel9.setText("Empresa :");

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EXAMEN CLÍNICO EXTERNO "));

        jLabel10.setText("Ptosis palpebral ");

        jLabel11.setText("Estrabismo ");

        rbECPtosisOD.setText("OD");

        rbECPtosisOI.setText("OI");

        rbECEstrabismoOD.setText("OD");

        rbECEstrabismoOI.setText("OI");

        jLabel12.setText("Conjuntivitis");

        rbECConjuntivitisOD.setText("OD");

        rbECConjuntivitisOI.setText("OI");

        jLabel13.setText("Cataratas ");

        rbECCataratasOD.setText("OD");

        rbECCataratasOI.setText("OI");

        jLabel14.setText("Pterigion (grado) ");

        rbECPterigionOD.setText("OD");

        rbECPterigionOI.setText("OI");

        jLabel15.setText("Hallazgos(describir):");

        txtECHallazgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtECHallazgosActionPerformed(evt);
            }
        });

        jLabel55.setText("Pinguécula ");

        rbECPingueculaOD.setText("OD");

        rbECPingueculaOI.setText("OI");

        rbECClalacionOI.setText("OI");

        rbECClalacionOD.setText("OD");

        jLabel56.setText("Chalazion ");

        rbECOtrosOD.setText("OD");

        rbECOtrosOI.setText("OI");

        jLabel57.setText("Otros");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtECHallazgos)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(rbECPtosisOD)
                                .addGap(0, 0, 0)
                                .addComponent(rbECPtosisOI))
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addComponent(rbECCataratasOD)
                                    .addGap(0, 0, 0)
                                    .addComponent(rbECCataratasOI))
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addComponent(rbECConjuntivitisOD)
                                    .addGap(0, 0, 0)
                                    .addComponent(rbECConjuntivitisOI)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(rbECEstrabismoOD)
                                .addGap(0, 0, 0)
                                .addComponent(rbECEstrabismoOI)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbECPterigionOD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbECPterigionOI))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addComponent(rbECOtrosOD)
                                            .addGap(0, 0, 0)
                                            .addComponent(rbECOtrosOI))
                                        .addGroup(jPanel23Layout.createSequentialGroup()
                                            .addComponent(rbECClalacionOD)
                                            .addGap(0, 0, 0)
                                            .addComponent(rbECClalacionOI)))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(rbECPingueculaOD)
                                        .addGap(0, 0, 0)
                                        .addComponent(rbECPingueculaOI)))))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECPtosisOD)
                            .addComponent(rbECPtosisOI)
                            .addComponent(jLabel10))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECEstrabismoOD)
                            .addComponent(rbECEstrabismoOI)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECConjuntivitisOD)
                            .addComponent(rbECConjuntivitisOI)
                            .addComponent(jLabel12))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECCataratasOD)
                            .addComponent(rbECCataratasOI)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECPterigionOD)
                            .addComponent(rbECPterigionOI)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECPingueculaOD)
                            .addComponent(rbECPingueculaOI)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECClalacionOD)
                            .addComponent(rbECClalacionOI)
                            .addComponent(jLabel56))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbECOtrosOD)
                            .addComponent(rbECOtrosOI)
                            .addComponent(jLabel57))))
                .addGap(5, 5, 5)
                .addComponent(jLabel15)
                .addGap(2, 2, 2)
                .addComponent(txtECHallazgos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "FONDO DE OJO "));

        jLabel16.setText("Normal ");

        jLabel17.setText("Anormal ");

        rbFONormalOD.setText("OD");

        rbFONormalOI.setText("OI");

        rbFOAnormalOD.setText("OD");

        rbFOAnormalOI.setText("OI");

        jLabel21.setText("Hallazgos:");

        txtFOHallazgos.setText("N/A");
        txtFOHallazgos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFOHallazgosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(rbFONormalOD)
                        .addGap(0, 0, 0)
                        .addComponent(rbFONormalOI)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(rbFOAnormalOD)
                        .addGap(0, 0, 0)
                        .addComponent(rbFOAnormalOI)
                        .addGap(18, 18, 18)
                        .addComponent(txtFOHallazgos)))
                .addGap(10, 10, 10))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFONormalOD)
                    .addComponent(rbFONormalOI)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addGap(0, 0, 0)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFOAnormalOD)
                    .addComponent(rbFOAnormalOI)
                    .addComponent(jLabel17)
                    .addComponent(txtFOHallazgos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exposición Ocupacional"));

        jLabel31.setText("Secreción Ótica ");

        jLabel18.setText("Sin Correctores");

        jLabel19.setText("Con Correctores ");

        jLabel22.setText("O.I");

        jLabel23.setText("O.D");

        jLabel24.setText("O.I");

        jLabel25.setText("O.D");

        jLabel26.setText("Visión de Cerca :");

        jLabel61.setText("Visión de Lejos :");

        txtCercaSinCorregirOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCercaSinCorregirODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCercaSinCorregirODFocusLost(evt);
            }
        });
        txtCercaSinCorregirOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaSinCorregirODActionPerformed(evt);
            }
        });

        txtLejosSinCorregirOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLejosSinCorregirODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLejosSinCorregirODFocusLost(evt);
            }
        });
        txtLejosSinCorregirOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosSinCorregirODActionPerformed(evt);
            }
        });

        txtLejosSinCorregirOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLejosSinCorregirOIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLejosSinCorregirOIFocusLost(evt);
            }
        });
        txtLejosSinCorregirOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosSinCorregirOIActionPerformed(evt);
            }
        });

        txtCercaSinCorregirOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCercaSinCorregirOIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCercaSinCorregirOIFocusLost(evt);
            }
        });
        txtCercaSinCorregirOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaSinCorregirOIActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtCercaCorregidaOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCercaCorregidaODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCercaCorregidaODFocusLost(evt);
            }
        });
        txtCercaCorregidaOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaCorregidaODActionPerformed(evt);
            }
        });

        txtLejosCorregidaOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLejosCorregidaODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLejosCorregidaODFocusLost(evt);
            }
        });
        txtLejosCorregidaOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosCorregidaODActionPerformed(evt);
            }
        });

        txtLejosCorregidaOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLejosCorregidaOIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLejosCorregidaOIFocusLost(evt);
            }
        });
        txtLejosCorregidaOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosCorregidaOIActionPerformed(evt);
            }
        });

        txtCercaCorregidaOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCercaCorregidaOIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCercaCorregidaOIFocusLost(evt);
            }
        });
        txtCercaCorregidaOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaCorregidaOIActionPerformed(evt);
            }
        });

        txtCercaAgujeroOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCercaAgujeroODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCercaAgujeroODFocusLost(evt);
            }
        });
        txtCercaAgujeroOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaAgujeroODActionPerformed(evt);
            }
        });

        txtLejosAgujeroOD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLejosAgujeroODFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLejosAgujeroODFocusLost(evt);
            }
        });
        txtLejosAgujeroOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosAgujeroODActionPerformed(evt);
            }
        });

        txtLejosAgujeroOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLejosAgujeroOIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLejosAgujeroOIFocusLost(evt);
            }
        });
        txtLejosAgujeroOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosAgujeroOIActionPerformed(evt);
            }
        });

        txtCercaAgujeroOI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCercaAgujeroOIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCercaAgujeroOIFocusLost(evt);
            }
        });
        txtCercaAgujeroOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaAgujeroOIActionPerformed(evt);
            }
        });

        jLabel62.setText("O.I");

        jLabel63.setText("O.D");

        jLabel64.setText("Con Agujero Estenopeico");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel65.setText("Binocular (Reev.)");

        txtBinocularSinCorregir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBinocularSinCorregirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBinocularSinCorregirFocusLost(evt);
            }
        });
        txtBinocularSinCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBinocularSinCorregirActionPerformed(evt);
            }
        });

        txtBinocularCorregida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBinocularCorregidaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBinocularCorregidaFocusLost(evt);
            }
        });
        txtBinocularCorregida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBinocularCorregidaActionPerformed(evt);
            }
        });

        jLabel27.setText("Reflejos Pupilares :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBinocularSinCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel24))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel18)))
                        .addGap(10, 10, 10)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtBinocularCorregida))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel22))))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel63)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel62))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLejosAgujeroOD, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCercaAgujeroOD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLejosAgujeroOI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCercaAgujeroOI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel64))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addGap(2, 2, 2))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel64))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(txtCercaCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLejosCorregidaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(txtCercaCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLejosCorregidaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCercaSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLejosSinCorregirOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel61)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(txtCercaSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLejosSinCorregirOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(txtCercaAgujeroOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLejosAgujeroOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(txtCercaAgujeroOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLejosAgujeroOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel63)
                                        .addComponent(jLabel62))
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel22)))
                                .addGap(48, 48, 48)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBinocularSinCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBinocularCorregida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel65))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );

        txtReflejosPupilares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReflejosPupilaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtReflejosPupilares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TEST DE EVALUACIÓN COMPLEMENTARIA "));

        jLabel41.setText("Test de Ishihara (Colores) ");

        jLabel42.setText("Test de Colores Puros (Rojo-Amarillo-Verde) ");

        bgTEC1.add(rbTECIshihara_normal);
        rbTECIshihara_normal.setText("Normal ");

        bgTEC1.add(rbTECIshihara_anormal);
        rbTECIshihara_anormal.setText("Anormal ");

        bgTEC2.add(rbTECColeres_normal);
        rbTECColeres_normal.setText("Normal ");

        bgTEC2.add(rbTECColeres_anormal);
        rbTECColeres_anormal.setText("Anormal ");

        jLabel43.setText("Estereopsia (Test Profundidad) ");

        bgTEC3.add(rbTECEstereopsia_normal);
        rbTECEstereopsia_normal.setText("Normal ");

        bgTEC3.add(rbTECEstereopsia_anormal);
        rbTECEstereopsia_anormal.setText("Anormal ");

        txtTECEstereopsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTECEstereopsiaActionPerformed(evt);
            }
        });

        bgTEC1.add(rbTECIshihara_NC);
        rbTECIshihara_NC.setText("N.C. ");

        bgTEC2.add(rbTECColeres_nc);
        rbTECColeres_nc.setText("N.C. ");

        bgTEC3.add(rbTECEstereopsia_nc);
        rbTECEstereopsia_nc.setText("N.C. ");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTECEstereopsia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(rbTECEstereopsia_normal)
                        .addGap(0, 0, 0)
                        .addComponent(rbTECEstereopsia_anormal)
                        .addGap(0, 0, 0)
                        .addComponent(rbTECEstereopsia_nc))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(rbTECIshihara_normal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTECIshihara_anormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTECIshihara_NC))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(rbTECColeres_normal)
                        .addGap(0, 0, 0)
                        .addComponent(rbTECColeres_anormal)
                        .addGap(0, 0, 0)
                        .addComponent(rbTECColeres_nc)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTECIshihara_normal)
                    .addComponent(rbTECIshihara_anormal)
                    .addComponent(jLabel41)
                    .addComponent(rbTECIshihara_NC))
                .addGap(0, 0, 0)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTECColeres_normal)
                    .addComponent(rbTECColeres_anormal)
                    .addComponent(jLabel42)
                    .addComponent(rbTECColeres_nc))
                .addGap(0, 0, 0)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTECEstereopsia_normal)
                    .addComponent(rbTECEstereopsia_anormal)
                    .addComponent(jLabel43)
                    .addComponent(txtTECEstereopsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTECEstereopsia_nc)))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PIO:"));

        jLabel58.setText("OD");

        jLabel59.setText("OI");

        jLabel60.setText("No Aplica");

        txtPioOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPioODActionPerformed(evt);
            }
        });

        txtPioOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPioOIActionPerformed(evt);
            }
        });

        txtPioNA.setText("X");
        txtPioNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPioNAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPioOI, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPioNA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPioOD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtPioOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtPioOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtPioNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Correctores Oculares "));

        bgCO.add(rbCO_si);
        rbCO_si.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbCO_si.setText("SI");

        bgCO.add(rbCO_no);
        rbCO_no.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbCO_no.setText("NO");

        rbCO_cerca.setText("Cerca");

        rbCO_lejos.setText("Lejos");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Si tiene lentes y no los trajo"));

        chkNTCC.setText("NTCC");

        chkNTCL.setText("NTCL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNTCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkNTCL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chkNTCC)
                .addComponent(chkNTCL))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(rbCO_si)
                .addGap(102, 102, 102)
                .addComponent(rbCO_no)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCO_cerca)
                    .addComponent(rbCO_lejos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel28Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(rbCO_cerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCO_lejos))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCO_si, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbCO_no))
                        .addGap(2, 2, 2)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "REFRACCIÓN "));

        bgRefrac.add(chkRefraccionAplica);
        chkRefraccionAplica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkRefraccionAplica.setText("Aplica ");
        chkRefraccionAplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRefraccionAplicaActionPerformed(evt);
            }
        });

        bgRefrac.add(chkRefraccionNoAplica);
        chkRefraccionNoAplica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkRefraccionNoAplica.setSelected(true);
        chkRefraccionNoAplica.setText("No Aplica");
        chkRefraccionNoAplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRefraccionNoAplicaActionPerformed(evt);
            }
        });

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DE LEJOS"));

        jLabel66.setText("OD");

        jLabel67.setText("OI");

        jLabel104.setText("SF ");

        txtLejosODSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosODSFActionPerformed(evt);
            }
        });

        txtLejosOISF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosOISFActionPerformed(evt);
            }
        });

        jLabel105.setText("CIL. ");

        txtLejosODCIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosODCILActionPerformed(evt);
            }
        });

        txtLejosOICIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosOICILActionPerformed(evt);
            }
        });

        jLabel106.setText("EJE ");

        txtLejosOIEJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosOIEJEActionPerformed(evt);
            }
        });

        txtLejosODEJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosODEJEActionPerformed(evt);
            }
        });

        jLabel107.setText("DIP ");

        txtLejosODDIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLejosODDIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLejosODDIP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLejosODSF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLejosOISF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel104)))
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLejosODCIL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLejosOICIL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel105)))))
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel106))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLejosODEJE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLejosOIEJE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addGap(1, 1, 1)
                        .addComponent(txtLejosODEJE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtLejosOIEJE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addGap(1, 1, 1)
                        .addComponent(txtLejosODCIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtLejosOICIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(txtLejosODSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txtLejosOISF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(txtLejosODDIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DE CERCA"));

        jLabel108.setText("OD");

        jLabel109.setText("OI");

        jLabel110.setText("SF ");

        txtCercaODSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaODSFActionPerformed(evt);
            }
        });

        txtCercaOISF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaOISFActionPerformed(evt);
            }
        });

        jLabel111.setText("CIL. ");

        txtCercaODCIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaODCILActionPerformed(evt);
            }
        });

        txtCercaOICIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaOICILActionPerformed(evt);
            }
        });

        jLabel112.setText("EJE ");

        txtCercaOIEJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaOIEJEActionPerformed(evt);
            }
        });

        txtCercaODEJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaODEJEActionPerformed(evt);
            }
        });

        jLabel113.setText("DIP ");

        txtCercaODDIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaODDIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCercaODDIP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCercaODSF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCercaOISF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel110)))
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCercaODCIL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCercaOICIL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel111)))))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel112))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCercaODEJE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCercaOIEJE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(1, 1, 1)
                        .addComponent(txtCercaODEJE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtCercaOIEJE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addGap(1, 1, 1)
                        .addComponent(txtCercaODCIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtCercaOICIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(txtCercaODSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(txtCercaOISF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(txtCercaODDIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(chkRefraccionAplica)
                        .addGap(18, 18, 18)
                        .addComponent(chkRefraccionNoAplica))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRefraccionAplica)
                    .addComponent(chkRefraccionNoAplica))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("PARTE I", jPanel13);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "AGUDEZA VISUAL FINAL (CON REFRACCIÓN) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel114.setText("De Lejos ");

        jLabel115.setText("De Cerca ");

        jLabel116.setText("OD");

        txtAVConRefraccionLejosOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAVConRefraccionLejosODActionPerformed(evt);
            }
        });

        txtAVConRefraccionCercaOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAVConRefraccionCercaODActionPerformed(evt);
            }
        });

        jLabel117.setText("OI");

        txtAVConRefraccionLejosOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAVConRefraccionLejosOIActionPerformed(evt);
            }
        });

        txtAVConRefraccionCercaOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAVConRefraccionCercaOIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAVConRefraccionLejosOD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAVConRefraccionCercaOD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel116)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel117))
                    .addComponent(txtAVConRefraccionLejosOI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAVConRefraccionCercaOI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel117))
                .addGap(0, 0, 0)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAVConRefraccionLejosOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAVConRefraccionLejosOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114))
                .addGap(20, 20, 20)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAVConRefraccionCercaOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAVConRefraccionCercaOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNÓSTICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(2);
        atxtObservacionesAltura.setViewportView(txtDiagnostico);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INDICACIONES ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        chkINinguna.setText("Ninguna ");

        chkI2.setText("Uso de Correctores Oculares Cerca");

        chkI3.setText("Uso de Correctores Oculares Lejos (Trabajos de Oficina)");

        chkI6.setText("Pterigion III° - IV° ");
        chkI6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkI6ActionPerformed(evt);
            }
        });

        chkI7.setText("Otras");

        chkI4_cerca.setText("Control complementario por Oftalmología : Lentes correctores - Cerca");

        chkI4_lejos.setText("Control complementario por Oftalmología : Lentes correctores - Lejos");

        chkI5.setText("Lentes: Cambio de Lunas ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkINinguna)
                    .addComponent(chkI2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkI3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkI5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkI6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkI7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkI4_cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkI4_lejos, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(chkINinguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkI2)
                .addGap(0, 0, 0)
                .addComponent(chkI3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkI4_cerca)
                .addGap(0, 0, 0)
                .addComponent(chkI4_lejos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkI5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkI6)
                .addGap(0, 0, 0)
                .addComponent(chkI7))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESTRICCIONES (Aplican al entorno laboral) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        chkR1.setText("No restringe actividades labores en el puesto de trabajo ");

        chkR2_lejos.setText("Uso de Correctores Oculares - Lejos");

        chkR2_cerca.setText("Uso de Correctores Oculares - Cerca (Trabajos de Oficina)");

        chkR3.setText("No trabajos con cables eléctricos ni fibra óptica");

        chkR4.setText("No conducción vehicular");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkR1)
                    .addComponent(chkR2_lejos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkR2_cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkR4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkR3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(chkR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkR2_lejos)
                .addGap(3, 3, 3)
                .addComponent(chkR2_cerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkR3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkR4)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(179, 179, 179)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("PARTE II", jPanel1);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGuardar.setMnemonic('g');
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir"));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtImp, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarAudiom)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(419, 419, 419))
                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))))
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addGap(74, 74, 74)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarAudiom)
                        .addComponent(txtExMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel6)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel1)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel5)
                        .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar))
                        .addContainerGap())
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
             
        if(!txtNumero.getText().isEmpty()){
            if(!OrdenExiste()){
            String Sql="SELECT datos_paciente.cod_pa, "
                    + "datos_paciente.nombres_pa, "
                    + "datos_paciente.fecha_nacimiento_pa, "
                    + "datos_paciente.apellidos_pa, "
                    + "datos_paciente.sexo_pa, "
                    + "n_orden_ocupacional.razon_empresa, "
                    + "n_orden_ocupacional.cargo_de, "
                    + "n_orden_ocupacional.razon_contrata, "
                    + "n_orden_ocupacional.nom_examen "
                    + "FROM datos_paciente, n_orden_ocupacional "
                    + "WHERE datos_paciente.cod_pa  = n_orden_ocupacional.cod_pa "
                    + "AND n_orden_ocupacional.n_orden='"+txtNumero.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtExMedico.setText(oConn.setResult.getString("nom_examen"));
                        txtNumero.setEnabled(false);
                        cargarDefecto();
                        Fecha();
                        muestraVisual();
                        txtECHallazgos.requestFocus();
                     
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro en Oftalmologia");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Evaluación Oftalmologica:" + ex.getMessage().toString());
        } }}

    }//GEN-LAST:event_txtNumeroActionPerformed
    public void cargarDefecto(){
        
        
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNumero.requestFocusInWindow();
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnEditarAudiomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAudiomActionPerformed
        if(!txtNumero.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, "
                    + "d.nombres_pa, "
                    + "d.fecha_nacimiento_pa, "
                    + "d.apellidos_pa, "
                    + "d.sexo_pa, "
                    + "n.razon_empresa, "
                    + "n.cargo_de, "
                    + "n.razon_contrata, "
                    + "n.nom_examen,"
                    + "o.fecha_of, o.rbecptosisod, o.rbecptosisoi, o.rbecestrabismood, \n" +
"       o.rbecestrabismooi, o.rbecconjuntivitisod, o.rbecconjuntivitisoi, o.rbeccataratasod, \n" +
"       o.rbeccataratasoi, o.rbecpterigionod, o.rbecpterigionoi, o.rbecpingueculaod, \n" +
"       o.rbecpingueculaoi, o.rbecclalacionod, o.rbecclalacionoi, o.rbecotrosod, \n" +
"       o.rbecotrosoi, o.txtechallazgos, o.rbfonormalod, o.rbfonormaloi, o.rbfoanormalod, \n" +
"       o.rbfoanormaloi, o.txtfohallazgos, o.txtpiood, o.txtpiooi, o.txtpiona, \n" +
"       o.rbco_si, o.rbco_no, o.rbco_cerca, o.rbco_lejos, o.chkntcc, o.chkntcl, o.txtcercasincorregirod, \n" +
"       o.txtcercasincorregiroi, o.txtlejossincorregirod, o.txtlejossincorregiroi, \n" +
"       o.txtcercacorregidaod, o.txtcercacorregidaoi, o.txtlejoscorregidaod, \n" +
"       o.txtlejoscorregidaoi, o.txtcercaagujerood, o.txtcercaagujerooi, o.txtlejosagujerood, \n" +
"       o.txtlejosagujerooi, o.txtbinocularsincorregir, o.txtbinocularcorregida, \n" +
"       o.rbtecishihara_normal, o.rbtecishihara_anormal, o.rbtecishihara_nc, \n" +
"       o.rbteccoleres_normal, o.rbteccoleres_anormal, o.rbteccoleres_nc, o.txttecestereopsia, \n" +
"       o.rbtecestereopsia_normal, o.rbtecestereopsia_anormal, o.rbtecestereopsia_nc, \n" +
"       o.chkrefraccionaplica, o.chkrefraccionnoaplica, o.txtlejosodsf, o.txtlejosodcil, \n" +
"       o.txtlejosodeje, o.txtlejosoisf, o.txtlejosoicil, o.txtlejosoieje, o.txtlejosoddip, \n" +
"       o.txtcercaodsf, o.txtcercaodcil, o.txtcercaodeje, o.txtcercaoisf, o.txtcercaoicil, \n" +
"       o.txtcercaoieje, o.txtcercaoddip, o.txtavconrefraccionlejosod, o.txtavconrefraccionlejosoi, \n" +
"       o.txtavconrefraccioncercaod, o.txtavconrefraccioncercaoi, o.txtdiagnostico, \n" +
"       o.chkininguna, o.chki2, o.chki3, o.chki4_cerca, o.chki4_lejos, o.chki5, o.chki6, \n" +
"       o.chki7, o.chkr1, o.chkr2_lejos, o.chkr2_cerca, o.chkr3, o.chkr4,o.txtrp "
                    + "FROM datos_paciente as d "
                    +"INNER JOIN n_orden_ocupacional as n ON (d.cod_pa  = n.cod_pa )"
                    +"INNER JOIN oftalmologia2021 as o ON (n.n_orden = o.n_orden)"
                    + "WHERE o.n_orden='"+txtNumero.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));                        
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtExMedico.setText(oConn.setResult.getString("nom_examen"));
                        Fecha.setDate(oConn.setResult.getDate("fecha_of"));
                        rbECPtosisOD.setSelected(oConn.setResult.getBoolean("rbecptosisod"));
                        rbECPtosisOI.setSelected(oConn.setResult.getBoolean("rbecptosisoi"));
                        rbECEstrabismoOD.setSelected(oConn.setResult.getBoolean("rbecestrabismood"));
                        rbECEstrabismoOI.setSelected(oConn.setResult.getBoolean("rbecestrabismooi"));
                        rbECConjuntivitisOD.setSelected(oConn.setResult.getBoolean("rbecconjuntivitisod"));
                        rbECConjuntivitisOI.setSelected(oConn.setResult.getBoolean("rbecconjuntivitisoi"));
                        rbECCataratasOD.setSelected(oConn.setResult.getBoolean("rbeccataratasod"));
                        rbECCataratasOI.setSelected(oConn.setResult.getBoolean("rbeccataratasoi"));
                        rbECPterigionOD.setSelected(oConn.setResult.getBoolean("rbecpterigionod"));
                        rbECPterigionOI.setSelected(oConn.setResult.getBoolean("rbecpterigionoi"));
                        rbECPingueculaOD.setSelected(oConn.setResult.getBoolean("rbecpingueculaod"));
                        rbECPingueculaOI.setSelected(oConn.setResult.getBoolean("rbecpingueculaoi"));
                        rbECClalacionOD.setSelected(oConn.setResult.getBoolean("rbecclalacionod"));
                        rbECClalacionOI.setSelected(oConn.setResult.getBoolean("rbecclalacionoi"));
                        rbECOtrosOD.setSelected(oConn.setResult.getBoolean("rbecotrosod"));
                        rbECOtrosOI.setSelected(oConn.setResult.getBoolean("rbecotrosoi"));
                        txtECHallazgos.setText(oConn.setResult.getString("txtechallazgos"));
                        rbFONormalOD.setSelected(oConn.setResult.getBoolean("rbfonormalod"));
                        rbFONormalOI.setSelected(oConn.setResult.getBoolean("rbfonormaloi"));
                        rbFOAnormalOD.setSelected(oConn.setResult.getBoolean("rbfoanormalod"));
                        rbFOAnormalOI.setSelected(oConn.setResult.getBoolean("rbfoanormaloi"));
                        txtFOHallazgos.setText(oConn.setResult.getString("txtfohallazgos"));
                        txtPioOD.setText(oConn.setResult.getString("txtpiood"));
                        txtPioOI.setText(oConn.setResult.getString("txtpiooi"));
                        txtPioNA.setText(oConn.setResult.getString("txtpiona"));
                        rbCO_si.setSelected(oConn.setResult.getBoolean("rbco_si"));
                        rbCO_no.setSelected(oConn.setResult.getBoolean("rbco_no"));
                        rbCO_cerca.setSelected(oConn.setResult.getBoolean("rbco_cerca"));
                        rbCO_lejos.setSelected(oConn.setResult.getBoolean("rbco_lejos"));
                        chkNTCC.setSelected(oConn.setResult.getBoolean("chkntcc"));
                        chkNTCL.setSelected(oConn.setResult.getBoolean("chkntcl"));
                        txtCercaSinCorregirOD.setText(oConn.setResult.getString("txtcercasincorregirod"));
                        txtCercaSinCorregirOI.setText(oConn.setResult.getString("txtcercasincorregiroi"));
                        txtLejosSinCorregirOD.setText(oConn.setResult.getString("txtlejossincorregirod"));
                        txtLejosSinCorregirOI.setText(oConn.setResult.getString("txtlejossincorregiroi"));
                        txtCercaCorregidaOD.setText(oConn.setResult.getString("txtcercacorregidaod"));
                        txtCercaCorregidaOI.setText(oConn.setResult.getString("txtcercacorregidaoi"));
                        txtLejosCorregidaOD.setText(oConn.setResult.getString("txtlejoscorregidaod"));
                        txtLejosCorregidaOI.setText(oConn.setResult.getString("txtlejoscorregidaoi"));
                        txtCercaAgujeroOD.setText(oConn.setResult.getString("txtcercaagujerood"));
                        txtCercaAgujeroOI.setText(oConn.setResult.getString("txtcercaagujerooi"));
                        txtLejosAgujeroOD.setText(oConn.setResult.getString("txtlejosagujerood"));
                        txtLejosAgujeroOI.setText(oConn.setResult.getString("txtlejosagujerooi"));
                        txtBinocularSinCorregir.setText(oConn.setResult.getString("txtbinocularsincorregir"));
                        txtBinocularCorregida.setText(oConn.setResult.getString("txtbinocularcorregida"));
                        rbTECIshihara_normal.setSelected(oConn.setResult.getBoolean("rbtecishihara_normal"));
                        rbTECIshihara_anormal.setSelected(oConn.setResult.getBoolean("rbtecishihara_anormal"));
                        rbTECIshihara_NC.setSelected(oConn.setResult.getBoolean("rbtecishihara_nc"));
                        rbTECColeres_normal.setSelected(oConn.setResult.getBoolean("rbteccoleres_normal"));
                        rbTECColeres_anormal.setSelected(oConn.setResult.getBoolean("rbteccoleres_anormal"));
                        rbTECColeres_nc.setSelected(oConn.setResult.getBoolean("rbteccoleres_nc"));
                        txtTECEstereopsia.setText(oConn.setResult.getString("txttecestereopsia"));
                        rbTECEstereopsia_normal.setSelected(oConn.setResult.getBoolean("rbtecestereopsia_normal"));
                        rbTECEstereopsia_anormal.setSelected(oConn.setResult.getBoolean("rbtecestereopsia_anormal"));
                        rbTECEstereopsia_nc.setSelected(oConn.setResult.getBoolean("rbtecestereopsia_nc"));
                        chkRefraccionAplica.setSelected(oConn.setResult.getBoolean("chkrefraccionaplica"));
                        chkRefraccionNoAplica.setSelected(oConn.setResult.getBoolean("chkrefraccionnoaplica"));
                        txtLejosODSF.setText(oConn.setResult.getString("txtlejosodsf"));
                        txtLejosODCIL.setText(oConn.setResult.getString("txtlejosodcil"));
                        txtLejosODEJE.setText(oConn.setResult.getString("txtlejosodeje"));
                        txtLejosOISF.setText(oConn.setResult.getString("txtlejosoisf"));
                        txtLejosOICIL.setText(oConn.setResult.getString("txtlejosoicil"));
                        txtLejosOIEJE.setText(oConn.setResult.getString("txtlejosoieje"));
                        txtLejosODDIP.setText(oConn.setResult.getString("txtlejosoddip"));
                        
                        txtCercaODSF.setText(oConn.setResult.getString("txtcercaodsf"));
                        txtCercaODCIL.setText(oConn.setResult.getString("txtcercaodcil"));
                        txtCercaODEJE.setText(oConn.setResult.getString("txtcercaodeje"));
                        txtCercaOISF.setText(oConn.setResult.getString("txtcercaoisf"));
                        txtCercaOICIL.setText(oConn.setResult.getString("txtcercaoicil"));
                        txtCercaOIEJE.setText(oConn.setResult.getString("txtcercaoieje"));
                        txtCercaODDIP.setText(oConn.setResult.getString("txtcercaoddip"));
                        
                        txtAVConRefraccionLejosOD.setText(oConn.setResult.getString("txtavconrefraccionlejosod"));
                        txtAVConRefraccionLejosOI.setText(oConn.setResult.getString("txtavconrefraccionlejosoi"));
                        txtAVConRefraccionCercaOD.setText(oConn.setResult.getString("txtavconrefraccioncercaod"));
                        txtAVConRefraccionCercaOI.setText(oConn.setResult.getString("txtavconrefraccioncercaoi"));
                        txtDiagnostico.setText(oConn.setResult.getString("txtdiagnostico"));  
                        chkINinguna.setSelected(oConn.setResult.getBoolean("chkininguna"));
                        chkI2.setSelected(oConn.setResult.getBoolean("chki2"));
                        chkI3.setSelected(oConn.setResult.getBoolean("chki3"));
                        chkI4_cerca.setSelected(oConn.setResult.getBoolean("chki4_cerca"));
                        chkI4_lejos.setSelected(oConn.setResult.getBoolean("chki4_lejos"));
                        chkI5.setSelected(oConn.setResult.getBoolean("chki5"));
                        chkI6.setSelected(oConn.setResult.getBoolean("chki6"));
                        chkI7.setSelected(oConn.setResult.getBoolean("chki7"));
                        
                        chkR1.setSelected(oConn.setResult.getBoolean("chkr1"));
                        chkR2_lejos.setSelected(oConn.setResult.getBoolean("chkr2_lejos"));
                        chkR2_cerca.setSelected(oConn.setResult.getBoolean("chkr2_cerca"));
                        chkR3.setSelected(oConn.setResult.getBoolean("chkr3"));
                        chkR4.setSelected(oConn.setResult.getBoolean("chkr4"));
                        txtReflejosPupilares.setText(oConn.setResult.getString("txtrp"));
                        btnGuardar.setEnabled(false);
                        oConn.setResult.close();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometria:" + ex.getMessage().toString());
        } 
       }
    }//GEN-LAST:event_btnEditarAudiomActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String sCodigo=txtNumero.getText();
        String strSqlStmt;
        String Query ;
        
        if(validar()){
            strSqlStmt="UPDATE oftalmologia2021 ";
            Query="SET ";
            if (((JTextField)Fecha.getDateEditor().getUiComponent()).getText().trim().length()> 1 )
              {Query+= "fecha_of='"+Fecha.getDate().toString()+ "'";}
            Query += ",rbecptosisod='"+rbECPtosisOD.isSelected()+ "'";
            Query += ",rbecptosisoi='"+rbECPtosisOI.isSelected()+ "'";
            Query += ",rbecestrabismood='"+rbECEstrabismoOD.isSelected()+ "'";
            Query += ",rbecestrabismooi='"+rbECEstrabismoOI.isSelected()+ "'";
            Query += ",rbecconjuntivitisod='"+rbECConjuntivitisOD.isSelected()+ "'";
            Query += ",rbecconjuntivitisoi='"+rbECConjuntivitisOI.isSelected()+ "'";
            Query += ",rbeccataratasod='"+rbECCataratasOD.isSelected()+ "'";
            Query += ",rbeccataratasoi='"+rbECCataratasOI.isSelected()+ "'";
            Query += ",rbecpterigionod='"+rbECPterigionOD.isSelected()+ "'";
            Query += ",rbecpterigionoi='"+rbECPterigionOI.isSelected()+ "'";
            Query += ",rbecpingueculaod='"+rbECPingueculaOD.isSelected()+ "'";
            Query += ",rbecpingueculaoi='"+rbECPingueculaOI.isSelected()+ "'";
            Query += ",rbecclalacionod='"+rbECClalacionOD.isSelected()+ "'";
            Query += ",rbecclalacionoi='"+rbECClalacionOI.isSelected()+ "'";
            Query += ",rbecotrosod='"+rbECOtrosOD.isSelected()+ "'";
            Query += ",rbecotrosoi='"+rbECOtrosOI.isSelected()+ "'";
            Query += ",txtechallazgos='"+txtECHallazgos.getText()+ "'";
            Query += ",rbfonormalod='"+rbFONormalOD.isSelected()+ "'";
            Query += ",rbfonormaloi='"+rbFONormalOI.isSelected()+ "'";
            Query += ",rbfoanormalod='"+rbFOAnormalOD.isSelected()+ "'";
            Query += ",rbfoanormaloi='"+rbFOAnormalOI.isSelected()+ "'";
            Query += ",txtfohallazgos='"+txtFOHallazgos.getText()+ "'";
            Query += ",txtpiood='"+txtPioOD.getText()+ "'";
            Query += ",txtpiooi='"+txtPioOI.getText()+ "'";
            Query += ",txtpiona='"+txtPioNA.getText()+ "'";
            Query += ",rbco_si='"+rbCO_si.isSelected()+ "'";
            Query += ",rbco_no='"+rbCO_no.isSelected()+ "'";
            Query += ",rbco_cerca='"+rbCO_cerca.isSelected()+ "'";
            Query += ",rbco_lejos='"+rbCO_lejos.isSelected()+ "'";
            Query += ",chkntcc='"+chkNTCC.isSelected()+ "'";
            Query += ",chkntcl='"+chkNTCL.isSelected()+ "'";
            
            Query += ",txtcercasincorregirod='"+txtCercaSinCorregirOD.getText()+ "'";
            Query += ",txtcercasincorregiroi='"+txtCercaSinCorregirOI.getText()+ "'";
            Query += ",txtlejossincorregirod='"+txtLejosSinCorregirOD.getText()+ "'";
            Query += ",txtlejossincorregiroi='"+txtLejosSinCorregirOI.getText()+ "'";
            
            Query += ",txtcercacorregidaod='"+txtCercaCorregidaOD.getText()+ "'";
            Query += ",txtcercacorregidaoi='"+txtCercaCorregidaOI.getText()+ "'";
            Query += ",txtlejoscorregidaod='"+txtLejosCorregidaOD.getText()+ "'";
            Query += ",txtlejoscorregidaoi='"+txtLejosCorregidaOI.getText()+ "'";
            
            Query += ",txtcercaagujerood='"+txtCercaAgujeroOD.getText()+ "'";
            Query += ",txtcercaagujerooi='"+txtCercaAgujeroOI.getText()+ "'";
            Query += ",txtlejosagujerood='"+txtLejosAgujeroOD.getText()+ "'";
            Query += ",txtlejosagujerooi='"+txtLejosAgujeroOI.getText()+ "'";
            
            Query += ",txtbinocularsincorregir='"+txtBinocularSinCorregir.getText()+ "'";
            Query += ",txtbinocularcorregida='"+txtBinocularCorregida.getText()+ "'";
            
            Query += ",rbtecishihara_normal='"+rbTECIshihara_normal.isSelected()+ "'";
            Query += ",rbtecishihara_anormal='"+rbTECIshihara_anormal.isSelected()+ "'";
            Query += ",rbtecishihara_nc='"+rbTECIshihara_NC.isSelected()+ "'";
            
            Query += ",rbteccoleres_normal='"+rbTECColeres_normal.isSelected()+ "'";
            Query += ",rbteccoleres_anormal='"+rbTECColeres_anormal.isSelected()+ "'";
            Query += ",rbteccoleres_nc='"+rbTECColeres_nc.isSelected()+ "'";
            
            Query += ",txttecestereopsia='"+txtTECEstereopsia.getText()+ "'";
            Query += ",rbtecestereopsia_normal='"+rbTECEstereopsia_normal.isSelected()+ "'";
            Query += ",rbtecestereopsia_anormal='"+rbTECEstereopsia_anormal.isSelected()+ "'";
            Query += ",rbtecestereopsia_nc='"+rbTECEstereopsia_nc.isSelected()+ "'";
            
            Query += ",chkrefraccionaplica='"+chkRefraccionAplica.isSelected()+ "'";
            Query += ",chkrefraccionnoaplica='"+chkRefraccionNoAplica.isSelected()+ "'";
            
            Query += ",txtlejosodsf='"+txtLejosODSF.getText()+ "'";
            Query += ",txtlejosodcil='"+txtLejosODCIL.getText()+ "'";
            Query += ",txtlejosodeje='"+txtLejosODEJE.getText()+ "'";
            
            Query += ",txtlejosoisf='"+txtLejosOISF.getText()+ "'";
            Query += ",txtlejosoicil='"+txtLejosOICIL.getText()+ "'";
            Query += ",txtlejosoieje='"+txtLejosOIEJE.getText()+ "'";
            
            Query += ",txtlejosoddip='"+txtLejosODDIP.getText()+ "'";
            
            Query += ",txtcercaodsf='"+txtCercaODSF.getText()+ "'";
            Query += ",txtcercaodcil='"+txtCercaOICIL.getText()+ "'";
            Query += ",txtcercaodeje='"+txtCercaODEJE.getText()+ "'";
            
            Query += ",txtcercaoisf='"+txtCercaOISF.getText()+ "'";
             Query += ",txtcercaoicil='"+txtCercaOICIL.getText()+ "'";
            Query += ",txtcercaoieje='"+txtCercaOIEJE.getText()+ "'";
            
            Query += ",txtcercaoddip='"+txtCercaODDIP.getText()+ "'";
            
            Query += ",txtavconrefraccionlejosod='"+txtAVConRefraccionLejosOD.getText()+ "'";
            Query += ",txtavconrefraccionlejosoi='"+txtAVConRefraccionLejosOI.getText()+ "'";
            Query += ",txtavconrefraccioncercaod='"+txtAVConRefraccionCercaOD.getText()+ "'";
            Query += ",txtavconrefraccioncercaoi='"+txtAVConRefraccionCercaOI.getText()+ "'";
            Query += ",txtdiagnostico='"+txtDiagnostico.getText()+ "'";
            
            Query += ",chkininguna='"+chkINinguna.isSelected()+ "'";
            Query += ",chki2='"+chkI2.isSelected()+ "'";
            Query += ",chki3='"+chkI3.isSelected()+ "'";
            
            Query += ",chki4_cerca='"+chkI4_cerca.isSelected()+ "'";
            Query += ",chki4_lejos='"+chkI4_lejos.isSelected()+ "'";
            Query += ",chki5='"+chkI5.isSelected()+ "'";
            Query += ",chki6='"+chkI6.isSelected()+ "'";
            Query += ",chki7='"+chkI7.isSelected()+ "'";
            
            Query += ",chkr1='"+chkR1.isSelected()+ "'";
            Query += ",chkr2_lejos='"+chkR2_lejos.isSelected()+ "'";
            Query += ",chkr2_cerca='"+chkR2_cerca.isSelected()+ "'";
            Query += ",chkr3='"+chkR3.isSelected()+ "'";
            Query += ",chkr4='"+chkR4.isSelected()+ "'";
            Query += ",txtrp='"+txtReflejosPupilares.getText()+ "'";
            Query +=" WHERE n_orden='" + sCodigo + "'";
           
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
          
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                imprimir1();
                Limpiar();  
            }else{
                oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
            }
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EvaluacionMusculoEsqueletica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            oFunc.SubSistemaMensajeError("COMPLETAR DATOS");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(validar()){
            if(!txtNumero.getText().isEmpty()){
                if (oFunc.fnIntSistemaPregunta("Desea realmente Agregar el Registro")==JOptionPane.YES_OPTION){
                    //datosGrafico();

                    Agregar();

                }}else{oFunc.SubSistemaMensajeError("Llene los campos");
                }
            }else{oFunc.SubSistemaMensajeError("Llene los campos o Falta Diagnostico");}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Deshabilitar(true);
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ReImp();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtCercaSinCorregirODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirODFocusGained
        txtCercaSinCorregirOD.setText(null);
    }//GEN-LAST:event_txtCercaSinCorregirODFocusGained

    private void txtCercaSinCorregirODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirODFocusLost
        if (txtCercaSinCorregirOD.getText().isEmpty()) {
            txtCercaSinCorregirOD.setText("00");

        }
    }//GEN-LAST:event_txtCercaSinCorregirODFocusLost

    private void txtCercaSinCorregirODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirODActionPerformed
        txtCercaSinCorregirOI.requestFocus();
    }//GEN-LAST:event_txtCercaSinCorregirODActionPerformed

    private void txtLejosSinCorregirODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosSinCorregirODFocusGained
        txtLejosSinCorregirOD.setText(null);
    }//GEN-LAST:event_txtLejosSinCorregirODFocusGained

    private void txtLejosSinCorregirODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosSinCorregirODFocusLost
        if (txtLejosSinCorregirOD.getText().isEmpty()) {
            txtLejosSinCorregirOD.setText("00");

        }
    }//GEN-LAST:event_txtLejosSinCorregirODFocusLost

    private void txtLejosSinCorregirODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosSinCorregirODActionPerformed
        txtLejosSinCorregirOI.requestFocus();
    }//GEN-LAST:event_txtLejosSinCorregirODActionPerformed

    private void txtLejosSinCorregirOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosSinCorregirOIFocusGained
        txtLejosSinCorregirOI.setText(null);
    }//GEN-LAST:event_txtLejosSinCorregirOIFocusGained

    private void txtLejosSinCorregirOIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosSinCorregirOIFocusLost
        if (txtLejosSinCorregirOI.getText().isEmpty()) {
            txtLejosSinCorregirOI.setText("00");

        }
    }//GEN-LAST:event_txtLejosSinCorregirOIFocusLost

    private void txtLejosSinCorregirOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosSinCorregirOIActionPerformed
        txtCercaCorregidaOD.requestFocus();
    }//GEN-LAST:event_txtLejosSinCorregirOIActionPerformed

    private void txtCercaSinCorregirOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirOIFocusGained
        txtCercaSinCorregirOI.setText(null);
    }//GEN-LAST:event_txtCercaSinCorregirOIFocusGained

    private void txtCercaSinCorregirOIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirOIFocusLost
        if (txtCercaSinCorregirOI.getText().isEmpty()) {
            txtCercaSinCorregirOI.setText("00");

        }
    }//GEN-LAST:event_txtCercaSinCorregirOIFocusLost

    private void txtCercaSinCorregirOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaSinCorregirOIActionPerformed
        txtLejosSinCorregirOD.requestFocus();
    }//GEN-LAST:event_txtCercaSinCorregirOIActionPerformed

    private void txtCercaCorregidaODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaCorregidaODFocusGained
        txtCercaCorregidaOD.setText(null);
    }//GEN-LAST:event_txtCercaCorregidaODFocusGained

    private void txtCercaCorregidaODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaCorregidaODFocusLost
        if (txtCercaCorregidaOD.getText().isEmpty()) {
            txtCercaCorregidaOD.setText("00");

        }
    }//GEN-LAST:event_txtCercaCorregidaODFocusLost

    private void txtCercaCorregidaODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaCorregidaODActionPerformed
        txtCercaCorregidaOI.requestFocus();
    }//GEN-LAST:event_txtCercaCorregidaODActionPerformed

    private void txtLejosCorregidaODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosCorregidaODFocusGained
        txtLejosCorregidaOD.setText(null);
    }//GEN-LAST:event_txtLejosCorregidaODFocusGained

    private void txtLejosCorregidaODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosCorregidaODFocusLost
        if (txtLejosCorregidaOD.getText().isEmpty()) {
            txtLejosCorregidaOD.setText("00");

        }
    }//GEN-LAST:event_txtLejosCorregidaODFocusLost

    private void txtLejosCorregidaODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosCorregidaODActionPerformed
        txtLejosCorregidaOI.requestFocus();
    }//GEN-LAST:event_txtLejosCorregidaODActionPerformed

    private void txtLejosCorregidaOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosCorregidaOIFocusGained
        txtLejosCorregidaOI.setText(null);
    }//GEN-LAST:event_txtLejosCorregidaOIFocusGained

    private void txtLejosCorregidaOIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosCorregidaOIFocusLost
        if (txtLejosCorregidaOI.getText().isEmpty()) {
            txtLejosCorregidaOI.setText("00");
        }
    }//GEN-LAST:event_txtLejosCorregidaOIFocusLost

    private void txtLejosCorregidaOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosCorregidaOIActionPerformed
        txtCercaAgujeroOD.requestFocus();
    }//GEN-LAST:event_txtLejosCorregidaOIActionPerformed

    private void txtCercaCorregidaOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaCorregidaOIFocusGained
        txtCercaCorregidaOI.setText(null);
    }//GEN-LAST:event_txtCercaCorregidaOIFocusGained

    private void txtCercaCorregidaOIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaCorregidaOIFocusLost
        if (txtCercaCorregidaOI.getText().isEmpty()) {
            txtCercaCorregidaOI.setText("00");
        }
    }//GEN-LAST:event_txtCercaCorregidaOIFocusLost

    private void txtCercaCorregidaOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaCorregidaOIActionPerformed
        txtLejosCorregidaOD.requestFocus();
    }//GEN-LAST:event_txtCercaCorregidaOIActionPerformed

    private void txtCercaAgujeroODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaAgujeroODFocusGained
        // TODO add your handling code here:
        txtCercaAgujeroOD.setText(null);
    }//GEN-LAST:event_txtCercaAgujeroODFocusGained

    private void txtCercaAgujeroODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaAgujeroODFocusLost
        // TODO add your handling code here:
        if (txtCercaAgujeroOD.getText().isEmpty()) {
            txtCercaAgujeroOD.setText("00");

        }
    }//GEN-LAST:event_txtCercaAgujeroODFocusLost

    private void txtCercaAgujeroODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaAgujeroODActionPerformed
        // TODO add your handling code here:
        txtCercaAgujeroOI.requestFocus();
    }//GEN-LAST:event_txtCercaAgujeroODActionPerformed

    private void txtLejosAgujeroODFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosAgujeroODFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLejosAgujeroODFocusGained

    private void txtLejosAgujeroODFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosAgujeroODFocusLost
        // TODO add your handling code here:
        if (txtLejosAgujeroOD.getText().isEmpty()) {
            txtLejosAgujeroOD.setText("00");
        }
    }//GEN-LAST:event_txtLejosAgujeroODFocusLost

    private void txtLejosAgujeroODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosAgujeroODActionPerformed
        // TODO add your handling code here:
        txtLejosAgujeroOI.requestFocus();
    }//GEN-LAST:event_txtLejosAgujeroODActionPerformed

    private void txtLejosAgujeroOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosAgujeroOIFocusGained
        // TODO add your handling code here:
        txtLejosAgujeroOI.setText(null);
    }//GEN-LAST:event_txtLejosAgujeroOIFocusGained

    private void txtLejosAgujeroOIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLejosAgujeroOIFocusLost
        // TODO add your handling code here:
        if (txtLejosAgujeroOI.getText().isEmpty()) {
            txtLejosAgujeroOI.setText("00");
        }
    }//GEN-LAST:event_txtLejosAgujeroOIFocusLost

    private void txtLejosAgujeroOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosAgujeroOIActionPerformed
        // TODO add your handling code here:
        txtBinocularSinCorregir.requestFocus();
    }//GEN-LAST:event_txtLejosAgujeroOIActionPerformed

    private void txtCercaAgujeroOIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaAgujeroOIFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCercaAgujeroOIFocusGained

    private void txtCercaAgujeroOIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCercaAgujeroOIFocusLost
        // TODO add your handling code here:
        if (txtCercaAgujeroOI.getText().isEmpty()) {
            txtCercaAgujeroOI.setText("00");
        }
    }//GEN-LAST:event_txtCercaAgujeroOIFocusLost

    private void txtCercaAgujeroOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaAgujeroOIActionPerformed
        // TODO add your handling code here:
        txtLejosAgujeroOD.requestFocus();
    }//GEN-LAST:event_txtCercaAgujeroOIActionPerformed

    private void txtBinocularSinCorregirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBinocularSinCorregirFocusGained
        // TODO add your handling code here:
        txtBinocularSinCorregir.setText(null);
    }//GEN-LAST:event_txtBinocularSinCorregirFocusGained

    private void txtBinocularSinCorregirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBinocularSinCorregirFocusLost
        // TODO add your handling code here:
        if (txtBinocularSinCorregir.getText().isEmpty()) {
            txtBinocularSinCorregir.setText("00");
        }
    }//GEN-LAST:event_txtBinocularSinCorregirFocusLost

    private void txtBinocularSinCorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBinocularSinCorregirActionPerformed
        // TODO add your handling code here:
        txtBinocularCorregida.requestFocus();
    }//GEN-LAST:event_txtBinocularSinCorregirActionPerformed

    private void txtBinocularCorregidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBinocularCorregidaFocusGained
        // TODO add your handling code here:
        txtBinocularCorregida.setText(null);
    }//GEN-LAST:event_txtBinocularCorregidaFocusGained

    private void txtBinocularCorregidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBinocularCorregidaFocusLost
        // TODO add your handling code here:
        if (txtBinocularCorregida.getText().isEmpty()) {
            txtBinocularCorregida.setText("00");
        }
    }//GEN-LAST:event_txtBinocularCorregidaFocusLost

    private void txtBinocularCorregidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBinocularCorregidaActionPerformed
        // TODO add your handling code here:
        txtTECEstereopsia.requestFocus();
    }//GEN-LAST:event_txtBinocularCorregidaActionPerformed

    private void txtTECEstereopsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTECEstereopsiaActionPerformed
        // TODO add your handling code here:
        txtLejosODSF.requestFocus();
    }//GEN-LAST:event_txtTECEstereopsiaActionPerformed

    private void chkI6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkI6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkI6ActionPerformed

    private void txtECHallazgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtECHallazgosActionPerformed
        // TODO add your handling code here:
        txtFOHallazgos.requestFocus();
    }//GEN-LAST:event_txtECHallazgosActionPerformed

    private void txtFOHallazgosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFOHallazgosActionPerformed
        // TODO add your handling code here:
        txtPioOD.requestFocus();
    }//GEN-LAST:event_txtFOHallazgosActionPerformed

    private void txtPioODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPioODActionPerformed
        // TODO add your handling code here:
        txtPioOI.requestFocus();
    }//GEN-LAST:event_txtPioODActionPerformed

    private void txtPioOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPioOIActionPerformed
        // TODO add your handling code here:
        txtPioNA.requestFocus();
    }//GEN-LAST:event_txtPioOIActionPerformed

    private void txtPioNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPioNAActionPerformed
        // TODO add your handling code here:
        txtCercaSinCorregirOD.requestFocus();
    }//GEN-LAST:event_txtPioNAActionPerformed

    private void txtLejosODSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosODSFActionPerformed
        // TODO add your handling code here:
        txtLejosODCIL.requestFocus();
    }//GEN-LAST:event_txtLejosODSFActionPerformed

    private void txtLejosODCILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosODCILActionPerformed
        // TODO add your handling code here:
        txtLejosODEJE.requestFocus();
    }//GEN-LAST:event_txtLejosODCILActionPerformed

    private void txtLejosODEJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosODEJEActionPerformed
        // TODO add your handling code here:
        txtLejosOISF.requestFocus();
    }//GEN-LAST:event_txtLejosODEJEActionPerformed

    private void txtLejosOISFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosOISFActionPerformed
        // TODO add your handling code here:
        txtLejosOICIL.requestFocus();
    }//GEN-LAST:event_txtLejosOISFActionPerformed

    private void txtLejosOICILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosOICILActionPerformed
        // TODO add your handling code here:
        txtLejosOIEJE.requestFocus();
    }//GEN-LAST:event_txtLejosOICILActionPerformed

    private void txtLejosOIEJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosOIEJEActionPerformed
        // TODO add your handling code here:
        txtLejosODDIP.requestFocus();
    }//GEN-LAST:event_txtLejosOIEJEActionPerformed

    private void txtLejosODDIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLejosODDIPActionPerformed
        // TODO add your handling code here:
        txtCercaODSF.requestFocus();
    }//GEN-LAST:event_txtLejosODDIPActionPerformed

    private void txtCercaODSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaODSFActionPerformed
        // TODO add your handling code here:
        txtCercaODCIL.requestFocus();
    }//GEN-LAST:event_txtCercaODSFActionPerformed

    private void txtCercaODCILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaODCILActionPerformed
        // TODO add your handling code here:
        txtCercaODEJE.requestFocus();
    }//GEN-LAST:event_txtCercaODCILActionPerformed

    private void txtCercaODEJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaODEJEActionPerformed
        // TODO add your handling code here:
        txtCercaOISF.requestFocus();
    }//GEN-LAST:event_txtCercaODEJEActionPerformed

    private void txtCercaOISFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaOISFActionPerformed
        // TODO add your handling code here:
        txtCercaOICIL.requestFocus();
    }//GEN-LAST:event_txtCercaOISFActionPerformed

    private void txtCercaOICILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaOICILActionPerformed
        // TODO add your handling code here:
        txtCercaOIEJE.requestFocus();
    }//GEN-LAST:event_txtCercaOICILActionPerformed

    private void txtCercaOIEJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaOIEJEActionPerformed
        // TODO add your handling code here:
        txtCercaODDIP.requestFocus();
    }//GEN-LAST:event_txtCercaOIEJEActionPerformed

    private void txtCercaODDIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaODDIPActionPerformed
        // TODO add your handling code here:
        txtAVConRefraccionLejosOD.requestFocus();
    }//GEN-LAST:event_txtCercaODDIPActionPerformed

    private void txtAVConRefraccionLejosODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAVConRefraccionLejosODActionPerformed
        // TODO add your handling code here:
        txtAVConRefraccionLejosOI.requestFocus();
    }//GEN-LAST:event_txtAVConRefraccionLejosODActionPerformed

    private void txtAVConRefraccionLejosOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAVConRefraccionLejosOIActionPerformed
        // TODO add your handling code here:
        txtAVConRefraccionCercaOD.requestFocus();
    }//GEN-LAST:event_txtAVConRefraccionLejosOIActionPerformed

    private void txtAVConRefraccionCercaODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAVConRefraccionCercaODActionPerformed
        // TODO add your handling code here:
        txtAVConRefraccionCercaOI.requestFocus();
    }//GEN-LAST:event_txtAVConRefraccionCercaODActionPerformed

    private void txtAVConRefraccionCercaOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAVConRefraccionCercaOIActionPerformed
        // TODO add your handling code here:
        txtDiagnostico.requestFocus();
    }//GEN-LAST:event_txtAVConRefraccionCercaOIActionPerformed

    private void chkRefraccionAplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRefraccionAplicaActionPerformed
        // TODO add your handling code here:
         if(chkRefraccionAplica.isSelected()) {
            txtLejosODSF.setText("");
            txtLejosODCIL.setText("");
            txtLejosODEJE.setText("");
            txtLejosOISF.setText("");
            txtLejosOICIL.setText("");
            txtLejosOIEJE.setText("");
            txtLejosODDIP.setText("");
            txtCercaODSF.setText("");
            txtCercaODCIL.setText("");
            txtCercaODEJE.setText("");
            txtCercaOISF.setText("");
            txtCercaOICIL.setText("");
            txtCercaOIEJE.setText("");
            txtCercaODDIP.setText("");
            txtAVConRefraccionLejosOD.setText("");
            txtAVConRefraccionLejosOI.setText("");
            txtAVConRefraccionCercaOD.setText("");
            txtAVConRefraccionCercaOI.setText("");
        }
    }//GEN-LAST:event_chkRefraccionAplicaActionPerformed

    private void txtReflejosPupilaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReflejosPupilaresActionPerformed
      
    }//GEN-LAST:event_txtReflejosPupilaresActionPerformed

    private void chkRefraccionNoAplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRefraccionNoAplicaActionPerformed
        // TODO add your handling code here:
        if(chkRefraccionNoAplica.isSelected()) {
            txtLejosODSF.setText("-");
            txtLejosODCIL.setText("-");
            txtLejosODEJE.setText("-");
            txtLejosOISF.setText("-");
            txtLejosOICIL.setText("-");
            txtLejosOIEJE.setText("-");
            txtLejosODDIP.setText("-");
            txtCercaODSF.setText("-");
            txtCercaODCIL.setText("-");
            txtCercaODEJE.setText("-");
            txtCercaOISF.setText("-");
            txtCercaOICIL.setText("-");
            txtCercaOIEJE.setText("-");
            txtCercaODDIP.setText("-");
            txtAVConRefraccionLejosOD.setText("-");
            txtAVConRefraccionLejosOI.setText("-");
            txtAVConRefraccionCercaOD.setText("-");
            txtAVConRefraccionCercaOI.setText("-");
        }
    }//GEN-LAST:event_chkRefraccionNoAplicaActionPerformed

    void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
Fecha.setDate(fechaDate);
}

private void ReImp(){
if(!txtImp.getText().isEmpty()){
    print(Integer.valueOf(txtImp.getText()));
    }else{oFunc.SubSistemaMensajeError("Ingresar numero ");}

}

  
 private void print(Integer cod){
           
    Map parameters = new HashMap(); 
    parameters.put("Norden",cod);             

      try 
    {
        String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"EvaluacionOftalmologica2021.jasper";
        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
        JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
        JasperViewer viewer = new JasperViewer(myPrint, false);
        viewer.setTitle("Ficha oftalmologica");
        //viewer.setAlwaysOnTop(true);
        viewer.setVisible(true);
     } catch (JRException ex) {
        Logger.getLogger(EvaluacionOftalmologica.class.getName()).log(Level.SEVERE, null, ex);
    }
            
                
                 
 
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup bgCO;
    private javax.swing.ButtonGroup bgCO_Cerca;
    private javax.swing.ButtonGroup bgECE1;
    private javax.swing.ButtonGroup bgECE2;
    private javax.swing.ButtonGroup bgECE3;
    private javax.swing.ButtonGroup bgECE4;
    private javax.swing.ButtonGroup bgECE5;
    private javax.swing.ButtonGroup bgECE6;
    private javax.swing.ButtonGroup bgECE7;
    private javax.swing.ButtonGroup bgECE8;
    private javax.swing.ButtonGroup bgFOAnormal;
    private javax.swing.ButtonGroup bgFONormal;
    private javax.swing.ButtonGroup bgRefrac;
    private javax.swing.ButtonGroup bgSL;
    private javax.swing.ButtonGroup bgTEC1;
    private javax.swing.ButtonGroup bgTEC2;
    private javax.swing.ButtonGroup bgTEC3;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditarAudiom;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkI2;
    private javax.swing.JCheckBox chkI3;
    private javax.swing.JCheckBox chkI4_cerca;
    private javax.swing.JCheckBox chkI4_lejos;
    private javax.swing.JCheckBox chkI5;
    private javax.swing.JCheckBox chkI6;
    private javax.swing.JCheckBox chkI7;
    private javax.swing.JCheckBox chkINinguna;
    private javax.swing.JCheckBox chkNTCC;
    private javax.swing.JCheckBox chkNTCL;
    private javax.swing.JCheckBox chkR1;
    private javax.swing.JCheckBox chkR2_cerca;
    private javax.swing.JCheckBox chkR2_lejos;
    private javax.swing.JCheckBox chkR3;
    private javax.swing.JCheckBox chkR4;
    private javax.swing.JCheckBox chkRefraccionAplica;
    private javax.swing.JCheckBox chkRefraccionNoAplica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton rbCO_cerca;
    private javax.swing.JRadioButton rbCO_lejos;
    private javax.swing.JRadioButton rbCO_no;
    private javax.swing.JRadioButton rbCO_si;
    private javax.swing.JRadioButton rbECCataratasOD;
    private javax.swing.JRadioButton rbECCataratasOI;
    private javax.swing.JRadioButton rbECClalacionOD;
    private javax.swing.JRadioButton rbECClalacionOI;
    private javax.swing.JRadioButton rbECConjuntivitisOD;
    private javax.swing.JRadioButton rbECConjuntivitisOI;
    private javax.swing.JRadioButton rbECEstrabismoOD;
    private javax.swing.JRadioButton rbECEstrabismoOI;
    private javax.swing.JRadioButton rbECOtrosOD;
    private javax.swing.JRadioButton rbECOtrosOI;
    private javax.swing.JRadioButton rbECPingueculaOD;
    private javax.swing.JRadioButton rbECPingueculaOI;
    private javax.swing.JRadioButton rbECPterigionOD;
    private javax.swing.JRadioButton rbECPterigionOI;
    private javax.swing.JRadioButton rbECPtosisOD;
    private javax.swing.JRadioButton rbECPtosisOI;
    private javax.swing.JRadioButton rbFOAnormalOD;
    private javax.swing.JRadioButton rbFOAnormalOI;
    private javax.swing.JRadioButton rbFONormalOD;
    private javax.swing.JRadioButton rbFONormalOI;
    private javax.swing.JRadioButton rbTECColeres_anormal;
    private javax.swing.JRadioButton rbTECColeres_nc;
    private javax.swing.JRadioButton rbTECColeres_normal;
    private javax.swing.JRadioButton rbTECEstereopsia_anormal;
    private javax.swing.JRadioButton rbTECEstereopsia_nc;
    private javax.swing.JRadioButton rbTECEstereopsia_normal;
    private javax.swing.JRadioButton rbTECIshihara_NC;
    private javax.swing.JRadioButton rbTECIshihara_anormal;
    private javax.swing.JRadioButton rbTECIshihara_normal;
    private javax.swing.JTextField txtAVConRefraccionCercaOD;
    private javax.swing.JTextField txtAVConRefraccionCercaOI;
    private javax.swing.JTextField txtAVConRefraccionLejosOD;
    private javax.swing.JTextField txtAVConRefraccionLejosOI;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBinocularCorregida;
    private javax.swing.JTextField txtBinocularSinCorregir;
    private javax.swing.JTextField txtCercaAgujeroOD;
    private javax.swing.JTextField txtCercaAgujeroOI;
    private javax.swing.JTextField txtCercaCorregidaOD;
    private javax.swing.JTextField txtCercaCorregidaOI;
    private javax.swing.JTextField txtCercaODCIL;
    private javax.swing.JTextField txtCercaODDIP;
    private javax.swing.JTextField txtCercaODEJE;
    private javax.swing.JTextField txtCercaODSF;
    private javax.swing.JTextField txtCercaOICIL;
    private javax.swing.JTextField txtCercaOIEJE;
    private javax.swing.JTextField txtCercaOISF;
    private javax.swing.JTextField txtCercaSinCorregirOD;
    private javax.swing.JTextField txtCercaSinCorregirOI;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtECHallazgos;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtExMedico;
    private javax.swing.JTextField txtFOHallazgos;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtLejosAgujeroOD;
    private javax.swing.JTextField txtLejosAgujeroOI;
    private javax.swing.JTextField txtLejosCorregidaOD;
    private javax.swing.JTextField txtLejosCorregidaOI;
    private javax.swing.JTextField txtLejosODCIL;
    private javax.swing.JTextField txtLejosODDIP;
    private javax.swing.JTextField txtLejosODEJE;
    private javax.swing.JTextField txtLejosODSF;
    private javax.swing.JTextField txtLejosOICIL;
    private javax.swing.JTextField txtLejosOIEJE;
    private javax.swing.JTextField txtLejosOISF;
    private javax.swing.JTextField txtLejosSinCorregirOD;
    private javax.swing.JTextField txtLejosSinCorregirOI;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPioNA;
    private javax.swing.JTextField txtPioOD;
    private javax.swing.JTextField txtPioOI;
    private javax.swing.JTextField txtReflejosPupilares;
    private javax.swing.JTextField txtTECEstereopsia;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
    txtDni.setText(null);
    txtNombres.setText(null);
    FechaNacimiento.setDate(null);
    txtApellidos.setText(null);
    txtEmpresa.setText(null);
    txtContrata.setText(null);
    txtExMedico.setText(null);
    txtNumero.setText(null);
    Fecha.setDate(null);
    
    bgECE1.clearSelection();
    bgECE2.clearSelection();
    bgECE3.clearSelection();
    bgECE4.clearSelection();
    bgECE5.clearSelection();
    txtECHallazgos.setText(null);
    bgECE6.clearSelection();
    bgECE7.clearSelection();
    bgECE8.clearSelection();
    bgFONormal.clearSelection();
    bgFOAnormal.clearSelection();
    bgCO.clearSelection();
    bgCO_Cerca.clearSelection();
    bgTEC2.clearSelection();
    bgTEC3.clearSelection();
    bgRefrac.clearSelection();
    txtFOHallazgos.setText("N/A");
    bgSL.clearSelection();
    bgTEC1.clearSelection();
    txtPioOD.setText(null);
    txtPioOI.setText(null);
    txtPioNA.setText("X");
    chkRefraccionNoAplica.setSelected(true);
    txtCercaSinCorregirOD.setText(null);
    txtCercaSinCorregirOI.setText(null);
    txtLejosSinCorregirOD.setText(null);
    txtLejosSinCorregirOI.setText(null);
    txtCercaCorregidaOD.setText(null);
    txtCercaCorregidaOI.setText(null);
    txtLejosCorregidaOD.setText(null);
    txtLejosCorregidaOI.setText(null);
    txtCercaAgujeroOD.setText(null);
    txtCercaAgujeroOI.setText(null);
    txtLejosAgujeroOD.setText(null);
    txtLejosAgujeroOI.setText(null);
    txtBinocularSinCorregir.setText(null);
    txtBinocularCorregida.setText(null);
    txtTECEstereopsia.setText(null);
    txtLejosODSF.setText(null);
    txtLejosODCIL.setText(null);
    txtLejosODEJE.setText(null);
    txtLejosOISF.setText(null);
    txtLejosOICIL.setText(null);
    txtLejosOIEJE.setText(null);
    txtLejosODDIP.setText(null);
    txtCercaODSF.setText(null);
    txtCercaODCIL.setText(null);
    txtCercaODEJE.setText(null);
    txtCercaOISF.setText(null);
    txtCercaOICIL.setText(null);
    txtCercaOIEJE.setText(null);
    txtCercaODDIP.setText(null);
    txtAVConRefraccionLejosOD.setText(null);
    txtAVConRefraccionLejosOI.setText(null);
    txtAVConRefraccionCercaOD.setText(null);
    txtAVConRefraccionCercaOI.setText(null);
    txtDiagnostico.setText(null);
    chkINinguna.setSelected(false);
    chkI2.setSelected(false);
    chkI3.setSelected(false);
    chkI4_cerca.setSelected(false);
    chkI4_lejos.setSelected(false);
    chkI5.setSelected(false);
    chkI6.setSelected(false);
    chkI7.setSelected(false);
    chkR1.setSelected(false);
    chkR2_cerca.setSelected(false);
    chkR2_lejos.setSelected(false);
    chkR3.setSelected(false);
    chkR4.setSelected(false);
    txtReflejosPupilares.setText(null);
    
    btnGuardar.setEnabled(true);
    txtNumero.requestFocus();
}
public void Deshabilitar(boolean ficha){
    txtDni.setEnabled(false);
    txtNombres.setEnabled(false);
    FechaNacimiento.setEnabled(false);
    txtApellidos.setEnabled(false);
    txtEmpresa.setEnabled(false);            
    txtContrata.setEnabled(false);    
    txtExMedico.setEnabled(false);
    txtNumero.setEnabled(ficha);
}
public void Agregar(){
     
    if(!OrdenExiste()){
        if(validar()){

            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO oftalmologia2021(";
            Query="Values('";
            strSqlStmt += "n_orden";Query += txtNumero.getText()+ "'";
            strSqlStmt += ",fecha_of";Query += ",'"+Fecha.getDate()+ "'";
            strSqlStmt += ",rbecptosisod";Query += ",'"+rbECPtosisOD.isSelected()+ "'";
            strSqlStmt += ",rbecptosisoi";Query += ",'"+rbECPtosisOI.isSelected()+ "'";
            strSqlStmt += ",rbecestrabismood";Query += ",'"+rbECEstrabismoOD.isSelected()+ "'";
            strSqlStmt += ",rbecestrabismooi";Query += ",'"+rbECEstrabismoOI.isSelected()+ "'";
            strSqlStmt += ",rbecconjuntivitisod";Query += ",'"+rbECConjuntivitisOD.isSelected()+ "'";
            strSqlStmt += ",rbecconjuntivitisoi";Query += ",'"+rbECConjuntivitisOI.isSelected()+ "'";
            strSqlStmt += ",rbeccataratasod";Query += ",'"+rbECCataratasOD.isSelected()+ "'";
            strSqlStmt += ",rbeccataratasoi";Query += ",'"+rbECCataratasOI.isSelected()+ "'";
            strSqlStmt += ",rbecpterigionod";Query += ",'"+rbECPterigionOD.isSelected()+ "'";
            strSqlStmt += ",rbecpterigionoi";Query += ",'"+rbECPterigionOI.isSelected()+ "'";
            strSqlStmt += ",rbecpingueculaod";Query += ",'"+rbECPingueculaOD.isSelected()+ "'";
            strSqlStmt += ",rbecpingueculaoi";Query += ",'"+rbECPingueculaOI.isSelected()+ "'";
            strSqlStmt += ",rbecclalacionod";Query += ",'"+rbECClalacionOD.isSelected()+ "'";
            strSqlStmt += ",rbecclalacionoi";Query += ",'"+rbECClalacionOI.isSelected()+ "'";
            strSqlStmt += ",rbecotrosod";Query += ",'"+rbECOtrosOD.isSelected()+ "'";
            strSqlStmt += ",rbecotrosoi";Query += ",'"+rbECOtrosOI.isSelected()+ "'";
            strSqlStmt += ",txtechallazgos";Query += ",'"+txtECHallazgos.getText()+ "'";
            strSqlStmt += ",rbfonormalod";Query += ",'"+rbFONormalOD.isSelected()+ "'";
            strSqlStmt += ",rbfonormaloi";Query += ",'"+rbFONormalOD.isSelected()+ "'";  
            strSqlStmt += ",rbfoanormalod";Query += ",'"+rbFOAnormalOD.isSelected()+ "'";
            strSqlStmt += ",rbfoanormaloi";Query += ",'"+rbFOAnormalOI.isSelected()+ "'";  
            strSqlStmt += ",txtfohallazgos";Query += ",'"+txtFOHallazgos.getText()+ "'";
            strSqlStmt += ",txtpiood";Query += ",'"+txtPioOD.getText()+ "'";
            strSqlStmt += ",txtpiooi";Query += ",'"+txtPioOI.getText()+ "'";
            strSqlStmt += ",txtpiona";Query += ",'"+txtPioNA.getText()+ "'";
            strSqlStmt += ",rbco_si";Query += ",'"+rbCO_si.isSelected()+ "'";
            strSqlStmt += ",rbco_no";Query += ",'"+rbCO_no.isSelected()+ "'";            
            strSqlStmt += ",rbco_cerca";Query += ",'"+rbCO_cerca.isSelected()+ "'";
            strSqlStmt += ",rbco_lejos";Query += ",'"+rbCO_lejos.isSelected()+ "'";            
            strSqlStmt += ",chkntcc";Query += ",'"+chkNTCC.isSelected()+ "'";
            strSqlStmt += ",chkntcl";Query += ",'"+chkNTCL.isSelected()+ "'";   
            strSqlStmt += ",txtcercasincorregirod";Query += ",'"+txtCercaSinCorregirOD.getText()+ "'";
            strSqlStmt += ",txtcercasincorregiroi";Query += ",'"+txtCercaSinCorregirOI.getText()+ "'";
            strSqlStmt += ",txtlejossincorregirod";Query += ",'"+txtLejosSinCorregirOD.getText()+ "'";
            strSqlStmt += ",txtlejossincorregiroi";Query += ",'"+txtLejosSinCorregirOI.getText()+ "'";
            strSqlStmt += ",txtcercacorregidaod";Query += ",'"+txtCercaCorregidaOD.getText()+ "'";
            strSqlStmt += ",txtcercacorregidaoi";Query += ",'"+txtCercaCorregidaOI.getText()+ "'";
            strSqlStmt += ",txtlejoscorregidaod";Query += ",'"+txtLejosCorregidaOD.getText()+ "'";
            strSqlStmt += ",txtlejoscorregidaoi";Query += ",'"+txtLejosCorregidaOI.getText()+ "'";
            strSqlStmt += ",txtcercaagujerood";Query += ",'"+txtCercaAgujeroOD.getText()+ "'";
            strSqlStmt += ",txtcercaagujerooi";Query += ",'"+txtCercaAgujeroOI.getText()+ "'";
            strSqlStmt += ",txtlejosagujerood";Query += ",'"+txtLejosAgujeroOD.getText()+ "'";
            strSqlStmt += ",txtlejosagujerooi";Query += ",'"+txtLejosAgujeroOI.getText()+ "'";
            strSqlStmt += ",txtbinocularsincorregir";Query += ",'"+txtBinocularSinCorregir.getText()+ "'";
            strSqlStmt += ",txtbinocularcorregida";Query += ",'"+txtBinocularCorregida.getText()+ "'";
            strSqlStmt += ",rbtecishihara_normal";Query += ",'"+rbTECIshihara_normal.isSelected()+ "'";
            strSqlStmt += ",rbtecishihara_anormal";Query += ",'"+rbTECIshihara_anormal.isSelected()+ "'";            
            strSqlStmt += ",rbtecishihara_nc";Query += ",'"+rbTECIshihara_NC.isSelected()+ "'";
            strSqlStmt += ",rbteccoleres_normal";Query += ",'"+rbTECColeres_normal.isSelected()+ "'";  
            strSqlStmt += ",rbteccoleres_anormal";Query += ",'"+rbTECColeres_anormal.isSelected()+ "'";            
            strSqlStmt += ",rbteccoleres_nc";Query += ",'"+rbTECColeres_nc.isSelected()+ "'";
            strSqlStmt += ",txttecestereopsia";Query += ",'"+txtTECEstereopsia.getText()+ "'";
            strSqlStmt += ",rbtecestereopsia_normal";Query += ",'"+rbTECEstereopsia_normal.isSelected()+ "'"; 
            strSqlStmt += ",rbtecestereopsia_anormal";Query += ",'"+rbTECEstereopsia_anormal.isSelected()+ "'"; 
            strSqlStmt += ",rbtecestereopsia_nc";Query += ",'"+rbTECEstereopsia_nc.isSelected()+ "'"; 
            strSqlStmt += ",chkrefraccionaplica";Query += ",'"+chkRefraccionAplica.isSelected()+ "'"; 
            strSqlStmt += ",chkrefraccionnoaplica";Query += ",'"+chkRefraccionNoAplica.isSelected()+ "'"; 
            strSqlStmt += ",txtlejosodsf";Query += ",'"+txtLejosODSF.getText()+ "'";
            strSqlStmt += ",txtlejosodcil";Query += ",'"+txtLejosODCIL.getText()+ "'";
            strSqlStmt += ",txtlejosodeje";Query += ",'"+txtLejosODEJE.getText()+ "'";
            strSqlStmt += ",txtlejosoisf";Query += ",'"+txtLejosOISF.getText()+ "'";
            strSqlStmt += ",txtlejosoicil";Query += ",'"+txtLejosOICIL.getText()+ "'";
            strSqlStmt += ",txtlejosoieje";Query += ",'"+txtLejosOIEJE.getText()+ "'";
            strSqlStmt += ",txtlejosoddip";Query += ",'"+txtLejosODDIP.getText()+ "'";
            strSqlStmt += ",txtcercaodsf";Query += ",'"+txtCercaODSF.getText()+ "'";
            strSqlStmt += ",txtcercaodcil";Query += ",'"+txtCercaODCIL.getText()+ "'";
            strSqlStmt += ",txtcercaodeje";Query += ",'"+txtCercaODEJE.getText()+ "'";
            strSqlStmt += ",txtcercaoisf";Query += ",'"+txtCercaOISF.getText()+ "'";
            strSqlStmt += ",txtcercaoicil";Query += ",'"+txtCercaOICIL.getText()+ "'";
            strSqlStmt += ",txtcercaoieje";Query += ",'"+txtCercaOIEJE.getText()+ "'";
            strSqlStmt += ",txtcercaoddip";Query += ",'"+txtCercaODDIP.getText()+ "'";
            
            strSqlStmt += ",txtavconrefraccionlejosod";Query += ",'"+txtAVConRefraccionLejosOD.getText()+ "'";
            strSqlStmt += ",txtavconrefraccionlejosoi";Query += ",'"+txtAVConRefraccionLejosOI.getText()+ "'";
            strSqlStmt += ",txtavconrefraccioncercaod";Query += ",'"+txtAVConRefraccionCercaOD.getText()+ "'";
            strSqlStmt += ",txtavconrefraccioncercaoi";Query += ",'"+txtAVConRefraccionCercaOI.getText()+ "'";
            strSqlStmt += ",txtdiagnostico";Query += ",'"+txtDiagnostico.getText()+ "'";
            
            strSqlStmt += ",chkininguna";Query += ",'"+chkINinguna.isSelected()+ "'"; 
            strSqlStmt += ",chki2";Query += ",'"+chkI2.isSelected()+ "'"; 
            strSqlStmt += ",chki3";Query += ",'"+chkI3.isSelected()+ "'"; 
            strSqlStmt += ",chki4_cerca";Query += ",'"+chkI4_cerca.isSelected()+ "'"; 
            strSqlStmt += ",chki4_lejos";Query += ",'"+chkI4_lejos.isSelected()+ "'"; 
            strSqlStmt += ",chki5";Query += ",'"+chkI5.isSelected()+ "'"; 
            strSqlStmt += ",chki6";Query += ",'"+chkI6.isSelected()+ "'"; 
            strSqlStmt += ",chki7";Query += ",'"+chkI7.isSelected()+ "'"; 
            
            strSqlStmt += ",chkr1";Query += ",'"+chkR1.isSelected()+ "'"; 
            strSqlStmt += ",chkr2_lejos";Query += ",'"+chkR2_lejos.isSelected()+ "'"; 
            strSqlStmt += ",chkr2_cerca";Query += ",'"+chkR2_cerca.isSelected()+ "'"; 
            strSqlStmt += ",chkr3";Query += ",'"+chkR3.isSelected()+ "'"; 
            strSqlStmt += ",chkr4";Query += ",'"+chkR4.isSelected()+ "'"; 
            strSqlStmt += ",txtrp";Query += ",'"+txtReflejosPupilares.getText()+ "'";         
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
                
                oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito"); 
                imprimir1();
                Limpiar();  
                txtNumero.setEnabled(true);
                txtNumero.requestFocus();   
                
            }else{
                oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
            }
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EvaluacionMusculoEsqueletica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }else{oFunc.SubSistemaMensajeError("Error N° Orden Registrada");
    }
}
  
private boolean validar(){
    boolean bResultado=true;
    if (((JTextField)Fecha.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
            {oFunc.SubSistemaMensajeError("Ingrese Fecha de Examen");bResultado = false;}
      
        if(txtDiagnostico.getText().isEmpty()){bResultado = false;}
       return bResultado;
}
    public boolean OrdenExiste()
    {
        boolean bResultado=false;

        String sQuery;

        sQuery  = "Select n_orden from oftalmologia2021 Where n_orden="+txtNumero.getText().toString();
        
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        
        // Capturo el Error
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             Limpiar();
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         
        }

        return bResultado;
        
    }
   
private void imprimir1(){
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
      printer1(Integer.valueOf(txtNumero.getText()));
       
   }
   else
   {
      // PRESIONO NO
   }
  }

}
private void printer1(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/EvaluacionOftalmologica2021.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte oftlmologia 2021.");
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

//            JasperViewer.viewReport(myPrint, false);
              
             JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void muestraVisual() {
        String sql = "SELECT o.v_cerca_s_od, o.v_cerca_s_oi,\n"
                + "          CASE  WHEN ol.v_cerca_c_od IS NULL THEN o.v_cerca_c_od  ELSE ol.v_cerca_c_od  END as ODCC, \n"
                + "          CASE  WHEN ol.v_cerca_c_oi IS NULL THEN o.v_cerca_c_oi  ELSE ol.v_cerca_c_oi  END as OICC, \n"
                + "          o.v_lejos_s_od, o.v_lejos_s_oi, \n"
                + "	  CASE  WHEN ol.v_lejos_c_od IS NULL THEN o.v_lejos_c_od  ELSE ol.v_lejos_c_od  END as ODLC, \n"
                + "          CASE  WHEN ol.v_lejos_c_oi IS NULL THEN o.v_lejos_c_oi  ELSE ol.v_lejos_c_oi  END as OILC, \n"
                + "	  CASE  WHEN ol.v_colores IS NULL THEN o.v_colores  ELSE ol.v_colores  END as VC, \n"
                + "          CASE  WHEN ol.v_binocular IS NULL THEN o.v_binocular  ELSE ol.v_binocular  END as VB, \n"
                + "          CASE  WHEN ol.r_pupilares IS NULL THEN o.r_pupilares  ELSE ol.r_pupilares  END as RP, o.e_oculares,o.e_oculares1 \n"
                + "     FROM oftalmologia as o\n"
                + "     left JOIN oftalmologia_lo as ol on (o.n_orden=ol.n_orden)\n"
                + "     WHERE o.n_orden ='" + txtNumero.getText() + "'";
        oConn.FnBoolQueryExecute(sql);
        try {
            if (oConn.setResult.next()) {
                txtCercaSinCorregirOD.setText(oConn.setResult.getString("v_cerca_s_od"));
                txtCercaSinCorregirOI.setText(oConn.setResult.getString("v_cerca_s_oi"));
                txtLejosSinCorregirOD.setText(oConn.setResult.getString("v_lejos_s_od"));
                txtLejosSinCorregirOI.setText(oConn.setResult.getString("v_lejos_s_oi"));

                txtCercaCorregidaOD.setText(oConn.setResult.getString("ODCC"));
                txtCercaCorregidaOI.setText(oConn.setResult.getString("OICC"));
                txtLejosCorregidaOD.setText(oConn.setResult.getString("ODLC"));
                txtLejosCorregidaOI.setText(oConn.setResult.getString("OILC"));
                txtBinocularSinCorregir.setText(oConn.setResult.getString("VB"));
                txtReflejosPupilares.setText(oConn.setResult.getString("RP"));
                txtDiagnostico.append(oConn.setResult.getString("e_oculares"));
                txtDiagnostico.append(oConn.setResult.getString("e_oculares1"));
                
            } else {
                oFunc.SubSistemaMensajeError("No se encuentra Registros en oftalmologia");
            }
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
        }

    }

}
