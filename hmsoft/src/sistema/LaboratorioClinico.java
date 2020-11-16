package sistema;

import Caja.Admision;
import Caja.RegistrarCliente;
import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
//
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Richard
 */
public final class LaboratorioClinico extends javax.swing.JInternalFrame {
clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
    String[]responsable = new String[]{};
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
    public static AddMarcaCovid addMarca;
   float valorigm,valorigg;
    DefaultTableModel model;
   String pasar="df",doctor;
   int valor=1;
    public LaboratorioClinico() {
        initComponents();
        jtLaboratorio.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/biology0.png")));
        jtLaboratorio.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/biology1.png")));
        Limpiar();
       negarPc();
        responsable = getRowsToVector("select nombre_user||' '||apellido_user as responsable FROM usuarios");
        CargarMarcaCovid();
        cboMarca.setSelectedIndex(-1);
        timer.start();
         txtSintoma.setEnabled(false);
                             chkInvalido1.setSelected(false);
                             txtColorEF.setVisible(false);
                             txtAspectoEF.setVisible(false);
                             aspectoorina();
                             colororina();
                                   AutoCompleteDecorator.decorate(this.jComboAsp);
                                   AutoCompleteDecorator.decorate(this.jComboBoxColor);

    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTipoEx = new javax.swing.ButtonGroup();
        btGrupo = new javax.swing.ButtonGroup();
        btFactor = new javax.swing.ButtonGroup();
        btRpr = new javax.swing.ButtonGroup();
        btReImp = new javax.swing.ButtonGroup();
        gCocaina = new javax.swing.ButtonGroup();
        bMarihuana = new javax.swing.ButtonGroup();
        bgIgm = new javax.swing.ButtonGroup();
        bgIgg = new javax.swing.ButtonGroup();
        bgInvalido = new javax.swing.ButtonGroup();
        jtLaboratorio = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chkConsultas = new javax.swing.JCheckBox();
        chkParticular = new javax.swing.JCheckBox();
        chkFichaMedica = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNrecibo = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtcontrata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FechaExamen = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chkO = new javax.swing.JCheckBox();
        chkA = new javax.swing.JCheckBox();
        chkB = new javax.swing.JCheckBox();
        chkAB = new javax.swing.JCheckBox();
        rbRHpositivo = new javax.swing.JRadioButton();
        rbRHnegativo = new javax.swing.JRadioButton();
        txtHemoglobina = new javax.swing.JTextField();
        txtHematocrito = new javax.swing.JTextField();
        txtVSG = new javax.swing.JTextField();
        txtLeucocitosEmatologia = new javax.swing.JTextField();
        txtHematiesEmatologia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtAbastonados = new javax.swing.JTextField();
        txtsegmentadosEmatologia = new javax.swing.JTextField();
        txtmonocitosEmatologia = new javax.swing.JTextField();
        txtEosinofiosEmatologia = new javax.swing.JTextField();
        txtNeutrofilos = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtbasofilosEmatologia = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtLinfocitosEmatologia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtPlaquetas = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtGlucosaBio = new javax.swing.JTextField();
        txtCreatininaBio = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        chkNACreat = new javax.swing.JCheckBox();
        chkNAG = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtVIH = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        chkPositivo = new javax.swing.JCheckBox();
        chkNegativo = new javax.swing.JCheckBox();
        txtRPR = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jCheckVposi = new javax.swing.JCheckBox();
        jCheckNe = new javax.swing.JCheckBox();
        jCheckNA = new javax.swing.JCheckBox();
        jLabel41 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        jtTriaje = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblabclinico = new javax.swing.JTable();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        txtGFSPrevio = new javax.swing.JTextField();
        txtGrupoFacLab = new javax.swing.JTextField();
        chkRetiro = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtColorEF = new javax.swing.JTextField();
        txtDensidadEF = new javax.swing.JTextField();
        txtAspectoEF = new javax.swing.JTextField();
        txtPhEF = new javax.swing.JTextField();
        chkIncoloro = new javax.swing.JCheckBox();
        chkMedicamentosa = new javax.swing.JCheckBox();
        chkTransparente = new javax.swing.JCheckBox();
        chkLigTurbio = new javax.swing.JCheckBox();
        chkNoAplicaExamen = new javax.swing.JCheckBox();
        jComboBoxColor = new javax.swing.JComboBox();
        jComboAsp = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtNitritosEQ = new javax.swing.JTextField();
        txtProteinasEQ = new javax.swing.JTextField();
        txtUrobilinogenoEQ = new javax.swing.JTextField();
        txtBilirubinaEQ = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtCetonasEQ = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtLeucocitosEQ = new javax.swing.JTextField();
        txtGlucosaEQ = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtSangreEQ = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtLeucocitosSU = new javax.swing.JTextField();
        txtCelEpitelialesSU = new javax.swing.JTextField();
        txtHematiesSU = new javax.swing.JTextField();
        txtCristalesSU = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtCilindiosSU = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtBacteriasSU = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtPusSU = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtOtrosSu = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtCocaina = new javax.swing.JTextField();
        txtmarihuana = new javax.swing.JTextField();
        chkReactivoC = new javax.swing.JCheckBox();
        chkNoReactivoC = new javax.swing.JCheckBox();
        chkNAC = new javax.swing.JCheckBox();
        chkNoReactivoM = new javax.swing.JCheckBox();
        chkReactivoM = new javax.swing.JCheckBox();
        chkNAM = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacionesLB = new javax.swing.JTextArea();
        btnGrabar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        chkOrden = new javax.swing.JCheckBox();
        chkRecibo = new javax.swing.JCheckBox();
        txtImp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnPrint = new javax.swing.JButton();
        btnObservaciones = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        chkIgmReactivo = new javax.swing.JCheckBox();
        chkIgmNoReactivo = new javax.swing.JCheckBox();
        chkIggNoReactivo = new javax.swing.JCheckBox();
        chkIggReactivo = new javax.swing.JCheckBox();
        chkInvalido = new javax.swing.JCheckBox();
        jLabel64 = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox();
        btnMarca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVRIgm = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtVRIgg = new javax.swing.JTextArea();
        btnGrabarIn = new javax.swing.JButton();
        btnLimpiarIn = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        txtNordenIn = new javax.swing.JTextField();
        btnEditarIn = new javax.swing.JButton();
        FechaExIn = new com.toedter.calendar.JDateChooser();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtNombresIn = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtDniIn = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtEdadIn = new javax.swing.JTextField();
        txtImprimirIn = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextFieldSaturacion = new javax.swing.JTextField();
        FechaHotel = new com.toedter.calendar.JDateChooser();
        jLabel73 = new javax.swing.JLabel();
        chkAsintomatico = new javax.swing.JCheckBox();
        chkSintomatico = new javax.swing.JCheckBox();
        txtSintoma = new javax.swing.JTextField();
        chkTos = new javax.swing.JCheckBox();
        chkDolorG = new javax.swing.JCheckBox();
        chkCongestionN = new javax.swing.JCheckBox();
        chkDificultadR = new javax.swing.JCheckBox();
        chkFiebre = new javax.swing.JCheckBox();
        chkMalestar = new javax.swing.JCheckBox();
        chkPerdidaOlf1 = new javax.swing.JCheckBox();
        chkExpctoracion = new javax.swing.JCheckBox();
        chkDolor = new javax.swing.JCheckBox();
        chkIrritaibilidad = new javax.swing.JCheckBox();
        chkCefalea = new javax.swing.JCheckBox();
        chkNauseas = new javax.swing.JCheckBox();
        chkDiarrea = new javax.swing.JCheckBox();
        lblHora = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        txtNordenIn1 = new javax.swing.JTextField();
        btnEditarIn1 = new javax.swing.JButton();
        FechaExIn1 = new com.toedter.calendar.JDateChooser();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        txtNombresIn1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txtDniIn1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txtEdadIn1 = new javax.swing.JTextField();
        txtImprimirIn1 = new javax.swing.JTextField();
        btnImprimir1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        chkIgmReactivo1 = new javax.swing.JCheckBox();
        chkIgmNoReactivo1 = new javax.swing.JCheckBox();
        chkIggNoReactivo1 = new javax.swing.JCheckBox();
        chkIggReactivo1 = new javax.swing.JCheckBox();
        chkInvalido1 = new javax.swing.JCheckBox();
        jLabel84 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaIgm = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaIgg = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnGrabarIn1 = new javax.swing.JButton();
        btnLimpiarIn1 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Laboratorio Clinico");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btTipoEx.add(chkConsultas);
        chkConsultas.setText("Consultas");
        chkConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConsultasActionPerformed(evt);
            }
        });

        btTipoEx.add(chkParticular);
        chkParticular.setText("Particular");
        chkParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkParticularActionPerformed(evt);
            }
        });

        btTipoEx.add(chkFichaMedica);
        chkFichaMedica.setSelected(true);
        chkFichaMedica.setText("Ficha Médica Ocupacional");
        chkFichaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFichaMedicaActionPerformed(evt);
            }
        });

        jLabel6.setText("N° Orden :");

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

        jLabel7.setText("N° Recibo :");

        jLabel48.setText("Dni:");

        txtDni.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chkConsultas)
                .addGap(18, 18, 18)
                .addComponent(chkParticular)
                .addGap(18, 18, 18)
                .addComponent(chkFichaMedica)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNrecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtNrecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel48)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkConsultas)
                        .addComponent(chkParticular)
                        .addComponent(chkFichaMedica)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombres :");

        txtNombres.setEditable(false);

        txtcontrata.setEditable(false);

        jLabel2.setText("Emp. Contratista :");

        jLabel3.setText("Fecha :");

        jLabel4.setText("Responsable Lab :");

        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResponsableKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hematología"));

        jLabel8.setText("Grupo Sanguíneo :");

        jLabel9.setText("Factor Rh :");

        jLabel10.setText("Hemoglobina :");

        jLabel11.setText("Hematocrito :");

        jLabel12.setText("V.S.G :");

        jLabel13.setText("Leucocitos :");

        jLabel14.setText("Hematíes :");

        btGrupo.add(chkO);
        chkO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkO.setText("O");
        chkO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOActionPerformed(evt);
            }
        });

        btGrupo.add(chkA);
        chkA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkA.setText("A");
        chkA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAActionPerformed(evt);
            }
        });

        btGrupo.add(chkB);
        chkB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkB.setText("B");
        chkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBActionPerformed(evt);
            }
        });

        btGrupo.add(chkAB);
        chkAB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAB.setText("AB");
        chkAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkABActionPerformed(evt);
            }
        });

        btFactor.add(rbRHpositivo);
        rbRHpositivo.setText("Rh(+)");
        rbRHpositivo.setPreferredSize(new java.awt.Dimension(55, 15));
        rbRHpositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRHpositivoActionPerformed(evt);
            }
        });

        btFactor.add(rbRHnegativo);
        rbRHnegativo.setText("Rh(-)");
        rbRHnegativo.setPreferredSize(new java.awt.Dimension(51, 15));
        rbRHnegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRHnegativoActionPerformed(evt);
            }
        });

        txtHemoglobina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHemoglobina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHemoglobinaActionPerformed(evt);
            }
        });
        txtHemoglobina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHemoglobinaKeyTyped(evt);
            }
        });

        txtHematocrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHematocritoActionPerformed(evt);
            }
        });

        txtVSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVSGActionPerformed(evt);
            }
        });

        txtLeucocitosEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeucocitosEmatologiaActionPerformed(evt);
            }
        });

        txtHematiesEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHematiesEmatologiaActionPerformed(evt);
            }
        });

        jLabel15.setText("g/dl");

        jLabel16.setText("%");

        jLabel17.setText("mm/Hora");

        jLabel18.setText("mm³");

        jLabel19.setText("Segmentados :");

        jLabel20.setText("Eosinofilos :");

        jLabel21.setText("Monocitos :");

        txtAbastonados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbastonadosActionPerformed(evt);
            }
        });

        txtsegmentadosEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsegmentadosEmatologiaActionPerformed(evt);
            }
        });

        txtmonocitosEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmonocitosEmatologiaActionPerformed(evt);
            }
        });

        txtEosinofiosEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEosinofiosEmatologiaActionPerformed(evt);
            }
        });

        txtNeutrofilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNeutrofilosActionPerformed(evt);
            }
        });

        jLabel24.setText("%");

        jLabel26.setText("Neutrofilos :");

        jLabel27.setText("Abastonados :");

        txtbasofilosEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbasofilosEmatologiaActionPerformed(evt);
            }
        });

        jLabel28.setText("Basofilos :");

        jLabel29.setText("Linfocitos :");

        txtLinfocitosEmatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinfocitosEmatologiaActionPerformed(evt);
            }
        });

        jLabel25.setText("%");

        jLabel30.setText("%");

        jLabel31.setText("%");

        jLabel32.setText("%");

        jLabel33.setText("%");

        jLabel34.setText("%");

        jLabel49.setText("Plaquetas :");

        txtPlaquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaquetasActionPerformed(evt);
            }
        });

        jLabel50.setText("mm³");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(chkO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkAB))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHematiesEmatologia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLeucocitosEmatologia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVSG, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHematocrito, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHemoglobina, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbRHpositivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel50)
                                    .addComponent(rbRHnegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEosinofiosEmatologia)
                    .addComponent(txtmonocitosEmatologia)
                    .addComponent(txtbasofilosEmatologia)
                    .addComponent(txtLinfocitosEmatologia)
                    .addComponent(txtNeutrofilos, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(txtAbastonados)
                    .addComponent(txtsegmentadosEmatologia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNeutrofilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtAbastonados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(txtsegmentadosEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(txtmonocitosEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtEosinofiosEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(txtbasofilosEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtLinfocitosEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chkO)
                    .addComponent(chkA)
                    .addComponent(chkB)
                    .addComponent(chkAB))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbRHpositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbRHnegativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(txtHemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(txtHematocrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(txtVSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtLeucocitosEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtHematiesEmatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPlaquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50))
                    .addComponent(jLabel49)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bioquímica"));

        jLabel22.setText("Creatinina :");

        jLabel23.setText("Glucosa :");

        txtGlucosaBio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGlucosaBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGlucosaBioActionPerformed(evt);
            }
        });

        txtCreatininaBio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCreatininaBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatininaBioActionPerformed(evt);
            }
        });

        jLabel35.setText("mg/dl");

        jLabel36.setText("mg/dl");

        jLabel37.setText("Valores normales 70 - 110 mg/dl");

        jLabel39.setText("Valores normales 0.8 - 1.4 mg/dl");

        chkNACreat.setText("N/A");
        chkNACreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNACreatActionPerformed(evt);
            }
        });

        chkNAG.setText("N/A");
        chkNAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNAGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGlucosaBio, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtCreatininaBio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkNAG))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkNACreat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtGlucosaBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(chkNAG, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtCreatininaBio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel39)
                    .addComponent(chkNACreat, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Reacciones Serológicas"));

        jLabel38.setText("RPR :");

        jLabel40.setText("VIH :");

        txtVIH.setText("N/A");
        txtVIH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVIHActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("N/A");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        chkPositivo.setText("+");
        chkPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositivoActionPerformed(evt);
            }
        });

        chkNegativo.setText("-");
        chkNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNegativoActionPerformed(evt);
            }
        });

        txtRPR.setText("N/A");
        txtRPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRPRActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(153, 0, 51));
        jSeparator5.setForeground(new java.awt.Color(102, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setAlignmentX(2.0F);

        jCheckVposi.setText("+");
        jCheckVposi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckVposiActionPerformed(evt);
            }
        });

        jCheckNe.setText("-");
        jCheckNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNeActionPerformed(evt);
            }
        });

        jCheckNA.setSelected(true);
        jCheckNA.setText("N/A");
        jCheckNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chkPositivo)
                        .addGap(47, 47, 47)
                        .addComponent(chkNegativo)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addComponent(txtRPR, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVIH, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jCheckVposi)
                        .addGap(42, 42, 42)
                        .addComponent(jCheckNe)
                        .addGap(41, 41, 41)
                        .addComponent(jCheckNA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVIH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(txtRPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel38)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPositivo)
                    .addComponent(chkNegativo)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckNe)
                    .addComponent(jCheckVposi)
                    .addComponent(jCheckNA))
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
        );

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/microscopio.png"))); // NOI18N

        txtEmpresa.setEditable(false);

        jLabel43.setText("Empresa :");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tblabclinico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblabclinico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblabclinico.getTableHeader().setReorderingAllowed(false);
        tblabclinico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblabclinicoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblabclinico);

        jtTriaje.addTab("Registros anteriores de grupo sanguíneo", jScrollPane2);

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("G.F. Sang. Pedido");

        txtGFSPrevio.setEditable(false);
        txtGFSPrevio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGFSPrevio.setForeground(new java.awt.Color(0, 0, 255));

        txtGrupoFacLab.setEditable(false);
        txtGrupoFacLab.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGrupoFacLab.setForeground(new java.awt.Color(0, 0, 255));

        chkRetiro.setText("INCOMPLETO");
        chkRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRetiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkRetiro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel43))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtcontrata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                            .addComponent(txtNombres)
                                            .addComponent(txtEmpresa))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtGFSPrevio)
                                            .addComponent(txtGrupoFacLab))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(FechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar)
                    .addComponent(btnLimpiar1)
                    .addComponent(chkRetiro))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(txtcontrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGFSPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(txtGrupoFacLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel41)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jtLaboratorio.addTab("Hematología - Bioquímica SI-EO", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exámen Fisico"));

        jLabel42.setText("Color :");

        jLabel44.setText("Densidad :");

        jLabel45.setText("Aspecto :");

        jLabel46.setText("PH :");

        txtColorEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorEFActionPerformed(evt);
            }
        });

        txtDensidadEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDensidadEFActionPerformed(evt);
            }
        });

        txtAspectoEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAspectoEFActionPerformed(evt);
            }
        });

        txtPhEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhEFActionPerformed(evt);
            }
        });

        chkIncoloro.setText("Incoloro");
        chkIncoloro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIncoloroActionPerformed(evt);
            }
        });

        chkMedicamentosa.setText("Medicamentosa");
        chkMedicamentosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMedicamentosaActionPerformed(evt);
            }
        });

        chkTransparente.setText("Transparente");
        chkTransparente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTransparenteActionPerformed(evt);
            }
        });

        chkLigTurbio.setText("Turbio");
        chkLigTurbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLigTurbioActionPerformed(evt);
            }
        });

        chkNoAplicaExamen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkNoAplicaExamen.setText("No Aplica ");
        chkNoAplicaExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoAplicaExamenActionPerformed(evt);
            }
        });

        jComboBoxColor.setEditable(true);
        jComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
        jComboBoxColor.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxColorPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxColorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxColorMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxColorMousePressed(evt);
            }
        });
        jComboBoxColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxColorActionPerformed(evt);
            }
        });
        jComboBoxColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxColorKeyPressed(evt);
            }
        });

        jComboAsp.setEditable(true);
        jComboAsp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
        jComboAsp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboAspPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboAsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboAspMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboAspMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboAspMousePressed(evt);
            }
        });
        jComboAsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAspActionPerformed(evt);
            }
        });
        jComboAsp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboAspKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkIncoloro)
                    .addComponent(jLabel44)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtColorEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkMedicamentosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDensidadEF)
                    .addComponent(jComboBoxColor, 0, 1, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(chkTransparente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLigTurbio)
                        .addGap(18, 18, 18)
                        .addComponent(chkNoAplicaExamen))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel46))
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhEF, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboAsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAspectoEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkIncoloro, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMedicamentosa, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTransparente, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkLigTurbio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNoAplicaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel45)
                    .addComponent(txtColorEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAspectoEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboAsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46)
                    .addComponent(txtDensidadEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Exámen Quimico"));

        jLabel51.setText("Nitritos :");

        jLabel52.setText("Proteínas :");

        jLabel53.setText("Urobilinogeno :");

        jLabel54.setText("Bilirrubina :");

        txtNitritosEQ.setText("NEGATIVO");
        txtNitritosEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitritosEQActionPerformed(evt);
            }
        });
        txtNitritosEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNitritosEQFocusGained(evt);
            }
        });

        txtProteinasEQ.setText("NEGATIVO");
        txtProteinasEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProteinasEQActionPerformed(evt);
            }
        });
        txtProteinasEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProteinasEQFocusGained(evt);
            }
        });

        txtUrobilinogenoEQ.setText("NEGATIVO");
        txtUrobilinogenoEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrobilinogenoEQActionPerformed(evt);
            }
        });
        txtUrobilinogenoEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUrobilinogenoEQFocusGained(evt);
            }
        });

        txtBilirubinaEQ.setText("NEGATIVO");
        txtBilirubinaEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBilirubinaEQActionPerformed(evt);
            }
        });
        txtBilirubinaEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBilirubinaEQFocusGained(evt);
            }
        });

        jLabel55.setText("Cetonas :");

        txtCetonasEQ.setText("NEGATIVO");
        txtCetonasEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCetonasEQActionPerformed(evt);
            }
        });
        txtCetonasEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCetonasEQFocusGained(evt);
            }
        });

        jLabel56.setText("Leucocitos :");

        txtLeucocitosEQ.setText("NEGATIVO");
        txtLeucocitosEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeucocitosEQActionPerformed(evt);
            }
        });
        txtLeucocitosEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLeucocitosEQFocusGained(evt);
            }
        });

        txtGlucosaEQ.setText("NEGATIVO");
        txtGlucosaEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGlucosaEQActionPerformed(evt);
            }
        });
        txtGlucosaEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGlucosaEQFocusGained(evt);
            }
        });

        jLabel57.setText("Glucosa :");

        jLabel58.setText("Sangre :");

        txtSangreEQ.setText("NEGATIVO");
        txtSangreEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSangreEQActionPerformed(evt);
            }
        });
        txtSangreEQ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSangreEQFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtLeucocitosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSangreEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCetonasEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProteinasEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNitritosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGlucosaEQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUrobilinogenoEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBilirubinaEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel53)
                    .addComponent(txtNitritosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUrobilinogenoEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(txtProteinasEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBilirubinaEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtCetonasEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(txtGlucosaEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtLeucocitosEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(txtSangreEQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sedimento Unitario"));

        jLabel67.setText("Leucocitos :");

        jLabel68.setText("Cel.Epiteliales :");

        jLabel69.setText("Hematies :");

        jLabel70.setText("Cristales :");

        txtLeucocitosSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeucocitosSUActionPerformed(evt);
            }
        });

        txtCelEpitelialesSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelEpitelialesSUActionPerformed(evt);
            }
        });

        txtHematiesSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHematiesSUActionPerformed(evt);
            }
        });

        txtCristalesSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCristalesSUActionPerformed(evt);
            }
        });

        jLabel75.setText("Cilindios :");

        txtCilindiosSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCilindiosSUActionPerformed(evt);
            }
        });

        jLabel76.setText("Bacterías :");

        txtBacteriasSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBacteriasSUActionPerformed(evt);
            }
        });

        jLabel77.setText("Pus :");

        txtPusSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPusSUActionPerformed(evt);
            }
        });

        jLabel78.setText("Otros :");

        txtOtrosSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtrosSuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBacteriasSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCilindiosSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelEpitelialesSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLeucocitosSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHematiesSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCristalesSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPusSU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtrosSu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel69)
                    .addComponent(txtLeucocitosSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHematiesSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel70)
                    .addComponent(txtCelEpitelialesSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCristalesSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtCilindiosSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(txtPusSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBacteriasSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78)
                        .addComponent(txtOtrosSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Drogas"));

        jLabel71.setText("Cocaína :");

        jLabel72.setText("Marihuana :");

        txtCocaina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCocainaActionPerformed(evt);
            }
        });

        txtmarihuana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarihuanaActionPerformed(evt);
            }
        });

        gCocaina.add(chkReactivoC);
        chkReactivoC.setText("React.");
        chkReactivoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReactivoCActionPerformed(evt);
            }
        });

        gCocaina.add(chkNoReactivoC);
        chkNoReactivoC.setText("No React.");
        chkNoReactivoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoReactivoCActionPerformed(evt);
            }
        });

        gCocaina.add(chkNAC);
        chkNAC.setText("N/A");
        chkNAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNACActionPerformed(evt);
            }
        });

        bMarihuana.add(chkNoReactivoM);
        chkNoReactivoM.setText("No React.");
        chkNoReactivoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoReactivoMActionPerformed(evt);
            }
        });

        bMarihuana.add(chkReactivoM);
        chkReactivoM.setText("React.");
        chkReactivoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReactivoMActionPerformed(evt);
            }
        });

        bMarihuana.add(chkNAM);
        chkNAM.setText("N/A");
        chkNAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNAMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkReactivoC)
                                .addComponent(jLabel71)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmarihuana, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCocaina, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(chkNoReactivoC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkNAC))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(chkReactivoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNoReactivoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkNAM))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkReactivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNoReactivoC, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNAC, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(txtCocaina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtmarihuana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkReactivoM, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNoReactivoM, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNAM, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtObservacionesLB.setColumns(20);
        txtObservacionesLB.setLineWrap(true);
        txtObservacionesLB.setRows(5);
        txtObservacionesLB.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        jScrollPane1.setViewportView(txtObservacionesLB);

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabar.setText("Grabar/Actualizar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir"));

        btReImp.add(chkOrden);
        chkOrden.setText("Nro Orden");
        chkOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOrdenActionPerformed(evt);
            }
        });

        btReImp.add(chkRecibo);
        chkRecibo.setText("Nro Recibo");
        chkRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReciboActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(chkOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkRecibo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtImp, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkOrden))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jSeparator4)
                .addGap(11, 11, 11))
        );

        btnObservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObservacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrabar)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnObservaciones))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnObservaciones)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGrabar)
                                    .addComponent(btnLimpiar)))))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        jtLaboratorio.addTab("Examen de Orina", jPanel6);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COVID - 19 Prueba Rápida"));

        jLabel89.setText("IgM :");

        jLabel90.setText("IgG :");

        bgIgm.add(chkIgmReactivo);
        chkIgmReactivo.setText("REACTIVO");
        chkIgmReactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIgmReactivoActionPerformed(evt);
            }
        });

        bgIgm.add(chkIgmNoReactivo);
        chkIgmNoReactivo.setText("NO REACTIVO");
        chkIgmNoReactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIgmNoReactivoActionPerformed(evt);
            }
        });

        bgIgg.add(chkIggNoReactivo);
        chkIggNoReactivo.setText("NO REACTIVO");
        chkIggNoReactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIggNoReactivoActionPerformed(evt);
            }
        });

        bgIgg.add(chkIggReactivo);
        chkIggReactivo.setText("REACTIVO");
        chkIggReactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIggReactivoActionPerformed(evt);
            }
        });

        bgInvalido.add(chkInvalido);
        chkInvalido.setText("INVALIDO");
        chkInvalido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInvalidoActionPerformed(evt);
            }
        });

        jLabel64.setText("MARCA: ");

        cboMarca.setEditable(true);
        cboMarca.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMarcaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMarcaMouseClicked(evt);
            }
        });
        cboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarcaActionPerformed(evt);
            }
        });

        btnMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMarcaMouseClicked(evt);
            }
        });

        txtVRIgm.setColumns(20);
        txtVRIgm.setRows(5);
        jScrollPane3.setViewportView(txtVRIgm);

        txtVRIgg.setColumns(20);
        txtVRIgg.setRows(5);
        jScrollPane4.setViewportView(txtVRIgg);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkIgmReactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIggReactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkInvalido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkIggNoReactivo)
                            .addComponent(chkIgmNoReactivo)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMarca)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIgmReactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIgmNoReactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkIggReactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIggNoReactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90))
                        .addGap(39, 39, 39)
                        .addComponent(chkInvalido))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
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

        btnEditarIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarIn.setText("Editar");
        btnEditarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInActionPerformed(evt);
            }
        });

        FechaExIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExInPropertyChange(evt);
            }
        });

        jLabel60.setText("Fecha :");

        jLabel61.setText("Nombres y Apellidos :");

        jLabel62.setText("DNI :");

        jLabel63.setText("Edad :");

        txtImprimirIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirInActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombresIn, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNordenIn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarIn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaExIn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel62)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDniIn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel63)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdadIn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(txtImprimirIn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59)
                        .addComponent(txtNordenIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarIn)
                        .addComponent(jLabel60))
                    .addComponent(FechaExIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(txtNombresIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(txtDniIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(txtEdadIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtImprimirIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel65.setText("SOLO PARA PC (HOTELES)");

        jLabel66.setText("Saturacion:");

        FechaHotel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaHotelPropertyChange(evt);
            }
        });

        jLabel73.setText("Fecha de examen");

        chkAsintomatico.setSelected(true);
        chkAsintomatico.setText("Asintomático");
        chkAsintomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsintomaticoActionPerformed(evt);
            }
        });

        chkSintomatico.setText("Sintomático");
        chkSintomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSintomaticoActionPerformed(evt);
            }
        });

        txtSintoma.setDragEnabled(true);

        chkTos.setText("Tos");
        chkTos.setEnabled(false);

        chkDolorG.setText("Dolor de garganta");
        chkDolorG.setEnabled(false);

        chkCongestionN.setText("Congestión Nasal");
        chkCongestionN.setEnabled(false);

        chkDificultadR.setText("Dificultad respiratoria");
        chkDificultadR.setEnabled(false);

        chkFiebre.setText("Fiebre/ Escalofrio");
        chkFiebre.setEnabled(false);

        chkMalestar.setText("Malestar general");
        chkMalestar.setEnabled(false);

        chkPerdidaOlf1.setText("Perdida olfato o gusto");
        chkPerdidaOlf1.setEnabled(false);
        chkPerdidaOlf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPerdidaOlf1ActionPerformed(evt);
            }
        });

        chkExpctoracion.setText("Expectoración");
        chkExpctoracion.setEnabled(false);

        chkDolor.setText("Dolor");
        chkDolor.setEnabled(false);

        chkIrritaibilidad.setText("Irritabilidad / confusión");
        chkIrritaibilidad.setEnabled(false);

        chkCefalea.setText("Cefalea");
        chkCefalea.setEnabled(false);

        chkNauseas.setText("Nauseas / vómitos");
        chkNauseas.setEnabled(false);

        chkDiarrea.setText("Diarrea");
        chkDiarrea.setEnabled(false);

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel74.setText("Otros sintomas:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabarIn)
                            .addComponent(btnLimpiarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel66)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel73)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSaturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(chkAsintomatico)
                                .addGap(32, 32, 32)
                                .addComponent(chkSintomatico))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDificultadR)
                                    .addComponent(chkCongestionN)
                                    .addComponent(chkTos)
                                    .addComponent(chkDolorG)
                                    .addComponent(chkFiebre)
                                    .addComponent(chkMalestar))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDiarrea)
                                    .addComponent(chkExpctoracion)
                                    .addComponent(chkDolor)
                                    .addComponent(chkCefalea)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(chkNauseas)
                                        .addGap(145, 145, 145)
                                        .addComponent(jLabel74))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(chkIrritaibilidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(chkPerdidaOlf1))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnGrabarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnLimpiarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(chkAsintomatico)
                    .addComponent(chkSintomatico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jTextFieldSaturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73))
                        .addGap(18, 18, 18)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkTos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDiarrea, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkDolorG, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNauseas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkCongestionN, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkCefalea, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkDificultadR, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIrritaibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkFiebre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDolor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkMalestar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkExpctoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPerdidaOlf1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        jtLaboratorio.addTab("Examen Inmunologico", jPanel10);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel79.setText("Nº Orden :");

        txtNordenIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenIn1ActionPerformed(evt);
            }
        });
        txtNordenIn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenIn1KeyTyped(evt);
            }
        });

        btnEditarIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarIn1.setText("Editar");
        btnEditarIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIn1ActionPerformed(evt);
            }
        });

        FechaExIn1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExIn1PropertyChange(evt);
            }
        });

        jLabel80.setText("Fecha :");

        jLabel81.setText("Nombres y Apellidos :");

        jLabel82.setText("DNI :");

        jLabel83.setText("Edad :");

        txtImprimirIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirIn1ActionPerformed(evt);
            }
        });

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 204, 153));
        jTextField1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 51));
        jTextField1.setText("Imprimir");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombresIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jLabel79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNordenIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarIn1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaExIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDniIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel83)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdadIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(txtImprimirIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel79)
                        .addComponent(txtNordenIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarIn1)
                        .addComponent(jLabel80))
                    .addComponent(FechaExIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(txtNombresIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(txtDniIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83)
                            .addComponent(txtEdadIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtImprimirIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COVID - 19 Prueba Rápida"));

        jLabel91.setText("IgM :");

        jLabel92.setText("IgG :");

        bgIgm.add(chkIgmReactivo1);
        chkIgmReactivo1.setText("REACTIVO");
        chkIgmReactivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIgmReactivo1ActionPerformed(evt);
            }
        });

        bgIgm.add(chkIgmNoReactivo1);
        chkIgmNoReactivo1.setSelected(true);
        chkIgmNoReactivo1.setText("NO REACTIVO");
        chkIgmNoReactivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIgmNoReactivo1ActionPerformed(evt);
            }
        });

        bgIgg.add(chkIggNoReactivo1);
        chkIggNoReactivo1.setSelected(true);
        chkIggNoReactivo1.setText("NO REACTIVO");
        chkIggNoReactivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIggNoReactivo1ActionPerformed(evt);
            }
        });

        bgIgg.add(chkIggReactivo1);
        chkIggReactivo1.setText("REACTIVO");
        chkIggReactivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIggReactivo1ActionPerformed(evt);
            }
        });

        bgInvalido.add(chkInvalido1);
        chkInvalido1.setText("INVALIDO");
        chkInvalido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInvalido1ActionPerformed(evt);
            }
        });

        jLabel84.setText("MARCA: ");

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField2.setText("MAGLUMI");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextAreaIgm.setColumns(20);
        jTextAreaIgm.setRows(5);
        jTextAreaIgm.setText("Metodo: Inmunocromatografía\n    IGM-   SENSIBILIDAD: 95.60%\n                ESPECIFICIDAD: 96.00%");
        jScrollPane7.setViewportView(jTextAreaIgm);

        jTextAreaIgg.setColumns(20);
        jTextAreaIgg.setRows(5);
        jTextAreaIgg.setText("Metodo: Inmunocromatografía\n    IGM-   SENSIBILIDAD: 95.60%\n                ESPECIFICIDAD: 96.00%");
        jScrollPane8.setViewportView(jTextAreaIgg);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel93.setText("VALOR IGM:");

        jLabel94.setText("VALOR IGG:");

        jLabel95.setText("Doctor:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkInvalido1)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel92))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkIggReactivo1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(chkIgmReactivo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(chkIgmNoReactivo1))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(chkIggNoReactivo1))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIgmReactivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIgmNoReactivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkIggReactivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIggNoReactivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92))
                        .addGap(18, 18, 18)
                        .addComponent(chkInvalido1)
                        .addContainerGap())))
        );

        btnGrabarIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabarIn1.setText("Grabar/Actualizar");
        btnGrabarIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIn1ActionPerformed(evt);
            }
        });

        btnLimpiarIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarIn1.setText("Limpiar");
        btnLimpiarIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIn1ActionPerformed(evt);
            }
        });

        jLabel85.setBackground(new java.awt.Color(153, 255, 153));
        jLabel85.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 0, 0));
        jLabel85.setText("SANTO DOMINGUITO");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabarIn1)
                            .addComponent(btnLimpiarIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel85)))
                .addGap(125, 125, 125))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel85)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnGrabarIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnLimpiarIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jtLaboratorio.addTab("EXAMEN CUANTITATIVO", jPanel14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void colororina(){
      String sQuery;        
        // Prepara el Query
        sQuery ="select nombreColor from colorOrina";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     jComboBoxColor.addItem(oConn.setResult.getString ("nombreColor"));
                     
                 }
                 
                 // Cierra Resultados
               //  oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(LaboratorioClinico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        jComboBoxColor.setSelectedItem(0);
        //cboSede.setSelectedIndex(1);


}
private void aspectoorina(){
      String sQuery;        
        // Prepara el Query
        sQuery ="select nombre from aspectoOrina";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     jComboAsp.addItem(oConn.setResult.getString ("nombre"));
                     
                 }
                 
                 // Cierra Resultados
               //  oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(LaboratorioClinico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        jComboAsp.setSelectedItem(0);
        //cboSede.setSelectedIndex(1);


}
    public void agregarSimtocasPc(){
      if(OrdenExiste1()){  
            Actualizar();
         }else{
              if(!txtNordenIn.getText().isEmpty()){
            try {
              
                if(Grabar()){
                  //  imprimir();
                    limpiar();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConstanciaSaludMarsa.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
         }
    }
    
    private boolean Grabar() throws SQLException{
        boolean bResult = false;
              
       String strSqlStmt ="INSERT INTO constancia_salud_marsa(\n" +
"            n_orden, fecha_examen, hora_examen, txtmuestra, chk_asintomatico, \n" +
"            chk_sintomatico, txtresultados, chks1, chks2, chks3, chks4, chks5, \n" +
"            chks6, chks7, chks8, chks9, chks10, chks11, chks12, chks13)";       
            strSqlStmt+= "values ('"+ txtNordenIn.getText().toString()+"',"
                    + "'"+ FechaHotel.getDate()+"',"
                    + "'"+ lblHora.getText()+"',"
                    + "'MUESTRA PC',"
                    + "'"+ chkAsintomatico.isSelected()+"',"
                    + "'"+ chkSintomatico.isSelected()+"',"
                    + "'"+txtSintoma.getText()+"',"
                    +"'"+chkTos.isSelected()+ "',"
                    +"'"+chkDolorG.isSelected()+ "',"
                    +"'"+chkCongestionN.isSelected()+ "',"
                    + "'"+chkDificultadR.isSelected()+ "',"
                    + "'"+chkFiebre.isSelected()+ "',"
                    + "'"+chkMalestar.isSelected()+ "',"
                    + "'"+chkDiarrea.isSelected()+ "',"
                    + "'"+chkNauseas.isSelected()+ "',"
                    + "'"+chkCefalea.isSelected()+ "',"
                    + "'"+chkIrritaibilidad.isSelected()+ "',"
                    + "'"+chkDolor.isSelected()+ "',"
                    + "'"+chkExpctoracion.isSelected()+ "',"
                    + "'"+chkPerdidaOlf1.isSelected()+"' )";
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                
//                   oConn.setResult.next();
            
                   bResult = true;
                       oFunc.SubSistemaMensajeInformacion("Orden Registrada");
               }
              
              
                return bResult;       
        }
    
    
      private void Actualizar(){
        String sCodigo=txtNordenIn.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE constancia_salud_marsa\n" +
                    "   SET  fecha_examen='"+FechaHotel.getDate()+"',"
                +"hora_examen='"+lblHora.getText()+"',"
                +"txtmuestra='MUESTRA PC',"
                +"chk_asintomatico='"+chkAsintomatico.isSelected()+"',"
                +"chk_sintomatico='"+chkSintomatico.isSelected()+"',"
                + "txtresultados='"+txtSintoma.getText()+"'" ;
              strSqlStmt+= ", chks1='"+chkTos.isSelected()+"'"
                        + ", chks2='"+chkDolorG.isSelected()+"'"
                        + ", chks3='"+chkCongestionN.isSelected()+"'"
                        + ", chks4='"+chkDificultadR.isSelected()+"'"
                        + ", chks5='"+chkFiebre.isSelected()+"'"
                        + ", chks6='"+chkMalestar.isSelected()+"'"
                        + ", chks7='"+chkDiarrea.isSelected()+"'"
                        + ", chks8='"+chkNauseas.isSelected()+"'"
                        + ", chks9='"+chkCefalea.isSelected()+"'"
                        + ", chks10='"+chkIrritaibilidad.isSelected()+"'"
                        + ", chks11='"+chkDolor.isSelected()+"'"
                        + ", chks12='"+chkExpctoracion.isSelected()+"'"
                        + ", chks13='"+chkPerdidaOlf1.isSelected()+"'"+
                " WHERE n_orden='" + sCodigo + "'";
            
        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
          //  imprimir();
            limpiar();
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        
    }
    private void limpiar(){

chkAsintomatico.setSelected(true);
txtSintoma.setText(null);
chkTos.setSelected(false);
        chkDolorG.setSelected(false);
        chkCongestionN.setSelected(false);
        chkDificultadR.setSelected(false);
        chkFiebre.setSelected(false);
        chkMalestar.setSelected(false);
        chkDiarrea.setSelected(false);
        chkNauseas.setSelected(false);
        chkCefalea.setSelected(false);
        chkIrritaibilidad.setSelected(false);
        chkDolor.setSelected(false);
        chkExpctoracion.setSelected(false);
        chkPerdidaOlf1.setSelected(false);
chkSintomatico.setSelected(false);
negarcheks();
}
    
   public boolean OrdenExiste1()
    {
        boolean bResultado=false;
        if(!txtNordenIn.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select n_orden from constancia_salud_marsa Where n_orden ="+txtNordenIn.getText().toString();
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
    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
      if(!txtNorden.getText().isEmpty()){
         if(! OrdenExiste()){
          String Sql="SELECT n_orden_ocupacional.razon_empresa,n_orden_ocupacional.razon_contrata,d.nombres_pa||' '||d.apellidos_pa as nombres,n_orden_ocupacional.cod_pa,"
                  + " n_orden_ocupacional.nom_examen,n_orden_ocupacional.grupofactorsan ";
              Sql+="FROM n_orden_ocupacional INNER JOIN datos_paciente as d ON (n_orden_ocupacional.cod_pa = d.cod_pa) WHERE n_orden_ocupacional.n_orden ='"+txtNorden.getText().toString()+ "'";
              
              oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtcontrata.setText(oConn.setResult.getString("razon_contrata"));
                         txtNombres.setText(oConn.setResult.getString("nombres"));
                         String s=oConn.setResult.getString("cod_pa");
                         String exa=oConn.setResult.getString("nom_examen");
                         txtGFSPrevio.setText(oConn.setResult.getString("grupofactorsan"));
                         txtDni.setText(s);
                         oPe.fecha(FechaExamen);
                         txtResponsable.requestFocus();  
                         sbCargarDatosTipoSangre(s);
                         if("RETIRO".equals(exa)){
                             txtGlucosaBio.setText("N/A");
                             txtCreatininaBio.setText("N/A");
                         }
                             
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de nuevo");
                    }
                    oConn.setResult.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Laboratorio Clinico:" + ex.getMessage().toString());
        }
      
      }
      }     
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        FechaExamen.requestFocusInWindow();
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtResponsableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyReleased
       if (evt.getKeyCode()==112) // F1 = 112
        {
             //MostrarAgregarEmpresa();
                 }
       if(!(evt.getKeyCode()>=65 && evt.getKeyCode()<=90 || evt.getKeyCode()>=96 && evt.getKeyCode()<=105 || evt.getKeyCode() == KeyEvent.VK_ENTER ))
            return;
        if(txtResponsable.getText().isEmpty())
            return;
        if(responsable.length ==0)
            return;
        addTextAndSelectToTextFieldToRest(txtResponsable, getTextoApartirVector(txtResponsable.getText(), responsable));
    }//GEN-LAST:event_txtResponsableKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
Limpiar();
btgroup();
jtLaboratorio.setSelectedIndex(0);
txtNorden.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if (OrdenExiste()) {
            actualizar();
            Limpiar();
            btgroup();
        } else {
            Agregar();
        }
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void chkFichaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFichaMedicaActionPerformed
        if(chkFichaMedica.isSelected()==true){
               Limpiar();
        txtNorden.setEditable(true);
        txtNrecibo.setText(null);
        txtNrecibo.setEditable(false);
        txtNorden.requestFocus();
        }
    }//GEN-LAST:event_chkFichaMedicaActionPerformed

    private void chkParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkParticularActionPerformed
           if(chkParticular.isSelected()== true){
              Limpiar();
        txtNorden.setEditable(false);
         txtNorden.setText(null);
        txtNrecibo.setEditable(true);
         txtNrecibo.requestFocus();
        }
    }//GEN-LAST:event_chkParticularActionPerformed

    private void chkConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConsultasActionPerformed
         if(chkConsultas.isSelected()==true){
            Limpiar();
        txtNorden.setEditable(false);
         txtNorden.setText(null);
        txtNrecibo.setEditable(true);
         txtNrecibo.requestFocus();
        }
    }//GEN-LAST:event_chkConsultasActionPerformed

    private void chkReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReciboActionPerformed
        if(chkRecibo.isSelected()==true){
            
        txtImp.setEditable(true);
        txtImp.setText(null);
      
        }
    }//GEN-LAST:event_chkReciboActionPerformed

    private void chkOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOrdenActionPerformed
       if(chkOrden.isSelected()==true){    
        txtImp.setEditable(true);
        txtImp.setText(null);
      
        }
    }//GEN-LAST:event_chkOrdenActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
     ReImp();     
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtHemoglobinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHemoglobinaActionPerformed
       if(!txtNorden.getText().isEmpty()){
           String sql="SELECT dp.sexo_pa FROM datos_paciente as dp " 
                +"inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) "
                + "where n.n_orden="+txtNorden.getText().toString()+"";
        oConn.FnBoolQueryExecute(sql);
        String sexo;
    try {
        if (oConn.setResult.next())
            {
        sexo = oConn.setResult.getString("sexo_pa");
         float hemoglobina=Float.parseFloat(txtHemoglobina.getText().toString());
               if ("M".equals(sexo)) {
                   if(hemoglobina < 14 || hemoglobina > 20){
                  //     System.out.println("entro a pintar de rojo:"+txtHemoglobina.getText().toString());
                        txtHemoglobina.setForeground(Color.red);
                    }
                   else{
                       txtHemoglobina.setForeground(Color.BLACK);
                   }
               }
               if ("F".equals(sexo)) {
                    if(hemoglobina < 13.5 || hemoglobina > 20){
                         txtHemoglobina.setForeground(Color.red);
                    }
                    else{
                       txtHemoglobina.setForeground(Color.BLACK);
                   }
               }
            }
        oConn.setResult.close();
    } catch (SQLException ex) {
        oFunc.SubSistemaMensajeError("ERROR EN CONSULTA");
    }
       }
              
        txtHematocrito.requestFocus();
    }//GEN-LAST:event_txtHemoglobinaActionPerformed

    private void txtHematocritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHematocritoActionPerformed
        txtVSG.requestFocus();
    }//GEN-LAST:event_txtHematocritoActionPerformed

    private void txtVSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVSGActionPerformed
        txtLeucocitosEmatologia.requestFocus();
    }//GEN-LAST:event_txtVSGActionPerformed

    private void txtLeucocitosEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeucocitosEmatologiaActionPerformed
        txtHematiesEmatologia.requestFocus();
    }//GEN-LAST:event_txtLeucocitosEmatologiaActionPerformed

    private void txtHematiesEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHematiesEmatologiaActionPerformed
       txtPlaquetas.requestFocus();
    }//GEN-LAST:event_txtHematiesEmatologiaActionPerformed

    private void txtNeutrofilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNeutrofilosActionPerformed
        txtAbastonados.requestFocus();
    }//GEN-LAST:event_txtNeutrofilosActionPerformed

    private void txtAbastonadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbastonadosActionPerformed
       txtsegmentadosEmatologia.requestFocus();
    }//GEN-LAST:event_txtAbastonadosActionPerformed

    private void txtsegmentadosEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsegmentadosEmatologiaActionPerformed
        txtmonocitosEmatologia.requestFocus();
    }//GEN-LAST:event_txtsegmentadosEmatologiaActionPerformed

    private void txtmonocitosEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmonocitosEmatologiaActionPerformed
        txtEosinofiosEmatologia.requestFocus();
    }//GEN-LAST:event_txtmonocitosEmatologiaActionPerformed

    private void txtEosinofiosEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEosinofiosEmatologiaActionPerformed
       txtbasofilosEmatologia.requestFocus();
    }//GEN-LAST:event_txtEosinofiosEmatologiaActionPerformed

    private void txtbasofilosEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbasofilosEmatologiaActionPerformed
       txtLinfocitosEmatologia.requestFocus();
    }//GEN-LAST:event_txtbasofilosEmatologiaActionPerformed

    private void txtLinfocitosEmatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinfocitosEmatologiaActionPerformed
        txtGlucosaBio.requestFocus();
    }//GEN-LAST:event_txtLinfocitosEmatologiaActionPerformed

    private void txtGlucosaBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGlucosaBioActionPerformed
        if(!txtGlucosaBio.getText().isEmpty()){
             float glucosa = Float.parseFloat(txtGlucosaBio.getText().toString());
            if (glucosa >= 110 || glucosa < 70) {
                txtGlucosaBio.setForeground(Color.red);
            } else {
                txtGlucosaBio.setForeground(Color.black);
            }
        }
       
        txtCreatininaBio.requestFocus();
    }//GEN-LAST:event_txtGlucosaBioActionPerformed

    private void txtCreatininaBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatininaBioActionPerformed
        if(txtCreatininaBio.getText().isEmpty()){
           float cretinina=Float.parseFloat(txtCreatininaBio.getText().toString());
               if(cretinina>=1.4 || cretinina<0.8){
                   txtCreatininaBio.setForeground(Color.red);
               }else{
                   txtCreatininaBio.setForeground(Color.black);
               }
        
        }
        txtVIH.requestFocus(); 
       
    }//GEN-LAST:event_txtCreatininaBioActionPerformed

    private void txtVIHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVIHActionPerformed
        jtLaboratorio.setSelectedIndex(1);
       txtColorEF.requestFocus();
    }//GEN-LAST:event_txtVIHActionPerformed

    private void txtDensidadEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDensidadEFActionPerformed
        txtAspectoEF.requestFocus();
    }//GEN-LAST:event_txtDensidadEFActionPerformed

    private void txtAspectoEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAspectoEFActionPerformed
        txtPhEF.requestFocus();
    }//GEN-LAST:event_txtAspectoEFActionPerformed

    private void txtPhEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhEFActionPerformed
       txtNitritosEQ.requestFocus();
    }//GEN-LAST:event_txtPhEFActionPerformed

    private void txtColorEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorEFActionPerformed
        txtDensidadEF.requestFocus();
    }//GEN-LAST:event_txtColorEFActionPerformed

    private void txtNitritosEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitritosEQActionPerformed
        txtProteinasEQ.requestFocus();
    }//GEN-LAST:event_txtNitritosEQActionPerformed

    private void txtProteinasEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProteinasEQActionPerformed
        txtCetonasEQ.requestFocus();
    }//GEN-LAST:event_txtProteinasEQActionPerformed

    private void txtCetonasEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCetonasEQActionPerformed
        txtLeucocitosEQ.requestFocus();
    }//GEN-LAST:event_txtCetonasEQActionPerformed

    private void txtLeucocitosEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeucocitosEQActionPerformed
        txtUrobilinogenoEQ.requestFocus();
    }//GEN-LAST:event_txtLeucocitosEQActionPerformed

    private void txtUrobilinogenoEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrobilinogenoEQActionPerformed
        txtBilirubinaEQ.requestFocus();
    }//GEN-LAST:event_txtUrobilinogenoEQActionPerformed

    private void txtBilirubinaEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBilirubinaEQActionPerformed
        txtGlucosaEQ.requestFocus();
    }//GEN-LAST:event_txtBilirubinaEQActionPerformed

    private void txtGlucosaEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGlucosaEQActionPerformed
        txtSangreEQ.requestFocus();
    }//GEN-LAST:event_txtGlucosaEQActionPerformed

    private void txtSangreEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSangreEQActionPerformed
        txtLeucocitosSU.requestFocus();
    }//GEN-LAST:event_txtSangreEQActionPerformed

    private void txtLeucocitosSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeucocitosSUActionPerformed
        txtCelEpitelialesSU.requestFocus();
    }//GEN-LAST:event_txtLeucocitosSUActionPerformed

    private void txtCelEpitelialesSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelEpitelialesSUActionPerformed
       txtCilindiosSU.requestFocus();
    }//GEN-LAST:event_txtCelEpitelialesSUActionPerformed

    private void txtCilindiosSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCilindiosSUActionPerformed
        txtBacteriasSU.requestFocus();
    }//GEN-LAST:event_txtCilindiosSUActionPerformed

    private void txtBacteriasSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBacteriasSUActionPerformed
        txtHematiesSU.requestFocus();
    }//GEN-LAST:event_txtBacteriasSUActionPerformed

    private void txtHematiesSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHematiesSUActionPerformed
        txtCristalesSU.requestFocus();
    }//GEN-LAST:event_txtHematiesSUActionPerformed

    private void txtCristalesSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCristalesSUActionPerformed
        txtPusSU.requestFocus();
    }//GEN-LAST:event_txtCristalesSUActionPerformed

    private void txtPusSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPusSUActionPerformed
        txtOtrosSu.requestFocus();
    }//GEN-LAST:event_txtPusSUActionPerformed

    private void txtOtrosSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtrosSuActionPerformed
        txtCocaina.requestFocus();
    }//GEN-LAST:event_txtOtrosSuActionPerformed

    private void txtCocainaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCocainaActionPerformed
        txtmarihuana.requestFocus();
    }//GEN-LAST:event_txtCocainaActionPerformed

    private void txtmarihuanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarihuanaActionPerformed
        txtObservacionesLB.requestFocus();
    }//GEN-LAST:event_txtmarihuanaActionPerformed

    private void txtNitritosEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNitritosEQFocusGained
        txtNitritosEQ.selectAll();
    }//GEN-LAST:event_txtNitritosEQFocusGained

    private void txtProteinasEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProteinasEQFocusGained
        txtProteinasEQ.selectAll();
    }//GEN-LAST:event_txtProteinasEQFocusGained

    private void txtCetonasEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCetonasEQFocusGained
       txtCetonasEQ.selectAll();
    }//GEN-LAST:event_txtCetonasEQFocusGained

    private void txtLeucocitosEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLeucocitosEQFocusGained
        txtLeucocitosEQ.selectAll();
    }//GEN-LAST:event_txtLeucocitosEQFocusGained

    private void txtUrobilinogenoEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUrobilinogenoEQFocusGained
        txtUrobilinogenoEQ.selectAll();
    }//GEN-LAST:event_txtUrobilinogenoEQFocusGained

    private void txtBilirubinaEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBilirubinaEQFocusGained
        txtBilirubinaEQ.selectAll();
    }//GEN-LAST:event_txtBilirubinaEQFocusGained

    private void txtGlucosaEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGlucosaEQFocusGained
        txtGlucosaEQ.selectAll();
    }//GEN-LAST:event_txtGlucosaEQFocusGained

    private void txtSangreEQFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSangreEQFocusGained
        txtSangreEQ.selectAll();
    }//GEN-LAST:event_txtSangreEQFocusGained

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObservacionesActionPerformed
        laboratorio();
    }//GEN-LAST:event_btnObservacionesActionPerformed

    private void chkIncoloroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIncoloroActionPerformed
       if(chkIncoloro.isSelected()){
            txtColorEF.setText("INCOLORO");
       }
    }//GEN-LAST:event_chkIncoloroActionPerformed

    private void chkMedicamentosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMedicamentosaActionPerformed
      if(chkMedicamentosa.isSelected()){
            txtColorEF.setText("MEDICAMENTOSA");}
    }//GEN-LAST:event_chkMedicamentosaActionPerformed

    private void chkTransparenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTransparenteActionPerformed
        if(chkTransparente.isSelected()){
            txtAspectoEF.setText("TRANSPARENTE");}
    
    }//GEN-LAST:event_chkTransparenteActionPerformed

    private void chkLigTurbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLigTurbioActionPerformed
         if(chkLigTurbio.isSelected()){
            txtAspectoEF.setText("TURBIO");}
    }//GEN-LAST:event_chkLigTurbioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     if(!txtNorden.getText().isEmpty()){
        chkPositivo.setSelected(false);
        chkNegativo.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckVposi.setSelected(false);
        jCheckNe.setSelected(false);
        jCheckNA.setSelected(false);

         Editar();
         sbCargarDatosTipoSangre(txtDni.getText());
        }else {oFunc.SubSistemaMensajeError("No hay datos en anexo 7c o orden no existe");}
    }//GEN-LAST:event_btnEditarActionPerformed

    private void chkReactivoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReactivoCActionPerformed
         if(chkReactivoC.isSelected()){
            txtCocaina.setText("REACTIVO");
         }
    }//GEN-LAST:event_chkReactivoCActionPerformed

    private void chkNoReactivoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoReactivoCActionPerformed
         if(chkNoReactivoC.isSelected()){
            txtCocaina.setText("NO REACTIVO");
         }
    }//GEN-LAST:event_chkNoReactivoCActionPerformed

    private void chkNACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNACActionPerformed
        if(chkNAC.isSelected()){
            txtCocaina.setText("N/A");
         }
    }//GEN-LAST:event_chkNACActionPerformed

    private void chkReactivoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReactivoMActionPerformed
         if(chkReactivoM.isSelected()){
            txtmarihuana.setText("REACTIVO");
         }
    }//GEN-LAST:event_chkReactivoMActionPerformed

    private void chkNoReactivoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoReactivoMActionPerformed
        if(chkNoReactivoM.isSelected()){
            txtmarihuana.setText("NO REACTIVO");
         }
    }//GEN-LAST:event_chkNoReactivoMActionPerformed

    private void chkNAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNAMActionPerformed
        if(chkNAM.isSelected()){
            txtmarihuana.setText("N/A");
         }
    }//GEN-LAST:event_chkNAMActionPerformed

    private void txtHemoglobinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHemoglobinaKeyTyped
         
    }//GEN-LAST:event_txtHemoglobinaKeyTyped

    private void tblabclinicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblabclinicoMouseClicked
        if (evt.getClickCount() == 2)
        {
            Integer cod  = Integer.valueOf( tblabclinico.getValueAt(tblabclinico.getSelectedRow(),0).toString());
            oPe.print(cod, "Triaje.jasper", "Ficha Triaje");

        }
    }//GEN-LAST:event_tblabclinicoMouseClicked

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
         Limpiar();
        btgroup();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void chkOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOActionPerformed
        txtGrupoFacLab.setText("O");
    }//GEN-LAST:event_chkOActionPerformed

    private void chkAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAActionPerformed
        txtGrupoFacLab.setText("A");
    }//GEN-LAST:event_chkAActionPerformed

    private void chkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBActionPerformed
        txtGrupoFacLab.setText("B");
    }//GEN-LAST:event_chkBActionPerformed

    private void chkABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkABActionPerformed
        txtGrupoFacLab.setText("AB");
    }//GEN-LAST:event_chkABActionPerformed

    private void rbRHpositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRHpositivoActionPerformed
        txtGrupoFacLab.setText(txtGrupoFacLab.getText().toString()+"+");
      /*  if(txtGrupoFacLab.getText() == null ? txtGFSPrevio.getText() == null : !txtGrupoFacLab.getText().equals(txtGFSPrevio.getText())){
            oFunc.SubSistemaMensajeError("Grupo Sanguinio incongruente por favotr revisar");
        }*/
    }//GEN-LAST:event_rbRHpositivoActionPerformed

    private void rbRHnegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRHnegativoActionPerformed
        txtGrupoFacLab.setText(txtGrupoFacLab.getText().toString()+"-");
