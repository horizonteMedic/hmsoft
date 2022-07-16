/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public final class Audiometria2021 extends javax.swing.JInternalFrame {
        clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   DefaultTableModel model;
    String[]nombres = new String[]{};
    public Audiometria2021() {
        initComponents();
        Deshabilitar(true);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSA1 = new javax.swing.ButtonGroup();
        bgSA2 = new javax.swing.ButtonGroup();
        bgSA3 = new javax.swing.ButtonGroup();
        bgSA4 = new javax.swing.ButtonGroup();
        bgSA5 = new javax.swing.ButtonGroup();
        bgAM1 = new javax.swing.ButtonGroup();
        bgAM2 = new javax.swing.ButtonGroup();
        bgAM3 = new javax.swing.ButtonGroup();
        bgAM4 = new javax.swing.ButtonGroup();
        bgAM5 = new javax.swing.ButtonGroup();
        bgAM6 = new javax.swing.ButtonGroup();
        bgAM7 = new javax.swing.ButtonGroup();
        bgEO1 = new javax.swing.ButtonGroup();
        bgEO2 = new javax.swing.ButtonGroup();
        bgAM8 = new javax.swing.ButtonGroup();
        bgAM9 = new javax.swing.ButtonGroup();
        bgAM10 = new javax.swing.ButtonGroup();
        bgEO3 = new javax.swing.ButtonGroup();
        bgTE = new javax.swing.ButtonGroup();
        bgAE1 = new javax.swing.ButtonGroup();
        bgAE2 = new javax.swing.ButtonGroup();
        bgAE3 = new javax.swing.ButtonGroup();
        bgRPA = new javax.swing.ButtonGroup();
        bgRCA = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnEditarAudiom = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtExMedico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FechaAudiometria = new com.toedter.calendar.JDateChooser();
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
        rbSASordera_si = new javax.swing.JRadioButton();
        rbSASordera_no = new javax.swing.JRadioButton();
        rbSAAcufenos_si = new javax.swing.JRadioButton();
        rbSAAcufenos_no = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbSAVertigo_si = new javax.swing.JRadioButton();
        rbSAVertigo_no = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rbSAOtalgia_si = new javax.swing.JRadioButton();
        rbSAOtalgia_no = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rbSASecrecion_si = new javax.swing.JRadioButton();
        rbSASecrecion_no = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtSAOtrossintomas = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbAMRenitis_si = new javax.swing.JRadioButton();
        rbAMRenitis_no = new javax.swing.JRadioButton();
        rbAMSinusitis_si = new javax.swing.JRadioButton();
        rbAMSinusitis_no = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        rbAMOtitis_si = new javax.swing.JRadioButton();
        rbAMOtitis_no = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        rbAMOtotoxicos_si = new javax.swing.JRadioButton();
        rbAMOtotoxicos_no = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        rbAMMeningitis_si = new javax.swing.JRadioButton();
        rbAMMeningitis_no = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        txtAMCuales = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        rbAMTec_si = new javax.swing.JRadioButton();
        rbAMTec_no = new javax.swing.JRadioButton();
        rbAMSordera_no = new javax.swing.JRadioButton();
        rbAMSordera_si = new javax.swing.JRadioButton();
        rbAMParotiditis_si = new javax.swing.JRadioButton();
        rbAMParotiditis_no = new javax.swing.JRadioButton();
        rbAMSarampion_no = new javax.swing.JRadioButton();
        rbAMSarampion_si = new javax.swing.JRadioButton();
        rbAMTbc_si = new javax.swing.JRadioButton();
        rbAMTbc_no = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        rbEOExposicion_si = new javax.swing.JRadioButton();
        rbEOExposicion_no = new javax.swing.JRadioButton();
        rbEOProtectores_si = new javax.swing.JRadioButton();
        rbEOProtectores_no = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        rbEOSustancias_si = new javax.swing.JRadioButton();
        rbEOSustancias_no = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtEOOtros = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbTE0a2 = new javax.swing.JRadioButton();
        rbTE2a4 = new javax.swing.JRadioButton();
        rbTE6a8 = new javax.swing.JRadioButton();
        rbTE4a6 = new javax.swing.JRadioButton();
        rbTE10a12 = new javax.swing.JRadioButton();
        rbTE8a10 = new javax.swing.JRadioButton();
        rbTEm12 = new javax.swing.JRadioButton();
        rbTEEventual = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        chkTapones = new javax.swing.JCheckBox();
        chkOrejeras = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtHPlomo = new javax.swing.JTextField();
        txtTPlomo = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtHMercurio = new javax.swing.JTextField();
        txtTMercurio = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtHTolueno = new javax.swing.JTextField();
        txtTTolueno = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtHXileno = new javax.swing.JTextField();
        txtTXileno = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtHPlaguic = new javax.swing.JTextField();
        txtTPlaguic = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtHOrganofos = new javax.swing.JTextField();
        txtTOrganofos = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        rbAEPratica_si = new javax.swing.JRadioButton();
        rbAEPratica_no = new javax.swing.JRadioButton();
        rbAEUso_si = new javax.swing.JRadioButton();
        rbAEUso_no = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        rbAEOtros_si = new javax.swing.JRadioButton();
        rbAEOtros_no = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        txtAECuales = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtOOD = new javax.swing.JTextField();
        txtOOI = new javax.swing.JTextField();
        chkOODNormal = new javax.swing.JCheckBox();
        chkOODAnormal = new javax.swing.JCheckBox();
        chkOOINormal = new javax.swing.JCheckBox();
        chkOOIAnormal = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtOD500 = new javax.swing.JTextField();
        txtOD1000 = new javax.swing.JTextField();
        txtOD2000 = new javax.swing.JTextField();
        txtOD3000 = new javax.swing.JTextField();
        txtOD4000 = new javax.swing.JTextField();
        txtOD6000 = new javax.swing.JTextField();
        txtOD8000 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtOI500 = new javax.swing.JTextField();
        txtOI1000 = new javax.swing.JTextField();
        txtOI2000 = new javax.swing.JTextField();
        txtOI3000 = new javax.swing.JTextField();
        txtOI4000 = new javax.swing.JTextField();
        txtOI6000 = new javax.swing.JTextField();
        txtOI8000 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        txtOI501 = new javax.swing.JTextField();
        txtOI1001 = new javax.swing.JTextField();
        txtOI2001 = new javax.swing.JTextField();
        txtOI3001 = new javax.swing.JTextField();
        txtOI4001 = new javax.swing.JTextField();
        txtOI6001 = new javax.swing.JTextField();
        txtOI8001 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtOD501 = new javax.swing.JTextField();
        txtOD1001 = new javax.swing.JTextField();
        txtOD2001 = new javax.swing.JTextField();
        txtOD3001 = new javax.swing.JTextField();
        txtOD4001 = new javax.swing.JTextField();
        txtOD6001 = new javax.swing.JTextField();
        txtOD8001 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        chkDNormal = new javax.swing.JCheckBox();
        chkOtrasHipoacusias = new javax.swing.JCheckBox();
        jLabel47 = new javax.swing.JLabel();
        chkDTALeveOD = new javax.swing.JCheckBox();
        chkDTALeveOI = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        chkDTAAvanzadoOD = new javax.swing.JCheckBox();
        chkDTAAvanzadoOI = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        chkDHRLeveOD = new javax.swing.JCheckBox();
        chkDHRLeveOI = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        chkDHRModeradoOD = new javax.swing.JCheckBox();
        chkDHRModeradoOI = new javax.swing.JCheckBox();
        jLabel51 = new javax.swing.JLabel();
        chkDHRAvanzadaOD = new javax.swing.JCheckBox();
        chkDHRAvanzadaOI = new javax.swing.JCheckBox();
        txtOtrasHipoacusias = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        chkRPASimple = new javax.swing.JCheckBox();
        chkRPADoble = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        chkCASemestral = new javax.swing.JCheckBox();
        chkCAAnual = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        atxtObservacionesAltura = new javax.swing.JScrollPane();
        txtOtrasRecomendaciones = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtImp = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        setClosable(true);
        setTitle("Audiometría");
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

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Síntomas Actuales:"));

        jLabel10.setText("Sordera ");

        jLabel11.setText("Acúfenos ");

        bgSA1.add(rbSASordera_si);
        rbSASordera_si.setText("SI");

        bgSA1.add(rbSASordera_no);
        rbSASordera_no.setText("NO");

        bgSA2.add(rbSAAcufenos_si);
        rbSAAcufenos_si.setText("SI");

        bgSA2.add(rbSAAcufenos_no);
        rbSAAcufenos_no.setText("NO");

        jLabel12.setText("Vértigo ");

        bgSA3.add(rbSAVertigo_si);
        rbSAVertigo_si.setText("SI");

        bgSA3.add(rbSAVertigo_no);
        rbSAVertigo_no.setText("NO");

        jLabel13.setText("Otalgia");

        bgSA4.add(rbSAOtalgia_si);
        rbSAOtalgia_si.setText("SI");

        bgSA4.add(rbSAOtalgia_no);
        rbSAOtalgia_no.setText("NO");

        jLabel14.setText("Secreción Ótica ");

        bgSA5.add(rbSASecrecion_si);
        rbSASecrecion_si.setText("SI");

        bgSA5.add(rbSASecrecion_no);
        rbSASecrecion_no.setText("NO");

        jLabel15.setText("Otros síntomas ORL: ");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addComponent(rbSAOtalgia_si)
                                    .addGap(0, 0, 0)
                                    .addComponent(rbSAOtalgia_no))
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addComponent(rbSAVertigo_si)
                                    .addGap(0, 0, 0)
                                    .addComponent(rbSAVertigo_no)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(rbSASordera_si)
                                .addGap(0, 0, 0)
                                .addComponent(rbSASordera_no))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(rbSAAcufenos_si)
                                .addGap(0, 0, 0)
                                .addComponent(rbSAAcufenos_no))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbSASecrecion_si)
                        .addGap(0, 0, 0)
                        .addComponent(rbSASecrecion_no)))
                .addGap(137, 137, 137))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(txtSAOtrossintomas)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSASordera_si)
                    .addComponent(rbSASordera_no)
                    .addComponent(jLabel10))
                .addGap(0, 0, 0)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSAAcufenos_si)
                    .addComponent(rbSAAcufenos_no)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSAVertigo_si)
                    .addComponent(rbSAVertigo_no)
                    .addComponent(jLabel12))
                .addGap(0, 0, 0)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSAOtalgia_si)
                    .addComponent(rbSAOtalgia_no)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbSASecrecion_si)
                        .addComponent(rbSASecrecion_no)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSAOtrossintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Antecedentes Médicos de importancia: "));

        jLabel16.setText("Rinitis ");

        jLabel17.setText("Sinusitis ");

        bgAM1.add(rbAMRenitis_si);
        rbAMRenitis_si.setText("SI");

        bgAM1.add(rbAMRenitis_no);
        rbAMRenitis_no.setText("NO");

        bgAM2.add(rbAMSinusitis_si);
        rbAMSinusitis_si.setText("SI");

        bgAM2.add(rbAMSinusitis_no);
        rbAMSinusitis_no.setText("NO");

        jLabel18.setText("Otitis Media Crónica ");

        bgAM3.add(rbAMOtitis_si);
        rbAMOtitis_si.setText("SI");

        bgAM3.add(rbAMOtitis_no);
        rbAMOtitis_no.setText("NO");

        jLabel19.setText("Medicamentos Ototóxicos ");

        bgAM4.add(rbAMOtotoxicos_si);
        rbAMOtotoxicos_si.setText("SI");

        bgAM4.add(rbAMOtotoxicos_no);
        rbAMOtotoxicos_no.setText("NO");

        jLabel20.setText("Meningitis ");

        bgAM5.add(rbAMMeningitis_si);
        rbAMMeningitis_si.setText("SI");

        bgAM5.add(rbAMMeningitis_no);
        rbAMMeningitis_no.setText("NO");

        jLabel21.setText("Cuáles:");

        jLabel22.setText("TBC ");

        jLabel23.setText("TEC ");

        jLabel24.setText("Sordera ");

        jLabel25.setText("Parotiditis ");

        jLabel26.setText("Sarampión ");

        bgAM6.add(rbAMTec_si);
        rbAMTec_si.setText("SI");

        bgAM6.add(rbAMTec_no);
        rbAMTec_no.setText("NO");

        bgAM7.add(rbAMSordera_no);
        rbAMSordera_no.setText("NO");

        bgAM7.add(rbAMSordera_si);
        rbAMSordera_si.setText("SI");

        bgAM8.add(rbAMParotiditis_si);
        rbAMParotiditis_si.setText("SI");

        bgAM8.add(rbAMParotiditis_no);
        rbAMParotiditis_no.setText("NO");

        bgAM9.add(rbAMSarampion_no);
        rbAMSarampion_no.setText("NO");

        bgAM9.add(rbAMSarampion_si);
        rbAMSarampion_si.setText("SI");

        bgAM10.add(rbAMTbc_si);
        rbAMTbc_si.setText("SI");

        bgAM10.add(rbAMTbc_no);
        rbAMTbc_no.setText("NO");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAMCuales, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(rbAMOtotoxicos_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbAMOtotoxicos_no))
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(rbAMOtitis_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbAMOtitis_no)))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                            .addComponent(rbAMRenitis_si)
                                            .addGap(0, 0, 0)
                                            .addComponent(rbAMRenitis_no))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                            .addComponent(rbAMSinusitis_si)
                                            .addGap(0, 0, 0)
                                            .addComponent(rbAMSinusitis_no)))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(rbAMMeningitis_si)
                                        .addGap(0, 0, 0)
                                        .addComponent(rbAMMeningitis_no)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(rbAMSarampion_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbAMSarampion_no))
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(rbAMParotiditis_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbAMParotiditis_no)))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                            .addComponent(rbAMTec_si)
                                            .addGap(0, 0, 0)
                                            .addComponent(rbAMTec_no))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                            .addComponent(rbAMSordera_si)
                                            .addGap(0, 0, 0)
                                            .addComponent(rbAMSordera_no)))
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(rbAMTbc_si)
                                        .addGap(0, 0, 0)
                                        .addComponent(rbAMTbc_no)))))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMRenitis_si)
                            .addComponent(rbAMRenitis_no)
                            .addComponent(jLabel16))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMSinusitis_si)
                            .addComponent(rbAMSinusitis_no)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMOtitis_si)
                            .addComponent(rbAMOtitis_no)
                            .addComponent(jLabel18))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMOtotoxicos_si)
                            .addComponent(rbAMOtotoxicos_no)
                            .addComponent(jLabel19))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMMeningitis_si)
                            .addComponent(rbAMMeningitis_no)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMTec_si)
                            .addComponent(rbAMTec_no)
                            .addComponent(jLabel23))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMSordera_si)
                            .addComponent(rbAMSordera_no)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMParotiditis_si)
                            .addComponent(rbAMParotiditis_no)
                            .addComponent(jLabel25))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMSarampion_si)
                            .addComponent(rbAMSarampion_no)
                            .addComponent(jLabel26))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAMTbc_si)
                            .addComponent(rbAMTbc_no)
                            .addComponent(jLabel22))))
                .addGap(5, 5, 5)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAMCuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exposición Ocupacional"));

        jLabel27.setText("Exposición a ruido ");

        jLabel28.setText("Uso de Protectores Auditivos");

        bgEO1.add(rbEOExposicion_si);
        rbEOExposicion_si.setText("SI");

        bgEO1.add(rbEOExposicion_no);
        rbEOExposicion_no.setText("NO");

        bgEO2.add(rbEOProtectores_si);
        rbEOProtectores_si.setText("SI");

        bgEO2.add(rbEOProtectores_no);
        rbEOProtectores_no.setText("NO");

        jLabel29.setText("Exposición a sustancias químicas");

        bgEO3.add(rbEOSustancias_si);
        rbEOSustancias_si.setText("SI");

        bgEO3.add(rbEOSustancias_no);
        rbEOSustancias_no.setText("NO");

        jLabel31.setText("Secreción Ótica ");

        jLabel32.setText("Hrs. / día");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiempo de exposición "));

        bgTE.add(rbTE0a2);
        rbTE0a2.setText("0 a 2 ");

        bgTE.add(rbTE2a4);
        rbTE2a4.setText("2 a 4");

        bgTE.add(rbTE6a8);
        rbTE6a8.setText("6 a 8");

        bgTE.add(rbTE4a6);
        rbTE4a6.setText("4 a 6 ");

        bgTE.add(rbTE10a12);
        rbTE10a12.setText("10 a 12");

        bgTE.add(rbTE8a10);
        rbTE8a10.setText("8 a 10");

        bgTE.add(rbTEm12);
        rbTEm12.setText("> 12 ");

        bgTE.add(rbTEEventual);
        rbTEEventual.setText("Eventual");

        jLabel30.setText("(Promedio de horas por día)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTE0a2)
                            .addComponent(rbTE2a4))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbTE4a6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbTE6a8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTE8a10)
                            .addComponent(rbTE10a12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTEm12)
                            .addComponent(rbTEEventual))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbTE0a2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTE2a4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbTE4a6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTE6a8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbTE8a10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTE10a12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbTEm12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTEEventual))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo de Protectores"));

        chkTapones.setText("Tapones");

        chkOrejeras.setText("Orejeras");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkTapones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkOrejeras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chkTapones)
                .addComponent(chkOrejeras))
        );

        jLabel33.setText("Tpo. (Años)");

        jLabel34.setText("Plomo ");

        jLabel35.setText("Mercurio");

        jLabel36.setText("Tolueno ");

        jLabel37.setText("Xileno ");

        jLabel38.setText("Plaguic.");

        jLabel39.setText("Organofos.");

        jLabel40.setText("Otros (detallar)");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEOOtros, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addComponent(rbEOSustancias_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbEOSustancias_no))
                                            .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addComponent(rbEOExposicion_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbEOExposicion_no))
                                            .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addComponent(rbEOProtectores_si)
                                                .addGap(0, 0, 0)
                                                .addComponent(rbEOProtectores_no))))
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel34))
                                    .addComponent(txtTPlomo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(txtHPlomo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTMercurio)
                                    .addComponent(txtHMercurio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTTolueno)
                                    .addComponent(txtHTolueno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTXileno)
                                    .addComponent(txtHXileno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTPlaguic)
                                    .addComponent(txtHPlaguic, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTOrganofos)
                                    .addComponent(txtHOrganofos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbEOExposicion_si)
                                    .addComponent(rbEOExposicion_no)
                                    .addComponent(jLabel27))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbEOProtectores_si)
                                    .addComponent(rbEOProtectores_no)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbEOSustancias_si)
                                    .addComponent(rbEOSustancias_no)
                                    .addComponent(jLabel29))
                                .addGap(1, 1, 1)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel35))
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(txtHPlomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(txtTPlomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                    .addComponent(txtHTolueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(txtTTolueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtHXileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtTXileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtHPlaguic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtTPlaguic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtHOrganofos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtTOrganofos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39))
                                .addGap(46, 46, 46))))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(txtHMercurio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtTMercurio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addGap(2, 2, 2)
                .addComponent(txtEOOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Antecedentes Extra-Laborales: "));

        jLabel41.setText("Prática de tiro ");

        jLabel42.setText("Uso de Walkman ");

        bgAE1.add(rbAEPratica_si);
        rbAEPratica_si.setText("SI");

        bgAE1.add(rbAEPratica_no);
        rbAEPratica_no.setText("NO");

        bgAE2.add(rbAEUso_si);
        rbAEUso_si.setText("SI");

        bgAE2.add(rbAEUso_no);
        rbAEUso_no.setText("NO");

        jLabel43.setText("Otros ");

        bgAE3.add(rbAEOtros_si);
        rbAEOtros_si.setText("SI");

        bgAE3.add(rbAEOtros_no);
        rbAEOtros_no.setText("NO");

        jLabel46.setText("Cuáles:");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(rbAEOtros_si)
                                .addGap(0, 0, 0)
                                .addComponent(rbAEOtros_no))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(rbAEPratica_si)
                                .addGap(0, 0, 0)
                                .addComponent(rbAEPratica_no))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(rbAEUso_si)
                                .addGap(0, 0, 0)
                                .addComponent(rbAEUso_no))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAECuales, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAEPratica_si)
                    .addComponent(rbAEPratica_no)
                    .addComponent(jLabel41))
                .addGap(0, 0, 0)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAEUso_si)
                    .addComponent(rbAEUso_no)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAEOtros_si)
                    .addComponent(rbAEOtros_no)
                    .addComponent(jLabel43))
                .addGap(5, 5, 5)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtAECuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Otoscopía: "));

        jLabel44.setText("Oído Derecho: ");

        jLabel45.setText("Oído Izquierdo: ");

        chkOODNormal.setText("Normal");
        chkOODNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOODNormalActionPerformed(evt);
            }
        });

        chkOODAnormal.setText("Anormal");
        chkOODAnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOODAnormalActionPerformed(evt);
            }
        });

        chkOOINormal.setText("Normal");
        chkOOINormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOOINormalActionPerformed(evt);
            }
        });

        chkOOIAnormal.setText("Anormal");
        chkOOIAnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOOIAnormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkOODNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOODAnormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOOINormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOOIAnormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addGap(6, 6, 6))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOOD, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOOI, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(chkOODNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkOODAnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(txtOOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkOOINormal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkOOIAnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jTabbedPane2.addTab("PARTE I", jPanel13);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Audiometría Área"));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Derecho"));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("500");
        jLabel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("1000");
        jLabel78.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("2000");
        jLabel79.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("3000");
        jLabel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("4000");
        jLabel81.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("6000");
        jLabel82.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("8000");
        jLabel83.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOD500.setBackground(new java.awt.Color(248, 213, 73));
        txtOD500.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD500.setForeground(new java.awt.Color(0, 102, 204));
        txtOD500.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD500MouseClicked(evt);
            }
        });
        txtOD500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD500ActionPerformed(evt);
            }
        });

        txtOD1000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD1000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD1000MouseClicked(evt);
            }
        });
        txtOD1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD1000ActionPerformed(evt);
            }
        });

        txtOD2000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD2000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD2000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD2000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD2000MouseClicked(evt);
            }
        });
        txtOD2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD2000ActionPerformed(evt);
            }
        });

        txtOD3000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD3000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD3000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD3000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD3000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD3000MouseClicked(evt);
            }
        });
        txtOD3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD3000ActionPerformed(evt);
            }
        });

        txtOD4000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD4000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD4000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD4000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD4000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD4000MouseClicked(evt);
            }
        });
        txtOD4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD4000ActionPerformed(evt);
            }
        });

        txtOD6000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD6000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD6000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD6000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD6000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD6000MouseClicked(evt);
            }
        });
        txtOD6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD6000ActionPerformed(evt);
            }
        });

        txtOD8000.setBackground(new java.awt.Color(248, 213, 73));
        txtOD8000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD8000.setForeground(new java.awt.Color(0, 102, 204));
        txtOD8000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD8000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOD8000MouseClicked(evt);
            }
        });
        txtOD8000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD8000ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("Hz");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("db (A)");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD500, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD1000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD2000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD3000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD4000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD6000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD8000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOD500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD2000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD3000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD4000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD6000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD8000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Izquierdo"));

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("500");
        jLabel68.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("1000");
        jLabel69.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("2000");
        jLabel70.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("3000");
        jLabel71.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("4000");
        jLabel72.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("6000");
        jLabel73.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("8000");
        jLabel74.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOI500.setBackground(new java.awt.Color(248, 213, 73));
        txtOI500.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI500.setForeground(new java.awt.Color(0, 102, 204));
        txtOI500.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI500MouseClicked(evt);
            }
        });
        txtOI500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI500ActionPerformed(evt);
            }
        });

        txtOI1000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI1000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI1000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI1000MouseClicked(evt);
            }
        });
        txtOI1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI1000ActionPerformed(evt);
            }
        });

        txtOI2000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI2000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI2000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI2000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI2000MouseClicked(evt);
            }
        });
        txtOI2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI2000ActionPerformed(evt);
            }
        });

        txtOI3000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI3000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI3000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI3000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI3000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI3000MouseClicked(evt);
            }
        });
        txtOI3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI3000ActionPerformed(evt);
            }
        });

        txtOI4000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI4000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI4000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI4000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI4000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI4000MouseClicked(evt);
            }
        });
        txtOI4000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI4000ActionPerformed(evt);
            }
        });

        txtOI6000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI6000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI6000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI6000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI6000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI6000MouseClicked(evt);
            }
        });
        txtOI6000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI6000ActionPerformed(evt);
            }
        });

        txtOI8000.setBackground(new java.awt.Color(248, 213, 73));
        txtOI8000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI8000.setForeground(new java.awt.Color(0, 102, 204));
        txtOI8000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI8000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOI8000MouseClicked(evt);
            }
        });
        txtOI8000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI8000ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setText("Hz");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 102, 102));
        jLabel76.setText("db (A)");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI500, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI1000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI2000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI3000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI4000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI6000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI8000, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOI500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI2000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI3000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI4000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI6000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI8000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Audiometria Osea"));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Izquierdo"));

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("500");
        jLabel86.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("1000");
        jLabel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("2000");
        jLabel88.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("3000");
        jLabel89.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("4000");
        jLabel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("6000");
        jLabel91.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("8000");
        jLabel92.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOI501.setBackground(new java.awt.Color(248, 213, 73));
        txtOI501.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI501.setForeground(new java.awt.Color(0, 102, 204));
        txtOI501.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI501ActionPerformed(evt);
            }
        });

        txtOI1001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI1001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI1001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI1001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI1001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI1001ActionPerformed(evt);
            }
        });

        txtOI2001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI2001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI2001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI2001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI2001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI2001ActionPerformed(evt);
            }
        });

        txtOI3001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI3001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI3001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI3001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI3001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI3001ActionPerformed(evt);
            }
        });

        txtOI4001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI4001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI4001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI4001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI4001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI4001ActionPerformed(evt);
            }
        });

        txtOI6001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI6001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI6001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI6001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI6001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI6001ActionPerformed(evt);
            }
        });

        txtOI8001.setBackground(new java.awt.Color(248, 213, 73));
        txtOI8001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOI8001.setForeground(new java.awt.Color(0, 102, 204));
        txtOI8001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOI8001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOI8001ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setText("Hz");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 102, 102));
        jLabel94.setText("db (A)");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI501, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI1001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI2001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI3001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI4001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI6001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOI8001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOI501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI2001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI3001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI4001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI6001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOI8001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oido Derecho"));

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("500");
        jLabel95.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("1000");
        jLabel96.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("2000");
        jLabel97.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("3000");
        jLabel98.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("4000");
        jLabel99.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("6000");
        jLabel100.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("8000");
        jLabel101.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOD501.setBackground(new java.awt.Color(248, 213, 73));
        txtOD501.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD501.setForeground(new java.awt.Color(0, 102, 204));
        txtOD501.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD501ActionPerformed(evt);
            }
        });

        txtOD1001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD1001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD1001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD1001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD1001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD1001ActionPerformed(evt);
            }
        });

        txtOD2001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD2001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD2001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD2001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD2001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD2001ActionPerformed(evt);
            }
        });

        txtOD3001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD3001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD3001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD3001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD3001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD3001ActionPerformed(evt);
            }
        });

        txtOD4001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD4001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD4001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD4001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD4001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD4001ActionPerformed(evt);
            }
        });

        txtOD6001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD6001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD6001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD6001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD6001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD6001ActionPerformed(evt);
            }
        });

        txtOD8001.setBackground(new java.awt.Color(248, 213, 73));
        txtOD8001.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOD8001.setForeground(new java.awt.Color(0, 102, 204));
        txtOD8001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOD8001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOD8001ActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(102, 102, 102));
        jLabel102.setText("Hz");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 102, 102));
        jLabel103.setText("db (A)");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD501, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD1001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD2001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD3001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD4001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD6001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOD8001, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOD501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD2001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD3001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD4001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD6001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOD8001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnóstico (Clasificación Klockhoff modificada): "));

        chkDNormal.setText("NORMAL");

        chkOtrasHipoacusias.setText("OTRAS HIPOACUSIAS");

        jLabel47.setText("Trauma Acústico Leve ");

        chkDTALeveOD.setText("OD");

        chkDTALeveOI.setText("OI");

        jLabel48.setText("Trauma Acústico Avanzado");

        chkDTAAvanzadoOD.setText("OD");

        chkDTAAvanzadoOI.setText("OI");

        jLabel49.setText("Hipoacusia Inducida por Ruido, Leve ");

        chkDHRLeveOD.setText("OD");

        chkDHRLeveOI.setText("OI");

        jLabel50.setText("Hipoacusia Inducida por Ruido, Moderada");

        chkDHRModeradoOD.setText("OD");

        chkDHRModeradoOI.setText("OI");

        jLabel51.setText("Hipoacusia Inducida por Ruido, Avanzada ");

        chkDHRAvanzadaOD.setText("OD");

        chkDHRAvanzadaOI.setText("OI");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jButton1.setText("Diagnostico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDNormal)
                                    .addComponent(chkOtrasHipoacusias)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(chkDTAAvanzadoOD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkDTAAvanzadoOI))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(chkDTALeveOD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkDTALeveOI))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(chkDHRLeveOD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chkDHRLeveOI))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(chkDHRAvanzadaOD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkDHRAvanzadaOI))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(chkDHRModeradoOD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkDHRModeradoOI))))))
                .addGap(27, 27, 27))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOtrasHipoacusias)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chkDNormal))
                    .addComponent(jButton1))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkDTALeveOD)
                            .addComponent(chkDTALeveOI))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkDTAAvanzadoOD)
                            .addComponent(chkDTAAvanzadoOI))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkDHRLeveOD)
                            .addComponent(chkDHRLeveOI)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel49)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkDHRModeradoOD)
                        .addComponent(chkDHRModeradoOI))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDHRAvanzadaOD)
                    .addComponent(chkDHRAvanzadaOI)
                    .addComponent(jLabel51))
                .addGap(5, 5, 5)
                .addComponent(chkOtrasHipoacusias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOtrasHipoacusias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Recomendaciones: "));

        jLabel52.setText("Uso adecuado de Protección Auditiva ");

        bgRPA.add(chkRPASimple);
        chkRPASimple.setText("Simple");

        bgRPA.add(chkRPADoble);
        chkRPADoble.setText("Doble");

        jLabel53.setText("Control audiométrico ");

        bgRCA.add(chkCASemestral);
        chkCASemestral.setText("Semestral");

        bgRCA.add(chkCAAnual);
        chkCAAnual.setText("Anual");

        jLabel54.setText("Otras:");

        txtOtrasRecomendaciones.setColumns(20);
        txtOtrasRecomendaciones.setRows(2);
        atxtObservacionesAltura.setViewportView(txtOtrasRecomendaciones);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCASemestral)
                    .addComponent(chkRPASimple))
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRPADoble)
                    .addComponent(chkCAAnual))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atxtObservacionesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRPASimple)
                    .addComponent(chkRPADoble)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(chkCASemestral)
                    .addComponent(chkCAAnual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atxtObservacionesAltura))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 416, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel63.setText("Edad :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEditarAudiom)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtExMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FechaAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel63)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(419, 419, 419))
                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addGap(74, 74, 74)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                        .addComponent(FechaAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar)
                        .addComponent(btnLimpiar))))
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
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtNumero.setEnabled(false);
                        cargarDefecto();
                        Fecha();
                        muestraAudiometria();
                        txtSAOtrossintomas.requestFocus();
                     
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometría:" + ex.getMessage().toString());
        } }}

    }//GEN-LAST:event_txtNumeroActionPerformed
    public void cargarDefecto(){
        txtHPlomo.setText("0");
        txtHMercurio.setText("0");
        txtHTolueno.setText("0");
        txtHXileno.setText("0");
        txtHPlaguic.setText("0");
        txtHOrganofos.setText("0");
        txtTPlomo.setText("0");
        txtTMercurio.setText("0");
        txtTTolueno.setText("0");
        txtTXileno.setText("0");
        txtTPlaguic.setText("0");
        txtTOrganofos.setText("0");
        
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNumero.requestFocusInWindow();
       
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtOI500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI500ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI1000.requestFocus();}
    }//GEN-LAST:event_txtOI500ActionPerformed

    private void txtOI1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI1000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI2000.requestFocus();}
    }//GEN-LAST:event_txtOI1000ActionPerformed

    private void txtOI2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI2000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI3000.requestFocus();}
    }//GEN-LAST:event_txtOI2000ActionPerformed

    private void txtOI3000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI3000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI4000.requestFocus();}
    }//GEN-LAST:event_txtOI3000ActionPerformed

    private void txtOI4000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI4000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI6000.requestFocus();}
    }//GEN-LAST:event_txtOI4000ActionPerformed

    private void txtOI6000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI6000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI8000.requestFocus();}
    }//GEN-LAST:event_txtOI6000ActionPerformed

    private void txtOD500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD500ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD1000.requestFocus();}
    }//GEN-LAST:event_txtOD500ActionPerformed

    private void txtOD1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD1000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD2000.requestFocus();}
    }//GEN-LAST:event_txtOD1000ActionPerformed

    private void txtOD2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD2000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD3000.requestFocus();}
    }//GEN-LAST:event_txtOD2000ActionPerformed

    private void txtOD3000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD3000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD4000.requestFocus();}
    }//GEN-LAST:event_txtOD3000ActionPerformed

    private void txtOD4000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD4000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD6000.requestFocus();}
    }//GEN-LAST:event_txtOD4000ActionPerformed

    private void txtOD6000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD6000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD8000.requestFocus();}
    }//GEN-LAST:event_txtOD6000ActionPerformed

    private void txtOD8000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD8000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI500.requestFocus();}
    }//GEN-LAST:event_txtOD8000ActionPerformed

    private void txtOI501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI501ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI1001.requestFocus();}
    }//GEN-LAST:event_txtOI501ActionPerformed

    private void txtOI1001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI1001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI2001.requestFocus();}
    }//GEN-LAST:event_txtOI1001ActionPerformed

    private void txtOI2001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI2001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI3001.requestFocus();}
    }//GEN-LAST:event_txtOI2001ActionPerformed

    private void txtOI3001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI3001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI4001.requestFocus();}
    }//GEN-LAST:event_txtOI3001ActionPerformed

    private void txtOI4001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI4001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI6001.requestFocus();}
    }//GEN-LAST:event_txtOI4001ActionPerformed

    private void txtOI6001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI6001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI8001.requestFocus();}
    }//GEN-LAST:event_txtOI6001ActionPerformed

    private void txtOD501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD501ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD1001.requestFocus();}
    }//GEN-LAST:event_txtOD501ActionPerformed

    private void txtOD1001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD1001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD2001.requestFocus();}
    }//GEN-LAST:event_txtOD1001ActionPerformed

    private void txtOD2001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD2001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD3001.requestFocus();}
    }//GEN-LAST:event_txtOD2001ActionPerformed

    private void txtOD3001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD3001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD4001.requestFocus();}
    }//GEN-LAST:event_txtOD3001ActionPerformed

    private void txtOD4001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD4001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD6001.requestFocus();}
    }//GEN-LAST:event_txtOD4001ActionPerformed

    private void txtOD6001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD6001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD8001.requestFocus();}
    }//GEN-LAST:event_txtOD6001ActionPerformed

    private void txtOD8001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOD8001ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOI501.requestFocus();}
    }//GEN-LAST:event_txtOD8001ActionPerformed

    private void txtOI8001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI8001ActionPerformed
         if(!txtNumero.getText().isEmpty()){
            txtOtrasHipoacusias.requestFocus();}
    }//GEN-LAST:event_txtOI8001ActionPerformed

    private void txtOI8000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOI8000ActionPerformed
        if(!txtNumero.getText().isEmpty()){
            txtOD501.requestFocus();}
        limpiarDiagnostico();
        if(!txtOD500.getText().isEmpty() && !"N/A".equals(txtOD500.getText())){
           diagnostico(); 
        }
        
    }//GEN-LAST:event_txtOI8000ActionPerformed

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
                    + "a.fecha_au, a.rbsasordera_si, a.rbsasordera_no, a.rbsaacufenos_si, \n" +
