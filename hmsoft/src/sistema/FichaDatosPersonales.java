package sistema;

import Caja.*;
import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import autocomplete.ajTextField;
import autocomplete.ajTextFieldConsulta;
import autocomplete.ajTextFieldInteger;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import net.sf.jasperreports.engine.JasperPrintManager;
//import org.apache.axis.AxisProperties;

/**
 *
 * @author Richard García Zárate
 */
public final class FichaDatosPersonales extends javax.swing.JInternalFrame {

    clsFunciones oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
    String dni;
    DefaultTableModel model;
    Integer num= null;
    public FichaDatosPersonales() {
        initComponents();
        sbCargarDatosFam();
        sbCargarInstruccionAdquirida();
        sbCargarExperienciaLaboral();
        sbCargarReferenciasPersonales();
    }

    

   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        btGS = new javax.swing.ButtonGroup();
        bgFS = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pmCF = new javax.swing.JPopupMenu();
        btnEliminarCF = new javax.swing.JMenuItem();
        pmIA = new javax.swing.JPopupMenu();
        btnEliminarIA = new javax.swing.JMenuItem();
        pmEL = new javax.swing.JPopupMenu();
        btnEliminarEL = new javax.swing.JMenuItem();
        pmRP = new javax.swing.JPopupMenu();
        btnEliminarRP = new javax.swing.JMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        rbEmpleado = new javax.swing.JRadioButton();
        rbObrero = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCodAct = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtCodigoDep = new javax.swing.JTextField();
        txtZona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLicenciaC = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLmilitar = new javax.swing.JTextField();
        txtAfp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCussp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAutogenerado = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        txtReferenciaDom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        rbPropia = new javax.swing.JRadioButton();
        rbAlquilada = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtCFNombres = new javax.swing.JTextField();
        rbCFSi = new javax.swing.JRadioButton();
        rbCFNo = new javax.swing.JRadioButton();
        cboParentesco = new javax.swing.JComboBox<>();
        txtCFEdad = new javax.swing.JTextField();
        txtCF_Dni = new javax.swing.JTextField();
        txtCF_GradoInst = new javax.swing.JTextField();
        txtCF_Autogenerado = new javax.swing.JTextField();
        btnCF_Agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCompFamiliar = new javax.swing.JTable();
        txtCF_fechanac = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtEmeNombres = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtEmeParentesco = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtEmeDomicilio = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtEmeTelefono = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtEmeOtraRef = new javax.swing.JTextField();
        FechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel46 = new javax.swing.JLabel();
        txtDistrito1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtProvincia1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtDepartamento1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtEL_Telefono = new javax.swing.JTextField();
        txtMotivoSalida = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbExperienciaLaboral = new javax.swing.JTable();
        txtEL_Empresa = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtEL_Cargo = new javax.swing.JTextField();
        txtEL_FechaInicio = new javax.swing.JTextField();
        txtEL_FechaTermino = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtIA_CentroEst = new javax.swing.JTextField();
        cboInstAdq = new javax.swing.JComboBox<>();
        txtIAGradoObt = new javax.swing.JTextField();
        btnAgregar2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tInstruccionAdq = new javax.swing.JTable();
        txtIA_Capacitacion = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txtIA_FechaTermino = new javax.swing.JTextField();
        txtIA_FechaInicio = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtViaticos = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        rbTTSi = new javax.swing.JRadioButton();
        rbTTNo = new javax.swing.JRadioButton();
        rbVSi = new javax.swing.JRadioButton();
        rbVNo = new javax.swing.JRadioButton();
        txtSistemaTrab = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        rbTASi = new javax.swing.JRadioButton();
        rbTANo = new javax.swing.JRadioButton();
        txtAlimCuenta = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtGrupoSan = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        txtRP_Nombres = new javax.swing.JTextField();
        txtRP_Direccion = new javax.swing.JTextField();
        btnAgregarRP = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbReferenciasPers = new javax.swing.JTable();
        txtRP_CentroTrab = new javax.swing.JTextField();
        txtRP_Cargo = new javax.swing.JTextField();
        txtRP_Telefono = new javax.swing.JTextField();
        btnAgregarDatos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtImp = new javax.swing.JTextField();
        btnIMP = new javax.swing.JButton();