/*        if(txtGrupoFacLab.getText() == null ? txtGFSPrevio.getText() == null : !txtGrupoFacLab.getText().equals(txtGFSPrevio.getText())){
            oFunc.SubSistemaMensajeError("Grupo Sanguinio incongruente por favotr revisar");
        }*/
    }//GEN-LAST:event_rbRHnegativoActionPerformed

    private void chkRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRetiroActionPerformed
        
    }//GEN-LAST:event_chkRetiroActionPerformed

    private void chkNoAplicaExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoAplicaExamenActionPerformed
         txtColorEF.setText("N/A");
        txtDensidadEF.setText("N/A");
        txtAspectoEF.setText("N/A");
        txtPhEF.setText("N/A");
        txtNitritosEQ.setText("N/A");
        txtProteinasEQ.setText("N/A");
        txtCetonasEQ.setText("N/A");
        txtLeucocitosEQ.setText("N/A");
        txtUrobilinogenoEQ.setText("N/A");
        txtBilirubinaEQ.setText("N/A");
        txtGlucosaEQ.setText("N/A");
        txtSangreEQ.setText("N/A");
        txtLeucocitosSU.setText("N/A");
        txtCelEpitelialesSU.setText("N/A");
        txtCilindiosSU.setText("N/A");
        txtBacteriasSU.setText("N/A");
        txtHematiesSU.setText("N/A");
        txtCristalesSU.setText("N/A");
        txtPusSU.setText("N/A");
        txtOtrosSu.setText("N/A");
        txtCocaina.setText("N/A");
        txtmarihuana.setText("N/A");
    }//GEN-LAST:event_chkNoAplicaExamenActionPerformed

    private void chkNACreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNACreatActionPerformed
        if(chkNACreat.isSelected()){
            txtCreatininaBio.setText("N/A");
        }
    }//GEN-LAST:event_chkNACreatActionPerformed

    private void chkNAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNAGActionPerformed
        if(chkNAG.isSelected()){
            txtGlucosaBio.setText("N/A");
        }
    }//GEN-LAST:event_chkNAGActionPerformed

    private void txtPlaquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaquetasActionPerformed
        txtNeutrofilos.requestFocus();
    }//GEN-LAST:event_txtPlaquetasActionPerformed

    private void chkIgmReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
        
    }//GEN-LAST:event_chkIgmReactivoActionPerformed

    private void chkIgmNoReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmNoReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIgmNoReactivoActionPerformed

    private void chkIggNoReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggNoReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIggNoReactivoActionPerformed

    private void chkIggReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIggReactivoActionPerformed
