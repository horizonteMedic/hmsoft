/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;
import Clases.ESCPrinter;
import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import autocomplete.ajTextFieldConsulta;
import autocomplete.ajTextFieldInteger;
import autocomplete.ajTextField;
//import com.lowagie.text.Row;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import sistema.Ingreso;

public final class RegistroAsistencial extends javax.swing.JInternalFrame {
     // Constantes para las Columnas JTTICKET
    static final int INT_COL_CANTIDAD = 0;
    static final int INT_COL_CODIGO = 1;
    static final int INT_COL_DESCRIPCION = 2;
    static final int INT_COL_UNITARIO = 3;
    static final int INT_COL_TOTAL = 4;
    clsConnection oConn1 = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    Ingreso objet= new Ingreso();
    boolean bAgruparProductos = true;
    DefaultTableModel ticket;
    DefaultTableModel model; 
    String hcl;
    String operador;
    String foranea;
    String dni;
   public RegistroAsistencial() {
       super();
       initComponents();
       jtcomprobantes.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/lapiz.png")));
       
       fecha();
       AutoCompleteDecorator.decorate(this.cboServicios);
       AutoCompleteDecorator.decorate(this.cboModoPago);
       AutoCompleteDecorator.decorate(this.cboAutoriza);
       timer.start();
       txtOperador.setText(clsGlobales.sNomOperador); 
       new ajTextFieldInteger.autocompleterText(txtBusDni, "cod_pa", "datos_paciente_asistencial");
       new ajTextFieldConsulta.autocompleterText(txtBuNombres, "select nombres_pa||' '||apellidos_pa as nombre FROM datos_paciente_asistencial WHERE CONCAT(nombres_pa,' ',apellidos_pa)");
       new ajTextFieldConsulta.autocompleterText(txtDoctor, "select nombre_user||' '||apellido_user as nombre FROM usuarios WHERE CONCAT(nombre_user,' ',apellido_user)");
       new ajTextField.autocompleterText(txtEmpresa, "razon_empresa", "empresas");
       sbTicket();
       numTicket();
       CargarServicios();
       cboServicios.setSelectedIndex(-1);
       cboAutoriza.setSelectedIndex(-1);
       CargarNumHistoria();
       CargarId();
       desabilitar(false);

   }
//    private com.toedter.calendar.JDateChooser FechaNacimiento;
      
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgFichas = new javax.swing.ButtonGroup();
        pmTicket = new javax.swing.JPopupMenu();
        btnEliminar = new javax.swing.JMenuItem();
        btgBusDoc = new javax.swing.ButtonGroup();
        bgTpoDoc = new javax.swing.ButtonGroup();
        jtcomprobantes = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox();
        txtDireccion = new javax.swing.JTextField();
        cboEstadoCivil = new javax.swing.JComboBox();
        txtCelular = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        FechaNac = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        rbSD = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtNumHcl = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtLugarNacimiento = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        cboNivelEstudio = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cboServicios = new javax.swing.JComboBox();
        txtCodServicio = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPrecioT = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cboDescuento = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTicket = new javax.swing.JTable();
        btnImprimirTicket = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnImprimirFicha = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtdescuento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        rbBusDni = new javax.swing.JRadioButton();
        rbBusHistoria = new javax.swing.JRadioButton();
        txtBusDni = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtBuNombres = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cboModoPago = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtHoraTicket = new javax.swing.JTextField();
        txtNroTicket = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        rbBusSD = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        txtNumHcl1 = new javax.swing.JLabel();
        txtFechaTicket = new javax.swing.JTextField();
        chkMenor5 = new javax.swing.JCheckBox();
        chkAdolescente = new javax.swing.JCheckBox();
        chkAdulto = new javax.swing.JCheckBox();
        chkAdultoM = new javax.swing.JCheckBox();
        txtEmpresa = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cboAutoriza = new javax.swing.JComboBox<>();
        txtOperador = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txtImp = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodVendedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btnReporteFechas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fecha3 = new com.toedter.calendar.JDateChooser();
        Fecha4 = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtReporte = new javax.swing.JTable();
        btnExportarExel = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pmTicket.add(btnEliminar);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("TICKET DE ATENCIÓN PACIENTE ASISTENCIAL ");
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

