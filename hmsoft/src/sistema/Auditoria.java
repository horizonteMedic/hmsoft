/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import java.awt.Dimension;
import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static sistema.Ocupacional1.Desktop;

/**
 *
 * @author admin
 */
public class Auditoria extends javax.swing.JInternalFrame {
      clsFunciones  oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
    FichaTriaje ft;
    LaboratorioClinico lc;
    RadiografiaTorax rt;
    Audiometria audi;
    AntecedentesEnfermedadesAltura EnfA;
    Odontograma odon;
    FuncionRespiratoriaABS espiro;
    InformePsicologico infP;
    B_OIT boit;
    ExamenRadiograficoSanguineo exRadSan;
    AntecedentesPatologicos antP;
    EmpresasLugaresGeograficos empLugGeo;
    CuestionarioNordico cuestNord;
    EvaluacionMusculoEsqueletica MusEsq;
    FichaOftalmologica oftl;
    Aptitud_Medico_Ocupacional Mocup;
    B_Uso_Respiradores Uresp;
    Anexo16A A16;
    FichaMedica A16f;
    ConsentimientoDosajeMC Dosj;
    ElectroCardiograma Elec;
    B_Certificacion_Trabajo_Altura Balt;
    A_CertificacionMedicaTrabajoAltura Aalt;
    AnalisisBioquimico Abio;
    EvaluacionMusculoEsqueletica2021 Msc2021;
    CuestionarioCalidadSueno Csue;
    TestFatigaSomnolencia Tsomn;
    Audiometria2021 Audi2021;
    Audiometria2023 Audi2023;
    EvaluacionOftalmologica Oft2021;
    CertificadoManipuladoresBarrick Cman;
    CuestionarioAudiometria Caudi;
            
    FichaMedica1 Fmed;
    Aptitud_Medico_Ocupacional1 Afmed;
    FichaAgroindustriales Fmeda2;
    Aptitud_Medico_Ocupacional_Agro Afmed2;
    
    //Poderosa
    Certificacion_Trabajo_Altura_Poderosa Ctalps;
    Aptitud_Altura_Poderosa Aaltps;
    Aptitud_Licencia_Conducir_Interna Alicps;
    Hoja_Consulta_Externa Hcexps;
    Aptitud_Trabajos_EnCaliente Atcalps;
    
