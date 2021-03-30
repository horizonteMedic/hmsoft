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
public final class LaboratorioClinicoCovid extends javax.swing.JInternalFrame {
clsConnection oConn1 = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
    String[]responsable = new String[]{};
    String cualitativo="";
          //Ingreso ads = new Ingreso();
String sed="";
    clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   public static AddMarcaCovid1 addMarca;
   float valorigm,valorigg;
    DefaultTableModel model;
   String pasar="df",doctor;
   int valor=1;
   
    public LaboratorioClinicoCovid() {
        initComponents();
        bloqueo1();
        bloqueo2();
        bloqueo3();
//sed=ads.nombresede;
      //  jPanel1.setVisible(false);
      //  jPanel6.setVisible(false);
        jtLaboratorio.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/biology0.png")));
        jtLaboratorio.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/biology1.png")));
//        Limpiar();
       negarPc();
        responsable = getRowsToVector("select nombre_user||' '||apellido_user as responsable FROM usuarios");
        CargarMarcaCovid();
        cboMarca.setSelectedIndex(-1);
        timer.start();
         txtSintoma.setEnabled(false);
                             chkInvalido1.setSelected(false);
                          
                             jTextAreaIgg2.setVisible(false);
                           

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
        cboMarca1 = new javax.swing.JComboBox();
        btnMarca1 = new javax.swing.JLabel();
        btnGrabarIn1 = new javax.swing.JButton();
        btnLimpiarIn1 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        txtNordenIn2 = new javax.swing.JTextField();
        btnEditarIn2 = new javax.swing.JButton();
        FechaExIn2 = new com.toedter.calendar.JDateChooser();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtNombresIn2 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txtDniIn2 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtEdadIn2 = new javax.swing.JTextField();
        txtImprimirIn2 = new javax.swing.JTextField();
        btnImprimir2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaIgm1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextAreaIgg1 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        cboMarca2 = new javax.swing.JComboBox();
        btnMarca2 = new javax.swing.JLabel();
        btnGrabarIn2 = new javax.swing.JButton();
        btnLimpiarIn2 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        txtNordenIn3 = new javax.swing.JTextField();
        btnEditarIn3 = new javax.swing.JButton();
        FechaExIn3 = new com.toedter.calendar.JDateChooser();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtNombresIn3 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txtDniIn3 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        txtEdadIn3 = new javax.swing.JTextField();
        txtImprimirIn3 = new javax.swing.JTextField();
        btnImprimir3 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextAreaIgm2 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextAreaIgg2 = new javax.swing.JTextArea();
        jTextField13 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        cboMarca3 = new javax.swing.JComboBox();
        btnMarca3 = new javax.swing.JLabel();
        btnGrabarIn3 = new javax.swing.JButton();
        btnLimpiarIn3 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        txtNordenIn4 = new javax.swing.JTextField();
        btnEditarIn4 = new javax.swing.JButton();
        FechaExIn4 = new com.toedter.calendar.JDateChooser();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        txtNombresIn4 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        txtDniIn4 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        txtEdadIn4 = new javax.swing.JTextField();
        txtImprimirIn4 = new javax.swing.JTextField();
        btnImprimir4 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextAreaIgm3 = new javax.swing.JTextArea();
        jLabel124 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        cboMarca4 = new javax.swing.JComboBox();
        btnMarca4 = new javax.swing.JLabel();
        btnGrabarIn4 = new javax.swing.JButton();
        btnLimpiarIn4 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Laboratorio Clinico");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
                .addContainerGap(94, Short.MAX_VALUE))
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
        chkIgmNoReactivo1.setText("NO REACTIVO");
        chkIgmNoReactivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIgmNoReactivo1ActionPerformed(evt);
            }
        });

        bgIgg.add(chkIggNoReactivo1);
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

        jTextAreaIgm.setColumns(20);
        jTextAreaIgm.setRows(5);
        jTextAreaIgm.setText("Metodo: Inmunocromatografía\n    IGM-   SENSIBILIDAD: 95.60%\n                ESPECIFICIDAD: 96.00%");
        jScrollPane7.setViewportView(jTextAreaIgm);

        jTextAreaIgg.setColumns(20);
        jTextAreaIgg.setRows(5);
        jTextAreaIgg.setText("Metodo: Inmunocromatografía\n    IGG-   SENSIBILIDAD: 95.60%\n                ESPECIFICIDAD: 96.00%");
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

        cboMarca1.setEditable(true);
        cboMarca1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMarca1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMarca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMarca1MouseClicked(evt);
            }
        });
        cboMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarca1ActionPerformed(evt);
            }
        });

        btnMarca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMarca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMarca1MouseClicked(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cboMarca1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMarca1))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(cboMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMarca1)))
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
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jtLaboratorio.addTab("EXAMEN CUANTITATIVO", jPanel14);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel86.setText("Nº Orden :");

        txtNordenIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenIn2ActionPerformed(evt);
            }
        });
        txtNordenIn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenIn2KeyTyped(evt);
            }
        });

        btnEditarIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarIn2.setText("Editar");
        btnEditarIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIn2ActionPerformed(evt);
            }
        });

        FechaExIn2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExIn2PropertyChange(evt);
            }
        });

        jLabel87.setText("Fecha :");

        jLabel88.setText("Nombres y Apellidos :");

        jLabel96.setText("DNI :");

        jLabel97.setText("Edad :");

        txtImprimirIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirIn2ActionPerformed(evt);
            }
        });

        btnImprimir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir2ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(255, 204, 153));
        jTextField6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 51));
        jTextField6.setText("Imprimir");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombresIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel86)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNordenIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarIn2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel87)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaExIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel96)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDniIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel97)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdadIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(txtImprimirIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel86)
                        .addComponent(txtNordenIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarIn2)
                        .addComponent(jLabel87))
                    .addComponent(FechaExIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(txtNombresIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(txtDniIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97)
                            .addComponent(txtEdadIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtImprimirIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COVID - 19 Prueba Rápida"));

        jLabel100.setText("MARCA: ");

        jTextAreaIgm1.setColumns(20);
        jTextAreaIgm1.setRows(5);
        jTextAreaIgm1.setText("Tecnica:Inmunofluorescencia\n                SENSIBILIDAD: 90.00%\n                ESPECIFICIDAD: 95.00%");
        jScrollPane9.setViewportView(jTextAreaIgm1);

        jTextAreaIgg1.setColumns(20);
        jTextAreaIgg1.setRows(5);
        jTextAreaIgg1.setText("Tecnica: Inmunofluorescencia\n                SENSIBILIDAD: 90.00%\n                ESPECIFICIDAD: 95.00%");
        jScrollPane10.setViewportView(jTextAreaIgg1);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel101.setText("VALOR IGM:");

        jLabel102.setText("VALOR IGG:");

        jLabel103.setText("Doctor:");

        jTextField10.setText("N/A");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel98.setText("IGM:");

        jLabel99.setText("IGG:");

        cboMarca2.setEditable(true);
        cboMarca2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMarca2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMarca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMarca2MouseClicked(evt);
            }
        });
        cboMarca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarca2ActionPerformed(evt);
            }
        });

        btnMarca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMarca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMarca2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(cboMarca2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMarca2)))))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jScrollPane10))
                        .addGap(111, 111, 111))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel98))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel99)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(cboMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMarca2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        btnGrabarIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabarIn2.setText("Grabar/Actualizar");
        btnGrabarIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIn2ActionPerformed(evt);
            }
        });

        btnLimpiarIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarIn2.setText("Limpiar");
        btnLimpiarIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIn2ActionPerformed(evt);
            }
        });

        jLabel104.setBackground(new java.awt.Color(153, 255, 153));
        jLabel104.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(102, 0, 0));
        jLabel104.setText("PRUEBA CUANTITATIVA");

        jLabel105.setBackground(new java.awt.Color(153, 255, 153));
        jLabel105.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 0, 0));
        jLabel105.setText("ANTICUERPOS");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel104))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel105)))
                .addGap(46, 46, 46))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabarIn2)
                    .addComponent(btnLimpiarIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel104)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel105)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnGrabarIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnLimpiarIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jtLaboratorio.addTab("P. Cuan Anticuerpos", jPanel18);

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel106.setText("Nº Orden :");

        txtNordenIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenIn3ActionPerformed(evt);
            }
        });
        txtNordenIn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenIn3KeyTyped(evt);
            }
        });

        btnEditarIn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarIn3.setText("Editar");
        btnEditarIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIn3ActionPerformed(evt);
            }
        });

        FechaExIn3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExIn3PropertyChange(evt);
            }
        });

        jLabel107.setText("Fecha :");

        jLabel108.setText("Nombres y Apellidos :");

        jLabel109.setText("DNI :");

        jLabel110.setText("Edad :");

        txtImprimirIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirIn3ActionPerformed(evt);
            }
        });

        btnImprimir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir3ActionPerformed(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(255, 204, 153));
        jTextField11.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 51));
        jTextField11.setText("Imprimir");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombresIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jLabel106)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNordenIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarIn3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel107)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaExIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel109)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDniIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel110)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdadIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(txtImprimirIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel106)
                        .addComponent(txtNordenIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarIn3)
                        .addComponent(jLabel107))
                    .addComponent(FechaExIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(txtNombresIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(txtDniIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110)
                            .addComponent(txtEdadIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtImprimirIn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel111.setBackground(new java.awt.Color(153, 255, 153));
        jLabel111.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(102, 0, 0));
        jLabel111.setText("PRUEBA CUANTITATIVA");

        jLabel112.setBackground(new java.awt.Color(153, 255, 153));
        jLabel112.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(102, 0, 0));
        jLabel112.setText("ANTIGENOS");

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COVID - 19 Prueba Rápida"));

        jLabel113.setText("MARCA: ");

        jTextAreaIgm2.setColumns(20);
        jTextAreaIgm2.setRows(5);
        jTextAreaIgm2.setText("Tecnica: Inmunofluorescencia\n                SENSIBILIDAD: 95.00%\n                ESPECIFICIDAD: 95.00%");
        jScrollPane11.setViewportView(jTextAreaIgm2);

        jTextAreaIgg2.setColumns(20);
        jTextAreaIgg2.setRows(5);
        jTextAreaIgg2.setText("Tecnica: Inmunofluorescencia\n                SENSIBILIDAD: 95.00%\n                ESPECIFICIDAD: 95.00%");
        jScrollPane12.setViewportView(jTextAreaIgg2);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel114.setText("Valor:");

        jLabel116.setText("Doctor:");

        jTextField15.setText("N/A");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        cboMarca3.setEditable(true);
        cboMarca3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMarca3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMarca3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMarca3MouseClicked(evt);
            }
        });
        cboMarca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarca3ActionPerformed(evt);
            }
        });

        btnMarca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMarca3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMarca3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMarca3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel113)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(cboMarca3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMarca3)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addGap(114, 114, 114))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(cboMarca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMarca3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        btnGrabarIn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabarIn3.setText("Grabar/Actualizar");
        btnGrabarIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIn3ActionPerformed(evt);
            }
        });

        btnLimpiarIn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarIn3.setText("Limpiar");
        btnLimpiarIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabarIn3)
                            .addComponent(btnLimpiarIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel111))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel112)))
                        .addGap(24, 24, 24))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel112)))
                .addGap(33, 33, 33)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnGrabarIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnLimpiarIn3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jtLaboratorio.addTab("P. Cuan Antigenos", jPanel19);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel115.setText("Nº Orden :");

        txtNordenIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenIn4ActionPerformed(evt);
            }
        });
        txtNordenIn4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenIn4KeyTyped(evt);
            }
        });

        btnEditarIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditarIn4.setText("Editar");
        btnEditarIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarIn4ActionPerformed(evt);
            }
        });

        FechaExIn4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExIn4PropertyChange(evt);
            }
        });

        jLabel119.setText("Fecha :");

        jLabel120.setText("Nombres y Apellidos :");

        jLabel121.setText("DNI :");

        jLabel122.setText("Edad :");

        txtImprimirIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirIn4ActionPerformed(evt);
            }
        });

        btnImprimir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir4ActionPerformed(evt);
            }
        });

        jTextField14.setBackground(new java.awt.Color(255, 204, 153));
        jTextField14.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 0, 51));
        jTextField14.setText("Imprimir");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombresIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(jLabel115)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNordenIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditarIn4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel119)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaExIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel121)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDniIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel122)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdadIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(txtImprimirIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel115)
                        .addComponent(txtNordenIn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarIn4)
                        .addComponent(jLabel119))
                    .addComponent(FechaExIn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel120)
                            .addComponent(txtNombresIn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(txtDniIn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122)
                            .addComponent(txtEdadIn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtImprimirIn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COVID - 19 Prueba Rápida"));

        jLabel117.setText("MARCA: ");

        jTextAreaIgm3.setColumns(20);
        jTextAreaIgm3.setRows(5);
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n                SENSIBILIDAD: 94.55%\n                ESPECIFICIDAD: 100%");
        jScrollPane13.setViewportView(jTextAreaIgm3);

        jLabel124.setText("Doctor:");

        jTextField18.setText("N/A");
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Positivo");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Negativo");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        cboMarca4.setEditable(true);
        cboMarca4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMarca4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMarca4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMarca4MouseClicked(evt);
            }
        });
        cboMarca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarca4ActionPerformed(evt);
            }
        });

        btnMarca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMarca4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMarca4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(cboMarca4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMarca4)
                                .addGap(1, 1, 1))
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel117)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(cboMarca4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMarca4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnGrabarIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGrabarIn4.setText("Grabar/Actualizar");
        btnGrabarIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIn4ActionPerformed(evt);
            }
        });

        btnLimpiarIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarIn4.setText("Limpiar");
        btnLimpiarIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIn4ActionPerformed(evt);
            }
        });

        jLabel118.setBackground(new java.awt.Color(153, 255, 153));
        jLabel118.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(102, 0, 0));
        jLabel118.setText("PRUEBA CUALITATIVA");

        jLabel123.setBackground(new java.awt.Color(153, 255, 153));
        jLabel123.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(102, 0, 0));
        jLabel123.setText("ANTIGENOS");

        jCheckBox1.setText("OTRAS EMPRESAS");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel123)
                                .addGap(81, 81, 81))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel118))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jCheckBox1)))
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabarIn4)
                            .addComponent(btnLimpiarIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel118)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnGrabarIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnLimpiarIn4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        jtLaboratorio.addTab("P. Cual Antig", jPanel20);

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
            .addComponent(jtLaboratorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
    try {
        if (oConn1.setResult != null) 
         
            oConn1.setResult.close();
         
            if ( oConn1.sqlStmt != null) 
             
                oConn1.sqlStmt .close();
             
            /*if (oConn1.oConnection != null) 
             
                oConn1.oConnection.close();*/
    } catch (SQLException ex) {
        Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    this.dispose();
      //  System.exit(0);

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
    public void bloqueo1(){
    //txtNordenIn2.setEditable(false);
    txtNombresIn2.setEditable(false);
    txtDniIn2.setEditable(false);
    txtEdadIn2.setEditable(false);
    }
     public void bloqueo2(){
    //txtNordenIn3.setEditable(false);
    txtNombresIn3.setEditable(false);
    txtDniIn3.setEditable(false);
    txtEdadIn3.setEditable(false);
    }
      public void bloqueo3(){
   // txtNordenIn4.setEditable(false);
    txtNombresIn4.setEditable(false);
    txtDniIn4.setEditable(false);
    txtEdadIn4.setEditable(false);
    }
     public void desbloqueo1(){
    txtNordenIn2.setEditable(true);
    txtNombresIn2.setEditable(true);
    txtDniIn2.setEditable(true);
    txtEdadIn2.setEditable(true);
    }
     public void desbloqueo2(){
    txtNordenIn3.setEditable(true);
    txtNombresIn3.setEditable(true);
    txtDniIn3.setEditable(true);
    txtEdadIn3.setEditable(true);
    }
      public void desbloqueo3(){
    txtNordenIn4.setEditable(true);
    txtNombresIn4.setEditable(true);
    txtDniIn4.setEditable(true);
    txtEdadIn4.setEditable(true);
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
             if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)){
                
//                   oConn.setResult.next();
            
                   bResult = true;
                 oFunc.SubSistemaMensajeInformacion("Orden Registrada");
            
                
               }
                   try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
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
        if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
          //  imprimir();
            limpiar();
          
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
        
         try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
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
        oConn1.FnBoolQueryExecute(sQuery);
        try {
            if (oConn1.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
            
        } catch (SQLException ex) {
         
        }
        }       
        return bResultado;
        } 
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         //txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnLimpiarIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIn4ActionPerformed
        limpiar4();
    }//GEN-LAST:event_btnLimpiarIn4ActionPerformed

    private void btnGrabarIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIn4ActionPerformed
        if(jCheckBox2.isSelected())
        cualitativo="POSITIVO";
        else
        cualitativo="NEGATIVO";
        if(OrdenExisteIn4()){
            ActualizarIn4();
            limpiar4();

        }
        else{
            if(!txtNordenIn4.getText().isEmpty()){
                try {
                    if(validarIn4()){
                        if(GrabarIn4()){
                            if(sed.contains("Huancayo"))
                 printerIn12(Integer.valueOf(txtNordenIn4.getText().toString())); 
                                else
                            {
                            if(jCheckBox1.isSelected())    
                            imprimirIn5();
                            else
                            {     imprimirIn4(); 
                            limpiar4();
                            }
                            }
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGrabarIn4ActionPerformed

    private void btnMarca4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarca4MouseClicked
 MostrarAddMarca();
    }//GEN-LAST:event_btnMarca4MouseClicked

    private void cboMarca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarca4ActionPerformed
        if(cboMarca4.getSelectedItem().toString().contains("SARS-COV-2 ANTIGEN RAPID TEST KIT"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.3% \n"
                            + "Especificidad : 97.3 %");
        
        }
        if(cboMarca4.getSelectedItem().toString().contains("SARS-COV-2 ANTIGEN RAPID TEST KIT"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.3% \n"
                            + "Especificidad : 97.3 %");
        
        }
        if(cboMarca4.getSelectedItem().toString().contains("LEPU MEDICAL"))
        {
        jTextAreaIgm3.setText("Metodo de Detección de ácidos nucleicos\n"
                            + "Sensibilidad  : 92.00% \n"
                            + "Especificidad : 99.26%");
        
        }
          if(cboMarca4.getSelectedItem().toString().contains("ARTRON"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 91.27% \n"
                            + "Especificidad : 100%");
        
        }
        
              if(cboMarca4.getSelectedItem().toString().contains("LABNOVATION"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.3% \n"
                            + "Especificidad : 97.3 %");
        
        }
              if(cboMarca4.getSelectedItem().toString().contains("LEPU MEDICAL"))
        {
        jTextAreaIgm3.setText("Metodo de Detección de ácidos nucleicos\n"
                            + "Sensibilidad  : 92.00% \n"
                            + "Especificidad : 99.26%");
        
        }
         if(cboMarca4.getSelectedItem().toString().contains("SD BIOSENSOR"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.52% \n"
                            + "Especificidad : 99.68%");
        }       
            if(cboMarca4.getSelectedItem().toString().contains("SARS-COV-2 ANTIGEN RAPID TEST KIT"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.330% \n"
                            + "Especificidad : 99.569%");
        }       
            if(cboMarca4.getSelectedItem().toString().contains("STANDARD G COVID-19 AG TEST"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.52% \n"
                            + "Especificidad : 99.68%");
        }          
          if(cboMarca4.getSelectedItem().toString().contains("STANDARD Q"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.52% \n"
                            + "Especificidad : 99.68%");
        } 
         if(cboMarca4.getSelectedItem().toString().contains("ONSITE COVID-19 AG RAPID TEST"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 92.3% \n"
                            + "Especificidad : 100%");
        }   
         if(cboMarca4.getSelectedItem().toString().contains("VIVADIAG SARS-COV-2 AG RAPID TEST"))
        {
        jTextAreaIgm3.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 95.04% \n"
                            + "Especificidad : 100%");
        }    
          
    }//GEN-LAST:event_cboMarca4ActionPerformed

    private void cboMarca4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMarca4MouseClicked
        MostrarAddMarca();
    }//GEN-LAST:event_cboMarca4MouseClicked

    private void cboMarca4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMarca4PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca4PopupMenuWillBecomeInvisible

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isEnabled())
        jCheckBox2.setSelected(false);
        else
        jCheckBox2.setSelected(true);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected())
        jCheckBox3.setSelected(false);
        else
        jCheckBox3.setSelected(true);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void btnImprimir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir4ActionPerformed
        if(!txtImprimirIn4.getText().isEmpty()){
                     if(sed.contains("Huancayo"))
                 printIn12(Integer.valueOf(txtImprimirIn4.getText().toString())); 
            else
                     {
            if(jCheckBox1.isSelected())
                            printIn5(Integer.valueOf(txtImprimirIn4.getText()));
                            else
                            {   
                            printIn4(Integer.valueOf(txtImprimirIn4.getText()));
                            limpiar4();
                            }}
        }
    }//GEN-LAST:event_btnImprimir4ActionPerformed

    private void txtImprimirIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirIn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirIn4ActionPerformed

    private void FechaExIn4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExIn4PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExIn4PropertyChange

    private void btnEditarIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIn4ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn4.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
            + " ct.fecha_examen,ct.chkigm_reactivo, ct.chkigm_noreactivo, \n" +
            "                   ct.chkigg_reactivo, ct.chkigg_noreactivo, ct.chkinvalido, "
            + "ct.cbomarca, ct.txtvrigm,ct.txtvrigg,n.tipoprueba,ct.valorigm,ct.valorigg,ct.medico " +
            "               FROM datos_paciente AS d \n" +
            "               INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "               INNER JOIN examen_inmunologico AS ct ON (ct.n_orden = n.n_orden) \n" +
            "               WHERE n.nom_examen like '%PRUEBA CUALITATIVA ANTIGENOS%' and  n.n_orden ='"+txtNordenIn4.getText() +"'";
            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    txtNombresIn4.setText(oConn1.setResult.getString("nombre"));
                    txtDniIn4.setText(oConn1.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn4.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn4.setDate(oConn1.setResult.getDate("fecha_examen"));
                    cboMarca4.setSelectedItem(oConn1.setResult.getString("cbomarca"));
                                    desbloqueo3();

                    jTextField18.setText(oConn1.setResult.getString("medico"));
                    jCheckBox2.setSelected(oConn1.setResult.getBoolean("chkigm_reactivo"));
                    jCheckBox3.setSelected(oConn1.setResult.getBoolean("chkigg_reactivo"));

                    //  jTextField9.setText(oConn.setResult.getString("valorigg"));

                }else{
                    oFunc.SubSistemaMensajeError("Verificar si existe el registro, prueba es:PRUEBA CUALITATIVA ANTIGENO");
                }
                oConn1.sqlStmt.close();
                oConn1.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarIn4ActionPerformed

    private void txtNordenIn4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenIn4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenIn4KeyTyped

    private void txtNordenIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenIn4ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        CargarSedes();
        if(!txtNordenIn4.getText().isEmpty()){
            if(!OrdenExisteIn4()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNordenIn4.getText() +"'";
                oConn1.FnBoolQueryExecute(Sql);
                try {
                    if (oConn1.setResult.next()) {
                        txtNombresIn4.setText(oConn1.setResult.getString("nombre"));
                        txtDniIn4.setText(oConn1.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                        pasar=(oConn1.setResult.getString("tipoprueba"));
                        txtEdadIn4.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );

                        //System.out.println(pasar);
                        if(pasar.equals("PC")) habilitarPc();
                        else
                        negarPc();
                        //soloPc(pasar);
                        txtNordenIn4.setEditable(false);
                        // FechaHoy.requestFocusInWindow();
                        oPe.fecha(FechaExIn4);
                        //   oPe.fecha(FechaHotel);

                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
                    oConn1.sqlStmt.close();
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        }
    }//GEN-LAST:event_txtNordenIn4ActionPerformed

    private void btnLimpiarIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIn3ActionPerformed
        limpiar3();
    }//GEN-LAST:event_btnLimpiarIn3ActionPerformed

    private void btnGrabarIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIn3ActionPerformed
        if(OrdenExisteIn3()){
            ActualizarIn3();
            limpiar3();

        }
        else{
            if(!txtNordenIn3.getText().isEmpty()){
                try {
                    if(validarIn3()){
                        if(GrabarIn3()){
                            imprimirIn3();
                            limpiar3();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGrabarIn3ActionPerformed

    private void btnMarca3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarca3MouseClicked
        MostrarAddMarca();
    }//GEN-LAST:event_btnMarca3MouseClicked

    private void cboMarca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarca3ActionPerformed
               if(cboMarca3.getSelectedItem().toString().contains("LABNOVATION"))
        {
        jTextAreaIgm2.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.3% \n"
                            + "Especificidad : 97.3 %");
        
        }
               
                        if(cboMarca3.getSelectedItem().toString().contains("SD BIOSENSOR"))
        {
        jTextAreaIgm2.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.52% \n"
                            + "Especificidad : 99.68%");
        }
                        
                        
    }//GEN-LAST:event_cboMarca3ActionPerformed

    private void cboMarca3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMarca3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca3MouseClicked

    private void cboMarca3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMarca3PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca3PopupMenuWillBecomeInvisible

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void btnImprimir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir3ActionPerformed
        if(!txtImprimirIn3.getText().isEmpty()){
            //System.out.println("el valor de imprimit es:"+txtImprimirIn1.getText());
            printIn3(Integer.valueOf(txtImprimirIn3.getText()));
        }
    }//GEN-LAST:event_btnImprimir3ActionPerformed

    private void txtImprimirIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirIn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirIn3ActionPerformed

    private void FechaExIn3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExIn3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExIn3PropertyChange

    private void btnEditarIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIn3ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn3.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
            + " ct.fecha_examen,ct.chkigm_reactivo, ct.chkigm_noreactivo, \n" +
            "                   ct.chkigg_reactivo, ct.chkigg_noreactivo, ct.chkinvalido, "
            + "ct.cbomarca, ct.txtvrigm,ct.txtvrigg,n.tipoprueba,ct.valorigm,ct.valorigg,ct.medico " +
            "               FROM datos_paciente AS d \n" +
            "               INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "               INNER JOIN examen_inmunologico AS ct ON (ct.n_orden = n.n_orden) \n" +
            "               WHERE n.nom_examen like '%PRUEBA CUANTITATIVA ANTIGENOS%' and  n.n_orden ='"+txtNordenIn3.getText() +"'";
            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    txtNombresIn3.setText(oConn1.setResult.getString("nombre"));
                    txtDniIn3.setText(oConn1.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn3.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn3.setDate(oConn1.setResult.getDate("fecha_examen"));
                    cboMarca3.setSelectedItem(oConn1.setResult.getString("cbomarca"));
                    jTextField15.setText(oConn1.setResult.getString("medico"));
                    jTextField13.setText(oConn1.setResult.getString("valorigm"));
                                    desbloqueo2();

                    //  jTextField9.setText(oConn.setResult.getString("valorigg"));

                }else{
                    oFunc.SubSistemaMensajeError("VErificar si existe registro, si la prueba es:  PRUEBA CUANTITATIVA ANTIGENOS");
                }
                oConn1.sqlStmt.close();
                oConn1.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarIn3ActionPerformed

    private void txtNordenIn3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenIn3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenIn3KeyTyped

    private void txtNordenIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenIn3ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn3.getText().isEmpty()){
            if(!OrdenExisteIn3()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNordenIn3.getText() +"'";
                oConn1.FnBoolQueryExecute(Sql);
                try {
                    if (oConn1.setResult.next()) {
                        txtNombresIn3.setText(oConn1.setResult.getString("nombre"));
                        txtDniIn3.setText(oConn1.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                        pasar=(oConn1.setResult.getString("tipoprueba"));
                        txtEdadIn3.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );

                        //System.out.println(pasar);
                        if(pasar.equals("PC")) habilitarPc();
                        else
                        negarPc();
                        //soloPc(pasar);
                        txtNordenIn3.setEditable(false);
                        // FechaHoy.requestFocusInWindow();
                        oPe.fecha(FechaExIn3);
                        //   oPe.fecha(FechaHotel);

                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
                    oConn1.sqlStmt.close();
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        }
    }//GEN-LAST:event_txtNordenIn3ActionPerformed

    private void btnLimpiarIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIn2ActionPerformed
limpiar2();
    }//GEN-LAST:event_btnLimpiarIn2ActionPerformed

    private void btnGrabarIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIn2ActionPerformed
        if(OrdenExisteIn2()){
            ActualizarIn2();
            limpiar2();

        }
        else{
            if(!txtNordenIn2.getText().isEmpty()){
                try {
                    if(validarIn2()){
                        if(GrabarIn2()){
                            imprimirIn2();
                            limpiar2();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGrabarIn2ActionPerformed

    private void btnMarca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarca2MouseClicked
        MostrarAddMarca();
    }//GEN-LAST:event_btnMarca2MouseClicked

    private void cboMarca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarca2ActionPerformed
                if(cboMarca2.getSelectedItem().toString().contains("LABNOVATION"))
        {
        jTextAreaIgm1.setText("Metodo: Inmunocromatografía\n"
                            + "Sensibilidad  : 96.3% \n"
                            + "Especificidad : 97.3 %");
        
        }
    }//GEN-LAST:event_cboMarca2ActionPerformed

    private void cboMarca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMarca2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca2MouseClicked

    private void cboMarca2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMarca2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca2PopupMenuWillBecomeInvisible

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void btnImprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir2ActionPerformed
        if(!txtImprimirIn2.getText().isEmpty()){
            //System.out.println("el valor de imprimit es:"+txtImprimirIn1.getText());
            printIn2(Integer.valueOf(txtImprimirIn2.getText()));
        }
    }//GEN-LAST:event_btnImprimir2ActionPerformed

    private void txtImprimirIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirIn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirIn2ActionPerformed

    private void FechaExIn2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExIn2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExIn2PropertyChange

    private void btnEditarIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarIn2ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn2.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
            + " ct.fecha_examen,ct.chkigm_reactivo, ct.chkigm_noreactivo, \n" +
            "                   ct.chkigg_reactivo, ct.chkigg_noreactivo, ct.chkinvalido, "
            + "ct.cbomarca, ct.txtvrigm,ct.txtvrigg,n.tipoprueba,ct.valorigm,ct.valorigg,ct.medico " +
            "               FROM datos_paciente AS d \n" +
            "               INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
            "               INNER JOIN examen_inmunologico AS ct ON (ct.n_orden = n.n_orden) \n" +
            "               WHERE n.nom_examen like '%PRUEBA CUANTITATIVA ANTICUERPOS%' and  n.n_orden ='"+txtNordenIn2.getText() +"'";
            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    txtNombresIn2.setText(oConn1.setResult.getString("nombre"));
                    txtDniIn2.setText(oConn1.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn2.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn2.setDate(oConn1.setResult.getDate("fecha_examen"));
                    cboMarca2.setSelectedItem(oConn1.setResult.getString("cbomarca"));
                    jTextField10.setText(oConn1.setResult.getString("medico"));
                    jTextField8.setText(oConn1.setResult.getString("valorigm"));
                    jTextField9.setText(oConn1.setResult.getString("valorigg"));
                    desbloqueo1();

                }else{
                    oFunc.SubSistemaMensajeError("Verificar que exista, el examen es:PRUEBA CUANTITATIVA ANTICUERPOS ");
                }
                oConn1.sqlStmt.close();
                oConn1.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarIn2ActionPerformed

    private void txtNordenIn2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenIn2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenIn2KeyTyped

    private void txtNordenIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenIn2ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn2.getText().isEmpty()){
            if(!OrdenExisteIn2()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNordenIn2.getText() +"'";
                oConn1.FnBoolQueryExecute(Sql);
                try {
                    if (oConn1.setResult.next()) {
                        txtNombresIn2.setText(oConn1.setResult.getString("nombre"));
                        txtDniIn2.setText(oConn1.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                        pasar=(oConn1.setResult.getString("tipoprueba"));
                        txtEdadIn2.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );

                        //System.out.println(pasar);
                        if(pasar.equals("PC")) habilitarPc();
                        else
                        negarPc();
                        //soloPc(pasar);
                        txtNordenIn2.setEditable(false);
                        // FechaHoy.requestFocusInWindow();
                        oPe.fecha(FechaExIn2);
                        //   oPe.fecha(FechaHotel);

                    }else{
                    oFunc.SubSistemaMensajeError("Verificar que exista, el examen es:PRUEBA CUANTITATIVA ANTICUERPOS ");
                    }
                    oConn1.sqlStmt.close();
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        }
    }//GEN-LAST:event_txtNordenIn2ActionPerformed

    private void btnLimpiarIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIn1ActionPerformed
        LimpiarIn();
    }//GEN-LAST:event_btnLimpiarIn1ActionPerformed

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
                    if(validarIn1()){
                        if(GrabarIn1()){
                            imprimirIn1();
                            LimpiarIn();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGrabarIn1ActionPerformed

    private void btnMarca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarca1MouseClicked
        MostrarAddMarca();
    }//GEN-LAST:event_btnMarca1MouseClicked

    private void cboMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarca1ActionPerformed

    }//GEN-LAST:event_cboMarca1ActionPerformed

    private void cboMarca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMarca1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca1MouseClicked

    private void cboMarca1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMarca1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarca1PopupMenuWillBecomeInvisible

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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

    private void chkInvalido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInvalido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkInvalido1ActionPerformed

    private void chkIggReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIggReactivo1ActionPerformed

    private void chkIggNoReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggNoReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIggNoReactivo1ActionPerformed

    private void chkIgmNoReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmNoReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIgmNoReactivo1ActionPerformed

    private void chkIgmReactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmReactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIgmReactivo1ActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        if(!txtImprimirIn1.getText().isEmpty()){
            //System.out.println("el valor de imprimit es:"+txtImprimirIn1.getText());
            printIn1(Integer.valueOf(txtImprimirIn1.getText()));
        }
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    private void txtImprimirIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirIn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirIn1ActionPerformed

    private void FechaExIn1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExIn1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExIn1PropertyChange

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
            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    txtNombresIn1.setText(oConn1.setResult.getString("nombre"));
                    txtDniIn1.setText(oConn1.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn1.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn1.setDate(oConn1.setResult.getDate("fecha_examen"));
                    cboMarca1.setSelectedItem(oConn1.setResult.getString("cbomarca"));
                    chkIgmReactivo1.setSelected(oConn1.setResult.getBoolean("chkigm_reactivo"));
                    chkIgmNoReactivo1.setSelected(oConn1.setResult.getBoolean("chkigm_noreactivo"));
                    chkIggReactivo1.setSelected(oConn1.setResult.getBoolean("chkigg_reactivo"));
                    chkIggNoReactivo1.setSelected(oConn1.setResult.getBoolean("chkigg_noreactivo"));
                    jTextField5.setText(oConn1.setResult.getString("medico"));
                    jTextField3.setText(oConn1.setResult.getString("valorigm"));
                    jTextField4.setText(oConn1.setResult.getString("valorigg"));

                    // chkInvalido1.setSelected(oConn.setResult.getBoolean("chkinvalido"));
                    // chkInvalido1.setEnabled(true);
                    //  jTextField2.setText(oConn.setResult.getString("cbomarca"));
                    // jTextAreaIgm.setText(oConn.setResult.getString("txtvrigm"));
                    // jTextAreaIgg.setText(oConn.setResult.getString("txtvrigg"));

                    // chkInvalido1.setSelected(false);
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                }
                oConn1.sqlStmt.close();
                oConn1.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarIn1ActionPerformed

    private void txtNordenIn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenIn1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenIn1KeyTyped

    private void txtNordenIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenIn1ActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn1.getText().isEmpty()){
            if(!OrdenExisteIn1()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNordenIn1.getText() +"'";
                oConn1.FnBoolQueryExecute(Sql);
                try {
                    if (oConn1.setResult.next()) {
                        txtNombresIn1.setText(oConn1.setResult.getString("nombre"));
                        txtDniIn1.setText(oConn1.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                        pasar=(oConn1.setResult.getString("tipoprueba"));
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
                    oConn1.sqlStmt.close();
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        }
    }//GEN-LAST:event_txtNordenIn1ActionPerformed

    private void chkPerdidaOlf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPerdidaOlf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPerdidaOlf1ActionPerformed

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

    private void FechaHotelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaHotelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaHotelPropertyChange

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if(!txtImprimirIn.getText().isEmpty()){
            printIn(Integer.valueOf(txtImprimirIn.getText()));
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtImprimirInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirInActionPerformed

    }//GEN-LAST:event_txtImprimirInActionPerformed

    private void FechaExInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExInPropertyChange

    }//GEN-LAST:event_FechaExInPropertyChange

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
            oConn1.FnBoolQueryExecute(Sql);
            try {   
                if (oConn1.setResult.next()) {
                    txtNombresIn.setText(oConn1.setResult.getString("nombre"));
                    txtDniIn.setText(oConn1.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdadIn.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                    FechaExIn.setDate(oConn1.setResult.getDate("fecha_examen"));
                    chkIgmReactivo.setSelected(oConn1.setResult.getBoolean("chkigm_reactivo"));
                    chkIgmNoReactivo.setSelected(oConn1.setResult.getBoolean("chkigm_noreactivo"));
                    chkIggReactivo.setSelected(oConn1.setResult.getBoolean("chkigg_reactivo"));
                    chkIggNoReactivo.setSelected(oConn1.setResult.getBoolean("chkigg_noreactivo"));
                    chkInvalido.setSelected(oConn1.setResult.getBoolean("chkinvalido"));
                    cboMarca.setSelectedItem(oConn1.setResult.getString("cbomarca"));
                    txtVRIgm.setText(oConn1.setResult.getString("txtvrigm"));
                    txtVRIgg.setText(oConn1.setResult.getString("txtvrigg"));
                    pasar=(oConn1.setResult.getString("tipoprueba"));
                    FechaHotel.setDate(oConn1.setResult.getDate("fecha_examen"));
                    if(pasar.equals("PC")) habilitarPc();
                    else negarPc();
                    
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                }
                     oConn1.sqlStmt.close();
                    oConn1.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ficha inmunologica:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarInActionPerformed

    private void txtNordenInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenInKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenInKeyTyped

    private void txtNordenInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenInActionPerformed
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNordenIn.getText().isEmpty()){
            if(!OrdenExisteIn()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNordenIn.getText() +"'";
                oConn1.FnBoolQueryExecute(Sql);
                try {
                    if (oConn1.setResult.next()) {
                        txtNombresIn.setText(oConn1.setResult.getString("nombre"));
                        txtDniIn.setText(oConn1.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                        pasar=(oConn1.setResult.getString("tipoprueba"));
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
                    oConn1.sqlStmt.close();
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Inmunologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
            }
        }
    }//GEN-LAST:event_txtNordenInActionPerformed

    private void btnLimpiarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInActionPerformed
        // TODO add your handling code here:
        LimpiarIn();
        negarPc();
    }//GEN-LAST:event_btnLimpiarInActionPerformed

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
                        Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
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
                        Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
        limpiar();
        valor=1;
    }//GEN-LAST:event_btnGrabarInActionPerformed

    private void btnMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarcaMouseClicked
        MostrarAddMarca();
    }//GEN-LAST:event_btnMarcaMouseClicked

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

    private void cboMarcaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMarcaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarcaPopupMenuWillBecomeInvisible

    private void chkInvalidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInvalidoActionPerformed
        // TODO add your handling code here:
        bgIgm.clearSelection();
        bgIgg.clearSelection();
    }//GEN-LAST:event_chkInvalidoActionPerformed

    private void chkIggReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIggReactivoActionPerformed

    private void chkIggNoReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIggNoReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIggNoReactivoActionPerformed

    private void chkIgmNoReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmNoReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIgmNoReactivoActionPerformed

    private void chkIgmReactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIgmReactivoActionPerformed
        // TODO add your handling code here:
        bgInvalido.clearSelection();
    }//GEN-LAST:event_chkIgmReactivoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarVentana();
        //oConn.SubConnectionClose();
    }//GEN-LAST:event_formInternalFrameClosing
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
}    public static com.toedter.calendar.JDateChooser FechaNacimiento;
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
      
        try {
            String sql2="SELECT spFuncionLLenadoPc("+txtNordenIn.getText()+",'"+FechaHotel.getDate()+"','"
                    +jTextFieldSaturacion.getText() +"');";
            valor=2;
            negarPc();
            jTextFieldSaturacion.setText("");
            //  System.out.println(sql2);
            oConn1.FnBoolQueryExecute(sql2);
            agregarSimtocasPc();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
            JOptionPane.showMessageDialog(null, "LLENAR CO2 ","Sistema MEDSOFT",JOptionPane.ERROR_MESSAGE);
        
        
    } Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date HorNew = new Date();
            SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
            String FfechaSystemA = fechaforma.format(HorNew);

            GestorTime.setFfechaSystem(FfechaSystemA);
            lblHora.setText(GestorTime.getFfechaSystem());
        }
    });
 
 
         
    public void limpiar2(){
    txtNordenIn2.setText("");
    txtNordenIn2.setEditable(true);
    FechaExIn2.setDate(null);
    txtNombresIn2.setText("");
    txtDniIn2.setText("");
    txtEdadIn2.setText("");
    jTextField10.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
      cboMarca2.setSelectedItem(null);
    }
     public void limpiar3(){
    txtNordenIn3.setText("");
    txtNordenIn3.setEditable(true);
    FechaExIn3.setDate(null);
    txtNombresIn3.setText("");
    txtDniIn3.setText("");
    txtEdadIn3.setText("");
    jTextField15.setText("");
    jTextField13.setText("");
      cboMarca3.setSelectedItem(null);
    }
       public void limpiar4(){
    txtNordenIn4.setText("");
        txtNordenIn4.setEditable(true);
  cboMarca4.setSelectedItem(null);
    FechaExIn4.setDate(null);
    txtNombresIn4.setText("");
    txtDniIn4.setText("");
    txtEdadIn4.setText("");
    jCheckBox2.setSelected(false);
    jCheckBox3.setSelected(false);
    }

    void btgroup(){
     btGrupo.clearSelection();
       // btTipoEx.clearSelection();
        btFactor.clearSelection();
//        btRpr.clearSelection();
    }
  
 


    public void MostrarAddMarca() {
        addMarca = new AddMarcaCovid1(this, true);
        addMarca.setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaExIn;
    private com.toedter.calendar.JDateChooser FechaExIn1;
    private com.toedter.calendar.JDateChooser FechaExIn2;
    private com.toedter.calendar.JDateChooser FechaExIn3;
    private com.toedter.calendar.JDateChooser FechaExIn4;
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
    private javax.swing.JButton btnEditarIn;
    private javax.swing.JButton btnEditarIn1;
    private javax.swing.JButton btnEditarIn2;
    private javax.swing.JButton btnEditarIn3;
    private javax.swing.JButton btnEditarIn4;
    private javax.swing.JButton btnGrabarIn;
    private javax.swing.JButton btnGrabarIn1;
    private javax.swing.JButton btnGrabarIn2;
    private javax.swing.JButton btnGrabarIn3;
    private javax.swing.JButton btnGrabarIn4;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnImprimir2;
    private javax.swing.JButton btnImprimir3;
    private javax.swing.JButton btnImprimir4;
    private javax.swing.JButton btnLimpiarIn;
    private javax.swing.JButton btnLimpiarIn1;
    private javax.swing.JButton btnLimpiarIn2;
    private javax.swing.JButton btnLimpiarIn3;
    private javax.swing.JButton btnLimpiarIn4;
    private javax.swing.JLabel btnMarca;
    private javax.swing.JLabel btnMarca1;
    private javax.swing.JLabel btnMarca2;
    private javax.swing.JLabel btnMarca3;
    private javax.swing.JLabel btnMarca4;
    private javax.swing.JComboBox cboMarca;
    private javax.swing.JComboBox cboMarca1;
    private javax.swing.JComboBox cboMarca2;
    private javax.swing.JComboBox cboMarca3;
    private javax.swing.JComboBox cboMarca4;
    private javax.swing.JCheckBox chkAsintomatico;
    private javax.swing.JCheckBox chkCefalea;
    private javax.swing.JCheckBox chkCongestionN;
    private javax.swing.JCheckBox chkDiarrea;
    private javax.swing.JCheckBox chkDificultadR;
    private javax.swing.JCheckBox chkDolor;
    private javax.swing.JCheckBox chkDolorG;
    private javax.swing.JCheckBox chkExpctoracion;
    private javax.swing.JCheckBox chkFiebre;
    private javax.swing.JCheckBox chkIggNoReactivo;
    private javax.swing.JCheckBox chkIggNoReactivo1;
    private javax.swing.JCheckBox chkIggReactivo;
    private javax.swing.JCheckBox chkIggReactivo1;
    private javax.swing.JCheckBox chkIgmNoReactivo;
    private javax.swing.JCheckBox chkIgmNoReactivo1;
    private javax.swing.JCheckBox chkIgmReactivo;
    private javax.swing.JCheckBox chkIgmReactivo1;
    private javax.swing.JCheckBox chkInvalido;
    private javax.swing.JCheckBox chkInvalido1;
    private javax.swing.JCheckBox chkIrritaibilidad;
    private javax.swing.JCheckBox chkMalestar;
    private javax.swing.JCheckBox chkNauseas;
    private javax.swing.JCheckBox chkPerdidaOlf1;
    private javax.swing.JCheckBox chkSintomatico;
    private javax.swing.JCheckBox chkTos;
    private javax.swing.ButtonGroup gCocaina;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel79;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextAreaIgg;
    private javax.swing.JTextArea jTextAreaIgg1;
    private javax.swing.JTextArea jTextAreaIgg2;
    private javax.swing.JTextArea jTextAreaIgm;
    private javax.swing.JTextArea jTextAreaIgm1;
    private javax.swing.JTextArea jTextAreaIgm2;
    private javax.swing.JTextArea jTextAreaIgm3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldSaturacion;
    private javax.swing.JTabbedPane jtLaboratorio;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField txtDniIn;
    private javax.swing.JTextField txtDniIn1;
    private javax.swing.JTextField txtDniIn2;
    private javax.swing.JTextField txtDniIn3;
    private javax.swing.JTextField txtDniIn4;
    private javax.swing.JTextField txtEdadIn;
    private javax.swing.JTextField txtEdadIn1;
    private javax.swing.JTextField txtEdadIn2;
    private javax.swing.JTextField txtEdadIn3;
    private javax.swing.JTextField txtEdadIn4;
    private javax.swing.JTextField txtImprimirIn;
    private javax.swing.JTextField txtImprimirIn1;
    private javax.swing.JTextField txtImprimirIn2;
    private javax.swing.JTextField txtImprimirIn3;
    private javax.swing.JTextField txtImprimirIn4;
    private javax.swing.JTextField txtNombresIn;
    private javax.swing.JTextField txtNombresIn1;
    private javax.swing.JTextField txtNombresIn2;
    private javax.swing.JTextField txtNombresIn3;
    private javax.swing.JTextField txtNombresIn4;
    private javax.swing.JTextField txtNordenIn;
    private javax.swing.JTextField txtNordenIn1;
    private javax.swing.JTextField txtNordenIn2;
    private javax.swing.JTextField txtNordenIn3;
    private javax.swing.JTextField txtNordenIn4;
    private javax.swing.JTextField txtSintoma;
    private javax.swing.JTextArea txtVRIgg;
    private javax.swing.JTextArea txtVRIgm;
    // End of variables declaration//GEN-END:variables
 public String[]getRowsToVector(String sql)
    {
        String[]veDats;
        //clsConnection oConn = new clsConnection();
        try
        {
            //oConn.FnBoolConnectionOpen(strConnector, strHost,strUser,strPassword);
            oConn1.FnBoolQueryExecute(sql);

            ArrayList lista = new ArrayList();
            while (oConn1.setResult.next())
            {
                lista.add(oConn1.setResult.getString(1));
            }
            veDats = new String[lista.size()];
            for (int i = 0; i < lista.size(); i++)
            {
                veDats[i]=lista.get(i).toString();
            }
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
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
    
    private void CargarSedes(){
      String sQuery;        
        // Prepara el Query
        sQuery ="select s.nombre_sede from n_orden_ocupacional as n inner join sede as s on n.cod_sede=s.cod_sede where n_orden=" + txtNordenIn4.getText().toString().trim();
        String cboSede="1";
        if (oConn1.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                 while (oConn1.setResult.next())
                 {                     
                     // Obtiene los datos de la Consulta
                     sed=(oConn1.setResult.getString ("nombre_Sede"));
                     
                 }
                 
                 
                 // Cierra Resultados
                 oConn1.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(Ingreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        //cboSede.setSelectedIndex(1);


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
    
    public boolean OrdenExisteIn()
    {
        boolean bResultado=false;
        if(!txtNordenIn.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from examen_inmunologico Where n_orden ="+txtNordenIn.getText().toString();
        oConn1.FnBoolQueryExecute(sQuery);
        try {
            if (oConn1.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
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
        oConn1.FnBoolQueryExecute(sQuery);
        try {
            if (oConn1.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     }  
   public boolean OrdenExisteIn2()
     {
        boolean bResultado=false;
        if(!txtNordenIn2.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select e.n_orden from examen_inmunologico as e inner join n_orden_ocupacional as n on e.n_orden=n.n_orden  "
                + "Where n.nom_examen like '%PRUEBA CUANTITATIVA ANTICUERPOS%' and  e.n_orden ="+txtNordenIn2.getText().toString();
        oConn1.FnBoolQueryExecute(sQuery);
        try {
            if (oConn1.setResult.next())
            {
                bResultado = true;
                desbloqueo1();
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            else 
          // oFunc.SubSistemaMensajeError("Verificar que exista, el examen es:PRUEBA CUANTITATIVA ANTICUERPOS ");
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     }      
   
     public boolean OrdenExisteIn3()
     {
        boolean bResultado=false;
        if(!txtNordenIn3.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select e.n_orden from examen_inmunologico as e inner join n_orden_ocupacional as n on e.n_orden=n.n_orden  "
                + "Where n.nom_examen like '%PRUEBA CUANTITATIVA ANTIGENOS%' and  e.n_orden ="+txtNordenIn3.getText().toString();
        oConn1.FnBoolQueryExecute(sQuery);
        try {
            if (oConn1.setResult.next())
            {
                bResultado = true;
                desbloqueo2();
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            else 
            oFunc.SubSistemaMensajeError("VErificar si existe registro, si la prueba es:  PRUEBA CUANTITATIVA ANTIGENOS");
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     }
      public boolean OrdenExisteIn4()
     {
        boolean bResultado=false;
        if(!txtNordenIn4.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select e.n_orden from examen_inmunologico as e inner join n_orden_ocupacional as n on e.n_orden=n.n_orden  "
                + "Where n.nom_examen like '%PRUEBA CUALITATIVA ANTIGENOS%' and  n.n_orden ="+txtNordenIn4.getText().toString();
        oConn1.FnBoolQueryExecute(sQuery);
        try {
            if (oConn1.setResult.next())
            {                desbloqueo3();

                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            else
            oFunc.SubSistemaMensajeError("Verificar si existe el registro, prueba es:PRUEBA CUALITATIVA ANTIGENO");
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
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
       private boolean validarIn2(){
        boolean bResultado=true;

            if (((JTextField)FechaExIn2.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
         private boolean validarIn3(){
        boolean bResultado=true;

            if (((JTextField)FechaExIn3.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
     private boolean validarIn4(){
        boolean bResultado=true;

            if (((JTextField)FechaExIn4.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
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
             if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   
               
               }
                 try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
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
                    "','"+cboMarca1.getSelectedItem()+ 
                    "','"+jTextAreaIgm.getText()+ 
                    "','"+jTextAreaIgg.getText()+"',"+
                    valorigm+","+valorigg+",'"+jTextField5.getText()+"'"
                    + ")";
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   
               }
               try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
                return bResult;       
        }
      
      private boolean GrabarIn2() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO examen_inmunologico(\n" +
"            n_orden, dni_pa, fecha_examen,cbomarca,txtvrigm,txtvrigg,valorigm,valorigg,medico)";       
            strSqlStmt+= "values('"+ txtNordenIn2.getText()+"','"+txtDniIn2.getText().toString()+"','"+FechaExIn2.getDate()+
                   
                    "','"+cboMarca2.getSelectedItem()+ 
                    "','"+jTextAreaIgm1.getText()+ 
                    "','"+jTextAreaIgg1.getText()+"',"+
                    jTextField8.getText()+","+jTextField9.getText()+",'"+jTextField10.getText()+"'"
                    + ")";
            System.out.println(strSqlStmt);
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   
                
               }
                try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
                return bResult;       
        }
      private boolean GrabarIn3() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO examen_inmunologico(\n" +
"            n_orden, dni_pa, fecha_examen,cbomarca,txtvrigm,txtvrigg,valorigm,medico)";       
            strSqlStmt+= "values('"+ txtNordenIn3.getText()+"','"+txtDniIn3.getText().toString()+"','"+FechaExIn3.getDate()+
                   
                    "','"+cboMarca3.getSelectedItem()+ 
                    "','"+jTextAreaIgm2.getText()+ 
                    "','"+jTextAreaIgg2.getText()+"',"+
                    jTextField13.getText()+",'"+jTextField15.getText()+"'"
                    + ")";
            System.out.println(strSqlStmt);
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
               
               }
                 
                   try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
                return bResult;       
        }
      
        private boolean GrabarIn4() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO examen_inmunologico(\n" +
"            n_orden, dni_pa, fecha_examen,chkigm_reactivo, \n" +
"            chkigg_reactivo,cbomarca,txtvrigm,medico)";       
            strSqlStmt+= "values('"+ txtNordenIn4.getText()+"','"+txtDniIn4.getText().toString()+"','"+FechaExIn4.getDate()+
                    "','"+jCheckBox2.isSelected()+ 
                    "','"+jCheckBox3.isSelected()+  
                    "','"+cboMarca4.getSelectedItem()+ 
                    "','"+jTextAreaIgm3.getText()+ 
                    "','"+jTextField18.getText()+"')";
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   
               }
               try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
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
            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirIn();
              //  Limpiar();
             
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
             try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
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
                    + "      cbomarca='"+cboMarca1.getSelectedItem()+"', \n" 
                    + "      txtvrigm='"+jTextAreaIgm.getText()+"', \n" 
                    + "      txtvrigg='"+jTextAreaIgg.getText()+"',"+
                    "        valorigm="+valorigm+","+
                    "        valorigg="+valorigg+","+
                    "        medico='"+jTextField5.getText()+
                    "' WHERE n_orden='"+sCodigo+"';";
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirIn1();
                //Limpiar();
                
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
             try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
     
     
     }


   
         public void ActualizarIn2(){
            String sCodigo=txtNordenIn2.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE examen_inmunologico\n" +
                    " SET fecha_examen='"+FechaExIn2.getDate()+"',"
                   
                    + "      cbomarca='"+cboMarca2.getSelectedItem()+"', \n" 
                    + "      txtvrigm='"+jTextAreaIgm1.getText()+"', \n" 
                    + "      txtvrigg='"+jTextAreaIgg1.getText()+"',"+
                    "        valorigm="+jTextField8.getText()+","+
                    "        valorigg="+jTextField9.getText()+","+
                    "        medico='"+jTextField10.getText()+
                    "' WHERE n_orden='"+sCodigo+"';";
                 System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirIn2();
                limpiar2();
               
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
             try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
    }  
         
             public void ActualizarIn3(){
            String sCodigo=txtNordenIn3.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE examen_inmunologico\n" +
                    " SET fecha_examen='"+FechaExIn3.getDate()+"',"
                   
                    + "      cbomarca='"+cboMarca3.getSelectedItem()+"', \n" 
                    + "      txtvrigm='"+jTextAreaIgm2.getText()+"', \n" 
                    + "      txtvrigg='"+jTextAreaIgg2.getText()+"',"+
                    "        valorigm="+jTextField13.getText()+","+
                    "        medico='"+jTextField15.getText()+
                    "' WHERE n_orden='"+sCodigo+"';";
                 System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimirIn3();
                limpiar3();
               
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
             try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
      public void ActualizarIn4(){
            String sCodigo=txtNordenIn4.getText();
            String strSqlStmt;

            strSqlStmt="UPDATE examen_inmunologico\n" +
                    " SET fecha_examen='"+FechaExIn4.getDate()+"',"
                       + "      chkigm_reactivo='"+jCheckBox2.isSelected()+"', \n" 
                    + "      chkigg_reactivo='"+jCheckBox3.isSelected()+"',"
                    + "      cbomarca='"+cboMarca4.getSelectedItem()+"', \n" 
                    + "      txtvrigm='"+jTextAreaIgm3.getText()+"', \n" 
                  +  "        medico='"+jTextField18.getText()+
                    "' WHERE n_orden='"+sCodigo+"';";
                 System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                 
                         if(sed.contains("Huancayo"))
                 printerIn12(Integer.valueOf(txtNordenIn4.getText().toString())); 
                         else
                         {
                if(jCheckBox1.isSelected())
                            imprimirIn5();
                            else
                            {     
                            imprimirIn4(); 
                            limpiar4();
                            }
                         }
                        
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
            try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
                } 
    }     
    private void LimpiarIn(){
        txtNordenIn.setText(null);
        txtNordenIn1.setText(null);
        txtNombresIn.setText(null);
        txtNombresIn1.setText(null);
         cboMarca1.setSelectedItem(null);
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
        txtNordenIn1.setEnabled(true); 
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
      private boolean imprimirIn2(){
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
              printerIn2(Integer.valueOf(txtNordenIn2.getText()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
      
         private boolean imprimirIn3(){
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
              printerIn3(Integer.valueOf(txtNordenIn3.getText()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
          private boolean imprimirIn4(){
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
              printerIn4(Integer.valueOf(txtNordenIn4.getText()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
        private boolean imprimirIn5(){
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
              printerIn5(Integer.valueOf(txtNordenIn4.getText()));
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
               private void printIn2(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcuantianti.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Prueba cauntitativa de anticuerpos");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
         private void printIn3(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcuantiantigeno.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Prueba cuantitativa de antigenos");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }         
                  private void printIn4(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcualitativaantigeno.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Prueba Cualitativa de antigenos");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }      
                        private void printIn5(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcualitativaantigenono.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Prueba Cualitativa de antigenos");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }  
                           private void printIn12(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcualitativaantigeno3213.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Prueba Cualitativa de antigenos");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }  
         private void printerIn2(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcuantianti.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
         
          private void printerIn3(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcuantiantigeno.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
           private void printerIn4(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcualitativaantigeno.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   } 
                     private void printerIn12(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcualitativaantigeno3213.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   } 
        private void printerIn5(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"pcualitativaantigenono.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
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

        if (oConn1.FnBoolQueryExecute(sQuery)) {
            try {

                while (oConn1.setResult.next()) {
                    cboMarca.addItem(oConn1.setResult.getString("marca_c"));
                        cboMarca1.addItem(oConn1.setResult.getString("marca_c"));
                        cboMarca2.addItem(oConn1.setResult.getString("marca_c"));
                        cboMarca3.addItem(oConn1.setResult.getString("marca_c"));
                        cboMarca4.addItem(oConn1.setResult.getString("marca_c"));
                }

                // Cierra Resultados
     oConn1.sqlStmt.close();
                oConn1.setResult.close();

            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());

            }
            
        }
    try {
        oConn1.sqlStmt.close();
        oConn1.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(LaboratorioClinicoCovid.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

}