        btnEliminarCF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminarCF.setText("Eliminar");
        btnEliminarCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCFActionPerformed(evt);
            }
        });
        pmCF.add(btnEliminarCF);

        btnEliminarIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminarIA.setText("Eliminar");
        btnEliminarIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIAActionPerformed(evt);
            }
        });
        pmIA.add(btnEliminarIA);

        btnEliminarEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminarEL.setText("Eliminar");
        btnEliminarEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarELActionPerformed(evt);
            }
        });
        pmEL.add(btnEliminarEL);

        btnEliminarRP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEliminarRP.setText("Eliminar");
        btnEliminarRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRPActionPerformed(evt);
            }
        });
        pmRP.add(btnEliminarRP);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Pacientes");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nº Orden:");

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Empresa :");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cargo  :");

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        bgTipo.add(rbEmpleado);
        rbEmpleado.setText("Empleado");

        bgTipo.add(rbObrero);
        rbObrero.setText("Obrero");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Fecha de Ingreso:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Codigo Actividad:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Código DPTO:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Zona :");

        txtCodAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActActionPerformed(evt);
            }
        });

        jLabel14.setText("Apellidos:");

        jLabel2.setText("Nombres :");

        txtNombres.setEnabled(false);
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.setEnabled(false);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel6.setText("F.Nacimiento:");

        FechaNacimiento.setEnabled(false);
        FechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaNacimientoPropertyChange(evt);
            }
        });

        txtCodigoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDepActionPerformed(evt);
            }
        });

        txtZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZonaActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI / C.Ext.N° :");

        jLabel16.setText("Estado Civil: ");

        txtDni.setEnabled(false);

        txtEstadoCivil.setEnabled(false);
        txtEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilActionPerformed(evt);
            }
        });

        jLabel4.setText("Lic.Conducir No.:");

        txtLicenciaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenciaCActionPerformed(evt);
            }
        });

        jLabel17.setText("L.M. No.");

        txtLmilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLmilitarActionPerformed(evt);
            }
        });

        txtAfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfpActionPerformed(evt);
            }
        });

        jLabel5.setText("AFP/SNP");

        jLabel7.setText("CUSSP No.");

        txtCussp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusspActionPerformed(evt);
            }
        });

        jLabel18.setText("Autogenerado");

        txtAutogenerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutogeneradoActionPerformed(evt);
            }
        });

        txtEstatura.setEnabled(false);

        jLabel8.setText("Estatura");

        jLabel9.setText("Peso");

        txtPeso.setEnabled(false);

        txtDistrito.setEnabled(false);
        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel10.setText("Provincia");

        jLabel24.setText("Distrito");

        jLabel11.setText("Departamento");

        txtDepartamento.setEnabled(false);

        txtProvincia.setEnabled(false);

        jLabel25.setText("Direccion del Domicilio:");

        txtDomicilio.setEnabled(false);
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });

        txtReferenciaDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferenciaDomActionPerformed(evt);
            }
        });

        jLabel12.setText("Referencia Domiciliaria :");

        jLabel13.setText("Teléfono");

        txtTelefono.setEnabled(false);

        jLabel26.setText("Celular");

        txtCelular.setEnabled(false);

        jLabel27.setText("Tipo vivienda :");

        bgFS.add(rbPropia);
        rbPropia.setText("Propia");

        bgFS.add(rbAlquilada);
        rbAlquilada.setText("Alquilada");

        jLabel28.setText("E-mail");

        txtCorreo.setEnabled(false);

        jLabel29.setText("Radio Frec.");

        txtRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioActionPerformed(evt);
            }
        });

        jLabel30.setText("Número  Cuenta de Ahorro:");

        txtNumCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCuentaActionPerformed(evt);
            }
        });

        jLabel31.setText("Banco");

        txtBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Composición Familiar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel32.setText("Parentesco");

        jLabel33.setText("Apellidos y Nombres");

        jLabel34.setText("Vive?");

        jLabel35.setText("F.  Nacimiento");

        jLabel36.setText("Edad");

        jLabel37.setText("DNI/ Part. Nac.");

        jLabel38.setText("Grado. Instr.");

        jLabel39.setText("Autog.  ó Nº Essalud");

        txtCFNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCFNombresActionPerformed(evt);
            }
        });

        btGS.add(rbCFSi);
        rbCFSi.setText("SI");

        btGS.add(rbCFNo);
        rbCFNo.setText("NO");
        rbCFNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCFNoActionPerformed(evt);
            }
        });

        cboParentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Esposa", "Conviviente", "Hijo" }));

        txtCFEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCFEdadActionPerformed(evt);
            }
        });

        txtCF_Dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCF_DniActionPerformed(evt);
            }
        });

        txtCF_GradoInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCF_GradoInstActionPerformed(evt);
            }
        });

        txtCF_Autogenerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCF_AutogeneradoActionPerformed(evt);
            }
        });

        btnCF_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnCF_Agregar.setMnemonic('a');
        btnCF_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCF_AgregarActionPerformed(evt);
            }
        });

        tbCompFamiliar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCompFamiliar.setComponentPopupMenu(pmCF);
        jScrollPane2.setViewportView(tbCompFamiliar);

        txtCF_fechanac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCF_fechanacActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(cboParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(rbCFSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCFNo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCF_fechanac)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCF_Dni))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(txtCF_GradoInst, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCF_Autogenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCF_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbCFSi)
                        .addComponent(rbCFNo)
                        .addComponent(cboParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCF_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCF_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCF_GradoInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCF_Autogenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCF_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EN CASO DE EMERGENCIA NOTIFICAR A:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 0, 204))); // NOI18N

        jLabel40.setText("Apellidos y Nombres:");

        txtEmeNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmeNombresActionPerformed(evt);
            }
        });

        jLabel41.setText("Parentesco :");

        txtEmeParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmeParentescoActionPerformed(evt);
            }
        });

        jLabel42.setText("Domicilio :");

        txtEmeDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmeDomicilioActionPerformed(evt);
            }
        });

        jLabel43.setText("Teléfono :");

        txtEmeTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmeTelefonoActionPerformed(evt);
            }
        });

        jLabel44.setText("Otra Referencia :");

        txtEmeOtraRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmeOtraRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmeNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtEmeParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtEmeDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtEmeTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(txtEmeOtraRef, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmeNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmeParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmeDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmeTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmeOtraRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        FechaIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaIngresoPropertyChange(evt);
            }
        });

        jLabel46.setText("Distrito");

        txtDistrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistrito1ActionPerformed(evt);
            }
        });

        jLabel47.setText("Provincia");

        txtProvincia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvincia1ActionPerformed(evt);
            }
        });

        jLabel48.setText("Departamento");

        txtDepartamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBanco))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbPropia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbAlquilada)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCorreo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(3, 3, 3)))
                                .addGap(3, 3, 3))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLicenciaC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCussp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAfp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLmilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDistrito)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAutogenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(283, 283, 283)
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtReferenciaDom, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel26)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCelular))
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtEstatura))
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(22, 22, 22)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDomicilio))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel46)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDistrito1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtProvincia1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel48)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDepartamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(jLabel19)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtCargo))
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(jLabel15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(rbObrero)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel22))
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(rbEmpleado)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel21))))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtApellidos)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel23)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtZona, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                    .addComponent(txtCodigoDep)
                                                    .addComponent(txtCodAct))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtLmilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtAutogenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtAfp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtCussp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))
                                    .addComponent(FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbEmpleado)
                                    .addComponent(jLabel21)
                                    .addComponent(txtCodAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbObrero)
                                    .addComponent(jLabel22)
                                    .addComponent(txtCodigoDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel46)
                                        .addComponent(txtDistrito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel47)
                                        .addComponent(txtProvincia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel48)
                                        .addComponent(txtDepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtLicenciaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtReferenciaDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(rbPropia)
                                .addComponent(rbAlquilada))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(210, 210, 210))))
        );

        jTabbedPane2.addTab("Parte1", jPanel8);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Experiencia Laboral (Comenzar por último empleo)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel76.setText("Nombre de la Empresa");

        jLabel77.setText("Teléfono");

        jLabel79.setText("Fecha Inicio");

        jLabel81.setText("Fecha Término");

        jLabel83.setText("Motivo de Salida");

        txtEL_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEL_TelefonoActionPerformed(evt);
            }
        });

        txtMotivoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoSalidaActionPerformed(evt);
            }
        });

        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregar1.setMnemonic('a');
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        tbExperienciaLaboral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbExperienciaLaboral.setComponentPopupMenu(pmEL);
        jScrollPane3.setViewportView(tbExperienciaLaboral);

        txtEL_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEL_EmpresaActionPerformed(evt);
            }
        });

        jLabel88.setText("Cargo Desempeñado");

        txtEL_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEL_CargoActionPerformed(evt);
            }
        });

        txtEL_FechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEL_FechaInicioActionPerformed(evt);
            }
        });

        txtEL_FechaTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEL_FechaTerminoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(txtEL_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(txtEL_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addGap(35, 35, 35))
                            .addComponent(txtEL_Cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel79)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel81)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel83))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEL_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEL_FechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(txtMotivoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77)
                            .addComponent(jLabel79)
                            .addComponent(jLabel81)
                            .addComponent(jLabel83))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEL_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEL_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMotivoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEL_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEL_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEL_FechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instrucción Adquirida  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel78.setText("Instrucción");

        jLabel80.setText("Centro de Estudios");

        jLabel82.setText("Fecha Inicio");

        jLabel85.setText("Fecha Término");

        jLabel86.setText("Grado Obtenido");

        txtIA_CentroEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIA_CentroEstActionPerformed(evt);
            }
        });

        cboInstAdq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Tecnica", "Superior", "Otros", "Capacitacion" }));
        cboInstAdq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboInstAdqItemStateChanged(evt);
            }
        });
        cboInstAdq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboInstAdqMouseClicked(evt);
            }
        });
        cboInstAdq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboInstAdqActionPerformed(evt);
            }
        });

        txtIAGradoObt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIAGradoObtActionPerformed(evt);
            }
        });

        btnAgregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregar2.setMnemonic('a');
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        tInstruccionAdq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tInstruccionAdq.setComponentPopupMenu(pmIA);
        jScrollPane4.setViewportView(tInstruccionAdq);

        txtIA_Capacitacion.setEnabled(false);

        jLabel87.setText("Titulo Capcitación:");

        txtIA_FechaTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIA_FechaTerminoActionPerformed(evt);
            }
        });

        txtIA_FechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIA_FechaInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel78)
                                .addComponent(cboInstAdq, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel80)
                                .addComponent(txtIA_CentroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel82))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIA_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(txtIA_FechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIAGradoObt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel85)
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel86))))
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIA_Capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel80)
                    .addComponent(jLabel82)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIA_CentroEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboInstAdq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIA_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIAGradoObt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIA_FechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtIA_Capacitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Parte2", jPanel9);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condiciones Laborales, a cuenta de la Ctta.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel89.setText("Sueldo/Jornal:");

        jLabel90.setText("Transporte Terrestre:");

        jLabel93.setText("Viaticos:");

        jLabel94.setText("Sistema Trabajo :");

        jLabel95.setText("Alimentación A cta. Contrata");

        buttonGroup1.add(rbTTSi);
        rbTTSi.setText("SI");

        buttonGroup1.add(rbTTNo);
        rbTTNo.setText("NO");

        buttonGroup2.add(rbVSi);
        rbVSi.setText("SI");

        buttonGroup2.add(rbVNo);
        rbVNo.setText("NO");

        jLabel101.setText("Transporte Aéreo");

        buttonGroup3.add(rbTASi);
        rbTASi.setText("SI");

        buttonGroup3.add(rbTANo);
        rbTANo.setText("NO");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("G.Sang.");

        txtGrupoSan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(3, 3, 3)
                        .addComponent(txtGrupoSan))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSistemaTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbTASi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTANo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTTSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTTNo)))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbVSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbVNo))
                    .addComponent(jLabel95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViaticos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlimCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbVSi)
                    .addComponent(rbVNo)
                    .addComponent(jLabel93)
                    .addComponent(txtViaticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTTNo)
                    .addComponent(rbTTSi)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(txtSistemaTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTANo)
                    .addComponent(rbTASi)
                    .addComponent(jLabel101)
                    .addComponent(jLabel95)
                    .addComponent(txtAlimCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(txtGrupoSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Referencias Personales ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel96.setText("Apellidos y Nombres");

        jLabel97.setText("Centro de Trabajo");

        jLabel98.setText("Cargo");

        jLabel99.setText("Telefono");

        jLabel100.setText("Dirección");

        txtRP_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRP_NombresActionPerformed(evt);
            }
        });

        txtRP_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRP_DireccionActionPerformed(evt);
            }
        });

        btnAgregarRP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnAgregarRP.setMnemonic('a');
        btnAgregarRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRPActionPerformed(evt);
            }
        });

        tbReferenciasPers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbReferenciasPers.setComponentPopupMenu(pmRP);
        jScrollPane6.setViewportView(tbReferenciasPers);

        txtRP_CentroTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRP_CentroTrabActionPerformed(evt);
            }
        });

        txtRP_Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRP_CargoActionPerformed(evt);
            }
        });

        txtRP_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRP_TelefonoActionPerformed(evt);
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
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtRP_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRP_CentroTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel96)
                                .addGap(135, 135, 135)
                                .addComponent(jLabel97)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(txtRP_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRP_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtRP_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarRP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRP_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRP_CentroTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRP_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRP_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRP_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarRP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregarDatos.setText("Agregar");
        btnAgregarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatosActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Impirmir N° Orden"));

        txtImp.setBackground(new java.awt.Color(255, 153, 0));
        txtImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpActionPerformed(evt);
            }
        });
        txtImp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpKeyTyped(evt);
            }
        });

        btnIMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnIMP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(btnAgregarDatos)
                        .addGap(5, 5, 5)
                        .addComponent(jButton6)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6)
                    .addComponent(btnAgregarDatos)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Parte3", jPanel10);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtNorden.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated
   
    private boolean GrabarFPInfo() throws SQLException{
        boolean bResult = false;
        
            String Sql = "INSERT INTO ficha_datos_personales(\n" +
"            n_orden, fechaingreso, chkempleado, chkobrero, txtcodigo_act, \n" +
"            txtcodigo_dep, txtzona, txtdistrito, txtprovincia, txtdepartamento, \n" +
"            txtlicencia_con, txtlibrm, txtafp, txtcussp, txtautogenerado, \n" +
"            txtref_domic, chkpropia, chkalquilada, txtrad_frec, txtnumcuenta, \n" +
"            txtbanco, txtnombres_emer, txtparentesco_emer, txttelefono_emer, \n" +
"            txtdomicilio_emer, txtotrarefe, txtsueldo, txtsist_trabajo, chktansp_tsi, \n" +
"            chktranp_tno, chktrans_asi, chktrans_ano, chkviaticos_si, chkviaticos_no, \n" +
"            txtviaticos, txtalimcontrata)";//

            Sql += " Values ('" + txtNorden.getText()+ "','"+ FechaIngreso.getDate() + "','"
                    + rbEmpleado.isSelected() + "','"+ rbObrero.isSelected() + "','"
                    + txtCodAct.getText() + "','"+ txtCodigoDep.getText() + "','"
                    + txtZona.getText() + "','"+ txtDistrito1.getText()+ "','"
                    + txtProvincia1.getText() + "','"+ txtDepartamento1.getText() + "','"
                    + txtLicenciaC.getText() + "','"+ txtLmilitar.getText() + "','"
                    + txtAfp.getText() + "','"+ txtCussp.getText()+ "','"
                    + txtAutogenerado.getText()+ "','"+ txtReferenciaDom.getText() + "','"
                    + rbPropia.isSelected() + "','"+ rbAlquilada.isSelected() + "','"
                    + txtRadio.getText() + "','"+ txtNumCuenta.getText()+ "','"
                    + txtBanco.getText() + "','"+ txtEmeNombres.getText() + "','"
                    + txtEmeParentesco.getText() + "','"+ txtEmeTelefono.getText() + "','"
                    + txtEmeDomicilio.getText() + "','"+ txtEmeOtraRef.getText()+ "','"
                    + txtSueldo.getText() + "','"+ txtSistemaTrab.getText() + "','"
                    + rbTTSi.isSelected() + "','"+ rbTTNo.isSelected()+ "','"
                    + rbTASi.isSelected()+ "','"+ rbTASi.isSelected() + "','"
                    + rbVSi.isSelected() + "','"+ rbVNo.isSelected() + "','"
                    + txtViaticos.getText() + "','"+ txtAlimCuenta.getText()+"'";
                Sql += ") RETURNING cod_fd;";
            //oFunc.SubSistemaMensajeError(Sql);
            System.out.println(Sql);
            if (oConn.FnBoolQueryExecute(Sql)){
                
                   oConn.setResult.next();
                 num = Integer.valueOf(oConn.setResult.getString("cod_fd"));
                  
                   bResult = true;
                   oConn.setResult.close();
               }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
               oConn.sqlStmt.close();
                  return bResult;
                  
        }
   
    public void cerrarVentana() {
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
        try {
            if (oConn.setResult != null) {
                oConn.setResult.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FichaDatosPersonales.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
        //  System.exit(0);

    }

    public boolean OrdenExiste() {
        boolean bResultado = false;

        String sQuery;

        sQuery = "Select n_orden from ficha_datos_personales Where n_orden=" + txtNorden.getText();

        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);

        // Capturo el Error
        try {

            // Verifico que haya habido resultados
            if (oConn.setResult.next()) {
                // Resultado
                bResultado = true;
                //    oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                limpiar();
            }

            // Cierro los Resultados
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {

        }

        return bResultado;

    }
private void limpiar() {
        txtDni.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtNorden.setText("");
        txtEmpresa.setText("");
        bgTipo.clearSelection();
        txtCargo.setText("");
        FechaIngreso.setDate(null);
        txtCodAct.setText("");
        txtCodigoDep.setText("");
        txtZona.setText("");
        FechaNacimiento.setDate(null);
        txtDistrito1.setText(null);
        txtProvincia1.setText(null);
        txtDepartamento1.setText(null);
        txtDomicilio.setText(null);
        txtEstadoCivil.setText(null);
        txtLicenciaC.setText(null);
        txtLmilitar.setText(null);
        txtAfp.setText(null);
        txtCargo.setText(null);
        txtDistrito.setText(null);
        txtProvincia.setText(null);
        txtDepartamento.setText(null);
        txtAutogenerado.setText(null);
        txtEstatura.setText(null);
        txtPeso.setText(null);
        txtReferenciaDom.setText(null);
        txtTelefono.setText(null);
        txtCelular.setText(null);
        bgFS.clearSelection();
        txtCorreo.setText(null);
        txtRadio.setText(null);
        txtNumCuenta.setText(null);
        txtBanco.setText(null);
        sbCargarDatosFam();
        txtCFNombres.setText(null);
        btGS.clearSelection();
        txtCF_fechanac.setText(null);
        txtCFEdad.setText(null);
        txtCF_Dni.setText(null);
        txtCF_GradoInst.setText(null);
        txtCF_Autogenerado.setText(null);
        txtEmeNombres.setText(null);
        txtEmeParentesco.setText(null);
        txtEmeTelefono.setText(null);
        txtEmeDomicilio.setText(null);
        txtEmeOtraRef.setText(null);
        txtSueldo.setText(null);
        txtSistemaTrab.setText(null);
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        txtViaticos.setText(null);
        txtAlimCuenta.setText(null);
        txtGrupoSan.setText(null);
        sbCargarInstruccionAdquirida();
        sbCargarExperienciaLaboral();
        sbCargarReferenciasPersonales();
        txtNorden.requestFocus();
    }
    void AddCF() {
        //SimpleDateFormat formato = new SimpleDateFormat("yyyy");

        String[] registros = new String[8];
        model = (DefaultTableModel) tbCompFamiliar.getModel();
        if (!txtNorden.getText().isEmpty()) {

            registros[0] = cboParentesco.getSelectedItem().toString();
            registros[1] = txtCFNombres.getText().toString();
            if(rbCFSi.isSelected()){
              registros[2] = "SI";  
            }else if(rbCFNo.isSelected()){
                registros[2] = "NO";
            }
            registros[3] = txtCF_fechanac.getText().toString();
            registros[4] = txtCFEdad.getText().toString();
            registros[5] = txtCF_Dni.getText().toString();
            registros[6] = txtCF_GradoInst.getText().toString();
            registros[7] = txtCF_Autogenerado.getText().toString();
            model.addRow(registros);
            tbCompFamiliar.setModel(model);
        }
//        } else {
//            oFunc.SubSistemaMensajeError("Falto Llenar algo");
//
//        }

    }
    void AddIA() {
        //SimpleDateFormat formato = new SimpleDateFormat("yyyy");

        String[] registros = new String[5];
        model = (DefaultTableModel) tInstruccionAdq.getModel();
        if (!txtNorden.getText().isEmpty()) {
            if(cboInstAdq.getSelectedItem()!="Capacitacion"){
                registros[0] = cboInstAdq.getSelectedItem().toString();
            }else{
                registros[0] = txtIA_Capacitacion.getText().toString();
            }
            registros[1] = txtIA_CentroEst.getText().toString();
            registros[2] = txtIA_FechaInicio.getText().toString();
            registros[3] = txtIA_FechaTermino.getText().toString();
            registros[4] = txtIAGradoObt.getText().toString();
            model.addRow(registros);
            tInstruccionAdq.setModel(model);
        }
//        } else {
//            oFunc.SubSistemaMensajeError("Falto Llenar algo");
//
//        }

    }
    void AddEL() {
        //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        String[] registros = new String[6];
        model = (DefaultTableModel) tbExperienciaLaboral.getModel();
        if (!txtNorden.getText().isEmpty()) {
            registros[0] = txtEL_Empresa.getText().toString();
            registros[1] = txtEL_Telefono.getText().toString();
            registros[2] = txtEL_Cargo.getText().toString();
            registros[3] = txtEL_FechaInicio.getText().toString();
            registros[4] = txtEL_FechaTermino.getText().toString();
            registros[5] = txtMotivoSalida.getText().toString();
            model.addRow(registros);
            tbExperienciaLaboral.setModel(model);
        }
    }
    void AddRP() {
        //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        String[] registros = new String[5];
        model = (DefaultTableModel) tbReferenciasPers.getModel();
        if (!txtNorden.getText().isEmpty()) {
            registros[0] = txtRP_Nombres.getText().toString();
            registros[1] = txtRP_CentroTrab.getText().toString();
            registros[2] = txtRP_Cargo.getText().toString();
            registros[3] = txtRP_Telefono.getText().toString();
            registros[4] = txtRP_Direccion.getText().toString();
            model.addRow(registros);
            tbReferenciasPers.setModel(model);
        }
    }
    void sbCargarDatosFam(){
        
          String [] titulos={"Parentesco","ApellidosNombres","Vive?","F.Nac.","Edad","DNI/Part.Nac.",
          "Grado.Instr.","Autog.ó NºEssalud"};
          model = new DefaultTableModel(null,titulos){
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbCompFamiliar.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbCompFamiliar.setModel(model);          
          tbCompFamiliar.getColumnModel().getColumn(0).setPreferredWidth(20);
          tbCompFamiliar.getColumnModel().getColumn(1).setPreferredWidth(50);
          tbCompFamiliar.getColumnModel().getColumn(2).setPreferredWidth(10);
          tbCompFamiliar.getColumnModel().getColumn(3).setPreferredWidth(10);
          tbCompFamiliar.getColumnModel().getColumn(4).setPreferredWidth(20);
          tbCompFamiliar.getColumnModel().getColumn(5).setPreferredWidth(20);
          tbCompFamiliar.getColumnModel().getColumn(6).setPreferredWidth(20);
          tbCompFamiliar.getColumnModel().getColumn(7).setPreferredWidth(20);
}
     void sbCargarInstruccionAdquirida(){
        
          String [] titulos={"Instruccion","CentroEstudios","FeChaInicio","FechaTermino.","Grado"};
          model = new DefaultTableModel(null,titulos){
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tInstruccionAdq.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tInstruccionAdq.setModel(model);          
          tInstruccionAdq.getColumnModel().getColumn(0).setPreferredWidth(20);
          tInstruccionAdq.getColumnModel().getColumn(1).setPreferredWidth(50);
          tInstruccionAdq.getColumnModel().getColumn(2).setPreferredWidth(10);
          tInstruccionAdq.getColumnModel().getColumn(3).setPreferredWidth(10);
          tInstruccionAdq.getColumnModel().getColumn(4).setPreferredWidth(20);
}
    void sbCargarExperienciaLaboral(){
        
          String [] titulos={"Empresa","Telefono","Cargo","FeChaInicio","FechaTermino.","MotivoSalida"};
          model = new DefaultTableModel(null,titulos){
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbExperienciaLaboral.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbExperienciaLaboral.setModel(model);          
          tbExperienciaLaboral.getColumnModel().getColumn(0).setPreferredWidth(20);
          tbExperienciaLaboral.getColumnModel().getColumn(1).setPreferredWidth(50);
          tbExperienciaLaboral.getColumnModel().getColumn(2).setPreferredWidth(10);
          tbExperienciaLaboral.getColumnModel().getColumn(3).setPreferredWidth(10);
          tbExperienciaLaboral.getColumnModel().getColumn(4).setPreferredWidth(20);
          tbExperienciaLaboral.getColumnModel().getColumn(5).setPreferredWidth(20);
}
    void sbCargarReferenciasPersonales(){
        
          String [] titulos={"Nombres","CentroTrabajo","Cargo","Telefono","Direccion"};
          model = new DefaultTableModel(null,titulos){
              @Override
          public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
          
          };
          tbReferenciasPers.setFont(new java.awt.Font("Tahoma", 0, 11)); 
          tbReferenciasPers.setModel(model);          
          tbReferenciasPers.getColumnModel().getColumn(0).setPreferredWidth(20);
          tbReferenciasPers.getColumnModel().getColumn(1).setPreferredWidth(50);
          tbReferenciasPers.getColumnModel().getColumn(2).setPreferredWidth(10);
          tbReferenciasPers.getColumnModel().getColumn(3).setPreferredWidth(10);
          tbReferenciasPers.getColumnModel().getColumn(4).setPreferredWidth(20);
}
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       

    }//GEN-LAST:event_jLabel15MouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarVentana();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void txtCodActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActActionPerformed
        // TODO add your handling code here:
        txtCodigoDep.requestFocus();
    }//GEN-LAST:event_txtCodActActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        txtApellidos.requestFocus();
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        FechaNacimiento.requestFocusInWindow();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange
       
    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void txtZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZonaActionPerformed
        // TODO add your handling code here:
        txtDistrito1.requestFocus();
    }//GEN-LAST:event_txtZonaActionPerformed

    private void txtEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilActionPerformed

    private void txtLmilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLmilitarActionPerformed
        // TODO add your handling code here:
        txtAfp.requestFocus();
    }//GEN-LAST:event_txtLmilitarActionPerformed

    private void txtAutogeneradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutogeneradoActionPerformed
        // TODO add your handling code here:
        txtReferenciaDom.requestFocus();
    }//GEN-LAST:event_txtAutogeneradoActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void rbCFNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCFNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCFNoActionPerformed

    private void txtCFEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCFEdadActionPerformed
        // TODO add your handling code here:
        txtCF_Dni.requestFocus();
    }//GEN-LAST:event_txtCFEdadActionPerformed

    private void btnCF_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCF_AgregarActionPerformed
       AddCF();
       cboParentesco.setSelectedIndex(0);
       txtCFNombres.setText(null);
       btGS.clearSelection();
       txtCF_fechanac.setText(null);
       txtCFEdad.setText(null);
       txtCF_Dni.setText(null);
       txtCF_GradoInst.setText(null);
       txtCF_Autogenerado.setText(null);
       txtCFNombres.requestFocusInWindow();
    }//GEN-LAST:event_btnCF_AgregarActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtNordenKeyTyped

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
//        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
            if(!OrdenExiste()){
                String Sql="SELECT d.cod_pa, d.nombres_pa ,d.apellidos_pa,estado_civil_pa, d.fecha_nacimiento_pa,d.sexo_pa,d.direccion_pa, d.departamento_pa, \n" +
"       d.provincia_pa, d.distrito_pa,n.razon_empresa,n.razon_contrata , n.cargo_de, t.talla, t.peso,\n" +
"       CASE WHEN l.chko = 'TRUE' THEN 'O'\n" +
"            WHEN l.chka = 'TRUE' THEN 'A'\n" +
"            WHEN l.chkb = 'TRUE' THEN 'B'\n" +
"            WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n" +
"            CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n" +
"            WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupoyfactor, d.tel_casa_pa,d.cel_pa,d.email_pa \n" +
"FROM datos_paciente AS d \n" +
"INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) \n" +
"LEFT JOIN lab_clinico AS l ON (l.n_orden = n.n_orden) \n" +
"LEFT JOIN triaje  AS t ON (t.n_orden = n.n_orden)   \n" +
"WHERE n.n_orden ="+txtNorden.getText()+" limit 1";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                        txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                        txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
//                        txtContratista.setText(oConn.setResult.getString("razon_contrata"));
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        txtDomicilio.setText(oConn.setResult.getString("direccion_pa"));
                        txtProvincia.setText(oConn.setResult.getString("provincia_pa"));
                        txtDistrito.setText(oConn.setResult.getString("distrito_pa"));
                        txtDepartamento.setText(oConn.setResult.getString("departamento_pa"));
                        txtCargo.setText(oConn.setResult.getString("cargo_de"));
//                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) );
                        txtEstatura.setText(oConn.setResult.getString("talla"));
                        txtPeso.setText(oConn.setResult.getString("peso"));
                        txtEstadoCivil.setText(oConn.setResult.getString("estado_civil_pa"));
                        txtGrupoSan.setText(oConn.setResult.getString("Grupoyfactor"));
                        txtTelefono.setText(oConn.setResult.getString("tel_casa_pa"));
                        txtCelular.setText(oConn.setResult.getString("cel_pa"));
                        txtCorreo.setText(oConn.setResult.getString("email_pa"));
                        oPu.fecha(FechaIngreso);
                        txtCodAct.requestFocus();
                    }else{
                        oFunc.SubSistemaMensajeError("FALTAN DATOS");
                    }
                    oConn.sqlStmt.close();
                    oConn.setResult.close();

                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("Odontograma:" + ex.getMessage().toString());}
            }else { oFunc.SubSistemaMensajeInformacion("N° Orden registrado" );}
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        // TODO add your handling code here:
        AddEL();
       txtEL_Empresa.setText(null);
       txtEL_Telefono.setText(null);
       txtEL_Cargo.setText(null);
       txtEL_FechaInicio.setText(null);
       txtEL_FechaTermino.setText(null);
       txtMotivoSalida.enable(false);
       txtEL_Empresa.requestFocusInWindow();
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
        AddIA();
       cboInstAdq.setSelectedIndex(0);
       txtIA_CentroEst.setText(null);
       txtIA_FechaInicio.setText(null);
       txtIA_FechaTermino.setText(null);
       txtIAGradoObt.setText(null);
       txtIA_Capacitacion.setText(null);
       txtIA_Capacitacion.enable(false);
       txtIA_CentroEst.requestFocusInWindow();
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregarRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRPActionPerformed
        // TODO add your handling code here:
         AddRP();
       txtRP_Nombres.setText(null);
       txtRP_CentroTrab.setText(null);
       txtRP_Cargo.setText(null);
       txtRP_Telefono.setText(null);
       txtRP_Direccion.setText(null);
       txtRP_Nombres.requestFocusInWindow();
    }//GEN-LAST:event_btnAgregarRPActionPerformed

    private void btnAgregarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDatosActionPerformed

        if (!txtNorden.getText().isEmpty()) {
            if (!OrdenExiste()) {
                    try {
                        if (GrabarFPInfo()) {
                            if (tbCompFamiliar.getRowCount() > 0) {
                                if (GrabarCompFamiliar()) {
//                                    oFunc.SubSistemaMensajeInformacion("cf");
                                }
                            } 
                            if (tInstruccionAdq.getRowCount() > 0) {
                                if (GrabarInstruccionAdq()) {
//                                    oFunc.SubSistemaMensajeInformacion("ia");
                                }
                            } 
                            if (tbExperienciaLaboral.getRowCount() > 0) {
                               if (GrabarExperienciaLaboral()) {
//                                    oFunc.SubSistemaMensajeInformacion("el");
                                }
                            }
                            if (tbReferenciasPers.getRowCount() > 0) {
                                if (GrabarReferenciasPers()) {
//                                    oFunc.SubSistemaMensajeInformacion("rp");
                                }
                            } 
                            oFunc.SubSistemaMensajeInformacion("Se Registro Correctamente");
                            imprimir();
                            limpiar();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }
        }
    }//GEN-LAST:event_btnAgregarDatosActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void FechaIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaIngresoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaIngresoPropertyChange

    private void txtDistrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistrito1ActionPerformed
        // TODO add your handling code here:
        txtProvincia1.requestFocus();
    }//GEN-LAST:event_txtDistrito1ActionPerformed

    private void cboInstAdqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboInstAdqActionPerformed
        // TODO add your handling code here:
        cboInstAdq.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cboInstAdq.getSelectedIndex() <= -1) {
                } else if (cboInstAdq.getSelectedIndex() == 5) {
                    txtIA_Capacitacion.enable(true);
                }
            }
        });
    }//GEN-LAST:event_cboInstAdqActionPerformed

    private void cboInstAdqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboInstAdqMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboInstAdqMouseClicked

    private void cboInstAdqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboInstAdqItemStateChanged
        // TODO add your handling code here:
        if (cboInstAdq.getSelectedIndex() == 5) {
            txtIA_Capacitacion.enable(true);
            txtIA_Capacitacion.requestFocus();
        }
    }//GEN-LAST:event_cboInstAdqItemStateChanged

    private void txtImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpActionPerformed
        
    }//GEN-LAST:event_txtImpActionPerformed

    private void txtImpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtImpKeyTyped

    private void btnIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPActionPerformed
        if(!txtImp.getText().isEmpty()){
            print(Integer.valueOf(txtImp.getText()));
        }

    }//GEN-LAST:event_btnIMPActionPerformed

    private void txtCodigoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDepActionPerformed
        // TODO add your handling code here:
        txtZona.requestFocus();
    }//GEN-LAST:event_txtCodigoDepActionPerformed

    private void txtProvincia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvincia1ActionPerformed
        // TODO add your handling code here:
        txtDepartamento1.requestFocus();
    }//GEN-LAST:event_txtProvincia1ActionPerformed

    private void txtDepartamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamento1ActionPerformed
        // TODO add your handling code here:
        txtLicenciaC.requestFocus();
    }//GEN-LAST:event_txtDepartamento1ActionPerformed

    private void txtLicenciaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenciaCActionPerformed
        // TODO add your handling code here:
        txtLmilitar.requestFocus();
    }//GEN-LAST:event_txtLicenciaCActionPerformed

    private void txtAfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfpActionPerformed
        // TODO add your handling code here:
        txtCussp.requestFocus();
    }//GEN-LAST:event_txtAfpActionPerformed

    private void txtCusspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusspActionPerformed
        // TODO add your handling code here:
        txtAutogenerado.requestFocus();
    }//GEN-LAST:event_txtCusspActionPerformed

    private void txtReferenciaDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferenciaDomActionPerformed
        // TODO add your handling code here:
        txtRadio.requestFocus();
    }//GEN-LAST:event_txtReferenciaDomActionPerformed

    private void txtRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioActionPerformed
        // TODO add your handling code here:
        txtNumCuenta.requestFocus();
    }//GEN-LAST:event_txtRadioActionPerformed

    private void txtNumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCuentaActionPerformed
        // TODO add your handling code here:
        txtBanco.requestFocus();
    }//GEN-LAST:event_txtNumCuentaActionPerformed

    private void txtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoActionPerformed
        // TODO add your handling code here:
        txtCFNombres.requestFocus();
    }//GEN-LAST:event_txtBancoActionPerformed

    private void txtCFNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCFNombresActionPerformed
        // TODO add your handling code here:
        txtCF_fechanac.requestFocus();
    }//GEN-LAST:event_txtCFNombresActionPerformed

    private void txtCF_fechanacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCF_fechanacActionPerformed
        // TODO add your handling code here:
        txtCFEdad.requestFocus();
    }//GEN-LAST:event_txtCF_fechanacActionPerformed

    private void txtCF_DniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCF_DniActionPerformed
        // TODO add your handling code here:
        txtCF_GradoInst.requestFocus();
    }//GEN-LAST:event_txtCF_DniActionPerformed

    private void txtCF_GradoInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCF_GradoInstActionPerformed
        // TODO add your handling code here:
        txtCF_Autogenerado.requestFocus();
    }//GEN-LAST:event_txtCF_GradoInstActionPerformed

    private void txtCF_AutogeneradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCF_AutogeneradoActionPerformed
        // TODO add your handling code here:
        txtEmeNombres.requestFocus();
    }//GEN-LAST:event_txtCF_AutogeneradoActionPerformed

    private void txtEmeNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmeNombresActionPerformed
        // TODO add your handling code here:
        txtEmeParentesco.requestFocus();
    }//GEN-LAST:event_txtEmeNombresActionPerformed

    private void txtEmeParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmeParentescoActionPerformed
        // TODO add your handling code here:
        txtEmeDomicilio.requestFocus();
    }//GEN-LAST:event_txtEmeParentescoActionPerformed

    private void txtEmeDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmeDomicilioActionPerformed
        // TODO add your handling code here:
        txtEmeTelefono.requestFocus();
    }//GEN-LAST:event_txtEmeDomicilioActionPerformed

    private void txtEmeTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmeTelefonoActionPerformed
        // TODO add your handling code here:
        txtEmeOtraRef.requestFocus();
    }//GEN-LAST:event_txtEmeTelefonoActionPerformed

    private void txtEmeOtraRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmeOtraRefActionPerformed
        // TODO add your handling code here:
        txtIA_CentroEst.requestFocus();
    }//GEN-LAST:event_txtEmeOtraRefActionPerformed

    private void txtIA_CentroEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIA_CentroEstActionPerformed
        // TODO add your handling code here:
        txtIA_FechaInicio.requestFocus();
    }//GEN-LAST:event_txtIA_CentroEstActionPerformed

    private void txtIA_FechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIA_FechaInicioActionPerformed
        // TODO add your handling code here:
        txtIA_FechaTermino.requestFocus();
    }//GEN-LAST:event_txtIA_FechaInicioActionPerformed

    private void txtIA_FechaTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIA_FechaTerminoActionPerformed
        // TODO add your handling code here:
        txtIAGradoObt.requestFocus();
    }//GEN-LAST:event_txtIA_FechaTerminoActionPerformed

    private void txtIAGradoObtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIAGradoObtActionPerformed
        // TODO add your handling code here:
        txtEL_Empresa.requestFocus();
    }//GEN-LAST:event_txtIAGradoObtActionPerformed

    private void txtEL_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEL_EmpresaActionPerformed
        // TODO add your handling code here:
        txtEL_Telefono.requestFocus();
    }//GEN-LAST:event_txtEL_EmpresaActionPerformed

    private void txtEL_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEL_TelefonoActionPerformed
        // TODO add your handling code here:
        txtEL_Cargo.requestFocus();
    }//GEN-LAST:event_txtEL_TelefonoActionPerformed

    private void txtEL_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEL_CargoActionPerformed
        // TODO add your handling code here:
        txtEL_FechaInicio.requestFocus();
    }//GEN-LAST:event_txtEL_CargoActionPerformed

    private void txtEL_FechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEL_FechaInicioActionPerformed
        // TODO add your handling code here:
        txtEL_FechaTermino.requestFocus();
    }//GEN-LAST:event_txtEL_FechaInicioActionPerformed

    private void txtEL_FechaTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEL_FechaTerminoActionPerformed
        // TODO add your handling code here:
        txtMotivoSalida.requestFocus();
    }//GEN-LAST:event_txtEL_FechaTerminoActionPerformed

    private void txtMotivoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoSalidaActionPerformed
        // TODO add your handling code here:
        txtRP_Nombres.requestFocus();
    }//GEN-LAST:event_txtMotivoSalidaActionPerformed

    private void txtRP_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRP_NombresActionPerformed
        // TODO add your handling code here:
        txtRP_CentroTrab.requestFocus();
    }//GEN-LAST:event_txtRP_NombresActionPerformed

    private void txtRP_CentroTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRP_CentroTrabActionPerformed
        // TODO add your handling code here:
        txtRP_Cargo.requestFocus();
        
    }//GEN-LAST:event_txtRP_CentroTrabActionPerformed

    private void txtRP_CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRP_CargoActionPerformed
        // TODO add your handling code here:
        txtRP_Telefono.requestFocus();
    }//GEN-LAST:event_txtRP_CargoActionPerformed

    private void txtRP_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRP_TelefonoActionPerformed
        // TODO add your handling code here:
        txtRP_Direccion.requestFocus();
    }//GEN-LAST:event_txtRP_TelefonoActionPerformed

    private void txtRP_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRP_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRP_DireccionActionPerformed

    private void btnEliminarCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCFActionPerformed
        int iRow;
        if(tbCompFamiliar.getSelectedRow()>= 0){
                iRow = tbCompFamiliar.getSelectedRow();
                DefaultTableModel tblDatos = (DefaultTableModel) tbCompFamiliar.getModel();
                tblDatos.removeRow(iRow);
                tbCompFamiliar.setModel(tblDatos);
        }else{
            oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarCFActionPerformed

    private void btnEliminarIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIAActionPerformed
        // TODO add your handling code here:
        int iRow;
        if(tInstruccionAdq.getSelectedRow()>= 0){
                iRow = tInstruccionAdq.getSelectedRow();
                DefaultTableModel tblDatos = (DefaultTableModel) tInstruccionAdq.getModel();
                tblDatos.removeRow(iRow);
                tInstruccionAdq.setModel(tblDatos);
        }else{
            oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarIAActionPerformed

    private void btnEliminarELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarELActionPerformed
        // TODO add your handling code here:
        int iRow;
        if(tbExperienciaLaboral.getSelectedRow()>= 0){
                iRow = tbExperienciaLaboral.getSelectedRow();
                DefaultTableModel tblDatos = (DefaultTableModel) tbExperienciaLaboral.getModel();
                tblDatos.removeRow(iRow);
                tbExperienciaLaboral.setModel(tblDatos);
        }else{
            oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarELActionPerformed

    private void btnEliminarRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRPActionPerformed
        // TODO add your handling code here:
        int iRow;
        if(tbReferenciasPers.getSelectedRow()>= 0){
                iRow = tbReferenciasPers.getSelectedRow();
                DefaultTableModel tblDatos = (DefaultTableModel) tbReferenciasPers.getModel();
                tblDatos.removeRow(iRow);
                tbReferenciasPers.setModel(tblDatos);
        }else{
            oFunc.SubSistemaMensajeError("Seleccione un Item");
        }
    }//GEN-LAST:event_btnEliminarRPActionPerformed
 private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);            
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaDatosPersonales.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("CERTIFICADO DE APTITUD PARA TRABAJOS EN ALTURA");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
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
 private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"FichaDatosPersonales.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                  JasperPrintManager.printReport(jasperPrint,true);
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
    private boolean GrabarCompFamiliar() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Parentesco, Nombnrescf, Vive, Fechanac, Edad,Dni,Gradoi,Autoge;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbCompFamiliar.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Parentesco = tbCompFamiliar.getModel().getValueAt(iFila, 0).toString();
            Nombnrescf = tbCompFamiliar.getModel().getValueAt(iFila, 1).toString();
            Vive = tbCompFamiliar.getModel().getValueAt(iFila, 2).toString();
            Fechanac = tbCompFamiliar.getModel().getValueAt(iFila, 3).toString();
            Edad = tbCompFamiliar.getModel().getValueAt(iFila, 4).toString();
            Dni = tbCompFamiliar.getModel().getValueAt(iFila, 5).toString();
            Gradoi = tbCompFamiliar.getModel().getValueAt(iFila, 6).toString();
            Autoge = tbCompFamiliar.getModel().getValueAt(iFila, 7).toString();
           
           strSqlStmt="INSERT INTO composicion_familiar_fdp(\n" +
"            cod_fd, parentesco, nombres, vive, fechanac, edad, dni, gradoinst, \n" +
"            autogene)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += Parentesco+"','";
                    strSqlStmt += Nombnrescf+"','";
                    strSqlStmt += Vive+"','";
                    strSqlStmt += Fechanac+"','";
                    strSqlStmt += Edad+"','";
                    strSqlStmt += Dni+"','";
                    strSqlStmt += Gradoi+"','";
                    strSqlStmt += Autoge+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                                  
                    }
             try {
                 oConn.sqlStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }
         return bResult;
    }
    private boolean GrabarInstruccionAdq() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Instruccion, CentroEstudios, FechaInicio, FechaTermino, Grado;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tInstruccionAdq.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Instruccion = tInstruccionAdq.getModel().getValueAt(iFila, 0).toString();
            CentroEstudios = tInstruccionAdq.getModel().getValueAt(iFila, 1).toString();
            FechaInicio = tInstruccionAdq.getModel().getValueAt(iFila, 2).toString();
            FechaTermino = tInstruccionAdq.getModel().getValueAt(iFila, 3).toString();
            Grado = tInstruccionAdq.getModel().getValueAt(iFila, 4).toString();
           
           strSqlStmt="INSERT INTO instruccion_adquirida_fdp(\n" +