    //OHLA
    Aptitud_Medico_Ocupacional11 CAptiOH;
    ElectroCardiogramaPoderosa ElctOH;
    
    
    B_Certificacion_conduccion Bcon;
    b_Ficha_Sas Bapn;   
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
            javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/vista.png"));
        javax.swing.ImageIcon oNo = null;
    public Auditoria() {
        initComponents();
        Limpiar2();
        txtNorden.requestFocus();
    }
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
public void vExamenes(String Nro){
      clsGlobales.Norden=Integer.parseInt(Nro);
        vSql(txtTriaje,lblTriaje, "triaje", Nro,btnTriaje);
        vSql(txtLabClinico,lblLabClinico, "lab_clinico", Nro,btnLaboratorio);
        vSql(txtElectrocardiograma,lblElectrocardiograma, "informe_electrocardiograma", Nro, btnElectro);
        vSql(txtRadiografiaTorax,lblRadiografiaTorax, "radiografia_torax", Nro,btnRadiografia);
        vSql(txtExRxSanguineos,lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro,btnExRxSanguineos);
        //modificacion
        vSql(txtEnfermAltu,lblEnfermAltu,"antece_enfermedades_altura",Nro,btnEnfermAltu);
        vSql(txtFichaMedicaAgro,lblFichaMedicaAgro,"anexo_agroindustrial",Nro,btnFichaMedicaAgro);
        
        vSql(txtFichaAudiologica,lblFichaAudiologica, "ficha_audiologica", Nro,btnAudiologia);  
        vSql(txtAudiometria,lblAudiometria, "audiometria_po", Nro,btnAudiometria); 
        vSql(txtCuestAudiometria,lblCuestAudiometria, "cuestionario_audiometria", Nro,btnCuestAudiometria); 
        
        vSql(txtExRxSanguineos,lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro,btnExRxSanguineos);
        vSql(txtEspirometria,lblEspirometria, "funcion_abs", Nro,btnEspirometria);
       vSql(txtOdontograma,lblOdontograma, "odontograma", Nro,btnOdontograma);
        vSql(txtPsicologia,lblPsicologia, "informe_psicologico", Nro,btnPsicologia);
        vSql(txtanexo16a,lblAnexo7D, "anexo16a", Nro,btnAnexo7D);
        vSql(txtHistoriaOcupacional,lblHistorialOcupacional, "historia_oc_info", Nro,btnHistoriaOcupacional);        
        vSql(txtAntPatologicos,lblFichaAPatologicos, "antecedentes_patologicos", Nro,btnFichaAP);
        vSql(txtCuestionarioNordico,lblCuestionarioNordico, "cuestionario_nordico", Nro,btnCuestionario);
        vSql(txtCerTrabajo1,lblCertificacionAltura, "certificacion_medica_altura", Nro,btnCertiAltura);
        vSql(txtDetencionSAS,lblSAS, "ficha_sas", Nro,btnSas);
        vSql(txtConsentimientoDosaje,lblConsentimientoDosaje, "consentimiento_dosaje", Nro,btnDosaje);
        vSql(txtOftalmologia,lblOftalmologia, "oftalmologia", Nro,btnOftalmologia); 
        vSql(txtAnexo7C,lblAnexo7C, "anexo7c", Nro,btnAnexo7C);
        //modificacion
        vSql(txtCertTrabAltBarrick,lblCertTrabAltBarrick, "b_certificado_altura", Nro,btnCertTrabAltBarrick);
        vSql(txtCertCondVehBarrick,lblCertCondVehBarrick, "b_certificado_conduccion", Nro,btnCertCondVehBarrick);
        vSql(txtUsoRespirador,lblUsoRespirador, "b_uso_respiradores", Nro,btnUsoRespirador);
        vSql(txtAcctitudMedOcupa,lblAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", Nro,btnAcctitudMedOcupa);
        vSql(txtFichaOIT,lblFichaOIT,"oit",Nro,btnFichaOIT);
        vSql(txtMusculoEsqueletico,lblMusculoEsqueletico,"evaluacion_musculo_esqueletica",Nro,btnMusculoEsqueletico);
       
        
        //vSql(txtFichaConstanciaS,lblConstanciaSalud,"constancia_salud_marsa",Nro,btnConstanciaSalud);
       //vSql(txtFichaMedica,lblFichaMedica,"fmedica_covid_marsa",Nro,btnFichaMedica);
       // vSql(txtFResultadoPP,lblFResultadoPP,"ficha_pruebas_rapidas_covidf100",Nro,btnFResultadoPP);
       // vSql(txtConstanciaAlta,lblConstanciaAlta,"constancia_alta_marsa",Nro,btnConstanciaAlta);
       // vSql(txtConsentimientoI,lblConsentimientoI,"consentimiento_informado_covid",Nro,btnConsentimientoI);
       // vSql(txtCertificadoM,lblCertificadoM,"certificadoMedico",Nro,btnCertificadoM);
       // vSql(txtConstancia,lblConstancia,"constancia_tamizaje_covid19",Nro,btnConstancia);       
      //  vSql(txtConstaTamM,lblConstaTamM,"const_tamizaje_covid19_marza",Nro,btnConstaTamM);       
       // vSql(txtRegPP,lblRegPP,"pruebas_rapidas_covid19",Nro,btnRegPP);       
       // vSql(txtConstMedica,lblConstMedica,"constancia_medica_covid19",Nro,btnConstMedica);       
       // vSql(txtCartaComp,lblCartaComp,"carta_compromiso_aislamiento",Nro,btnCartaComp);       
       // vSql(txtResultPP,lblResultPP,"resultados_pruebas_rapidas",Nro,btnResultPP);       
       // vSql(txtFichaSinto,lblFichaSinto,"ficha_sintomatologica_covid19",Nro,btnFichaSinto);  
       // vSql(txtConstEncont,lblConstEncont,"constancia_encofrados",Nro,btnConstEncont);       
       // vSql(txtHojaRef,lblHojaRef,"hoja_referencia",Nro,btnHojaRef);       
       // vSql(txtIndicaMedic,lblIndicaMedic,"indicacion_medica_covid",Nro,btnIndicaMedic);       
       // vSql(txtConstAltaEpid,lblConstAltaEpid,"constancia_alta_epidemiologica",Nro,btnConstAltaEpid);   
        vSql(txtAudiometria2021,lblAudiometria2021,"audiometria_2023",Nro,btnAudiometria2021); 
        vSql(txtEvMuscEsqueletico,lblEvMuscEsqueletico,"evaluacion_musculo_esqueletica2021",Nro,btnEvMuscEsqueletico); 
        vSql(txtCuestCalidadSueño,lblCuestCalidadSueño,"cuestionario_calidad_sueno",Nro,btnCertAlturaPs);
        vSql(txtTestFatSomnolencia,lblTestFatSomnolencia,"test_fatiga_somnolencia",Nro,btnTestFatSomnolencia);
        vSql(txtEvalOftalmologica,lblEvalOftalmologica,"oftalmologia2021",Nro,btnEvalOftalmologica);
        vSql(txtCertManipuladores,lblCertManipuladores,"certificado_manipuladores_barrick",Nro,btnCertManipuladores);
        
        //Poderosa XD
        vSql(txtAptitudAltPS,lblAptitudAltPS,"aptitud_altura_poderosa",Nro,btnAptitudAPS);
        vSql(txtCertLicInterna,lblCertLicInt,"aptitud_licencia_conduciri",Nro,btnCerLicenciaPS);
        vSql(txtConsultaExt,lblConsultaExt,"hoja_consulta_externa",Nro,btnConsultaExPS);
        vSql(txtCertTrabajosCaliente,lblCertTrabajoCaliente,"aptitud_trabajos_encaliente",Nro,btnCertTrabCalientePS);
        vSql(txtPerfilBio,lblPerfilBio,"analisis_bioquimicos",Nro,btnPerfilBio);
        //OHLA
        vSql(txtCertiAptiOH,lblCertiAptiOH,"aptitud_medico_ocupacional11",Nro,btnCertiAptiOH);
        vSql(txtElectroCarOH,lblElectroCarOH,"informe_electrocardiograma_poderosa",Nro,btnElectroCardOH);


    }
    public boolean vSql(JTextField txt,JLabel lbl ,String sTabla, String sOpcion, JButton sboton)
    {   
        String sStmt="";
        boolean bResult=false;
        if(sTabla.equals("certificadoMedico")){
          sStmt = " Select * from "+sTabla;
        sStmt+= " Where cod_certificado='"+sOpcion+"'";   
        }
        else{
        sStmt = " Select * from "+sTabla;
        sStmt+= " Where n_orden='"+sOpcion+"'"; 
        System.out.println(sStmt);
        }    
        oConn.FnBoolQueryExecute(sStmt);
        try 
        {
            if (oConn.setResult.next()){        
               bResult=true;
           // lbl.setIcon(oIconoSi);
            txt.setText("PASADO");
            txt.setForeground(new java.awt.Color(51, 153, 0));
            sboton.setEnabled(true);
            }else{
             //  lbl.setIcon(oIconoNo);
                sboton.setEnabled(false);
                txt.setText("POR PASAR");
                txt.setForeground(new java.awt.Color(204, 0, 0));
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ocupacional.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return bResult;        
    }
    private void Limpiar2(){
    txtNorden.setText(null);
    txtNombre.setText(null);
    txtExamen.setText(null);
    ///
    txtTriaje.setText(null);
    txtPerfilBio.setText(null);
    txtElectrocardiograma.setText(null);
    txtRadiografiaTorax.setText(null);
    txtFichaAudiologica.setText(null);
    txtAudiometria.setText(null);
    txtEspirometria.setText(null);
    txtOdontograma.setText(null);
    txtPsicologia.setText(null);
    txtanexo16a.setText(null);
    txtHistoriaOcupacional.setText(null);
    txtAntPatologicos.setText(null);
    txtCuestionarioNordico.setText(null);
    txtanexo16a.setText(null);
    txtDetencionSAS.setText(null);
    txtConsentimientoDosaje.setText(null);
    lblSAS.setText(null);
    txtExRxSanguineos.setText(null);
    txtOftalmologia.setText(null);
    txtAnexo7C.setText(null);
    //modificacion
    txtCertTrabAltBarrick.setText(null);
    txtCertCondVehBarrick.setText(null);
    txtUsoRespirador.setText(null);
    txtAcctitudMedOcupa.setText(null);
    txtFichaOIT.setText(null);
    txtCuestAudiometria.setText(null);
    txtMusculoEsqueletico.setText(null);

    txtFichaMedicaAgro.setText(null);

    txtAudiometria2021.setText(null);
    txtEvMuscEsqueletico.setText(null);
    txtCuestCalidadSueño.setText(null);
    txtTestFatSomnolencia.setText(null);
    txtEvalOftalmologica.setText(null);
    txtCertManipuladores.setText(null);
    txtanexo16a.setText(null);
    txtAptitudAltPS.setText(null);
    txtCertLicInterna.setText(null);
    txtConsultaExt.setText(null);
    txtCertTrabajosCaliente.setText(null);
    txtPerfilBio.setText(null);
    txtCertiAptiOH.setText(null);
    txtElectroCarOH.setText(null);
    txtEnfermAltu.setText(null);
    txtLabClinico.setText(null);
    ///label
  //  lblTriaje.setIcon(oNo);
  //  lblLabClinico.setIcon(oNo);
    lblElectrocardiograma.setIcon(oNo);
  //  lblRadiografiaTorax.setIcon(oNo);
   // lblFichaAudiologica.setIcon(oNo);
   // lblAudiometria.setIcon(oNo);
  //  lblEspirometria.setIcon(oNo);
  //  lblOdontograma.setIcon(oNo);
  //  lblPsicologia.setIcon(oNo);
    lblAnexo7D.setIcon(oNo);
  //  lblHistorialOcupacional.setIcon(oNo);
  //  lblFichaAPatologicos.setIcon(oNo);
  //  lblCuestionarioNordico.setIcon(oNo);
    lblCertificacionAltura.setIcon(oNo);
    lblConsentimientoDosaje.setIcon(oNo);
    lblAnexo7C.setIcon(oNo);
  //  lblExRxSanguineos.setIcon(oNo);
    lblPerimetroToraxico.setIcon(oNo);
  //  lblOftalmologia.setIcon(oNo);
    //modificacion
    lblCertTrabAltBarrick.setIcon(oNo);
    lblCertCondVehBarrick.setIcon(oNo);
    lblUsoRespirador.setIcon(oNo);
 //   lblAcctitudMedOcupa.setIcon(oNo);
  //  lblFichaOIT.setIcon(oNo);
    lblCuestAudiometria.setIcon(oNo);
    lblInformeAudiom.setIcon(oNo);
 //   lblMusculoEsqueletico.setIcon(oNo);
//    lblFichaMedica.setIcon(oNo);
  //  lblFResultadoPP.setIcon(oNo);
    //lblConstanciaSalud.setIcon(oNo);
   // lblConstanciaAlta.setIcon(oNo);
   // lblConsentimientoI.setIcon(oNo);
   // lblCertificadoM.setIcon(oNo);

    
    lblAudiometria2021.setIcon(oNo);
    lblEvMuscEsqueletico.setIcon(oNo);
    lblCuestCalidadSueño.setIcon(oNo);
    lblTestFatSomnolencia.setIcon(oNo);
    lblEvalOftalmologica.setIcon(oNo);
    lblCertManipuladores.setIcon(oNo);
    lblAptitudAltPS.setIcon(oNo);
    //botones
    btnTriaje.setEnabled(false);
    btnLaboratorio.setEnabled(false);
    btnElectro.setEnabled(false);
    btnRadiografia.setEnabled(false);
    btnAudiologia.setEnabled(false);
    btnAudiometria.setEnabled(false);
    btnEspirometria.setEnabled(false);
    btnOdontograma.setEnabled(false);
    btnPsicologia.setEnabled(false);
    btnAnexo7D.setEnabled(false);
    btnHistoriaOcupacional.setEnabled(false);
    btnFichaAP.setEnabled(false);
    btnCuestionario.setEnabled(false);
    btnCertiAltura.setEnabled(false);
    btnDosaje.setEnabled(false);
    btnSas.setEnabled(false);
    btnAnexo7C.setEnabled(false);
    btnExRxSanguineos.setEnabled(false);
    btnOftalmologia.setEnabled(false);
    //modificacion
    btnCertTrabAltBarrick.setEnabled(false);
    btnCertCondVehBarrick.setEnabled(false);
    btnUsoRespirador.setEnabled(false);
    btnAcctitudMedOcupa.setEnabled(false);
    btnFichaOIT.setEnabled(false);
    btnCuestAudiometria.setEnabled(false);
    btnMusculoEsqueletico.setEnabled(false);
   
    btnFichaMedicaAgro.setEnabled(false);

    btnAudiometria2021.setEnabled(false);
    btnEvMuscEsqueletico.setEnabled(false);
    btnCertAlturaPs.setEnabled(false);
    btnTestFatSomnolencia.setEnabled(false);
    btnEvalOftalmologica.setEnabled(false);
    btnCertManipuladores.setEnabled(false);
    btnAptitudAPS.setEnabled(false);
    btnCerLicenciaPS.setEnabled(false);
    btnConsultaExPS.setEnabled(false);
    btnCertTrabCalientePS.setEnabled(false);
    btnPerfilBio.setEnabled(false);
    btnCertiAptiOH.setEnabled(false);
    btnElectroCardOH.setEnabled(false);
    btnEnfermAltu.setEnabled(false);
    //
    txtNorden.setEditable(true);
   // txtENombre.setEditable(true);
   // txtEtipoExamen.setEditable(true);
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
                        txtNombre.setText(oConn.setResult.getString("nombres"));
                        txtExamen.setText(oConn.setResult.getString("nom_examen"));
                        txtNorden.setEditable(false);
                        txtNombre.setEditable(false);
                        txtExamen.setEditable(false);
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
        try {
            
            // Verifico que haya habido resultados
            if (oConn.setResult.next())
            {
                // Resultado
                bResultado = true;
             
             
            }
            
            // Cierro los Resultados
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }

        return bResultado;
        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel156 = new javax.swing.JLabel();
        txtOftalmologia2 = new javax.swing.JTextField();
        lblOftalmologia2 = new javax.swing.JLabel();
        btnOftalmologia2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtExamen = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel143 = new javax.swing.JLabel();
        txtHistoriaOcupacional = new javax.swing.JTextField();
        txtCuestionarioNordico = new javax.swing.JTextField();
        txtOdontograma = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        txtPsicologia = new javax.swing.JTextField();
        lblTriaje = new javax.swing.JLabel();
        lblFichaAudiologica = new javax.swing.JLabel();
        lblElectrocardiograma = new javax.swing.JLabel();
        lblLabClinico = new javax.swing.JLabel();
        lblOdontograma = new javax.swing.JLabel();
        lblEspirometria = new javax.swing.JLabel();
        lblAnexo7D = new javax.swing.JLabel();
        lblPsicologia = new javax.swing.JLabel();
        lblHistorialOcupacional = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        txtRadiografiaTorax = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        txtFichaAudiologica = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txtEspirometria = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        txtPerfilBio = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtElectrocardiograma = new javax.swing.JTextField();
        lblConsentimientoDosaje = new javax.swing.JLabel();
        lblCuestionarioNordico = new javax.swing.JLabel();
        lblFichaAPatologicos = new javax.swing.JLabel();
        lblRadiografiaTorax = new javax.swing.JLabel();
        lblLabClinicoo = new javax.swing.JLabel();
        txtTriaje = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        txtConsentimientoDosaje = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        txtAntPatologicos = new javax.swing.JTextField();
        btnTriaje = new javax.swing.JButton();
        btnLaboratorio = new javax.swing.JButton();
        btnElectro = new javax.swing.JButton();
        btnRadiografia = new javax.swing.JButton();
        btnAudiologia = new javax.swing.JButton();
        btnEspirometria = new javax.swing.JButton();
        btnOdontograma = new javax.swing.JButton();
        btnPsicologia = new javax.swing.JButton();
        btnHistoriaOcupacional = new javax.swing.JButton();
        btnFichaAP = new javax.swing.JButton();
        btnCuestionario = new javax.swing.JButton();
        btnDosaje = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        lblExRxSanguineos = new javax.swing.JLabel();
        txtExRxSanguineos = new javax.swing.JTextField();
        btnExRxSanguineos = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        txtOftalmologia = new javax.swing.JTextField();
        lblOftalmologia = new javax.swing.JLabel();
        btnOftalmologia = new javax.swing.JButton();
        txtAnexo7C = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        lblAnexo7C = new javax.swing.JLabel();
        btnAnexo7C = new javax.swing.JButton();
        txtAudiometria = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        btnAudiometria = new javax.swing.JButton();
        lblAudiometria = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        txtUsoRespirador = new javax.swing.JTextField();
        lblUsoRespirador = new javax.swing.JLabel();
        btnUsoRespirador = new javax.swing.JButton();
        jLabel159 = new javax.swing.JLabel();
        txtAcctitudMedOcupa = new javax.swing.JTextField();
        lblAcctitudMedOcupa = new javax.swing.JLabel();
        btnAcctitudMedOcupa = new javax.swing.JButton();
        jLabel160 = new javax.swing.JLabel();
        txtFichaOIT = new javax.swing.JTextField();
        lblFichaOIT = new javax.swing.JLabel();
        btnFichaOIT = new javax.swing.JButton();
        btnActulizar = new javax.swing.JButton();
        jLabel161 = new javax.swing.JLabel();
        lblMusculoEsqueletico = new javax.swing.JLabel();
        txtMusculoEsqueletico = new javax.swing.JTextField();
        btnMusculoEsqueletico = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblCuestAudiometria = new javax.swing.JLabel();
        lblInformeAudiom = new javax.swing.JLabel();
        lblPerimetroToraxico = new javax.swing.JLabel();
        lblAudiometria2021 = new javax.swing.JLabel();
        lblEvMuscEsqueletico = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        txtCuestCalidadSueño = new javax.swing.JTextField();
        lblCuestCalidadSueño = new javax.swing.JLabel();
        btnCertAlturaPs = new javax.swing.JButton();
        lblTestFatSomnolencia = new javax.swing.JLabel();
        lblEvalOftalmologica = new javax.swing.JLabel();
        lblCertManipuladores = new javax.swing.JLabel();
        lblAptitudAltPS = new javax.swing.JLabel();
        txtAptitudAltPS = new javax.swing.JTextField();
        btnAptitudAPS = new javax.swing.JButton();
        lblCertLicInt = new javax.swing.JLabel();
        txtCertLicInterna = new javax.swing.JTextField();
        btnCerLicenciaPS = new javax.swing.JButton();
        lblConsultaExt = new javax.swing.JLabel();
        txtConsultaExt = new javax.swing.JTextField();
        btnConsultaExPS = new javax.swing.JButton();
        lblCertTrabajoCaliente = new javax.swing.JLabel();
        txtCertTrabajosCaliente = new javax.swing.JTextField();
        btnCertTrabCalientePS = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        txtCuestAudiometria = new javax.swing.JTextField();
        btnCuestAudiometria = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lblSAS2 = new javax.swing.JLabel();
        lblCertCondVehBarrick2 = new javax.swing.JLabel();
        txtCertTrabAltBarrick = new javax.swing.JTextField();
        btnCertTrabAltBarrick = new javax.swing.JButton();
        lblCertTrabAltBarrick = new javax.swing.JLabel();
        lblCertCondVehBarrick = new javax.swing.JLabel();
        txtCertCondVehBarrick = new javax.swing.JTextField();
        btnCertCondVehBarrick = new javax.swing.JButton();
        lblSAS = new javax.swing.JLabel();
        txtDetencionSAS = new javax.swing.JTextField();
        btnSas = new javax.swing.JButton();
        btnEvMuscEsqueletico = new javax.swing.JButton();
        txtEvMuscEsqueletico = new javax.swing.JTextField();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        txtAudiometria2021 = new javax.swing.JTextField();
        btnAudiometria2021 = new javax.swing.JButton();
        jLabel189 = new javax.swing.JLabel();
        txtEvalOftalmologica = new javax.swing.JTextField();
        btnEvalOftalmologica = new javax.swing.JButton();
        jLabel190 = new javax.swing.JLabel();
        txtTestFatSomnolencia = new javax.swing.JTextField();
        btnTestFatSomnolencia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtanexo16a = new javax.swing.JTextField();
        btnAnexo7D = new javax.swing.JButton();
        btnFichaMedicaAgro = new javax.swing.JButton();
        txtFichaMedicaAgro = new javax.swing.JTextField();
        lblFichaMedicaAgro = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        txtCertManipuladores = new javax.swing.JTextField();
        btnCertManipuladores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCertiAptiOH = new javax.swing.JLabel();
        lblElectroCarOH = new javax.swing.JLabel();
        txtCertiAptiOH = new javax.swing.JTextField();
        btnCertiAptiOH = new javax.swing.JButton();
        lblCertificacionAltura = new javax.swing.JLabel();
        txtCerTrabajo1 = new javax.swing.JTextField();
        btnCertiAltura = new javax.swing.JButton();
        txtElectroCarOH = new javax.swing.JTextField();
        btnElectroCardOH = new javax.swing.JButton();
        txtLabClinico = new javax.swing.JTextField();
        btnPerfilBio = new javax.swing.JButton();
        lblPerfilBio = new javax.swing.JLabel();
        lblEnfermAltu = new javax.swing.JLabel();
        txtEnfermAltu = new javax.swing.JTextField();
        btnEnfermAltu = new javax.swing.JButton();

        jLabel156.setText("Cert.Trab.Altura(Barrik):");

        txtOftalmologia2.setEditable(false);
        txtOftalmologia2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOftalmologia2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOftalmologia2.setPreferredSize(new java.awt.Dimension(13, 11));

        btnOftalmologia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnOftalmologia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologia2ActionPerformed(evt);
            }
        });

        setClosable(true);
        setTitle("Auditoria de Pacientes");
        setPreferredSize(new java.awt.Dimension(1309, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jLabel1.setText("Nro Orden :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, -1));

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        getContentPane().add(txtNorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 1, 117, -1));

        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        txtNombre.setEditable(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 301, -1));

        jLabel3.setText("Examen :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        txtExamen.setEditable(false);
        txtExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamenActionPerformed(evt);
            }
        });
        getContentPane().add(txtExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 125, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 1, 27, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 1297, -1));

        jLabel143.setText("Hist. Ocupacional : ");
        getContentPane().add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtHistoriaOcupacional.setEditable(false);
        txtHistoriaOcupacional.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHistoriaOcupacional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtHistoriaOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 107, -1));

        txtCuestionarioNordico.setEditable(false);
        txtCuestionarioNordico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestionarioNordico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCuestionarioNordico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 107, -1));

        txtOdontograma.setEditable(false);
        txtOdontograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOdontograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtOdontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 107, -1));

        jLabel138.setText("Psicologia :");
        getContentPane().add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        txtPsicologia.setEditable(false);
        txtPsicologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPsicologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 107, -1));

        lblTriaje.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        lblFichaAudiologica.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblFichaAudiologica, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        lblElectrocardiograma.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblElectrocardiograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 924, -1, -1));

        lblLabClinico.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblLabClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        lblOdontograma.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblOdontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        lblEspirometria.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblEspirometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        lblAnexo7D.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAnexo7D, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 860, -1, -1));

        lblPsicologia.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        lblHistorialOcupacional.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblHistorialOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel132.setText("Ficha Audiologica :");
        getContentPane().add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        txtRadiografiaTorax.setEditable(false);
        txtRadiografiaTorax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRadiografiaTorax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtRadiografiaTorax, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 107, -1));

        jLabel134.setText("Espirometria :");
        getContentPane().add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        txtFichaAudiologica.setEditable(false);
        txtFichaAudiologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaAudiologica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFichaAudiologica, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 107, -1));

        jLabel137.setText("Odontograma :");
        getContentPane().add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        txtEspirometria.setEditable(false);
        txtEspirometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEspirometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEspirometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 107, -1));

        jLabel128.setText("Electrocardiograma :");
        getContentPane().add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        txtPerfilBio.setEditable(false);
        txtPerfilBio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPerfilBio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPerfilBio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 107, -1));

        jLabel130.setText("Rx. Torax P.A:");
        getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        txtElectrocardiograma.setEditable(false);
        txtElectrocardiograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtElectrocardiograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtElectrocardiograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 107, -1));

        lblConsentimientoDosaje.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblConsentimientoDosaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 877, -1, -1));

        lblCuestionarioNordico.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblCuestionarioNordico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        lblFichaAPatologicos.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblFichaAPatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        lblRadiografiaTorax.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblRadiografiaTorax, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        lblLabClinicoo.setText("Lab. Clinico :");
        getContentPane().add(lblLabClinicoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        txtTriaje.setEditable(false);
        txtTriaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTriaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 107, -1));

        jLabel124.setText("Triaje :");
        getContentPane().add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jLabel150.setText("Consentimiento Dosaje :");
        getContentPane().add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel151.setText("Ficha Ant. Patológicos :");
        getContentPane().add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtConsentimientoDosaje.setEditable(false);
        txtConsentimientoDosaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsentimientoDosaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtConsentimientoDosaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 107, -1));

        jLabel145.setText("Cuestionario Nórdico :");
        getContentPane().add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtAntPatologicos.setEditable(false);
        txtAntPatologicos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAntPatologicos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAntPatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 107, -1));

        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 20, -1));

        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 20, -1));

        btnElectro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnElectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectroActionPerformed(evt);
            }
        });
        getContentPane().add(btnElectro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 20, -1));

        btnRadiografia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnRadiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiografiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadiografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 20, -1));

        btnAudiologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAudiologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAudiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 20, -1));

        btnEspirometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEspirometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspirometriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEspirometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 20, -1));

        btnOdontograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnOdontograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdontogramaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOdontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 20, 16));

        btnPsicologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnPsicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsicologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 20, -1));

        btnHistoriaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnHistoriaOcupacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaOcupacionalActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoriaOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 20, -1));

        btnFichaAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaAPActionPerformed(evt);
            }
        });
        getContentPane().add(btnFichaAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 20, -1));

        btnCuestionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuestionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 20, -1));

        btnDosaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnDosaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDosaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 20, -1));

        jLabel139.setText("Ex. Rx Sanguineos :");
        getContentPane().add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        lblExRxSanguineos.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblExRxSanguineos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, -1, -1));

        txtExRxSanguineos.setEditable(false);
        txtExRxSanguineos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtExRxSanguineos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtExRxSanguineos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 107, -1));

        btnExRxSanguineos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnExRxSanguineos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExRxSanguineosActionPerformed(evt);
            }
        });
        getContentPane().add(btnExRxSanguineos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 20, -1));

        jLabel153.setText("Oftalmología :");
        getContentPane().add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        txtOftalmologia.setEditable(false);
        txtOftalmologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOftalmologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 107, -1));

        lblOftalmologia.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 20, -1));

        txtAnexo7C.setEditable(false);
        txtAnexo7C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAnexo7C.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAnexo7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 107, -1));

        jLabel154.setText("Anexo 16 :");
        getContentPane().add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        lblAnexo7C.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAnexo7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 894, -1, -1));

        btnAnexo7C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAnexo7C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7CActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnexo7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 20, -1));

        txtAudiometria.setEditable(false);
        txtAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAudiometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 107, -1));

        jLabel133.setText("Audiometria:");
        getContentPane().add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        btnAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiometriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 20, -1));

        lblAudiometria.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel158.setText("Uso de Respiradores:");
        getContentPane().add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtUsoRespirador.setEditable(false);
        txtUsoRespirador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUsoRespirador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtUsoRespirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 107, -1));

        lblUsoRespirador.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblUsoRespirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        btnUsoRespirador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnUsoRespirador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsoRespiradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsoRespirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 20, -1));

        jLabel159.setText("Actitud Med.Ocupacional:");
        getContentPane().add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtAcctitudMedOcupa.setEditable(false);
        txtAcctitudMedOcupa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAcctitudMedOcupa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAcctitudMedOcupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 107, -1));

        lblAcctitudMedOcupa.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAcctitudMedOcupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        btnAcctitudMedOcupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAcctitudMedOcupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcctitudMedOcupaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcctitudMedOcupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 20, -1));

        jLabel160.setText("Ficha OIT:");
        getContentPane().add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        txtFichaOIT.setEditable(false);
        txtFichaOIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaOIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFichaOIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 107, -1));

        lblFichaOIT.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblFichaOIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        btnFichaOIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaOIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaOITActionPerformed(evt);
            }
        });
        getContentPane().add(btnFichaOIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 20, -1));

        btnActulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActulizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel161.setText("Ev.MuscoloEsqueletica :");
        getContentPane().add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        lblMusculoEsqueletico.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblMusculoEsqueletico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        txtMusculoEsqueletico.setEditable(false);
        txtMusculoEsqueletico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMusculoEsqueletico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtMusculoEsqueletico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 107, -1));

        btnMusculoEsqueletico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnMusculoEsqueletico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusculoEsqueleticoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMusculoEsqueletico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 20, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Poderosa"));
        jPanel4.setForeground(new java.awt.Color(0, 255, 204));
        jPanel4.setName("FD"); // NOI18N

        lblCuestAudiometria.setPreferredSize(new java.awt.Dimension(13, 11));

        lblInformeAudiom.setPreferredSize(new java.awt.Dimension(13, 11));

        lblPerimetroToraxico.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAudiometria2021.setPreferredSize(new java.awt.Dimension(13, 11));

        lblEvMuscEsqueletico.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel149.setText("Cert. Trabajo Alt. Poderosa");

        txtCuestCalidadSueño.setEditable(false);
        txtCuestCalidadSueño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestCalidadSueño.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCuestCalidadSueño.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCertAlturaPs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertAlturaPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertAlturaPsActionPerformed(evt);
            }
        });

        lblTestFatSomnolencia.setPreferredSize(new java.awt.Dimension(13, 11));

        lblEvalOftalmologica.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCertManipuladores.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAptitudAltPS.setText("Aptitud Altura Poderosa");

        txtAptitudAltPS.setEditable(false);
        txtAptitudAltPS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAptitudAltPS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAptitudAPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAptitudAPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAptitudAPSActionPerformed(evt);
            }
        });

        lblCertLicInt.setText("Cert. Licencia Interna ");

        txtCertLicInterna.setEditable(false);
        txtCertLicInterna.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertLicInterna.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCerLicenciaPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCerLicenciaPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerLicenciaPSActionPerformed(evt);
            }
        });

        lblConsultaExt.setText("Consulta Externa");

        txtConsultaExt.setEditable(false);
        txtConsultaExt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsultaExt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnConsultaExPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnConsultaExPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaExPSActionPerformed(evt);
            }
        });

        lblCertTrabajoCaliente.setText("Cert. Trabajos en Caliente");

        txtCertTrabajosCaliente.setEditable(false);
        txtCertTrabajosCaliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertTrabajosCaliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCertTrabCalientePS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertTrabCalientePS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertTrabCalientePSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(lblCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblAptitudAltPS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAptitudAltPS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAptitudAPS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel149)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCertAlturaPs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblCertLicInt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCertLicInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCerLicenciaPS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(286, 286, 286))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(lblCertTrabajoCaliente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCertTrabajosCaliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCertTrabCalientePS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(lblConsultaExt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtConsultaExt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnConsultaExPS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInformeAudiom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCuestAudiometria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel149)
                                .addComponent(txtCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCertAlturaPs))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAptitudAltPS)
                        .addComponent(txtAptitudAltPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAptitudAPS))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerLicenciaPS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCertLicInt)
                                .addComponent(txtCertLicInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultaExPS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblConsultaExt)
                                .addComponent(txtConsultaExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTestFatSomnolencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCertTrabCalientePS, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCertTrabajoCaliente)
                            .addComponent(txtCertTrabajosCaliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 340, 170));
        jPanel4.getAccessibleContext().setAccessibleName("pROBAR");

        jLabel140.setText("Cuest. Audiometria:");
        getContentPane().add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        txtCuestAudiometria.setEditable(false);
        txtCuestAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestAudiometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCuestAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 107, -1));

        btnCuestAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCuestAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestAudiometriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuestAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 20, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Boroo"));

        lblSAS2.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCertCondVehBarrick2.setPreferredSize(new java.awt.Dimension(13, 11));

        txtCertTrabAltBarrick.setEditable(false);
        txtCertTrabAltBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertTrabAltBarrick.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCertTrabAltBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertTrabAltBarrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertTrabAltBarrickActionPerformed(evt);
            }
        });

        lblCertTrabAltBarrick.setText("Cert.Trab.Altura(Barrik):");

        lblCertCondVehBarrick.setText("Cert.Conducc.Vehiculos(Barrik):");

        txtCertCondVehBarrick.setEditable(false);
        txtCertCondVehBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertCondVehBarrick.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCertCondVehBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertCondVehBarrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertCondVehBarrickActionPerformed(evt);
            }
        });

        lblSAS.setText("Ficha S.A.S :");

        txtDetencionSAS.setEditable(false);
        txtDetencionSAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDetencionSAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnSas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSasActionPerformed(evt);
            }
        });

        btnEvMuscEsqueletico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEvMuscEsqueletico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvMuscEsqueleticoActionPerformed(evt);
            }
        });

        txtEvMuscEsqueletico.setEditable(false);
        txtEvMuscEsqueletico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEvMuscEsqueletico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel172.setText("Ev.Musc.Esqueletico:");

        jLabel173.setText("Audiometria Boroo: ");

        txtAudiometria2021.setEditable(false);
        txtAudiometria2021.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAudiometria2021.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAudiometria2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAudiometria2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiometria2021ActionPerformed(evt);
            }
        });

        jLabel189.setText("Eval. Oftalmologica:");

        txtEvalOftalmologica.setEditable(false);
        txtEvalOftalmologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEvalOftalmologica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEvalOftalmologica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEvalOftalmologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvalOftalmologicaActionPerformed(evt);
            }
        });

        jLabel190.setText("TestFatSomnolencia:");

        txtTestFatSomnolencia.setEditable(false);
        txtTestFatSomnolencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTestFatSomnolencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTestFatSomnolencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnTestFatSomnolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestFatSomnolenciaActionPerformed(evt);
            }
        });

        jLabel4.setText("Anexo 16-A:");

        txtanexo16a.setEditable(false);
        txtanexo16a.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtanexo16a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtanexo16a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanexo16aActionPerformed(evt);
            }
        });

        btnAnexo7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAnexo7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSAS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCertTrabAltBarrick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblCertCondVehBarrick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCertCondVehBarrick2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel172)
                                .addGap(4, 4, 4)
                                .addComponent(txtEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblSAS)
                                .addGap(18, 18, 18)
                                .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel173)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel189)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(txtanexo16a, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btnAnexo7D))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel190)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSAS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(txtCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCertTrabAltBarrick))
                    .addComponent(lblCertTrabAltBarrick))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCertCondVehBarrick2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCertCondVehBarrick)
                        .addComponent(txtCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCertCondVehBarrick))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSAS)
                    .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEvMuscEsqueletico)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel172)
                        .addComponent(txtEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAudiometria2021)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel173)
                        .addComponent(txtAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEvalOftalmologica)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel189)
                        .addComponent(txtEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTestFatSomnolencia)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel190)
                        .addComponent(txtTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtanexo16a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnexo7D))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 350, 250));

        btnFichaMedicaAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaMedicaAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaAgroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFichaMedicaAgro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 20, -1));

        txtFichaMedicaAgro.setEditable(false);
        txtFichaMedicaAgro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaMedicaAgro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFichaMedicaAgro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 107, -1));

        lblFichaMedicaAgro.setText("F.Medica Anexo2");
        getContentPane().add(lblFichaMedicaAgro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel188.setText("Cert. Manipuladores:");
        getContentPane().add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        txtCertManipuladores.setEditable(false);
        txtCertManipuladores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertManipuladores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCertManipuladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 107, -1));

        btnCertManipuladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertManipuladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertManipuladoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnCertManipuladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 20, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ohla"));

        lblCertiAptiOH.setText("Certificado de Aptitud");

        lblElectroCarOH.setText("Electrocardiograma");

        txtCertiAptiOH.setEditable(false);
        txtCertiAptiOH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertiAptiOH.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCertiAptiOH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertiAptiOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertiAptiOHActionPerformed(evt);
            }
        });

        lblCertificacionAltura.setText("Altura Estructural");

        txtCerTrabajo1.setEditable(false);
        txtCerTrabajo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCerTrabajo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCerTrabajo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCerTrabajo1ActionPerformed(evt);
            }
        });

        btnCertiAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertiAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertiAlturaActionPerformed(evt);
            }
        });

        txtElectroCarOH.setEditable(false);
        txtElectroCarOH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtElectroCarOH.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnElectroCardOH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnElectroCardOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectroCardOHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCertiAptiOH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCertiAptiOH, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCertiAptiOH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblElectroCarOH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtElectroCarOH, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnElectroCardOH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCertificacionAltura)
                        .addGap(11, 11, 11)
                        .addComponent(txtCerTrabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCertiAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCertiAptiOH)
                        .addComponent(txtCertiAptiOH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCertiAptiOH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCertificacionAltura)
                    .addComponent(txtCerTrabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertiAltura))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblElectroCarOH)
                        .addComponent(txtElectroCarOH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnElectroCardOH))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 300, 120));

        txtLabClinico.setEditable(false);
        txtLabClinico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLabClinico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtLabClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 107, -1));

        btnPerfilBio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnPerfilBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilBioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfilBio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 20, -1));

        lblPerfilBio.setText("Perfil Bioquimico:");
        getContentPane().add(lblPerfilBio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        lblEnfermAltu.setText("Enfermedades en Altura:");
        getContentPane().add(lblEnfermAltu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtEnfermAltu.setEditable(false);
        txtEnfermAltu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEnfermAltu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEnfermAltu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 107, -1));

        btnEnfermAltu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEnfermAltu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermAltuActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnfermAltu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
       verifica(txtNorden.getText().toString());
      //verifica2();
       
    }//GEN-LAST:event_txtNordenActionPerformed


