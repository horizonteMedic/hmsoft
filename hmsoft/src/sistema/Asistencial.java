/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Asistencial.ExamenInmunologico;
import Asistencial.Hemograma;
import Caja.Reporteador;
import Caja.Valorizacion;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

//import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author admin
 */
public class Asistencial extends javax.swing.JFrame {
 clsFunciones  oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
    FichaTriaje ft;
    HistoriaClinicaPs hcl;
    AntecedentesPatologicos ap;
    BuscarUsuarios pe;
    HistorialPacientes hcO;
    TestPsicologico te;
    InformePsicologico ips;
    FichaMedica fm;
    FichaMedica1 fm1;
    ConsentimientoInformado coi;
//    Anexo7C a7c;
    FichaOftalmologica fo;
    ElectroCardiograma el;
    Configurar cf;
    HCL his;
    Radiografia ra;
    Audiometria au;
    LaboratorioClinico an;
    PerimetroToraxico pmt;
    EmpresasLugaresGeograficos hc;
    Anexo7D an7;
    AntecedentesEnfermedadesAltura aea;
    AnexoC an7c;
    ConsentimientoDosajeMC cmc;
    InformeAudiometria ia;
    CuestionarioAudiometria ca;
    A_CertificacionMedicaTrabajoAltura cmta;
    B_Certificacion_Trabajo_Altura b_ceral;
    B_Uso_Respiradores b_uso;
    b_Ficha_Sas b_sas;
    Odontograma odn;
    AnalisisBioquimico lca;
    RadiografiaTorax rtpa;
    DetecciondeSAS fs;
    CuestionarioNordico cn;
    FuncionRespiratoriaABS fn;
    ExamenRadiograficoSanguineo er;
    FichaAgroindustriales frm_agro;
    LaboratorioClinicoCovid lab;
    Eliminar Exc;
    B_Certificacion_conduccion b_cercon;
    B_OIT b_oit;
    Frm_conalvias frm_conal;
    ConstanciaRetiro frm_constancia;
    ElectroCardiogramaPoderosa frm_electropoderosa;
    Aptitud_Medico_Ocupacional frm_aptitud;
    Aptitud_Medico_Ocupacional1 frm_aptitud1;
    Aptitud_Medico_Ocupacional2 frm_aptitud2;
    Certificacion_Trabajo_Altura_Poderosa c_alt_poderosa;
    Aptitud_Altura_Poderosa apt_al_P;
    Anexo_02 ane;
    Aptitud_Anexo02 apanex2;
    Aptitud_Medico_Ocupacional_Agro frm_aptitudagro;
    Observados obs;
    Reporteador re = new Reporteador();
    ResumenInformacion ri;
    Anexo16A an16;
    Interconsulta inter;
    Valorizacion val;
    Constancia_Tamizaje_COVID19 ctv;
    FichaMedicaMarsa fmm;
    FichaMedicaMarsa1 fmm1;
    ConstanciaSaludMarsa csm;
    ConstanciaSaludMarsa1 csm1;
    constanciaTamizajeAntigeno cta;
    ConstanciaAltaMarsa cam;
    ConstanciaAltaMarsa1 cam1;
    Ficha_Resultados_Pruebas_Rapidas_CovidF100 frpr;
    Ficha_Resultados_Pruebas_Rapidas_CovidF1001 frpr1;
    ConsentimientoInformadoCovid cic;
    ConsentimientoInformadoCovid1 cic1;
    Constancia_Tamizaje_COVID19_marza ctvm;
    Registro_Pruebas_Rapidas_F100 rpr;
    ConstanciaCovid19 cc19;
    CartaCompromisoAislamiento ccc19;
    Resultados_Pruebas_Rapidas rpra;
    FichaSintomatologiaCovid19 fsc;
    ConstanciaEncofrados ce;
    FichaReferencia fr;
    IndicacionesMedicas im;
    ConstanciaAltaEpidemiologica cae;
    EvaluacionMusculoEsqueletica eme;
    //nuevos formatos
    EvaluacionMusculoEsqueletica2021 eme2021;
    CuestionarioCalidadSueno ccs2021;
    TestFatigaSomnolencia tfs2021;
    Audiometria2021 audio2021;
    EvaluacionOftalmologica evof2021;
    CertificadoManipuladoresBarrick cmb;
    ExamenesLaboratorio2021 el2021;
    LaboratorioClinicoAsistencial laba;
    javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
    javax.swing.ImageIcon oNo = null;
    String ipa = "", seded = "";
    public static String lasede = "";
    DefaultTableModel model;
    public Asistencial() {

        lasede = clsGlobales.sedeSede;
        seded = clsGlobales.sedeSede;
        ipa = clsGlobales.ipIp;

        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        initComponents();
        sede();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lblUsuarioCaja.setText(clsGlobales.sNomOperador);
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
//y enseguida registramos nuestro dispatcher
        manager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                //como dije, solo las notificaciones del tipo "typed" son las que actualizan los componentes
                if (e.getID() == KeyEvent.KEY_TYPED) {
                    //como vamos a convertir todo a mayúsculas, entonces solo checamos si los caracteres son 
                    //minusculas
                    if (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') {
                        //si lo son, entonces lo reemplazamos por su respectivo en mayúscula en el mismo evento
                        // (esto se logra por que en java todas las variables son pasadas por referencia)
                        e.setKeyChar((char) (((int) e.getKeyChar()) - 32));
                    }
                }
                //y listo, regresamos siempre falso para que las demas notificaciones continuen, si regresamos true
                // significa que el dispatcher consumio el evento
                return false;
            }
        });
        sbCargarOcupacional("");
   }
    public void sede(){
  
    String mensaje="";
    if(ipa.contains("192.168.1.3"))
        mensaje="SERVIDOR HUAMACHUCO";
     if(ipa.contains("190.117.99.73")|| ipa.contains("192.168.0.201"))
        mensaje="SERVIDOR SANTO DOMINGUITO";
      if(ipa.contains("148.251.179.84"))
      {mensaje="SERVIDOR PUBLICO-";
      
      mensaje+=seded;
      }
          jLabel2.setText(mensaje);

    // System.out.println("nombre sede:"+nombreSede);
};
    private void sbSubHabilitaOpciones()
    {
        // Habilita Deshablita opciones
        
        btnTriaje.setVisible(fnBoolIsOptionEnabled("SIS_TRI_01"));
//        btnResumenAptitud.setVisible(fnBoolIsOptionEnabled("SIS_RAD_01"));
//        btnOftalmologia.setVisible(fnBoolIsOptionEnabled("SIS_OFT_01"));
//        btnRtorax.setVisible(fnBoolIsOptionEnabled("SIS_TRX_01"));
        Audiometria.setVisible(fnBoolIsOptionEnabled("SIS_AUD_01"));
//        btnHistoriaOcupacional.setVisible(fnBoolIsOptionEnabled("SIS_HOC_01"));
//        btnFichaMedica.setVisible(fnBoolIsOptionEnabled("SIS_FME_01"));
//        btnApatologicos.setVisible(fnBoolIsOptionEnabled("SIS_APA_01"));
        ////////////        
        AnalisisBioquimicos.setVisible(fnBoolIsOptionEnabled("SIS_ABI_01"));
//        btnCuestionarioNordico.setVisible(fnBoolIsOptionEnabled("SIS_NOR_01"));
        //btnFrayosX.setVisible(fnBoolIsOptionEnabled("SIS_PMT_01"));
//        btnPelisa.setVisible(fnBoolIsOptionEnabled("SIS_PEL_01"));
        InformePsicologia.setVisible(fnBoolIsOptionEnabled("SIS_IFP_01"));
//        btnOdontologia.setVisible(fnBoolIsOptionEnabled("SIS_ODN_01"));
        TestPsicologico.setVisible(fnBoolIsOptionEnabled("SIS_TPS_01"));
//        btnElectrocardigrama.setVisible(fnBoolIsOptionEnabled("SIS_ELE_01"));
//        btnAnexo7D.setVisible(fnBoolIsOptionEnabled("SIS_A7D_01"));
        ConsentimientoDosaje.setVisible(fnBoolIsOptionEnabled("SIS_DOS_01"));
        A_CertificacionTrabajoAltura.setVisible(fnBoolIsOptionEnabled("SIS_CTA_01"));
        PerimetroToraxico.setVisible(fnBoolIsOptionEnabled("SIS_FRA_01"));
        FichaSaS.setVisible(fnBoolIsOptionEnabled("SIS_SAS_01"));
        LaboratorioClinico.setVisible(fnBoolIsOptionEnabled("SIS_LCL_01"));
        FuncionRespiratoria.setVisible(fnBoolIsOptionEnabled("SIS_FRE_01"));
        btnAddUsuarios.setVisible(fnBoolIsOptionEnabled("SIS_USU_01"));
        JOptionPane.showMessageDialog(null,"SE HABILITO EL SISTEMA CON EXITO ");
    }
    private boolean fnBoolIsOptionEnabled(String sOption)
    {
        String sStmt;
        boolean bResult=false;
        
        // Consulta para Verificar Acceso a Sistema-Procesos
        sStmt = " Select * from u_rol_procesos";
        sStmt+= " Where rol_user='"+clsGlobales.sRol+"'";
        sStmt+= " And   procesos_ide='"+sOption+"'";
        
        // Ejecuto el Query
        oConn.FnBoolQueryExecute(sStmt);
        try 
        {
            // Verifico que haya habido resultados
            if (oConn.setResult.next()) {
                bResult=true;
            }
        
            // Cierra la Consulta
            oConn.setResult.close();   
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Asistencial.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        // Retorna el Resultado
        return bResult;
        
    }
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPopupMenu();
        Reporte = new javax.swing.JMenuItem();
        Observados = new javax.swing.JMenuItem();
        ConsentimientoDosaje = new javax.swing.JMenuItem();
        A_CertificacionTrabajoAltura = new javax.swing.JMenuItem();
        PerimetroToraxico = new javax.swing.JMenuItem();
        FichaSaS = new javax.swing.JMenuItem();
        FrmLaboratorio = new javax.swing.JMenu();
        LaboratorioClinico = new javax.swing.JMenuItem();
        LaboratorioClinicoAsistencial = new javax.swing.JMenuItem();
        FuncionRespiratoria = new javax.swing.JMenuItem();
        btnHCL = new javax.swing.JMenuItem();
        btnHC = new javax.swing.JMenuItem();
        ConsentimientoInformado = new javax.swing.JMenuItem();
        AnalisisBioquimicos = new javax.swing.JMenuItem();
        InformePsicologia = new javax.swing.JMenuItem();
        TestPsicologico = new javax.swing.JMenuItem();
        Pacientes = new javax.swing.JMenuItem();
        Anexo7D = new javax.swing.JMenuItem();
        FrmAudiometria = new javax.swing.JMenu();
        Audiometria = new javax.swing.JMenuItem();
        CuestionarioAudiometria = new javax.swing.JMenuItem();
        InformeAudiometria = new javax.swing.JMenuItem();
        mBarrick = new javax.swing.JMenu();
        mCertificacionConduccion = new javax.swing.JMenuItem();
        mCertificacionTrabajoAltura = new javax.swing.JMenuItem();
        mUsoRespiradores = new javax.swing.JMenuItem();
        mApnea = new javax.swing.JMenuItem();
        mFichaRetiro = new javax.swing.JMenuItem();
        mAptitudMedico = new javax.swing.JMenuItem();
        FrmVarios = new javax.swing.JMenu();
        frmConalvias = new javax.swing.JMenuItem();
        FrmAgroindustrial = new javax.swing.JMenu();
        FichaMedicaAgro = new javax.swing.JMenuItem();
        AptitudAgro = new javax.swing.JMenuItem();
        HclMenu = new javax.swing.JPopupMenu();
        btnHCLPS = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        barraPrincipal = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        btnTriaje = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnTriaje1 = new javax.swing.JButton();
        btnTriaje2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUsuarioCaja = new javax.swing.JLabel();
        jbarra = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Desktop = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        txtNum = new javax.swing.JTextField();
        MenuOcupacional = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarUsuario = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        btnconfiguracionsistema = new javax.swing.JMenu();
        btnconfigurarservicios = new javax.swing.JMenuItem();
        btnAddUsuarios = new javax.swing.JMenuItem();
        btnConfiguracion = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        btnEliminarEx = new javax.swing.JMenuItem();
        mFAgroindustrial = new javax.swing.JMenu();
        mFichaAnexo2 = new javax.swing.JMenuItem();
        mFichaAptitudAnexo2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnActualizar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        mBarrick1 = new javax.swing.JMenu();
        mCertificacionConduccion1 = new javax.swing.JMenuItem();
        mCertificacionTrabajoAltura1 = new javax.swing.JMenuItem();
        mUsoRespiradores1 = new javax.swing.JMenuItem();
        mApnea1 = new javax.swing.JMenuItem();
        mFichaRetiro1 = new javax.swing.JMenuItem();
        mAptitudMedico1 = new javax.swing.JMenuItem();
        mInformeElectrocardiogramaP = new javax.swing.JMenuItem();
        mFSinRestriccion = new javax.swing.JMenu();
        mFichaMedica1 = new javax.swing.JMenuItem();
        mFichaAptitud1 = new javax.swing.JMenuItem();
        mFichaAptitudResumen = new javax.swing.JMenuItem();
        mFichaAlturaPoderosa = new javax.swing.JMenuItem();
        mFichaAptitudAlturaPoderosa = new javax.swing.JMenuItem();
        mEliminarRegistros = new javax.swing.JMenu();
        mEliminar = new javax.swing.JMenuItem();
        mValorizacionn = new javax.swing.JMenu();
        mValorizacion = new javax.swing.JMenuItem();
        mCovid19 = new javax.swing.JMenu();
        mConstanciaTamizaje = new javax.swing.JMenuItem();
        mConstanciaTamizajeMarza = new javax.swing.JMenuItem();
        mRegistroPrueba = new javax.swing.JMenuItem();
        mConstanciaMedicaCovid19 = new javax.swing.JMenuItem();
        mCartaCompromisoAislamiento = new javax.swing.JMenuItem();
        mResultadosPruebaRapida = new javax.swing.JMenuItem();
        mFichasintomatologica = new javax.swing.JMenuItem();
        mConstanciaEncofrados = new javax.swing.JMenuItem();
        mHojaReferencia = new javax.swing.JMenuItem();
        mIndicacionesMedicas = new javax.swing.JMenuItem();
        mConstanciaAltaEpidemiologica = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mExamenMarsa = new javax.swing.JMenu();
        mConstanciaSaludMarsa = new javax.swing.JMenuItem();
        mFichaMedicaMarsa1 = new javax.swing.JMenuItem();
        mFichaResultadoPrueba = new javax.swing.JMenuItem();
        mConstanciaAltaMarsa = new javax.swing.JMenuItem();
        mConsentimientoInformadoCovid = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mConstanciaSaludMarsa1 = new javax.swing.JMenuItem();
        mFichaMedicaMarsa = new javax.swing.JMenuItem();
        mFichaResultadoPrueba1 = new javax.swing.JMenuItem();
        mConstanciaAltaMarsa1 = new javax.swing.JMenuItem();
        mConsentimientoInformadoCovid1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMNuevosFormatos = new javax.swing.JMenu();
        mEvaluaciónMuscoloEsqueletico2021 = new javax.swing.JMenuItem();
        mCuestionarioCalidadSueño = new javax.swing.JMenuItem();
        mTestFatigaSomnolencia = new javax.swing.JMenuItem();
        mFichaAudiometrica2021 = new javax.swing.JMenuItem();
        mEvaluacionOftalmologica = new javax.swing.JMenuItem();
        mCertificadoManipuladores = new javax.swing.JMenuItem();
        mExamenesLaboratorio2021 = new javax.swing.JMenuItem();

        Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        Reporte.setText("Reporte");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        Menu.add(Reporte);

        Observados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biology1.png"))); // NOI18N
        Observados.setText("Observados");
        Observados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservadosActionPerformed(evt);
            }
        });
        Menu.add(Observados);

        ConsentimientoDosaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maletin.png"))); // NOI18N
        ConsentimientoDosaje.setText("Consentimiendo Dosaje");
        ConsentimientoDosaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ConsentimientoDosaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsentimientoDosajeActionPerformed(evt);
            }
        });
        Menu.add(ConsentimientoDosaje);

        A_CertificacionTrabajoAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        A_CertificacionTrabajoAltura.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        A_CertificacionTrabajoAltura.setLabel("A_Certificación Trabajo en Altura");
        A_CertificacionTrabajoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_CertificacionTrabajoAlturaActionPerformed(evt);
            }
        });
        Menu.add(A_CertificacionTrabajoAltura);
        A_CertificacionTrabajoAltura.getAccessibleContext().setAccessibleName("A_Certificación MA_edica Trabajo en Altura");

        PerimetroToraxico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ray.png"))); // NOI18N
        PerimetroToraxico.setText("Perimetro Toraxico");
        PerimetroToraxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerimetroToraxicoActionPerformed(evt);
            }
        });
        Menu.add(PerimetroToraxico);

        FichaSaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        FichaSaS.setText("FichaSas");
        FichaSaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaSaSActionPerformed(evt);
            }
        });
        Menu.add(FichaSaS);

        FrmLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mask.png"))); // NOI18N
        FrmLaboratorio.setText("Formatos Audiometria");
        FrmLaboratorio.setActionCommand("Laboratorio Clinico");

        LaboratorioClinico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        LaboratorioClinico.setLabel("Labtoratorio Clínico");
        LaboratorioClinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaboratorioClinicoActionPerformed(evt);
            }
        });
        FrmLaboratorio.add(LaboratorioClinico);

        LaboratorioClinicoAsistencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        LaboratorioClinicoAsistencial.setText("Labtoratorio Clínico Asistencial");
        LaboratorioClinicoAsistencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaboratorioClinicoAsistencialActionPerformed(evt);
            }
        });
        FrmLaboratorio.add(LaboratorioClinicoAsistencial);

        Menu.add(FrmLaboratorio);

        FuncionRespiratoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        FuncionRespiratoria.setText("Función Respiración ABS");
        FuncionRespiratoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionRespiratoriaActionPerformed(evt);
            }
        });
        Menu.add(FuncionRespiratoria);

        btnHCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnHCL.setText("Llenar Historia");
        btnHCL.setActionCommand("Llenar Historia Clinica");
        btnHCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHCLActionPerformed(evt);
            }
        });
        Menu.add(btnHCL);

        btnHC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnHC.setText("Buscar Historia Clinica");
        btnHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHCActionPerformed(evt);
            }
        });
        Menu.add(btnHC);

        ConsentimientoInformado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invoice.png"))); // NOI18N
        ConsentimientoInformado.setText("Consentimiento Informado Examen Medico");
        ConsentimientoInformado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsentimientoInformadoActionPerformed(evt);
            }
        });
        Menu.add(ConsentimientoInformado);

        AnalisisBioquimicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/biology0.png"))); // NOI18N
        AnalisisBioquimicos.setLabel("Analisis Bioquimícos");
        AnalisisBioquimicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisisBioquimicosActionPerformed(evt);
            }
        });
        Menu.add(AnalisisBioquimicos);

        InformePsicologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/cerebro.jpg"))); // NOI18N
        InformePsicologia.setText("InformePsicologia");
        InformePsicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformePsicologiaActionPerformed(evt);
            }
        });
        Menu.add(InformePsicologia);

        TestPsicologico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/psiquiatria.jpg"))); // NOI18N
        TestPsicologico.setText("TestPsicologico");
        TestPsicologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestPsicologicoActionPerformed(evt);
            }
        });
        Menu.add(TestPsicologico);

        Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctor.png"))); // NOI18N
        Pacientes.setText("Pacientes");
        Pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacientesActionPerformed(evt);
            }
        });
        Menu.add(Pacientes);

        Anexo7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia.png"))); // NOI18N
        Anexo7D.setText("Anexo7D");
        Anexo7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anexo7DActionPerformed(evt);
            }
        });
        Menu.add(Anexo7D);

        FrmAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mask.png"))); // NOI18N
        FrmAudiometria.setText("Formatos Audiometria");

        Audiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        Audiometria.setLabel("Audiometria");
        Audiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudiometriaActionPerformed(evt);
            }
        });
        FrmAudiometria.add(Audiometria);

        CuestionarioAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        CuestionarioAudiometria.setText("Cuestionario Audiometria");
        CuestionarioAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuestionarioAudiometriaActionPerformed(evt);
            }
        });
        FrmAudiometria.add(CuestionarioAudiometria);

        InformeAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maletin.png"))); // NOI18N
        InformeAudiometria.setText("Informe Audiometria");
        InformeAudiometria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        InformeAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeAudiometriaActionPerformed(evt);
            }
        });
        FrmAudiometria.add(InformeAudiometria);

        Menu.add(FrmAudiometria);

        mBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gold.png"))); // NOI18N
        mBarrick.setText("Formatos Barrick");

        mCertificacionConduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grua.png"))); // NOI18N
        mCertificacionConduccion.setText("Certificacion de Suficiencia");
        mCertificacionConduccion.setActionCommand("Cert. Conducción de Vehiculos");
        mCertificacionConduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificacionConduccionActionPerformed(evt);
            }
        });
        mBarrick.add(mCertificacionConduccion);

        mCertificacionTrabajoAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mCertificacionTrabajoAltura.setText("Certificacion Trabajo en Altura");
        mCertificacionTrabajoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificacionTrabajoAlturaActionPerformed(evt);
            }
        });
        mBarrick.add(mCertificacionTrabajoAltura);

        mUsoRespiradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mask.png"))); // NOI18N
        mUsoRespiradores.setText("Uso de Respiradores");
        mUsoRespiradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsoRespiradoresActionPerformed(evt);
            }
        });
        mBarrick.add(mUsoRespiradores);

        mApnea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cama.png"))); // NOI18N
        mApnea.setText("Apnea de Sueño");
        mApnea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApneaActionPerformed(evt);
            }
        });
        mBarrick.add(mApnea);

        mFichaRetiro.setText("Ficha Retiro");
        mFichaRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaRetiroActionPerformed(evt);
            }
        });
        mBarrick.add(mFichaRetiro);

        mAptitudMedico.setText("Actitud Medico Ocupacional");
        mAptitudMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAptitudMedicoActionPerformed(evt);
            }
        });
        mBarrick.add(mAptitudMedico);

        Menu.add(mBarrick);

        FrmVarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        FrmVarios.setText("Formatos Personalizados");

        frmConalvias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        frmConalvias.setText("Formulario Conalvias");
        frmConalvias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmConalviasActionPerformed(evt);
            }
        });
        FrmVarios.add(frmConalvias);

        Menu.add(FrmVarios);

        FrmAgroindustrial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mask.png"))); // NOI18N
        FrmAgroindustrial.setText("Formatos Agroindustrial");

        FichaMedicaAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        FichaMedicaAgro.setText("Ficha Agroindustrial");
        FichaMedicaAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaMedicaAgroActionPerformed(evt);
            }
        });
        FrmAgroindustrial.add(FichaMedicaAgro);

        AptitudAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        AptitudAgro.setText("Aptitud Agroindustrial");
        AptitudAgro.setToolTipText("");
        AptitudAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AptitudAgroActionPerformed(evt);
            }
        });
        FrmAgroindustrial.add(AptitudAgro);

        Menu.add(FrmAgroindustrial);

        btnHCLPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llenarHistoria.png"))); // NOI18N
        btnHCLPS.setText("Historia Clinica Psicologica");
        btnHCLPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHCLPSActionPerformed(evt);
            }
        });
        HclMenu.add(btnHCLPS);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemes de Gestión \"MEDSOFT\"");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        barraPrincipal.setBorder(null);
        barraPrincipal.setFloatable(false);
        barraPrincipal.setRollover(true);
        barraPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraPrincipal.setPreferredSize(new java.awt.Dimension(1219, 52));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setFloatable(false);
        jToolBar2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar2.setToolTipText("");

        btnTriaje.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnTriaje.setForeground(new java.awt.Color(102, 102, 102));
        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/enfermeria.jpg"))); // NOI18N
        btnTriaje.setMnemonic('t');
        btnTriaje.setText("HEMOGRAMA");
        btnTriaje.setToolTipText("F2 (Triaje)");
        btnTriaje.setFocusable(false);
        btnTriaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTriaje.setMaximumSize(new java.awt.Dimension(80, 100));
        btnTriaje.setMinimumSize(new java.awt.Dimension(50, 72));
        btnTriaje.setPreferredSize(new java.awt.Dimension(41, 50));
        btnTriaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTriaje);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator1);

        barraPrincipal.add(jToolBar2);

        btnTriaje1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnTriaje1.setForeground(new java.awt.Color(102, 102, 102));
        btnTriaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/enfermeria.jpg"))); // NOI18N
        btnTriaje1.setMnemonic('t');
        btnTriaje1.setText("HEMOGLOBINA");
        btnTriaje1.setToolTipText("F2 (Triaje)");
        btnTriaje1.setFocusable(false);
        btnTriaje1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTriaje1.setMaximumSize(new java.awt.Dimension(80, 100));
        btnTriaje1.setMinimumSize(new java.awt.Dimension(50, 72));
        btnTriaje1.setPreferredSize(new java.awt.Dimension(41, 50));
        btnTriaje1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTriaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriaje1ActionPerformed(evt);
            }
        });
        barraPrincipal.add(btnTriaje1);

        btnTriaje2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnTriaje2.setForeground(new java.awt.Color(102, 102, 102));
        btnTriaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/enfermeria.jpg"))); // NOI18N
        btnTriaje2.setMnemonic('t');
        btnTriaje2.setText("HEMATOCRITO");
        btnTriaje2.setToolTipText("F2 (Triaje)");
        btnTriaje2.setFocusable(false);
        btnTriaje2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTriaje2.setMaximumSize(new java.awt.Dimension(80, 100));
        btnTriaje2.setMinimumSize(new java.awt.Dimension(50, 72));
        btnTriaje2.setPreferredSize(new java.awt.Dimension(41, 50));
        btnTriaje2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTriaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriaje2ActionPerformed(evt);
            }
        });
        barraPrincipal.add(btnTriaje2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/server.png"))); // NOI18N
        jLabel3.setText("Estado de Servidor :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Conectado");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("CopyRight(c) 2005 -2012 NORPEC");

        lblUsuarioCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuarioCaja.setForeground(new java.awt.Color(0, 51, 102));
        lblUsuarioCaja.setText("Medsoft");

        jbarra.setMnemonic('b');
        jbarra.setText("barra");
        jbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbarraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuarioCaja)
                .addGap(311, 311, 311)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jbarra)
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jbarra)
                    .addComponent(lblUsuarioCaja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        Desktop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Desktop.setComponentPopupMenu(Menu);

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbPacientesMousePressed(evt);
            }
        });
        tbPacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbPacientesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbPacientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbPacientes);

        jTabbedPane1.addTab("PACIENTES INGRESADOS", jScrollPane1);

        Desktop.add(jTabbedPane1);
        jTabbedPane1.setBounds(280, 40, 410, 430);

        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumKeyReleased(evt);
            }
        });
        Desktop.add(txtNum);
        txtNum.setBounds(60, 0, 110, 20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        MenuOcupacional.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        btnCambiarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnCambiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnCambiarUsuario);

        jMenuItem4.setText("HABILITAR SISTEMA");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        MenuOcupacional.add(jMenu1);

        btnconfiguracionsistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnconfiguracionsistema.setText("Configuración del sistema");

        btnconfigurarservicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnconfigurarservicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermera.png"))); // NOI18N
        btnconfigurarservicios.setText("Configurar servicios");
        btnconfigurarservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfigurarserviciosActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnconfigurarservicios);

        btnAddUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnAddUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnAddUsuarios.setText("Crear Usuarios");
        btnAddUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUsuariosActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnAddUsuarios);

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnConfiguracion.setText("Configuración Global");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnConfiguracion);

        jMenuItem7.setText("IMPRIMIR FORMATOS");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(jMenuItem7);

        btnEliminarEx.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnEliminarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnEliminarEx.setText("Eliminar Examenes completos");
        btnEliminarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarExActionPerformed(evt);
            }
        });
        btnconfiguracionsistema.add(btnEliminarEx);

        MenuOcupacional.add(btnconfiguracionsistema);

        mFAgroindustrial.setForeground(new java.awt.Color(51, 0, 204));
        mFAgroindustrial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mFAgroindustrial.setText("Ficha Anexo 2");
        mFAgroindustrial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mFichaAnexo2.setForeground(new java.awt.Color(51, 0, 204));
        mFichaAnexo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grua.png"))); // NOI18N
        mFichaAnexo2.setText("Ficha Anexo 2");
        mFichaAnexo2.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaAnexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAnexo2ActionPerformed(evt);
            }
        });
        mFAgroindustrial.add(mFichaAnexo2);

        mFichaAptitudAnexo2.setForeground(new java.awt.Color(51, 0, 204));
        mFichaAptitudAnexo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitudAnexo2.setText("FichaAptitud Anexo 2");
        mFichaAptitudAnexo2.setActionCommand("FichaAptitud Agro");
        mFichaAptitudAnexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitudAnexo2ActionPerformed(evt);
            }
        });
        mFAgroindustrial.add(mFichaAptitudAnexo2);

        MenuOcupacional.add(mFAgroindustrial);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        jMenu3.setText("Reportes");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        jMenuItem1.setText("Reporte Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Reporte por meses");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        btnActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setText("Actualizar Sistema");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jMenu3.add(btnActualizar);

        MenuOcupacional.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jMenu4.setText("ASISTENCIAL");

        jMenuItem10.setText("CONSULTORIO ASISTENCIAL");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        MenuOcupacional.add(jMenu4);

        mBarrick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gold.png"))); // NOI18N
        mBarrick1.setText("Formatos Barrick");

        mCertificacionConduccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grua.png"))); // NOI18N
        mCertificacionConduccion1.setText("Certificacion de Suficiencia");
        mCertificacionConduccion1.setActionCommand("Cert. Conducción de Vehiculos");
        mCertificacionConduccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificacionConduccion1ActionPerformed(evt);
            }
        });
        mBarrick1.add(mCertificacionConduccion1);

        mCertificacionTrabajoAltura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mCertificacionTrabajoAltura1.setText("Certificacion Trabajo en Altura");
        mCertificacionTrabajoAltura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificacionTrabajoAltura1ActionPerformed(evt);
            }
        });
        mBarrick1.add(mCertificacionTrabajoAltura1);

        mUsoRespiradores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mask.png"))); // NOI18N
        mUsoRespiradores1.setText("Uso de Respiradores");
        mUsoRespiradores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUsoRespiradores1ActionPerformed(evt);
            }
        });
        mBarrick1.add(mUsoRespiradores1);

        mApnea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cama.png"))); // NOI18N
        mApnea1.setText("Apnea de Sueño");
        mApnea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApnea1ActionPerformed(evt);
            }
        });
        mBarrick1.add(mApnea1);

        mFichaRetiro1.setText("Ficha Retiro");
        mFichaRetiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaRetiro1ActionPerformed(evt);
            }
        });
        mBarrick1.add(mFichaRetiro1);

        mAptitudMedico1.setText("Actitud Medico Ocupacional");
        mAptitudMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAptitudMedico1ActionPerformed(evt);
            }
        });
        mBarrick1.add(mAptitudMedico1);

        mInformeElectrocardiogramaP.setText("Informe Electrocardiograma Poderosa");
        mInformeElectrocardiogramaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInformeElectrocardiogramaPActionPerformed(evt);
            }
        });
        mBarrick1.add(mInformeElectrocardiogramaP);
        mInformeElectrocardiogramaP.getAccessibleContext().setAccessibleName("Electrocardiograma Poderosa");

        MenuOcupacional.add(mBarrick1);

        mFSinRestriccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mFSinRestriccion.setText("Fichas Sin Restricciones");

        mFichaMedica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grua.png"))); // NOI18N
        mFichaMedica1.setText("Ficha Medica 2");
        mFichaMedica1.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaMedica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaMedica1ActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaMedica1);

        mFichaAptitud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitud1.setText("FichaAptitud 2");
        mFichaAptitud1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitud1ActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAptitud1);

        mFichaAptitudResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitudResumen.setText("ConstanciaExaMedicoOcupacional");
        mFichaAptitudResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitudResumenActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAptitudResumen);

        mFichaAlturaPoderosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAlturaPoderosa.setText("CertificadoAltura Poderosa");
        mFichaAlturaPoderosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAlturaPoderosaActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAlturaPoderosa);

        mFichaAptitudAlturaPoderosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitudAlturaPoderosa.setText("Aptitud Altura Poderosa");
        mFichaAptitudAlturaPoderosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitudAlturaPoderosaActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAptitudAlturaPoderosa);

        MenuOcupacional.add(mFSinRestriccion);

        mEliminarRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        mEliminarRegistros.setText("EliminarRegistros");

        mEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        mEliminar.setText("Eliminar Registros");
        mEliminar.setActionCommand("Cert. Conducción de Vehiculos");
        mEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarActionPerformed(evt);
            }
        });
        mEliminarRegistros.add(mEliminar);

        mValorizacionn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mValorizacionn.setText("Valorización");

        mValorizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/monedas.png"))); // NOI18N
        mValorizacion.setText("Valorizacion");
        mValorizacion.setActionCommand("Cert. Conducción de Vehiculos");
        mValorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mValorizacionActionPerformed(evt);
            }
        });
        mValorizacionn.add(mValorizacion);

        mEliminarRegistros.add(mValorizacionn);

        MenuOcupacional.add(mEliminarRegistros);

        mCovid19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mCovid19.setText("COVID-19");

        mConstanciaTamizaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConstanciaTamizaje.setText("Constancia");
        mConstanciaTamizaje.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaTamizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaTamizajeActionPerformed(evt);
            }
        });
        mCovid19.add(mConstanciaTamizaje);

        mConstanciaTamizajeMarza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConstanciaTamizajeMarza.setText("Constancia Tamizaje Marsa");
        mConstanciaTamizajeMarza.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaTamizajeMarza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaTamizajeMarzaActionPerformed(evt);
            }
        });
        mCovid19.add(mConstanciaTamizajeMarza);

        mRegistroPrueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maletin.png"))); // NOI18N
        mRegistroPrueba.setText("Registro prueba rápidas");
        mRegistroPrueba.setActionCommand("Cert. Conducción de Vehiculos");
        mRegistroPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistroPruebaActionPerformed(evt);
            }
        });
        mCovid19.add(mRegistroPrueba);

        mConstanciaMedicaCovid19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historia.png"))); // NOI18N
        mConstanciaMedicaCovid19.setText("Constancia Médica ");
        mConstanciaMedicaCovid19.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaMedicaCovid19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaMedicaCovid19ActionPerformed(evt);
            }
        });
        mCovid19.add(mConstanciaMedicaCovid19);

        mCartaCompromisoAislamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casco.png"))); // NOI18N
        mCartaCompromisoAislamiento.setText("Carta Compromiso");
        mCartaCompromisoAislamiento.setActionCommand("Cert. Conducción de Vehiculos");
        mCartaCompromisoAislamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCartaCompromisoAislamientoActionPerformed(evt);
            }
        });
        mCovid19.add(mCartaCompromisoAislamiento);

        mResultadosPruebaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mResultadosPruebaRapida.setText("Resultados Prueba Rapida");
        mResultadosPruebaRapida.setActionCommand("Cert. Conducción de Vehiculos");
        mResultadosPruebaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mResultadosPruebaRapidaActionPerformed(evt);
            }
        });
        mCovid19.add(mResultadosPruebaRapida);

        mFichasintomatologica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mFichasintomatologica.setText("Ficha Sintomatologica ");
        mFichasintomatologica.setActionCommand("Cert. Conducción de Vehiculos");
        mFichasintomatologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichasintomatologicaActionPerformed(evt);
            }
        });
        mCovid19.add(mFichasintomatologica);

        mConstanciaEncofrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mConstanciaEncofrados.setText("Constancia Encofrados");
        mConstanciaEncofrados.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaEncofrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaEncofradosActionPerformed(evt);
            }
        });
        mCovid19.add(mConstanciaEncofrados);

        mHojaReferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mHojaReferencia.setText("Hoja de Referencia");
        mHojaReferencia.setActionCommand("Cert. Conducción de Vehiculos");
        mHojaReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHojaReferenciaActionPerformed(evt);
            }
        });
        mCovid19.add(mHojaReferencia);

        mIndicacionesMedicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mIndicacionesMedicas.setText("Indicaciones Médicas");
        mIndicacionesMedicas.setActionCommand("Cert. Conducción de Vehiculos");
        mIndicacionesMedicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIndicacionesMedicasActionPerformed(evt);
            }
        });
        mCovid19.add(mIndicacionesMedicas);

        mConstanciaAltaEpidemiologica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mConstanciaAltaEpidemiologica.setText("Constancia Alta Epidemiologica");
        mConstanciaAltaEpidemiologica.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaAltaEpidemiologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaAltaEpidemiologicaActionPerformed(evt);
            }
        });
        mCovid19.add(mConstanciaAltaEpidemiologica);

        jMenuItem9.setText("LLENAR PRUEBAS MOLECULARES");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mCovid19.add(jMenuItem9);

        MenuOcupacional.add(mCovid19);

        mExamenMarsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mExamenMarsa.setText("COVID -MARSA");

        mConstanciaSaludMarsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConstanciaSaludMarsa.setText("1. Constancia Salud");
        mConstanciaSaludMarsa.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaSaludMarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaSaludMarsaActionPerformed(evt);
            }
        });
        mExamenMarsa.add(mConstanciaSaludMarsa);

        mFichaMedicaMarsa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mFichaMedicaMarsa1.setText("2. Ficha Médica");
        mFichaMedicaMarsa1.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaMedicaMarsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaMedicaMarsa1ActionPerformed(evt);
            }
        });
        mExamenMarsa.add(mFichaMedicaMarsa1);

        mFichaResultadoPrueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mFichaResultadoPrueba.setText("3. Ficha Resutados Prueba");
        mFichaResultadoPrueba.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaResultadoPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaResultadoPruebaActionPerformed(evt);
            }
        });
        mExamenMarsa.add(mFichaResultadoPrueba);

        mConstanciaAltaMarsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConstanciaAltaMarsa.setText("4. Constancia Alta");
        mConstanciaAltaMarsa.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaAltaMarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaAltaMarsaActionPerformed(evt);
            }
        });
        mExamenMarsa.add(mConstanciaAltaMarsa);

        mConsentimientoInformadoCovid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConsentimientoInformadoCovid.setText("5. Consentimiento Informado Covid");
        mConsentimientoInformadoCovid.setActionCommand("Cert. Conducción de Vehiculos");
        mConsentimientoInformadoCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsentimientoInformadoCovidActionPerformed(evt);
            }
        });
        mExamenMarsa.add(mConsentimientoInformadoCovid);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        jMenuItem3.setText("6. Certificado Medico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mExamenMarsa.add(jMenuItem3);

        MenuOcupacional.add(mExamenMarsa);

        jMenu2.setText("Tamizaje Ant");

        mConstanciaSaludMarsa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConstanciaSaludMarsa1.setText("1. Constancia Salud Antigenos");
        mConstanciaSaludMarsa1.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaSaludMarsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaSaludMarsa1ActionPerformed(evt);
            }
        });
        jMenu2.add(mConstanciaSaludMarsa1);

        mFichaMedicaMarsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mFichaMedicaMarsa.setText("2. Ficha Médica Antigenos");
        mFichaMedicaMarsa.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaMedicaMarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaMedicaMarsaActionPerformed(evt);
            }
        });
        jMenu2.add(mFichaMedicaMarsa);

        mFichaResultadoPrueba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mFichaResultadoPrueba1.setText("3. Ficha Resutados Prueba antigeno");
        mFichaResultadoPrueba1.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaResultadoPrueba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaResultadoPrueba1ActionPerformed(evt);
            }
        });
        jMenu2.add(mFichaResultadoPrueba1);

        mConstanciaAltaMarsa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConstanciaAltaMarsa1.setText("4. Constancia Alta");
        mConstanciaAltaMarsa1.setActionCommand("Cert. Conducción de Vehiculos");
        mConstanciaAltaMarsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConstanciaAltaMarsa1ActionPerformed(evt);
            }
        });
        jMenu2.add(mConstanciaAltaMarsa1);

        mConsentimientoInformadoCovid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConsentimientoInformadoCovid1.setText("5. Consentimiento Informado Covid");
        mConsentimientoInformadoCovid1.setActionCommand("Cert. Conducción de Vehiculos");
        mConsentimientoInformadoCovid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsentimientoInformadoCovid1ActionPerformed(evt);
            }
        });
        jMenu2.add(mConsentimientoInformadoCovid1);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        jMenuItem8.setText("6. DESCANSO Medico Antigeno");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem6.setText("Constancia tamizaje");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("LABORATORIO COVID");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        MenuOcupacional.add(jMenu2);

        jMNuevosFormatos.setText("Formatos");

        mEvaluaciónMuscoloEsqueletico2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mEvaluaciónMuscoloEsqueletico2021.setText("1. EvaluaciónMuscoloEsqueletico");
        mEvaluaciónMuscoloEsqueletico2021.setActionCommand("Cert. Conducción de Vehiculos");
        mEvaluaciónMuscoloEsqueletico2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEvaluaciónMuscoloEsqueletico2021ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mEvaluaciónMuscoloEsqueletico2021);

        mCuestionarioCalidadSueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mCuestionarioCalidadSueño.setText("2. CuestionarioCalidadSueño");
        mCuestionarioCalidadSueño.setActionCommand("Cert. Conducción de Vehiculos");
        mCuestionarioCalidadSueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCuestionarioCalidadSueñoActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mCuestionarioCalidadSueño);

        mTestFatigaSomnolencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mTestFatigaSomnolencia.setText("3. TestFatigaSomnolencia");
        mTestFatigaSomnolencia.setActionCommand("Cert. Conducción de Vehiculos");
        mTestFatigaSomnolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTestFatigaSomnolenciaActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mTestFatigaSomnolencia);

        mFichaAudiometrica2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mFichaAudiometrica2021.setText("4. Ficha Audiométrica");
        mFichaAudiometrica2021.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaAudiometrica2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAudiometrica2021ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mFichaAudiometrica2021);

        mEvaluacionOftalmologica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mEvaluacionOftalmologica.setText("5. Evaluacion Oftalmologica");
        mEvaluacionOftalmologica.setActionCommand("Cert. Conducción de Vehiculos");
        mEvaluacionOftalmologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEvaluacionOftalmologicaActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mEvaluacionOftalmologica);

        mCertificadoManipuladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mCertificadoManipuladores.setText("6. Certificado Manipuladores");
        mCertificadoManipuladores.setActionCommand("Cert. Conducción de Vehiculos");
        mCertificadoManipuladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificadoManipuladoresActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mCertificadoManipuladores);

        mExamenesLaboratorio2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mExamenesLaboratorio2021.setText("7. Examenes Laboratorio 2021");
        mExamenesLaboratorio2021.setActionCommand("Cert. Conducción de Vehiculos");
        mExamenesLaboratorio2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExamenesLaboratorio2021ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mExamenesLaboratorio2021);

        MenuOcupacional.add(jMNuevosFormatos);

        setJMenuBar(MenuOcupacional);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    
   }//GEN-LAST:event_jMenu1ActionPerformed

   private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  
   }//GEN-LAST:event_jMenuItem1ActionPerformed

   private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
   int seleccion = JOptionPane.showOptionDialog(this, "Desea Salir del Sistema","Seleccione su Opción", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"si","no"},"si");
      if(seleccion != -1)
      {
         if((seleccion + 1)==1)
         {
            System.exit(0);
         }
         else
         {
         }
      }
   }//GEN-LAST:event_btnSalirActionPerformed

   private void btnconfigurarserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfigurarserviciosActionPerformed
       // if(estacerrado(cs)){             
       //   Sistema.Desktop.add(cs);
       //   ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
       //   cs.setFrameIcon(ticon);
       //   cs.setLocation(centradoXY(cs));
       //    cs.show();
       // }
       //      else{
       //    cs.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
       // }
   }//GEN-LAST:event_btnconfigurarserviciosActionPerformed

   private void btnTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriajeActionPerformed
         
        
       if(estacerrado(ft)){   
         ft = new FichaTriaje();  
          Asistencial.Desktop.add(ft);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          ft.setFrameIcon(ticon);
          ft.setLocation(centradoXY(ft));

           ft.show();
         // ft.setVisible(true);
       }
             else{
           ft.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
   }//GEN-LAST:event_btnTriajeActionPerformed

   private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
                        Ingreso i = new Ingreso();
                        i.setVisible(true);
                        this.dispose();
                       
                        
                      
   }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

   private void jbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbarraActionPerformed
    if (jbarra.isSelected()){
     barraPrincipal.setVisible(false);
    }else{
       barraPrincipal.setVisible(true);
    
   }
   }//GEN-LAST:event_jbarraActionPerformed

    private void ConsentimientoDosajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsentimientoDosajeActionPerformed
      
        if(estacerrado(cmc)){ 
             cmc = new ConsentimientoDosajeMC();
          Asistencial.Desktop.add(cmc);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cmc.setFrameIcon(ticon);
          cmc.setLocation(centradoXY(cmc));

           cmc.show();
         // cmc.setVisible(true);
       }
             else{
           cmc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_ConsentimientoDosajeActionPerformed

    private void A_CertificacionTrabajoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_CertificacionTrabajoAlturaActionPerformed
        
        if(estacerrado(cmta)){ 
            cmta =new A_CertificacionMedicaTrabajoAltura();
          Asistencial.Desktop.add(cmta);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cmta.setFrameIcon(ticon);
          cmta.setLocation(centradoXY(cmta));

          cmta.show();
          //cmta.setVisible(true);
       }
             else{
           cmta.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_A_CertificacionTrabajoAlturaActionPerformed

    private void PerimetroToraxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimetroToraxicoActionPerformed
        if(estacerrado(pmt)){  
            pmt = new PerimetroToraxico();
          Asistencial.Desktop.add(pmt);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         pmt.setFrameIcon(ticon);
          pmt.setLocation(centradoXY(pmt));

           pmt.show();
          //ra.setVisible(true);
       }
             else{
           pmt.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_PerimetroToraxicoActionPerformed

    private void FichaSaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaSaSActionPerformed
        
        if(estacerrado(fs)){
            fs =new DetecciondeSAS();
          Desktop.add(fs);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fs.setFrameIcon(ticon);
      fs.setLocation(centradoXY(fs));

          fs.show();
          //fs.setVisible(true);
       }
             else{
         fs.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
    }//GEN-LAST:event_FichaSaSActionPerformed

    private void LaboratorioClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaboratorioClinicoActionPerformed
           if(estacerrado(an)){   
            an = new LaboratorioClinico(); 
          Asistencial.Desktop.add(an);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         an.setFrameIcon(ticon);
        //  an.setLocation(centradoXY(an));
           an.show();
         // an.setVisible(true);
       }
             else{
           an.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
    }//GEN-LAST:event_LaboratorioClinicoActionPerformed

    private void FuncionRespiratoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionRespiratoriaActionPerformed
       
        if(estacerrado(fn)){  
          fn =new FuncionRespiratoriaABS();
          Desktop.add(fn);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fn.setFrameIcon(ticon);
      fn.setLocation(centradoXY(fn));

          fn.show();
          //fn.setVisible(true);
       }
             else{
         fn.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_FuncionRespiratoriaActionPerformed

    private void btnAddUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUsuariosActionPerformed
         SistemasUsuarios as = new SistemasUsuarios();
              as.setLocationRelativeTo(null);

            as.setVisible(true);
    }//GEN-LAST:event_btnAddUsuariosActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        if(estacerrado(cf)){  
          cf =new Configurar();
          Desktop.add(cf);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cf.setFrameIcon(ticon);
      cf.setLocation(centradoXY(cf));

          cf.show();
          //fn.setVisible(true);
       }
             else{
         cf.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnHCLPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHCLPSActionPerformed
        if(estacerrado(hcl)){  
          hcl =new HistoriaClinicaPs();
          Desktop.add(hcl);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         hcl.setFrameIcon(ticon);
      hcl.setLocation(centradoXY(hcl));

          hcl.show();
          //fn.setVisible(true);
       }
             else{
         hcl.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHCLPSActionPerformed

    private void btnHCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHCLActionPerformed
         if(estacerrado(his)){  
          his =new HCL();
          Desktop.add(his);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         his.setFrameIcon(ticon);
      his.setLocation(centradoXY(his));

          his.show();
          //fn.setVisible(true);
       }
             else{
         his.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHCLActionPerformed

    private void btnHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHCActionPerformed
         if(estacerrado(hcO)){  
          hcO =new HistorialPacientes();
          Desktop.add(hcO);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         hcO.setFrameIcon(ticon);
      hcO.setLocation(centradoXY(hcO));

          hcO.show();
          //fn.setVisible(true);
       }
             else{
         hcO.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHCActionPerformed

    private void btnEliminarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarExActionPerformed
         if(estacerrado(Exc)){  
          Exc =new Eliminar();
          Desktop.add(Exc);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         Exc.setFrameIcon(ticon);
      Exc.setLocation(centradoXY(Exc));

          Exc.show();
          //fn.setVisible(true);
       }
             else{
         Exc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnEliminarExActionPerformed

    private void ConsentimientoInformadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsentimientoInformadoActionPerformed
        if(estacerrado(coi)){  
          coi =new ConsentimientoInformado();
          Desktop.add(coi);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         coi.setFrameIcon(ticon);
      coi.setLocation(centradoXY(coi));

          coi.show();
          //fn.setVisible(true);
       }
             else{
         coi.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_ConsentimientoInformadoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Actualizar a = new Actualizar(null,true);
            a.setVisible(true);
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void mCertificacionConduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificacionConduccionActionPerformed
         if(estacerrado(b_cercon)){  
          b_cercon =new B_Certificacion_conduccion();
          Desktop.add(b_cercon);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         b_cercon.setFrameIcon(ticon);
      b_cercon.setLocation(centradoXY(b_cercon));

          b_cercon.show();
          //fn.setVisible(true);
       }
             else{
         b_cercon.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificacionConduccionActionPerformed

    private void mCertificacionTrabajoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificacionTrabajoAlturaActionPerformed
        if(estacerrado(b_ceral)){   
         b_ceral = new B_Certificacion_Trabajo_Altura();  
          Asistencial.Desktop.add(b_ceral);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_ceral.setFrameIcon(ticon);
          b_ceral.setLocation(centradoXY(b_ceral));

           b_ceral.show();
         // ft.setVisible(true);
       }
             else{
           b_ceral.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificacionTrabajoAlturaActionPerformed

    private void mUsoRespiradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsoRespiradoresActionPerformed
         if(estacerrado(b_uso)){   
         b_uso = new B_Uso_Respiradores();  
          Asistencial.Desktop.add(b_uso);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_uso.setFrameIcon(ticon);
          b_uso.setLocation(centradoXY(b_uso));

           b_uso.show();
         // ft.setVisible(true);
       }
             else{
           b_uso.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mUsoRespiradoresActionPerformed

    private void mApneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApneaActionPerformed
        if(estacerrado(b_sas)){   
         b_sas = new b_Ficha_Sas();  
          Asistencial.Desktop.add(b_sas);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_sas.setFrameIcon(ticon);
          b_sas.setLocation(centradoXY(b_sas));

           b_sas.show();
         // ft.setVisible(true);
       }
             else{
           b_sas.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mApneaActionPerformed

    private void AnalisisBioquimicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisisBioquimicosActionPerformed
         if(estacerrado(lca)){
            lca =new AnalisisBioquimico();
          Desktop.add(lca);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         lca.setFrameIcon(ticon);
      lca.setLocation(centradoXY(lca));

          lca.show();
          //lca.setVisible(true);
       }
             else{
         lca.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_AnalisisBioquimicosActionPerformed

    private void frmConalviasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmConalviasActionPerformed
       
               if(estacerrado(frm_conal)){   
         frm_conal = new Frm_conalvias();  
          Asistencial.Desktop.add(frm_conal);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_conal.setFrameIcon(ticon);
          frm_conal.setLocation(centradoXY(frm_conal));

           frm_conal.show();
         // ft.setVisible(true);
       }
             else{
           frm_conal.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_frmConalviasActionPerformed

    private void mFichaRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaRetiroActionPerformed
        if(estacerrado(frm_constancia)){   
         frm_constancia = new ConstanciaRetiro();  
          Asistencial.Desktop.add(frm_constancia);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_constancia.setFrameIcon(ticon);
          frm_constancia.setLocation(centradoXY(frm_constancia));

           frm_constancia.show();
         // ft.setVisible(true);
       }
             else{
           frm_constancia.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaRetiroActionPerformed

    private void mAptitudMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAptitudMedicoActionPerformed
        if(estacerrado(frm_aptitud)){   
         frm_aptitud = new Aptitud_Medico_Ocupacional();  
          Asistencial.Desktop.add(frm_aptitud);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_aptitud.setFrameIcon(ticon);
          frm_aptitud.setLocation(centradoXY(frm_aptitud));

           frm_aptitud.show();
         // ft.setVisible(true);
       }
             else{
           frm_aptitud.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mAptitudMedicoActionPerformed

    private void AudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudiometriaActionPerformed
        if(estacerrado(au)){ 
            au = new Audiometria();
          Asistencial.Desktop.add(au);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         au.setFrameIcon(ticon);
          au.setLocation(centradoXY(au));
          //  au.setVisible(true);
          au.show();
       }
             else{
           au.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_AudiometriaActionPerformed

    private void mCertificacionConduccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificacionConduccion1ActionPerformed
       if(estacerrado(b_cercon)){  
          b_cercon =new B_Certificacion_conduccion();
          Desktop.add(b_cercon);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         b_cercon.setFrameIcon(ticon);
      b_cercon.setLocation(centradoXY(b_cercon));

          b_cercon.show();
          //fn.setVisible(true);
       }
             else{
         b_cercon.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificacionConduccion1ActionPerformed

    private void mCertificacionTrabajoAltura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificacionTrabajoAltura1ActionPerformed
        if(estacerrado(b_ceral)){   
         b_ceral = new B_Certificacion_Trabajo_Altura();  
          Asistencial.Desktop.add(b_ceral);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_ceral.setFrameIcon(ticon);
          b_ceral.setLocation(centradoXY(b_ceral));

           b_ceral.show();
         // ft.setVisible(true);
       }
             else{
           b_ceral.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificacionTrabajoAltura1ActionPerformed

    private void mUsoRespiradores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUsoRespiradores1ActionPerformed
        if(estacerrado(b_uso)){   
         b_uso = new B_Uso_Respiradores();  
          Asistencial.Desktop.add(b_uso);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_uso.setFrameIcon(ticon);
          b_uso.setLocation(centradoXY(b_uso));

           b_uso.show();
         // ft.setVisible(true);
       }
             else{
           b_uso.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mUsoRespiradores1ActionPerformed

    private void mApnea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApnea1ActionPerformed
         if(estacerrado(b_sas)){   
         b_sas = new b_Ficha_Sas();  
          Asistencial.Desktop.add(b_sas);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_sas.setFrameIcon(ticon);
          b_sas.setLocation(centradoXY(b_sas));

           b_sas.show();
         // ft.setVisible(true);
       }
             else{
           b_sas.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mApnea1ActionPerformed

    private void mFichaRetiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaRetiro1ActionPerformed
       if(estacerrado(frm_constancia)){   
         frm_constancia = new ConstanciaRetiro();  
          Asistencial.Desktop.add(frm_constancia);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_constancia.setFrameIcon(ticon);
          frm_constancia.setLocation(centradoXY(frm_constancia));

           frm_constancia.show();
         // ft.setVisible(true);
       }
             else{
           frm_constancia.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaRetiro1ActionPerformed

    private void mAptitudMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAptitudMedico1ActionPerformed
        if(estacerrado(frm_aptitud)){   
         frm_aptitud = new Aptitud_Medico_Ocupacional();  
          Asistencial.Desktop.add(frm_aptitud);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_aptitud.setFrameIcon(ticon);
          frm_aptitud.setLocation(centradoXY(frm_aptitud));

           frm_aptitud.show();
         // ft.setVisible(true);
       }
             else{
           frm_aptitud.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mAptitudMedico1ActionPerformed

    private void ObservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObservadosActionPerformed
//        if(estacerrado(obs)){ 
//             obs = new Observados();
//          Ocupacional1.Desktop.add(obs);
//          
//        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
//         obs.setFrameIcon(ticon);
//          obs.setLocation(centradoXY(obs));
//
//           obs.show();
//         // cmc.setVisible(true);
//       }
//             else{
//           obs.moveToFront();
//         
//          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
//        }
    }//GEN-LAST:event_ObservadosActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        if(estacerrado(re)){             
          Asistencial.Desktop.add(re);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          re.setFrameIcon(ticon);
          re.setLocation(centradoXY(re));
         //try {
           // t.setMaximum(true);
         //} catch (PropertyVetoException ex) {
           // Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
         //}
           re.show();
       }
             else{
           re.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_ReporteActionPerformed

    private void InformePsicologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformePsicologiaActionPerformed
        if (estacerrado(ips)) {
         ips   = new InformePsicologico();
         Asistencial.Desktop.add(ips);

         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ips.setFrameIcon(ticon);
         ips.setLocation(centradoXY(ips));

         ips.show();
         //ips.setVisible(true);
      } else {
         ips.moveToFront();

         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_InformePsicologiaActionPerformed

    private void TestPsicologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestPsicologicoActionPerformed
         if (estacerrado(te)) {
           te = new TestPsicologico();
         Asistencial.Desktop.add(te);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         te.setFrameIcon(ticon);
         te.setLocation(centradoXY(te));
         te.show();
         //te.setVisible(true);
      } else {
         te.moveToFront();
         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_TestPsicologicoActionPerformed

    private void PacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacientesActionPerformed
        if (estacerrado(pe)) {
            pe = new BuscarUsuarios();
         Asistencial.Desktop.add(pe);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         pe.setFrameIcon(ticon);
         pe.setLocation(centradoXY(pe));
         pe.show();
         //pe.setVisible(true);
      } else {
         pe.moveToFront();
         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_PacientesActionPerformed

    private void InformeAudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeAudiometriaActionPerformed
         if(estacerrado(ia)){ 
             ia = new InformeAudiometria();
          Asistencial.Desktop.add(ia);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ia.setFrameIcon(ticon);
          ia.setLocation(centradoXY(ia));

           ia.show();
         // cmc.setVisible(true);
       }
             else{
           ia.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_InformeAudiometriaActionPerformed

    private void CuestionarioAudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuestionarioAudiometriaActionPerformed
        if(estacerrado(ca)){ 
             ca = new CuestionarioAudiometria();
          Asistencial.Desktop.add(ca);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ca.setFrameIcon(ticon);
          ca.setLocation(centradoXY(ca));

           ca.show();
         // cmc.setVisible(true);
       }
             else{
           ca.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_CuestionarioAudiometriaActionPerformed

    private void mFichaMedica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaMedica1ActionPerformed
      if(estacerrado(fm1)){  
          fm1 =new FichaMedica1();
          Desktop.add(fm1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fm1.setFrameIcon(ticon);
      fm1.setLocation(centradoXY(fm1));

          fm1.show();
          //fn.setVisible(true);
       }
             else{
         fm1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
    }//GEN-LAST:event_mFichaMedica1ActionPerformed

    private void mFichaAptitud1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitud1ActionPerformed
        if(estacerrado(frm_aptitud1)){  
          frm_aptitud1 =new Aptitud_Medico_Ocupacional1();
          Desktop.add(frm_aptitud1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frm_aptitud1.setFrameIcon(ticon);
      frm_aptitud1.setLocation(centradoXY(frm_aptitud1));

          frm_aptitud1.show();
          //fn.setVisible(true);
       }
             else{
         frm_aptitud1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitud1ActionPerformed

    private void mFichaAptitudResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitudResumenActionPerformed
        if(estacerrado(frm_aptitud2)){  
          frm_aptitud2 =new Aptitud_Medico_Ocupacional2();
          Desktop.add(frm_aptitud2);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frm_aptitud2.setFrameIcon(ticon);
      frm_aptitud2.setLocation(centradoXY(frm_aptitud2));

          frm_aptitud2.show();
          //fn.setVisible(true);
       }
             else{
         frm_aptitud2.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitudResumenActionPerformed

    private void mEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarActionPerformed
     if(estacerrado(Exc)){  
          Exc =new Eliminar();
          Desktop.add(Exc);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         Exc.setFrameIcon(ticon);
      Exc.setLocation(centradoXY(Exc));

          Exc.show();
          //fn.setVisible(true);
       }
             else{
         Exc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mEliminarActionPerformed

    private void mValorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mValorizacionActionPerformed
        if(estacerrado(val)){  
          val =new Valorizacion();
          Desktop.add(val);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         val.setFrameIcon(ticon);
      val.setLocation(centradoXY(val));

          val.show();
          //fn.setVisible(true);
       }
             else{
         val.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mValorizacionActionPerformed

    private void Anexo7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anexo7DActionPerformed
       if (estacerrado(an7)) {
            an7 = new Anexo7D();
         Asistencial.Desktop.add(an7);
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         an7.setFrameIcon(ticon);
         an7.setLocation(centradoXY(an7));
         an7.show();
         //pe.setVisible(true);
      } else {
         an7.moveToFront();
         //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
      }
    }//GEN-LAST:event_Anexo7DActionPerformed

    private void mFichaAptitudAnexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitudAnexo2ActionPerformed
        if(estacerrado(frm_aptitudagro)){  
          frm_aptitudagro =new Aptitud_Medico_Ocupacional_Agro();
          Desktop.add(frm_aptitudagro);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frm_aptitudagro.setFrameIcon(ticon);
      frm_aptitudagro.setLocation(centradoXY(frm_aptitudagro));

          frm_aptitudagro.show();
          //fn.setVisible(true);
       }
             else{
         frm_aptitudagro.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitudAnexo2ActionPerformed

    private void mFichaAnexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAnexo2ActionPerformed
         if(estacerrado(frm_agro)){  
          frm_agro =new FichaAgroindustriales();
          Desktop.add(frm_agro);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frm_agro.setFrameIcon(ticon);
      frm_agro.setLocation(centradoXY(frm_agro));

          frm_agro.show();
          //fn.setVisible(true);
       }
             else{
         frm_agro.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAnexo2ActionPerformed

    private void mInformeElectrocardiogramaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInformeElectrocardiogramaPActionPerformed
        if(estacerrado(frm_electropoderosa)){   
         frm_electropoderosa = new ElectroCardiogramaPoderosa();  
          Asistencial.Desktop.add(frm_electropoderosa);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          frm_electropoderosa.setFrameIcon(ticon);
          frm_electropoderosa.setLocation(centradoXY(frm_electropoderosa));

           frm_electropoderosa.show();
         // ft.setVisible(true);
       }
             else{
           frm_electropoderosa.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mInformeElectrocardiogramaPActionPerformed

    private void mFichaAlturaPoderosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAlturaPoderosaActionPerformed
        if(estacerrado(c_alt_poderosa)){  
          c_alt_poderosa =new Certificacion_Trabajo_Altura_Poderosa();
          Desktop.add(c_alt_poderosa);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         c_alt_poderosa.setFrameIcon(ticon);
      c_alt_poderosa.setLocation(centradoXY(c_alt_poderosa));

          c_alt_poderosa.show();
          //fn.setVisible(true);
       }
             else{
         c_alt_poderosa.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAlturaPoderosaActionPerformed

    private void mFichaAptitudAlturaPoderosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitudAlturaPoderosaActionPerformed
        if(estacerrado(apt_al_P)){  
          apt_al_P =new Aptitud_Altura_Poderosa();
          Desktop.add(apt_al_P);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         apt_al_P.setFrameIcon(ticon);
      apt_al_P.setLocation(centradoXY(apt_al_P));

          apt_al_P.show();
          //fn.setVisible(true);
       }
             else{
         apt_al_P.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitudAlturaPoderosaActionPerformed

    private void FichaMedicaAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaMedicaAgroActionPerformed
        if(estacerrado(ane)){ 
            ane = new Anexo_02();
          Asistencial.Desktop.add(ane);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ane.setFrameIcon(ticon);
          ane.setLocation(centradoXY(ane));
          //  au.setVisible(true);
          ane.show();
       }
             else{
           ane.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_FichaMedicaAgroActionPerformed

    private void AptitudAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AptitudAgroActionPerformed
        if(estacerrado(apanex2)){ 
            apanex2 = new Aptitud_Anexo02();
          Asistencial.Desktop.add(apanex2);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         apanex2.setFrameIcon(ticon);
          apanex2.setLocation(centradoXY(apanex2));
          //  au.setVisible(true);
          apanex2.show();
       }
             else{
           apanex2.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_AptitudAgroActionPerformed

    private void mConstanciaTamizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaTamizajeActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ctv)){  
          ctv =new Constancia_Tamizaje_COVID19();
          Desktop.add(ctv);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ctv.setFrameIcon(ticon);
      ctv.setLocation(centradoXY(ctv));

          ctv.show();
          //fn.setVisible(true);
       }
             else{
         ctv.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaTamizajeActionPerformed

    private void mRegistroPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistroPruebaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(rpr)){  
          rpr =new Registro_Pruebas_Rapidas_F100();
          Desktop.add(rpr);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         rpr.setFrameIcon(ticon);
      rpr.setLocation(centradoXY(rpr));

          rpr.show();
          //fn.setVisible(true);
       }
             else{
         rpr.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mRegistroPruebaActionPerformed

    private void mConstanciaMedicaCovid19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaMedicaCovid19ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(cc19)){  
          cc19 =new ConstanciaCovid19();
          Desktop.add(cc19);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cc19.setFrameIcon(ticon);
      cc19.setLocation(centradoXY(cc19));

          cc19.show();
          //fn.setVisible(true);
       }
             else{
         cc19.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaMedicaCovid19ActionPerformed

    private void mCartaCompromisoAislamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCartaCompromisoAislamientoActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ccc19)){  
          ccc19 =new CartaCompromisoAislamiento();
          Desktop.add(ccc19);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ccc19.setFrameIcon(ticon);
      ccc19.setLocation(centradoXY(ccc19));

          ccc19.show();
          //fn.setVisible(true);
       }
             else{
         ccc19.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCartaCompromisoAislamientoActionPerformed

    private void mResultadosPruebaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mResultadosPruebaRapidaActionPerformed
        // TODO add your handling code here:
         if(estacerrado(rpra)){  
          rpra =new Resultados_Pruebas_Rapidas();
          Desktop.add(rpra);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         rpra.setFrameIcon(ticon);
      rpra.setLocation(centradoXY(rpra));
          rpra.show();
          //fn.setVisible(true);
       }
             else{
         rpra.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mResultadosPruebaRapidaActionPerformed

    private void mFichasintomatologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichasintomatologicaActionPerformed
        // TODO add your handling code here:
          if(estacerrado(fsc)){  
          fsc =new FichaSintomatologiaCovid19();
          Desktop.add(fsc);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fsc.setFrameIcon(ticon);
      fsc.setLocation(centradoXY(fsc));

          fsc.show();
          //fn.setVisible(true);
       }
             else{
         fsc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichasintomatologicaActionPerformed

    private void mConstanciaEncofradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaEncofradosActionPerformed
        // TODO add your handling code here:
         if(estacerrado(ce)){  
          ce =new ConstanciaEncofrados();
          Desktop.add(ce);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ce.setFrameIcon(ticon);
      ce.setLocation(centradoXY(ce));

          ce.show();
          //fn.setVisible(true);
       }
             else{
         ce.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaEncofradosActionPerformed

    private void mHojaReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHojaReferenciaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(fr)){  
          fr =new FichaReferencia();
          Desktop.add(fr);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fr.setFrameIcon(ticon);
      fr.setLocation(centradoXY(fr));

          fr.show();
          //fn.setVisible(true);
       }
             else{
         fr.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mHojaReferenciaActionPerformed

    private void mIndicacionesMedicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIndicacionesMedicasActionPerformed
        // TODO add your handling code here:
        if(estacerrado(im)){  
          im =new IndicacionesMedicas();
          Desktop.add(im);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         im.setFrameIcon(ticon);
      im.setLocation(centradoXY(im));

          im.show();
          //fn.setVisible(true);
       }
             else{
         im.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mIndicacionesMedicasActionPerformed

    private void mConstanciaAltaEpidemiologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaAltaEpidemiologicaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(cae)){  
          cae =new ConstanciaAltaEpidemiologica();
          Desktop.add(cae);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cae.setFrameIcon(ticon);
      cae.setLocation(centradoXY(cae));

          cae.show();
          //fn.setVisible(true);
       }
             else{
         cae.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaAltaEpidemiologicaActionPerformed

    private void mConstanciaTamizajeMarzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaTamizajeMarzaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ctvm)){  
          ctvm =new Constancia_Tamizaje_COVID19_marza();
          Desktop.add(ctvm);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         ctvm.setFrameIcon(ticon);
      ctvm.setLocation(centradoXY(ctvm));

          ctvm.show();
          //fn.setVisible(true);
       }
             else{
         ctvm.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaTamizajeMarzaActionPerformed

    private void mFichaMedicaMarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaMedicaMarsaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(fmm1)){  
          fmm1 =new FichaMedicaMarsa1();
          Desktop.add(fmm1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fmm1.setFrameIcon(ticon);
      fmm1.setLocation(centradoXY(fmm1));

          fmm1.show();
          //fn.setVisible(true);
       }
             else{
         fmm1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaMedicaMarsaActionPerformed

    private void mConstanciaSaludMarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaSaludMarsaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(csm)){  
          csm =new ConstanciaSaludMarsa();
          Desktop.add(csm);          
          ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          csm.setFrameIcon(ticon);
          csm.setLocation(centradoXY(csm));

          csm.show();
          //fn.setVisible(true);
       }
             else{
         csm.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaSaludMarsaActionPerformed

    private void mConstanciaAltaMarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaAltaMarsaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(cam)){  
          cam =new ConstanciaAltaMarsa();
          Desktop.add(cam);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cam.setFrameIcon(ticon);
      cam.setLocation(centradoXY(cam));

          cam.show();
          //fn.setVisible(true);
       }
             else{
         cam.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaAltaMarsaActionPerformed

    private void mFichaResultadoPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaResultadoPruebaActionPerformed
        // TODO add your handling code here:
         if(estacerrado(frpr)){  
          frpr =new Ficha_Resultados_Pruebas_Rapidas_CovidF100();
          Desktop.add(frpr);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frpr.setFrameIcon(ticon);
      frpr.setLocation(centradoXY(frpr));

          frpr.show();
          //fn.setVisible(true);
       }
             else{
         frpr.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaResultadoPruebaActionPerformed

    private void mConsentimientoInformadoCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsentimientoInformadoCovidActionPerformed
        // TODO add your handling code here:
        if(estacerrado(cic)){  
          cic =new ConsentimientoInformadoCovid();
          Desktop.add(cic);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cic.setFrameIcon(ticon);
      cic.setLocation(centradoXY(cic));

          cic.show();
          //fn.setVisible(true);
       }
             else{
         cic.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConsentimientoInformadoCovidActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        contanciaSaludCovid obt = new contanciaSaludCovid();
        obt.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
                sbSubHabilitaOpciones();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

           if(estacerrado(frm_agro)){  
          lab =new LaboratorioClinicoCovid();
          Desktop.add(lab);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         lab.setFrameIcon(ticon);
      lab.setLocation(centradoXY(lab));

          lab.show();
          //fn.setVisible(true);
       }
             else{
         lab.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
      //  LaboratorioClinico obt= new LaboratorioClinico();
     //obt.setVisible(true);
          
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
      
          
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    constanciaTamizajeAntigeno obj = new constanciaTamizajeAntigeno();
    obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        imprimirformatos obt=new imprimirformatos();
        obt.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void mConstanciaSaludMarsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaSaludMarsa1ActionPerformed
          if(estacerrado(csm1)){  
          csm1 =new ConstanciaSaludMarsa1();
          Desktop.add(csm1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         csm1.setFrameIcon(ticon);
      csm1.setLocation(centradoXY(csm1));

          csm1.show();
          //fn.setVisible(true);
       }
             else{
         csm1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaSaludMarsa1ActionPerformed

    private void mFichaMedicaMarsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaMedicaMarsa1ActionPerformed
         if(estacerrado(fmm)){  
          fmm =new FichaMedicaMarsa();
          Desktop.add(fmm);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fmm.setFrameIcon(ticon);
      fmm.setLocation(centradoXY(fmm));

          fmm.show();
          //fn.setVisible(true);
       }
             else{
         fmm.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaMedicaMarsa1ActionPerformed

    private void mFichaResultadoPrueba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaResultadoPrueba1ActionPerformed
    if(estacerrado(frpr1)){  
          frpr1 =new Ficha_Resultados_Pruebas_Rapidas_CovidF1001();
          Desktop.add(frpr1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frpr1.setFrameIcon(ticon);
      frpr1.setLocation(centradoXY(frpr1));

          frpr1.show();
          //fn.setVisible(true);
       }
             else{
         frpr1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }    }//GEN-LAST:event_mFichaResultadoPrueba1ActionPerformed

    private void mConstanciaAltaMarsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConstanciaAltaMarsa1ActionPerformed
           if(estacerrado(cam1)){  
          cam1 =new ConstanciaAltaMarsa1();
          Desktop.add(cam1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cam1.setFrameIcon(ticon);
      cam1.setLocation(centradoXY(cam1));

          cam1.show();
          //fn.setVisible(true);
       }
             else{
         cam1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConstanciaAltaMarsa1ActionPerformed

    private void mConsentimientoInformadoCovid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsentimientoInformadoCovid1ActionPerformed
         if(estacerrado(cic1)){  
          cic1 =new ConsentimientoInformadoCovid1();
          Desktop.add(cic1);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cic1.setFrameIcon(ticon);
      cic1.setLocation(centradoXY(cic1));

          cic1.show();
          //fn.setVisible(true);
       }
             else{
         cic1.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConsentimientoInformadoCovid1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
 contanciaSaludCovid1 obt = new contanciaSaludCovid1();
        obt.setVisible(true);    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        pruebamolecular objeto= new pruebamolecular();
        objeto.setVisible(true);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
     Servicios objt=new Servicios();
     objt.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void mEvaluaciónMuscoloEsqueletico2021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEvaluaciónMuscoloEsqueletico2021ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(eme2021)){  
           eme2021 =new EvaluacionMusculoEsqueletica2021();
           Desktop.add(eme2021);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           eme2021.setFrameIcon(ticon);
           eme2021.setLocation(centradoXY(eme2021));
           eme2021.show();
          //fn.setVisible(true);
        }else{
         eme2021.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mEvaluaciónMuscoloEsqueletico2021ActionPerformed

    private void mCuestionarioCalidadSueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCuestionarioCalidadSueñoActionPerformed
        // TODO add your handling code here:
         if(estacerrado(ccs2021)){  
           ccs2021 =new CuestionarioCalidadSueno();
           Desktop.add(ccs2021);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           ccs2021.setFrameIcon(ticon);
           ccs2021.setLocation(centradoXY(ccs2021));
           ccs2021.show();
          //fn.setVisible(true);
        }else{
         ccs2021.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCuestionarioCalidadSueñoActionPerformed

    private void mTestFatigaSomnolenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTestFatigaSomnolenciaActionPerformed
        // TODO add your handling code here:
        
        if(estacerrado(tfs2021)){  
           tfs2021 =new TestFatigaSomnolencia();
           Desktop.add(tfs2021);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           tfs2021.setFrameIcon(ticon);
           tfs2021.setLocation(centradoXY(tfs2021));
           tfs2021.show();
          //fn.setVisible(true);
        }else{
         tfs2021.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mTestFatigaSomnolenciaActionPerformed

    private void mFichaAudiometrica2021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAudiometrica2021ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(audio2021)){  
           audio2021 =new Audiometria2021();
           Desktop.add(audio2021);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           audio2021.setFrameIcon(ticon);
           audio2021.setLocation(centradoXY(audio2021));
           audio2021.show();
          //fn.setVisible(true);
        }else{
         audio2021.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAudiometrica2021ActionPerformed

    private void mEvaluacionOftalmologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEvaluacionOftalmologicaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(evof2021)){  
           evof2021 =new EvaluacionOftalmologica();
           Desktop.add(evof2021);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           evof2021.setFrameIcon(ticon);
           evof2021.setLocation(centradoXY(evof2021));
           evof2021.show();
          //fn.setVisible(true);
        }else{
         evof2021.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mEvaluacionOftalmologicaActionPerformed

    private void mCertificadoManipuladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCertificadoManipuladoresActionPerformed
        // TODO add your handling code here:
        if(estacerrado(cmb)){  
           cmb =new CertificadoManipuladoresBarrick();
           Desktop.add(cmb);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           cmb.setFrameIcon(ticon);
           cmb.setLocation(centradoXY(cmb));
           cmb.show();
          //fn.setVisible(true);
        }else{
         cmb.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCertificadoManipuladoresActionPerformed

    private void mExamenesLaboratorio2021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mExamenesLaboratorio2021ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(el2021)){  
           el2021 =new ExamenesLaboratorio2021();
           Desktop.add(el2021);          
           ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
           el2021.setFrameIcon(ticon);
           el2021.setLocation(centradoXY(el2021));
           el2021.show();
          //fn.setVisible(true);
        }else{
         el2021.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mExamenesLaboratorio2021ActionPerformed

    private void LaboratorioClinicoAsistencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaboratorioClinicoAsistencialActionPerformed
        // TODO add your handling code here:
        if(estacerrado(laba)){   
            laba = new LaboratorioClinicoAsistencial(); 
          Asistencial.Desktop.add(laba);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         laba.setFrameIcon(ticon);
        //  an.setLocation(centradoXY(an));
           laba.show();
         // an.setVisible(true);
       }
             else{
           laba.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_LaboratorioClinicoAsistencialActionPerformed

    private void btnTriaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriaje1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTriaje1ActionPerformed

    private void btnTriaje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriaje2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTriaje2ActionPerformed

    private void tbPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacientesMousePressed

        try {
            if (evt.getClickCount() == 2) {
                //     System.out.println("va entrar en el cod de 2 click");
                String cod = tbPacientes.getValueAt(tbPacientes.getSelectedRow(), 4).toString();
                if(cod.equals("HEMOGRAMA")){
                    Hemograma hemo= new Hemograma();
                    hemo.setVisible(true);
                }
                if((cod.equals("PROTEINA C REACTIVA CUALITATIVO (PCR)")) ||
                   (cod.equals("PROTEINA C REACTIVO CUANTITATIVO"))||
                   (cod.equals("VELOCIDAD DE SEDIMENTACION GLOBULAR (VSG)")) ){
                    ExamenInmunologico hemo= new ExamenInmunologico();
                    hemo.setVisible(true);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        //        if (evt.getClickCount() == 1 ) {
            //
            //            jComboBoxHotel.setSelectedIndex(0);
            //            AltaDesabilitar();
            //            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            //            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
            //            + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
            //            + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
            //            + "n.visual_compl,n.trab_calientes,chkcovid1,chkcovid2,manip_alimentos,txtobserv1,txtobserv2,"
            //            + "n.gruposan,n.color,n.grupofactorsan,n.cod_clinica,n.tipoprueba,n.nombrehotel,n.protocolo,n.precio_adic,n.autoriza "
            //            + "FROM n_orden_ocupacional AS n  "
            //            + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
            //            + "WHERE n.n_orden = " + cod +agregarConsulta;
            //            //      System.out.println("la consulta es:"+Sql);
            //
            //            oConn.FnBoolQueryExecute(Sql);
            //            try {
                //                if (oConn.setResult.next()) {
                    //                    txtDniAlta.setText(oConn.setResult.getString("cod_pa"));
                    //                    txtNombresAlta.setText(oConn.setResult.getString("nombres_pa"));
                    //                    txtApellidosAlta.setText(oConn.setResult.getString("apellidos_pa"));
                    //                    txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                    //                    txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                    //                    txtMedico.setText(oConn.setResult.getString("n_medico"));
                    //                    txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
                    //                    cboArea.setSelectedItem(oConn.setResult.getString("area_o"));
                    //                    cboExamenMedico.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    //                    cboExplotacion.setSelectedItem(oConn.setResult.getString("nom_ex"));
                    //                    cboMineralExp.setSelectedItem(oConn.setResult.getString("mineral_po"));
                    //                    cboAltura.setSelectedItem(oConn.setResult.getString("altura_po"));
                    //                    txtPrecio.setText(oConn.setResult.getString("precio_po"));
                    //                    txtFechaAlta.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    //                    txtNTicket.setText(oConn.setResult.getString("n_orden"));
                    //                    cboTipoExamen.setSelectedItem(oConn.setResult.getString("tipoprueba"));
                    //                    jComboBoxHotel.setSelectedItem(oConn.setResult.getString("nombrehotel"));
                    //                    jComboBoxProtocolos.setSelectedItem(oConn.setResult.getString("protocolo"));
                    //
                    //                    if(cboTipoExamen.getSelectedItem().toString().equals("PC"))
                    //                    jComboBoxHotel.setEnabled(true);
                    //                    else
                    //                    jComboBoxHotel.setEnabled(false);
                    //                    cboFormaPago.setSelectedItem(oConn.setResult.getString("tipo_pago"));
                    //                    chkAltaFist.setSelected(oConn.setResult.getBoolean("n_fisttest"));
                    //                    chkAltaPsicosen.setSelected(oConn.setResult.getBoolean("n_psicosen"));
                    //                    chkAltaTestAltura.setSelected(oConn.setResult.getBoolean("n_testaltura"));
                    //                    chkAltaVisualCom.setSelected(oConn.setResult.getBoolean("visual_compl"));
                    //                    chkAltaTrabCal.setSelected(oConn.setResult.getBoolean("trab_calientes"));
                    //                    //                    chkAltaCovid1.setSelected(oConn.setResult.getBoolean("chkcovid1"));
                    //                    //                    chkAltaCovid2.setSelected(oConn.setResult.getBoolean("chkcovid2"));
                    //                    txtGS.setText(oConn.setResult.getString("gruposan"));
                    //                    txtNumColor.setText(oConn.setResult.getString("color"));
                    //                    txtGrupoSan.setText(oConn.setResult.getString("grupofactorsan"));
                    //                    jLabel44.setText(oConn.setResult.getString("cod_clinica"));
                    //                    System.out.println("codigo clinico es:"+jLabel44.getText());
                    //                    chkAltaManipAlimen.setSelected(oConn.setResult.getBoolean("manip_alimentos"));
                    //                    txtObserv1.setText(oConn.setResult.getString("txtobserv1"));
                    //                    txtObserv2.setText(oConn.setResult.getString("txtobserv2"));
                    //                    txtPrecioAdicional.setText(oConn.setResult.getString("precio_adic"));
                    //                    cboAutorizacion.setSelectedItem(oConn.setResult.getString("autoriza"));
                    //                    if(nomsede.equals("Trujillo")){
                        //                        jLabel44.setText(txtNTicket.getText()+" - T");
                        //                    }else {
                        //                        jLabel44.setText(txtNTicket.getText()+" - H");
                        //                    }
                    //                    txtDniAlta.setEditable(false);
                    //                    hBotones(true);
                    //
                    //                }
                //                oConn.setResult.close();
                //                oConn.sqlStmt.close();
                //            } catch (Exception e) {
                //            }
            //        }
    }//GEN-LAST:event_tbPacientesMousePressed

    private void tbPacientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPacientesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPacientesKeyPressed

    private void tbPacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPacientesKeyReleased
        //        if(evt.getKeyCode() == 40 || evt.getKeyCode() == 38){
            //            AltaDesabilitar();
            //            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            //            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
            //            + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
            //            + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
            //            + "visual_compl,trab_calientes,manip_alimentos,txtobserv1,txtobserv2,"
            //            + "n.color,n.gruposan,n.grupofactorsan,n.cod_clinica,n.precio_adic,n.autoriza "
            //            + "FROM n_orden_ocupacional AS n  "
            //            + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
            //            + "WHERE n.n_orden = " + cod  +agregarConsulta;
            //            //      System.out.println("la consulta es:"+Sql);
            //
            //            oConn.FnBoolQueryExecute(Sql);
            //            try {
                //                if (oConn.setResult.next()) {
                    //                    txtDniAlta.setText(oConn.setResult.getString("cod_pa"));
                    //                    txtNombresAlta.setText(oConn.setResult.getString("nombres_pa"));
                    //                    txtApellidosAlta.setText(oConn.setResult.getString("apellidos_pa"));
                    //                    txtEmpresa.setText(oConn.setResult.getString("razon_empresa"));
                    //                    txtContrata.setText(oConn.setResult.getString("razon_contrata"));
                    //                    txtMedico.setText(oConn.setResult.getString("n_medico"));
                    //                    txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
                    //                    cboArea.setSelectedItem(oConn.setResult.getString("area_o"));
                    //                    cboExamenMedico.setSelectedItem(oConn.setResult.getString("nom_examen"));
                    //                    cboExplotacion.setSelectedItem(oConn.setResult.getString("nom_ex"));
                    //                    cboMineralExp.setSelectedItem(oConn.setResult.getString("mineral_po"));
                    //                    cboAltura.setSelectedItem(oConn.setResult.getString("altura_po"));
                    //                    txtPrecio.setText(oConn.setResult.getString("precio_po"));
                    //                    txtFechaAlta.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    //                    txtNTicket.setText(oConn.setResult.getString("n_orden"));
                    //                    cboFormaPago.setSelectedItem(oConn.setResult.getString("tipo_pago"));
                    //                    chkAltaFist.setSelected(oConn.setResult.getBoolean("n_fisttest"));
                    //                    chkAltaPsicosen.setSelected(oConn.setResult.getBoolean("n_psicosen"));
                    //                    chkAltaTestAltura.setSelected(oConn.setResult.getBoolean("n_testaltura"));
                    //                    chkAltaVisualCom.setSelected(oConn.setResult.getBoolean("visual_compl"));
                    //                    chkAltaTrabCal.setSelected(oConn.setResult.getBoolean("trab_calientes"));
                    //                    //                    chkAltaCovid1.setSelected(oConn.setResult.getBoolean("chkcovid1"));
                    //                    //                    chkAltaCovid2.setSelected(oConn.setResult.getBoolean("chkcovid2"));
                    //                    chkAltaManipAlimen.setSelected(oConn.setResult.getBoolean("manip_alimentos"));
                    //                    txtNumColor.setText(oConn.setResult.getString("color"));
                    //                    txtGrupoSan.setText(oConn.setResult.getString("grupofactorsan"));
                    //                    jLabel44.setText(oConn.setResult.getString("cod_clinica"));
                    //                    txtObserv1.setText(oConn.setResult.getString("txtobserv1"));
                    //                    txtObserv2.setText(oConn.setResult.getString("txtobserv2"));
                    //                    txtPrecioAdicional.setText(oConn.setResult.getString("precio_adic"));
                    //                    cboAutorizacion.setSelectedItem(oConn.setResult.getString("autoriza"));
                    //                    if(nomsede.equals("Trujillo")){
                        //                        jLabel44.setText(txtNTicket.getText()+" - T");
                        //                    }else {
                        //                        jLabel44.setText(txtNTicket.getText()+" - H");
                        //                    }
                    //                    txtDniAlta.setEditable(false);
                    //                    hBotones(true);
                    //
                    //                }
                //                oConn.setResult.close();
                //                oConn.sqlStmt.close();
                //            } catch (Exception e) {
                //            }
            //        }
    }//GEN-LAST:event_tbPacientesKeyReleased

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyReleased
        // TODO add your handling code here:
        sbCargarOcupacional(txtNum.getText());
    }//GEN-LAST:event_txtNumKeyReleased
@Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/med.png"));
        return retValue;
    }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /*
       * Set% the Nimbus look and feel
       */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
       * If Nimbus (introduced in Java SE 6) is not available, stay with the
       * default look and feel. For details see
       * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Asistencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Asistencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Asistencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Asistencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /*
       * Create and display the form
       */
      java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
         public void run() {
          
           // JFrame.setDefaultLookAndFeelDecorated(true);
               //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");
                 //new Sistema().setVisible(true);
                 Asistencial main = new Asistencial();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);
         }
      });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem A_CertificacionTrabajoAltura;
    private javax.swing.JMenuItem AnalisisBioquimicos;
    private javax.swing.JMenuItem Anexo7D;
    private javax.swing.JMenuItem AptitudAgro;
    private javax.swing.JMenuItem Audiometria;
    private javax.swing.JMenuItem ConsentimientoDosaje;
    private javax.swing.JMenuItem ConsentimientoInformado;
    private javax.swing.JMenuItem CuestionarioAudiometria;
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem FichaMedicaAgro;
    private javax.swing.JMenuItem FichaSaS;
    private javax.swing.JMenu FrmAgroindustrial;
    private javax.swing.JMenu FrmAudiometria;
    private javax.swing.JMenu FrmLaboratorio;
    private javax.swing.JMenu FrmVarios;
    private javax.swing.JMenuItem FuncionRespiratoria;
    private javax.swing.JPopupMenu HclMenu;
    private javax.swing.JMenuItem InformeAudiometria;
    private javax.swing.JMenuItem InformePsicologia;
    private javax.swing.JMenuItem LaboratorioClinico;
    private javax.swing.JMenuItem LaboratorioClinicoAsistencial;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JMenuBar MenuOcupacional;
    private javax.swing.JMenuItem Observados;
    private javax.swing.JMenuItem Pacientes;
    private javax.swing.JMenuItem PerimetroToraxico;
    private javax.swing.JMenuItem Reporte;
    private javax.swing.JMenuItem TestPsicologico;
    private javax.swing.JToolBar barraPrincipal;
    private javax.swing.JMenuItem btnActualizar;
    private javax.swing.JMenuItem btnAddUsuarios;
    private javax.swing.JMenuItem btnCambiarUsuario;
    private javax.swing.JMenuItem btnConfiguracion;
    private javax.swing.JMenuItem btnEliminarEx;
    private javax.swing.JMenuItem btnHC;
    private javax.swing.JMenuItem btnHCL;
    private javax.swing.JMenuItem btnHCLPS;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnTriaje;
    private javax.swing.JButton btnTriaje1;
    private javax.swing.JButton btnTriaje2;
    private javax.swing.JMenu btnconfiguracionsistema;
    private javax.swing.JMenuItem btnconfigurarservicios;
    private javax.swing.JMenuItem frmConalvias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMNuevosFormatos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JCheckBox jbarra;
    private javax.swing.JLabel lblUsuarioCaja;
    private javax.swing.JMenuItem mApnea;
    private javax.swing.JMenuItem mApnea1;
    private javax.swing.JMenuItem mAptitudMedico;
    private javax.swing.JMenuItem mAptitudMedico1;
    private javax.swing.JMenu mBarrick;
    private javax.swing.JMenu mBarrick1;
    private javax.swing.JMenuItem mCartaCompromisoAislamiento;
    private javax.swing.JMenuItem mCertificacionConduccion;
    private javax.swing.JMenuItem mCertificacionConduccion1;
    private javax.swing.JMenuItem mCertificacionTrabajoAltura;
    private javax.swing.JMenuItem mCertificacionTrabajoAltura1;
    private javax.swing.JMenuItem mCertificadoManipuladores;
    private javax.swing.JMenuItem mConsentimientoInformadoCovid;
    private javax.swing.JMenuItem mConsentimientoInformadoCovid1;
    private javax.swing.JMenuItem mConstanciaAltaEpidemiologica;
    private javax.swing.JMenuItem mConstanciaAltaMarsa;
    private javax.swing.JMenuItem mConstanciaAltaMarsa1;
    private javax.swing.JMenuItem mConstanciaEncofrados;
    private javax.swing.JMenuItem mConstanciaMedicaCovid19;
    private javax.swing.JMenuItem mConstanciaSaludMarsa;
    private javax.swing.JMenuItem mConstanciaSaludMarsa1;
    private javax.swing.JMenuItem mConstanciaTamizaje;
    private javax.swing.JMenuItem mConstanciaTamizajeMarza;
    private javax.swing.JMenu mCovid19;
    private javax.swing.JMenuItem mCuestionarioCalidadSueño;
    private javax.swing.JMenuItem mEliminar;
    private javax.swing.JMenu mEliminarRegistros;
    private javax.swing.JMenuItem mEvaluacionOftalmologica;
    private javax.swing.JMenuItem mEvaluaciónMuscoloEsqueletico2021;
    private javax.swing.JMenu mExamenMarsa;
    private javax.swing.JMenuItem mExamenesLaboratorio2021;
    private javax.swing.JMenu mFAgroindustrial;
    private javax.swing.JMenu mFSinRestriccion;
    private javax.swing.JMenuItem mFichaAlturaPoderosa;
    private javax.swing.JMenuItem mFichaAnexo2;
    private javax.swing.JMenuItem mFichaAptitud1;
    private javax.swing.JMenuItem mFichaAptitudAlturaPoderosa;
    private javax.swing.JMenuItem mFichaAptitudAnexo2;
    private javax.swing.JMenuItem mFichaAptitudResumen;
    private javax.swing.JMenuItem mFichaAudiometrica2021;
    private javax.swing.JMenuItem mFichaMedica1;
    private javax.swing.JMenuItem mFichaMedicaMarsa;
    private javax.swing.JMenuItem mFichaMedicaMarsa1;
    private javax.swing.JMenuItem mFichaResultadoPrueba;
    private javax.swing.JMenuItem mFichaResultadoPrueba1;
    private javax.swing.JMenuItem mFichaRetiro;
    private javax.swing.JMenuItem mFichaRetiro1;
    private javax.swing.JMenuItem mFichasintomatologica;
    private javax.swing.JMenuItem mHojaReferencia;
    private javax.swing.JMenuItem mIndicacionesMedicas;
    private javax.swing.JMenuItem mInformeElectrocardiogramaP;
    private javax.swing.JMenuItem mRegistroPrueba;
    private javax.swing.JMenuItem mResultadosPruebaRapida;
    private javax.swing.JMenuItem mTestFatigaSomnolencia;
    private javax.swing.JMenuItem mUsoRespiradores;
    private javax.swing.JMenuItem mUsoRespiradores1;
    private javax.swing.JMenuItem mValorizacion;
    private javax.swing.JMenu mValorizacionn;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
    
    private boolean estacerrado(Object obj){
        JInternalFrame[] activos=Desktop.getAllFrames();
        boolean cerrado=true;
        int i=0;
        while (i<activos.length && cerrado){
            if(activos[i]==obj){
		cerrado=false;
            }
            i++;
        }
       
    return cerrado;
    }
    public Point centradoXY(JInternalFrame jif)
    {
        Point p = new Point(0,0);
        //se obtiene dimension del contenedor
        Dimension pantalla = Asistencial.Desktop.getSize();
        //se obtiene dimension del JInternalFrame
        Dimension ventana = jif.getSize();
        //se calcula posición para el centrado
        p.x = (pantalla.width - ventana.width) / 2;
        p.y = (pantalla.height - ventana.height) / 2;
        return p;
    }
    
    public void vExamenes(String Nro){
      
//        vSql(lblTriaje, "triaje", Nro);
//        vSql(lblLabClinico, "lab_clinico", Nro);
//        vSql(lblElectrocardiograma, "informe_electrocardiograma", Nro);
//        vSql(lblRadiografiaTorax, "radiografia_torax", Nro);
//        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
//        //modificacion
//        vSql(lblFichaAudiologica, "ficha_audiologica", Nro);  
//        vSql(lblAudiometria, "audiometria_po", Nro); 
//        //
//        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
//        vSql(lblEspirometria, "funcion_abs", Nro);
//        vSql(lblOdontograma, "odontograma", Nro);
//        vSql(lblPsicologia, "informe_psicologico", Nro);
//        vSql(lblAnexo7D, "anexo7d", Nro);
//        vSql(lblHistorialOcupacional, "historia_oc_info", Nro);        
//        vSql(lblFichaAPatologicos, "antecedentes_patologicos", Nro);
//        vSql(lblCuestionarioNordico, "cuestionario_nordico", Nro);
//        vSql(lblCertificacionAltura, "certificacion_medica_altura", Nro);
//        vSql(lblSAS, "ficha_sas", Nro);
//        vSql(lblConsentimientoDosaje, "consentimiento_dosaje", Nro);
//        vSql(lblPerimetroToraxico, "perimetro_toracico", Nro);
//        vSql(lblOftalmologia, "oftalmologia", Nro); 
//        vSql(lblAnexo7C, "anexo7c", Nro);
//        //modificacion
//        vSql(lblCertTrabAltBarrick, "b_certificado_altura", Nro);
//        vSql(lblCertCondVehBarrick, "b_certificado_conduccion", Nro);
//        vSql(lblUsoRespirador, "b_uso_respiradores", Nro);
//        vSql(lblAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", Nro);
//        vSql(lblFichaOIT,"oit",Nro);
    }
    public boolean vSql(JLabel lbl ,String sTabla, String sOpcion)
    {
        String sStmt;
        boolean bResult=false;
        sStmt = " Select * from "+sTabla;
        sStmt+= " Where n_orden='"+sOpcion+"'";        
        oConn.FnBoolQueryExecute(sStmt);
        try 
        {
            if (oConn.setResult.next()){        
               bResult=true;
               lbl.setForeground(Color.blue);
//            lbl.setIcon(oIconoSi);
           
            }else{
                lbl.setForeground(Color.red);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Asistencial.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return bResult;        
    }
//    private void Limpiar2(){
//    
//    lblTriaje.setForeground(Color.BLACK);
//    lblLabClinico.setForeground(Color.BLACK);
//    lblElectrocardiograma.setForeground(Color.BLACK);
//    lblRadiografiaTorax.setForeground(Color.BLACK);
//    lblFichaAudiologica.setForeground(Color.BLACK);
//    lblAudiometria.setForeground(Color.BLACK);
//    lblEspirometria.setForeground(Color.BLACK);
//    lblOdontograma.setForeground(Color.BLACK);
//    lblPsicologia.setForeground(Color.BLACK);
//    lblAnexo7D.setForeground(Color.BLACK);
//    lblHistorialOcupacional.setForeground(Color.BLACK);
//    lblFichaAPatologicos.setForeground(Color.BLACK);
//    lblCuestionarioNordico.setForeground(Color.BLACK);
//    lblCertificacionAltura.setForeground(Color.BLACK);
//    lblConsentimientoDosaje.setForeground(Color.BLACK);
//    lblSAS.setForeground(Color.BLACK);
//    lblAnexo7C.setForeground(Color.BLACK);
//    lblExRxSanguineos.setForeground(Color.BLACK);
//    lblPerimetroToraxico.setForeground(Color.BLACK);
//    lblOftalmologia.setForeground(Color.BLACK);
//    //modificacion
//    lblCertTrabAltBarrick.setForeground(Color.BLACK);
//    lblCertCondVehBarrick.setForeground(Color.BLACK);
//    lblUsoRespirador.setForeground(Color.BLACK);
//    lblAcctitudMedOcupa.setForeground(Color.BLACK);
//    lblFichaOIT.setForeground(Color.BLACK);
//    txtNorden.setText(null);
//    txtNorden.requestFocus();
//  }
//    public void verifica(String orden){
//        if (!orden.isEmpty()) {
//            if (OrdenExiste(orden)) {
//                String Sql = "SELECT d.nombres_pa||' '||d.apellidos_pa AS nombres,n.nom_examen FROM "
//                        + "datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)WHERE n.n_orden ='" + orden + "'";
//                oConn.FnBoolQueryExecute(Sql);
//                try {
//                    if (oConn.setResult.next()) {
//                        txtNorden.setText(orden);
//                        oConn.setResult.close();
//                    }
//                    oConn.setResult.close();
//                    oConn.sqlStmt.close();
//                } catch (Exception e) {
//                }
//                vExamenes(orden);
//
//            } else {
//                oFunc.SubSistemaMensajeError("No existe Nro Orden");
//                Limpiar2();
//            }
//        }
//}
public boolean OrdenExiste(String orden)
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from n_orden_ocupacional Where n_orden="+orden;
        //Ejecuta el Query
        oConn.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try { // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
            }// Cierro los Resultados
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
        }
        return bResultado; 
    }    
     private void sbCargarOcupacional(String valor) {

        try {
            String[] titulos = {"N°Ticket", "Nombres", "Fecha","Hora","Servicios","cod_ser","Condicion"};
            String[] registros = new String[7];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            };
            String Sql ;
           
            if (!txtNum.getText().isEmpty()) {
                // System.out.println("si es este el error ");
                Sql = "select tc.n_ticket,d.nombres_pa ||' ' ||d.apellidos_pa as nombres,t.f_ticket ,t.h_ticket, \n" +
"                        tc.p_descripcion,tc.p_cod,h.h_ticket as hemograma,i.i_ticket as inmunologia \n" +
"                        from datos_paciente_asistencial d\n" +
"                        inner join ticket t on(t.cod_pa=d.cod_pa)\n" +
"                        inner join ticket_contenido tc on(t.n_ticket=tc.n_ticket)\n" +
"                        LEFT join HEMOGRAMA H on(H.H_ticket=t.n_ticket)\n" +
"                        LEFT join inmunologico_asistencial i on(i.i_ticket=t.n_ticket)\n" +
"                        where  t. n_ticket=" + valor + "\n";
            } else {
                Sql = "select tc.n_ticket,d.nombres_pa ||' ' ||d.apellidos_pa as nombres , t.f_ticket,t.h_ticket,"
                        + "tc.p_descripcion,,tc.p_cod,h.h_ticket as hemograma,i.i_ticket as inmunologia "
                        + "from datos_paciente_asistencial d \n"
                        + "inner join ticket t on(t.cod_pa=d.cod_pa)\n"
                        + "inner join ticket_contenido tc on(t.n_ticket=tc.n_ticket)\n"
                        + "LEFT join  HEMOGRAMA H on(H.H_ticket=t.n_ticket)\n"
                        + "LEFT join inmunologico_asistencial i on(i.i_ticket=t.n_ticket)\n"
                        + "where CONCAT(d.nombres_pa,' ',d.apellidos_pa) LIKE '%" + valor + "%' "
                        
                        + "order by tc.n_ticket desc";
            }
            
                System.out.println("la consulta es:"+Sql);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            if (oConn.FnBoolQueryExecute(Sql)) {
                try {
                    String aux=null,aux1 = null,aux2=null,aux3=null;
                    int t=0;
                    java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        
                    while (oConn.setResult.next()) {
                        
                        if (t == 0) {
                            aux = oConn.setResult.getString("nombres");
                            aux1=oConn.setResult.getString("n_ticket");
                            aux2=formato.format(oConn.setResult.getDate("f_ticket"));
                            aux3=oConn.setResult.getString("h_ticket");
                            System.out.println("0-" + aux + aux1);
                        }
                        
                        if (aux.equals(oConn.setResult.getString("nombres"))&& 
                                aux1.equals(oConn.setResult.getString("n_ticket"))&&
                                aux2.equals(formato.format(oConn.setResult.getDate("f_ticket")))&&
                                aux3.equals(oConn.setResult.getString("h_ticket"))) {
                            if (t == 0) {
                                registros[0] = oConn.setResult.getString("n_ticket");
                                registros[1] = oConn.setResult.getString("nombres");
                                registros[2] = formato.format(oConn.setResult.getDate("f_ticket"));
                                registros[3]= oConn.setResult.getString("h_ticket");
                                
                            } else {
                                registros[0] = "";
                                registros[1] = "";
                                registros[2] = "";
                                registros[3] = "";
                            }

                        } else {
                            registros[0] = oConn.setResult.getString("n_ticket");
                            registros[1] = oConn.setResult.getString("nombres");
                            registros[2] = formato.format(oConn.setResult.getDate("f_ticket"));
                            registros[3]= oConn.setResult.getString("h_ticket");
                            aux = oConn.setResult.getString("nombres");
                            aux1=oConn.setResult.getString("n_ticket");
                            aux2=formato.format(oConn.setResult.getDate("f_ticket"));
                            aux3=oConn.setResult.getString("h_ticket");
                        }
                        
                        String exa= oConn.setResult.getString("p_descripcion");
                        String s=oConn.setResult.getString("hemograma");
                        String inm=oConn.setResult.getString("inmunologia");
                        System.out.println("in");
                        registros[4]= oConn.setResult.getString("p_descripcion");
                        registros[5]= oConn.setResult.getString("p_cod");
                        if(s != null && "HEMOGRAMA".equals(exa)){
                            registros[6]="COMPLETO";
                        }else if(inm != null){
                            registros[6]="COMPLETO";
                        }else{
                            registros[6]="FALTA";
                        }
                       
                       t++;
                        System.out.println("1-"+aux+aux1+aux2+exa);
                        System.out.println("2-"+registros[1]+registros[0] +registros[2]);
                        
                        
                        tbPacientes.setDefaultRenderer(Object.class, new MyCellRenderer());
                        model.addRow(registros);
                    }
                    
                    // Coloca el Modelo de Nueva Cuenta
                    tbPacientes.setModel(model);
//                    tabla();
                    
                    // Cierra Resultados
                    
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(LaboratorioClinicoAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(LaboratorioClinicoAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public class MyCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        boolean valid = String.valueOf(table.getValueAt(row, 5)).equals("COMPLETO");
            boolean valid = String.valueOf(table.getValueAt(row, 6)).equals("COMPLETO");
            boolean valid1 = String.valueOf(table.getValueAt(row, 6)).equals("OBSERVADO");
            component.setBackground(valid ? Color.green : valid1 ? Color.ORANGE : Color.RED);

//        component.setBackground(valid ? Color.white : Color.yellow);
//        
//        component.setForeground(valid ? Color.white : Color.red);
            return component;
        }
    }
}