        jtcomprobantes.setBackground(new java.awt.Color(204, 204, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("(*)Sexo:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel15.setText("(*)Fecha Nacimiento:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel16.setText("(*)Nombres :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel17.setText("Estado Civil:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        jPanel5.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 251, -1));

        cboSexo.setEditable(true);
        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));
        cboSexo.setSelectedIndex(-1);
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });
        jPanel5.add(cboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 131, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel5.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 251, 20));

        cboEstadoCivil.setEditable(true);
        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "CONVIVIENTE" }));
        cboEstadoCivil.setSelectedIndex(-1);
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });
        jPanel5.add(cboEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 155, -1));

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        jPanel5.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 155, -1));

        jLabel20.setText("(*)Documento:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel21.setText("Telefono:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/celular.png"))); // NOI18N
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        FechaNac.setDateFormatString("dd/MM/yyyy");
        FechaNac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaNacMouseClicked(evt);
            }
        });
        FechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaNacPropertyChange(evt);
            }
        });
        FechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FechaNacKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FechaNacKeyReleased(evt);
            }
        });
        jPanel5.add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 145, -1));

        jLabel34.setText("(*)Apellidos:");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        jPanel5.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 251, -1));
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 242, 52, -1));

        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel5.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, -1));

        bgTpoDoc.add(rbSD);
        rbSD.setText("S/D");
        rbSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSDActionPerformed(evt);
            }
        });
        jPanel5.add(rbSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        bgTpoDoc.add(jRadioButton2);
        jRadioButton2.setText("Pasaporte");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel36.setText("Domicilio Actual:");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 160, 30));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setMnemonic('e');
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 110, 30));

        jLabel18.setText("Fecha:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        jLabel19.setText("N° HCL :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, -1));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel5.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 90, 20));

        txtNumHcl.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.add(txtNumHcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 20));

        bgTpoDoc.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("D.N.I.");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel22.setText("Hora:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel5.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 90, 20));

        jLabel39.setText("Lugar de Nacimiento:");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtLugarNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarNacimientoActionPerformed(evt);
            }
        });
        jPanel5.add(txtLugarNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 251, 20));

        jLabel40.setText("Departamento:");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });
        jPanel5.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 251, 20));

        jLabel41.setText("Provincia:");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaActionPerformed(evt);
            }
        });
        jPanel5.add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 251, 20));

        jLabel42.setText("Distrito:");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });
        jPanel5.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 251, 20));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, 30));

        jLabel44.setText("Ocupación:");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txtOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionActionPerformed(evt);
            }
        });
        jPanel5.add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 251, 20));

        jLabel45.setText("Nivel de Estudio:");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        cboNivelEstudio.setEditable(true);
        cboNivelEstudio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANALFABETO", "PRIMARIA COMPLETA", "PRIMARIA INCOMPLETA", "SECUNDARIA COMPLETA", "SECUNDARIA INCOMPLETA", "UNIVERSITARIO", "TECNICO" }));
        cboNivelEstudio.setSelectedIndex(-1);
        cboNivelEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelEstudioActionPerformed(evt);
            }
        });
        jPanel5.add(cboNivelEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtcomprobantes.addTab("REGISTRO", jPanel3);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Servicios Ticket"));

        jLabel26.setText("Servicio:");

        cboServicios.setEditable(true);
        cboServicios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboServiciosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServiciosActionPerformed(evt);
            }
        });

        txtCodServicio.setEditable(false);

        jLabel27.setText("Cod. Servicio:");

        jLabel28.setText("Precio:");

        txtPrecioT.setEditable(false);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel32.setText("Descuento :");

        cboDescuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%" }));

        jLabel29.setText("Unidad :");

        txtUnidad.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cboServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtCodServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txtPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(cboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 11, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        tbTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTicket.setComponentPopupMenu(pmTicket);
        jScrollPane2.setViewportView(tbTicket);

        btnImprimirTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnImprimirTicket.setText("Imprimir Ticket");
        btnImprimirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirTicketActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnCancelar.setText("Limpiar / Nuevo");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel31.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 51, 0));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal.setText("S/.00.00");
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnImprimirFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnImprimirFicha.setText("Imprimir Ficha");
        btnImprimirFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFichaActionPerformed(evt);
            }
        });

        jLabel11.setText("Descuento:");

        txtdescuento.setText("S/.00.00");
        txtdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescuentoActionPerformed(evt);
            }
        });

        btgBusDoc.add(rbBusDni);
        rbBusDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbBusDni.setSelected(true);
        rbBusDni.setText("D.N.I.");
        rbBusDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBusDniActionPerformed(evt);
            }
        });

        btgBusDoc.add(rbBusHistoria);
        rbBusHistoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbBusHistoria.setText("Historia Clínica");
        rbBusHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBusHistoriaActionPerformed(evt);
            }
        });

        txtBusDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusDniActionPerformed(evt);
            }
        });

        jLabel23.setText("Apellidos y Nombres:");

        txtBuNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuNombresActionPerformed(evt);
            }
        });

        jLabel33.setText("Método de pago:");

        cboModoPago.setEditable(true);
        cboModoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTADO", "CREDITO", "TARJETA DEBITO", "TARJETA CREDITO", "TRANSFERENCIA" }));
        cboModoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModoPagoActionPerformed(evt);
            }
        });

        jLabel37.setText("Fecha:");

        jLabel38.setText("Hora:");

        txtHoraTicket.setForeground(new java.awt.Color(0, 153, 153));
        txtHoraTicket.setEnabled(false);

        txtNroTicket.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNroTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNroTicket.setText("0000000");
        txtNroTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nro Ticket"));

        jLabel30.setText("Doctor :");

        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });

        btgBusDoc.add(rbBusSD);
        rbBusSD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbBusSD.setText("S/D");
        rbBusSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBusSDActionPerformed(evt);
            }
        });

        jLabel24.setText("N° HCL :");

        txtNumHcl1.setBackground(new java.awt.Color(255, 255, 204));
        txtNumHcl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNumHcl1.setForeground(new java.awt.Color(0, 0, 153));
        txtNumHcl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtFechaTicket.setForeground(new java.awt.Color(0, 153, 153));
        txtFechaTicket.setEnabled(false);

        bgFichas.add(chkMenor5);
        chkMenor5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkMenor5.setText("< 5años");

        bgFichas.add(chkAdolescente);
        chkAdolescente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAdolescente.setText("Adolescente");
        chkAdolescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdolescenteActionPerformed(evt);
            }
        });

        bgFichas.add(chkAdulto);
        chkAdulto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAdulto.setText("Adulto");
        chkAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdultoActionPerformed(evt);
            }
        });

        bgFichas.add(chkAdultoM);
        chkAdultoM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkAdultoM.setText("Adulto Mayor");
        chkAdultoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdultoMActionPerformed(evt);
            }
        });

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        jLabel43.setText("Empresa:");

        jLabel46.setText("Autorizado por:");

        cboAutoriza.setEditable(true);
        cboAutoriza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DR. ARTEMIO", "CARLOS", "LILIANA", "CONVENIO", "POR CORREO", "OTROS..................................." }));
        cboAutoriza.setEnabled(false);
        cboAutoriza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAutorizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel43)
                        .addGap(2, 2, 2)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cboModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboAutoriza, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rbBusDni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbBusHistoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbBusSD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBusDni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(chkMenor5)
                                .addGap(7, 7, 7)
                                .addComponent(chkAdolescente)
                                .addGap(5, 5, 5)
                                .addComponent(chkAdulto)
                                .addGap(9, 9, 9)
                                .addComponent(chkAdultoM))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHoraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFechaTicket)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumHcl1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumHcl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(txtNroTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtFechaTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(txtHoraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbBusDni)
                                .addComponent(rbBusHistoria)
                                .addComponent(rbBusSD))
                            .addComponent(txtBusDni))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtBuNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboAutoriza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkMenor5)
                            .addComponent(chkAdolescente)
                            .addComponent(chkAdulto)
                            .addComponent(chkAdultoM))))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        txtOperador.setEditable(false);
        txtOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperadorActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imprimir"));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel6.setText(" N° TICKET");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImp)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addGap(23, 23, 23))
        );

        txtCodVendedor.setBackground(new java.awt.Color(255, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Codigo Vendedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnImprimirFicha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimirTicket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodVendedor)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)
                        .addComponent(txtCodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImprimirTicket)
                        .addComponent(btnImprimirFicha)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        jPanel7.getAccessibleContext().setAccessibleName("Agregar");
        txtdescuento.getAccessibleContext().setAccessibleName("S/.00.00");

        jtcomprobantes.addTab("Ticket(F1)", jPanel1);

        jLabel1.setText("Desde :");

        jLabel2.setText("Hasta :");

        btnReporteFechas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        btnReporteFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFechasActionPerformed(evt);
            }
        });

        jLabel3.setText("Reporte General por Fechas");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chek.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Hasta :");

        jLabel5.setText("Reporte por Doctor");

        jtReporte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtReporte);

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReporteFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExportarExel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnReporteFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportarExel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jtcomprobantes.addTab("Reportes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtcomprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtcomprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnImprimirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirTicketActionPerformed
    }//GEN-LAST:event_btnImprimirTicketActionPerformed
 

       
    public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
        try {
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    this.dispose();
      //  System.exit(0);

    }
       
