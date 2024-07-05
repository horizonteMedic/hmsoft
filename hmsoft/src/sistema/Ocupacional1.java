/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;


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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

//import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author admin
 */
public class Ocupacional1 extends javax.swing.JFrame {
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
    InformeRadiografia ir;
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
       ConsentimientoDosajeMCBoroo cdboroo;
       Aptitud_Medico_Ocupacional11 amo11;
       LaboratorioClinicoAsistencial laba;
       Aptitud_Trabajos_EnCaliente apt_t_c;
       Aptitud_Licencia_Conducir_Interna apt_l_ci;
       Hoja_Consulta_Externa hoja_ce;
       Bioquimica bio22;
       Coprocultivo cop22;
       Parasitologia para22;
       ConsentimientoPanel5D cp5d;
       FichaDatosPersonales  fdp;
       Anexo16A_Boro ab;
       PerfilHepatico ph;
       ResultadosPanel5D rp5;
       InformeExamenMedicoAdeco ima;
       Audiometria2023 a23;
       PanelX3D p3d;
       PanelX10D p10d;
       AlturaPsicosensometrico alps;
       LBioquimica lbi;
       Hematologia hema;
       Hepatitis hep;
      javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oNo = null;
        String ipa="",seded="";
        public static String lasede="";
    public Ocupacional1() {
          
          lasede=clsGlobales.sedeSede;
           seded=clsGlobales.sedeSede;
           ipa=clsGlobales.ipIp;
       
            getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            initComponents();
            sede();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
      lblUsuarioCaja.setText(clsGlobales.sNomOperador);
            KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
//y enseguida registramos nuestro dispatcher
manager.addKeyEventDispatcher(new KeyEventDispatcher(){
            @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
                //como dije, solo las notificaciones del tipo "typed" son las que actualizan los componentes
                if(e.getID() == KeyEvent.KEY_TYPED){
                        //como vamos a convertir todo a mayúsculas, entonces solo checamos si los caracteres son 
                        //minusculas
                        if(e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z'){
                                //si lo son, entonces lo reemplazamos por su respectivo en mayúscula en el mismo evento
                                // (esto se logra por que en java todas las variables son pasadas por referencia)
                                e.setKeyChar((char)(((int)e.getKeyChar()) - 32));
                        }
                }
                //y listo, regresamos siempre falso para que las demas notificaciones continuen, si regresamos true
                // significa que el dispatcher consumio el evento
                return false; 
        }
});  
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
        btnResumenAptitud.setVisible(fnBoolIsOptionEnabled("SIS_RAD_01"));
        btnOftalmologia.setVisible(fnBoolIsOptionEnabled("SIS_OFT_01"));
        btnRtorax.setVisible(fnBoolIsOptionEnabled("SIS_TRX_01"));
        Audiometria.setVisible(fnBoolIsOptionEnabled("SIS_AUD_01"));
        btnHistoriaOcupacional.setVisible(fnBoolIsOptionEnabled("SIS_HOC_01"));
        btnFichaMedica.setVisible(fnBoolIsOptionEnabled("SIS_FME_01"));
        btnApatologicos.setVisible(fnBoolIsOptionEnabled("SIS_APA_01"));
        ////////////        
        AnalisisBioquimicos.setVisible(fnBoolIsOptionEnabled("SIS_ABI_01"));
        btnCuestionarioNordico.setVisible(fnBoolIsOptionEnabled("SIS_NOR_01"));
        //btnFrayosX.setVisible(fnBoolIsOptionEnabled("SIS_PMT_01"));
        btnPelisa.setVisible(fnBoolIsOptionEnabled("SIS_PEL_01"));
        InformePsicologia.setVisible(fnBoolIsOptionEnabled("SIS_IFP_01"));
        btnOdontologia.setVisible(fnBoolIsOptionEnabled("SIS_ODN_01"));
        TestPsicologico.setVisible(fnBoolIsOptionEnabled("SIS_TPS_01"));
        btnElectrocardigrama.setVisible(fnBoolIsOptionEnabled("SIS_ELE_01"));
        btnAnexo7D.setVisible(fnBoolIsOptionEnabled("SIS_A7D_01"));
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
            Logger.getLogger(Ocupacional1.class.getName()).log(Level.SEVERE, null, ex);
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
        btnRtorax = new javax.swing.JButton();
        btnOdontologia = new javax.swing.JButton();
        btnOit = new javax.swing.JButton();
        btnApatologicos = new javax.swing.JButton();
        btnHistoriaOcupacional = new javax.swing.JButton();
        btnMusculoEsqueletica = new javax.swing.JButton();
        btnCuestionarioNordico = new javax.swing.JButton();
        btnOftalmologia = new javax.swing.JButton();
        btnFichaMedica = new javax.swing.JButton();
        btnAnexo16 = new javax.swing.JButton();
        btnFichaAptitud = new javax.swing.JButton();
        btnFichaRetiro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnElectrocardigrama = new javax.swing.JButton();
        btnAnexo7D = new javax.swing.JButton();
        btnPelisa = new javax.swing.JButton();
        btnResumenAptitud = new javax.swing.JButton();
        btnResumen = new javax.swing.JButton();
        btnAnexo17 = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        txtNorden = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        lblTriaje = new javax.swing.JLabel();
        lblTriaje1 = new javax.swing.JLabel();
        lblLabClinico = new javax.swing.JLabel();
        lblElectrocardiograma = new javax.swing.JLabel();
        lblRadiografiaTorax = new javax.swing.JLabel();
        lblFichaAudiologica = new javax.swing.JLabel();
        lblAudiometria = new javax.swing.JLabel();
        lblEspirometria = new javax.swing.JLabel();
        lblOdontograma = new javax.swing.JLabel();
        lblPsicologia = new javax.swing.JLabel();
        lblFichaOIT = new javax.swing.JLabel();
        lblExRxSanguineos = new javax.swing.JLabel();
        lblAnexo7C = new javax.swing.JLabel();
        lblAnexo7D = new javax.swing.JLabel();
        lblHistorialOcupacional = new javax.swing.JLabel();
        lblCuestionarioNordico = new javax.swing.JLabel();
        lblFichaAPatologicos = new javax.swing.JLabel();
        lblCertificacionAltura = new javax.swing.JLabel();
        lblSAS = new javax.swing.JLabel();
        lblConsentimientoDosaje = new javax.swing.JLabel();
        lblPerimetroToraxico = new javax.swing.JLabel();
        lblOftalmologia = new javax.swing.JLabel();
        lblCertTrabAltBarrick = new javax.swing.JLabel();
        lblCertCondVehBarrick = new javax.swing.JLabel();
        lblUsoRespirador = new javax.swing.JLabel();
        lblAcctitudMedOcupa = new javax.swing.JLabel();
        lblLabClinico1 = new javax.swing.JLabel();
        lblElectrocardiograma1 = new javax.swing.JLabel();
        lblRadiografiaTorax1 = new javax.swing.JLabel();
        lblFichaAudiologica1 = new javax.swing.JLabel();
        lblAudiometria1 = new javax.swing.JLabel();
        lblEspirometria1 = new javax.swing.JLabel();
        lblOdontograma1 = new javax.swing.JLabel();
        lblPsicologia1 = new javax.swing.JLabel();
        lblFichaOIT1 = new javax.swing.JLabel();
        lblExRxSanguineos1 = new javax.swing.JLabel();
        lblAnexo7C1 = new javax.swing.JLabel();
        lblAnexo7D1 = new javax.swing.JLabel();
        lblHistorialOcupacional1 = new javax.swing.JLabel();
        lblFichaAPatologicos1 = new javax.swing.JLabel();
        lblCuestionarioNordico1 = new javax.swing.JLabel();
        lblCertificacionAltura1 = new javax.swing.JLabel();
        lblSAS1 = new javax.swing.JLabel();
        lblConsentimientoDosaje1 = new javax.swing.JLabel();
        lblPerimetroToraxico1 = new javax.swing.JLabel();
        lblOftalmologia1 = new javax.swing.JLabel();
        lblCertTrabAltBarrick1 = new javax.swing.JLabel();
        lblCertCondVehBarrick1 = new javax.swing.JLabel();
        lblUsoRespirador1 = new javax.swing.JLabel();
        lblAcctitudMedOcupa1 = new javax.swing.JLabel();
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
        mFichaAptitudTrabajosEnCaliente = new javax.swing.JMenuItem();
        mFichaAptitudTramitarLicencia = new javax.swing.JMenuItem();
        mFichaAptitudTramitarLicencia1 = new javax.swing.JMenuItem();
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
        mConsentimientoDosajeBoroo = new javax.swing.JMenuItem();
        mAptitudMedicoOcup11 = new javax.swing.JMenuItem();
        FrmAnalisisClinicos = new javax.swing.JMenu();
        mBioquimica = new javax.swing.JMenuItem();
        mCoprocultivo = new javax.swing.JMenuItem();
        mParasitologia = new javax.swing.JMenuItem();
        mConsentimientoPanel5D = new javax.swing.JMenuItem();
        mFichaDatosPersonales = new javax.swing.JMenuItem();
        mAnexo16A = new javax.swing.JMenuItem();
        mPerfilHepatico = new javax.swing.JMenuItem();
        mResultadosPanel5D = new javax.swing.JMenuItem();
        mInformeAdeco = new javax.swing.JMenuItem();
        mAudiometria2023 = new javax.swing.JMenuItem();
        FrmAnalisisClinicos2024 = new javax.swing.JMenu();
        bPanel3D = new javax.swing.JMenuItem();
        bPanel10D = new javax.swing.JMenuItem();
        TestAlturaPsiconsensometria = new javax.swing.JMenuItem();
        bBioquimica1 = new javax.swing.JMenuItem();
        bHepatitis = new javax.swing.JMenuItem();
        bCoproparasitologico = new javax.swing.JMenuItem();
        bHematologia = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

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
        FrmLaboratorio.setText("Formatos Laboratorio");
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
        barraPrincipal.setRollover(true);
        barraPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraPrincipal.setPreferredSize(new java.awt.Dimension(1219, 52));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar2.setToolTipText("");