public void negarcheks(){
 chkTos.setEnabled(false);
        chkDolorG.setEnabled(false);
        chkCongestionN.setEnabled(false);
        chkDificultadR.setEnabled(false);
        chkFiebre.setEnabled(false);
        chkMalestar.setEnabled(false);
        chkDiarrea.setEnabled(false);
        chkNauseas.setEnabled(false);
        chkCefalea.setEnabled(false);
        chkIrritaibilidad.setEnabled(false);
        chkDolor.setEnabled(false);
        chkExpctoracion.setEnabled(false);
        chkPerdidaOlf1.setEnabled(false);
        txtSintoma.setEnabled(false);
}
    private void btnGrabarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarInActionPerformed
      //  System.out.println("el valor es: "+!pasar.equals("PC"));  
        //System.out.println("el valor de pc: "+pasar);  
        if(pasar.isEmpty())
          {
           pasar="P20";
          }
          if(pasar.equals("PC")) 
          {
            
              soloPc();  
               if(valor==2)
              
                 if(OrdenExisteIn())
                 {   
                    ActualizarIn();
                    LimpiarIn();
           
                 }       
                 else{
                        if(!txtNordenIn.getText().isEmpty()){
                            try {
                                if(validarIn()){
                                    if(GrabarIn()){
                                        imprimirIn();
                                        LimpiarIn();
                                    }
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(LaboratorioClinico.class.getName()).log(Level.SEVERE, null, ex);
                              }
                        }
                }
          } 
         
          else 
          {
          
               if(OrdenExisteIn()){   
                    ActualizarIn();
                    LimpiarIn();
           
               } 
               else{
                    if(!txtNordenIn.getText().isEmpty()){
                        try {
                            if(validarIn()){
                                if(GrabarIn()){
                                    imprimirIn();
                                    LimpiarIn();
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(LaboratorioClinico.class.getName()).log(Level.SEVERE, null, ex);
                          }
                     }
               }
          
          
          }
          limpiar();
          valor=1;

    }//GEN-LAST:event_btnGrabarInActionPerformed

    private void btnLimpiarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInActionPerformed
        // TODO add your handling code here:
        LimpiarIn();
        negarPc();
    }//GEN-LAST:event_btnLimpiarInActionPerformed
    public static com.toedter.calendar.JDateChooser FechaNacimiento;
    private void txtNordenInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenInActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn.getText().isEmpty()){
            if(!OrdenExisteIn()){     
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
                          pasar=(oConn.setResult.getString("tipoprueba"));
                          txtEdadIn.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                     
                          //System.out.println(pasar);
                         if(pasar.equals("PC")) habilitarPc();
                         else 
                             negarPc();
                            //soloPc(pasar);
                          txtNordenIn.setEditable(false);
                       // FechaHoy.requestFocusInWindow();
                          oPe.fecha(FechaExIn);
                           oPe.fecha(FechaHotel);
                          
                         }else{
                          oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");       
                      }
              } catch (SQLException ex) {
              oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        } 
    }//GEN-LAST:event_txtNordenInActionPerformed