private boolean validar(){
boolean bResultado=true;
    if (txtBuNombres.getText().isEmpty()|| txtBusDni.getText().isEmpty()
            ||txtDoctor.getText().isEmpty()||txtCodServicio.getText().isEmpty()) {
        oFunc.SubSistemaMensajeError("Ingrese Datos completos: DNI,Nombre,Doctor,Servicio");
        bResultado = false;
    }
    if(txtCodVendedor.getText().isEmpty()){
        bResultado= false;
        txtCodVendedor.requestFocus();
        oFunc.SubSistemaMensajeError("Ingrese su codigo de trabajador");
    }
   return bResultado;
}
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!ServicioExiste()) {
             sbServicioAgrega();
             sumar();
        } else {
            sumar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cboServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServiciosActionPerformed
        cboServicios.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cboServicios.getSelectedIndex() >= 0) {
                    pServicios();
                    if (txtDoctor.getText().isEmpty()) {
                        txtDoctor.requestFocus();
                    } else {
                        btnAgregar.requestFocusInWindow();
                    }
                    
                }
            }
        });

    }//GEN-LAST:event_cboServiciosActionPerformed

    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
       cboModoPago.requestFocus();
        
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
          txtDni.requestFocusInWindow();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int iRow;
        if(tbTicket.getSelectedRow()>= 0){
        if(tbTicket.getRowCount()>1){

            iRow = tbTicket.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
            tblDatos.removeRow(iRow);
            tbTicket.setModel(tblDatos);
            sumar();

        }else{
            iRow = tbTicket.getSelectedRow();
            DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
            tblDatos.removeRow(iRow);
            tbTicket.setModel(tblDatos);
            txtTotal.setText("S/.00.00");

        }
        }else{
        oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboServiciosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboServiciosPopupMenuWillBecomeInvisible
         pServicios();
                if(txtDoctor.getText().isEmpty()){
                 txtDoctor.requestFocus();
                }else{btnAgregar.requestFocusInWindow();}
    }//GEN-LAST:event_cboServiciosPopupMenuWillBecomeInvisible

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       LimpiarTicket();
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnReporteFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFechasActionPerformed
        sbReporteAtenciones();
        ReporteFechas(Fecha1.getDate(), Fecha2.getDate());
       
    }//GEN-LAST:event_btnReporteFechasActionPerformed

    private void btnImprimirFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFichaActionPerformed
        insertarRegistros();
        
    }//GEN-LAST:event_btnImprimirFichaActionPerformed
   public void insertarRegistros(){
       boolean bCommit = false;
        
        if (validar()) {
            // Inicia la transacción colocando el commit a false
            oConn1.SubAutoCommit(false);
            // Intenta ejecutar cada uno de los procesos
            if (oTicketDetalle()) {
                if (oTicketContenido()) {
                    bCommit = true;
                }
            }
            // Verifica si debe hacer commit
            if (bCommit) {
                // Realiza la confirmación de la transaccion
                oConn1.SubCommit();
                btnImprimirFicha.setEnabled(bCommit);
                imprimir();
                LimpiarTicket();
                
            } else {
                oConn1.SubRollBack();
            }
            
        }
   }
    private void txtdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentoActionPerformed
        String tota = txtTotal.getText();
        double total=(Double.valueOf(oFunc.Soles(tota)));
        double descuento=Double.valueOf(oFunc.Soles(txtdescuento.getText()));
               total=total-descuento;
               txtdescuento.setText(oFunc.convertir(descuento));
               txtTotal.setText(oFunc.convertir(total));     
    }//GEN-LAST:event_txtdescuentoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarVentana();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        txtApellidos.requestFocus();
    }//GEN-LAST:event_txtNombresActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        cboEstadoCivil.requestFocus();
    }//GEN-LAST:event_cboSexoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtCelular.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        txtOcupacion.requestFocus();
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed

    }//GEN-LAST:event_txtCelularActionPerformed

    private void FechaNacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaNacMouseClicked

    }//GEN-LAST:event_FechaNacMouseClicked

    private void FechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacPropertyChange

    }//GEN-LAST:event_FechaNacPropertyChange

    private void FechaNacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaNacKeyPressed
        cboSexo.requestFocus();
    }//GEN-LAST:event_FechaNacKeyPressed

    private void FechaNacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaNacKeyReleased

    }//GEN-LAST:event_FechaNacKeyReleased

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        FechaNac.requestFocusInWindow();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        if (txtDni.getText().trim().length() >= 8) {
                cargarDatos(txtDni);
                dni=txtDni.getText();

        }else {
                JOptionPane.showMessageDialog(null, "INGRESAR DOCOMUENTO COMPLETO");
        }
        

        
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        //     txtNombre.requestFocus();
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

    }//GEN-LAST:event_txtDniKeyTyped

    private void rbSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSDActionPerformed
        CargarNumHistoria();
        if (rbSD.isSelected()) {
            CodSinDni();
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_rbSDActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
            grabarAsistencial();
            Limpiar();

        

        //   jPanel3.setVisible(false);
        //   jPanel4.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       desabilitar(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void rbBusDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBusDniActionPerformed
        txtBusDni.setEnabled(true);
    }//GEN-LAST:event_rbBusDniActionPerformed

    private void rbBusHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBusHistoriaActionPerformed
        txtBusDni.setEnabled(true);
    }//GEN-LAST:event_rbBusHistoriaActionPerformed

    private void txtBusDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusDniActionPerformed
         if (txtBusDni.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese DNI de Trabajador");
        }else{
            if (!OrdenExiste()) {
                try {
                String oSql = "SELECT CONCAT(nombres_pa,' ',apellidos_pa) as nombres, \n"
                        + "n_hcl FROM datos_paciente_asistencial where cod_pa = '" + txtBusDni.getText() + "' LIMIT 1";
                oConn1.FnBoolQueryExecute(oSql);
                
                    if (oConn1.setResult.next()) {
                        txtBuNombres.setText(oConn1.setResult.getString("nombres"));
                        txtNumHcl1.setText(oConn1.setResult.getString("n_hcl"));
                        CargarServicios();
                        txtEmpresa.requestFocus();
                        numTicket();
                    }else{
                        txtBusDni.requestFocus();
                    }
                 oConn1.setResult.close();
                 oConn1.sqlStmt.close();    
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Ticket -: " + ex.getMessage().toString());
                    Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(OrdenExiste1())
                {
                      // System.out.println("apunto de cargar datos");
               // cargarDatosPaciente();
                
                }
                }
            }
        
    }//GEN-LAST:event_txtBusDniActionPerformed

    private void txtBuNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuNombresActionPerformed
        // TODO add your handling code here:
        if (rbBusSD.isSelected()) {
            if (!txtBuNombres.getText().isEmpty()) {
                bNombre(txtBuNombres);
            } else {
                txtBuNombres.requestFocus();
            }
        } else {
            
            txtBusDni.requestFocusInWindow();
        }
       
    }//GEN-LAST:event_txtBuNombresActionPerformed

    private void rbBusSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBusSDActionPerformed
        // TODO add your handling code here:
        if(rbBusSD.isSelected()){
            txtBuNombres.requestFocus();
            txtBusDni.setEnabled(false);
            
        }
    }//GEN-LAST:event_rbBusSDActionPerformed

    private void txtOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperadorActionPerformed

    private void cboModoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModoPagoActionPerformed
        // TODO add your handling code here:
        cboModoPago.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboModoPago.getSelectedIndex() <= -1) {

                } else if(cboModoPago.getSelectedIndex() == 1){
                    cboAutoriza.setEnabled(true);
                    cboAutoriza.requestFocus();
                }else{
                    txtCodVendedor.requestFocusInWindow();
                    cboAutoriza.setEnabled(false);
                    cboServicios.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboModoPagoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtLugarNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarNacimientoActionPerformed
        // TODO add your handling code here:
        txtDepartamento.requestFocus();
    }//GEN-LAST:event_txtLugarNacimientoActionPerformed

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
        txtProvincia.requestFocus();
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void txtProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaActionPerformed
        // TODO add your handling code here:
        txtDistrito.requestFocus();
    }//GEN-LAST:event_txtProvinciaActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void chkAdolescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdolescenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdolescenteActionPerformed

    private void chkAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdultoActionPerformed

    private void chkAdultoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdultoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdultoMActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ReImp();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed
        // TODO add your handling code here:
        if(this.jtReporte.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(jtReporte);
    }//GEN-LAST:event_btnExportarExelActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
        txtDoctor.requestFocus();
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizarAsistencial();
        LimpiarTicket();
        Limpiar();
        cboModoPago.setSelectedIndex(0);
        txtBusDni.setText(dni);
        txtBusDni.requestFocus();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionActionPerformed
        // TODO add your handling code here:
        cboNivelEstudio.requestFocus();
    }//GEN-LAST:event_txtOcupacionActionPerformed

    private void cboNivelEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelEstudioActionPerformed
        cboNivelEstudio.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtLugarNacimiento.requestFocus();
            }
        });
    }//GEN-LAST:event_cboNivelEstudioActionPerformed

    private void cboAutorizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAutorizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAutorizaActionPerformed
    private void ReImp() {
        if (!txtImp.getText().isEmpty()) {
            print(Integer.valueOf(txtImp.getText()));
        } else {
            oFunc.SubSistemaMensajeError("Ingresar numero ");
        }
    }
    private void print(Integer cod){
           
    Map parameters = new HashMap(); 
    parameters.put("Norden",cod);             

      try 
    {   String direccionReporte;
         if(chkMenor5.isSelected()){
                direccionReporte = System.getProperty("user.dir")
                    + "/reportes/HistoriaClinicaNiños.jasper";
            }else if(chkAdolescente.isSelected()){
                direccionReporte = System.getProperty("user.dir")
                    + "/reportes/HistoriaClinicaAdolecente.jasper";
            }else if(chkAdulto.isSelected()){
                direccionReporte = System.getProperty("user.dir")
                    + "/reportes/HistoriaClinicaAdulto.jasper";
            }else if(chkAdultoM.isSelected()){
                direccionReporte = System.getProperty("user.dir")
                    + "/reportes/HistoriaClinicaAdultoMayor.jasper";
            }else{
                direccionReporte = System.getProperty("user.dir")
                    + "/reportes/HistoriaClinicaAsistencial.jasper";
            }
        
        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
        JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
        JasperViewer viewer = new JasperViewer(myPrint, false);
        viewer.setTitle("Ficha Audiologica");
        //viewer.setAlwaysOnTop(true);
        viewer.setVisible(true);
     } catch (JRException ex) {
        Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
    }
            
 }

    public JTable autoResizeColWidth(JTable table, DefaultTableModel model) {
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    table.setModel(model);

    int margin = 5;

    for (int i = 0; i < table.getColumnCount(); i++) {
        int                     vColIndex = i;
        DefaultTableColumnModel colModel  = (DefaultTableColumnModel) table.getColumnModel();
        TableColumn             col       = colModel.getColumn(vColIndex);
        int                     width     = 0;

        // Get width of column header
        TableCellRenderer renderer = col.getHeaderRenderer();

        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }

        Component comp = renderer.getTableCellRendererComponent(table, col.getHeaderValue(), false, false, 0, 0);

        width = comp.getPreferredSize().width;

        // Get maximum width of column data
        for (int r = 0; r < table.getRowCount(); r++) {
            renderer = table.getCellRenderer(r, vColIndex);
            comp     = renderer.getTableCellRendererComponent(table, table.getValueAt(r, vColIndex), false, false,
                    r, vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }
        // Add margin
        width += 2 * margin;

        // Set the width
        col.setPreferredWidth(width);
    }
    ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.LEFT);
    // table.setAutoCreateRowSorter(true);
    table.getTableHeader().setReorderingAllowed(false);

    return table;
} 
    private void ReporteFechas(Date date1, Date date2){

                Map parameters = new HashMap(); 
                parameters.put("Fecha1",date1);             
                parameters.put("Fecha2",date2);

                try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ReporteFechasTicket.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Ficha 'Reporte por Fechas'");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
  
   private void grabarAsistencial(){
       if (!txtDni.getText().isEmpty()) {
             String strSqlStmt;
                String Query;
                strSqlStmt = "Insert INTO datos_paciente_asistencial (";
                Query = "Values('";
                if (txtDni.getText().trim().length() >= 1) {
                    strSqlStmt += "cod_pa";
                    Query += txtDni.getText() + "'";
                }
                if (txtNombres.getText().trim().length() > 1) {
                    strSqlStmt += ",nombres_pa";
                    Query += ",'" + txtNombres.getText() + "'";
                }
                if (txtApellidos.getText().trim().length() > 1) {
                    strSqlStmt += ",apellidos_pa";
                    Query += ",'" + txtApellidos.getText()+ "'";
                }
                if (cboSexo.getSelectedIndex() >= 0) {

                    strSqlStmt += ",sexo_pa";
                    Query += ",'" + cboSexo.getSelectedItem().toString() + "'";
                }
                if (cboEstadoCivil.getSelectedIndex() >= 0) {
                    strSqlStmt += ",estado_civil_pa";
                    Query += ",'" + cboEstadoCivil.getSelectedItem().toString() + "'";
                }
                if (txtDireccion.getText().trim().length() > 1) {
                    strSqlStmt += ",direccion_pa";
                    Query += ",'" + txtDireccion.getText() + "'";
                }
                
                if (txtCelular.getText().trim().length() > 1) {
                    strSqlStmt += ",cel_pa";
                    Query += ",'" + txtCelular.getText() + "'";
                }
                if (lblFecha.getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro_pa";
                    Query += ",'" + lblFecha.getText()+ "'";
                }
                if (lblFecha.getText().trim().length() > 1) {
                    strSqlStmt += ",hora_registro_pa";
                    Query += ",'" + lblHora.getText() + "'";
                }
                 if (txtNumHcl.getText().trim().length() >= 1) {
                    strSqlStmt += ",n_hcl";
                    Query += ",'" + txtNumHcl.getText() + "'";
                }
                strSqlStmt += ",fecha_nac";
                Query += ",'" + FechaNac.getDate() + "'";
                if (rbSD.isSelected()) {
                    strSqlStmt += ",cod_sindni";
                    Query += ",'" +txtDni.getText() + "'";
                }
                if (txtLugarNacimiento.getText().trim().length() >= 1) {
                    strSqlStmt += ",lug_nac";
                    Query += ",'" +txtLugarNacimiento.getText() + "'";
                }
                if (txtDepartamento.getText().trim().length() >= 1) {
                    strSqlStmt += ",departamento";
                    Query += ",'" +txtDepartamento.getText() + "'";
                }
                if (txtProvincia.getText().trim().length() >= 1) {
                    strSqlStmt += ",provincia";
                    Query += ",'" +txtProvincia.getText() + "'";
                }
                if (txtDistrito.getText().trim().length() >= 1) {
                    strSqlStmt += ",distrito";
                    Query += ",'" +txtDistrito.getText() + "'";
                }
                if (cboNivelEstudio.getSelectedIndex() >= 0) {
                    strSqlStmt += ",nivel_est_pa";
                    Query += ",'" + cboNivelEstudio.getSelectedItem().toString() + "'";
                }
                if (txtOcupacion.getText().trim().length() >= 1) {
                    strSqlStmt += ",ocupacion_pa";
                    Query += ",'" +txtOcupacion.getText()+ "'";
                }
System.out.println(strSqlStmt.concat(") ") + Query.concat(") RETURNING id_datos"));
             // oFunc.SubSistemaMensajeInformacion(strSqlStmt.concat(") ") + Query.concat(")"));  
                if (oConn1.FnBoolQueryExecute(strSqlStmt.concat(") ") + Query.concat(") RETURNING id_datos"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                 try {
                     //Limpiar();
                     oConn1.setResult.next();
                    foranea=oConn1.setResult.getString("id_datos");
                    System.out.println("foranea es: "+foranea);
//                    insertarCita();
                    CargarId();
                    txtBusDni.setText(txtDni.getText());
                    txtBusDni.requestFocus();
                 } catch (SQLException ex) {
                     Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                 }
                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
           try {
               oConn1.sqlStmt.close();
               oConn1.setResult.close();
           } catch (SQLException ex) {
               Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
           }
                
            

        }
  }
   public void actualizarAsistencial(){
       try {
            String sCodigo=txtDni.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE datos_paciente_asistencial\n" +
                    "   SET nombres_pa='"+txtNombres.getText()+"', sexo_pa='"+cboSexo.getSelectedItem().toString()+"',"
                    + " estado_civil_pa='"+cboEstadoCivil.getSelectedItem().toString()+"', direccion_pa='"+txtDireccion.getText()+"', \n"
                    + " cel_pa='"+txtCelular.getText()+"',"
                    + " apellidos_pa='"+txtApellidos.getText()+"',"
                    + " fecha_nac='"+FechaNac.getDate()+"',"
                    + " lug_nac='"+txtLugarNacimiento.getText()+"',"
                    + " departamento='"+txtDepartamento.getText()+"',"
                    + " provincia='"+txtProvincia.getText()+"',"
                    + " distrito='"+txtDistrito.getText()+"',"
                    + " nivel_est_pa='"+cboNivelEstudio.getSelectedItem()+"',"
                    + " ocupacion_pa='"+txtOcupacion.getText()+"'\n"
                    + " WHERE cod_pa='" + sCodigo + "'";
            
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                txtBusDni.setText(txtDni.getText());
                txtBusDni.requestFocus();
//                    oConn1.sqlStmt.close();
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
            oConn1.sqlStmt.close();
            oConn1.setResult.close();
        } catch (SQLException ex) {
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

  
 private void Limpiar(){
     txtNombres.setText("");
     txtApellidos.setText("");
//     cboSexo.setSelectedIndex(-1);
     txtDireccion.setText("");
     txtCelular.setText("");
//     cboEstadoCivil.setSelectedIndex(-1);
     FechaNac.setDate(null);
     txtLugarNacimiento.setText(null);
     txtDepartamento.setText(null);
     txtProvincia.setText(null);
     txtDistrito.setText(null);
     txtOcupacion.setText(null);
     txtDni.setText(null);
     desabilitar(false);
     txtNumHcl.setText("");
     txtDni.setEnabled(true);
     txtDni.requestFocus();
 }
 private void LimpiarTicket(){
     txtBusDni.setText("");
     txtBuNombres.setText("");
     cboServicios.setSelectedIndex(-1);
     txtDoctor.setText("");
     txtEmpresa.setText("");
     cboModoPago.setSelectedIndex(-1);
     txtNumHcl1.setText("");
     txtdescuento.setText("S/.00.00");
     txtTotal.setText("S/.00.00");
    cboDescuento.setSelectedIndex(0);
    txtCodServicio.setText(null);
    txtPrecioT.setText(null);
    txtUnidad.setText(null);
    txtBusDni.setEnabled(true);
     txtBusDni.requestFocus();
     sbTicket();
     bgFichas.clearSelection();
     cboAutoriza.setSelectedIndex(-1);
     txtCodVendedor.setText(null);
 }
 private void desabilitar(boolean r){
     txtNombres.setEnabled(r);
     txtApellidos.setEnabled(r);
     cboSexo.setEnabled(r);
     txtDireccion.setEnabled(r);
     FechaNac.setEnabled(r);
     txtCelular.setEnabled(r);
     cboEstadoCivil.setEnabled(r);
     FechaNac.setEnabled(r);
     txtLugarNacimiento.setEnabled(r);
     txtDepartamento.setEnabled(r);
     txtProvincia.setEnabled(r);
     txtDistrito.setEnabled(r);
     cboNivelEstudio.setEnabled(r);
     txtOcupacion.setEnabled(r);
//     txtDni.setEnabled(true);
 }
 
 void cargarDatos(JTextField cod){
    try{
    if (!txtDni.getText().isEmpty()) {
        
            String oSql = "SELECT nombres_pa,apellidos_pa, sexo_pa, estado_civil_pa, direccion_pa, cel_pa, \n"
                    + "n_hcl, fecha_nac,lug_nac, departamento, provincia, distrito,nivel_est_pa,ocupacion_pa "
                    + " FROM datos_paciente_asistencial where cod_pa = '" + cod.getText()+ "' LIMIT 1";

            oConn1.FnBoolQueryExecute(oSql);
            try {
                if (oConn1.setResult.next()) {
                    desabilitar(false);
                    btnGuardar.setEnabled(false);
                
                    txtNombres.setText(oConn1.setResult.getString("nombres_pa"));
                    txtApellidos.setText(oConn1.setResult.getString("apellidos_pa"));
                    cboSexo.setSelectedItem(oConn1.setResult.getString("sexo_pa"));
                    cboEstadoCivil.setSelectedItem(oConn1.setResult.getString("estado_civil_pa"));
                    txtDireccion.setText(oConn1.setResult.getString("direccion_pa"));
                    txtCelular.setText(oConn1.setResult.getString("cel_pa"));
                    txtNumHcl.setText(oConn1.setResult.getString("n_hcl"));
                    FechaNac.setDate(oConn1.setResult.getDate("fecha_nac"));
                    txtLugarNacimiento.setText(oConn1.setResult.getString("lug_nac"));
                    txtDepartamento.setText(oConn1.setResult.getString("departamento"));
                    txtProvincia.setText(oConn1.setResult.getString("provincia"));
                    txtDistrito.setText(oConn1.setResult.getString("distrito"));
                    cboNivelEstudio.setSelectedItem(oConn1.setResult.getString("nivel_est_pa"));
                    txtOcupacion.setText(oConn1.setResult.getString("ocupacion_pa"));
                    CargarServicios();
//                    txtNombre.setEditable(false);
                    

                }else{
                    desabilitar(true);
                    CargarNumHistoria();
                    txtNombres.requestFocus();
                    btnGuardar.setEnabled(true);
                }
                
                
                
                oConn1.setResult.close();
                    oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
            }
    }
    oConn1.setResult.close();
    oConn1.sqlStmt.close();
    }catch(SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage().toString());
    }
}

 public boolean OrdenExiste(){
        // Para devolver el resultado
        boolean bResultado=false;
        // Para el Query
        String sQuery="";
        // Prepara el Query
           sQuery  = "Select * from datos_paciente_asistencial Where cod_pa="+txtDni.getText(); 
        
        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn1.setResult.next())
            {
                // Resultado
                bResultado = true;
                LimpiarTicket();
            }
            // Cierro los Resultados
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
            
        } catch (SQLException ex) {
         
        }
        // Retorna el Resultado
        return bResultado;
    }
    public boolean OrdenExiste1(){
        // Para devolver el resultado
        boolean bResultado=false;
        // Para el Query
        String sQuery="";
        // Prepara el Query
           sQuery  = "Select * from datos_paciente_asistencial Where cod_pa="+txtDni.getText(); 
        
        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn1.setResult.next())
            {
                // Resultado
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNumero.setText(null);
//             txtNumero.requestFocus();
            }
            // Cierro los Resultados
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
            
        } catch (SQLException ex) {
         
        }
        // Retorna el Resultado
        return bResultado;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private com.toedter.calendar.JDateChooser Fecha3;
    private com.toedter.calendar.JDateChooser Fecha4;
    private com.toedter.calendar.JDateChooser FechaNac;
    private javax.swing.ButtonGroup bgFichas;
    private javax.swing.ButtonGroup bgTpoDoc;
    private javax.swing.ButtonGroup btgBusDoc;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirFicha;
    private javax.swing.JButton btnImprimirTicket;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnReporteFechas;
    private javax.swing.JComboBox<String> cboAutoriza;
    private javax.swing.JComboBox cboDescuento;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox<String> cboModoPago;
    private javax.swing.JComboBox cboNivelEstudio;
    private javax.swing.JComboBox cboServicios;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JCheckBox chkAdolescente;
    private javax.swing.JCheckBox chkAdulto;
    private javax.swing.JCheckBox chkAdultoM;
    private javax.swing.JCheckBox chkMenor5;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtReporte;
    private javax.swing.JTabbedPane jtcomprobantes;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JPopupMenu pmTicket;
    private javax.swing.JRadioButton rbBusDni;
    private javax.swing.JRadioButton rbBusHistoria;
    private javax.swing.JRadioButton rbBusSD;
    private javax.swing.JRadioButton rbSD;
    private javax.swing.JTable tbTicket;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuNombres;
    private javax.swing.JTextField txtBusDni;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodServicio;
    private javax.swing.JTextField txtCodVendedor;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFechaTicket;
    private javax.swing.JTextField txtHoraTicket;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JLabel txtNroTicket;
    private javax.swing.JLabel txtNumHcl;
    private javax.swing.JLabel txtNumHcl1;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtdescuento;
    // End of variables declaration//GEN-END:variables
    private void pServicios(){
      if(cboServicios.getSelectedIndex() >= 0){
               String Consulta;
               Consulta = "SELECT cod_servicio, precio,unidad FROM servicios_generales WHERE descripcion  ='"+cboServicios.getSelectedItem().toString()+"' limit 1";
             
               oConn1.FnBoolQueryExecute(Consulta);
               
               try 
                {
                 if (oConn1.setResult.next())
                 {       
                         txtCodServicio.setText(oConn1.setResult.getString("cod_servicio"));           
                         txtPrecioT.setText(oConn1.setResult.getString("precio"));  
                         txtUnidad.setText(oConn1.setResult.getString("unidad"));     
                 }
                 oConn1.setResult.close();
                 oConn1.sqlStmt.close();
                } catch (SQLException ex) 
                {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
           
           }
 } 
    private void CargarNumHistoria() {
        
        String sql = "SELECT max(n_hcl)+1 as cod from datos_paciente_asistencial";
        oConn1.FnBoolQueryExecute(sql);
        try {
            if (oConn1.setResult.next()) {
                txtNumHcl.setText(oConn1.setResult.getString("cod"));

            } else {

            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void CodSinDni() {
//        Formatter fmt = new Formatter();
        String sql = "SELECT max(cod_sindni)+1 as cod from datos_paciente_asistencial";
        int cod;
        String res="";
        oConn1.FnBoolQueryExecute(sql);
        try {
            if (oConn1.setResult.next()) {
                cod=oConn1.setResult.getInt("cod");
                res=String.format("%08d" , cod);
//                fmt.format("%07d" , cod);
                txtDni.setText(res);
            } else {

            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void numTicket() {
//        Formatter fmt = new Formatter();
        String sql = "SELECT max(n_ticket)+1 as nticket from  ticket";
        int numticket;
        String res="";
        oConn1.FnBoolQueryExecute(sql);
        try {
            if (oConn1.setResult.next()) {
                numticket=oConn1.setResult.getInt("nticket");
                res=String.format("%07d" , numticket);
//                fmt.format("%07d" , cod);
                txtNroTicket.setText(res);
            } else {

            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void CargarId() {
        
        String sql = "SELECT max(id_datos)+1 as cod from datos_paciente_asistencial";
        oConn1.FnBoolQueryExecute(sql);
        try {
            if (oConn1.setResult.next()) {
//                txtId.setText("ID: ");
//                txtId.setText(oConn.setResult.getString("cod"));

            } else {

            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void CargarServicios(){
    String Consulta;    
    Consulta = "select descripcion from servicios_generales "
             + " ORDER BY  descripcion asc ";
        if (oConn1.FnBoolQueryExecute(Consulta))
        {
            try 
            {
                while (oConn1.setResult.next())
                 {                     
                   cboServicios.addItem(oConn1.setResult.getString ("descripcion"));                     
                 }
                    oConn1.setResult.close();
                    oConn1.sqlStmt.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date HorNew = new Date();
            SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
            String FfechaSystemA = fechaforma.format(HorNew);

            GestorTime.setFfechaSystem(FfechaSystemA);

            lblHora.setText(GestorTime.getFfechaSystem());
            txtHoraTicket.setText(GestorTime.getFfechaSystem());
        }
    });
private void fecha(){
Date dateHoy = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblFecha.setText(formato.format(dateHoy));
        txtFechaTicket.setText(formato.format(dateHoy));
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
      System.out.println("el mensaje es :"+txtNroTicket.getText());
      printer(Integer.valueOf(txtNroTicket.getText()));
   }
   else
   {
      // PRESIONO NO
     }
    }

}
private void printer(Integer cod){
    System.out.print("entro a imprimir");
     Map parameters = new HashMap();
        parameters.put("Norden", cod);
        try {
            String master;
           
            master = System.getProperty("user.dir")
                    + "/reportes/HistoriaClinicaAsistencial.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del registro asistencial.");
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

    private void bNombre(JTextField cod) {
        String oSql = "select cod_pa, n_hcl from datos_paciente_asistencial where CONCAT(nombres_pa,' ',apellidos_pa) = '" + cod.getText() + "'";
        oConn1.FnBoolQueryExecute(oSql);
        try {
            if (oConn1.setResult.next()) {
                
                txtBusDni.setText(oConn1.setResult.getString("cod_pa"));
                txtNumHcl1.setText(oConn1.setResult.getString("n_hcl"));
                CargarServicios();
                txtBusDni.setEditable(false);
                cboModoPago.setSelectedIndex(0);
                cboServicios.setSelectedIndex(-1);
                txtDoctor.requestFocus();
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Ticket: " + ex.getMessage());
        }
    }
    // ticket
    private boolean ServicioExiste() {
        // Variables para Fila y Columns
        int fil;
        String sDato;
        String sDscto;
        String sPrecio;
        String sCantidad;

        boolean bResult = false;
        int iProductos;

        // if(value.lastIndexOf(cboServicios.getSelectedItem().toString())>=0)
        sDato = txtCodServicio.getText();
        sDscto = cboDescuento.getSelectedItem().toString();
        if (!sDato.isEmpty()) {

            // Ciclo para buscar en la Venta
            for (fil = 0; fil < tbTicket.getRowCount(); fil++) {
                //Obtiene dato contenido en una celda de la tabla
                String value = (String) tbTicket.getValueAt(fil, 0);
                String des = (String) tbTicket.getValueAt(fil, 5);

                // lo pasa a Mayúsculas
                value = value.toUpperCase();
                des = des.toUpperCase();
                // verifico si encuentra el dato
                if (value.lastIndexOf(sDato) >= 0 && des.lastIndexOf(sDscto) >= 0) {
                    sCantidad = tbTicket.getModel().getValueAt(fil, 1).toString();
                    sPrecio = tbTicket.getModel().getValueAt(fil, 4).toString();

                    iProductos = Integer.valueOf(sCantidad) + 1;
                    tbTicket.getModel().setValueAt(iProductos, fil, 1);
                    // oFunc.SubSistemaMensajeInformacion(sPrecio);
                    Double Total = (iProductos * oFunc.Sol(sPrecio)) / oFunc.num(cboDescuento);
                    // oFunc.SubSistemaMensajeInformacion(String.valueOf(Total));

                    tbTicket.getModel().setValueAt(oFunc.convertir(Total), fil, 6);
                    // Productos
                    //oFunc.SubSistemaMensajeInformacion(formateador.format(Total));
                    // lblTotal.setText(formateador.format(Total));
                    bResult = true;

                }

            }

        }
        return bResult;
    }

    public void sbServicioAgrega() {

        double decPrecio;

        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();

        // Prepara los datos vacios iniciales
        Object[] oFila = new Object[7];

        // Para el Query
        String sQuery;

        // Valida que haya algo en el Codigo
        if (!txtCodServicio.getText().trim().isEmpty()) {
            // Prepara el Query
            sQuery = "select cod_servicio,descripcion,precio::money::numeric ,unidad from servicios_generales where cod_servicio ='" + txtCodServicio.getText() + "'";

            //Ejecuta el Query
            oConn1.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {
                if (oConn1.setResult.next()) {
                    oFila[0] = oConn1.setResult.getString("cod_servicio");
                    oFila[1] = "1";
                    oFila[2] = oConn1.setResult.getString("unidad");
                    oFila[3] = oConn1.setResult.getString("descripcion");
                    // oFila[4]=oFunc.convertir(Double.valueOf(txtPrecioT.getText().toString()));
                    // oFila[4]=oFunc.convertir(Double.valueOf(txtPrecioT.getText().toString()));  

                    // System.out.println("el mensaje es en fila 4 con txt"+oFila[4]);
                    //oFila[4]=oFunc.convertir(Double.valueOf(oConn.setResult.getString("precio")));
                    // 
                    oFila[4] = txtPrecioT.getText();
                    System.out.println("el mensaje es en fila 4 con txt " + oFila[4]);
                    oFila[5] = cboDescuento.getSelectedItem().toString();

                    decPrecio = oConn1.setResult.getDouble("precio");
                    System.out.println("el dec precio " + decPrecio);
                    // decPrecio =Double.valueOf(txtPrecioT.getText().toString());
                    //  System.out.println("el dec precio "+decPrecio);

                    Double Total = decPrecio / oFunc.num(cboDescuento);
                    oFila[6] = oFunc.convertir(Total);
                    System.out.println("el mensaje es en fila 6 con txt" + oFila[6]);

                    tblDatos.insertRow(0, oFila);
                    tbTicket.setModel(tblDatos);
                    txtTotal.setText(oFunc.convertir(Total));
                } else {
                    oFunc.SubSistemaMensajeError("No se agrego correctamente");
                }
                // Cierro los Resultados
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("Boleta de venta:" + ex.getMessage().toString());
            }
        }

    }

    public void sumar() {
        //if(!lblTotal.getText().equals("S/.00.00")){
        if (tbTicket.getRowCount() >= 1) {

            double total = 0;
            double subtotal;
            for (int i = 0; i < ticket.getRowCount(); i++) {

                String sCantidad = tbTicket.getModel().getValueAt(i, 1).toString();
                String sPrecio = tbTicket.getModel().getValueAt(i, 4).toString();
                String sDscto = tbTicket.getModel().getValueAt(i, 5).toString();
                //Double Total = (Double.valueOf(sCantidad) * oFunc.Sol(sPrecio))/oFunc.numtext(sDscto);
                Double Total = (Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio)) - (Double.valueOf(sCantidad) * oFunc.SolAll(sPrecio)) * oFunc.numtext(sDscto);

                tbTicket.getModel().setValueAt(oFunc.convertir(Total), i, 6);
                subtotal = Double.valueOf(oFunc.Soles(ticket.getValueAt(i, 6).toString()));
                total += subtotal;

            }
            txtTotal.setText(oFunc.convertir(total));
            //   }

        }
    }
    private void sbTicket() {
        // Declaro un modelo de datos
        ticket = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                if (columnIndex == 1) {
                    return true;
                } else {
                    return false;
                }
            }

        };
        ticket.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() == 1) {
                    sumar();
                }
            }
        });
        // Añadimos columnas al modelo de datos
        ticket.addColumn("Cod");
        ticket.addColumn("Cant");
        ticket.addColumn("Unidad");
        ticket.addColumn("Descripción");
        ticket.addColumn("P.Unitario");
        ticket.addColumn("Dscto");
        ticket.addColumn("Total");

        // Coloca el Modelo en la Tabla
        tbTicket.setModel(ticket);

        // Directamente
        tbTicket.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(1).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbTicket.getColumnModel().getColumn(3).setPreferredWidth(220);
        tbTicket.getColumnModel().getColumn(4).setPreferredWidth(30);
        tbTicket.getColumnModel().getColumn(5).setPreferredWidth(2);
        tbTicket.getColumnModel().getColumn(6).setPreferredWidth(55);
        tbTicket.getTableHeader().setReorderingAllowed(false);
        tbTicket.getTableHeader().setResizingAllowed(false);

        // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();

        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);

        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbTicket.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(5).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(6).setCellRenderer(cellAlinear);

    }
     private boolean oTicketDetalle() {
        // Para los resultados
        boolean bResult = false;
        // Para la sentencia Sql
        String insert;
        String values;
        try{
        // Query para actualizar el Folio
        insert = "INSERT INTO ticket(f_ticket, h_ticket, cod_pa,nom_medico,total ,n_ticket,descuento,operador,modo_pago,empresa,cod_vendedor,autoriza)";
        values = "VALUES ('" + txtFechaTicket.getText() + "','" + txtHoraTicket.getText()+ "','"
                + txtBusDni.getText() + "','" + txtDoctor.getText()+ "','"
                + txtTotal.getText() + "','" + txtNroTicket.getText() + "','"
                + txtdescuento.getText()+ "','" + txtOperador.getText() + "','"
                + cboModoPago.getSelectedItem() + "','"
                + txtEmpresa.getText() + "','"
                + txtCodVendedor.getText() + "','"
                + cboAutoriza.getSelectedItem() + "') ";
//        oFunc.SubSistemaMensajeError(insert+values);
            if (oConn1.FnBoolQueryExecuteUpdate(insert + values)) {
                bResult = true;
            }
            oConn1.sqlStmt.close();
        }catch(SQLException ex){
            Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Retorna el Valor
        return bResult;

    }

    private boolean oTicketContenido() {
        // Para los resultados
        boolean bResult = false;
        // Variable para las filas de la Tabla de Productos
        int iFila;
        // Variables para los diferentes datos
        String sCodigo, sDescripcion, sPrecioU, sPrecioT, sDescuento, sCantidad, sUnidad;
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        // Ciclo para grabar el detalle de la venta
        try {
            for (iFila = 0; iFila < tbTicket.getRowCount(); iFila++) {
                //Obtiene dato contenido en una celda de la tabla
                sCodigo = tbTicket.getModel().getValueAt(iFila, 0).toString();
                sCantidad = tbTicket.getModel().getValueAt(iFila, 1).toString();
                sUnidad = tbTicket.getModel().getValueAt(iFila, 2).toString();
                sDescripcion = tbTicket.getModel().getValueAt(iFila, 3).toString();
                sPrecioU = tbTicket.getModel().getValueAt(iFila, 4).toString();
                sDescuento = tbTicket.getModel().getValueAt(iFila, 5).toString();
                sPrecioT = tbTicket.getModel().getValueAt(iFila, 6).toString();
                // Prepara Query para grabar venta detalle
                strSqlStmt = " INSERT INTO ticket_contenido";
                strSqlStmt = strSqlStmt + "(p_cod,";
                strSqlStmt = strSqlStmt + " p_cantidad,";
                strSqlStmt = strSqlStmt + " p_unidad,";
                strSqlStmt = strSqlStmt + " p_descripcion,";
                strSqlStmt = strSqlStmt + " p_unitario,";
                strSqlStmt = strSqlStmt + " p_des,";
                strSqlStmt = strSqlStmt + " p_total,";
                strSqlStmt = strSqlStmt + " n_ticket)";
                strSqlStmt = strSqlStmt + " Values (";
                strSqlStmt = strSqlStmt + "'" + sCodigo + "'";
                strSqlStmt = strSqlStmt + ",'" + sCantidad + "'";
                strSqlStmt = strSqlStmt + ",'" + sUnidad + "'";
                strSqlStmt = strSqlStmt + ",'" + sDescripcion + "'";
                strSqlStmt = strSqlStmt + ",'" + sPrecioU + "'";
                strSqlStmt = strSqlStmt + ",'" + sDescuento + "'";
                strSqlStmt = strSqlStmt + ",'" + sPrecioT + "'";
                strSqlStmt = strSqlStmt + ",'" + txtNroTicket.getText() + "')";

                // Ejecuta la Sentencia
//            oFunc.SubSistemaMensajeError(strSqlStmt);
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                    bResult = true;

                }

            }

            // break;
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bResult;
    }
    public void generar(JTable table) {
        HSSFWorkbook libro = new HSSFWorkbook();
        HSSFSheet hoja = libro.createSheet("Reporte");
        //  HSSFRow trow = hoja.createRow((short) 0);
        // createTituloCell(libro, trow, 0, CellStyle.ALIGN_CENTER,CellStyle.VERTICAL_CENTER, "Titulo del Excel");

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de exel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        //////////
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String file = chooser.getSelectedFile().toString().concat(".xls");
            ///////////////////////
            HSSFFont fuente = libro.createFont();
            HSSFFont fuente2 = libro.createFont();
            fuente.setFontHeightInPoints((short) 8);
            fuente.setFontName(HSSFFont.FONT_ARIAL);
            fuente.setColor(IndexedColors.WHITE.getIndex());
            fuente.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
///////////
            fuente2.setFontHeightInPoints((short) 7);
            fuente2.setFontName(HSSFFont.FONT_ARIAL);
            fuente2.setColor(IndexedColors.BLACK.getIndex());

///////////////////
            HSSFCellStyle estiloCelda = libro.createCellStyle();
            HSSFCellStyle estiloCelda2 = libro.createCellStyle();

            estiloCelda.setWrapText(true);
            estiloCelda.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            estiloCelda.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
            estiloCelda.setFont(fuente);
/////////////////////
            estiloCelda2.setWrapText(true);
            estiloCelda2.setAlignment(HSSFCellStyle.ALIGN_LEFT);
            estiloCelda2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
            estiloCelda2.setFont(fuente2);
//////////////////
// También, podemos establecer bordes...
            estiloCelda.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            estiloCelda.setBottomBorderColor((short) 8);
            estiloCelda.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            estiloCelda.setLeftBorderColor((short) 8);
            estiloCelda.setBorderRight(HSSFCellStyle.BORDER_THIN);
            estiloCelda.setRightBorderColor((short) 8);
            estiloCelda.setBorderTop(HSSFCellStyle.BORDER_THIN);
            estiloCelda.setTopBorderColor((short) 8);
//////////
            estiloCelda2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            estiloCelda2.setBottomBorderColor((short) 8);
            estiloCelda2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            estiloCelda2.setLeftBorderColor((short) 8);
            estiloCelda2.setBorderRight(HSSFCellStyle.BORDER_THIN);
            estiloCelda2.setRightBorderColor((short) 8);
            estiloCelda2.setBorderTop(HSSFCellStyle.BORDER_THIN);
            estiloCelda2.setTopBorderColor((short) 8);
///////////////////////
            estiloCelda.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
            estiloCelda.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
///////////////////////////////
            // oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getColumnCount()));
            //   oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getRowCount()));

            for (int i = 0; i < table.getRowCount(); i++) {

                if (i == 0) {
                    HSSFRow fila = hoja.createRow(i);
                    for (int j = 0; j < table.getColumnCount(); j++) {

                        HSSFCell celda = fila.createCell(j);
                        celda.setCellValue(new HSSFRichTextString(table.getColumnModel().getColumn(j).getHeaderValue().toString().toUpperCase()));
                        celda.setCellStyle(estiloCelda);


                    }
                } //else {
                HSSFRow fila = hoja.createRow(i + 1);
                for (int j = 0; j < table.getColumnCount(); j++) {
                    HSSFCell celda = fila.createCell(j);

                    if (table.getValueAt(i, j) != null) {

                        celda.setCellValue(new HSSFRichTextString(table.getValueAt(i, j).toString()));
                        hoja.autoSizeColumn(j);
                        celda.setCellStyle(estiloCelda2);
                        // }
                    }

                }
                try {
                    try (FileOutputStream elFichero = new FileOutputStream(file)) {
                        libro.write(elFichero);
                    }
                } catch (IOException e) {
                }
            }
            oFunc.SubSistemaMensajeInformacion("REPORTE COMPLETO");
        }
    }
    void sbReporteAtenciones(){
        try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql = "SELECT to_char(t.n_ticket,'0000000')AS numero,nombres_pa ||' '|| apellidos_pa as nombres,t.empresa,t.nom_medico,t.modo_pago,t.f_ticket, string_agg(tc.p_descripcion, ' - ')as descripcion,\n"
                    + "       string_agg(cast(tc.p_unitario as varchar), ' - ')as detprecioXservicio,\n"
                    + "       cast(sum(tc.p_unitario)as varchar)as totalreal,\n"
                    + "       cast((sum(tc.p_unitario)-sum(tc.p_total/tc.p_cantidad)) as varchar) as descuento,\n"
                    + "       cast(sum(tc.p_total)as varchar)as subtotal,\n"
                    + "       cast((sum(tc.p_unitario)-sum(tc.p_total/tc.p_cantidad)+t.descuento) as varchar) as descadicional,t.total::varchar\n"
                    + "FROM datos_paciente_asistencial  d\n"
                    + "INNER JOIN ticket  t ON (d.cod_pa=t.cod_pa)\n"
                    + "INNER JOIN ticket_contenido tc ON(t.n_ticket=tc.n_ticket)\n"
                    + "WHERE ";
            if (((JTextField) Fecha1.getDateEditor().getUiComponent()).getText().trim().length() > 2) {
                vSql += " t.f_ticket >= '" + Fecha1.getDate().toString() + "'";
            }
            if (((JTextField) Fecha2.getDateEditor().getUiComponent()).getText().trim().length() > 2) {
                vSql += " AND t.f_ticket <= '" + Fecha2.getDate().toString() + "'";
            }
            vSql += " group by t.n_ticket,nombres_pa,t.nom_medico, nombres,modo_pago,t.f_ticket,t.descuento,t.total,t.empresa"
                    + " order by numero";                     //oFunc.SubSistemaMensajeInformacion(vSql);
                if (oConn1.FnBoolQueryExecute(vSql)) {
                    try {
                        java.sql.ResultSetMetaData rsmt = oConn1.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn1.setResult.next()) {
                            Object[] Fila = new Object[CantidaColumnas];
                            for (int i = 0; i < CantidaColumnas; i++) {
                                Fila[i] = oConn1.setResult.getObject(i + 1);
                            }
                            model.addRow(Fila);
                        }
                        
                        jtReporte = autoResizeColWidth(jtReporte, model);
                        
                        jtReporte.setModel(model);
                        
//                        
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegistroAsistencial.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    void sbImprimeTicket() {
        if (tbTicket.getRowCount() >= 0) {
            int iFila;
            SimpleDateFormat formato = new SimpleDateFormat("dd / MM / yyyy");
            SimpleDateFormat FechaCancelacion = new SimpleDateFormat("dd        MM             yy");
            ESCPrinter escp = new ESCPrinter("\\\\CAJA\\epson", false); //create ESCPrinter on network location \\computer\sharename, 9pin printer
            if (escp.initialize()) {
                escp.setCharacterSet(ESCPrinter.USA);
                escp.select15CPI();//15 characters per inch printing
                //NroFactura
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.bold(true);
                escp.print("CENTRO MEDICO - HORIZONTE MEDIC S.A.C.");
                //Nro Ticket
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(10);
                escp.print("Nro : " + txtNroTicket.getText().toString());
                //Dirección
                escp.advanceVertical(1); //go down 5cm
                escp.setAbsoluteHorizontalPosition(5);
                escp.print("Jr. Leoncio Prado #786 - Huamachuco ");
                //Teléfono            
                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(5);
                escp.print("Tel: 044 - 652832 / #989603777");
                escp.bold(false);
                //DATOS
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(6);
                escp.print("FECHA : " + txtFechaTicket.getText().toString());
                if (!txtHoraTicket.getText().isEmpty()) {
                    escp.print("  HORA : " + txtHoraTicket.getText().toString());
                }
                if (!txtNumHcl.getText().isEmpty()) {
                    escp.print("  HCL : " + txtNumHcl.getText().toString());
                }
//                escp.print("  HCL : "+ hcl.toString());
                //Cliente
                escp.advanceVertical(2);
                escp.setAbsoluteHorizontalPosition(5);
                escp.print("PACIENTE : " + txtBuNombres.getText().toString());
                //DNI
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(6);
                escp.print("DNI : " + txtBusDni.getText().toString());
                //Medico

                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(8);
                if (!txtDoctor.getText().isEmpty()) {
                    escp.print("MEDICO : " + txtDoctor.getText().toString());
                } else {
                    escp.print("MEDICO : -");
                }

                escp.advanceVertical(2);
                escp.setAbsoluteHorizontalPosition(3);
                escp.print("--------------------------------------------------------------------------------------------------------");
                //
                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(3);
                escp.print("|");
                //*************************************
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.print("CODIGO");
                //
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(1);
                escp.print("   CANT.");
                //
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(2);
                escp.print("  UNI.");
                //
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(3);
                escp.print("           DESCRIPCION");
                //
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(9);
                escp.print("P.UNIT.");
                //
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(10);
                escp.print("  DSCNTO");
                //
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(11);
                escp.print("   P.TOTAL.");

                //***************************************
                escp.advanceVertical(0);
                escp.setAbsoluteHorizontalPosition(3);
                escp.print("                                                                                                       |");

                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(3);
                escp.print("--------------------------------------------------------------------------------------------------------");
                //
                for (iFila = 0; iFila < tbTicket.getRowCount(); iFila++) {
                    //Codigo
                    escp.advanceVertical(1);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.print(tbTicket.getValueAt(iFila, 0).toString());
                    //Cantidad
                    escp.advanceVertical(0);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.horizontalTab(1);
                    escp.print("   " + tbTicket.getValueAt(iFila, 1).toString());
                    //Unidad
                    escp.advanceVertical(0);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.horizontalTab(2);
                    escp.print("  " + tbTicket.getValueAt(iFila, 2).toString());
                    //Descripción
                    escp.advanceVertical(0);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.horizontalTab(3);
                    escp.print(" " + tbTicket.getValueAt(iFila, 3).toString());
                    //Precio Unitario
                    escp.advanceVertical(0);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.horizontalTab(9);
                    escp.print(oFunc.SolImp(tbTicket.getValueAt(iFila, 4).toString()));
                    //Precio Dscto
                    escp.advanceVertical(0);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.horizontalTab(10);
                    escp.print("  " + tbTicket.getValueAt(iFila, 5).toString());
                    //Precio Total
                    escp.advanceVertical(0);
                    escp.setAbsoluteHorizontalPosition(5);
                    escp.horizontalTab(11);
                    escp.print("   " + oFunc.SolImp(tbTicket.getValueAt(iFila, 6).toString()));

                }
                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(3);
                escp.print("--------------------------------------------------------------------------------------------------------");
                //descuento
                escp.bold(true);
                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(10);
                escp.print("DESCUENTO : " + txtdescuento.getText().toString());
                //TOTAL
                escp.bold(true);
                escp.advanceVertical(1);
                escp.setAbsoluteHorizontalPosition(5);
                escp.horizontalTab(10);
                escp.print("TOTAL : " + txtTotal.getText().toString());
                //mensaje
                escp.advanceVertical(2);
                escp.setAbsoluteHorizontalPosition(5);
                escp.print("ATENDIDO POR :  " + txtOperador.getText().toString());
                escp.bold(false);

                escp.advanceVertical(3);
                escp.setAbsoluteHorizontalPosition(5);
                escp.print("Si desea acérquese a cajear por boleta.");
                escp.bold(false);
                //escp.formFeed(); //eject paper
                escp.close(); //close stream
            } else {
                System.out.println("No se ha podido abrir la secuencia para impresora");
            }
        } else {
            oFunc.SubSistemaMensajeError("No se puede Crear Factura no hay Servicio Agregado");
        }
    }

  
    
}