        btnTriaje.setForeground(new java.awt.Color(102, 102, 102));
        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/enfermeria.jpg"))); // NOI18N
        btnTriaje.setMnemonic('t');
        btnTriaje.setText("Triaje");
        btnTriaje.setToolTipText("F2 (Triaje)");
        btnTriaje.setFocusable(false);
        btnTriaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTriaje.setMaximumSize(new java.awt.Dimension(50, 72));
        btnTriaje.setMinimumSize(new java.awt.Dimension(50, 72));
        btnTriaje.setPreferredSize(new java.awt.Dimension(41, 50));
        btnTriaje.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTriaje);

        btnRtorax.setForeground(new java.awt.Color(102, 102, 102));
        btnRtorax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/radiografia.jpg"))); // NOI18N
        btnRtorax.setMnemonic('x');
        btnRtorax.setText("R. Torax");
        btnRtorax.setToolTipText("F5");
        btnRtorax.setFocusable(false);
        btnRtorax.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRtorax.setMaximumSize(new java.awt.Dimension(65, 72));
        btnRtorax.setMinimumSize(new java.awt.Dimension(65, 72));
        btnRtorax.setPreferredSize(new java.awt.Dimension(0, 50));
        btnRtorax.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRtorax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRtoraxActionPerformed(evt);
            }
        });
        jToolBar2.add(btnRtorax);

        btnOdontologia.setForeground(new java.awt.Color(102, 102, 102));
        btnOdontologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/dental.jpg"))); // NOI18N
        btnOdontologia.setText("Odontología");
        btnOdontologia.setToolTipText("F6");
        btnOdontologia.setFocusable(false);
        btnOdontologia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOdontologia.setMaximumSize(new java.awt.Dimension(72, 72));
        btnOdontologia.setMinimumSize(new java.awt.Dimension(72, 72));
        btnOdontologia.setPreferredSize(new java.awt.Dimension(0, 50));
        btnOdontologia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOdontologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdontologiaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnOdontologia);

        btnOit.setForeground(new java.awt.Color(102, 102, 102));
        btnOit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/Rayosx.jpg"))); // NOI18N
        btnOit.setMnemonic('b');
        btnOit.setText("OIT-200");
        btnOit.setToolTipText("F5");
        btnOit.setFocusable(false);
        btnOit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOit.setMaximumSize(new java.awt.Dimension(80, 72));
        btnOit.setMinimumSize(new java.awt.Dimension(80, 72));
        btnOit.setPreferredSize(new java.awt.Dimension(0, 50));
        btnOit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitActionPerformed(evt);
            }
        });
        jToolBar2.add(btnOit);

        btnApatologicos.setForeground(new java.awt.Color(102, 102, 102));
        btnApatologicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/patologia.jpg"))); // NOI18N
        btnApatologicos.setMnemonic('p');
        btnApatologicos.setText("A. Patológicos");
        btnApatologicos.setToolTipText("F6");
        btnApatologicos.setFocusable(false);
        btnApatologicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnApatologicos.setMaximumSize(new java.awt.Dimension(80, 72));
        btnApatologicos.setMinimumSize(new java.awt.Dimension(80, 72));
        btnApatologicos.setPreferredSize(new java.awt.Dimension(0, 50));
        btnApatologicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnApatologicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApatologicosActionPerformed(evt);
            }
        });
        jToolBar2.add(btnApatologicos);

        btnHistoriaOcupacional.setForeground(new java.awt.Color(255, 0, 0));
        btnHistoriaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnHistoriaOcupacional.setText("H. Ocupacional");
        btnHistoriaOcupacional.setToolTipText("F7 (Historia Ocupacional)");
        btnHistoriaOcupacional.setFocusable(false);
        btnHistoriaOcupacional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistoriaOcupacional.setMaximumSize(new java.awt.Dimension(100, 72));
        btnHistoriaOcupacional.setMinimumSize(new java.awt.Dimension(100, 72));
        btnHistoriaOcupacional.setPreferredSize(new java.awt.Dimension(0, 50));
        btnHistoriaOcupacional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHistoriaOcupacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaOcupacionalActionPerformed(evt);
            }
        });
        jToolBar2.add(btnHistoriaOcupacional);

        btnMusculoEsqueletica.setForeground(new java.awt.Color(102, 102, 102));
        btnMusculoEsqueletica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/enfermeria.jpg"))); // NOI18N
        btnMusculoEsqueletica.setMnemonic('e');
        btnMusculoEsqueletica.setText("E.MuscEsq");
        btnMusculoEsqueletica.setToolTipText("F3");
        btnMusculoEsqueletica.setFocusable(false);
        btnMusculoEsqueletica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMusculoEsqueletica.setMaximumSize(new java.awt.Dimension(65, 72));
        btnMusculoEsqueletica.setMinimumSize(new java.awt.Dimension(65, 72));
        btnMusculoEsqueletica.setPreferredSize(new java.awt.Dimension(0, 50));
        btnMusculoEsqueletica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMusculoEsqueletica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusculoEsqueleticaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnMusculoEsqueletica);

        btnCuestionarioNordico.setForeground(new java.awt.Color(102, 102, 102));
        btnCuestionarioNordico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/laborato.jpg"))); // NOI18N
        btnCuestionarioNordico.setMnemonic('c');
        btnCuestionarioNordico.setText("C.Nordico");
        btnCuestionarioNordico.setToolTipText("F4");
        btnCuestionarioNordico.setFocusable(false);
        btnCuestionarioNordico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuestionarioNordico.setMaximumSize(new java.awt.Dimension(65, 72));
        btnCuestionarioNordico.setMinimumSize(new java.awt.Dimension(65, 72));
        btnCuestionarioNordico.setPreferredSize(new java.awt.Dimension(0, 50));
        btnCuestionarioNordico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCuestionarioNordico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestionarioNordicoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnCuestionarioNordico);

        btnOftalmologia.setForeground(new java.awt.Color(102, 102, 102));
        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/oftalmologia.jpg"))); // NOI18N
        btnOftalmologia.setMnemonic('o');
        btnOftalmologia.setText("Oftalmología");
        btnOftalmologia.setToolTipText("F4 (Oftalmología)");
        btnOftalmologia.setFocusable(false);
        btnOftalmologia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOftalmologia.setMaximumSize(new java.awt.Dimension(70, 72));
        btnOftalmologia.setMinimumSize(new java.awt.Dimension(70, 72));
        btnOftalmologia.setPreferredSize(new java.awt.Dimension(0, 50));
        btnOftalmologia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologiaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnOftalmologia);

        btnFichaMedica.setForeground(new java.awt.Color(255, 0, 0));
        btnFichaMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnFichaMedica.setMnemonic('m');
        btnFichaMedica.setText("ANEXO 16");
        btnFichaMedica.setToolTipText("F7 (Ficha Médica)");
        btnFichaMedica.setFocusable(false);
        btnFichaMedica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFichaMedica.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFichaMedica.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFichaMedica.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFichaMedica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFichaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFichaMedica);

        btnAnexo16.setForeground(new java.awt.Color(102, 102, 102));
        btnAnexo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnAnexo16.setMnemonic('e');
        btnAnexo16.setText("Anexo16-A");
        btnAnexo16.setToolTipText("F3");
        btnAnexo16.setFocusable(false);
        btnAnexo16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnexo16.setMaximumSize(new java.awt.Dimension(65, 72));
        btnAnexo16.setMinimumSize(new java.awt.Dimension(65, 72));
        btnAnexo16.setPreferredSize(new java.awt.Dimension(0, 50));
        btnAnexo16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnexo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo16ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAnexo16);

        btnFichaAptitud.setForeground(new java.awt.Color(102, 102, 102));
        btnFichaAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnFichaAptitud.setMnemonic('m');
        btnFichaAptitud.setText("F.Aptitud");
        btnFichaAptitud.setToolTipText("F7 (Ficha Médica)");
        btnFichaAptitud.setFocusable(false);
        btnFichaAptitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFichaAptitud.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFichaAptitud.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFichaAptitud.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFichaAptitud.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFichaAptitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaAptitudActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFichaAptitud);

        btnFichaRetiro.setForeground(new java.awt.Color(102, 102, 102));
        btnFichaRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/comprobante.png"))); // NOI18N
        btnFichaRetiro.setMnemonic('m');
        btnFichaRetiro.setText("Constancia");
        btnFichaRetiro.setToolTipText("F7 (Ficha Médica)");
        btnFichaRetiro.setFocusable(false);
        btnFichaRetiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFichaRetiro.setMaximumSize(new java.awt.Dimension(65, 72));
        btnFichaRetiro.setMinimumSize(new java.awt.Dimension(65, 72));
        btnFichaRetiro.setPreferredSize(new java.awt.Dimension(0, 50));
        btnFichaRetiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFichaRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaRetiroActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFichaRetiro);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.add(jSeparator1);

        btnElectrocardigrama.setForeground(new java.awt.Color(102, 102, 102));
        btnElectrocardigrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgmenu/electro.jpg"))); // NOI18N
        btnElectrocardigrama.setText("Electrocardiograma");
        btnElectrocardigrama.setToolTipText("F6");
        btnElectrocardigrama.setFocusable(false);
        btnElectrocardigrama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElectrocardigrama.setMaximumSize(new java.awt.Dimension(100, 72));
        btnElectrocardigrama.setMinimumSize(new java.awt.Dimension(100, 72));
        btnElectrocardigrama.setPreferredSize(new java.awt.Dimension(0, 50));
        btnElectrocardigrama.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElectrocardigrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectrocardigramaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnElectrocardigrama);

        btnAnexo7D.setForeground(new java.awt.Color(102, 102, 102));
        btnAnexo7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnAnexo7D.setMnemonic('p');
        btnAnexo7D.setText("Ant-Enf-Alt");
        btnAnexo7D.setToolTipText("F5");
        btnAnexo7D.setFocusable(false);
        btnAnexo7D.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnexo7D.setMaximumSize(new java.awt.Dimension(65, 72));
        btnAnexo7D.setMinimumSize(new java.awt.Dimension(65, 72));
        btnAnexo7D.setPreferredSize(new java.awt.Dimension(0, 50));
        btnAnexo7D.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnexo7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7DActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAnexo7D);

        btnPelisa.setForeground(new java.awt.Color(102, 102, 102));
        btnPelisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnPelisa.setMnemonic('e');
        btnPelisa.setText("Anexo-C");
        btnPelisa.setToolTipText("F3");
        btnPelisa.setFocusable(false);
        btnPelisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPelisa.setMaximumSize(new java.awt.Dimension(65, 72));
        btnPelisa.setMinimumSize(new java.awt.Dimension(65, 72));
        btnPelisa.setPreferredSize(new java.awt.Dimension(0, 50));
        btnPelisa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPelisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelisaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPelisa);

        barraPrincipal.add(jToolBar2);

        btnResumenAptitud.setForeground(new java.awt.Color(102, 102, 102));
        btnResumenAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnResumenAptitud.setMnemonic('r');
        btnResumenAptitud.setText("C.M.Ocupacional");
        btnResumenAptitud.setToolTipText("F3 (Radiografía)");
        btnResumenAptitud.setFocusable(false);
        btnResumenAptitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResumenAptitud.setMaximumSize(new java.awt.Dimension(65, 72));
        btnResumenAptitud.setMinimumSize(new java.awt.Dimension(65, 72));
        btnResumenAptitud.setPreferredSize(new java.awt.Dimension(67, 50));
        btnResumenAptitud.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResumenAptitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenAptitudActionPerformed(evt);
            }
        });
        barraPrincipal.add(btnResumenAptitud);

        btnResumen.setForeground(new java.awt.Color(102, 102, 102));
        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnResumen.setMnemonic('e');
        btnResumen.setText("Resumen");
        btnResumen.setToolTipText("F3");
        btnResumen.setFocusable(false);
        btnResumen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResumen.setMaximumSize(new java.awt.Dimension(65, 72));
        btnResumen.setMinimumSize(new java.awt.Dimension(65, 72));
        btnResumen.setPreferredSize(new java.awt.Dimension(0, 50));
        btnResumen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });
        barraPrincipal.add(btnResumen);

        btnAnexo17.setForeground(new java.awt.Color(102, 102, 102));
        btnAnexo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.png"))); // NOI18N
        btnAnexo17.setMnemonic('e');
        btnAnexo17.setText("Interconsulta");
        btnAnexo17.setToolTipText("F3");
        btnAnexo17.setFocusable(false);
        btnAnexo17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnexo17.setMaximumSize(new java.awt.Dimension(65, 72));
        btnAnexo17.setMinimumSize(new java.awt.Dimension(65, 72));
        btnAnexo17.setPreferredSize(new java.awt.Dimension(0, 50));
        btnAnexo17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnexo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo17ActionPerformed(evt);
            }
        });
        barraPrincipal.add(btnAnexo17);

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

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblTriaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTriaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTriaje.setText("Triaje :");
        lblTriaje.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblTriaje1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblLabClinico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLabClinico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLabClinico.setText("Lab. Clinico :");
        lblLabClinico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblElectrocardiograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblElectrocardiograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElectrocardiograma.setText("Electrocardiograma :");
        lblElectrocardiograma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblRadiografiaTorax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRadiografiaTorax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRadiografiaTorax.setText("Rx. Torax P.A:");
        lblRadiografiaTorax.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblFichaAudiologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFichaAudiologica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFichaAudiologica.setText("Ficha Audiologica :");
        lblFichaAudiologica.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAudiometria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAudiometria.setText("Audiometria:");
        lblAudiometria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblEspirometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEspirometria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspirometria.setText("Espirometria :");
        lblEspirometria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblOdontograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdontograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOdontograma.setText("Odontograma :");
        lblOdontograma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblPsicologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPsicologia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPsicologia.setText("Psicologia :");
        lblPsicologia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblFichaOIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFichaOIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFichaOIT.setText("Ficha OIT:");
        lblFichaOIT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblExRxSanguineos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblExRxSanguineos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExRxSanguineos.setText("Ex. Rx Sanguineos :");
        lblExRxSanguineos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblAnexo7C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAnexo7C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnexo7C.setText("Anexo 7C :");
        lblAnexo7C.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblAnexo7D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAnexo7D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnexo7D.setText("Anexo 7D :");
        lblAnexo7D.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblHistorialOcupacional.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHistorialOcupacional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorialOcupacional.setText("Hist. Ocupacional : ");
        lblHistorialOcupacional.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblCuestionarioNordico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCuestionarioNordico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuestionarioNordico.setText("Cuest. Nórdico :");
        lblCuestionarioNordico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblFichaAPatologicos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFichaAPatologicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFichaAPatologicos.setText("F. Ant. Patológicos :");
        lblFichaAPatologicos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblCertificacionAltura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCertificacionAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCertificacionAltura.setText("C.Trabajo Altura :");
        lblCertificacionAltura.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblSAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSAS.setText("Ficha S.A.S :");
        lblSAS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblConsentimientoDosaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblConsentimientoDosaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsentimientoDosaje.setText("Consent Dosaje :");
        lblConsentimientoDosaje.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblPerimetroToraxico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPerimetroToraxico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerimetroToraxico.setText("Perimetro Toraxico :");
        lblPerimetroToraxico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblOftalmologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOftalmologia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOftalmologia.setText("Oftalmología :");
        lblOftalmologia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblCertTrabAltBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCertTrabAltBarrick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCertTrabAltBarrick.setText("C.Trab.Altura(Barrik):");
        lblCertTrabAltBarrick.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblCertCondVehBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCertCondVehBarrick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCertCondVehBarrick.setText("C.Cond.Vehic(Barrik):");
        lblCertCondVehBarrick.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblUsoRespirador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsoRespirador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsoRespirador.setText("Uso de Respiradores:");
        lblUsoRespirador.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblAcctitudMedOcupa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAcctitudMedOcupa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcctitudMedOcupa.setText("Act. Med.Ocupac :");
        lblAcctitudMedOcupa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        lblLabClinico1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblElectrocardiograma1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblRadiografiaTorax1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAudiologica1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAudiometria1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblEspirometria1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblOdontograma1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblPsicologia1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaOIT1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblExRxSanguineos1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAnexo7C1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAnexo7D1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblHistorialOcupacional1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAPatologicos1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCuestionarioNordico1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCertificacionAltura1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblSAS1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblConsentimientoDosaje1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblPerimetroToraxico1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblOftalmologia1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCertTrabAltBarrick1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCertCondVehBarrick1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblUsoRespirador1.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAcctitudMedOcupa1.setPreferredSize(new java.awt.Dimension(13, 11));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAnexo7C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAnexo7D, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnexo7D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnexo7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCuestionarioNordico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblHistorialOcupacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67)))
                        .addComponent(lblHistorialOcupacional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblElectrocardiograma)
                                .addGap(1, 1, 1)
                                .addComponent(lblElectrocardiograma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCertCondVehBarrick)
                                .addGap(1, 1, 1)
                                .addComponent(lblCertCondVehBarrick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblConsentimientoDosaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(lblPerimetroToraxico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblOftalmologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCertTrabAltBarrick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCertTrabAltBarrick1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblOftalmologia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblUsoRespirador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAcctitudMedOcupa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAcctitudMedOcupa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(lblUsoRespirador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblLabClinico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTriaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTriaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLabClinico1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblExRxSanguineos, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(lblFichaOIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPsicologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOdontograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEspirometria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAudiometria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRadiografiaTorax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFichaAudiologica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                            .addComponent(lblFichaAudiologica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lblRadiografiaTorax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblAudiometria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblEspirometria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblOdontograma1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblPsicologia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblFichaOIT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblExRxSanguineos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFichaAPatologicos, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFichaAPatologicos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCertificacionAltura1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblSAS1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTriaje)
                    .addComponent(lblTriaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                                        .addComponent(lblLabClinico)
                                                                        .addGap(2, 2, 2)
                                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(lblElectrocardiograma)
                                                                            .addComponent(lblElectrocardiograma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addComponent(lblLabClinico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(2, 2, 2)
                                                                .addComponent(lblRadiografiaTorax))
                                                            .addComponent(lblRadiografiaTorax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(2, 2, 2)
                                                        .addComponent(lblFichaAudiologica))
                                                    .addComponent(lblFichaAudiologica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(2, 2, 2)
                                                .addComponent(lblAudiometria))
                                            .addComponent(lblAudiometria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEspirometria)
                                            .addComponent(lblEspirometria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblOdontograma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblOdontograma))
                                        .addGap(2, 2, 2)
                                        .addComponent(lblPsicologia))
                                    .addComponent(lblPsicologia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(lblFichaOIT))
                            .addComponent(lblFichaOIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExRxSanguineos)
                            .addComponent(lblExRxSanguineos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lblAnexo7C))
                    .addComponent(lblAnexo7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblAnexo7D)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHistorialOcupacional)
                                            .addComponent(lblHistorialOcupacional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addComponent(lblCuestionarioNordico))
                                    .addComponent(lblCuestionarioNordico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFichaAPatologicos)
                                    .addComponent(lblFichaAPatologicos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(lblCertificacionAltura))
                            .addComponent(lblCertificacionAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblSAS)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(lblConsentimientoDosaje)
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblPerimetroToraxico)
                                                    .addComponent(lblPerimetroToraxico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblConsentimientoDosaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOftalmologia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblOftalmologia))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCertTrabAltBarrick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblCertTrabAltBarrick))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCertCondVehBarrick, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblCertCondVehBarrick1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(2, 2, 2)
                                                .addComponent(lblUsoRespirador))
                                            .addComponent(lblUsoRespirador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addComponent(lblAcctitudMedOcupa))
                                    .addComponent(lblAcctitudMedOcupa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSAS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAnexo7D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        Desktop.add(jPanel4);
        jPanel4.setBounds(0, 0, 130, 490);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
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
        btnconfiguracionsistema.setText("Configuración");

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

        mFichaAptitudTrabajosEnCaliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitudTrabajosEnCaliente.setText("Aptitud para Trabajos en Caliente");
        mFichaAptitudTrabajosEnCaliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitudTrabajosEnCalienteActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAptitudTrabajosEnCaliente);

        mFichaAptitudTramitarLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitudTramitarLicencia.setText("Aptitud para Tramitar Licencia Interna");
        mFichaAptitudTramitarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitudTramitarLicenciaActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAptitudTramitarLicencia);

        mFichaAptitudTramitarLicencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altura.png"))); // NOI18N
        mFichaAptitudTramitarLicencia1.setText("Hoja de Consulta Externa");
        mFichaAptitudTramitarLicencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaAptitudTramitarLicencia1ActionPerformed(evt);
            }
        });
        mFSinRestriccion.add(mFichaAptitudTramitarLicencia1);

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
        mEvaluaciónMuscoloEsqueletico2021.setText("1. EvalMuscEsqueletico");
        mEvaluaciónMuscoloEsqueletico2021.setActionCommand("Cert. Conducción de Vehiculos");
        mEvaluaciónMuscoloEsqueletico2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEvaluaciónMuscoloEsqueletico2021ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mEvaluaciónMuscoloEsqueletico2021);

        mCuestionarioCalidadSueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mCuestionarioCalidadSueño.setText("2. CuestCalidadSueño");
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
        mEvaluacionOftalmologica.setText("5. Eval Oftalmologica");
        mEvaluacionOftalmologica.setActionCommand("Cert. Conducción de Vehiculos");
        mEvaluacionOftalmologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEvaluacionOftalmologicaActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mEvaluacionOftalmologica);

        mCertificadoManipuladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mCertificadoManipuladores.setText("6. Cert.Manipuladores");
        mCertificadoManipuladores.setActionCommand("Cert. Conducción de Vehiculos");
        mCertificadoManipuladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCertificadoManipuladoresActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mCertificadoManipuladores);

        mExamenesLaboratorio2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mExamenesLaboratorio2021.setText("7. Exa Laboratorio 2021");
        mExamenesLaboratorio2021.setActionCommand("Cert. Conducción de Vehiculos");
        mExamenesLaboratorio2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExamenesLaboratorio2021ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mExamenesLaboratorio2021);

        mConsentimientoDosajeBoroo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConsentimientoDosajeBoroo.setText("8. Consentimiento Dosaje");
        mConsentimientoDosajeBoroo.setActionCommand("Cert. Conducción de Vehiculos");
        mConsentimientoDosajeBoroo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsentimientoDosajeBorooActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mConsentimientoDosajeBoroo);

        mAptitudMedicoOcup11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mAptitudMedicoOcup11.setText("9. Apt Med. Ocup. Nueva");
        mAptitudMedicoOcup11.setActionCommand("Cert. Conducción de Vehiculos");
        mAptitudMedicoOcup11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAptitudMedicoOcup11ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mAptitudMedicoOcup11);

        FrmAnalisisClinicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        FrmAnalisisClinicos.setText("10. Formatos Laboratorio");
        FrmAnalisisClinicos.setActionCommand("Laboratorio Clinico");

        mBioquimica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mBioquimica.setText("AcidoUrico");
        mBioquimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBioquimicaActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos.add(mBioquimica);

        mCoprocultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mCoprocultivo.setText("Coprocultivo");
        mCoprocultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCoprocultivoActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos.add(mCoprocultivo);

        mParasitologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        mParasitologia.setText("Parasitologia");
        mParasitologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mParasitologiaActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos.add(mParasitologia);

        jMNuevosFormatos.add(FrmAnalisisClinicos);

        mConsentimientoPanel5D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mConsentimientoPanel5D.setText("11. Consentimiento Panel 5D");
        mConsentimientoPanel5D.setActionCommand("Cert. Conducción de Vehiculos");
        mConsentimientoPanel5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsentimientoPanel5DActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mConsentimientoPanel5D);

        mFichaDatosPersonales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mFichaDatosPersonales.setText("12. Ficha Datos Personales");
        mFichaDatosPersonales.setActionCommand("Cert. Conducción de Vehiculos");
        mFichaDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFichaDatosPersonalesActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mFichaDatosPersonales);

        mAnexo16A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mAnexo16A.setText("13. Anexo 16 A");
        mAnexo16A.setActionCommand("Cert. Conducción de Vehiculos");
        mAnexo16A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAnexo16AActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mAnexo16A);

        mPerfilHepatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mPerfilHepatico.setText("14. Perfil Hepatico");
        mPerfilHepatico.setActionCommand("Cert. Conducción de Vehiculos");
        mPerfilHepatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPerfilHepaticoActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mPerfilHepatico);

        mResultadosPanel5D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mResultadosPanel5D.setText("15. ResultadosPanel5D");
        mResultadosPanel5D.setActionCommand("Cert. Conducción de Vehiculos");
        mResultadosPanel5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mResultadosPanel5DActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mResultadosPanel5D);

        mInformeAdeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mInformeAdeco.setText("16.Informe Adeco");
        mInformeAdeco.setActionCommand("Cert. Conducción de Vehiculos");
        mInformeAdeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInformeAdecoActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mInformeAdeco);

        mAudiometria2023.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        mAudiometria2023.setText("17-Audiometria2023");
        mAudiometria2023.setActionCommand("Cert. Conducción de Vehiculos");
        mAudiometria2023.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAudiometria2023ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(mAudiometria2023);

        FrmAnalisisClinicos2024.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        FrmAnalisisClinicos2024.setText("18. Laboratorio2024");
        FrmAnalisisClinicos2024.setActionCommand("Laboratorio Clinico");

        bPanel3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        bPanel3D.setText("Panel3D");
        bPanel3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPanel3DActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(bPanel3D);

        bPanel10D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        bPanel10D.setText("Panel10D");
        bPanel10D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPanel10DActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(bPanel10D);

        TestAlturaPsiconsensometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        TestAlturaPsiconsensometria.setText("TestAlturaPsicosensometria");
        TestAlturaPsiconsensometria.setToolTipText("");
        TestAlturaPsiconsensometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestAlturaPsiconsensometriaActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(TestAlturaPsiconsensometria);

        bBioquimica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        bBioquimica1.setText("L Bioquimica");
        bBioquimica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBioquimica1ActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(bBioquimica1);

        bHepatitis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        bHepatitis.setText("L Hepatitis");
        bHepatitis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHepatitisActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(bHepatitis);

        bCoproparasitologico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        bCoproparasitologico.setText("Coproparasitologico");
        bCoproparasitologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCoproparasitologicoActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(bCoproparasitologico);

        bHematologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doc.png"))); // NOI18N
        bHematologia.setText("Hematologia");
        bHematologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHematologiaActionPerformed(evt);
            }
        });
        FrmAnalisisClinicos2024.add(bHematologia);

        jMNuevosFormatos.add(FrmAnalisisClinicos2024);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pildora.png"))); // NOI18N
        jMenuItem11.setText("19.Informe Radiografia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMNuevosFormatos.add(jMenuItem11);

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
          Ocupacional1.Desktop.add(ft);
          
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

   private void btnApatologicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApatologicosActionPerformed
         
       if(estacerrado(ap)){ 
            ap = new AntecedentesPatologicos();     
             Ocupacional1.Desktop.add(ap);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          ap.setFrameIcon(ticon);
          ap.setLocation(centradoXY(ap));

           ap.show();
         // ap.setVisible(true);
       }
             else{
           ap.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
   }//GEN-LAST:event_btnApatologicosActionPerformed

   private void jbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbarraActionPerformed
    if (jbarra.isSelected()){
     barraPrincipal.setVisible(false);
    }else{
       barraPrincipal.setVisible(true);
    }
   }//GEN-LAST:event_jbarraActionPerformed

    private void btnFichaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicaActionPerformed
       
        if(estacerrado(fm)){  
          fm = new FichaMedica();  
          Ocupacional1.Desktop.add(fm);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fm.setFrameIcon(ticon);
          fm.setLocation(centradoXY(fm));

          fm.show();
         // fm.setVisible(true);
       }
             else{
           fm.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFichaMedicaActionPerformed

    private void btnResumenAptitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenAptitudActionPerformed
          
        if(estacerrado(frm_aptitud2)){    
            frm_aptitud2 = new Aptitud_Medico_Ocupacional2();
          Ocupacional1.Desktop.add(frm_aptitud2);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         frm_aptitud2.setFrameIcon(ticon);
          frm_aptitud2.setLocation(centradoXY(frm_aptitud2));

           frm_aptitud2.show();
         // er.setVisible(true);
       }
             else{
           frm_aptitud2.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnResumenAptitudActionPerformed

    private void btnOftalmologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOftalmologiaActionPerformed
        
        if(estacerrado(fo)){ 
             fo = new FichaOftalmologica();
          Ocupacional1.Desktop.add(fo);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         fo.setFrameIcon(ticon);
          fo.setLocation(centradoXY(fo));

           fo.show();
          //fo.setVisible(true);
       }
             else{
           fo.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnOftalmologiaActionPerformed

    private void btnElectrocardigramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectrocardigramaActionPerformed
          
        if(estacerrado(el)){   
            el = new ElectroCardiograma(); 
          Ocupacional1.Desktop.add(el);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         el.setFrameIcon(ticon);
          el.setLocation(centradoXY(el));

          el.show();
          //el.setVisible(true);
       }
             else{
           el.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnElectrocardigramaActionPerformed

    private void btnRtoraxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRtoraxActionPerformed
        if(estacerrado(rtpa)){ 
            rtpa =new RadiografiaTorax();
          Desktop.add(rtpa);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         rtpa.setFrameIcon(ticon);
      rtpa.setLocation(centradoXY(rtpa));

           rtpa.show();
          //rtpa.setVisible(true);
       }
             else{
         rtpa.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_btnRtoraxActionPerformed

    private void btnCuestionarioNordicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestionarioNordicoActionPerformed
         if(estacerrado(cn)){  
            cn =new CuestionarioNordico();
          Desktop.add(cn);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         cn.setFrameIcon(ticon);
      cn.setLocation(centradoXY(cn));

           cn.show();
          //cn.setVisible(true);
       }
             else{
          cn.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
    }//GEN-LAST:event_btnCuestionarioNordicoActionPerformed

    private void btnOitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitActionPerformed
        if(estacerrado(b_oit)){   
         b_oit = new B_OIT();  
          Ocupacional1.Desktop.add(b_oit);
          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
          b_oit.setFrameIcon(ticon);
          b_oit.setLocation(centradoXY(b_oit));

           b_oit.show();
         // ft.setVisible(true);
       }
             else{
           b_oit.moveToFront();
           
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
                
    }//GEN-LAST:event_btnOitActionPerformed

    private void btnHistoriaOcupacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaOcupacionalActionPerformed
         
        if(estacerrado(hc)){  
            hc = new EmpresasLugaresGeograficos();    
          Ocupacional1.Desktop.add(hc);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         hc.setFrameIcon(ticon);
          hc.setLocation(centradoXY(hc));

           hc.show();
           //a7c = new Anexo7C();
           // Ocupacional.Desktop.add(a7c);
           // a7c.show();
          //hc.setVisible(true);
       }
             else{
           hc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnHistoriaOcupacionalActionPerformed

    private void btnAnexo7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7DActionPerformed
        
        if(estacerrado(aea)){   
             aea = new AntecedentesEnfermedadesAltura();     
          Ocupacional1.Desktop.add(aea);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         aea.setFrameIcon(ticon);
          aea.setLocation(centradoXY(aea));

           aea.show();
          //an7.setVisible(true);
       }
             else{
           aea.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAnexo7DActionPerformed

    private void ConsentimientoDosajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsentimientoDosajeActionPerformed
      
        if(estacerrado(cmc)){ 
             cmc = new ConsentimientoDosajeMC();
          Ocupacional1.Desktop.add(cmc);
          
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
          Ocupacional1.Desktop.add(cmta);
          
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

    private void btnOdontologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdontologiaActionPerformed
       if(estacerrado(odn)){ 
         odn =new Odontograma();
         Desktop.add(odn);          
         ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         odn.setFrameIcon(ticon);
         odn.setLocation(centradoXY(odn));

         odn.show();
         // odn.setVisible(true);
       }
             else{
          odn.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }   

    }//GEN-LAST:event_btnOdontologiaActionPerformed

    private void PerimetroToraxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimetroToraxicoActionPerformed
        if(estacerrado(pmt)){  
            pmt = new PerimetroToraxico();
          Ocupacional1.Desktop.add(pmt);
          
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
          Ocupacional1.Desktop.add(an);
          
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

    private void btnPelisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelisaActionPerformed
       if(estacerrado(an7c)){   
            an7c = new AnexoC();     
            Ocupacional1.Desktop.add(an7c);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            an7c.setFrameIcon(ticon);
            an7c.setLocation(centradoXY(an7c));

           an7c.show();
          //an7.setVisible(true);
       }
             else{
           an7c.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnPelisaActionPerformed

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
          Ocupacional1.Desktop.add(b_ceral);
          
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
          Ocupacional1.Desktop.add(b_uso);
          
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
          Ocupacional1.Desktop.add(b_sas);
          
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
          Ocupacional1.Desktop.add(frm_conal);
          
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
          Ocupacional1.Desktop.add(frm_constancia);
          
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
          Ocupacional1.Desktop.add(frm_aptitud);
          
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

    private void btnFichaRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaRetiroActionPerformed
        if(estacerrado(frm_constancia)){   
         frm_constancia = new ConstanciaRetiro();  
          Ocupacional1.Desktop.add(frm_constancia);
          
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
    }//GEN-LAST:event_btnFichaRetiroActionPerformed

    private void btnFichaAptitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaAptitudActionPerformed
        if(estacerrado(frm_aptitud)){   
         frm_aptitud = new Aptitud_Medico_Ocupacional();  
          Ocupacional1.Desktop.add(frm_aptitud);
          
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
    }//GEN-LAST:event_btnFichaAptitudActionPerformed

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        verifica(txtNorden.getText().toString());
        //verifica2();
    }//GEN-LAST:event_txtNordenActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar2();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void AudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudiometriaActionPerformed
        if(estacerrado(au)){ 
            au = new Audiometria();
          Ocupacional1.Desktop.add(au);
          
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
          Ocupacional1.Desktop.add(b_ceral);
          
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
          Ocupacional1.Desktop.add(b_uso);
          
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
          Ocupacional1.Desktop.add(b_sas);
          
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
          Ocupacional1.Desktop.add(frm_constancia);
          
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
          Ocupacional1.Desktop.add(frm_aptitud);
          
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
          Ocupacional1.Desktop.add(re);
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
         Ocupacional1.Desktop.add(ips);

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
         Ocupacional1.Desktop.add(te);
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
         Ocupacional1.Desktop.add(pe);
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
          Ocupacional1.Desktop.add(ia);
          
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
          Ocupacional1.Desktop.add(ca);
          
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

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
         if(estacerrado(ri)){ 
            ri =new ResumenInformacion();
          Desktop.add(ri);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        ri.setFrameIcon(ticon);
        ri.setLocation(centradoXY(ri));

        ri.show();
          //rtpa.setVisible(true);
       }
             else{
        ri.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_btnResumenActionPerformed

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

    private void btnMusculoEsqueleticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusculoEsqueleticaActionPerformed
        if(estacerrado(eme)){ 
            eme =new EvaluacionMusculoEsqueletica();
          Desktop.add(eme);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         eme.setFrameIcon(ticon);
      eme.setLocation(centradoXY(eme));

           eme.show();
          //rtpa.setVisible(true);
       }
             else{
         eme.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnMusculoEsqueleticaActionPerformed

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
         Ocupacional1.Desktop.add(an7);
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
          Ocupacional1.Desktop.add(frm_electropoderosa);
          
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

    private void btnAnexo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo16ActionPerformed
         if(estacerrado(an16)){ 
            an16 =new Anexo16A();
          Desktop.add(an16);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         an16.setFrameIcon(ticon);
      an16.setLocation(centradoXY(an16));

           an16.show();
          //rtpa.setVisible(true);
       }
             else{
         an16.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_btnAnexo16ActionPerformed

    private void FichaMedicaAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaMedicaAgroActionPerformed
        if(estacerrado(ane)){ 
            ane = new Anexo_02();
          Ocupacional1.Desktop.add(ane);
          
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
          Ocupacional1.Desktop.add(apanex2);
          
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

    private void btnAnexo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo17ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(inter)){ 
            inter =new Interconsulta();
          Desktop.add(inter);
          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
         inter.setFrameIcon(ticon);
      inter.setLocation(centradoXY(inter));

           inter.show();
          //rtpa.setVisible(true);
       }
             else{
         inter.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAnexo17ActionPerformed

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

    private void LaboratorioClinicoAsistencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaboratorioClinicoAsistencialActionPerformed
        // TODO add your handling code here:
        if(estacerrado(laba)){   
            laba = new LaboratorioClinicoAsistencial(); 
          Ocupacional1.Desktop.add(laba);
          
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

    private void mFichaAptitudTrabajosEnCalienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitudTrabajosEnCalienteActionPerformed
        // TODO add your handling code here:
        if (estacerrado(apt_t_c)) {
            apt_t_c = new Aptitud_Trabajos_EnCaliente();
            Desktop.add(apt_t_c);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            apt_t_c.setFrameIcon(ticon);
            apt_t_c.setLocation(centradoXY(apt_t_c));

            apt_t_c.show();
            //fn.setVisible(true);
        } else {
            apt_t_c.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitudTrabajosEnCalienteActionPerformed

    private void mFichaAptitudTramitarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitudTramitarLicenciaActionPerformed
        // TODO add your handling code here:
        if (estacerrado(apt_l_ci)) {
            apt_l_ci = new Aptitud_Licencia_Conducir_Interna();
            Desktop.add(apt_l_ci);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            apt_l_ci.setFrameIcon(ticon);
            apt_l_ci.setLocation(centradoXY(apt_l_ci));

            apt_l_ci.show();
            //fn.setVisible(true);
        } else {
            apt_l_ci.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitudTramitarLicenciaActionPerformed

    private void mFichaAptitudTramitarLicencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaAptitudTramitarLicencia1ActionPerformed
        // TODO add your handling code here:
        if (estacerrado(hoja_ce)) {
            hoja_ce = new Hoja_Consulta_Externa();
            Desktop.add(hoja_ce);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            hoja_ce.setFrameIcon(ticon);
            hoja_ce.setLocation(centradoXY(hoja_ce));

            hoja_ce.show();
            //fn.setVisible(true);
        } else {
            hoja_ce.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaAptitudTramitarLicencia1ActionPerformed

    private void mAptitudMedicoOcup11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAptitudMedicoOcup11ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(amo11)){
            amo11 =new Aptitud_Medico_Ocupacional11();
            Desktop.add(amo11);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            amo11.setFrameIcon(ticon);
            amo11.setLocation(centradoXY(amo11));
            amo11.show();
            //fn.setVisible(true);
        }else{
            el2021.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mAptitudMedicoOcup11ActionPerformed

    private void mConsentimientoDosajeBorooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsentimientoDosajeBorooActionPerformed
        // TODO add your handling code here:
        if(estacerrado(cdboroo)){
            cdboroo =new ConsentimientoDosajeMCBoroo();
            Desktop.add(cdboroo);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            cdboroo.setFrameIcon(ticon);
            cdboroo.setLocation(centradoXY(cdboroo));
            cdboroo.show();
            //fn.setVisible(true);
        }else{
            el2021.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConsentimientoDosajeBorooActionPerformed

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

    private void mBioquimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBioquimicaActionPerformed
        // TODO add your handling code here:
        if (estacerrado(bio22)) {
            bio22 = new Bioquimica();
            Desktop.add(bio22);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            bio22.setFrameIcon(ticon);
            bio22.setLocation(centradoXY(bio22));

            bio22.show();
            //fn.setVisible(true);
        } else {
            bio22.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mBioquimicaActionPerformed

    private void mCoprocultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCoprocultivoActionPerformed
        // TODO add your handling code here:
        if (estacerrado(cop22)) {
            cop22 = new Coprocultivo();
            Desktop.add(cop22);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            cop22.setFrameIcon(ticon);
            cop22.setLocation(centradoXY(cop22));

            cop22.show();
            //fn.setVisible(true);
        } else {
            cop22.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mCoprocultivoActionPerformed

    private void mParasitologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mParasitologiaActionPerformed
        // TODO add your handling code here:
         if (estacerrado(para22)) {
            para22 = new Parasitologia();
            Desktop.add(para22);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            para22.setFrameIcon(ticon);
            para22.setLocation(centradoXY(para22));
            para22.show();
            //fn.setVisible(true);
        } else {
            para22.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mParasitologiaActionPerformed

    private void mConsentimientoPanel5DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsentimientoPanel5DActionPerformed
        // TODO add your handling code here:
         if(estacerrado(cp5d)){
            cp5d =new ConsentimientoPanel5D();
            Desktop.add(cp5d);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            cp5d.setFrameIcon(ticon);
            cp5d.setLocation(centradoXY(cp5d));
            cp5d.show();
            //fn.setVisible(true);
        }else{
            cp5d.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mConsentimientoPanel5DActionPerformed

    private void mFichaDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFichaDatosPersonalesActionPerformed
        // TODO add your handling code here:
         if(estacerrado(fdp)){
            fdp =new FichaDatosPersonales();
            Desktop.add(fdp);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            fdp.setFrameIcon(ticon);
            fdp.setLocation(centradoXY(fdp));
            fdp.show();
            //fn.setVisible(true);
        }else{
            fdp.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mFichaDatosPersonalesActionPerformed

    private void mAnexo16AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAnexo16AActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ab)){
            ab =new Anexo16A_Boro();
            Desktop.add(ab);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            ab.setFrameIcon(ticon);
            ab.setLocation(centradoXY(ab));
            ab.show();
            //fn.setVisible(true);
        }else{
            ab.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mAnexo16AActionPerformed

    private void mPerfilHepaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPerfilHepaticoActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ph)){
            ph =new PerfilHepatico();
            Desktop.add(ph);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            ph.setFrameIcon(ticon);
            ph.setLocation(centradoXY(ph));
            ph.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mPerfilHepaticoActionPerformed

    private void mResultadosPanel5DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mResultadosPanel5DActionPerformed
        // TODO add your handling code here:
        if(estacerrado(rp5)){
            rp5 =new ResultadosPanel5D();
            Desktop.add(rp5);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            rp5.setFrameIcon(ticon);
            rp5.setLocation(centradoXY(rp5));
            rp5.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mResultadosPanel5DActionPerformed

    private void mInformeAdecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInformeAdecoActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ima)){
            ima =new InformeExamenMedicoAdeco();
            Desktop.add(ima);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            ima.setFrameIcon(ticon);
            ima.setLocation(centradoXY(ima));
            ima.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mInformeAdecoActionPerformed

    private void mAudiometria2023ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAudiometria2023ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(a23)){
            a23 =new Audiometria2023();
            Desktop.add(a23);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            a23.setFrameIcon(ticon);
            a23.setLocation(centradoXY(a23));
            a23.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_mAudiometria2023ActionPerformed

    private void bPanel3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPanel3DActionPerformed
        // TODO add your handling code here:
        if(estacerrado(p3d)){
            p3d =new PanelX3D();
            Desktop.add(p3d);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            p3d.setFrameIcon(ticon);
            p3d.setLocation(centradoXY(p3d));
            p3d.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_bPanel3DActionPerformed

    private void bPanel10DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPanel10DActionPerformed
        // TODO add your handling code here:
        if(estacerrado(p10d)){
            p10d =new PanelX10D();
            Desktop.add(p10d);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            p10d.setFrameIcon(ticon);
            p10d.setLocation(centradoXY(p10d));
            p10d.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_bPanel10DActionPerformed

    private void TestAlturaPsiconsensometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestAlturaPsiconsensometriaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(alps)){
            alps =new AlturaPsicosensometrico();
            Desktop.add(alps);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            alps.setFrameIcon(ticon);
            alps.setLocation(centradoXY(alps));
            alps.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_TestAlturaPsiconsensometriaActionPerformed

    private void bHepatitisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHepatitisActionPerformed
        // TODO add your handling code here:
        if(estacerrado(hep)){
            hep =new Hepatitis();
            Desktop.add(hep);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            hep.setFrameIcon(ticon);
            hep.setLocation(centradoXY(hep));
            hep.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_bHepatitisActionPerformed

    private void bBioquimica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBioquimica1ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(lbi)){
            lbi =new LBioquimica();
            Desktop.add(lbi);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            lbi.setFrameIcon(ticon);
            lbi.setLocation(centradoXY(lbi));
            lbi.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_bBioquimica1ActionPerformed

    private void bCoproparasitologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCoproparasitologicoActionPerformed
        // TODO add your handling code here:
        if(estacerrado(para22)){
            para22 =new Parasitologia();
            Desktop.add(para22);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            para22.setFrameIcon(ticon);
            para22.setLocation(centradoXY(para22));
            para22.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_bCoproparasitologicoActionPerformed

    private void bHematologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHematologiaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(hema)){
            hema =new Hematologia();
            Desktop.add(hema);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            hema.setFrameIcon(ticon);
            hema.setLocation(centradoXY(hema));
            hema.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();
            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_bHematologiaActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // Esta para editar el contexto  y agregar en la parte sup 
        if(estacerrado(ir)){
            ir =new InformeRadiografia();
            Desktop.add(ir);
            ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
            ir.setFrameIcon(ticon);
            ir.setLocation(centradoXY(ir));
            ir.show();
            //fn.setVisible(true);
        }else{
            ph.moveToFront();

            //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed
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
         java.util.logging.Logger.getLogger(Ocupacional1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Ocupacional1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Ocupacional1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Ocupacional1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
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
                 Ocupacional1 main = new Ocupacional1();
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
    private javax.swing.JMenu FrmAnalisisClinicos;
    private javax.swing.JMenu FrmAnalisisClinicos2024;
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
    private javax.swing.JMenuItem TestAlturaPsiconsensometria;
    private javax.swing.JMenuItem TestPsicologico;
    private javax.swing.JMenuItem bBioquimica1;
    private javax.swing.JMenuItem bCoproparasitologico;
    private javax.swing.JMenuItem bHematologia;
    private javax.swing.JMenuItem bHepatitis;
    private javax.swing.JMenuItem bPanel10D;
    private javax.swing.JMenuItem bPanel3D;
    private javax.swing.JToolBar barraPrincipal;
    private javax.swing.JMenuItem btnActualizar;
    private javax.swing.JMenuItem btnAddUsuarios;
    private javax.swing.JButton btnAnexo16;
    private javax.swing.JButton btnAnexo17;
    private javax.swing.JButton btnAnexo7D;
    private javax.swing.JButton btnApatologicos;
    private javax.swing.JMenuItem btnCambiarUsuario;
    private javax.swing.JMenuItem btnConfiguracion;
    private javax.swing.JButton btnCuestionarioNordico;
    private javax.swing.JButton btnElectrocardigrama;
    private javax.swing.JMenuItem btnEliminarEx;
    private javax.swing.JButton btnFichaAptitud;
    private javax.swing.JButton btnFichaMedica;
    private javax.swing.JButton btnFichaRetiro;
    private javax.swing.JMenuItem btnHC;
    private javax.swing.JMenuItem btnHCL;
    private javax.swing.JMenuItem btnHCLPS;
    private javax.swing.JButton btnHistoriaOcupacional;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMusculoEsqueletica;
    private javax.swing.JButton btnOdontologia;
    private javax.swing.JButton btnOftalmologia;
    private javax.swing.JButton btnOit;
    private javax.swing.JButton btnPelisa;
    private javax.swing.JButton btnResumen;
    private javax.swing.JButton btnResumenAptitud;
    private javax.swing.JButton btnRtorax;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnTriaje;
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
    private javax.swing.JMenuItem jMenuItem11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JCheckBox jbarra;
    private javax.swing.JLabel lblAcctitudMedOcupa;
    private javax.swing.JLabel lblAcctitudMedOcupa1;
    private javax.swing.JLabel lblAnexo7C;
    private javax.swing.JLabel lblAnexo7C1;
    private javax.swing.JLabel lblAnexo7D;
    private javax.swing.JLabel lblAnexo7D1;
    private javax.swing.JLabel lblAudiometria;
    private javax.swing.JLabel lblAudiometria1;
    private javax.swing.JLabel lblCertCondVehBarrick;
    private javax.swing.JLabel lblCertCondVehBarrick1;
    private javax.swing.JLabel lblCertTrabAltBarrick;
    private javax.swing.JLabel lblCertTrabAltBarrick1;
    private javax.swing.JLabel lblCertificacionAltura;
    private javax.swing.JLabel lblCertificacionAltura1;
    private javax.swing.JLabel lblConsentimientoDosaje;
    private javax.swing.JLabel lblConsentimientoDosaje1;
    private javax.swing.JLabel lblCuestionarioNordico;
    private javax.swing.JLabel lblCuestionarioNordico1;
    private javax.swing.JLabel lblElectrocardiograma;
    private javax.swing.JLabel lblElectrocardiograma1;
    private javax.swing.JLabel lblEspirometria;
    private javax.swing.JLabel lblEspirometria1;
    private javax.swing.JLabel lblExRxSanguineos;
    private javax.swing.JLabel lblExRxSanguineos1;
    private javax.swing.JLabel lblFichaAPatologicos;
    private javax.swing.JLabel lblFichaAPatologicos1;
    private javax.swing.JLabel lblFichaAudiologica;
    private javax.swing.JLabel lblFichaAudiologica1;
    private javax.swing.JLabel lblFichaOIT;
    private javax.swing.JLabel lblFichaOIT1;
    private javax.swing.JLabel lblHistorialOcupacional;
    private javax.swing.JLabel lblHistorialOcupacional1;
    private javax.swing.JLabel lblLabClinico;
    private javax.swing.JLabel lblLabClinico1;
    private javax.swing.JLabel lblOdontograma;
    private javax.swing.JLabel lblOdontograma1;
    private javax.swing.JLabel lblOftalmologia;
    private javax.swing.JLabel lblOftalmologia1;
    private javax.swing.JLabel lblPerimetroToraxico;
    private javax.swing.JLabel lblPerimetroToraxico1;
    private javax.swing.JLabel lblPsicologia;
    private javax.swing.JLabel lblPsicologia1;
    private javax.swing.JLabel lblRadiografiaTorax;
    private javax.swing.JLabel lblRadiografiaTorax1;
    private javax.swing.JLabel lblSAS;
    private javax.swing.JLabel lblSAS1;
    private javax.swing.JLabel lblTriaje;
    private javax.swing.JLabel lblTriaje1;
    private javax.swing.JLabel lblUsoRespirador;
    private javax.swing.JLabel lblUsoRespirador1;
    private javax.swing.JLabel lblUsuarioCaja;
    private javax.swing.JMenuItem mAnexo16A;
    private javax.swing.JMenuItem mApnea;
    private javax.swing.JMenuItem mApnea1;
    private javax.swing.JMenuItem mAptitudMedico;
    private javax.swing.JMenuItem mAptitudMedico1;
    private javax.swing.JMenuItem mAptitudMedicoOcup11;
    private javax.swing.JMenuItem mAudiometria2023;
    private javax.swing.JMenu mBarrick;
    private javax.swing.JMenu mBarrick1;
    private javax.swing.JMenuItem mBioquimica;
    private javax.swing.JMenuItem mCartaCompromisoAislamiento;
    private javax.swing.JMenuItem mCertificacionConduccion;
    private javax.swing.JMenuItem mCertificacionConduccion1;
    private javax.swing.JMenuItem mCertificacionTrabajoAltura;
    private javax.swing.JMenuItem mCertificacionTrabajoAltura1;
    private javax.swing.JMenuItem mCertificadoManipuladores;
    private javax.swing.JMenuItem mConsentimientoDosajeBoroo;
    private javax.swing.JMenuItem mConsentimientoInformadoCovid;
    private javax.swing.JMenuItem mConsentimientoInformadoCovid1;
    private javax.swing.JMenuItem mConsentimientoPanel5D;
    private javax.swing.JMenuItem mConstanciaAltaEpidemiologica;
    private javax.swing.JMenuItem mConstanciaAltaMarsa;
    private javax.swing.JMenuItem mConstanciaAltaMarsa1;
    private javax.swing.JMenuItem mConstanciaEncofrados;
    private javax.swing.JMenuItem mConstanciaMedicaCovid19;
    private javax.swing.JMenuItem mConstanciaSaludMarsa;
    private javax.swing.JMenuItem mConstanciaSaludMarsa1;
    private javax.swing.JMenuItem mConstanciaTamizaje;
    private javax.swing.JMenuItem mConstanciaTamizajeMarza;
    private javax.swing.JMenuItem mCoprocultivo;
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
    private javax.swing.JMenuItem mFichaAptitudTrabajosEnCaliente;
    private javax.swing.JMenuItem mFichaAptitudTramitarLicencia;
    private javax.swing.JMenuItem mFichaAptitudTramitarLicencia1;
    private javax.swing.JMenuItem mFichaAudiometrica2021;
    private javax.swing.JMenuItem mFichaDatosPersonales;
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
    private javax.swing.JMenuItem mInformeAdeco;
    private javax.swing.JMenuItem mInformeElectrocardiogramaP;
    private javax.swing.JMenuItem mParasitologia;
    private javax.swing.JMenuItem mPerfilHepatico;
    private javax.swing.JMenuItem mRegistroPrueba;
    private javax.swing.JMenuItem mResultadosPanel5D;
    private javax.swing.JMenuItem mResultadosPruebaRapida;
    private javax.swing.JMenuItem mTestFatigaSomnolencia;
    private javax.swing.JMenuItem mUsoRespiradores;
    private javax.swing.JMenuItem mUsoRespiradores1;
    private javax.swing.JMenuItem mValorizacion;
    private javax.swing.JMenu mValorizacionn;
    private javax.swing.JTextField txtNorden;
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
        Dimension pantalla = Ocupacional1.Desktop.getSize();
        //se obtiene dimension del JInternalFrame
        Dimension ventana = jif.getSize();
        //se calcula posición para el centrado
        p.x = (pantalla.width - ventana.width) / 2;
        p.y = (pantalla.height - ventana.height) / 2;
        return p;
    }
    
    public void vExamenes(String Nro){
      
        vSql(lblTriaje, "triaje", Nro);
        vSql(lblLabClinico, "lab_clinico", Nro);
        vSql(lblElectrocardiograma, "informe_electrocardiograma", Nro);
        vSql(lblRadiografiaTorax, "radiografia_torax", Nro);
        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
        //modificacion
        vSql(lblFichaAudiologica, "ficha_audiologica", Nro);  
        vSql(lblAudiometria, "audiometria_po", Nro); 
        //
        vSql(lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro);
        vSql(lblEspirometria, "funcion_abs", Nro);
        vSql(lblOdontograma, "odontograma", Nro);
        vSql(lblPsicologia, "informe_psicologico", Nro);
        vSql(lblAnexo7D, "anexo7d", Nro);
        vSql(lblHistorialOcupacional, "historia_oc_info", Nro);        
        vSql(lblFichaAPatologicos, "antecedentes_patologicos", Nro);
        vSql(lblCuestionarioNordico, "cuestionario_nordico", Nro);
        vSql(lblCertificacionAltura, "certificacion_medica_altura", Nro);
        vSql(lblSAS, "ficha_sas", Nro);
        vSql(lblConsentimientoDosaje, "consentimiento_dosaje", Nro);
        vSql(lblPerimetroToraxico, "perimetro_toracico", Nro);
        vSql(lblOftalmologia, "oftalmologia", Nro); 
        vSql(lblAnexo7C, "anexo7c", Nro);
        //modificacion
        vSql(lblCertTrabAltBarrick, "b_certificado_altura", Nro);
        vSql(lblCertCondVehBarrick, "b_certificado_conduccion", Nro);
        vSql(lblUsoRespirador, "b_uso_respiradores", Nro);
        vSql(lblAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", Nro);
        vSql(lblFichaOIT,"oit",Nro);
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
            Logger.getLogger(Ocupacional1.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return bResult;        
    }
    private void Limpiar2(){
    
    lblTriaje.setForeground(Color.BLACK);
    lblLabClinico.setForeground(Color.BLACK);
    lblElectrocardiograma.setForeground(Color.BLACK);
    lblRadiografiaTorax.setForeground(Color.BLACK);
    lblFichaAudiologica.setForeground(Color.BLACK);
    lblAudiometria.setForeground(Color.BLACK);
    lblEspirometria.setForeground(Color.BLACK);
    lblOdontograma.setForeground(Color.BLACK);
    lblPsicologia.setForeground(Color.BLACK);
    lblAnexo7D.setForeground(Color.BLACK);
    lblHistorialOcupacional.setForeground(Color.BLACK);
    lblFichaAPatologicos.setForeground(Color.BLACK);
    lblCuestionarioNordico.setForeground(Color.BLACK);
    lblCertificacionAltura.setForeground(Color.BLACK);
    lblConsentimientoDosaje.setForeground(Color.BLACK);
    lblSAS.setForeground(Color.BLACK);
    lblAnexo7C.setForeground(Color.BLACK);
    lblExRxSanguineos.setForeground(Color.BLACK);
    lblPerimetroToraxico.setForeground(Color.BLACK);
    lblOftalmologia.setForeground(Color.BLACK);
    //modificacion
    lblCertTrabAltBarrick.setForeground(Color.BLACK);
    lblCertCondVehBarrick.setForeground(Color.BLACK);
    lblUsoRespirador.setForeground(Color.BLACK);
    lblAcctitudMedOcupa.setForeground(Color.BLACK);
    lblFichaOIT.setForeground(Color.BLACK);
    txtNorden.setText(null);
    txtNorden.requestFocus();
  }
    public void verifica(String orden){
        if (!orden.isEmpty()) {
            if (OrdenExiste(orden)) {
                String Sql = "SELECT d.nombres_pa||' '||d.apellidos_pa AS nombres,n.nom_examen FROM "
                        + "datos_paciente AS d INNER JOIN n_orden_ocupacional AS n ON(d.cod_pa = n.cod_pa)WHERE n.n_orden ='" + orden + "'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNorden.setText(orden);
                        oConn.setResult.close();
                    }
                    oConn.setResult.close();
                    oConn.sqlStmt.close();
                } catch (Exception e) {
                }
                vExamenes(orden);

            } else {
                oFunc.SubSistemaMensajeError("No existe Nro Orden");
                Limpiar2();
            }
        }
}
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
}