"            cod_fd, instruccon, centro_est, fecha_inicio, fecha_termino, \n" +
"            grado_obtenido)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += Instruccion+"','";
                    strSqlStmt += CentroEstudios+"','";
                    strSqlStmt += FechaInicio+"','";
                    strSqlStmt += FechaTermino+"','";
                    strSqlStmt += Grado+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                                  
                    }
             try {
                 oConn.sqlStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }
         return bResult;
    }
    private boolean GrabarExperienciaLaboral() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Empresa, Telefono, Cargo, FechaInicio, FechaTermino, Motivo;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbExperienciaLaboral.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Empresa = tbExperienciaLaboral.getModel().getValueAt(iFila, 0).toString();
            Telefono = tbExperienciaLaboral.getModel().getValueAt(iFila, 1).toString();
            Cargo = tbExperienciaLaboral.getModel().getValueAt(iFila, 2).toString();
            FechaInicio = tbExperienciaLaboral.getModel().getValueAt(iFila, 3).toString();
            FechaTermino = tbExperienciaLaboral.getModel().getValueAt(iFila, 4).toString();
            Motivo = tbExperienciaLaboral.getModel().getValueAt(iFila, 5).toString();
           
           strSqlStmt="INSERT INTO experiencia_laboral_fdp(\n" +