"       a.rbsaacufenos_no, a.rbsavertigo_si, a.rbsavertigo_no, a.rbsaotalgia_si, \n" +
"       a.rbsaotalgia_no, a.rbsasecrecion_si, a.rbsasecrecion_no, a.txtsaotrossintomas, \n" +
"       a.rbamrenitis_si, a.rbamrenitis_no, a.rbamsinusitis_si, a.rbamsinusitis_no, \n" +
"       a.rbamotitis_si, a.rbamotitis_no, a.rbamototoxicos_si, a.rbamototoxicos_no, \n" +
"       a.rbammeningitis_si, a.rbammeningitis_no, a.rbamtec_si, a.rbamtec_no, \n" +
"       a.rbamsordera_si, a.rbamsordera_no, a.rbamparotiditis_si, a.rbamparotiditis_no, \n" +
"       a.rbamsarampion_si, a.rbamsarampion_no, a.rbamtbc_si, a.rbamtbc_no, a.txtamcuales, \n" +
"       a.rbeoexposicion_si, a.rbeoexposicion_no, a.rbeoprotectores_si, a.rbeoprotectores_no, \n" +
"       a.rbeosustancias_si, a.rbeosustancias_no, a.rbte0a2, a.rbte2a4, a.rbte4a6, \n" +
"       a.rbte6a8, a.rbte8a10, a.rbte10a12, a.rbtem12, a.rbteeventual, a.chktapones, \n" +
"       a.chkorejeras, a.txthplomo, a.txthmercurio, a.txthtolueno, a.txthxileno, \n" +
"       a.txthplaguic, a.txthorganofos, a.txttplomo, a.txttmercurio, a.txtttolueno, \n" +
"       a.txttxileno, a.txttplaguic, a.txttorganofos, a.txteootros, a.rbaepratica_si, \n" +
"       a.rbaepratica_no, a.rbaeuso_si, a.rbaeuso_no, a.rbaeotros_si, a.rbaeotros_no, \n" +
"       a.txtaecuales, a.txtood, a.txtooi, a.o_d_500, a.o_d_1000, a.o_d_2000, a.o_d_3000, \n" +
"       a.o_d_4000, a.o_d_6000, a.o_d_8000, a.o_i_500, a.o_i_1000, a.o_i_2000, a.o_i_3000, \n" +
"       a.o_i_4000, a.o_i_6000, a.o_i_8000, a.o_d1_500, a.o_d1_1000, a.o_d1_2000, \n" +
"       a.o_d1_3000, a.o_d1_4000, a.o_d1_6000, a.o_d1_8000, a.o_i1_500, a.o_i1_1000, \n" +
"       a.o_i1_2000, a.o_i1_3000, a.o_i1_4000, a.o_i1_6000, a.o_i1_8000, a.chkdnormal, \n" +
"       a.chkdtaleveod, a.chkdtaleveoi, a.chkdtaavanzadood, a.chkdtaavanzadooi, \n" +
"       a.chkdhrleveod, a.chkdhrleveoi, a.chkdhrmoderadood, a.chkdhrmoderadooi, \n" +
"       a.chkdhravanzadaod, a.chkdhravanzadaoi, a.chkotrashipoacusias, a.txtotrashipoacusias, \n" +
"       a.chkrpasimple, a.chkrpadoble, a.chkcasemestral, a.chkcaanual, a.txtotrasrecomendaciones "
                    + "FROM datos_paciente as d "
                    +"INNER JOIN n_orden_ocupacional as n ON (d.cod_pa  = n.cod_pa )"
                    +"INNER JOIN audiometria_2021 as a ON (n.n_orden = a.n_orden)"
                    + "WHERE a.n_orden='"+txtNumero.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa")); 
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtExMedico.setText(oConn.setResult.getString("nom_examen"));
                        FechaAudiometria.setDate(oConn.setResult.getDate("fecha_au"));
                        rbSASordera_si.setSelected(oConn.setResult.getBoolean("rbsasordera_si"));
                        rbSASordera_no.setSelected(oConn.setResult.getBoolean("rbsasordera_no"));
                        rbSAAcufenos_si.setSelected(oConn.setResult.getBoolean("rbsaacufenos_si"));
                        rbSAAcufenos_no.setSelected(oConn.setResult.getBoolean("rbsaacufenos_no"));
                        rbSAVertigo_si.setSelected(oConn.setResult.getBoolean("rbsavertigo_si"));
                        rbSAVertigo_no.setSelected(oConn.setResult.getBoolean("rbsavertigo_no"));
                        rbSAOtalgia_si.setSelected(oConn.setResult.getBoolean("rbsaotalgia_si"));
                        rbSAOtalgia_no.setSelected(oConn.setResult.getBoolean("rbsaotalgia_no"));
                        rbSASecrecion_si.setSelected(oConn.setResult.getBoolean("rbsasecrecion_si"));
                        rbSASecrecion_no.setSelected(oConn.setResult.getBoolean("rbsasecrecion_no"));
                        txtSAOtrossintomas.setText(oConn.setResult.getString("txtsaotrossintomas"));
                        rbAMRenitis_si.setSelected(oConn.setResult.getBoolean("rbamrenitis_si"));
                        rbAMRenitis_no.setSelected(oConn.setResult.getBoolean("rbamrenitis_no"));
                        rbAMSinusitis_si.setSelected(oConn.setResult.getBoolean("rbamsinusitis_si"));
                        rbAMSinusitis_no.setSelected(oConn.setResult.getBoolean("rbamsinusitis_no"));
                        rbAMOtitis_si.setSelected(oConn.setResult.getBoolean("rbamotitis_si"));
                        rbAMOtitis_no.setSelected(oConn.setResult.getBoolean("rbamotitis_no"));
                        rbAMOtotoxicos_si.setSelected(oConn.setResult.getBoolean("rbamototoxicos_si"));
                        rbAMOtotoxicos_no.setSelected(oConn.setResult.getBoolean("rbamototoxicos_no"));
                        rbAMMeningitis_si.setSelected(oConn.setResult.getBoolean("rbammeningitis_si"));
                        rbAMMeningitis_no.setSelected(oConn.setResult.getBoolean("rbammeningitis_no"));
                        rbAMTec_si.setSelected(oConn.setResult.getBoolean("rbamtec_si"));
                        rbAMTec_no.setSelected(oConn.setResult.getBoolean("rbamtec_no"));
                        rbAMSordera_si.setSelected(oConn.setResult.getBoolean("rbamsordera_si"));
                        rbAMSordera_no.setSelected(oConn.setResult.getBoolean("rbamsordera_no"));
                        rbAMParotiditis_si.setSelected(oConn.setResult.getBoolean("rbamparotiditis_si"));
                        rbAMParotiditis_no.setSelected(oConn.setResult.getBoolean("rbamparotiditis_no"));
                        rbAMSarampion_si.setSelected(oConn.setResult.getBoolean("rbamsarampion_si"));
                        rbAMSarampion_no.setSelected(oConn.setResult.getBoolean("rbamsarampion_no"));
                        rbAMTbc_si.setSelected(oConn.setResult.getBoolean("rbamtbc_si"));
                        rbAMTbc_no.setSelected(oConn.setResult.getBoolean("rbamtbc_no"));
                        txtAMCuales.setText(oConn.setResult.getString("txtamcuales"));
                        rbEOExposicion_si.setSelected(oConn.setResult.getBoolean("rbeoexposicion_si"));
                        rbEOExposicion_no.setSelected(oConn.setResult.getBoolean("rbeoexposicion_no"));
                        rbEOProtectores_si.setSelected(oConn.setResult.getBoolean("rbeoprotectores_si"));
                        rbEOProtectores_no.setSelected(oConn.setResult.getBoolean("rbeoprotectores_no"));
                        rbEOSustancias_si.setSelected(oConn.setResult.getBoolean("rbeosustancias_si"));
                        rbEOSustancias_no.setSelected(oConn.setResult.getBoolean("rbeosustancias_no"));
                        rbTE0a2.setSelected(oConn.setResult.getBoolean("rbte0a2"));
                        rbTE2a4.setSelected(oConn.setResult.getBoolean("rbte2a4"));
                        rbTE4a6.setSelected(oConn.setResult.getBoolean("rbte4a6"));
                        rbTE6a8.setSelected(oConn.setResult.getBoolean("rbte6a8"));
                        rbTE8a10.setSelected(oConn.setResult.getBoolean("rbte8a10"));
                        rbTE10a12.setSelected(oConn.setResult.getBoolean("rbte10a12"));
                        rbTEm12.setSelected(oConn.setResult.getBoolean("rbtem12"));
                        rbTEEventual.setSelected(oConn.setResult.getBoolean("rbteeventual"));
                        chkTapones.setSelected(oConn.setResult.getBoolean("chktapones"));
                        chkOrejeras.setSelected(oConn.setResult.getBoolean("chkorejeras"));
                        txtHPlomo.setText(oConn.setResult.getString("txthplomo"));
                        txtHMercurio.setText(oConn.setResult.getString("txthmercurio"));
                        txtHTolueno.setText(oConn.setResult.getString("txthtolueno"));
                        txtHXileno.setText(oConn.setResult.getString("txthxileno"));
                        txtHPlaguic.setText(oConn.setResult.getString("txthplaguic"));
                        txtHOrganofos.setText(oConn.setResult.getString("txthorganofos"));
                        txtTPlomo.setText(oConn.setResult.getString("txttplomo"));
                        txtTMercurio.setText(oConn.setResult.getString("txttmercurio"));
                        txtTTolueno.setText(oConn.setResult.getString("txtttolueno"));
                        txtTXileno.setText(oConn.setResult.getString("txttxileno"));
                        txtTPlaguic.setText(oConn.setResult.getString("txttplaguic"));
                        txtTOrganofos.setText(oConn.setResult.getString("txttorganofos"));
                        txtEOOtros.setText(oConn.setResult.getString("txteootros"));
                        rbAEPratica_si.setSelected(oConn.setResult.getBoolean("rbaepratica_si"));
                        rbAEPratica_no.setSelected(oConn.setResult.getBoolean("rbaepratica_no"));
                        rbAEUso_si.setSelected(oConn.setResult.getBoolean("rbaeuso_si"));
                        rbAEUso_no.setSelected(oConn.setResult.getBoolean("rbaeuso_no"));
                        rbAEOtros_si.setSelected(oConn.setResult.getBoolean("rbaeotros_si"));
                        rbAEOtros_no.setSelected(oConn.setResult.getBoolean("rbaeotros_no"));
                        txtAECuales.setText(oConn.setResult.getString("txtaecuales"));
                        txtOOD.setText(oConn.setResult.getString("txtood"));
                        txtOOI.setText(oConn.setResult.getString("txtooi"));
                        txtOD500.setText(oConn.setResult.getString("o_d_500"));
                        txtOD1000.setText(oConn.setResult.getString("o_d_1000"));
                        txtOD2000.setText(oConn.setResult.getString("o_d_2000"));
                        txtOD3000.setText(oConn.setResult.getString("o_d_3000"));
                        txtOD4000.setText(oConn.setResult.getString("o_d_4000"));
                        txtOD6000.setText(oConn.setResult.getString("o_d_6000"));
                        txtOD8000.setText(oConn.setResult.getString("o_d_8000"));
                        txtOI500.setText(oConn.setResult.getString("o_i_500"));
                        txtOI1000.setText(oConn.setResult.getString("o_i_1000"));
                        txtOI2000.setText(oConn.setResult.getString("o_i_2000"));
                        txtOI3000.setText(oConn.setResult.getString("o_i_3000"));
                        txtOI4000.setText(oConn.setResult.getString("o_i_4000"));
                        txtOI6000.setText(oConn.setResult.getString("o_i_6000"));
                        txtOI8000.setText(oConn.setResult.getString("o_i_8000"));
                        txtOD501.setText(oConn.setResult.getString("o_d1_500"));
                        txtOD1001.setText(oConn.setResult.getString("o_d1_1000"));
                        txtOD2001.setText(oConn.setResult.getString("o_d1_2000"));
                        txtOD3001.setText(oConn.setResult.getString("o_d1_3000"));
                        txtOD4001.setText(oConn.setResult.getString("o_d1_4000"));
                        txtOD6001.setText(oConn.setResult.getString("o_d1_6000"));
                        txtOD8001.setText(oConn.setResult.getString("o_d1_8000"));
                        txtOI501.setText(oConn.setResult.getString("o_i1_500"));
                        txtOI1001.setText(oConn.setResult.getString("o_i1_1000"));
                        txtOI2001.setText(oConn.setResult.getString("o_i1_2000"));
                        txtOI3001.setText(oConn.setResult.getString("o_i1_3000"));
                        txtOI4001.setText(oConn.setResult.getString("o_i1_4000"));
                        txtOI6001.setText(oConn.setResult.getString("o_i1_6000"));
                        txtOI8001.setText(oConn.setResult.getString("o_i1_8000"));
                        chkDNormal.setSelected(oConn.setResult.getBoolean("chkdnormal"));
                        chkDTALeveOD.setSelected(oConn.setResult.getBoolean("chkdtaleveod"));
                        chkDTALeveOI.setSelected(oConn.setResult.getBoolean("chkdtaleveoi"));
                        chkDTAAvanzadoOD.setSelected(oConn.setResult.getBoolean("chkdtaavanzadood"));
                        chkDTAAvanzadoOI.setSelected(oConn.setResult.getBoolean("chkdtaavanzadooi"));
                        chkDHRLeveOD.setSelected(oConn.setResult.getBoolean("chkdhrleveod"));
                        chkDHRLeveOI.setSelected(oConn.setResult.getBoolean("chkdhrleveoi"));
                        chkDHRModeradoOD.setSelected(oConn.setResult.getBoolean("chkdhrmoderadood"));
                        chkDHRModeradoOI.setSelected(oConn.setResult.getBoolean("chkdhrmoderadooi"));
                        chkDHRAvanzadaOD.setSelected(oConn.setResult.getBoolean("chkdhravanzadaod"));
                        chkDHRAvanzadaOI.setSelected(oConn.setResult.getBoolean("chkdhravanzadaoi"));
                        chkOtrasHipoacusias.setSelected(oConn.setResult.getBoolean("chkotrashipoacusias"));
                        txtOtrasHipoacusias.setText(oConn.setResult.getString("txtotrashipoacusias"));
                        
                        chkRPASimple.setSelected(oConn.setResult.getBoolean("chkrpasimple"));
                        chkRPADoble.setSelected(oConn.setResult.getBoolean("chkrpadoble"));
                        chkCASemestral.setSelected(oConn.setResult.getBoolean("chkcasemestral"));
                        chkCAAnual.setSelected(oConn.setResult.getBoolean("chkcaanual"));
                        txtOtrasRecomendaciones.setText(oConn.setResult.getString("txtotrasrecomendaciones"));
                       
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

    private void txtOD500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD500MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD500MouseClicked

    private void txtOD1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD1000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD1000MouseClicked

    private void txtOD2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD2000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD2000MouseClicked

    private void txtOD3000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD3000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD3000MouseClicked

    private void txtOD4000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD4000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD4000MouseClicked

    private void txtOD6000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD6000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD6000MouseClicked

    private void txtOD8000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOD8000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOD8000MouseClicked

    private void txtOI500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI500MouseClicked
       txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI500MouseClicked

    private void txtOI1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI1000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI1000MouseClicked

    private void txtOI2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI2000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI2000MouseClicked

    private void txtOI3000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI3000MouseClicked
       txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI3000MouseClicked

    private void txtOI4000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI4000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI4000MouseClicked

    private void txtOI6000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI6000MouseClicked
        txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI6000MouseClicked

    private void txtOI8000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOI8000MouseClicked
         txtOtrasRecomendaciones.setText(null);
    }//GEN-LAST:event_txtOI8000MouseClicked

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String sCodigo=txtNumero.getText();
        String strSqlStmt;
        String Query ;
        
        if(validar()){
            strSqlStmt="UPDATE audiometria_2021 ";
            Query="SET ";
            if (((JTextField)FechaAudiometria.getDateEditor().getUiComponent()).getText().trim().length()> 1 )
              {Query+= "fecha_au='"+FechaAudiometria.getDate().toString()+ "'";}
            Query += ",rbsasordera_si='"+rbSASordera_si.isSelected()+ "'";
            Query += ",rbsasordera_no='"+rbSASordera_no.isSelected()+ "'";
            Query += ",rbsaacufenos_si='"+rbSAAcufenos_si.isSelected()+ "'";
            Query += ",rbsaacufenos_no='"+rbSAAcufenos_no.isSelected()+ "'";
            Query += ",rbsavertigo_si='"+rbSAVertigo_si.isSelected()+ "'";
            Query += ",rbsavertigo_no='"+rbSAVertigo_no.isSelected()+ "'";
            Query += ",rbsaotalgia_si='"+rbSAOtalgia_si.isSelected()+ "'";
            Query += ",rbsaotalgia_no='"+rbSAOtalgia_no.isSelected()+ "'";
            Query += ",rbsasecrecion_si='"+rbSASecrecion_si.isSelected()+ "'";
            Query += ",rbsasecrecion_no='"+rbSASecrecion_no.isSelected()+ "'";
            Query += ",txtsaotrossintomas='"+txtSAOtrossintomas.getText()+ "'";

            Query += ",rbamrenitis_si='"+rbAMRenitis_si.isSelected()+ "'";
            Query += ",rbamrenitis_no='"+rbAMRenitis_no.isSelected()+ "'";
            Query += ",rbamsinusitis_si='"+rbAMSinusitis_si.isSelected()+ "'";
            Query += ",rbamsinusitis_no='"+rbAMSinusitis_no.isSelected()+ "'";
            Query += ",rbamotitis_si='"+rbAMOtitis_si.isSelected()+ "'";
            Query += ",rbamotitis_no='"+rbAMOtitis_no.isSelected()+ "'";
            Query += ",rbamototoxicos_si='"+rbAMOtotoxicos_si.isSelected()+ "'";
            Query += ",rbamototoxicos_no='"+rbAMOtotoxicos_no.isSelected()+ "'";
            Query += ",rbammeningitis_si='"+rbAMMeningitis_si.isSelected()+ "'";
            Query += ",rbammeningitis_no='"+rbAMMeningitis_no.isSelected()+ "'";
            Query += ",rbamtec_si='"+rbAMTec_si.isSelected()+ "'";
            Query += ",rbamtec_no='"+rbAMTec_no.isSelected()+ "'";
            Query += ",rbamsordera_si='"+rbAMSordera_si.isSelected()+ "'";
            Query += ",rbamsordera_no='"+rbAMSordera_no.isSelected()+ "'";
            Query += ",rbamparotiditis_si='"+rbAMParotiditis_si.isSelected()+ "'";
            Query += ",rbamparotiditis_no='"+rbAMParotiditis_no.isSelected()+ "'";
            Query += ",rbamsarampion_si='"+rbAMSarampion_si.isSelected()+ "'";
            Query += ",rbamsarampion_no='"+rbAMSarampion_no.isSelected()+ "'";
            Query += ",rbamtbc_si='"+rbAMTbc_si.isSelected()+ "'";
            Query += ",rbamtbc_no='"+rbAMTbc_no.isSelected()+ "'";
            Query += ",txtamcuales='"+txtAMCuales.getText()+ "'";
            Query += ",rbeoexposicion_si='"+rbEOExposicion_si.isSelected()+ "'";
            Query += ",rbeoexposicion_no='"+rbEOExposicion_no.isSelected()+ "'";
            Query += ",rbeoprotectores_si='"+rbEOProtectores_si.isSelected()+ "'";
            Query += ",rbeoprotectores_no='"+rbEOProtectores_no.isSelected()+ "'";
            Query += ",rbeosustancias_si='"+rbEOSustancias_si.isSelected()+ "'";
            Query += ",rbeosustancias_no='"+rbEOSustancias_no.isSelected()+ "'";
            Query += ",rbte0a2='"+rbTE0a2.isSelected()+ "'";
            Query += ",rbte2a4='"+rbTE2a4.isSelected()+ "'";
            Query += ",rbte4a6='"+rbTE4a6.isSelected()+ "'";
            Query += ",rbte6a8='"+rbTE6a8.isSelected()+ "'";
            Query += ",rbte8a10='"+rbTE8a10.isSelected()+ "'";
            Query += ",rbte10a12='"+rbTE10a12.isSelected()+ "'";
            Query += ",rbtem12='"+rbTEm12.isSelected()+ "'";
            Query += ",rbteeventual='"+rbTEEventual.isSelected()+ "'";
            Query += ",chktapones='"+chkTapones.isSelected()+ "'";
            Query += ",chkorejeras='"+chkOrejeras.isSelected()+ "'";
            Query += ",txthplomo='"+txtHPlomo.getText()+ "'";
            Query += ",txthmercurio='"+txtHMercurio.getText()+ "'";
            Query += ",txthtolueno='"+txtHTolueno.getText()+ "'";
            Query += ",txthxileno='"+txtHXileno.getText()+ "'";
            Query += ",txthplaguic='"+txtHPlaguic.getText()+ "'";
            Query += ",txthorganofos='"+txtHOrganofos.getText()+ "'";
            Query += ",txttplomo='"+txtTPlomo.getText()+ "'";
            Query += ",txttmercurio='"+txtTMercurio.getText()+ "'";
            Query += ",txtttolueno='"+txtTTolueno.getText()+ "'";
            Query += ",txttxileno='"+txtTXileno.getText()+ "'";
            Query += ",txttplaguic='"+txtTPlaguic.getText()+ "'";
            Query += ",txttorganofos='"+txtTOrganofos.getText()+ "'";
            Query += ",txteootros='"+txtEOOtros.getText()+ "'";
            Query += ",rbaepratica_si='"+rbAEPratica_si.isSelected()+ "'";
            Query += ",rbaepratica_no='"+rbAEPratica_no.isSelected()+ "'";
            Query += ",rbaeuso_si='"+rbAEUso_si.isSelected()+ "'";
            Query += ",rbaeuso_no='"+rbAEUso_no.isSelected()+ "'";
            Query += ",rbaeotros_si='"+rbAEOtros_si.isSelected()+ "'";
            Query += ",rbaeotros_no='"+rbAEOtros_no.isSelected()+ "'";
            Query += ",txtaecuales='"+txtAECuales.getText()+ "'";
            Query += ",txtood='"+txtOOD.getText()+ "'";
            Query += ",txtooi='"+txtOOI.getText()+ "'";
            Query += ",o_d_500='"+txtOD500.getText()+ "'";
            Query += ",o_d_1000='"+txtOD1000.getText()+ "'";
            Query += ",o_d_2000='"+txtOD2000.getText()+ "'";
            Query += ",o_d_3000='"+txtOD3000.getText()+ "'";
            Query += ",o_d_4000='"+txtOD4000.getText()+ "'";
            Query += ",o_d_6000='"+txtOD6000.getText()+ "'";
            Query += ",o_d_8000='"+txtOD8000.getText()+ "'";
            Query += ",o_i_500='"+txtOI500.getText()+ "'";
            Query += ",o_i_1000='"+txtOI1000.getText()+ "'";
            Query += ",o_i_2000='"+txtOI2000.getText()+ "'";
            Query += ",o_i_3000='"+txtOI3000.getText()+ "'";
            Query += ",o_i_4000='"+txtOI4000.getText()+ "'";
            Query += ",o_i_6000='"+txtOI6000.getText()+ "'";
            Query += ",o_i_8000='"+txtOI8000.getText()+ "'";
            Query += ",o_d1_500='"+txtOD501.getText()+ "'";
            Query += ",o_d1_1000='"+txtOD1001.getText()+ "'";
            Query += ",o_d1_2000='"+txtOD2001.getText()+ "'";
            Query += ",o_d1_3000='"+txtOD3001.getText()+ "'";
            Query += ",o_d1_4000='"+txtOD4001.getText()+ "'";
            Query += ",o_d1_6000='"+txtOD6001.getText()+ "'";
            Query += ",o_d1_8000='"+txtOD8001.getText()+ "'";
            Query += ",o_i1_500='"+txtOI501.getText()+ "'";
            Query += ",o_i1_1000='"+txtOI1001.getText()+ "'";
            Query += ",o_i1_2000='"+txtOI2001.getText()+ "'";
            Query += ",o_i1_3000='"+txtOI3001.getText()+ "'";
            Query += ",o_i1_4000='"+txtOI4001.getText()+ "'";
            Query += ",o_i1_6000='"+txtOI6001.getText()+ "'";
            Query += ",o_i1_8000='"+txtOI8001.getText()+ "'";
            Query += ",chkdnormal='"+chkDNormal.isSelected()+ "'";
            Query += ",chkdtaleveod='"+chkDTALeveOD.isSelected()+ "'";
            Query += ",chkdtaleveoi='"+chkDTALeveOI.isSelected()+ "'";
            Query += ",chkdtaavanzadood='"+chkDTAAvanzadoOD.isSelected()+ "'";
            Query += ",chkdtaavanzadooi='"+chkDTAAvanzadoOI.isSelected()+ "'";
            Query += ",chkdhrleveod='"+chkDHRLeveOD.isSelected()+ "'";
            Query += ",chkdhrleveoi='"+chkDHRLeveOI.isSelected()+ "'";
            Query += ",chkdhrmoderadood='"+chkDHRModeradoOD.isSelected()+ "'";
            Query += ",chkdhrmoderadooi='"+chkDHRModeradoOI.isSelected()+ "'";
            Query += ",chkdhravanzadaod='"+chkDHRAvanzadaOD.isSelected()+ "'";
            Query += ",chkdhravanzadaoi='"+chkDHRAvanzadaOI.isSelected()+ "'";
            Query += ",chkotrashipoacusias='"+chkOtrasHipoacusias.isSelected()+ "'";
            Query += ",txtotrashipoacusias='"+txtOtrasHipoacusias.getText()+ "'";
            Query += ",chkrpasimple='"+chkRPASimple.isSelected()+ "'"; 
            Query += ",chkrpadoble='"+chkRPADoble.isSelected()+ "'"; 
            Query += ",chkcasemestral='"+chkCASemestral.isSelected()+ "'";
            Query += ",chkcaanual='"+chkCAAnual.isSelected()+ "'";
            Query += ",txtotrasrecomendaciones='"+txtOtrasRecomendaciones.getText()+ "'";
            Query +=" WHERE n_orden='" + sCodigo + "'";
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
          
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query)){
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado con Éxito");
                imprimir1();
                Limpiar();  
                btnGuardar.setEnabled(true);
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
                Agregar();
//                if (oFunc.fnIntSistemaPregunta("Desea realmente Agregar el Registro")==JOptionPane.YES_OPTION){
//                    //datosGrafico();
//                }
            }else{oFunc.SubSistemaMensajeError("Llene los campos");
                }
            }else{oFunc.SubSistemaMensajeError("Llene los campos o Falta Diagnostico");}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Deshabilitar(true);
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chkOODNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOODNormalActionPerformed
        // TODO add your handling code here:
        if(chkOODNormal.isSelected()){
            txtOOD.setText("NORMAL");
        }
    }//GEN-LAST:event_chkOODNormalActionPerformed

    private void chkOODAnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOODAnormalActionPerformed
        // TODO add your handling code here:
        if(chkOODAnormal.isSelected()){
            txtOOD.setText("ANORMAL");
        }
    }//GEN-LAST:event_chkOODAnormalActionPerformed

    private void chkOOINormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOOINormalActionPerformed
        // TODO add your handling code here:
        if(chkOOINormal.isSelected()){
            txtOOI.setText("NORMAL");
        }
    }//GEN-LAST:event_chkOOINormalActionPerformed

    private void chkOOIAnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOOIAnormalActionPerformed
        // TODO add your handling code here:
        if(chkOOIAnormal.isSelected()){
            txtOOI.setText("ANORMAL");
        }
    }//GEN-LAST:event_chkOOIAnormalActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ReImp();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         limpiarDiagnostico();
        if(!txtOD500.getText().isEmpty() && !"N/A".equals(txtOD500.getText())){
           diagnostico(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void Fecha(){
Date fechaDate = new Date();
//SimpleDateFormat formateador = new SimpleDateFormat("'HUAMACHUCO - ' EEEEE dd MMMMM yyyy");
FechaAudiometria.setDate(fechaDate);
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
        String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Audiometria2021.jasper";
        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
        JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
        JasperViewer viewer = new JasperViewer(myPrint, false);
        viewer.setTitle("Ficha Audiologica");
        //viewer.setAlwaysOnTop(true);
        viewer.setVisible(true);
     } catch (JRException ex) {
        Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
    }
            
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaAudiometria;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JScrollPane atxtObservacionesAltura;
    private javax.swing.ButtonGroup bgAE1;
    private javax.swing.ButtonGroup bgAE2;
    private javax.swing.ButtonGroup bgAE3;
    private javax.swing.ButtonGroup bgAM1;
    private javax.swing.ButtonGroup bgAM10;
    private javax.swing.ButtonGroup bgAM2;
    private javax.swing.ButtonGroup bgAM3;
    private javax.swing.ButtonGroup bgAM4;
    private javax.swing.ButtonGroup bgAM5;
    private javax.swing.ButtonGroup bgAM6;
    private javax.swing.ButtonGroup bgAM7;
    private javax.swing.ButtonGroup bgAM8;
    private javax.swing.ButtonGroup bgAM9;
    private javax.swing.ButtonGroup bgEO1;
    private javax.swing.ButtonGroup bgEO2;
    private javax.swing.ButtonGroup bgEO3;
    private javax.swing.ButtonGroup bgRCA;
    private javax.swing.ButtonGroup bgRPA;
    private javax.swing.ButtonGroup bgSA1;
    private javax.swing.ButtonGroup bgSA2;
    private javax.swing.ButtonGroup bgSA3;
    private javax.swing.ButtonGroup bgSA4;
    private javax.swing.ButtonGroup bgSA5;
    private javax.swing.ButtonGroup bgTE;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditarAudiom;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkCAAnual;
    private javax.swing.JCheckBox chkCASemestral;
    private javax.swing.JCheckBox chkDHRAvanzadaOD;
    private javax.swing.JCheckBox chkDHRAvanzadaOI;
    private javax.swing.JCheckBox chkDHRLeveOD;
    private javax.swing.JCheckBox chkDHRLeveOI;
    private javax.swing.JCheckBox chkDHRModeradoOD;
    private javax.swing.JCheckBox chkDHRModeradoOI;
    private javax.swing.JCheckBox chkDNormal;
    private javax.swing.JCheckBox chkDTAAvanzadoOD;
    private javax.swing.JCheckBox chkDTAAvanzadoOI;
    private javax.swing.JCheckBox chkDTALeveOD;
    private javax.swing.JCheckBox chkDTALeveOI;
    private javax.swing.JCheckBox chkOODAnormal;
    private javax.swing.JCheckBox chkOODNormal;
    private javax.swing.JCheckBox chkOOIAnormal;
    private javax.swing.JCheckBox chkOOINormal;
    private javax.swing.JCheckBox chkOrejeras;
    private javax.swing.JCheckBox chkOtrasHipoacusias;
    private javax.swing.JCheckBox chkRPADoble;
    private javax.swing.JCheckBox chkRPASimple;
    private javax.swing.JCheckBox chkTapones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton rbAEOtros_no;
    private javax.swing.JRadioButton rbAEOtros_si;
    private javax.swing.JRadioButton rbAEPratica_no;
    private javax.swing.JRadioButton rbAEPratica_si;
    private javax.swing.JRadioButton rbAEUso_no;
    private javax.swing.JRadioButton rbAEUso_si;
    private javax.swing.JRadioButton rbAMMeningitis_no;
    private javax.swing.JRadioButton rbAMMeningitis_si;
    private javax.swing.JRadioButton rbAMOtitis_no;
    private javax.swing.JRadioButton rbAMOtitis_si;
    private javax.swing.JRadioButton rbAMOtotoxicos_no;
    private javax.swing.JRadioButton rbAMOtotoxicos_si;
    private javax.swing.JRadioButton rbAMParotiditis_no;
    private javax.swing.JRadioButton rbAMParotiditis_si;
    private javax.swing.JRadioButton rbAMRenitis_no;
    private javax.swing.JRadioButton rbAMRenitis_si;
    private javax.swing.JRadioButton rbAMSarampion_no;
    private javax.swing.JRadioButton rbAMSarampion_si;
    private javax.swing.JRadioButton rbAMSinusitis_no;
    private javax.swing.JRadioButton rbAMSinusitis_si;
    private javax.swing.JRadioButton rbAMSordera_no;
    private javax.swing.JRadioButton rbAMSordera_si;
    private javax.swing.JRadioButton rbAMTbc_no;
    private javax.swing.JRadioButton rbAMTbc_si;
    private javax.swing.JRadioButton rbAMTec_no;
    private javax.swing.JRadioButton rbAMTec_si;
    private javax.swing.JRadioButton rbEOExposicion_no;
    private javax.swing.JRadioButton rbEOExposicion_si;
    private javax.swing.JRadioButton rbEOProtectores_no;
    private javax.swing.JRadioButton rbEOProtectores_si;
    private javax.swing.JRadioButton rbEOSustancias_no;
    private javax.swing.JRadioButton rbEOSustancias_si;
    private javax.swing.JRadioButton rbSAAcufenos_no;
    private javax.swing.JRadioButton rbSAAcufenos_si;
    private javax.swing.JRadioButton rbSAOtalgia_no;
    private javax.swing.JRadioButton rbSAOtalgia_si;
    private javax.swing.JRadioButton rbSASecrecion_no;
    private javax.swing.JRadioButton rbSASecrecion_si;
    private javax.swing.JRadioButton rbSASordera_no;
    private javax.swing.JRadioButton rbSASordera_si;
    private javax.swing.JRadioButton rbSAVertigo_no;
    private javax.swing.JRadioButton rbSAVertigo_si;
    private javax.swing.JRadioButton rbTE0a2;
    private javax.swing.JRadioButton rbTE10a12;
    private javax.swing.JRadioButton rbTE2a4;
    private javax.swing.JRadioButton rbTE4a6;
    private javax.swing.JRadioButton rbTE6a8;
    private javax.swing.JRadioButton rbTE8a10;
    private javax.swing.JRadioButton rbTEEventual;
    private javax.swing.JRadioButton rbTEm12;
    private javax.swing.JTextField txtAECuales;
    private javax.swing.JTextField txtAMCuales;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEOOtros;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtExMedico;
    private javax.swing.JTextField txtHMercurio;
    private javax.swing.JTextField txtHOrganofos;
    private javax.swing.JTextField txtHPlaguic;
    private javax.swing.JTextField txtHPlomo;
    private javax.swing.JTextField txtHTolueno;
    private javax.swing.JTextField txtHXileno;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOD1000;
    private javax.swing.JTextField txtOD1001;
    private javax.swing.JTextField txtOD2000;
    private javax.swing.JTextField txtOD2001;
    private javax.swing.JTextField txtOD3000;
    private javax.swing.JTextField txtOD3001;
    private javax.swing.JTextField txtOD4000;
    private javax.swing.JTextField txtOD4001;
    private javax.swing.JTextField txtOD500;
    private javax.swing.JTextField txtOD501;
    private javax.swing.JTextField txtOD6000;
    private javax.swing.JTextField txtOD6001;
    private javax.swing.JTextField txtOD8000;
    private javax.swing.JTextField txtOD8001;
    private javax.swing.JTextField txtOI1000;
    private javax.swing.JTextField txtOI1001;
    private javax.swing.JTextField txtOI2000;
    private javax.swing.JTextField txtOI2001;
    private javax.swing.JTextField txtOI3000;
    private javax.swing.JTextField txtOI3001;
    private javax.swing.JTextField txtOI4000;
    private javax.swing.JTextField txtOI4001;
    private javax.swing.JTextField txtOI500;
    private javax.swing.JTextField txtOI501;
    private javax.swing.JTextField txtOI6000;
    private javax.swing.JTextField txtOI6001;
    private javax.swing.JTextField txtOI8000;
    private javax.swing.JTextField txtOI8001;
    private javax.swing.JTextField txtOOD;
    private javax.swing.JTextField txtOOI;
    private javax.swing.JTextField txtOtrasHipoacusias;
    private javax.swing.JTextArea txtOtrasRecomendaciones;
    private javax.swing.JTextField txtSAOtrossintomas;
    private javax.swing.JTextField txtTMercurio;
    private javax.swing.JTextField txtTOrganofos;
    private javax.swing.JTextField txtTPlaguic;
    private javax.swing.JTextField txtTPlomo;
    private javax.swing.JTextField txtTTolueno;
    private javax.swing.JTextField txtTXileno;
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
    FechaAudiometria.setDate(null);
    
    bgSA1.clearSelection();
    bgSA2.clearSelection();
    bgSA3.clearSelection();
    bgSA4.clearSelection();
    bgSA5.clearSelection();
    txtSAOtrossintomas.setText(null);
    bgAM1.clearSelection();
    bgAM2.clearSelection();
    bgAM3.clearSelection();
    bgAM4.clearSelection();
    bgAM5.clearSelection();
    bgAM6.clearSelection();
    bgAM7.clearSelection();
    bgAM8.clearSelection();
    bgAM9.clearSelection();
    bgAM10.clearSelection();
    txtAMCuales.setText(null);
    bgEO1.clearSelection();
    bgEO2.clearSelection();
    bgEO3.clearSelection();
    txtHPlomo.setText(null);
    txtHMercurio.setText(null);
    txtHTolueno.setText(null);
    txtHXileno.setText(null);
    txtHPlaguic.setText(null);
    txtHOrganofos.setText(null);
    txtTPlomo.setText(null);
    txtTMercurio.setText(null);
    txtTTolueno.setText(null);
    txtTXileno.setText(null);
    txtTPlaguic.setText(null);
    txtTOrganofos.setText(null);
    txtEOOtros.setText(null);
    txtAECuales.setText(null);
    txtOOD.setText(null);
    txtOOI.setText(null);
    bgTE.clearSelection();
    bgAE1.clearSelection();
    bgAE2.clearSelection();
    bgAE3.clearSelection();
   
    
    txtOD500.setText(null);
    txtOD1000.setText(null);
    txtOD2000.setText(null);
    txtOD3000.setText(null);
    txtOD4000.setText(null);
    txtOD6000.setText(null);
    txtOD8000.setText(null);
    txtOI500.setText(null);
    txtOI1000.setText(null);
    txtOI2000.setText(null);
    txtOI3000.setText(null);
    txtOI4000.setText(null);
    txtOI6000.setText(null);
    txtOI8000.setText(null);
    txtOD501.setText(null);
    txtOD1001.setText(null);
    txtOD2001.setText(null);
    txtOD3001.setText(null);
    txtOD4001.setText(null);
    txtOD6001.setText(null);
    txtOD8001.setText(null);
    txtOI501.setText(null);
    txtOI1001.setText(null);
    txtOI2001.setText(null);
    txtOI3001.setText(null);
    txtOI4001.setText(null);
    txtOI6001.setText(null);
    txtOI8001.setText(null);
    chkDNormal.setSelected(false);
    chkOtrasHipoacusias.setSelected(false);
    bgRPA.clearSelection();
    bgRCA.clearSelection();
    txtOtrasHipoacusias.setText(null);
    txtOtrasRecomendaciones.setText(null);
//    btnGuardar.setEnabled(false);
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
    txtEdad.setEnabled(false);
    
}
public void Agregar(){
    if(!OrdenExiste()){
        if(validar()){
            String strSqlStmt;
            String Query ;
            strSqlStmt="INSERT INTO audiometria_2021(";
            Query="Values('";
            strSqlStmt += "n_orden";Query += txtNumero.getText()+ "'";
            strSqlStmt += ",fecha_au";Query += ",'"+FechaAudiometria.getDate()+ "'";
            strSqlStmt += ",rbsasordera_si";Query += ",'"+rbSASordera_si.isSelected()+ "'";
            strSqlStmt += ",rbsasordera_no";Query += ",'"+rbSASordera_no.isSelected()+ "'";
            strSqlStmt += ",rbsaacufenos_si";Query += ",'"+rbSAAcufenos_si.isSelected()+ "'";
            strSqlStmt += ",rbsaacufenos_no";Query += ",'"+rbSAAcufenos_no.isSelected()+ "'";
            strSqlStmt += ",rbsavertigo_si";Query += ",'"+rbSAVertigo_si.isSelected()+ "'";
            strSqlStmt += ",rbsavertigo_no";Query += ",'"+rbSAVertigo_no.isSelected()+ "'";
            strSqlStmt += ",rbsaotalgia_si";Query += ",'"+rbSAOtalgia_si.isSelected()+ "'";
            strSqlStmt += ",rbsaotalgia_no";Query += ",'"+rbSAOtalgia_no.isSelected()+ "'";
            strSqlStmt += ",rbsasecrecion_si";Query += ",'"+rbSASecrecion_si.isSelected()+ "'";
            strSqlStmt += ",rbsasecrecion_no";Query += ",'"+rbSASecrecion_no.isSelected()+ "'";
            strSqlStmt += ",txtsaotrossintomas";Query += ",'"+txtSAOtrossintomas.getText()+ "'";
            strSqlStmt += ",rbamrenitis_si";Query += ",'"+rbAMRenitis_si.isSelected()+ "'";
            strSqlStmt += ",rbamrenitis_no";Query += ",'"+rbAMRenitis_no.isSelected()+ "'";            
            strSqlStmt += ",rbamsinusitis_si";Query += ",'"+rbAMSinusitis_si.isSelected()+ "'";
            strSqlStmt += ",rbamsinusitis_no";Query += ",'"+rbAMSinusitis_no.isSelected()+ "'";            
            strSqlStmt += ",rbamotitis_si";Query += ",'"+rbAMOtitis_si.isSelected()+ "'";
            strSqlStmt += ",rbamotitis_no";Query += ",'"+rbAMOtitis_no.isSelected()+ "'";            
            strSqlStmt += ",rbamototoxicos_si";Query += ",'"+rbAMOtotoxicos_si.isSelected()+ "'";
            strSqlStmt += ",rbamototoxicos_no";Query += ",'"+rbAMOtotoxicos_no.isSelected()+ "'";            
            strSqlStmt += ",rbammeningitis_si";Query += ",'"+rbAMMeningitis_si.isSelected()+ "'";
            strSqlStmt += ",rbammeningitis_no";Query += ",'"+rbAMMeningitis_no.isSelected()+ "'";            
            strSqlStmt += ",rbamtec_si";Query += ",'"+rbAMTec_si.isSelected()+ "'";
            strSqlStmt += ",rbamtec_no";Query += ",'"+rbAMTec_no.isSelected()+ "'";            
            strSqlStmt += ",rbamsordera_si";Query += ",'"+rbAMSordera_si.isSelected()+ "'";
            strSqlStmt += ",rbamsordera_no";Query += ",'"+rbAMSordera_no.isSelected()+ "'";           
            strSqlStmt += ",rbamparotiditis_si";Query += ",'"+rbAMParotiditis_si.isSelected()+ "'";
            strSqlStmt += ",rbamparotiditis_no";Query += ",'"+rbAMParotiditis_no.isSelected()+ "'";            
            strSqlStmt += ",rbamsarampion_si";Query += ",'"+rbAMSarampion_si.isSelected()+ "'";
            strSqlStmt += ",rbamsarampion_no";Query += ",'"+rbAMSarampion_no.isSelected()+ "'";            
            strSqlStmt += ",rbamtbc_si";Query += ",'"+rbAMTbc_si.isSelected()+ "'";
            strSqlStmt += ",rbamtbc_no";Query += ",'"+rbAMTbc_no.isSelected()+ "'";            
            strSqlStmt += ",txtamcuales";Query += ",'"+txtAMCuales.getText()+ "'";            
            strSqlStmt += ",rbeoexposicion_si";Query += ",'"+rbEOExposicion_si.isSelected()+ "'";
            strSqlStmt += ",rbeoexposicion_no";Query += ",'"+rbEOExposicion_no.isSelected()+ "'";            
            strSqlStmt += ",rbeoprotectores_si";Query += ",'"+rbEOProtectores_si.isSelected()+ "'";
            strSqlStmt += ",rbeoprotectores_no";Query += ",'"+rbEOProtectores_no.isSelected()+ "'";            
            strSqlStmt += ",rbeosustancias_si";Query += ",'"+rbEOSustancias_si.isSelected()+ "'";
            strSqlStmt += ",rbeosustancias_no";Query += ",'"+rbEOSustancias_no.isSelected()+ "'";             
            strSqlStmt += ",rbte0a2";Query += ",'"+rbTE0a2.isSelected()+ "'";
            strSqlStmt += ",rbte2a4";Query += ",'"+rbTE2a4.isSelected()+ "'";            
            strSqlStmt += ",rbte4a6";Query += ",'"+rbTE4a6.isSelected()+ "'";
            strSqlStmt += ",rbte6a8";Query += ",'"+rbTE6a8.isSelected()+ "'";            
            strSqlStmt += ",rbte8a10";Query += ",'"+rbTE8a10.isSelected()+ "'";
            strSqlStmt += ",rbte10a12";Query += ",'"+rbTE10a12.isSelected()+ "'"; 
            strSqlStmt += ",rbtem12";Query += ",'"+rbTEm12.isSelected()+ "'";
            strSqlStmt += ",rbteeventual";Query += ",'"+rbTEEventual.isSelected()+ "'";
            strSqlStmt += ",chktapones";Query += ",'"+chkTapones.isSelected()+ "'";
            strSqlStmt += ",chkorejeras";Query += ",'"+chkOrejeras.isSelected()+ "'";      
            strSqlStmt += ",txthplomo";Query += ",'"+txtHPlomo.getText()+ "'";       
            strSqlStmt += ",txthmercurio";Query += ",'"+txtHMercurio.getText()+ "'";       
            strSqlStmt += ",txthtolueno";Query += ",'"+txtHTolueno.getText()+ "'";       
            strSqlStmt += ",txthxileno";Query += ",'"+txtHXileno.getText()+ "'";       
            strSqlStmt += ",txthplaguic";Query += ",'"+txtHPlaguic.getText()+ "'";       
            strSqlStmt += ",txthorganofos";Query += ",'"+txtHOrganofos.getText()+ "'";  
            strSqlStmt += ",txttplomo";Query += ",'"+txtTPlomo.getText()+ "'";       
            strSqlStmt += ",txttmercurio";Query += ",'"+txtTMercurio.getText()+ "'";       
            strSqlStmt += ",txtttolueno";Query += ",'"+txtTTolueno.getText()+ "'";       
            strSqlStmt += ",txttxileno";Query += ",'"+txtTXileno.getText()+ "'";       
            strSqlStmt += ",txttplaguic";Query += ",'"+txtTPlaguic.getText()+ "'";       
            strSqlStmt += ",txttorganofos";Query += ",'"+txtTOrganofos.getText()+ "'";    
            strSqlStmt += ",txteootros";Query += ",'"+txtEOOtros.getText()+ "'";            
            strSqlStmt += ",rbaepratica_si";Query += ",'"+rbAEPratica_si.isSelected()+ "'";
            strSqlStmt += ",rbaepratica_no";Query += ",'"+rbAEPratica_no.isSelected()+ "'";            
            strSqlStmt += ",rbaeuso_si";Query += ",'"+rbAEUso_si.isSelected()+ "'";
            strSqlStmt += ",rbaeuso_no";Query += ",'"+rbAEUso_no.isSelected()+ "'";            
            strSqlStmt += ",rbaeotros_si";Query += ",'"+rbAEOtros_si.isSelected()+ "'";
            strSqlStmt += ",rbaeotros_no";Query += ",'"+rbAEOtros_no.isSelected()+ "'"; 
            strSqlStmt += ",txtaecuales";Query += ",'"+txtAECuales.getText()+ "'"; 
            strSqlStmt += ",txtood";Query += ",'"+txtOOD.getText()+ "'"; 
            strSqlStmt += ",txtooi";Query += ",'"+txtOOI.getText()+ "'";             
            strSqlStmt += ",o_d_500";Query += ",'"+txtOD500.getText()+ "'"; 
            strSqlStmt += ",o_d_1000";Query += ",'"+txtOD1000.getText()+ "'"; 
            strSqlStmt += ",o_d_2000";Query += ",'"+txtOD2000.getText()+ "'"; 
            strSqlStmt += ",o_d_3000";Query += ",'"+txtOD3000.getText()+ "'"; 
            strSqlStmt += ",o_d_4000";Query += ",'"+txtOD4000.getText()+ "'"; 
            strSqlStmt += ",o_d_6000";Query += ",'"+txtOD6000.getText()+ "'"; 
            strSqlStmt += ",o_d_8000";Query += ",'"+txtOD8000.getText()+ "'"; 
            strSqlStmt += ",o_i_500";Query += ",'"+txtOI500.getText()+ "'"; 
            strSqlStmt += ",o_i_1000";Query += ",'"+txtOI1000.getText()+ "'"; 
            strSqlStmt += ",o_i_2000";Query += ",'"+txtOI2000.getText()+ "'"; 
            strSqlStmt += ",o_i_3000";Query += ",'"+txtOI3000.getText()+ "'"; 
            strSqlStmt += ",o_i_4000";Query += ",'"+txtOI4000.getText()+ "'"; 
            strSqlStmt += ",o_i_6000";Query += ",'"+txtOI6000.getText()+ "'"; 
            strSqlStmt += ",o_i_8000";Query += ",'"+txtOI8000.getText()+ "'"; 
            strSqlStmt += ",o_d1_500";Query += ",'"+txtOD501.getText()+ "'"; 
            strSqlStmt += ",o_d1_1000";Query += ",'"+txtOD1001.getText()+ "'"; 
            strSqlStmt += ",o_d1_2000";Query += ",'"+txtOD2001.getText()+ "'"; 
            strSqlStmt += ",o_d1_3000";Query += ",'"+txtOD3001.getText()+ "'"; 
            strSqlStmt += ",o_d1_4000";Query += ",'"+txtOD4001.getText()+ "'"; 
            strSqlStmt += ",o_d1_6000";Query += ",'"+txtOD6001.getText()+ "'"; 
            strSqlStmt += ",o_d1_8000";Query += ",'"+txtOD8001.getText()+ "'"; 
            strSqlStmt += ",o_i1_500";Query += ",'"+txtOI501.getText()+ "'"; 
            strSqlStmt += ",o_i1_1000";Query += ",'"+txtOI1001.getText()+ "'"; 
            strSqlStmt += ",o_i1_2000";Query += ",'"+txtOI2001.getText()+ "'"; 
            strSqlStmt += ",o_i1_3000";Query += ",'"+txtOI3001.getText()+ "'"; 
            strSqlStmt += ",o_i1_4000";Query += ",'"+txtOI4001.getText()+ "'"; 
            strSqlStmt += ",o_i1_6000";Query += ",'"+txtOI6001.getText()+ "'"; 
            strSqlStmt += ",o_i1_8000";Query += ",'"+txtOI8001.getText()+ "'"; 
            strSqlStmt += ",chkdnormal";Query += ",'"+chkDNormal.isSelected()+ "'";
            strSqlStmt += ",chkdtaleveod";Query += ",'"+chkDTALeveOD.isSelected()+ "'";            
            strSqlStmt += ",chkdtaleveoi";Query += ",'"+chkDTALeveOD.isSelected()+ "'";
            strSqlStmt += ",chkdtaavanzadood";Query += ",'"+chkDTAAvanzadoOD.isSelected()+ "'";            
            strSqlStmt += ",chkdtaavanzadooi";Query += ",'"+chkDTAAvanzadoOI.isSelected()+ "'";
            strSqlStmt += ",chkdhrleveod";Query += ",'"+chkDHRLeveOD.isSelected()+ "'"; 
            strSqlStmt += ",chkdhrleveoi";Query += ",'"+chkDHRLeveOI.isSelected()+ "'"; 
            strSqlStmt += ",chkdhrmoderadood";Query += ",'"+chkDHRModeradoOD.isSelected()+ "'"; 
            strSqlStmt += ",chkdhrmoderadooi";Query += ",'"+chkDHRModeradoOI.isSelected()+ "'";
            strSqlStmt += ",chkdhravanzadaod";Query += ",'"+chkDHRAvanzadaOD.isSelected()+ "'"; 
            strSqlStmt += ",chkdhravanzadaoi";Query += ",'"+chkDHRAvanzadaOI.isSelected()+ "'";
            strSqlStmt += ",chkotrashipoacusias";Query += ",'"+chkOtrasHipoacusias.isSelected()+ "'";
            strSqlStmt += ",txtotrashipoacusias";Query += ",'"+txtOtrasHipoacusias.getText()+ "'";
            strSqlStmt += ",chkrpasimple";Query += ",'"+chkRPASimple.isSelected()+ "'";
            strSqlStmt += ",chkrpadoble";Query += ",'"+chkRPADoble.isSelected()+ "'"; 
            strSqlStmt += ",chkcasemestral";Query += ",'"+chkCASemestral.isSelected()+ "'";
            strSqlStmt += ",chkcaanual";Query += ",'"+chkCAAnual.isSelected()+ "'";
            strSqlStmt += ",txtotrasrecomendaciones";Query += ",'"+txtOtrasRecomendaciones.getText()+ "'";
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
    if (((JTextField)FechaAudiometria.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
            {oFunc.SubSistemaMensajeError("Ingrese Fecha de Examen");bResultado = false;}
        if(txtOD500.getText().isEmpty()){bResultado = false;}
        if(txtOD1000.getText().isEmpty()){bResultado = false;}
        if(txtOD2000.getText().isEmpty()){bResultado = false;}
        if(txtOD3000.getText().isEmpty()){bResultado = false;}
        if(txtOD4000.getText().isEmpty()){bResultado = false;}
        if(txtOD6000.getText().isEmpty()){bResultado = false;}
        if(txtOD8000.getText().isEmpty()){bResultado = false;}
        if(txtOI500.getText().isEmpty()){bResultado = false;}
        if(txtOI1000.getText().isEmpty()){bResultado = false;}
        if(txtOI2000.getText().isEmpty()){bResultado = false;}
        if(txtOI3000.getText().isEmpty()){bResultado = false;}
        if(txtOI4000.getText().isEmpty()){bResultado = false;}
        if(txtOI6000.getText().isEmpty()){bResultado = false;}
        if(txtOI8000.getText().isEmpty()){bResultado = false;}
       return bResultado;
}
    public boolean OrdenExiste()
    {
        boolean bResultado=false;

        String sQuery;

        sQuery  = "Select n_orden from audiometria_2021 Where n_orden="+txtNumero.getText().toString();
        
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
                    + "/reportes/Audiometria2021.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Audiometria 2021.");
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
    public void muestraAudiometria(){
        if(!txtNumero.getText().isEmpty()){
            String Sql="SELECT a.o_d_500, a.o_d_1000, a.o_d_2000, \n" +
                        "a.o_d_3000, a.o_d_4000, a.o_d_6000, a.o_d_8000, a.o_i_500, a.o_i_1000, a.o_i_2000, \n" +
                        "a.o_i_3000, a.o_i_4000, a.o_i_6000, a.o_i_8000, a.o_d1_500, a.o_d1_1000, \n" +
                        "a.o_d1_2000, a.o_d1_3000, a.o_d1_4000, a.o_d1_6000, a.o_d1_8000, a.o_i1_500, \n" +
                        "a.o_i1_1000, a.o_i1_2000, a.o_i1_3000, a.o_i1_4000, a.o_i1_6000, a.o_i1_8000, diagnostico "
                    + "FROM audiometria_po as a "
                    + "WHERE a.n_orden='"+txtNumero.getText()+"'";
             oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtOD500.setText(oConn.setResult.getString("o_d_500"));
                        txtOD1000.setText(oConn.setResult.getString("o_d_1000"));
                        txtOD2000.setText(oConn.setResult.getString("o_d_2000"));
                        txtOD3000.setText(oConn.setResult.getString("o_d_3000"));
                        txtOD4000.setText(oConn.setResult.getString("o_d_4000"));
                        txtOD6000.setText(oConn.setResult.getString("o_d_6000"));
                        txtOD8000.setText(oConn.setResult.getString("o_d_8000"));
                        txtOI500.setText(oConn.setResult.getString("o_i_500"));
                        txtOI1000.setText(oConn.setResult.getString("o_i_1000"));
                        txtOI2000.setText(oConn.setResult.getString("o_i_2000"));
                        txtOI3000.setText(oConn.setResult.getString("o_i_3000"));
                        txtOI4000.setText(oConn.setResult.getString("o_i_4000"));
                        txtOI6000.setText(oConn.setResult.getString("o_i_6000"));
                        txtOI8000.setText(oConn.setResult.getString("o_i_8000"));
                        txtOD501.setText(oConn.setResult.getString("o_d1_500"));
                        txtOD1001.setText(oConn.setResult.getString("o_d1_1000"));
                        txtOD2001.setText(oConn.setResult.getString("o_d1_2000"));
                        txtOD3001.setText(oConn.setResult.getString("o_d1_3000"));
                        txtOD4001.setText(oConn.setResult.getString("o_d1_4000"));
                        txtOD6001.setText(oConn.setResult.getString("o_d1_6000"));
                        txtOD8001.setText(oConn.setResult.getString("o_d1_8000"));
                        txtOI501.setText(oConn.setResult.getString("o_i1_500"));
                        txtOI1001.setText(oConn.setResult.getString("o_i1_1000"));
                        txtOI2001.setText(oConn.setResult.getString("o_i1_2000"));
                        txtOI3001.setText(oConn.setResult.getString("o_i1_3000"));
                        txtOI4001.setText(oConn.setResult.getString("o_i1_4000"));
                        txtOI6001.setText(oConn.setResult.getString("o_i1_6000"));
                        txtOI8001.setText(oConn.setResult.getString("o_i1_8000"));
                        
                        oConn.setResult.close();
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro en audiometria");
                    }
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Audiometria-1:" + ex.getMessage().toString());
        } 
       }
    }
    public void diagnostico(){
        float od500 = Float.parseFloat(txtOD500.getText());
        float od1000 = Float.parseFloat(txtOD1000.getText());
        float od2000 = Float.parseFloat(txtOD2000.getText());
        float od3000 = Float.parseFloat(txtOD3000.getText());
        float od4000 = Float.parseFloat(txtOD4000.getText());
        float od6000 = Float.parseFloat(txtOD6000.getText());
        float od8000 = Float.parseFloat(txtOD8000.getText());
        float oi500 = Float.parseFloat(txtOI500.getText());
        float oi1000 = Float.parseFloat(txtOI1000.getText());
        float oi2000 = Float.parseFloat(txtOI2000.getText());
        float oi3000 = Float.parseFloat(txtOI3000.getText());
        float oi4000 = Float.parseFloat(txtOI4000.getText());
        float oi6000 = Float.parseFloat(txtOI6000.getText());
        float oi8000 = Float.parseFloat(txtOI8000.getText());
        float edad = Float.parseFloat(txtEdad.getText());
        float mayodc = 0;
        float mayodnc = 0;
        float mayoic = 0;
        float mayoinc = 0;
       
        if (od500 >= od1000 && od500 >= od2000 && od500 >= od3000) {
            mayodc = od500;
        } else if (od1000 >= od500 && od1000 >= od2000 && od1000 >= od3000) {
            mayodc = od1000;
        } else if (od2000 >= od500 && od2000 >= od1000 && od2000 >= od3000 ) {
            mayodc = od2000;
        } else if (od3000 >= od500 && od3000 >= od1000 && od3000 >= od2000 ) {
            mayodc = od3000;
        }
        if (od4000 >= od6000 && od4000 >= od8000) {
            mayodnc = od4000;
        } else if (od6000 >= od4000 && od6000 >= od8000) {
            mayodnc = od6000;
        } else if (od8000 >= od4000 && od8000 >= od6000) {
            mayodnc = od8000;
        }
        if (oi500 >= oi1000 && oi500 >= oi2000 && oi500 >= oi3000) {
            mayoic = oi500;
        } else if (oi1000 >= oi500 && oi1000 >= oi2000 && oi1000 >= oi3000 ) {
            mayoic = oi1000;
        } else if (oi2000 >= oi500 && oi2000 >= oi1000 && oi2000 >= oi3000 ) {
            mayoic = oi2000;
        } else if (oi3000 >= oi500 && oi3000 >= oi1000 && oi3000 >= oi2000 ) {
            mayoic = oi3000;
        }
        if (oi4000 >= oi6000 && oi4000 >= oi8000) {
            mayoinc = oi4000;
        } else if (oi6000 >= oi4000 && oi6000 >= oi8000) {
            mayoinc = oi6000;
        } else if (oi8000 >= oi4000 && oi8000 >= oi6000) {
            mayoinc = oi8000;
        }
        if (od4000 > 25 || od6000 > 25 ) {
            if(od500 <= 25 && od1000 <=25 && od2000<=25 && od3000<=25){
                if ((od4000 > 25 && od4000 <= 55) || (od6000 > 25 && od6000 <= 55) || (od8000 > 25 && od8000 <= 55)) {
                    chkDTALeveOD.setSelected(true);
                } else if (od4000 > 55 || od6000 > 55 || od8000 > 55) {
                    chkDTAAvanzadoOD.setSelected(true);
                }
            }else {
                if (od500 <= 25 || od1000 <= 25 || od2000 <= 25 || od3000 <= 25) {
                    chkDHRLeveOD.setSelected(true);
                } else if ((od500 > 25 && od500 <= 55) && (od1000 > 25 && od1000 <= 55) && (od2000 > 25 && od2000 <= 55) && (od3000 > 25 && od3000 <= 55)) {
                    chkDHRModeradoOD.setSelected(true);
                } else if (mayodc > 55) {
                    chkDHRAvanzadaOD.setSelected(true);
                }
            }
        }else{
            if((od4000>25 && od4000<=55)||(od6000>25 && od6000<=55)){
                chkDTALeveOD.setSelected(true);
            }else if(od4000>55 ||od6000>55 ||od8000>55){
                chkDTAAvanzadoOD.setSelected(true);
            }
            if (od500 > 25 || od1000 > 25 || od2000>25||od3000>25||od8000>25) {
                chkOtrasHipoacusias.setSelected(true);
                txtOtrasHipoacusias.setText("OTRAS HIPOACUSIAS NO RELACIONADAS A RUIDO OD");
            } 
        }
        if(oi4000 > 25 || oi6000 > 25) {
            if (oi500 <= 25 && oi1000 <= 25 && oi2000 <= 25 && oi3000 <= 25) {
                if ((oi4000 > 25 && oi4000 <= 55) || (oi6000 > 25 && oi6000 <= 55) || (oi8000 > 25 && oi8000 <= 55)) {
                    chkDTALeveOI.setSelected(true);
                } else if (oi4000 > 55 || oi6000 > 55 || oi8000 > 55) {
                    chkDTAAvanzadoOI.setSelected(true);
                }
            } else {
                if (oi500 <= 25 || oi1000 <= 25 || oi2000 <= 25 || oi3000 <= 25) {
                    chkDHRLeveOI.setSelected(true);
                } else if ((oi500 > 25 && oi500 <= 55) && (oi1000 > 25 && oi1000 <= 55) && (oi2000 > 25 && oi2000 <= 55) && (oi3000 > 25 && oi3000 <= 55)) {
                    chkDHRModeradoOI.setSelected(true);
                } else if (mayoic > 55) {
                    chkDHRAvanzadaOI.setSelected(true);
                }
            }
        }else{
            if((oi4000>25 && oi4000<=55)||(oi6000>25 && oi6000<=55)){
                chkDTALeveOI.setSelected(true);
            }else if(oi4000>55 ||oi6000>55 ||oi8000>55){
                chkDTAAvanzadoOI.setSelected(true);
            }
            if (oi500 > 25 || oi1000 > 25 || oi2000>25||oi3000>25 ||oi8000>25 ){
                chkOtrasHipoacusias.setSelected(true);
                if("OTRAS HIPOACUSIAS NO RELACIONADAS A RUIDO OD".equals(txtOtrasHipoacusias.getText())){
                    txtOtrasHipoacusias.setText("OTRAS HIPOACUSIAS NO RELACIONADAS A RUIDO OD Y OI");
                }else{
                    txtOtrasHipoacusias.setText("OTRAS HIPOACUSIAS NO RELACIONADAS A RUIDO OI");
                }
                
            } 
        }
        if(od500 <=25 && od1000<=25 &&  od2000<=25 && od3000<=25 && od4000<=25 && od6000<=25 && od8000<=25 &&
                oi500 <=25 && oi1000<=25 &&  oi2000<=25 && oi3000<=25 && oi4000<=25 && oi6000<=25 && oi8000<=25){
            chkDNormal.setSelected(true);
        }
        if(edad>40){
            if(od8000>25 && oi8000>25){
                oFunc.SubSistemaMensajeInformacion("SOSPECHA DE PRESBIACUSIA EN OD Y OI");
            }else if(od8000>25){
                oFunc.SubSistemaMensajeInformacion("SOSPECHA DE PRESBIACUSIA EN OD");
            }else if(oi8000>25){
                oFunc.SubSistemaMensajeInformacion("SOSPECHA DE PRESBIACUSIA EN OI");
            }
        }
    }
    void limpiarDiagnostico(){
        chkDNormal.setSelected(false);
        chkDHRLeveOD.setSelected(false);
        chkDHRModeradoOD.setSelected(false);
        chkDHRAvanzadaOD.setSelected(false);
        chkDHRLeveOI.setSelected(false);
        chkDHRModeradoOI.setSelected(false);
        chkDHRAvanzadaOI.setSelected(false);
        chkDTALeveOD.setSelected(false);
        chkDTAAvanzadoOD.setSelected(false);
        chkDTALeveOI.setSelected(false);
        chkDTAAvanzadoOI.setSelected(false);
        chkOtrasHipoacusias.setSelected(false);
        txtOtrasHipoacusias.setText(null);
    }
}