public void  negarPc(){
    jTextFieldSaturacion.setEnabled(false);
    FechaHotel.setEnabled(false);
    chkAsintomatico.setEnabled(false);
    chkSintomatico.setEnabled(false);
    //jButton1.setEnabled(false);
}
public void  habilitarPc(){
    jTextFieldSaturacion.setEnabled(true);
    FechaHotel.setEnabled(true);
    chkAsintomatico.setEnabled(true);
    chkSintomatico.setEnabled(true);

    
    //jButton1.setEnabled(true);
}

    public  void soloPc(){
      // System.out.println(pasar);
      
    if(!jTextFieldSaturacion.getText().isEmpty()){
      
            String sql2="SELECT spFuncionLLenadoPc("+txtNordenIn.getText()+",'"+FechaHotel.getDate()+"','"
                    +jTextFieldSaturacion.getText() +"');";
            valor=2;
            negarPc();
            jTextFieldSaturacion.setText("");
          //  System.out.println(sql2);
        oConn.FnBoolQueryExecute(sql2);
          agregarSimtocasPc();
        }
else
            JOptionPane.showMessageDialog(null, "LLENAR CO2 ","Sistema MEDSOFT",JOptionPane.ERROR_MESSAGE);
        
        
    }
    private void txtNordenInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenInKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenInKeyTyped

    private void btnEditarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
            + " ct.fecha_examen,ct.chkigm_reactivo, ct.chkigm_noreactivo, \n" +
            "                   ct.chkigg_reactivo, ct.chkigg_noreactivo, ct.chkinvalido, "
                    + "ct.cbomarca, ct.txtvrigm,ct.txtvrigg,n.tipoprueba " +
            "               FROM datos_paciente AS d \n" +
            "               INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "               INNER JOIN examen_inmunologico AS ct ON (ct.n_orden = n.n_orden) \n" +
            "               WHERE n.n_orden ='"+txtNordenIn.getText() +"'";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombresIn.setText(oConn.setResult.getString("nombre"));
                    txtDniIn.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn.setDate(oConn.setResult.getDate("fecha_examen"));
                    chkIgmReactivo.setSelected(oConn.setResult.getBoolean("chkigm_reactivo"));
                    chkIgmNoReactivo.setSelected(oConn.setResult.getBoolean("chkigm_noreactivo"));
                    chkIggReactivo.setSelected(oConn.setResult.getBoolean("chkigg_reactivo"));
                    chkIggNoReactivo.setSelected(oConn.setResult.getBoolean("chkigg_noreactivo"));
                    chkInvalido.setSelected(oConn.setResult.getBoolean("chkinvalido"));
                    cboMarca.setSelectedItem(oConn.setResult.getString("cbomarca"));
                    txtVRIgm.setText(oConn.setResult.getString("txtvrigm"));
                    txtVRIgg.setText(oConn.setResult.getString("txtvrigg"));
                    pasar=(oConn.setResult.getString("tipoprueba"));
                    FechaHotel.setDate(oConn.setResult.getDate("fecha_examen"));
                      if(pasar.equals("PC")) habilitarPc();
                      else negarPc();
                    
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarInActionPerformed

    private void FechaExInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExInPropertyChange
        
    }//GEN-LAST:event_FechaExInPropertyChange

    private void txtImprimirInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirInActionPerformed

    }//GEN-LAST:event_txtImprimirInActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if(!txtImprimirIn.getText().isEmpty()){
            printIn(Integer.valueOf(txtImprimirIn.getText()));
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void chkInvalidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInvalidoActionPerformed
        // TODO add your handling code here:
        bgIgm.clearSelection();
        bgIgg.clearSelection();
    }//GEN-LAST:event_chkInvalidoActionPerformed

    private void cboMarcaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMarcaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarcaPopupMenuWillBecomeInvisible

    private void cboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarcaActionPerformed
        cboMarca.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
  
       //      System.out.println("EL INDICE ES" + cboMarca.getSelectedIndex() );
            
                if (cboMarca.getSelectedIndex() <= -1) {
                    
                } 
                if(cboMarca.getSelectedIndex()==0){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad relativa: 98.8% \n"
                            + "Especificidad relativa : 98.7 %");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "Sensabilidad relativa: 93.7% \n"
                            + "Especificidad relativa : 99.1 %");
                }else if(cboMarca.getSelectedIndex()==1){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad relativa: 95.7% \n"
                            + "Especificidad relativa : 96.7 %");
                    txtVRIgm.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad relativa: 95.7% \n"
                            + "Especificidad relativa : 96.7% \n");
                }else if(cboMarca.getSelectedIndex()==2){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad: 94% \n"
                            + "Especificidad: 100% \n"
                            + "Sensibilidad del dispositivo de prueba IgM/IgG: 97.6% \n"
                            + "Especificidad del dispositivo de prueba IgM/IgG: 100 %");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                           + "Sensabilidad: 94% \n"
                            + "Especificidad: 100% \n"
                            + "Sensibilidad del dispositivo de prueba IgM/IgG: 97.6% \n"
                            + "Especificidad del dispositivo de prueba IgM/IgG: 100 %");
                }else if(cboMarca.getSelectedIndex()==3){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad: 84% \n"
                            + "Especificidad: 93.3% \n"
                            + "Sensibilidad clínica del kit: 98.67% \n"
                            + "Especificidad clínica del kit: 91.11 %");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                           + "Sensibilidad: 97.33% \n"
                            + "Especificidad: 93.33% \n"
                            + "Sensibilidad clínica del kit: 97.6% \n"
                            + "Especificidad clínica del kit: 100 %");
                }else if(cboMarca.getSelectedIndex()==4){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad: 91.45% \n"
                            + "Especificidad: 97%");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                           + "Sensabilidad: 91.45%\n"
                            + "Especificidad: 97% \n");
                }else if(cboMarca.getSelectedIndex()==5){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad Relativa: 93.75% \n"
                            + "Especificidad Relativa: 96.4%");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad Relativa: 93.75% \n"
                            + "Especificidad Relativa: 96.4%");
                }else if(cboMarca.getSelectedIndex()==6){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad: 96% \n"
                            + "Especificidad: 100%");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                           + "Sensabilidad: 92%\n"
                            + "Especificidad: 100% \n");
                }
                    else if(cboMarca.getSelectedIndex()==7){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 92% \n"
                            + "     ESPECIFICIDAD: 100 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +   "IGG- SENSIBILIDAD: 96% \n"
                            + "     ESPECIFICIDAD: 100 %");
                }
                  if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 95.60% \n"
                            + "     ESPECIFICIDAD: 96.00 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 95.60% \n"
                            +"      ESPECIFICIDAD: 96.00 %");
                }     else if(cboMarca.getSelectedIndex()==8){
                    
                     //if(cboMarca.getSelectedItem().toString().equals("BIOHIT HealthCare  SARS-CoV-2 IgM/igG ANTIBODY TEST KIT"))
                   
                     txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 97.5% \n"
                            + "     ESPECIFICIDAD: 99.5 %");
                     txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 97.5% \n"
                            +"      ESPECIFICIDAD: 100 %");
                     
                }
                 else if(cboMarca.getSelectedIndex()==9){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                        
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 93.75% \n"
                            + "     ESPECIFICIDAD: 96.40 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 93.75% \n"
                            +"      ESPECIFICIDAD: 96.40 %");
                } 
                else if(cboMarca.getSelectedIndex()==10){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                        
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 95.60% \n"
                            + "     ESPECIFICIDAD: 96.00 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 95.60% \n"
                            +"      ESPECIFICIDAD: 96.00 %");
                }  
            }
        });
    }//GEN-LAST:event_cboMarcaActionPerformed

    private void btnMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarcaMouseClicked
        MostrarAddMarca();
    }//GEN-LAST:event_btnMarcaMouseClicked

    private void cboMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMarcaMouseClicked
        // TODO add your handling code here:
        cboMarca.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboMarca.getSelectedIndex() <= -1) {
                    
                } 
                if(cboMarca.getSelectedIndex()==0){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad relativa: 98.8% \n"
                            + "Especificidad relativa : 98.7 %");
                    txtVRIgm.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensabilidad relativa: 93.7% \n"
                            + "Especificidad relativa : 99.1 %");
                }else if(cboMarca.getSelectedIndex()==1){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad relativa: 95.7% \n"
                            + "Especificidad relativa : 96.7 %");
                    txtVRIgm.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad relativa: 95.7% \n"
                            + "Especificidad relativa : 96.7% \n");
                }else if(cboMarca.getSelectedIndex()==2){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad: 94% \n"
                            + "Especificidad: 100% \n"
                            + "Sensibilidad del dispositivo de prueba IgM/IgG: 97.6% \n"
                            + "Especificidad del dispositivo de prueba IgM/IgG: 100 %");
                    txtVRIgm.setText("Metodo: Inmunocromatogragía\n"
                           + "Sensabilidad: 94% \n"
                            + "Especificidad: 100% \n"
                            + "Sensibilidad del dispositivo de prueba IgM/IgG: 97.6% \n"
                            + "Especificidad del dispositivo de prueba IgM/IgG: 100 %");
                }else if(cboMarca.getSelectedIndex()==3){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad: 84% \n"
                            + "Especificidad: 93.3% \n"
                            + "Sensibilidad clínica del kit: 98.67% \n"
                            + "Especificidad clínica del kit: 91.11 %");
                    txtVRIgm.setText("Metodo: Inmunocromatogragía\n"
                           + "Sensibilidad: 97.33% \n"
                            + "Especificidad: 93.33% \n"
                            + "Sensibilidad clínica del kit: 97.6% \n"
                            + "Especificidad clínica del kit: 100 %");
                }else if(cboMarca.getSelectedIndex()==4){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatogragía\n"
                            + "Sensibilidad: 91.45% \n"
                            + "Especificidad: 97%");
                    txtVRIgm.setText("Metodo: Inmunocromatogragía\n"
                           + "Sensabilidad: 91.45%\n"
                            + "Especificidad: 97% \n");
                }else if(cboMarca.getSelectedIndex()==5){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                 txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad Relativa: 93.75% \n"
                            + "Especificidad Relativa: 96.4%");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad Relativa: 93.75% \n"
                            + "Especificidad Relativa: 96.4%");
                }else if(cboMarca.getSelectedIndex()==6){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad: 96% \n"
                            + "Especificidad: 100%");
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                           + "Sensabilidad: 92%\n"
                            + "Especificidad: 100% \n");
                }
                         else if(cboMarca.getSelectedIndex()==7){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 92% \n"
                            + "     ESPECIFICIDAD: 100 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +   "IGG- SENSIBILIDAD: 96% \n"
                            + "     ESPECIFICIDAD: 100 %");
                }
          else if(cboMarca.getSelectedIndex()==8){
                    
                   //  if(cboMarca.getSelectedItem().toString().equals("BIOHIT HealthCare  SARS-CoV-2 IgM/igG ANTIBODY TEST KIT"))
                   
                     txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 97.5% \n"
                            + "     ESPECIFICIDAD: 99.5 %");
                     txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 97.5% \n"
                            +"      ESPECIFICIDAD: 100 %");
                     
                }
                 else if(cboMarca.getSelectedIndex()==9){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                        
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 93.75% \n"
                            + "     ESPECIFICIDAD: 96.40 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 93.75% \n"
                            +"      ESPECIFICIDAD: 96.40 %");
                } 
                else if(cboMarca.getSelectedIndex()==10){
//                if(cboMarca.getSelectedItem()=="RAPID RESPONSE COVID-19 IGM/IGG TEST CASSETTE"){
                        
                    txtVRIgm.setText("Metodo: Inmunocromatografía\n"
                            + "IGM- SENSIBILIDAD: 95.60% \n"
                            + "     ESPECIFICIDAD: 96.00 %");
                    txtVRIgg.setText("Metodo: Inmunocromatografía\n"
                          +  "IGG-  SENSIBILIDAD: 95.60% \n"
                            +"      ESPECIFICIDAD: 96.00 %");
                } 

            }
        });
    }//GEN-LAST:event_cboMarcaMouseClicked

    private void FechaHotelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaHotelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaHotelPropertyChange
 Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date HorNew = new Date();
            SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
            String FfechaSystemA = fechaforma.format(HorNew);

            GestorTime.setFfechaSystem(FfechaSystemA);
            lblHora.setText(GestorTime.getFfechaSystem());
        }
    });
 
 
 
    private void chkAsintomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsintomaticoActionPerformed
        // TODO add your handling code here:
        if(chkAsintomatico.isSelected())
        chkSintomatico.setSelected(false);
        chkTos.setEnabled(false);
        chkDolorG.setEnabled(false);
        chkCongestionN.setEnabled(false);
        chkDificultadR.setEnabled(false);
        chkFiebre.setEnabled(false);
        chkMalestar.setEnabled(false);
        chkDiarrea.setEnabled(false);
        chkNauseas.setEnabled(false);
        chkCefalea.setEnabled(false);
        chkIrritaibilidad.setEnabled(false);
        chkDolor.setEnabled(false);
        chkExpctoracion.setEnabled(false);
        chkPerdidaOlf1.setEnabled(false);
        txtSintoma.setEnabled(false);
    }//GEN-LAST:event_chkAsintomaticoActionPerformed

    private void chkSintomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSintomaticoActionPerformed
        // TODO add your handling code here:
         if( chkSintomatico.isSelected())
       chkAsintomatico.setSelected(false);
        chkTos.setEnabled(true);
        chkDolorG.setEnabled(true);
        chkCongestionN.setEnabled(true);
        chkDificultadR.setEnabled(true);
        chkFiebre.setEnabled(true);
        chkMalestar.setEnabled(true);
        chkDiarrea.setEnabled(true);
        chkNauseas.setEnabled(true);
        chkCefalea.setEnabled(true);
        chkIrritaibilidad.setEnabled(true);
        chkDolor.setEnabled(true);
        chkExpctoracion.setEnabled(true);
        chkPerdidaOlf1.setEnabled(true);
        txtSintoma.setEnabled(true);
    }//GEN-LAST:event_chkSintomaticoActionPerformed

    private void chkPerdidaOlf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPerdidaOlf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPerdidaOlf1ActionPerformed

    private void txtNordenIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenIn1ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn1.getText().isEmpty()){
            if(!OrdenExisteIn1()){     
              String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                 + "d.sexo_pa,n.tipoprueba "
                 + "FROM datos_paciente AS d "
                 + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                 + "WHERE n.n_orden ='"+txtNordenIn1.getText() +"'";
               oConn.FnBoolQueryExecute(Sql);
                  try {
                      if (oConn.setResult.next()) {
                          txtNombresIn1.setText(oConn.setResult.getString("nombre"));
                          txtDniIn1.setText(oConn.setResult.getString("cod_pa"));
                          FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                          pasar=(oConn.setResult.getString("tipoprueba"));
                          txtEdadIn1.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                   
                          //System.out.println(pasar);
                         if(pasar.equals("PC")) habilitarPc();
                         else 
                             negarPc();
                            //soloPc(pasar);
                          txtNordenIn1.setEditable(false);
                       // FechaHoy.requestFocusInWindow();
                          oPe.fecha(FechaExIn1);
                        //   oPe.fecha(FechaHotel);
                          
                         }else{
                          oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");       
                      }
              } catch (SQLException ex) {
              oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        } 
    }//GEN-LAST:event_txtNordenIn1ActionPerformed

    private void txtNordenIn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenIn1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenIn1KeyTyped

    private void btnEditarIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIn1ActionPerformed
                                                   
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn1.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
            + " ct.fecha_examen,ct.chkigm_reactivo, ct.chkigm_noreactivo, \n" +
            "                   ct.chkigg_reactivo, ct.chkigg_noreactivo, ct.chkinvalido, "
                    + "ct.cbomarca, ct.txtvrigm,ct.txtvrigg,n.tipoprueba,ct.valorigm,ct.valorigg,ct.medico " +
            "               FROM datos_paciente AS d \n" +
            "               INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "               INNER JOIN examen_inmunologico AS ct ON (ct.n_orden = n.n_orden) \n" +
            "               WHERE n.n_orden ='"+txtNordenIn1.getText() +"'";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombresIn1.setText(oConn.setResult.getString("nombre"));
                    txtDniIn1.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn1.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn1.setDate(oConn.setResult.getDate("fecha_examen"));
                    chkIgmReactivo1.setSelected(oConn.setResult.getBoolean("chkigm_reactivo"));
                    chkIgmNoReactivo1.setSelected(oConn.setResult.getBoolean("chkigm_noreactivo"));
                    chkIggReactivo1.setSelected(oConn.setResult.getBoolean("chkigg_reactivo"));
                    chkIggNoReactivo1.setSelected(oConn.setResult.getBoolean("chkigg_noreactivo"));
                    jTextField5.setText(oConn.setResult.getString("medico"));
                    jTextField3.setText(oConn.setResult.getString("valorigm"));
                    jTextField4.setText(oConn.setResult.getString("valorigg"));

                  // chkInvalido1.setSelected(oConn.setResult.getBoolean("chkinvalido"));
                  // chkInvalido1.setEnabled(true);
                  //  jTextField2.setText(oConn.setResult.getString("cbomarca"));
                   // jTextAreaIgm.setText(oConn.setResult.getString("txtvrigm"));
                   // jTextAreaIgg.setText(oConn.setResult.getString("txtvrigg"));
                    
                   // chkInvalido1.setSelected(false);
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                }
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarIn1ActionPerformed

    private void FechaExIn1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExIn1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExIn1PropertyChange

    private void txtImprimirIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirIn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirIn1ActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        if(!txtImprimirIn1.getText().isEmpty()){
      //System.out.println("el valor de imprimit es:"+txtImprimirIn1.getText());
            printIn1(Integer.valueOf(txtImprimirIn1.getText()));
        }
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    private void chkIgmReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIgmReactivo1ActionPerformed

    private void chkIgmNoReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmNoReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIgmNoReactivo1ActionPerformed

    private void chkIggNoReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggNoReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIggNoReactivo1ActionPerformed

    private void chkIggReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIggReactivo1ActionPerformed
    
    private void chkInvalido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInvalido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkInvalido1ActionPerformed

    private void btnGrabarIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIn1ActionPerformed
        // LLENADO SIMPLE 
        valorigm=Float.parseFloat(jTextField3.getText());
     //   System.out.println("valor del igm:"+valorigm);
        if(valorigm<1.00)
        {
        chkIgmNoReactivo1.setSelected(true);
        chkIgmReactivo1.setSelected(false);
        }
        else
        {
        chkIgmNoReactivo1.setSelected(false);
        chkIgmReactivo1.setSelected(true);
        }
                 valorigg=Float.parseFloat(jTextField4.getText());
           //  System.out.println("valor del igg:"+valorigg);

        if(valorigg<1.00)
        {
        chkIggNoReactivo1.setSelected(true);
        chkIggReactivo1.setSelected(false);
        }
        else
        {
        chkIggNoReactivo1.setSelected(false);
        chkIggReactivo1.setSelected(true);
        }
        
        // LAS ACCIONES DEL BOTON
        if(OrdenExisteIn1()){   
                    ActualizarIn1();
                    LimpiarIn();
           
               } 
               else{
                    if(!txtNordenIn1.getText().isEmpty()){
                        try {
                            if(validarIn()){
                                if(GrabarIn1()){
                                    imprimirIn1();
                                    LimpiarIn();
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(LaboratorioClinico.class.getName()).log(Level.SEVERE, null, ex);
                          }
                     }
               }
       
    }//GEN-LAST:event_btnGrabarIn1ActionPerformed

    private void btnLimpiarIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIn1ActionPerformed
LimpiarIn();

    }//GEN-LAST:event_btnLimpiarIn1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        valorigm=Float.parseFloat(jTextField3.getText());
    //    System.out.println("valor del igm:"+valorigm);
        if(valorigm<1.00)
        {
        chkIgmNoReactivo1.setSelected(true);
        chkIgmReactivo1.setSelected(false);
        }
        else
        {
        chkIgmNoReactivo1.setSelected(false);
        chkIgmReactivo1.setSelected(true);
        }
       
        
            
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
                valorigg=Float.parseFloat(jTextField4.getText());
        //     System.out.println("valor del igg:"+valorigg);

        if(valorigg<1.00)
        {
        chkIggNoReactivo1.setSelected(true);
        chkIggReactivo1.setSelected(false);
        }
        else
        {
        chkIggNoReactivo1.setSelected(false);
        chkIggReactivo1.setSelected(true);
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected())
       {
         txtRPR.setText("N/A");
       chkNegativo.setSelected(false);
       chkPositivo.setSelected(false);
       }
               
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
 if(jCheckBox1.isSelected())
       {
       //System.out.println("entro al click");
       chkNegativo.setSelected(false);
       //chkPositivo.setSelected(false);
       chkPositivo.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void txtRPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRPRActionPerformed

    private void chkPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPositivoActionPerformed
        if(chkPositivo.isSelected())
       {
       txtRPR.setText("POSITIVO");
       }
    }//GEN-LAST:event_chkPositivoActionPerformed

    private void chkNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNegativoActionPerformed
          if(chkNegativo.isSelected())
       {
       txtRPR.setText("NEGATIVO");
       }
    }//GEN-LAST:event_chkNegativoActionPerformed

    private void jCheckVposiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckVposiActionPerformed
          if(jCheckVposi.isSelected())
       {
       txtVIH.setText("POSITIVO");
       }
    }//GEN-LAST:event_jCheckVposiActionPerformed

    private void jCheckNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNeActionPerformed
          if(jCheckNe.isSelected())
       {
       txtVIH.setText("NEGATIVO");
       }
    }//GEN-LAST:event_jCheckNeActionPerformed

    private void jCheckNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNAActionPerformed
           if(jCheckNA.isSelected())
       {
       txtVIH.setText("N/A");
       }
    }//GEN-LAST:event_jCheckNAActionPerformed

    private void jComboBoxColorPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxColorPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_jComboBoxColorPopupMenuWillBecomeInvisible

    private void jComboBoxColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxColorMouseClicked

    }//GEN-LAST:event_jComboBoxColorMouseClicked

    private void jComboBoxColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxColorMouseEntered

    }//GEN-LAST:event_jComboBoxColorMouseEntered

    private void jComboBoxColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxColorMousePressed

    }//GEN-LAST:event_jComboBoxColorMousePressed

    private void jComboBoxColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxColorActionPerformed

    }//GEN-LAST:event_jComboBoxColorActionPerformed

    private void jComboBoxColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxColorKeyPressed

    }//GEN-LAST:event_jComboBoxColorKeyPressed

    private void jComboAspPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboAspPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_jComboAspPopupMenuWillBecomeInvisible

    private void jComboAspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboAspMouseClicked

    }//GEN-LAST:event_jComboAspMouseClicked

    private void jComboAspMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboAspMouseEntered

    }//GEN-LAST:event_jComboAspMouseEntered

    private void jComboAspMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboAspMousePressed

    }//GEN-LAST:event_jComboAspMousePressed

    private void jComboAspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAspActionPerformed

    }//GEN-LAST:event_jComboAspActionPerformed

    private void jComboAspKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboAspKeyPressed

    }//GEN-LAST:event_jComboAspKeyPressed
    private void Limpiar(){
        FechaExamen.setDate(null);
        txtNrecibo.setEditable(false);
        txtNorden.setText(null);
        txtNrecibo.setText(null);
        txtEmpresa.setText(null);
        txtcontrata.setText(null);
        txtNombres.setText(null);
        txtDni.setText(null);
        txtLeucocitosEmatologia.setText(null);
        txtHemoglobina.setText(null);
        txtHematocrito.setText(null);
        txtVSG.setText(null);
        txtHematiesEmatologia.setText(null);
        txtNeutrofilos.setText(null);
        txtAbastonados.setText(null);
        txtsegmentadosEmatologia.setText(null);
        txtmonocitosEmatologia.setText(null);
        txtEosinofiosEmatologia.setText(null);
        txtbasofilosEmatologia.setText(null);
        txtLinfocitosEmatologia.setText(null);
        txtGlucosaBio.setText(null);
        txtCreatininaBio.setText(null);
        txtVIH.setText("N/A");
        txtColorEF.setText("AMARILLO");
        txtDensidadEF.setText(null);
        txtAspectoEF.setText("LIG.TURBIO");
        txtPhEF.setText(null);
        txtNitritosEQ.setText("NEGATIVO");
        txtProteinasEQ.setText("NEGATIVO");
        txtCetonasEQ.setText("NEGATIVO");
        txtLeucocitosEQ.setText("NEGATIVO");
        txtUrobilinogenoEQ.setText("NEGATIVO");
        txtBilirubinaEQ.setText("NEGATIVO");
        txtGlucosaEQ.setText("NEGATIVO");
        txtSangreEQ.setText("NEGATIVO");
        txtLeucocitosSU.setText(null);
        txtCelEpitelialesSU.setText("ESCASAS");
        txtCilindiosSU.setText("NO SE OBSERVAN");
        txtBacteriasSU.setText("NO SE OBSERVAN");
        txtHematiesSU.setText(null);
        txtCristalesSU.setText("NO SE OBSERVAN");
        txtPusSU.setText("NO SE OBSERVAN");
        txtOtrosSu.setText("-");
        txtCocaina.setText(null);
        txtmarihuana.setText(null);
        txtObservacionesLB.setText(null);
        txtResponsable.setText(null);
        chkNAC.setSelected(false);
        chkNAM.setSelected(false);
        chkNoReactivoC.setSelected(false);
        chkNoReactivoM.setSelected(false);
        chkReactivoC.setSelected(false);
        chkReactivoM.setSelected(false);
        sbCargarDatosTipoSangre("0");
        txtGFSPrevio.setText(null);
        txtGrupoFacLab.setText(null);
        txtNorden.requestFocus();
    }
    void btgroup(){
     btGrupo.clearSelection();
       // btTipoEx.clearSelection();
        btFactor.clearSelection();
//        btRpr.clearSelection();
    }
    public void  laboratorio(){
       if(!txtGlucosaBio.getText().isEmpty()&& 
               !txtHemoglobina.getText().isEmpty() && !txtCreatininaBio.getText().isEmpty()){
        String sql="SELECT dp.sexo_pa FROM datos_paciente as dp " 
                +"inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) "
                + "where n.n_orden='"+txtNorden.getText().toString()+"'";
        oConn.FnBoolQueryExecute(sql);
        try {
            if (oConn.setResult.next())
            {
               String sexo=oConn.setResult.getString("sexo_pa");
               float cretinina=Float.parseFloat(txtCreatininaBio.getText().toString());
               float glucosa=Float.parseFloat(txtGlucosaBio.getText().toString());
               float hemoglobina=Float.parseFloat(txtHemoglobina.getText().toString());
               
               if(cretinina>=1.4){
                   txtObservacionesLB.append("- Creatinina: Hipercreatinemia"+'\n');
               }else if(cretinina<1.4 && cretinina>=0.8){
                   txtObservacionesLB.append("- Creatinina: Normal"+'\n');
               }
               if(glucosa>=110){
                   txtObservacionesLB.append("- Glucosa: Hiperglicemio"+'\n');
               }else if(glucosa>=70 && glucosa<110){
                   txtObservacionesLB.append("- Glucosa: Normal"+'\n');
               }
               if ("M".equals(sexo)) {
                    if (hemoglobina >= 14 && hemoglobina <= 20) {
                        txtObservacionesLB.append("- Hemoglobina: Normal" + '\n');
                    } else if(hemoglobina < 14 || hemoglobina > 20){
                        txtObservacionesLB.append("- Hemoglobina: Anormal" + '\n');
                    }
               }
               if ("F".equals(sexo)) {
                    if (hemoglobina >= 13.5 && hemoglobina <= 20) {
                        txtObservacionesLB.append("- Hemoglobina: Normal" + '\n');
                    } else if(hemoglobina < 13.5 || hemoglobina > 20){
                        txtObservacionesLB.append("- Hemoglobina: Anormal" + '\n');
                    }
               }
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeError("No existe registros del cliente");
       }
       }else {
           oFunc.SubSistemaMensajeInformacion("Debe ingresar Hemoglobina-Creatinina-Glucosa");
       }
       
    }
    public boolean OrdenExiste() {
        boolean bResultado = false;
        String sQuery = "Select * from lab_clinico Where n_orden=" + txtNorden.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next()) {
                bResultado = true;
//                oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//                txtNorden.setText(null);
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
        }
        return bResultado;
    }

    public boolean Orden() {
        boolean bResultado = false;
        String sQuery = "Select * from lab_clinico Where n_orden=" + txtImp.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next()) {
                bResultado = true;
                txtNorden.setText(null);
            } else {
                oFunc.SubSistemaMensajeError("Numero Orden no esta Registrado");
                txtImp.setText(null);
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
        }
        return bResultado;
    }

    public boolean Recibo() {
        boolean bResultado = false;
        String sQuery = "Select * from lab_clinico Where num_ticket=" + txtNrecibo.getText().toString();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next()) {
                bResultado = true;
                oFunc.SubSistemaMensajeError("Número de Recibo Utilizado");
                Limpiar();
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
        }
        return bResultado;
    }

    private void ReImp() {
        if (txtImp.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Numero");
        }

        if (chkOrden.isSelected() == true) {
            if (Orden()) {
                print(Integer.valueOf(txtImp.getText().toString()));

            }

        }
        if (chkRecibo.isSelected() == true) {

        }
        if (btReImp.isSelected(null)) {
            oFunc.SubSistemaMensajeError("Seleccione Opción");

        }

    }
    public void MostrarAddMarca() {
        addMarca = new AddMarcaCovid(this, true);
        addMarca.setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExIn;
    private com.toedter.calendar.JDateChooser FechaExIn1;
    private com.toedter.calendar.JDateChooser FechaExamen;
    private com.toedter.calendar.JDateChooser FechaHotel;
    private javax.swing.ButtonGroup bMarihuana;
    private javax.swing.ButtonGroup bgIgg;
    private javax.swing.ButtonGroup bgIgm;
    private javax.swing.ButtonGroup bgInvalido;
    private javax.swing.ButtonGroup btFactor;
    private javax.swing.ButtonGroup btGrupo;
    private javax.swing.ButtonGroup btReImp;
    private javax.swing.ButtonGroup btRpr;
    private javax.swing.ButtonGroup btTipoEx;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarIn;
    private javax.swing.JButton btnEditarIn1;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnGrabarIn;
    private javax.swing.JButton btnGrabarIn1;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiarIn;
    private javax.swing.JButton btnLimpiarIn1;
    private javax.swing.JLabel btnMarca;
    private javax.swing.JButton btnObservaciones;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox cboMarca;
    private javax.swing.JCheckBox chkA;
    private javax.swing.JCheckBox chkAB;
    private javax.swing.JCheckBox chkAsintomatico;
    private javax.swing.JCheckBox chkB;
    private javax.swing.JCheckBox chkCefalea;
    private javax.swing.JCheckBox chkCongestionN;
    private javax.swing.JCheckBox chkConsultas;
    private javax.swing.JCheckBox chkDiarrea;
    private javax.swing.JCheckBox chkDificultadR;
    private javax.swing.JCheckBox chkDolor;
    private javax.swing.JCheckBox chkDolorG;
    private javax.swing.JCheckBox chkExpctoracion;
    private javax.swing.JCheckBox chkFichaMedica;
    private javax.swing.JCheckBox chkFiebre;
    private javax.swing.JCheckBox chkIggNoReactivo;
    private javax.swing.JCheckBox chkIggNoReactivo1;
    private javax.swing.JCheckBox chkIggReactivo;
    private javax.swing.JCheckBox chkIggReactivo1;
    private javax.swing.JCheckBox chkIgmNoReactivo;
    private javax.swing.JCheckBox chkIgmNoReactivo1;
    private javax.swing.JCheckBox chkIgmReactivo;
    private javax.swing.JCheckBox chkIgmReactivo1;
    private javax.swing.JCheckBox chkIncoloro;
    private javax.swing.JCheckBox chkInvalido;
    private javax.swing.JCheckBox chkInvalido1;
    private javax.swing.JCheckBox chkIrritaibilidad;
    private javax.swing.JCheckBox chkLigTurbio;
    private javax.swing.JCheckBox chkMalestar;
    private javax.swing.JCheckBox chkMedicamentosa;
    private javax.swing.JCheckBox chkNAC;
    private javax.swing.JCheckBox chkNACreat;
    private javax.swing.JCheckBox chkNAG;
    private javax.swing.JCheckBox chkNAM;
    private javax.swing.JCheckBox chkNauseas;
    private javax.swing.JCheckBox chkNegativo;
    private javax.swing.JCheckBox chkNoAplicaExamen;
    private javax.swing.JCheckBox chkNoReactivoC;
    private javax.swing.JCheckBox chkNoReactivoM;
    private javax.swing.JCheckBox chkO;
    private javax.swing.JCheckBox chkOrden;
    private javax.swing.JCheckBox chkParticular;
    private javax.swing.JCheckBox chkPerdidaOlf1;
    private javax.swing.JCheckBox chkPositivo;
    private javax.swing.JCheckBox chkReactivoC;
    private javax.swing.JCheckBox chkReactivoM;
    private javax.swing.JCheckBox chkRecibo;
    private javax.swing.JCheckBox chkRetiro;
    private javax.swing.JCheckBox chkSintomatico;
    private javax.swing.JCheckBox chkTos;
    private javax.swing.JCheckBox chkTransparente;
    private javax.swing.ButtonGroup gCocaina;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckNA;
    private javax.swing.JCheckBox jCheckNe;
    private javax.swing.JCheckBox jCheckVposi;
    private javax.swing.JComboBox jComboAsp;
    private javax.swing.JComboBox jComboBoxColor;
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
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextAreaIgg;
    private javax.swing.JTextArea jTextAreaIgm;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldSaturacion;
    private javax.swing.JTabbedPane jtLaboratorio;
    private javax.swing.JTabbedPane jtTriaje;
    private javax.swing.JLabel lblHora;
    private javax.swing.JRadioButton rbRHnegativo;
    private javax.swing.JRadioButton rbRHpositivo;
    private javax.swing.JTable tblabclinico;
    private javax.swing.JTextField txtAbastonados;
    private javax.swing.JTextField txtAspectoEF;
    private javax.swing.JTextField txtBacteriasSU;
    private javax.swing.JTextField txtBilirubinaEQ;
    private javax.swing.JTextField txtCelEpitelialesSU;
    private javax.swing.JTextField txtCetonasEQ;
    private javax.swing.JTextField txtCilindiosSU;
    private javax.swing.JTextField txtCocaina;
    private javax.swing.JTextField txtColorEF;
    private javax.swing.JTextField txtCreatininaBio;
    private javax.swing.JTextField txtCristalesSU;
    private javax.swing.JTextField txtDensidadEF;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniIn;
    private javax.swing.JTextField txtDniIn1;
    private javax.swing.JTextField txtEdadIn;
    private javax.swing.JTextField txtEdadIn1;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEosinofiosEmatologia;
    private javax.swing.JTextField txtGFSPrevio;
    private javax.swing.JTextField txtGlucosaBio;
    private javax.swing.JTextField txtGlucosaEQ;
    private javax.swing.JTextField txtGrupoFacLab;
    private javax.swing.JTextField txtHematiesEmatologia;
    private javax.swing.JTextField txtHematiesSU;
    private javax.swing.JTextField txtHematocrito;
    private javax.swing.JTextField txtHemoglobina;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtImprimirIn;
    private javax.swing.JTextField txtImprimirIn1;
    private javax.swing.JTextField txtLeucocitosEQ;
    private javax.swing.JTextField txtLeucocitosEmatologia;
    private javax.swing.JTextField txtLeucocitosSU;
    private javax.swing.JTextField txtLinfocitosEmatologia;
    private javax.swing.JTextField txtNeutrofilos;
    private javax.swing.JTextField txtNitritosEQ;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresIn;
    private javax.swing.JTextField txtNombresIn1;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtNordenIn;
    private javax.swing.JTextField txtNordenIn1;
    private javax.swing.JTextField txtNrecibo;
    private javax.swing.JTextArea txtObservacionesLB;
    private javax.swing.JTextField txtOtrosSu;
    private javax.swing.JTextField txtPhEF;
    private javax.swing.JTextField txtPlaquetas;
    private javax.swing.JTextField txtProteinasEQ;
    private javax.swing.JTextField txtPusSU;
    private javax.swing.JTextField txtRPR;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtSangreEQ;
    private javax.swing.JTextField txtSintoma;
    private javax.swing.JTextField txtUrobilinogenoEQ;
    private javax.swing.JTextField txtVIH;
    private javax.swing.JTextArea txtVRIgg;
    private javax.swing.JTextArea txtVRIgm;
    private javax.swing.JTextField txtVSG;
    private javax.swing.JTextField txtbasofilosEmatologia;
    private javax.swing.JTextField txtcontrata;
    private javax.swing.JTextField txtmarihuana;
    private javax.swing.JTextField txtmonocitosEmatologia;
    private javax.swing.JTextField txtsegmentadosEmatologia;
    // End of variables declaration//GEN-END:variables
 public String[]getRowsToVector(String sql)
    {
        String[]veDats;
        //clsConnection oConn = new clsConnection();
        try
        {
            //oConn.FnBoolConnectionOpen(strConnector, strHost,strUser,strPassword);
            oConn.FnBoolQueryExecute(sql);

            ArrayList lista = new ArrayList();
            while (oConn.setResult.next())
            {
                lista.add(oConn.setResult.getString(1));
            }
            veDats = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++)
            {
                veDats[i]=lista.get(i).toString();
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
            
            return null;
        }
        return veDats;
    }
public static int getPosicionVectorBuscar(String datoBuscar, String[]empresas)
{
  try{
      for(int i =0;1 < empresas.length; i++){
        if(datoBuscar.equals(empresas[i].substring(0, datoBuscar.length())))
            return i;
      }
              
     
  }catch(Exception e){
  
  }
  return -1;
}
public static String getTextoApartirVector(String datoBuscar, String[]vector)
{
    int nroPosicion = getPosicionVectorBuscar(datoBuscar, vector);
    if(nroPosicion == -1){
        return datoBuscar;
    }
    return vector[nroPosicion];
}
public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDato)
{
    String datoBuscado ="";
    int nroActual = textField.getText().length();
    datoBuscado = newDato.substring(nroActual, newDato.length());
    if(newDato.isEmpty() || datoBuscado.isEmpty())
        return;
    try {
        textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
    }catch(Exception e){
    }
    textField.select(nroActual, textField.getText().length());

}
public void Editar(){
//    if(txtNorden.getText().isEmpty()){
//         if(OrdenExiste()){
          String Sql="SELECT n.razon_empresa,n.razon_contrata,dp.nombres_pa||' '||dp.apellidos_pa as nombres,n.cod_pa,n.grupofactorsan,lc.cod_labclinico,\n" +
                    "lc.tipo_servicio, lc.num_ticket, lc.fecha_lab, lc.chko, lc.chka, lc.chkb, lc.chkab, lc.rbrhpositivo, lc.rbrhnegativo,\n" +
                    "lc.txthemoglobina, lc.txthematocrito, lc.txtvsg, lc.txtleucocitosematologia, lc.txthematiesematologia, lc.txtneutrofilos, \n" +
                    "lc.txtabastonados, lc.txtsegmentadosematologia, lc.txtmonocitosematologia,lc.txteosinofiosematologia,\n" +
                    "lc.txtbasofilosematologia, lc.txtlinfocitosematologia, lc.txtglucosabio, lc.txtcreatininabio, lc.chkpositivo, lc.chknegativo, \n" +
                    "lc.txtvih, lc.txtcoloref, lc.txtdensidadef, lc.txtaspectoef, lc.txtphef, lc.txtnitritoseq, lc.txtproteinaseq, lc.txtcetonaseq,\n" +
                    "lc.txtleucocitoseq, lc.txturobilinogenoeq, lc.txtbilirubinaeq, lc.txtglucosaeq, lc.txtsangreeq, lc.txtleucocitossu, \n" +
                    "lc.txtcelepitelialessu, lc.txtcilindiossu, lc.txtbacteriassu, lc.txthematiessu, lc.txtcristalessu, lc.txtpussu, lc.txtotrossu,\n" +
                    "lc.txtcocaina, lc.txtmarihuana, lc.txtobservacioneslb, lc.res_lab, lc.txtplaquetas\n" +
                    "FROM n_orden_ocupacional as n \n" +
                    "INNER JOIN datos_paciente as dp ON (n.cod_pa = dp.cod_pa)\n" +
                    "INNER JOIN lab_clinico as lc ON (n.n_orden = lc.n_orden) \n" +
                    "WHERE n.n_orden ="+txtNorden.getText().toString()+"" ;
              
              oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        txtcontrata.setText(oConn.setResult.getString("razon_contrata"));
                        txtNombres.setText(oConn.setResult.getString("nombres"));
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtGFSPrevio.setText(oConn.setResult.getString("grupofactorsan"));
                        FechaExamen.setDate(oConn.setResult.getDate("fecha_lab"));
                         chkO.setSelected(oConn.setResult.getBoolean("chko"));
                         chkA.setSelected(oConn.setResult.getBoolean("chka"));
                         chkB.setSelected(oConn.setResult.getBoolean("chkb"));
                         rbRHpositivo.setSelected(oConn.setResult.getBoolean("rbrhpositivo"));
                         rbRHnegativo.setSelected(oConn.setResult.getBoolean("rbrhnegativo"));
                         txtHemoglobina.setText(oConn.setResult.getString("txthemoglobina"));
                         txtHematocrito.setText(oConn.setResult.getString("txthematocrito"));
                         txtVSG.setText(oConn.setResult.getString("txtvsg"));
                         txtLeucocitosEmatologia.setText(oConn.setResult.getString("txtleucocitosematologia"));
                         txtHematiesEmatologia.setText(oConn.setResult.getString("txthematiesematologia"));
                         txtNeutrofilos.setText(oConn.setResult.getString("txtneutrofilos"));
                         txtsegmentadosEmatologia.setText(oConn.setResult.getString("txtsegmentadosematologia"));
                         txtAbastonados.setText(oConn.setResult.getString("txtabastonados"));
                         txtmonocitosEmatologia.setText(oConn.setResult.getString("txtmonocitosematologia"));
                         txtEosinofiosEmatologia.setText(oConn.setResult.getString("txteosinofiosematologia"));
                         txtbasofilosEmatologia.setText(oConn.setResult.getString("txtbasofilosematologia"));
                         txtLinfocitosEmatologia.setText(oConn.setResult.getString("txtlinfocitosematologia"));
                         txtGlucosaBio.setText(oConn.setResult.getString("txtglucosabio"));
                         txtCreatininaBio.setText(oConn.setResult.getString("txtcreatininabio"));
                         chkPositivo.setSelected(oConn.setResult.getBoolean("chkpositivo"));
                         chkNegativo.setSelected(oConn.setResult.getBoolean("chknegativo"));
                         txtVIH.setText(oConn.setResult.getString("txtvih"));
                          jComboBoxColor.setSelectedItem(oConn.setResult.getString("txtcoloref"));
                        // txtColorEF.setText(oConn.setResult.getString("txtcoloref"));
                         jComboAsp.setSelectedItem(oConn.setResult.getString("txtaspectoef"));
    
                         txtAspectoEF.setText(oConn.setResult.getString("txtaspectoef"));
                         txtDensidadEF.setText(oConn.setResult.getString("txtdensidadef"));
                         txtPhEF.setText(oConn.setResult.getString("txtphef"));
                         txtNitritosEQ.setText(oConn.setResult.getString("txtnitritoseq"));
                         txtProteinasEQ.setText(oConn.setResult.getString("txtproteinaseq"));
                         txtLeucocitosEQ.setText(oConn.setResult.getString("txtleucocitoseq"));
                         txtCetonasEQ.setText(oConn.setResult.getString("txtcetonaseq"));
                         txtUrobilinogenoEQ.setText(oConn.setResult.getString("txturobilinogenoeq"));
                         txtBilirubinaEQ.setText(oConn.setResult.getString("txtbilirubinaeq"));
                         txtGlucosaEQ.setText(oConn.setResult.getString("txtglucosaeq"));
                         txtSangreEQ.setText(oConn.setResult.getString("txtsangreeq"));
                         txtLeucocitosSU.setText(oConn.setResult.getString("txtleucocitossu"));
                         txtCelEpitelialesSU.setText(oConn.setResult.getString("txtcelepitelialessu"));
                         txtCilindiosSU.setText(oConn.setResult.getString("txtcilindiossu"));
                         txtBacteriasSU.setText(oConn.setResult.getString("txtbacteriassu"));
                         txtHematiesSU.setText(oConn.setResult.getString("txthematiessu"));
                         txtCristalesSU.setText(oConn.setResult.getString("txtcristalessu"));
                         txtPusSU.setText(oConn.setResult.getString("txtpussu"));
                         txtOtrosSu.setText(oConn.setResult.getString("txtotrossu"));
                         txtCocaina.setText(oConn.setResult.getString("txtcocaina"));
                         txtmarihuana.setText(oConn.setResult.getString("txtmarihuana"));
                         txtObservacionesLB.setText(oConn.setResult.getString("txtobservacioneslb"));
                         txtResponsable.setText(oConn.setResult.getString("res_lab"));
                         txtPlaquetas.setText(oConn.setResult.getString("txtplaquetas"));
                       }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de nuevo");
                    }
                    oConn.setResult.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Laboratorio Clinico:" + ex.getMessage().toString());
        }
      