"            cod_fd, empresa, telefono, cargo_desemp, fecha_inicio, fecha_termino, \n" +
"            motivo_salida)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += Empresa+"','";
                    strSqlStmt += Telefono+"','";
                    strSqlStmt += Cargo+"','";
                    strSqlStmt += FechaInicio+"','";
                    strSqlStmt += FechaTermino+"','";
                    strSqlStmt += Motivo+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                                  
                    }
             try {
                 oConn.sqlStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }
         return bResult;
    }
    private boolean GrabarReferenciasPers() {
         boolean bResult = false;
                      
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String Nombres, CentroTrabajo, Cargo, Telefono, Direccion;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbReferenciasPers.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            Nombres = tbReferenciasPers.getModel().getValueAt(iFila, 0).toString();
            CentroTrabajo = tbReferenciasPers.getModel().getValueAt(iFila, 1).toString();
            Cargo = tbReferenciasPers.getModel().getValueAt(iFila, 2).toString();
            Telefono = tbReferenciasPers.getModel().getValueAt(iFila, 3).toString();
            Direccion = tbReferenciasPers.getModel().getValueAt(iFila, 4).toString();
           
           strSqlStmt="INSERT INTO referncias_personales_fdp(\n" +
"            cod_fd, nombres, centro_trab, cargo_desemp, telefono, direccion)";
                                      
                    strSqlStmt = strSqlStmt + " Values ('";
//                    oFunc.SubSistemaMensajeError(String.valueOf(num));
                    strSqlStmt += num+"','";
                    strSqlStmt += Nombres+"','";
                    strSqlStmt += CentroTrabajo+"','";
                    strSqlStmt += Cargo+"','";
                    strSqlStmt += Telefono+"','";
                    strSqlStmt += Direccion+"')";
                    
                    // Ejecuta la Sentencia
                    if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
                        bResult = true;
                                  
                    }
             try {
                 oConn.sqlStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }
         return bResult;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaIngreso;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.ButtonGroup bgFS;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.ButtonGroup btGS;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregarDatos;
    private javax.swing.JButton btnAgregarRP;
    private javax.swing.JButton btnCF_Agregar;
    private javax.swing.JMenuItem btnEliminarCF;
    private javax.swing.JMenuItem btnEliminarEL;
    private javax.swing.JMenuItem btnEliminarIA;
    private javax.swing.JMenuItem btnEliminarRP;
    private javax.swing.JButton btnIMP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboInstAdq;
    private javax.swing.JComboBox<String> cboParentesco;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPopupMenu pmCF;
    private javax.swing.JPopupMenu pmEL;
    private javax.swing.JPopupMenu pmIA;
    private javax.swing.JPopupMenu pmRP;
    private javax.swing.JRadioButton rbAlquilada;
    private javax.swing.JRadioButton rbCFNo;
    private javax.swing.JRadioButton rbCFSi;
    private javax.swing.JRadioButton rbEmpleado;
    private javax.swing.JRadioButton rbObrero;
    private javax.swing.JRadioButton rbPropia;
    private javax.swing.JRadioButton rbTANo;
    private javax.swing.JRadioButton rbTASi;
    private javax.swing.JRadioButton rbTTNo;
    private javax.swing.JRadioButton rbTTSi;
    private javax.swing.JRadioButton rbVNo;
    private javax.swing.JRadioButton rbVSi;
    private javax.swing.JTable tInstruccionAdq;
    private javax.swing.JTable tbCompFamiliar;
    private javax.swing.JTable tbExperienciaLaboral;
    private javax.swing.JTable tbReferenciasPers;
    private javax.swing.JTextField txtAfp;
    private javax.swing.JTextField txtAlimCuenta;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtAutogenerado;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCFEdad;
    private javax.swing.JTextField txtCFNombres;
    private javax.swing.JTextField txtCF_Autogenerado;
    private javax.swing.JTextField txtCF_Dni;
    private javax.swing.JTextField txtCF_GradoInst;
    private javax.swing.JTextField txtCF_fechanac;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodAct;
    private javax.swing.JTextField txtCodigoDep;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCussp;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDepartamento1;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDistrito1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEL_Cargo;
    private javax.swing.JTextField txtEL_Empresa;
    private javax.swing.JTextField txtEL_FechaInicio;
    private javax.swing.JTextField txtEL_FechaTermino;
    private javax.swing.JTextField txtEL_Telefono;
    private javax.swing.JTextField txtEmeDomicilio;
    private javax.swing.JTextField txtEmeNombres;
    private javax.swing.JTextField txtEmeOtraRef;
    private javax.swing.JTextField txtEmeParentesco;
    private javax.swing.JTextField txtEmeTelefono;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtGrupoSan;
    private javax.swing.JTextField txtIAGradoObt;
    private javax.swing.JTextField txtIA_Capacitacion;
    private javax.swing.JTextField txtIA_CentroEst;
    private javax.swing.JTextField txtIA_FechaInicio;
    private javax.swing.JTextField txtIA_FechaTermino;
    private javax.swing.JTextField txtImp;
    private javax.swing.JTextField txtLicenciaC;
    private javax.swing.JTextField txtLmilitar;
    private javax.swing.JTextField txtMotivoSalida;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtProvincia1;
    private javax.swing.JTextField txtRP_Cargo;
    private javax.swing.JTextField txtRP_CentroTrab;
    private javax.swing.JTextField txtRP_Direccion;
    private javax.swing.JTextField txtRP_Nombres;
    private javax.swing.JTextField txtRP_Telefono;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtReferenciaDom;
    private javax.swing.JTextField txtSistemaTrab;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtViaticos;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
    
}

    

   





   

    
   