public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
          try {
              oConn.sqlStmt.close();
          } catch (SQLException ex) {
              Logger.getLogger(Auditoria.class.getName()).log(Level.SEVERE, null, ex);
          }
  
    //this.dispose();
      //  System.exit(0);

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
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar2();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void btnTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriajeActionPerformed
          
          if(estacerrado(ft)){  
          ft =new FichaTriaje();
          Desktop.add(ft);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      ft.setLocation(centradoXY(ft));

          ft.show();
          //fn.setVisible(true);
       }
             else{
            ft.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }

//        if(oPu.eDatos(txtTriaje, "triaje", "Triaje", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnTriajeActionPerformed
    private void btnLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorioActionPerformed
        //if(oPu.eDatos(txtLabClinico, "lab_clinico", "Laboratorio Clinico", txtNorden)){verifica(txtNorden.getText().toString());}
                  if(estacerrado(lc)){  
          lc =new LaboratorioClinico();
          Desktop.add(lc);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      lc.setLocation(centradoXY(lc));

          lc.show();
          //fn.setVisible(true);
       }
             else{
            lc.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }

    }//GEN-LAST:event_btnLaboratorioActionPerformed
    private void btnElectroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectroActionPerformed
        //if(oPu.eDatos(txtRadiografiaTorax, "radiografia_torax", "Examenes Radiograficos", txtNorden)){verifica(txtNorden.getText().toString());}
          if(estacerrado(Elec)){  
          Elec =new ElectroCardiograma();
          Desktop.add(Elec);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Elec.setLocation(centradoXY(Elec));

          Elec.show();
          //fn.setVisible(true);
       }
             else{
            Elec.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
        
        
    }//GEN-LAST:event_btnElectroActionPerformed
    private void btnRadiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiografiaActionPerformed
        //if(oPu.eDatos(txtRadiografiaTorax, "radiografia_torax", "Examenes Radiograficos", txtNorden)){verifica(txtNorden.getText().toString());}
          if(estacerrado(rt)){  
          rt =new RadiografiaTorax();
          Desktop.add(rt);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      rt.setLocation(centradoXY(rt));

          rt.show();
          //fn.setVisible(true);
       }
             else{
            rt.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_btnRadiografiaActionPerformed
    private void btnAudiologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiologiaActionPerformed
        //if(oPu.eDatos(txtFichaAudiologica, "ficha_audiologica", "Ficha Audiometria", txtNorden)){verifica(txtNorden.getText().toString()); //verifica2();}
        //if(oPu.eDatos(txtFichaAudiologica, "audiometria_po", "Examen Audiometrico", txtNorden)){verifica(txtNorden.getText().toString()); }}//verifica2();}
                  if(estacerrado(audi)){ 
                      int tabIndex = 1;
          audi =new Audiometria(tabIndex);
          Desktop.add(audi);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      audi.setLocation(centradoXY(audi));

          audi.show();
          //fn.setVisible(true);
       }
             else{
            audi.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_btnAudiologiaActionPerformed
    private void btnEspirometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspirometriaActionPerformed
//if(oPu.eDatos(txtFichaAudiologica, "ficha_audiologica", "Ficha Audiometria", txtNorden)){verifica(txtNorden.getText().toString()); //verifica2();}
        //if(oPu.eDatos(txtFichaAudiologica, "audiometria_po", "Examen Audiometrico", txtNorden)){verifica(txtNorden.getText().toString()); }}//verifica2();}
                  if(estacerrado(espiro)){  
          espiro =new FuncionRespiratoriaABS();
          Desktop.add(espiro);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      espiro.setLocation(centradoXY(espiro));

          espiro.show();
          //fn.setVisible(true);
       }
             else{
            espiro.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnEspirometriaActionPerformed
    private void btnOdontogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdontogramaActionPerformed
         //if(oPu.eDatos(txtOdontograma, "odontograma", "Odontograma", txtNorden)){verifica(txtNorden.getText().toString());}
                           if(estacerrado(odon)){  
          odon =new Odontograma();
          Desktop.add(odon);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      odon.setLocation(centradoXY(odon));

          odon.show();
          //fn.setVisible(true);
       }
             else{
            odon.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
         
    }//GEN-LAST:event_btnOdontogramaActionPerformed
    private void btnPsicologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsicologiaActionPerformed
       //  if(oPu.eDatos(txtPsicologia, "informe_psicologico", "Psicologia", txtNorden)){verifica(txtNorden.getText().toString());}
          if(estacerrado(infP)){  
          infP =new InformePsicologico();
          Desktop.add(infP);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      infP.setLocation(centradoXY(infP));

          infP.show();
          //fn.setVisible(true);
       }
             else{
            infP.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
       
    }//GEN-LAST:event_btnPsicologiaActionPerformed
    private void btnHistoriaOcupacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaOcupacionalActionPerformed
     /*   if(oPu.eSubRegistros(txtHistoriaOcupacional, "historia_oc_detalle","cod_ho", oPu.oConsultar("cod_ho", "historia_oc_info", txtNorden))){
        if(oPu.eDatos(txtHistoriaOcupacional, "historia_oc_info", "Historia Ocupacional info", txtNorden)){verifica(txtNorden.getText().toString());
        }
        }
        */
               if(estacerrado(empLugGeo)){  
          empLugGeo =new EmpresasLugaresGeograficos();
          Desktop.add(empLugGeo);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      empLugGeo.setLocation(centradoXY(empLugGeo));

          empLugGeo.show();
          //fn.setVisible(true);
       }
             else{
            empLugGeo.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
       
     
    }//GEN-LAST:event_btnHistoriaOcupacionalActionPerformed

    private void btnFichaAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaAPActionPerformed
      /* if(oPu.eSubRegistros(txtAntPatologicos, "antecedentes_patologicos_quirurgicos","cod_ap", oPu.oConsultar("cod_ap", "antecedentes_patologicos", txtNorden))){
        if(oPu.eDatos(txtAntPatologicos, "antecedentes_patologicos", "Antecedentes Patologicos", txtNorden)){verifica(txtNorden.getText().toString());
        }
        }*/
                if(estacerrado(antP)){  
          antP =new AntecedentesPatologicos();
          Desktop.add(antP);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      antP.setLocation(centradoXY(antP));

          antP.show();
          //fn.setVisible(true);
       }
             else{
            antP.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
      
      
    }//GEN-LAST:event_btnFichaAPActionPerformed

    private void btnCuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestionarioActionPerformed
      // if(oPu.eDatos(txtCuestionarioNordico, "cuestionario_nordico", "Cuestionario Nordico", txtNorden)){verifica(txtNorden.getText().toString());} 
      
                      if(estacerrado(cuestNord)){  
          cuestNord =new CuestionarioNordico();
          Desktop.add(cuestNord);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      cuestNord.setLocation(centradoXY(cuestNord));

          cuestNord.show();
          //fn.setVisible(true);
       }
             else{
            cuestNord.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
      
    }//GEN-LAST:event_btnCuestionarioActionPerformed
    private void btnDosajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosajeActionPerformed
        if(estacerrado(Dosj)){  
          Dosj =new ConsentimientoDosajeMC();
          Desktop.add(Dosj);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Dosj.setLocation(centradoXY(Dosj));

          Dosj.show();
          //fn.setVisible(true);
       }
             else{
            Dosj.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnDosajeActionPerformed

    private void btnExRxSanguineosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExRxSanguineosActionPerformed
        // TODO add your handling code here:  
        // if(oPu.eDatos(txtExRxSanguineos, "ex_radiograficos_sanguineos", "Examenes Radiograficos Sanguineos", txtNorden)){verifica(txtNorden.getText().toString());}
                   if(estacerrado(exRadSan)){  
          exRadSan =new ExamenRadiograficoSanguineo();
          Desktop.add(exRadSan);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      exRadSan.setLocation(centradoXY(exRadSan));

          exRadSan.show();
          //fn.setVisible(true);
       }
             else{
            exRadSan.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
         
    }//GEN-LAST:event_btnExRxSanguineosActionPerformed

    private void btnOftalmologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOftalmologiaActionPerformed
       //if(oPu.eDatos(txtPerimetroToraxico, "oftalmologia", "oftalmología", txtNorden)){verifica(txtNorden.getText().toString());}
       //if(oPu.eDatos(txtOdontograma, "odontograma", "Odontograma", txtNorden)){verifica(txtNorden.getText().toString());}
                           if(estacerrado(oftl)){  
          oftl =new FichaOftalmologica();
          Desktop.add(oftl);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      oftl.setLocation(centradoXY(oftl));

          oftl.show();
          //fn.setVisible(true);
       }
             else{
            oftl.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnOftalmologiaActionPerformed

    private void btnAnexo7CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7CActionPerformed
                           if(estacerrado(A16f)){  
          A16f =new FichaMedica();
          Desktop.add(A16f);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      A16f.setLocation(centradoXY(A16f));

          A16f.show();
          //fn.setVisible(true);
       }
             else{
            A16f.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
    }//GEN-LAST:event_btnAnexo7CActionPerformed

    private void btnAudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiometriaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(audi)){  
          audi =new Audiometria();
          Desktop.add(audi);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      audi.setLocation(centradoXY(audi));

          audi.show();
          //fn.setVisible(true);
       }
             else{
            audi.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        // verifica2();}
    }//GEN-LAST:event_btnAudiometriaActionPerformed

    private void btnOftalmologia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOftalmologia2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOftalmologia2ActionPerformed

    private void btnUsoRespiradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsoRespiradorActionPerformed
        // TODO add your handling code here:
         //if(oPu.eDatos(txtOdontograma, "odontograma", "Odontograma", txtNorden)){verifica(txtNorden.getText().toString());}
                           if(estacerrado(Uresp)){  
          Uresp =new B_Uso_Respiradores();
          Desktop.add(Uresp);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Uresp.setLocation(centradoXY(Uresp));

          Uresp.show();
          //fn.setVisible(true);
       }
             else{
            Uresp.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnUsoRespiradorActionPerformed

    private void btnAcctitudMedOcupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcctitudMedOcupaActionPerformed
       //if(oPu.eDatos(txtOdontograma, "odontograma", "Odontograma", txtNorden)){verifica(txtNorden.getText().toString());}
                           if(estacerrado(Mocup)){  
          Mocup =new Aptitud_Medico_Ocupacional();
          Desktop.add(Mocup);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Mocup.setLocation(centradoXY(Mocup));

          Mocup.show();
          //fn.setVisible(true);
       }
             else{
            Mocup.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAcctitudMedOcupaActionPerformed

    private void btnFichaOITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaOITActionPerformed
        // TODO add your handling code here:
        // if(oPu.eDatos(txtFichaOIT, "oit", "Ficha OIT", txtNorden)){verifica(txtNorden.getText().toString());}
                if(estacerrado(boit)){  
          boit =new B_OIT();
          Desktop.add(boit);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      boit.setLocation(centradoXY(boit));

          boit.show();
          //fn.setVisible(true);
       }
             else{
            boit.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnFichaOITActionPerformed

    private void btnCuestAudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestAudiometriaActionPerformed
        if(estacerrado(Caudi)){  
          Caudi =new CuestionarioAudiometria();
          Desktop.add(Caudi);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Caudi.setLocation(centradoXY(Caudi));

          Caudi.show();
          //fn.setVisible(true);
       }
             else{
            Caudi.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCuestAudiometriaActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
        verifica(txtNorden.getText().toString());
    }//GEN-LAST:event_btnActulizarActionPerformed

    private void btnMusculoEsqueleticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusculoEsqueleticoActionPerformed
 // TODO add your handling code here:
        // if(oPu.eDatos(txtFichaOIT, "oit", "Ficha OIT", txtNorden)){verifica(txtNorden.getText().toString());}
                if(estacerrado(MusEsq)){  
          MusEsq =new EvaluacionMusculoEsqueletica();
          Desktop.add(MusEsq);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      MusEsq.setLocation(centradoXY(MusEsq));

          MusEsq.show();
          //fn.setVisible(true);
       }
             else{
            MusEsq.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnMusculoEsqueleticoActionPerformed

    private void btnFichaMedicaAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicaAgroActionPerformed
        // TODO add your handling code here:
      if(estacerrado(Fmeda2)){  
          Fmeda2 =new FichaAgroindustriales();
          Desktop.add(Fmeda2);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Fmeda2.setLocation(centradoXY(Fmeda2));

          Fmeda2.show();
          //fn.setVisible(true);
       }
             else{
            Fmeda2.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
         
        
    }//GEN-LAST:event_btnFichaMedicaAgroActionPerformed

    private void txtExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamenActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
  
       //cerrarVentana();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnCertAlturaPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertAlturaPsActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Ctalps)){  
          Ctalps =new Certificacion_Trabajo_Altura_Poderosa();
          Desktop.add(Ctalps);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Ctalps.setLocation(centradoXY(Ctalps));

          Ctalps.show();
          //fn.setVisible(true);
       }
             else{
            Ctalps.moveToFront();
         
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCertAlturaPsActionPerformed

    private void btnCertManipuladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertManipuladoresActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Cman)){  
          Cman =new CertificadoManipuladoresBarrick();
          Desktop.add(Cman);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Cman.setLocation(centradoXY(Cman));

          Cman.show();
          //fn.setVisible(true);
       }
             else{
            Cman.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCertManipuladoresActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    
  
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnCertTrabAltBarrickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertTrabAltBarrickActionPerformed
        if(estacerrado(Balt)){  
          Balt =new B_Certificacion_Trabajo_Altura();
          Desktop.add(Balt);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Balt.setLocation(centradoXY(Balt));

          Balt.show();
          //fn.setVisible(true);
       }
             else{
            Balt.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCertTrabAltBarrickActionPerformed

    private void btnCertCondVehBarrickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertCondVehBarrickActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Bcon)){  
          Bcon =new B_Certificacion_conduccion();
          Desktop.add(Bcon);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Bcon.setLocation(centradoXY(Bcon));

          Bcon.show();
          //fn.setVisible(true);
       }
             else{
            Bcon.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCertCondVehBarrickActionPerformed

    private void btnSasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSasActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Bapn)){  
          Bapn =new b_Ficha_Sas();
          Desktop.add(Bapn);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Bapn.setLocation(centradoXY(Bapn));

          Bapn.show();
          //fn.setVisible(true);
       }
             else{
            Bapn.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnSasActionPerformed

    private void btnEvMuscEsqueleticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvMuscEsqueleticoActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Msc2021)){  
          Msc2021 =new EvaluacionMusculoEsqueletica2021();
          Desktop.add(Msc2021);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Msc2021.setLocation(centradoXY(Msc2021));

          Msc2021.show();
          //fn.setVisible(true);
       }
             else{
            Msc2021.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnEvMuscEsqueleticoActionPerformed

    private void btnAudiometria2021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiometria2021ActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Audi2023)){  
          Audi2023 =new Audiometria2023();
          Desktop.add(Audi2023);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Audi2023.setLocation(centradoXY(Audi2023));

          Audi2023.show();
          //fn.setVisible(true);
       }
             else{
            Audi2023.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAudiometria2021ActionPerformed

    private void btnEvalOftalmologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvalOftalmologicaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Oft2021)){  
          Oft2021 =new EvaluacionOftalmologica();
          Desktop.add(Oft2021);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Oft2021.setLocation(centradoXY(Oft2021));

          Oft2021.show();
          //fn.setVisible(true);
       }
             else{
            Oft2021.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnEvalOftalmologicaActionPerformed

    private void btnTestFatSomnolenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestFatSomnolenciaActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Tsomn)){  
          Tsomn =new TestFatigaSomnolencia();
          Desktop.add(Tsomn);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Tsomn.setLocation(centradoXY(Tsomn));

          Tsomn.show();
          //fn.setVisible(true);
       }
             else{
            Tsomn.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnTestFatSomnolenciaActionPerformed

    private void btnAptitudAPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAptitudAPSActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Aaltps)){  
          Aaltps =new Aptitud_Altura_Poderosa();
          Desktop.add(Aaltps);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Aaltps.setLocation(centradoXY(Aaltps));

          Aaltps.show();
          //fn.setVisible(true);
       }
             else{
            Aaltps.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnAptitudAPSActionPerformed

    private void btnCerLicenciaPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerLicenciaPSActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Alicps)){  
          Alicps =new Aptitud_Licencia_Conducir_Interna();
          Desktop.add(Alicps);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Alicps.setLocation(centradoXY(Alicps));

          Alicps.show();
          //fn.setVisible(true);
       }
             else{
            Alicps.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCerLicenciaPSActionPerformed

    private void btnConsultaExPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaExPSActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Hcexps)){  
          Hcexps =new Hoja_Consulta_Externa();
          Desktop.add(Hcexps);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Hcexps.setLocation(centradoXY(Hcexps));

          Hcexps.show();
          //fn.setVisible(true);
       }
             else{
            Hcexps.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnConsultaExPSActionPerformed

    private void btnCertTrabCalientePSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertTrabCalientePSActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Atcalps)){  
          Atcalps =new Aptitud_Trabajos_EnCaliente();
          Desktop.add(Atcalps);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Atcalps.setLocation(centradoXY(Atcalps));

          Atcalps.show();
          //fn.setVisible(true);
       }
             else{
            Atcalps.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
    }//GEN-LAST:event_btnCertTrabCalientePSActionPerformed

    private void btnCertiAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertiAlturaActionPerformed
        if(estacerrado(Aalt)){  
          Aalt =new A_CertificacionMedicaTrabajoAltura();
          Desktop.add(Aalt);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Aalt.setLocation(centradoXY(Aalt));

          Aalt.show();
          //fn.setVisible(true);
       }
             else{
            Aalt.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }
        
        
    }//GEN-LAST:event_btnCertiAlturaActionPerformed

    private void txtanexo16aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanexo16aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanexo16aActionPerformed

    private void btnAnexo7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7DActionPerformed
        if(estacerrado(A16)){  
          A16 =new Anexo16A();
          Desktop.add(A16);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      A16.setLocation(centradoXY(A16));

          A16.show();
          //fn.setVisible(true);
       }
             else{
            A16.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }        
    }//GEN-LAST:event_btnAnexo7DActionPerformed

    private void txtCerTrabajo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCerTrabajo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCerTrabajo1ActionPerformed

    private void btnPerfilBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilBioActionPerformed
        // TODO add your handling code here:
        if(estacerrado(Abio)){  
          Abio =new AnalisisBioquimico();
          Desktop.add(Abio);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      Abio.setLocation(centradoXY(Abio));

          Abio.show();
          //fn.setVisible(true);
       }
             else{
            Abio.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }   
    }//GEN-LAST:event_btnPerfilBioActionPerformed

    private void btnCertiAptiOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertiAptiOHActionPerformed
        // TODO add your handling code here:
        if(estacerrado(CAptiOH)){  
          CAptiOH =new Aptitud_Medico_Ocupacional11();
          Desktop.add(CAptiOH);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      CAptiOH.setLocation(centradoXY(CAptiOH));

          CAptiOH.show();
          //fn.setVisible(true);
       }
             else{
            CAptiOH.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }  
    }//GEN-LAST:event_btnCertiAptiOHActionPerformed

    private void btnElectroCardOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectroCardOHActionPerformed
        // TODO add your handling code here:
        if(estacerrado(ElctOH)){  
          ElctOH =new ElectroCardiogramaPoderosa();
          Desktop.add(ElctOH);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      ElctOH.setLocation(centradoXY(ElctOH));

          ElctOH.show();
          //fn.setVisible(true);
       }
             else{
            ElctOH.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }  
    }//GEN-LAST:event_btnElectroCardOHActionPerformed

    private void btnEnfermAltuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermAltuActionPerformed
        // TODO add your handling code here:
        if(estacerrado(EnfA)){  
          EnfA =new AntecedentesEnfermedadesAltura();
          Desktop.add(EnfA);          
        ImageIcon ticon = new ImageIcon(ClassLoader.getSystemResource("imagenes/enfermera.png"));
        // audit.setFrameIcon(ticon);
      EnfA.setLocation(centradoXY(EnfA));

          EnfA.show();
          //fn.setVisible(true);
       }
             else{
            EnfA.moveToFront();
      
        
          //  JOptionPane.showMessageDialog(this,"Error: La ventana ya esta abierta...");
        }  
    }//GEN-LAST:event_btnEnfermAltuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcctitudMedOcupa;
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnAnexo7C;
    private javax.swing.JButton btnAnexo7D;
    private javax.swing.JButton btnAptitudAPS;
    private javax.swing.JButton btnAudiologia;
    private javax.swing.JButton btnAudiometria;
    private javax.swing.JButton btnAudiometria2021;
    private javax.swing.JButton btnCerLicenciaPS;
    private javax.swing.JButton btnCertAlturaPs;
    private javax.swing.JButton btnCertCondVehBarrick;
    private javax.swing.JButton btnCertManipuladores;
    private javax.swing.JButton btnCertTrabAltBarrick;
    private javax.swing.JButton btnCertTrabCalientePS;
    private javax.swing.JButton btnCertiAltura;
    private javax.swing.JButton btnCertiAptiOH;
    private javax.swing.JButton btnConsultaExPS;
    private javax.swing.JButton btnCuestAudiometria;
    private javax.swing.JButton btnCuestionario;
    private javax.swing.JButton btnDosaje;
    private javax.swing.JButton btnElectro;
    private javax.swing.JButton btnElectroCardOH;
    private javax.swing.JButton btnEnfermAltu;
    private javax.swing.JButton btnEspirometria;
    private javax.swing.JButton btnEvMuscEsqueletico;
    private javax.swing.JButton btnEvalOftalmologica;
    private javax.swing.JButton btnExRxSanguineos;
    private javax.swing.JButton btnFichaAP;
    private javax.swing.JButton btnFichaMedicaAgro;
    private javax.swing.JButton btnFichaOIT;
    private javax.swing.JButton btnHistoriaOcupacional;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMusculoEsqueletico;
    private javax.swing.JButton btnOdontograma;
    private javax.swing.JButton btnOftalmologia;
    private javax.swing.JButton btnOftalmologia2;
    private javax.swing.JButton btnPerfilBio;
    private javax.swing.JButton btnPsicologia;
    private javax.swing.JButton btnRadiografia;
    private javax.swing.JButton btnSas;
    private javax.swing.JButton btnTestFatSomnolencia;
    private javax.swing.JButton btnTriaje;
    private javax.swing.JButton btnUsoRespirador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAcctitudMedOcupa;
    private javax.swing.JLabel lblAnexo7C;
    private javax.swing.JLabel lblAnexo7D;
    private javax.swing.JLabel lblAptitudAltPS;
    private javax.swing.JLabel lblAudiometria;
    private javax.swing.JLabel lblAudiometria2021;
    private javax.swing.JLabel lblCertCondVehBarrick;
    private javax.swing.JLabel lblCertCondVehBarrick2;
    private javax.swing.JLabel lblCertLicInt;
    private javax.swing.JLabel lblCertManipuladores;
    private javax.swing.JLabel lblCertTrabAltBarrick;
    private javax.swing.JLabel lblCertTrabajoCaliente;
    private javax.swing.JLabel lblCertiAptiOH;
    private javax.swing.JLabel lblCertificacionAltura;
    private javax.swing.JLabel lblConsentimientoDosaje;
    private javax.swing.JLabel lblConsultaExt;
    private javax.swing.JLabel lblCuestAudiometria;
    private javax.swing.JLabel lblCuestCalidadSueño;
    private javax.swing.JLabel lblCuestionarioNordico;
    private javax.swing.JLabel lblElectroCarOH;
    private javax.swing.JLabel lblElectrocardiograma;
    private javax.swing.JLabel lblEnfermAltu;
    private javax.swing.JLabel lblEspirometria;
    private javax.swing.JLabel lblEvMuscEsqueletico;
    private javax.swing.JLabel lblEvalOftalmologica;
    private javax.swing.JLabel lblExRxSanguineos;
    private javax.swing.JLabel lblFichaAPatologicos;
    private javax.swing.JLabel lblFichaAudiologica;
    private javax.swing.JLabel lblFichaMedicaAgro;
    private javax.swing.JLabel lblFichaOIT;
    private javax.swing.JLabel lblHistorialOcupacional;
    private javax.swing.JLabel lblInformeAudiom;
    private javax.swing.JLabel lblLabClinico;
    private javax.swing.JLabel lblLabClinicoo;
    private javax.swing.JLabel lblMusculoEsqueletico;
    private javax.swing.JLabel lblOdontograma;
    private javax.swing.JLabel lblOftalmologia;
    private javax.swing.JLabel lblOftalmologia2;
    private javax.swing.JLabel lblPerfilBio;
    private javax.swing.JLabel lblPerimetroToraxico;
    private javax.swing.JLabel lblPsicologia;
    private javax.swing.JLabel lblRadiografiaTorax;
    private javax.swing.JLabel lblSAS;
    private javax.swing.JLabel lblSAS2;
    private javax.swing.JLabel lblTestFatSomnolencia;
    private javax.swing.JLabel lblTriaje;
    private javax.swing.JLabel lblUsoRespirador;
    private javax.swing.JTextField txtAcctitudMedOcupa;
    private javax.swing.JTextField txtAnexo7C;
    private javax.swing.JTextField txtAntPatologicos;
    private javax.swing.JTextField txtAptitudAltPS;
    private javax.swing.JTextField txtAudiometria;
    private javax.swing.JTextField txtAudiometria2021;
    private javax.swing.JTextField txtCerTrabajo1;
    private javax.swing.JTextField txtCertCondVehBarrick;
    private javax.swing.JTextField txtCertLicInterna;
    private javax.swing.JTextField txtCertManipuladores;
    private javax.swing.JTextField txtCertTrabAltBarrick;
    private javax.swing.JTextField txtCertTrabajosCaliente;
    private javax.swing.JTextField txtCertiAptiOH;
    private javax.swing.JTextField txtConsentimientoDosaje;
    private javax.swing.JTextField txtConsultaExt;
    private javax.swing.JTextField txtCuestAudiometria;
    private javax.swing.JTextField txtCuestCalidadSueño;
    private javax.swing.JTextField txtCuestionarioNordico;
    private javax.swing.JTextField txtDetencionSAS;
    private javax.swing.JTextField txtElectroCarOH;
    private javax.swing.JTextField txtElectrocardiograma;
    private javax.swing.JTextField txtEnfermAltu;
    private javax.swing.JTextField txtEspirometria;
    private javax.swing.JTextField txtEvMuscEsqueletico;
    private javax.swing.JTextField txtEvalOftalmologica;
    private javax.swing.JTextField txtExRxSanguineos;
    private javax.swing.JTextField txtExamen;
    private javax.swing.JTextField txtFichaAudiologica;
    private javax.swing.JTextField txtFichaMedicaAgro;
    private javax.swing.JTextField txtFichaOIT;
    private javax.swing.JTextField txtHistoriaOcupacional;
    private javax.swing.JTextField txtLabClinico;
    private javax.swing.JTextField txtMusculoEsqueletico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtOdontograma;
    private javax.swing.JTextField txtOftalmologia;
    private javax.swing.JTextField txtOftalmologia2;
    private javax.swing.JTextField txtPerfilBio;
    private javax.swing.JTextField txtPsicologia;
    private javax.swing.JTextField txtRadiografiaTorax;
    private javax.swing.JTextField txtTestFatSomnolencia;
    private javax.swing.JTextField txtTriaje;
    private javax.swing.JTextField txtUsoRespirador;
    private javax.swing.JTextField txtanexo16a;
    // End of variables declaration//GEN-END:variables
}