//      }
//   }     
}
public void Agregar(){
     if(!OrdenExiste()){
         if(validar()){
            String strSqlStmt;
            String s;
             String Query ;
             strSqlStmt="INSERT INTO lab_clinico(";
            Query="Values('";
              if(chkConsultas.isSelected()== true){
                  s ="CONSULTA";
                  strSqlStmt += "tipo_servicio";
                  strSqlStmt += ",num_ticket";
                  Query += s + "'";
                  Query += ",'" +txtNrecibo.getText().toString() + "'";
              }
              if(chkParticular.isSelected()== true){
                  s ="PARTICULAR";
                  strSqlStmt += "tipo_servicio";
                  strSqlStmt += ",num_ticket";
                  Query += s + "'";
                  Query += ",'" +txtNrecibo.getText().toString() + "'";
              }
              if(chkFichaMedica.isSelected()== true){
                  s ="OCUPACIONAL";
                  strSqlStmt += "tipo_servicio";
                  strSqlStmt += ",n_orden";
                  Query += s + "'";
                   Query += ",'" +txtNorden.getText().toString() + "'";
              }
              //oFunc.SubSistemaMensajeInformacion(Query);
              if (txtResponsable.getText().trim().length()>= 1 ){strSqlStmt += ",res_lab";Query += ",'"+txtResponsable.getText().toString()+ "'";}
              if (((JTextField)FechaExamen.getDateEditor().getUiComponent()).getText().trim().length()> 1 ){strSqlStmt+= ",fecha_lab";Query+= ",'"+FechaExamen.getDate().toString()+ "'";}
             strSqlStmt += ",chko";
             Query += ",'"+chkO.isSelected()+ "'";
              strSqlStmt += ",chka";
             Query += ",'"+chkA.isSelected()+ "'";
              strSqlStmt += ",chkb";
             Query += ",'"+chkB.isSelected()+ "'";
              strSqlStmt += ",chkab";
             Query += ",'"+chkAB.isSelected()+ "'";
           //if(rbRHpositivo.isSelected()== true){
             strSqlStmt += ",rbrhpositivo";
             Query += ",'"+rbRHpositivo.isSelected()+ "'";   
           //}
           //if(rbRHnegativo.isSelected()== true){
             strSqlStmt += ",rbrhnegativo";
             Query += ",'"+rbRHnegativo.isSelected()+ "'";
           //}
              if (txtHemoglobina.getText().trim().length()>= 1 ){strSqlStmt += ",txthemoglobina";Query += ",'"+txtHemoglobina.getText().toString()+ "'";}
              if (txtHematocrito.getText().trim().length()>= 1 ){strSqlStmt += ",txthematocrito";Query += ",'"+txtHematocrito.getText().toString()+ "'";}
              if (txtVSG.getText().trim().length()>= 1 ){strSqlStmt += ",txtvsg";Query += ",'"+ txtVSG.getText().toString()+ "'";}
              if (txtLeucocitosEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txtleucocitosematologia";Query += ",'"+txtLeucocitosEmatologia.getText().toString()+ "'";}
              if (txtHematiesEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txthematiesematologia";Query += ",'"+txtHematiesEmatologia.getText().toString()+ "'";}
              if (txtNeutrofilos.getText().trim().length()>= 1 ){strSqlStmt += ",txtneutrofilos";Query += ",'"+txtNeutrofilos.getText().toString()+ "'";}
              if (txtAbastonados.getText().trim().length()>= 1 ){strSqlStmt += ",txtabastonados";Query += ",'"+txtAbastonados.getText().toString()+ "'";}
              if (txtsegmentadosEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txtsegmentadosematologia";Query += ",'"+txtsegmentadosEmatologia.getText().toString()+ "'";}
              if (txtmonocitosEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txtmonocitosematologia";Query += ",'"+txtmonocitosEmatologia.getText().toString()+ "'";}
              if (txtEosinofiosEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txteosinofiosematologia";Query += ",'"+txtEosinofiosEmatologia.getText().toString()+ "'";}
              if (txtbasofilosEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txtbasofilosematologia";Query += ",'"+txtbasofilosEmatologia.getText().toString()+ "'";}
              if (txtLinfocitosEmatologia.getText().trim().length()>= 1 ){strSqlStmt += ",txtlinfocitosematologia";Query += ",'"+txtLinfocitosEmatologia.getText().toString()+ "'";}
              if (txtGlucosaBio.getText().trim().length()>= 1 ){strSqlStmt += ",txtglucosabio";Query += ",'"+txtGlucosaBio.getText().toString()+ "'";}
              if (txtCreatininaBio.getText().trim().length()>= 1 ){strSqlStmt += ",txtcreatininabio";Query += ",'"+txtCreatininaBio.getText().toString()+ "'";}
              strSqlStmt += ",chkpositivo";
              Query += ",'"+chkPositivo.isSelected()+ "'";
              strSqlStmt += ",chknegativo";
              Query += ",'"+chkNegativo.isSelected()+ "'";
              if (txtVIH.getText().trim().length()>= 1 ){strSqlStmt += ",txtvih";Query += ",'"+txtVIH.getText().toString()+ "'";}
              if (jComboBoxColor.getSelectedItem().toString().trim().length()>= 1 ){strSqlStmt += ",txtcoloref";Query += ",'"+jComboBoxColor.getSelectedItem().toString()+ "'";}
              if (txtDensidadEF.getText().trim().length()>= 1 ){strSqlStmt += ",txtdensidadef";Query += ",'"+txtDensidadEF.getText().toString()+ "'";}
              if (jComboAsp.getSelectedItem().toString().trim().length()>= 1 ){strSqlStmt += ",txtaspectoef";Query += ",'"+jComboAsp.getSelectedItem().toString()+ "'";}
              if (txtPhEF.getText().trim().length()>= 1 ){strSqlStmt += ",txtphef";Query += ",'"+txtPhEF.getText().toString()+ "'";}
              if (txtNitritosEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtnitritoseq";Query += ",'"+txtNitritosEQ.getText().toString()+ "'";}
              if (txtProteinasEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtproteinaseq";Query += ",'"+txtProteinasEQ.getText().toString()+ "'";}
              if (txtCetonasEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtcetonaseq";Query += ",'"+txtCetonasEQ.getText().toString()+ "'";}
              if (txtLeucocitosEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtleucocitoseq";Query += ",'"+txtLeucocitosEQ.getText().toString()+ "'";}
              if (txtUrobilinogenoEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txturobilinogenoeq";Query += ",'"+txtUrobilinogenoEQ.getText().toString()+ "'";}
              if (txtBilirubinaEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtbilirubinaeq";Query += ",'"+txtBilirubinaEQ.getText().toString()+ "'";}
              if (txtGlucosaEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtglucosaeq";Query += ",'"+txtGlucosaEQ.getText().toString()+ "'";}
              if (txtSangreEQ.getText().trim().length()>= 1 ){strSqlStmt += ",txtsangreeq";Query += ",'"+txtSangreEQ.getText().toString()+ "'";}
              if (txtLeucocitosSU.getText().trim().length()>= 1 ){strSqlStmt += ",txtleucocitossu";Query += ",'"+txtLeucocitosSU.getText().toString()+ "'";}
              if (txtCelEpitelialesSU.getText().trim().length()>= 1 ){strSqlStmt += ",txtcelepitelialessu";Query += ",'"+txtCelEpitelialesSU.getText().toString()+ "'";}
              if (txtCilindiosSU.getText().trim().length()>= 1 ){strSqlStmt += ",txtcilindiossu";Query += ",'"+txtCilindiosSU.getText().toString()+ "'";}
              if (txtBacteriasSU.getText().trim().length()>= 1 ){strSqlStmt += ",txtbacteriassu";Query += ",'"+txtBacteriasSU.getText().toString()+ "'";}
              if (txtHematiesSU.getText().trim().length()>= 1 ){strSqlStmt += ",txthematiessu";Query += ",'"+txtHematiesSU.getText().toString()+ "'";}
              if (txtCristalesSU.getText().trim().length()>= 1 ){strSqlStmt += ",txtcristalessu";Query += ",'"+txtCristalesSU.getText().toString()+ "'";}
              if (txtPusSU.getText().trim().length()>= 1 ){strSqlStmt += ",txtpussu";Query += ",'"+txtPusSU.getText().toString()+ "'";}
              if (txtOtrosSu.getText().trim().length()>= 1 ){strSqlStmt += ",txtotrossu";Query += ",'"+txtOtrosSu.getText().toString()+ "'";}
              if (txtCocaina.getText().trim().length()>= 1 ){strSqlStmt += ",txtcocaina";Query += ",'"+txtCocaina.getText().toString()+ "'";}
              if (txtmarihuana.getText().trim().length()>= 1 ){strSqlStmt += ",txtmarihuana";Query += ",'"+txtmarihuana.getText().toString()+ "'";}
              if (txtObservacionesLB.getText().trim().length()>= 1 ){strSqlStmt += ",txtobservacioneslb";Query += ",'"+txtObservacionesLB.getText().toString()+ "'";}
              if (txtPlaquetas.getText().trim().length()>= 1 ){strSqlStmt += ",txtplaquetas";Query += ",'"+txtPlaquetas.getText().toString()+ "'";}
              try {
                  if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
             imprimir();
             Limpiar();
             btgroup();
                   jtLaboratorio.setSelectedIndex(0);
              }else{
                   oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
             
              }
                
             } catch (Exception e) {
             }
              
 }
     }
 }

public void actualizar(){
    String sql="update lab_clinico set fecha_lab='"+FechaExamen.getDate().toString()+
        "',chko='"+chkO.isSelected()+
        "',chka='"+chkA.isSelected()+
        "',chkb='"+chkB.isSelected()+
        "',chkab='"+chkAB.isSelected()+
        "',rbrhpositivo='"+rbRHpositivo.isSelected()+
        "',rbrhnegativo='"+rbRHnegativo.isSelected()+
        "',txthemoglobina='"+txtHemoglobina.getText().toString()+
        "',txthematocrito='"+txtHematocrito.getText().toString()+
        "',txtvsg='"+txtVSG.getText().toString()+
        "',txtleucocitosematologia='"+txtLeucocitosEmatologia.getText().toString()+
        "',txthematiesematologia='"+txtHematiesEmatologia.getText().toString()+
        "',txtneutrofilos='"+txtNeutrofilos.getText().toString()+
        "',txtsegmentadosematologia='"+txtsegmentadosEmatologia.getText().toString()+
        "',txtabastonados='"+txtAbastonados.getText().toString()+
        "',txtmonocitosematologia='"+txtmonocitosEmatologia.getText().toString()+
        "',txteosinofiosematologia='"+txtEosinofiosEmatologia.getText().toString()+
        "',txtbasofilosematologia='"+txtbasofilosEmatologia.getText().toString()+
        "',txtlinfocitosematologia='"+txtLinfocitosEmatologia.getText().toString()+
        "',txtglucosabio='"+txtGlucosaBio.getText().toString()+
        "',txtcreatininabio='"+txtCreatininaBio.getText().toString()+
        "',chkpositivo='"+chkPositivo.isSelected()+
        "',chknegativo='"+chkNegativo.isSelected()+
        "',txtvih='"+txtVIH.getText().toString()+
        "',txtcoloref='"+jComboBoxColor.getSelectedItem().toString()+
        "',txtaspectoef='"+jComboAsp.getSelectedItem().toString()+
        "',txtdensidadef='"+txtDensidadEF.getText().toString()+
        "',txtphef='"+txtPhEF.getText().toString()+
        "',txtnitritoseq='"+txtNitritosEQ.getText().toString()+
        "',txtproteinaseq='"+txtProteinasEQ.getText().toString()+
        "',txtleucocitoseq='"+txtLeucocitosEQ.getText().toString()+
        "',txtcetonaseq='"+txtCetonasEQ.getText().toString()+
        "',txturobilinogenoeq='"+txtUrobilinogenoEQ.getText().toString()+
        "',txtbilirubinaeq='"+txtBilirubinaEQ.getText().toString()+
        "',txtglucosaeq='"+txtGlucosaEQ.getText().toString()+
        "',txtsangreeq='"+txtSangreEQ.getText().toString()+
        "',txtleucocitossu='"+txtLeucocitosSU.getText().toString()+
        "',txtcelepitelialessu='"+txtCelEpitelialesSU.getText().toString()+
        "',txtcilindiossu='"+txtCilindiosSU.getText().toString()+
        "',txtbacteriassu='"+txtBacteriasSU.getText().toString()+
        "',txthematiessu='"+txtHematiesSU.getText().toString()+
        "',txtcristalessu='"+txtCristalesSU.getText().toString()+
        "',txtpussu='"+txtPusSU.getText().toString()+
        "',txtotrossu='"+txtOtrosSu.getText().toString()+
        "',txtcocaina='"+txtCocaina.getText().toString()+
        "',txtmarihuana='"+txtmarihuana.getText().toString()+
        "',txtobservacioneslb='"+txtObservacionesLB.getText().toString()+
        "',res_lab='"+txtResponsable.getText().toString()+
        "',txtplaquetas='"+txtPlaquetas.getText().toString()+
        "' where n_orden="+txtNorden.getText().toString(); 
  //  System.out.println("SQL:"+sql);
    if (oConn.FnBoolQueryExecuteUpdate(sql)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }

}
private boolean validar(){
boolean bResultado=true;
if(chkRetiro.isSelected()){
    if (((JTextField)FechaExamen.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Examen");bResultado = false;}
    if(btTipoEx.isSelected(null)){bResultado = false;}
    
}else{
    if (((JTextField)FechaExamen.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Examen");bResultado = false;}    
    if(btGrupo.isSelected(null)){oFunc.SubSistemaMensajeError("Grupo");bResultado = false;}  
    if(btFactor.isSelected(null)){oFunc.SubSistemaMensajeError("Factor");bResultado = false;}
    if(btTipoEx.isSelected(null)){bResultado = false;}
    //if(btRpr.isSelected(null)){oFunc.SubSistemaMensajeError("RPR");bResultado = false;}
}

return bResultado;
   
}
private void imprimir(){
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
      printer(Integer.valueOf(txtNorden.getText()));
   }
   else
   {
      // PRESIONO NO
     }
    }

}
    private void printer(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/LaboratorioClinico.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Laboratorio Clinico.");
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
//
//            JasperViewer.viewReport(myPrint, false);

            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void print(Integer cod) {
  //Integer n;
        //n = Integer.parseInt(txtNorden.getText());
        //Pasamos parametros al reporte Jasper. 
        Map parameters = new HashMap();
        // Coloco los valores en los parámetros
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/LaboratorioClinico.jasper";
            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte Laboratorio Clinico.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            // Genera el reporte usando el objeto JasperReport e indicando la conexion
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
                    //JasperPrint myPrint = JasperFillManager.fillReport(myReport, null,new JREmptyDataSource());
            // Visualiza el Reporte
            JasperViewer.viewReport(myPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //----------------------------
    void sbCargarDatosTipoSangre(String valor) {
        String[] titulos = {"Fecha", "Grupo Sanguíneo", "Factor Rh"};
        String[] registros = new String[3];
        String sql = "";
            sql = "SELECT l.fecha_lab,l.chko ,l.chka ,l.chkb ,l.chkab,\n" +
                "  l.rbrhpositivo ,l.rbrhnegativo FROM datos_paciente as dp  \n" +
                "  inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) \n" +
                "  inner join lab_clinico as l on(n.n_orden=l.n_orden)\n" +
                "  where n.cod_pa="+valor;
           model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        if (oConn.FnBoolQueryExecute(sql)) {
            try {
                while (oConn.setResult.next()) {
                    registros[0] = formato.format(oConn.setResult.getDate("fecha_lab"));
                    String c1=oConn.setResult.getString("chko");
                    String c2 = oConn.setResult.getString("chka");
                    String c3 = oConn.setResult.getString("chkb");
                    String c4 = oConn.setResult.getString("chkab");
                    if("t".equals(c1)){
                        c1="O";
                        registros[1] = c1;
                    }else if("t".equals(c2)){
                        c2="A";
                        registros[1] = c2;
                    }else if("t".equals(c3)){
                        c3="B";
                        registros[1] = c3;
                    }else if("t".equals(c4)){
                        c4="AB";
                        registros[1] = c4;
                    } else {
                        registros[1] = "";
                    }
                    String posi= oConn.setResult.getString("rbrhpositivo");
                    String nega  = oConn.setResult.getString("rbrhnegativo");
                    if("t".equals(posi)){
                        posi="+";
                        registros[2] = posi;
                    }else if("t".equals(nega)){
                        nega="-";
                        registros[2] = nega;
                    } else {
                        registros[2] = "";
                    }
                    //registros[3]=oConn.setResult.getString("anexo7c");
                    tblabclinico.setDefaultRenderer(Object.class, new MyCellRenderer());
                    model.addRow(registros);
                }
                // Coloca el Modelo de Nueva Cuenta
                tblabclinico.setModel(model);
                sbTablalaboratorio();

                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(FichaTriaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public class MyCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        boolean valid = String.valueOf(table.getValueAt(row, 1)).equals("");
        
        component.setBackground(valid ? Color.white : Color.yellow);
        
        component.setForeground(valid ? Color.white : Color.red);
        return component;
    }
}
    private void sbTablalaboratorio()
    {
               
//        tblabclinico.setFont(new java.awt.Font("Tahoma", 0, 11)); 
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.LEFT);
//        tblabclinico.setForeground(Color.red);
        tblabclinico.setGridColor(Color.blue);
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tblabclinico.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
//        tblabclinico.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tblabclinico.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
//        tblabclinico.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
//        tbTriaje.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        
        tblabclinico.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11)); 
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
//ficha inmonologica
    public boolean OrdenExisteIn()
    {
        boolean bResultado=false;
        if(!txtNordenIn.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from examen_inmunologico Where n_orden ="+txtNordenIn.getText().toString();
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
    
     public boolean OrdenExisteIn1()
     {
        boolean bResultado=false;
        if(!txtNordenIn1.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from examen_inmunologico Where n_orden ="+txtNordenIn1.getText().toString();
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
     
     
         private boolean validarIn1(){
        boolean bResultado=true;

            if (((JTextField)FechaExIn1.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
    private boolean validarIn(){
        boolean bResultado=true;

            if (((JTextField)FechaExIn.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
     private boolean GrabarIn() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO examen_inmunologico(\n" +
"            n_orden, dni_pa, fecha_examen,chkigm_reactivo, chkigm_noreactivo, \n" +
"            chkigg_reactivo, chkigg_noreactivo, chkinvalido,cbomarca,txtvrigm,txtvrigg)";       
            strSqlStmt+= "values('"+ txtNordenIn.getText()+"','"+txtDniIn.getText().toString()+"','"+FechaExIn.getDate()+
                    "','"+chkIgmReactivo.isSelected()+  "','"+chkIgmNoReactivo.isSelected()+
                    "','"+chkIggReactivo.isSelected()+  
                    "','"+chkIggNoReactivo.isSelected()+ 
                    "','"+chkInvalido.isSelected()+ 
                    "','"+cboMarca.getSelectedItem()+ 
                    "','"+txtVRIgm.getText()+ 
                    "','"+txtVRIgg.getText()+"')";
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
               }
                return bResult;       
        }
     
      private boolean GrabarIn1() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO examen_inmunologico(\n" +
"            n_orden, dni_pa, fecha_examen,chkigm_reactivo, chkigm_noreactivo, \n" +
"            chkigg_reactivo, chkigg_noreactivo, chkinvalido,cbomarca,txtvrigm,txtvrigg,valorigm,valorigg,medico)";       
            strSqlStmt+= "values('"+ txtNordenIn1.getText()+"','"+txtDniIn1.getText().toString()+"','"+FechaExIn1.getDate()+
                    "','"+chkIgmReactivo1.isSelected()+  "','"+chkIgmNoReactivo1.isSelected()+
                    "','"+chkIggReactivo1.isSelected()+  
                    "','"+chkIggNoReactivo1.isSelected()+ 
                    "','"+chkInvalido1.isSelected()+ 
                    "','"+jTextField2.getText()+ 
                    "','"+jTextAreaIgm.getText()+ 
                    "','"+jTextAreaIgg.getText()+"',"+
                    valorigm+","+valorigg+",'"+jTextField5.getText()+"'"
                    + ")";
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
               }
                return bResult;       
        }
     
    public void ActualizarIn(){
            String sCodigo=txtNordenIn.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE examen_inmunologico\n" +
                    " SET fecha_examen='"+FechaExIn.getDate()+"',"
                    + "      chkigm_reactivo='"+chkIgmReactivo.isSelected()+"', \n" 
                    + "      chkigm_noreactivo='"+chkIgmNoReactivo.isSelected()+"',"
                    + "      chkigg_reactivo='"+chkIggReactivo.isSelected()+"',"
                    + "      chkigg_noreactivo='"+chkIggNoReactivo.isSelected()+"', \n" 
                    + "      chkinvalido='"+chkInvalido.isSelected()+"', \n" 
                    + "      cbomarca='"+cboMarca.getSelectedItem()+"', \n" 
                    + "      txtvrigm='"+txtVRIgm.getText()+"', \n" 
                    + "      txtvrigg='"+txtVRIgg.getText()+"'"+
                    " WHERE n_orden='"+sCodigo+"';";
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirIn();
                Limpiar();

            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }    
    
     public void ActualizarIn1(){
            String sCodigo=txtNordenIn1.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE examen_inmunologico\n" +
                    " SET fecha_examen='"+FechaExIn1.getDate()+"',"
                    + "      chkigm_reactivo='"+chkIgmReactivo1.isSelected()+"', \n" 
                    + "      chkigm_noreactivo='"+chkIgmNoReactivo1.isSelected()+"',"
                    + "      chkigg_reactivo='"+chkIggReactivo1.isSelected()+"',"
                    + "      chkigg_noreactivo='"+chkIggNoReactivo1.isSelected()+"', \n" 
                    + "      chkinvalido='"+chkInvalido1.isSelected()+"', \n" 
                    + "      cbomarca='"+jTextField2.getText()+"', \n" 
                    + "      txtvrigm='"+jTextAreaIgm.getText()+"', \n" 
                    + "      txtvrigg='"+jTextAreaIgg.getText()+"',"+
                    "        valorigm="+valorigm+","+
                    "        valorigg="+valorigg+","+
                    "        medico='"+jTextField5.getText()+
                    "' WHERE n_orden='"+sCodigo+"';";
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirIn1();
                Limpiar();

            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }    
    private void LimpiarIn(){
        txtNordenIn.setText(null);
        txtNordenIn1.setText(null);
        txtNombresIn.setText(null);
        txtNombresIn1.setText(null);
        txtDniIn.setText(null);
        txtDniIn1.setText(null);
        txtEdadIn.setText(null);
        FechaExIn.setDate(null);
            txtEdadIn1.setText(null);
        FechaExIn1.setDate(null);
        bgIgm.clearSelection();
        bgIgg.clearSelection();
        bgInvalido.clearSelection();
        cboMarca.setSelectedItem(null);
        txtVRIgg.setText(null);
        txtVRIgm.setText(null);
        chkIgmReactivo1.setSelected(false);
        chkIgmNoReactivo1.setSelected(false);
        chkIggReactivo1.setSelected(false);
                chkIggNoReactivo1.setSelected(false);
                chkInvalido1.setSelected(false);
                jTextField5.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                
        txtNordenIn.setEditable(true);
        txtNordenIn.requestFocus();

    }
    private boolean imprimirIn(){
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
              printerIn(Integer.valueOf(txtNordenIn.getText()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
     private boolean imprimirIn1(){
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
              printerIn1(Integer.valueOf(txtNordenIn1.getText()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
    private void printIn(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Inmunologia1.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("EXAMEN INMUNOLOGICO");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
        private void printIn1(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Inmunologia23.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("EXAMEN INMUNOLOGICO23");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
 private void printerIn1(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Inmunologia23.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
   private void printerIn(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Inmunologia1.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
   public void cboAreaOcupacional(String Ocupacion) {
        cboMarca.setSelectedItem(Ocupacion);
    }
   public void CargarMarcaCovid() {
        cboMarca.removeAllItems();
        String sQuery;
        // Prepara el Query
        sQuery = "SELECT marca_c FROM marca_covid";

        if (oConn.FnBoolQueryExecute(sQuery)) {
            try {

                while (oConn.setResult.next()) {
                    cboMarca.addItem(oConn.setResult.getString("marca_c"));

                }

                // Cierra Resultados
                oConn.setResult.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());

            }
        }
    }

}
