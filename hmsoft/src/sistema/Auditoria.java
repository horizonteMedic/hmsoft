/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
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
    Odontograma odon;
    InformePsicologico infP;
    B_OIT boit;
    ExamenRadiograficoSanguineo exRadSan;
    AntecedentesPatologicos antP;
    EmpresasLugaresGeograficos empLugGeo;
    CuestionarioNordico cuestNord;
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
      
        vSql(txtTriaje,lblTriaje, "triaje", Nro,btnTriaje);
        vSql(txtLabClinico,lblLabClinico, "lab_clinico", Nro,btnLaboratorio);
        vSql(txtElectrocardiograma,lblElectrocardiograma, "informe_electrocardiograma", Nro, btnElectro);
        vSql(txtRadiografiaTorax,lblRadiografiaTorax, "radiografia_torax", Nro,btnRadiografia);
        vSql(txtExRxSanguineos,lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro,btnExRxSanguineos);
        //modificacion
        vSql(txtFichaAudiologica,lblFichaAudiologica, "ficha_audiologica", Nro,btnAudiologia);  
        vSql(txtAudiometria,lblAudiometria, "audiometria_po", Nro,btnAudiometria); 
        vSql(txtCuestAudiometria,lblCuestAudiometria, "cuestionario_audiometria", Nro,btnCuestAudiometria); 
        vSql(txtInformeAudiom,lblInformeAudiom, "informe_audiometria", Nro,btnInformeAudiom); 
        
        vSql(txtExRxSanguineos,lblExRxSanguineos, "ex_radiograficos_sanguineos", Nro,btnExRxSanguineos);
        vSql(txtEspirometria,lblEspirometria, "funcion_abs", Nro,btnEspirometria);
       vSql(txtOdontograma,lblOdontograma, "odontograma", Nro,btnOdontograma);
        vSql(txtPsicologia,lblPsicologia, "informe_psicologico", Nro,btnPsicologia);
        vSql(txtAnexo7D,lblAnexo7D, "anexo16a", Nro,btnAnexo7D);
        vSql(txtHistoriaOcupacional,lblHistorialOcupacional, "historia_oc_info", Nro,btnHistoriaOcupacional);        
        vSql(txtAntPatologicos,lblFichaAPatologicos, "antecedentes_patologicos", Nro,btnFichaAP);
        vSql(txtCuestionarioNordico,lblCuestionarioNordico, "cuestionario_nordico", Nro,btnCuestionario);
        vSql(txtCerTrabajo,lblCertificacionAltura, "certificacion_medica_altura", Nro,btnCertiAltura);
        vSql(txtDetencionSAS,lblSAS, "ficha_sas", Nro,btnSas);
        vSql(txtConsentimientoDosaje,lblConsentimientoDosaje, "consentimiento_dosaje", Nro,btnDosaje);
        vSql(txtPerimetroToraxico,lblPerimetroToraxico, "perimetro_toracico", Nro,btnPerimetroToraxico);
        vSql(txtOftalmologia,lblOftalmologia, "oftalmologia", Nro,btnOftalmologia); 
        vSql(txtAnexo7C,lblAnexo7C, "anexo7c", Nro,btnAnexo7C);
        //modificacion
        vSql(txtCertTrabAltBarrick,lblCertTrabAltBarrick, "b_certificado_altura", Nro,btnCertTrabAltBarrick);
        vSql(txtCertCondVehBarrick,lblCertCondVehBarrick, "b_certificado_conduccion", Nro,btnCertCondVehBarrick);
        vSql(txtUsoRespirador,lblUsoRespirador, "b_uso_respiradores", Nro,btnUsoRespirador);
        vSql(txtAcctitudMedOcupa,lblAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", Nro,btnAcctitudMedOcupa);
        vSql(txtFichaOIT,lblFichaOIT,"oit",Nro,btnFichaOIT);
        vSql(txtMusculoEsqueletico,lblMusculoEsqueletico,"evaluacion_musculo_esqueletica",Nro,btnMusculoEsqueletico);
        vSql(txtFichaMedicaSR,lblFichaMedicaSR,"anexo7c2",Nro,btnFichaMedicaSR);
        vSql(txtFAptitudSR,lblFAptitudSR,"certificado_aptitud_medico_ocupacional1",Nro,btnFAptitudSR);
        vSql(txtFichaMedicaAgro,lblFichaMedicaAgro,"anexo_agroindustrial",Nro,btnFichaMedicaAgro);
        vSql(txtFAptitudAgro,lblFAptitudAgro,"aptitud_medico_ocupacional_agro",Nro,btnFAptitudAgro);
        vSql(txtFichaAnexo02,lblFichaAnexo02,"anexo_02",Nro,btnFichaAnexo02);
        vSql(txtFAptitudAnexo02,lblFAptitudAnexo02,"certificado_aptitud_anexo02",Nro,btnFAptitudAnexo02);
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
        vSql(txtAudiometria2021,lblAudiometria2021,"audiometria_2021",Nro,btnAudiometria2021); 
        vSql(txtEvMuscEsqueletico,lblEvMuscEsqueletico,"evaluacion_musculo_esqueletica2021",Nro,btnEvMuscEsqueletico); 
        vSql(txtCuestCalidadSueño,lblCuestCalidadSueño,"cuestionario_calidad_sueno",Nro,btnCuestCalidadSueño);
        vSql(txtTestFatSomnolencia,lblTestFatSomnolencia,"test_fatiga_somnolencia",Nro,btnTestFatSomnolencia);
        vSql(txtEvalOftalmologica,lblEvalOftalmologica,"oftalmologia2021",Nro,btnEvalOftalmologica);
        vSql(txtCertManipuladores,lblCertManipuladores,"certificado_manipuladores_barrick",Nro,btnCertManipuladores);
                
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
        sStmt+= " Where n_orden='"+sOpcion+"'";    }    
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
    txtLabClinico.setText(null);
    txtElectrocardiograma.setText(null);
    txtRadiografiaTorax.setText(null);
    txtFichaAudiologica.setText(null);
    txtAudiometria.setText(null);
    txtEspirometria.setText(null);
    txtOdontograma.setText(null);
    txtPsicologia.setText(null);
    txtAnexo7D.setText(null);
    txtHistoriaOcupacional.setText(null);
    txtAntPatologicos.setText(null);
    txtCuestionarioNordico.setText(null);
    txtCerTrabajo.setText(null);
    txtDetencionSAS.setText(null);
    txtConsentimientoDosaje.setText(null);
    lblSAS.setText(null);
    txtExRxSanguineos.setText(null);
    txtPerimetroToraxico.setText(null);
    txtOftalmologia.setText(null);
    txtAnexo7C.setText(null);
    //modificacion
    txtCertTrabAltBarrick.setText(null);
    txtCertCondVehBarrick.setText(null);
    txtUsoRespirador.setText(null);
    txtAcctitudMedOcupa.setText(null);
    txtFichaOIT.setText(null);
    txtCuestAudiometria.setText(null);
    txtInformeAudiom.setText(null);
    txtMusculoEsqueletico.setText(null);
    txtFichaMedicaSR.setText(null);
    txtFAptitudSR.setText(null);
    txtFichaMedicaAgro.setText(null);
    txtFAptitudAgro.setText(null);
    txtFichaAnexo02.setText(null);
    txtFAptitudAnexo02.setText(null);
    txtAudiometria2021.setText(null);
    txtEvMuscEsqueletico.setText(null);
    txtCuestCalidadSueño.setText(null);
    txtTestFatSomnolencia.setText(null);
    txtEvalOftalmologica.setText(null);
    txtCertManipuladores.setText(null);
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
    lblSAS.setIcon(oNo);
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
    lblFichaMedicaSR.setIcon(oNo);
//    lblFichaMedica.setIcon(oNo);
  //  lblFResultadoPP.setIcon(oNo);
    //lblConstanciaSalud.setIcon(oNo);
   // lblConstanciaAlta.setIcon(oNo);
   // lblConsentimientoI.setIcon(oNo);
   // lblCertificadoM.setIcon(oNo);

    lblFAptitudSR.setIcon(oNo);
    lblFichaMedicaAgro.setIcon(oNo);
    lblFAptitudAgro.setIcon(oNo);
    lblFichaAnexo02.setIcon(oNo);
    lblFAptitudAnexo02.setIcon(oNo);
    lblAudiometria2021.setIcon(oNo);
    lblEvMuscEsqueletico.setIcon(oNo);
    lblCuestCalidadSueño.setIcon(oNo);
    lblTestFatSomnolencia.setIcon(oNo);
    lblEvalOftalmologica.setIcon(oNo);
    lblCertManipuladores.setIcon(oNo);
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
    btnPerimetroToraxico.setEnabled(false);
    btnExRxSanguineos.setEnabled(false);
    btnOftalmologia.setEnabled(false);
    //modificacion
    btnCertTrabAltBarrick.setEnabled(false);
    btnCertCondVehBarrick.setEnabled(false);
    btnUsoRespirador.setEnabled(false);
    btnAcctitudMedOcupa.setEnabled(false);
    btnFichaOIT.setEnabled(false);
    btnCuestAudiometria.setEnabled(false);
    btnInformeAudiom.setEnabled(false);
    btnMusculoEsqueletico.setEnabled(false);
    btnFichaMedicaSR.setEnabled(false);
    btnFAptitudSR.setEnabled(false);
    btnFichaMedicaAgro.setEnabled(false);
    btnFAptitudAgro.setEnabled(false);
    btnFichaAnexo02.setEnabled(false);
    btnFAptitudAnexo02.setEnabled(false);
    btnAudiometria2021.setEnabled(false);
    btnEvMuscEsqueletico.setEnabled(false);
    btnCuestCalidadSueño.setEnabled(false);
    btnTestFatSomnolencia.setEnabled(false);
    btnEvalOftalmologica.setEnabled(false);
    btnCertManipuladores.setEnabled(false);
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
        jLabel141 = new javax.swing.JLabel();
        txtAnexo7D = new javax.swing.JTextField();
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
        txtLabClinico = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtElectrocardiograma = new javax.swing.JTextField();
        lblConsentimientoDosaje = new javax.swing.JLabel();
        lblCuestionarioNordico = new javax.swing.JLabel();
        lblFichaAPatologicos = new javax.swing.JLabel();
        lblRadiografiaTorax = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
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
        btnAnexo7D = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        txtFichaMedicaSR = new javax.swing.JTextField();
        lblFichaMedicaSR = new javax.swing.JLabel();
        btnFichaMedicaSR = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        txtFAptitudSR = new javax.swing.JTextField();
        lblFAptitudSR = new javax.swing.JLabel();
        btnFAptitudSR = new javax.swing.JButton();
        jLabel164 = new javax.swing.JLabel();
        txtFichaMedicaAgro = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        txtFAptitudAgro = new javax.swing.JTextField();
        btnFAptitudAgro = new javax.swing.JButton();
        btnFichaMedicaAgro = new javax.swing.JButton();
        lblFAptitudAgro = new javax.swing.JLabel();
        lblFichaMedicaAgro = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        btnFAptitudAnexo02 = new javax.swing.JButton();
        btnFichaAnexo02 = new javax.swing.JButton();
        txtFichaAnexo02 = new javax.swing.JTextField();
        txtFAptitudAnexo02 = new javax.swing.JTextField();
        lblFAptitudAnexo02 = new javax.swing.JLabel();
        lblFichaAnexo02 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCuestAudiometria = new javax.swing.JLabel();
        txtCuestAudiometria = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        btnCuestAudiometria = new javax.swing.JButton();
        jLabel142 = new javax.swing.JLabel();
        txtInformeAudiom = new javax.swing.JTextField();
        lblInformeAudiom = new javax.swing.JLabel();
        btnInformeAudiom = new javax.swing.JButton();
        jLabel152 = new javax.swing.JLabel();
        txtPerimetroToraxico = new javax.swing.JTextField();
        lblPerimetroToraxico = new javax.swing.JLabel();
        btnPerimetroToraxico = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        txtAudiometria2021 = new javax.swing.JTextField();
        btnAudiometria2021 = new javax.swing.JButton();
        lblAudiometria2021 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        txtEvMuscEsqueletico = new javax.swing.JTextField();
        lblEvMuscEsqueletico = new javax.swing.JLabel();
        btnEvMuscEsqueletico = new javax.swing.JButton();
        jLabel149 = new javax.swing.JLabel();
        txtCuestCalidadSueño = new javax.swing.JTextField();
        lblCuestCalidadSueño = new javax.swing.JLabel();
        btnCuestCalidadSueño = new javax.swing.JButton();
        lblTestFatSomnolencia = new javax.swing.JLabel();
        btnTestFatSomnolencia = new javax.swing.JButton();
        txtTestFatSomnolencia = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        txtEvalOftalmologica = new javax.swing.JTextField();
        lblEvalOftalmologica = new javax.swing.JLabel();
        btnEvalOftalmologica = new javax.swing.JButton();
        btnCertManipuladores = new javax.swing.JButton();
        lblCertManipuladores = new javax.swing.JLabel();
        txtCertManipuladores = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        txtCertTrabAltBarrick = new javax.swing.JTextField();
        lblCertTrabAltBarrick = new javax.swing.JLabel();
        btnCertTrabAltBarrick = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        txtCerTrabajo = new javax.swing.JTextField();
        lblCertificacionAltura = new javax.swing.JLabel();
        btnCertiAltura = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        txtDetencionSAS = new javax.swing.JTextField();
        lblSAS = new javax.swing.JLabel();
        btnSas = new javax.swing.JButton();
        jLabel157 = new javax.swing.JLabel();
        txtCertCondVehBarrick = new javax.swing.JTextField();
        lblCertCondVehBarrick = new javax.swing.JLabel();
        btnCertCondVehBarrick = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtHistoriaOcupacional.setEditable(false);
        txtHistoriaOcupacional.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHistoriaOcupacional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtHistoriaOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 107, -1));

        txtCuestionarioNordico.setEditable(false);
        txtCuestionarioNordico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestionarioNordico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtCuestionarioNordico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 107, -1));

        txtOdontograma.setEditable(false);
        txtOdontograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOdontograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtOdontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 107, -1));

        jLabel141.setText("Anexo 16-A:");
        getContentPane().add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        txtAnexo7D.setEditable(false);
        txtAnexo7D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAnexo7D.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAnexo7D, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 107, -1));

        jLabel138.setText("Psicologia :");
        getContentPane().add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        txtPsicologia.setEditable(false);
        txtPsicologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPsicologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 107, -1));

        lblTriaje.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 51, -1, -1));

        lblFichaAudiologica.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblFichaAudiologica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        lblElectrocardiograma.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblElectrocardiograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 924, -1, -1));

        lblLabClinico.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblLabClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 77, -1, -1));

        lblOdontograma.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblOdontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        lblEspirometria.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblEspirometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        lblAnexo7D.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAnexo7D, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 860, -1, -1));

        lblPsicologia.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        lblHistorialOcupacional.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblHistorialOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel132.setText("Ficha Audiologica :");
        getContentPane().add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtRadiografiaTorax.setEditable(false);
        txtRadiografiaTorax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRadiografiaTorax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtRadiografiaTorax, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 99, 107, -1));

        jLabel134.setText("Espirometria :");
        getContentPane().add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txtFichaAudiologica.setEditable(false);
        txtFichaAudiologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaAudiologica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFichaAudiologica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 107, -1));

        jLabel137.setText("Odontograma :");
        getContentPane().add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtEspirometria.setEditable(false);
        txtEspirometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEspirometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEspirometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 107, -1));

        jLabel128.setText("Electrocardiograma :");
        getContentPane().add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        txtLabClinico.setEditable(false);
        txtLabClinico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLabClinico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtLabClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 73, 107, -1));

        jLabel130.setText("Rx. Torax P.A:");
        getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 101, -1, -1));

        txtElectrocardiograma.setEditable(false);
        txtElectrocardiograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtElectrocardiograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtElectrocardiograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 107, -1));

        lblConsentimientoDosaje.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblConsentimientoDosaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 877, -1, -1));

        lblCuestionarioNordico.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblCuestionarioNordico, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        lblFichaAPatologicos.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblFichaAPatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        lblRadiografiaTorax.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblRadiografiaTorax, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 103, -1, -1));

        jLabel126.setText("Lab. Clinico :");
        getContentPane().add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 75, -1, -1));

        txtTriaje.setEditable(false);
        txtTriaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTriaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 47, 107, -1));

        jLabel124.setText("Triaje :");
        getContentPane().add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 49, -1, -1));

        jLabel150.setText("Consentimiento Dosaje :");
        getContentPane().add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel151.setText("Ficha Ant. Patológicos :");
        getContentPane().add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtConsentimientoDosaje.setEditable(false);
        txtConsentimientoDosaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsentimientoDosaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtConsentimientoDosaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 107, -1));

        jLabel145.setText("Cuestionario Nórdico :");
        getContentPane().add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        txtAntPatologicos.setEditable(false);
        txtAntPatologicos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAntPatologicos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAntPatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 107, -1));

        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 47, 20, -1));

        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 74, 20, -1));

        btnElectro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnElectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectroActionPerformed(evt);
            }
        });
        getContentPane().add(btnElectro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 20, -1));

        btnRadiografia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnRadiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiografiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadiografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 20, -1));

        btnAudiologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAudiologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAudiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 20, -1));

        btnEspirometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEspirometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspirometriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEspirometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 20, -1));

        btnOdontograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnOdontograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdontogramaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOdontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 20, 16));

        btnPsicologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnPsicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsicologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPsicologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 20, -1));

        btnAnexo7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAnexo7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7DActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnexo7D, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 20, -1));

        btnHistoriaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnHistoriaOcupacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaOcupacionalActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoriaOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 20, -1));

        btnFichaAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaAPActionPerformed(evt);
            }
        });
        getContentPane().add(btnFichaAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 20, -1));

        btnCuestionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuestionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 20, -1));

        btnDosaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnDosaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDosaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 20, -1));

        jLabel139.setText("Ex. Rx Sanguineos :");
        getContentPane().add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblExRxSanguineos.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblExRxSanguineos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        txtExRxSanguineos.setEditable(false);
        txtExRxSanguineos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtExRxSanguineos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtExRxSanguineos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 107, -1));

        btnExRxSanguineos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnExRxSanguineos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExRxSanguineosActionPerformed(evt);
            }
        });
        getContentPane().add(btnExRxSanguineos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 20, -1));

        jLabel153.setText("Oftalmología :");
        getContentPane().add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        txtOftalmologia.setEditable(false);
        txtOftalmologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOftalmologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 107, -1));

        lblOftalmologia.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOftalmologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 20, -1));

        txtAnexo7C.setEditable(false);
        txtAnexo7C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAnexo7C.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAnexo7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 107, -1));

        jLabel154.setText("Anexo 16 :");
        getContentPane().add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        lblAnexo7C.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAnexo7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 894, -1, -1));

        btnAnexo7C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAnexo7C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7CActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnexo7C, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 20, -1));

        txtAudiometria.setEditable(false);
        txtAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAudiometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 107, -1));

        jLabel133.setText("Audiometria:");
        getContentPane().add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        btnAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiometriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 20, -1));

        lblAudiometria.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAudiometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel158.setText("Uso de Respiradores:");
        getContentPane().add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        txtUsoRespirador.setEditable(false);
        txtUsoRespirador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUsoRespirador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtUsoRespirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 107, -1));

        lblUsoRespirador.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblUsoRespirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 496, -1, -1));

        btnUsoRespirador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnUsoRespirador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsoRespiradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsoRespirador, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 20, -1));

        jLabel159.setText("Actitud Med.Ocupacional:");
        getContentPane().add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        txtAcctitudMedOcupa.setEditable(false);
        txtAcctitudMedOcupa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAcctitudMedOcupa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtAcctitudMedOcupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 107, -1));

        lblAcctitudMedOcupa.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblAcctitudMedOcupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        btnAcctitudMedOcupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAcctitudMedOcupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcctitudMedOcupaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcctitudMedOcupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 20, -1));

        jLabel160.setText("Ficha OIT:");
        getContentPane().add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        txtFichaOIT.setEditable(false);
        txtFichaOIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaOIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFichaOIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 107, -1));

        lblFichaOIT.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblFichaOIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        btnFichaOIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaOIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaOITActionPerformed(evt);
            }
        });
        getContentPane().add(btnFichaOIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 20, -1));

        btnActulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActulizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel161.setText("Ev.MuscoloEsqueletica :");
        getContentPane().add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        lblMusculoEsqueletico.setPreferredSize(new java.awt.Dimension(13, 11));
        getContentPane().add(lblMusculoEsqueletico, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        txtMusculoEsqueletico.setEditable(false);
        txtMusculoEsqueletico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMusculoEsqueletico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtMusculoEsqueletico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 107, -1));

        btnMusculoEsqueletico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnMusculoEsqueletico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusculoEsqueleticoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMusculoEsqueletico, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 20, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fichas Sin Restricción"));

        jLabel162.setText("F.Medica ");

        txtFichaMedicaSR.setEditable(false);
        txtFichaMedicaSR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaMedicaSR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFichaMedicaSR.setPreferredSize(new java.awt.Dimension(13, 11));

        btnFichaMedicaSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaMedicaSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaSRActionPerformed(evt);
            }
        });

        jLabel163.setText("F.Aptitud Med.Ocup");

        txtFAptitudSR.setEditable(false);
        txtFAptitudSR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFAptitudSR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFAptitudSR.setPreferredSize(new java.awt.Dimension(13, 11));

        btnFAptitudSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFAptitudSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAptitudSRActionPerformed(evt);
            }
        });

        jLabel164.setText("F.Medica Anexo2");

        txtFichaMedicaAgro.setEditable(false);
        txtFichaMedicaAgro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaMedicaAgro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel165.setText("F.Aptitud Anexo2");

        txtFAptitudAgro.setEditable(false);
        txtFAptitudAgro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFAptitudAgro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnFAptitudAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFAptitudAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAptitudAgroActionPerformed(evt);
            }
        });

        btnFichaMedicaAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaMedicaAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaAgroActionPerformed(evt);
            }
        });

        lblFAptitudAgro.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaMedicaAgro.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel166.setText("F.Med Agro");

        btnFAptitudAnexo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFAptitudAnexo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAptitudAnexo02ActionPerformed(evt);
            }
        });

        btnFichaAnexo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnFichaAnexo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaAnexo02ActionPerformed(evt);
            }
        });

        txtFichaAnexo02.setEditable(false);
        txtFichaAnexo02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaAnexo02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFAptitudAnexo02.setEditable(false);
        txtFAptitudAnexo02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFAptitudAnexo02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFAptitudAnexo02.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAnexo02.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel167.setText("F.Aptitud Agro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFichaMedicaSR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFichaMedicaSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFichaMedicaSR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel163)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFAptitudSR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFAptitudSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFAptitudSR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFAptitudAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFAptitudAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFAptitudAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFichaMedicaAgro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFichaMedicaAgro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFichaMedicaAgro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel165)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFAptitudAgro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFAptitudAgro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFAptitudAgro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel166)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFichaAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFichaAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFichaAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel162)
                    .addComponent(txtFichaMedicaSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFichaMedicaSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFichaMedicaSR))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel163)
                    .addComponent(txtFAptitudSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFAptitudSR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFAptitudSR))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel164)
                    .addComponent(txtFichaMedicaAgro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFichaMedicaAgro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFichaMedicaAgro))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel165)
                    .addComponent(txtFAptitudAgro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFAptitudAgro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFAptitudAgro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel166)
                    .addComponent(txtFichaAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFichaAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFichaAnexo02))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel167)
                    .addComponent(txtFAptitudAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFAptitudAnexo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFAptitudAnexo02))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 26, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros Formatos"));
        jPanel4.setForeground(new java.awt.Color(0, 255, 204));
        jPanel4.setName("FD"); // NOI18N

        lblCuestAudiometria.setPreferredSize(new java.awt.Dimension(13, 11));

        txtCuestAudiometria.setEditable(false);
        txtCuestAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestAudiometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel140.setText("Cuest. Audiometria:");

        btnCuestAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCuestAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestAudiometriaActionPerformed(evt);
            }
        });

        jLabel142.setText("Informe Audiometria:");

        txtInformeAudiom.setEditable(false);
        txtInformeAudiom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtInformeAudiom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblInformeAudiom.setPreferredSize(new java.awt.Dimension(13, 11));

        btnInformeAudiom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnInformeAudiom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeAudiomActionPerformed(evt);
            }
        });

        jLabel152.setText("Perimetro Toraxico :");

        txtPerimetroToraxico.setEditable(false);
        txtPerimetroToraxico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPerimetroToraxico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPerimetroToraxico.setPreferredSize(new java.awt.Dimension(13, 11));

        btnPerimetroToraxico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnPerimetroToraxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroToraxicoActionPerformed(evt);
            }
        });

        jLabel147.setText("Audiometria Boroo: ");

        txtAudiometria2021.setEditable(false);
        txtAudiometria2021.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAudiometria2021.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAudiometria2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnAudiometria2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiometria2021ActionPerformed(evt);
            }
        });

        lblAudiometria2021.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel148.setText("Ev.Musc.Esqueletico:");

        txtEvMuscEsqueletico.setEditable(false);
        txtEvMuscEsqueletico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEvMuscEsqueletico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEvMuscEsqueletico.setPreferredSize(new java.awt.Dimension(13, 11));

        btnEvMuscEsqueletico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEvMuscEsqueletico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvMuscEsqueleticoActionPerformed(evt);
            }
        });

        jLabel149.setText("Cuest.CalidadSueño:");

        txtCuestCalidadSueño.setEditable(false);
        txtCuestCalidadSueño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestCalidadSueño.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCuestCalidadSueño.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCuestCalidadSueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCuestCalidadSueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestCalidadSueñoActionPerformed(evt);
            }
        });

        lblTestFatSomnolencia.setPreferredSize(new java.awt.Dimension(13, 11));

        btnTestFatSomnolencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnTestFatSomnolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestFatSomnolenciaActionPerformed(evt);
            }
        });

        txtTestFatSomnolencia.setEditable(false);
        txtTestFatSomnolencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTestFatSomnolencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel186.setText("TestFatSomnolencia:");

        jLabel187.setText("Eval. Oftalmologica:");

        txtEvalOftalmologica.setEditable(false);
        txtEvalOftalmologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEvalOftalmologica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEvalOftalmologica.setPreferredSize(new java.awt.Dimension(13, 11));

        btnEvalOftalmologica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnEvalOftalmologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvalOftalmologicaActionPerformed(evt);
            }
        });

        btnCertManipuladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertManipuladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertManipuladoresActionPerformed(evt);
            }
        });

        lblCertManipuladores.setPreferredSize(new java.awt.Dimension(13, 11));

        txtCertManipuladores.setEditable(false);
        txtCertManipuladores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertManipuladores.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel188.setText("Cert. Manipuladores:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel188)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel187)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel147)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel148)
                                .addGap(4, 4, 4)
                                .addComponent(txtEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel149)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel186)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel152)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel140)
                                .addGap(4, 4, 4)
                                .addComponent(txtCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel142)
                                .addGap(2, 2, 2)
                                .addComponent(txtInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lblInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel148)
                        .addComponent(txtEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEvMuscEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEvMuscEsqueletico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel149)
                        .addComponent(txtCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCuestCalidadSueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuestCalidadSueño))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel186)
                        .addComponent(txtTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTestFatSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTestFatSomnolencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel147)
                        .addComponent(txtAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAudiometria2021))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel187)
                        .addComponent(txtEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEvalOftalmologica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel188)
                        .addComponent(txtCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertManipuladores))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel140)
                        .addComponent(txtCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuestAudiometria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel142)
                        .addComponent(txtInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformeAudiom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel152)
                    .addComponent(txtPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerimetroToraxico))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 147, 288, 260));
        jPanel4.getAccessibleContext().setAccessibleName("pROBAR");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajos en Altura"));

        jLabel155.setText("Cert.Trab.Altura(Barrik):");

        txtCertTrabAltBarrick.setEditable(false);
        txtCertTrabAltBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertTrabAltBarrick.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCertTrabAltBarrick.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCertTrabAltBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertTrabAltBarrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertTrabAltBarrickActionPerformed(evt);
            }
        });

        jLabel144.setText("Cert. Trabajo Altura :");

        txtCerTrabajo.setEditable(false);
        txtCerTrabajo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCerTrabajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCertificacionAltura.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCertiAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertiAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertiAlturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCertiAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel155)
                    .addComponent(txtCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertTrabAltBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertTrabAltBarrick))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel144)
                            .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCertiAltura))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 30, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Conducción de Vehiculos"));

        jLabel146.setText("Ficha S.A.S :");

        txtDetencionSAS.setEditable(false);
        txtDetencionSAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDetencionSAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSAS.setPreferredSize(new java.awt.Dimension(13, 11));

        btnSas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnSas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSasActionPerformed(evt);
            }
        });

        jLabel157.setText("Cert.Conducc.Vehiculos(Barrik):");

        txtCertCondVehBarrick.setEditable(false);
        txtCertCondVehBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertCondVehBarrick.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCertCondVehBarrick.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCertCondVehBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo_1.jpg"))); // NOI18N
        btnCertCondVehBarrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertCondVehBarrickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel146)
                    .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel157)
                    .addComponent(txtCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertCondVehBarrick))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, -1));

        jLabel125.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel125.setText("EXAMEN OCUPACIONAL");
        getContentPane().add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 26, -1, -1));

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
        if(oPu.eDatos(txtElectrocardiograma, "informe_electrocardiograma", "Electrocardiograma", txtNorden)){verifica(txtNorden.getText().toString());}
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
        
    }//GEN-LAST:event_btnAudiologiaActionPerformed
    private void btnEspirometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspirometriaActionPerformed
         if(oPu.eDatos(txtEspirometria, "funcion_abs", "Espirometria", txtNorden)){verifica(txtNorden.getText().toString());}
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
    private void btnAnexo7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7DActionPerformed
        if(oPu.eDatos(txtAnexo7D, "anexo16a", "Anexo 7D", txtNorden)){verifica(txtNorden.getText().toString());}        
    }//GEN-LAST:event_btnAnexo7DActionPerformed
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
    private void btnCertiAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertiAlturaActionPerformed
        if(oPu.eDatos(txtCerTrabajo, "certificacion_medica_altura","Certificación Medica previo trabajo en altura", txtNorden)){verifica(txtNorden.getText().toString());} 
    }//GEN-LAST:event_btnCertiAlturaActionPerformed
    private void btnSasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSasActionPerformed
        if(oPu.eDatos(txtDetencionSAS, "ficha_sas", "Ficha SAS", txtNorden)){verifica(txtNorden.getText().toString());} 
    }//GEN-LAST:event_btnSasActionPerformed
    private void btnDosajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosajeActionPerformed
        if(oPu.eDatos(txtConsentimientoDosaje, "consentimiento_dosaje", "Consentimiento para dosaje Marihuana y cocaina", txtNorden)){verifica(txtNorden.getText().toString());} 
    }//GEN-LAST:event_btnDosajeActionPerformed
    private void btnPerimetroToraxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroToraxicoActionPerformed
        if(oPu.eDatos(txtPerimetroToraxico, "perimetro_toracico", "Perimetro Toracico", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnPerimetroToraxicoActionPerformed

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
       if(oPu.eDatos(txtOftalmologia, "oftalmologia", "oftalmología", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnOftalmologiaActionPerformed

    private void btnAnexo7CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7CActionPerformed
       if(oPu.eDatos(txtExRxSanguineos, "ex_radiograficos_sanguineos", "Examenes Radiograficos Sanguineos", txtNorden)){
            if(oPu.eDatos(txtAnexo7C, "anexo7c", "Anexo 7C", txtNorden)){verifica(txtNorden.getText().toString());}
       } 
        
    }//GEN-LAST:event_btnAnexo7CActionPerformed

    private void btnAudiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiometriaActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtAudiometria, "audiometria_po", "Examen Audiometrico", txtNorden)){verifica(txtNorden.getText().toString());}// verifica2();}
    }//GEN-LAST:event_btnAudiometriaActionPerformed

    private void btnCertTrabAltBarrickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertTrabAltBarrickActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtCertTrabAltBarrick, "b_certificado_altura", "Certificado trabajo en Altura", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnCertTrabAltBarrickActionPerformed

    private void btnOftalmologia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOftalmologia2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOftalmologia2ActionPerformed

    private void btnCertCondVehBarrickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertCondVehBarrickActionPerformed
        // TODO add your handling code here:
         if(oPu.eDatos(txtCertCondVehBarrick, "b_certificado_conduccion", "Certificado de conduccion de vehiculos", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnCertCondVehBarrickActionPerformed

    private void btnUsoRespiradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsoRespiradorActionPerformed
        // TODO add your handling code here:
         if(oPu.eDatos(txtUsoRespirador, "b_uso_respiradores", "Uso de Respiradores", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnUsoRespiradorActionPerformed

    private void btnAcctitudMedOcupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcctitudMedOcupaActionPerformed
        // TODO add your handling code here:
         if(oPu.eDatos(txtAcctitudMedOcupa, "certificado_aptitud_medico_ocupacional", "Aptitud Medico Ocupacional", txtNorden)){verifica(txtNorden.getText().toString());}
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
        if(oPu.eDatos(txtCuestAudiometria, "cuestionario_audiometria", "Cuestionario Audiometria", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnCuestAudiometriaActionPerformed

    private void btnInformeAudiomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeAudiomActionPerformed
        if(oPu.eDatos(txtInformeAudiom, "informe_audiometria", "Informe Audiometria", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnInformeAudiomActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
        verifica(txtNorden.getText().toString());
    }//GEN-LAST:event_btnActulizarActionPerformed

    private void btnMusculoEsqueleticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusculoEsqueleticoActionPerformed
        if(oPu.eDatos(txtMusculoEsqueletico, "evaluacion_musculo_esqueletica", "Evaluacion Musculo Esqueletico", txtNorden)){verifica(txtNorden.getText().toString());} 
    }//GEN-LAST:event_btnMusculoEsqueleticoActionPerformed

    private void btnFichaMedicaSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicaSRActionPerformed
        if(oPu.eDatos(txtFichaMedicaSR, "anexo7c2", "Ficha Medica Sin Restriccion", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnFichaMedicaSRActionPerformed

    private void btnFAptitudSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAptitudSRActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtFAptitudSR, "certificado_aptitud_medico_ocupacional1", "Ficha Aptitud Sin Restriccion", txtNorden)){verifica(txtNorden.getText().toString());}
        
    }//GEN-LAST:event_btnFAptitudSRActionPerformed

    private void btnFAptitudAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAptitudAgroActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtFAptitudAgro, "aptitud_medico_ocupacional_agro", "Ficha Aptitud Anexo 2", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnFAptitudAgroActionPerformed

    private void btnFichaMedicaAgroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicaAgroActionPerformed
        // TODO add your handling code here:
        if(oPu.eSubRegistros(txtFichaMedicaAgro, "accidentes_trabajo","cod_anexo", oPu.oConsultar("cod_anexo", "anexo_agroindustrial", txtNorden))){
        if(oPu.eDatos(txtFichaMedicaAgro, "anexo_agroindustrial", "Ficha Medica Anexo 2", txtNorden)){verifica(txtNorden.getText().toString());
        }
        } 
         
        
    }//GEN-LAST:event_btnFichaMedicaAgroActionPerformed

    private void btnFAptitudAnexo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAptitudAnexo02ActionPerformed
        if(oPu.eDatos(txtFAptitudAnexo02, "certificado_aptitud_anexo02", "Ficha Aptitud Agro", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnFAptitudAnexo02ActionPerformed

    private void btnFichaAnexo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaAnexo02ActionPerformed
        if(oPu.eDatos(txtFichaAnexo02, "anexo_02", "Ficha Agro", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnFichaAnexo02ActionPerformed

    private void txtExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamenActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
  
       //cerrarVentana();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnAudiometria2021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiometria2021ActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtAudiometria2021, "audiometria_2021", "Audiometria Boroo", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnAudiometria2021ActionPerformed

    private void btnEvMuscEsqueleticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvMuscEsqueleticoActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtEvMuscEsqueletico, "evaluacion_musculo_esqueletica2021", "Evaluacion Muscolo Esqueletica", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnEvMuscEsqueleticoActionPerformed

    private void btnCuestCalidadSueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestCalidadSueñoActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtCuestCalidadSueño, "cuestionario_calidad_sueno", "Cuestionario Calidad de Sueño", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnCuestCalidadSueñoActionPerformed

    private void btnTestFatSomnolenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestFatSomnolenciaActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtTestFatSomnolencia, "test_fatiga_somnolencia", "Test Fatiga y Somnolencia", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnTestFatSomnolenciaActionPerformed

    private void btnEvalOftalmologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvalOftalmologicaActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtEvalOftalmologica, "oftalmologia2021", "Evaluación Oftalmologica", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnEvalOftalmologicaActionPerformed

    private void btnCertManipuladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertManipuladoresActionPerformed
        // TODO add your handling code here:
        if(oPu.eDatos(txtCertManipuladores, "certificado_manipuladores_barrick", "Certificado de Manipuladores", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnCertManipuladoresActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    
  
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcctitudMedOcupa;
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnAnexo7C;
    private javax.swing.JButton btnAnexo7D;
    private javax.swing.JButton btnAudiologia;
    private javax.swing.JButton btnAudiometria;
    private javax.swing.JButton btnAudiometria2021;
    private javax.swing.JButton btnCertCondVehBarrick;
    private javax.swing.JButton btnCertManipuladores;
    private javax.swing.JButton btnCertTrabAltBarrick;
    private javax.swing.JButton btnCertiAltura;
    private javax.swing.JButton btnCuestAudiometria;
    private javax.swing.JButton btnCuestCalidadSueño;
    private javax.swing.JButton btnCuestionario;
    private javax.swing.JButton btnDosaje;
    private javax.swing.JButton btnElectro;
    private javax.swing.JButton btnEspirometria;
    private javax.swing.JButton btnEvMuscEsqueletico;
    private javax.swing.JButton btnEvalOftalmologica;
    private javax.swing.JButton btnExRxSanguineos;
    private javax.swing.JButton btnFAptitudAgro;
    private javax.swing.JButton btnFAptitudAnexo02;
    private javax.swing.JButton btnFAptitudSR;
    private javax.swing.JButton btnFichaAP;
    private javax.swing.JButton btnFichaAnexo02;
    private javax.swing.JButton btnFichaMedicaAgro;
    private javax.swing.JButton btnFichaMedicaSR;
    private javax.swing.JButton btnFichaOIT;
    private javax.swing.JButton btnHistoriaOcupacional;
    private javax.swing.JButton btnInformeAudiom;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMusculoEsqueletico;
    private javax.swing.JButton btnOdontograma;
    private javax.swing.JButton btnOftalmologia;
    private javax.swing.JButton btnOftalmologia2;
    private javax.swing.JButton btnPerimetroToraxico;
    private javax.swing.JButton btnPsicologia;
    private javax.swing.JButton btnRadiografia;
    private javax.swing.JButton btnSas;
    private javax.swing.JButton btnTestFatSomnolencia;
    private javax.swing.JButton btnTriaje;
    private javax.swing.JButton btnUsoRespirador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAcctitudMedOcupa;
    private javax.swing.JLabel lblAnexo7C;
    private javax.swing.JLabel lblAnexo7D;
    private javax.swing.JLabel lblAudiometria;
    private javax.swing.JLabel lblAudiometria2021;
    private javax.swing.JLabel lblCertCondVehBarrick;
    private javax.swing.JLabel lblCertManipuladores;
    private javax.swing.JLabel lblCertTrabAltBarrick;
    private javax.swing.JLabel lblCertificacionAltura;
    private javax.swing.JLabel lblConsentimientoDosaje;
    private javax.swing.JLabel lblCuestAudiometria;
    private javax.swing.JLabel lblCuestCalidadSueño;
    private javax.swing.JLabel lblCuestionarioNordico;
    private javax.swing.JLabel lblElectrocardiograma;
    private javax.swing.JLabel lblEspirometria;
    private javax.swing.JLabel lblEvMuscEsqueletico;
    private javax.swing.JLabel lblEvalOftalmologica;
    private javax.swing.JLabel lblExRxSanguineos;
    private javax.swing.JLabel lblFAptitudAgro;
    private javax.swing.JLabel lblFAptitudAnexo02;
    private javax.swing.JLabel lblFAptitudSR;
    private javax.swing.JLabel lblFichaAPatologicos;
    private javax.swing.JLabel lblFichaAnexo02;
    private javax.swing.JLabel lblFichaAudiologica;
    private javax.swing.JLabel lblFichaMedicaAgro;
    private javax.swing.JLabel lblFichaMedicaSR;
    private javax.swing.JLabel lblFichaOIT;
    private javax.swing.JLabel lblHistorialOcupacional;
    private javax.swing.JLabel lblInformeAudiom;
    private javax.swing.JLabel lblLabClinico;
    private javax.swing.JLabel lblMusculoEsqueletico;
    private javax.swing.JLabel lblOdontograma;
    private javax.swing.JLabel lblOftalmologia;
    private javax.swing.JLabel lblOftalmologia2;
    private javax.swing.JLabel lblPerimetroToraxico;
    private javax.swing.JLabel lblPsicologia;
    private javax.swing.JLabel lblRadiografiaTorax;
    private javax.swing.JLabel lblSAS;
    private javax.swing.JLabel lblTestFatSomnolencia;
    private javax.swing.JLabel lblTriaje;
    private javax.swing.JLabel lblUsoRespirador;
    private javax.swing.JTextField txtAcctitudMedOcupa;
    private javax.swing.JTextField txtAnexo7C;
    private javax.swing.JTextField txtAnexo7D;
    private javax.swing.JTextField txtAntPatologicos;
    private javax.swing.JTextField txtAudiometria;
    private javax.swing.JTextField txtAudiometria2021;
    private javax.swing.JTextField txtCerTrabajo;
    private javax.swing.JTextField txtCertCondVehBarrick;
    private javax.swing.JTextField txtCertManipuladores;
    private javax.swing.JTextField txtCertTrabAltBarrick;
    private javax.swing.JTextField txtConsentimientoDosaje;
    private javax.swing.JTextField txtCuestAudiometria;
    private javax.swing.JTextField txtCuestCalidadSueño;
    private javax.swing.JTextField txtCuestionarioNordico;
    private javax.swing.JTextField txtDetencionSAS;
    private javax.swing.JTextField txtElectrocardiograma;
    private javax.swing.JTextField txtEspirometria;
    private javax.swing.JTextField txtEvMuscEsqueletico;
    private javax.swing.JTextField txtEvalOftalmologica;
    private javax.swing.JTextField txtExRxSanguineos;
    private javax.swing.JTextField txtExamen;
    private javax.swing.JTextField txtFAptitudAgro;
    private javax.swing.JTextField txtFAptitudAnexo02;
    private javax.swing.JTextField txtFAptitudSR;
    private javax.swing.JTextField txtFichaAnexo02;
    private javax.swing.JTextField txtFichaAudiologica;
    private javax.swing.JTextField txtFichaMedicaAgro;
    private javax.swing.JTextField txtFichaMedicaSR;
    private javax.swing.JTextField txtFichaOIT;
    private javax.swing.JTextField txtHistoriaOcupacional;
    private javax.swing.JTextField txtInformeAudiom;
    private javax.swing.JTextField txtLabClinico;
    private javax.swing.JTextField txtMusculoEsqueletico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtOdontograma;
    private javax.swing.JTextField txtOftalmologia;
    private javax.swing.JTextField txtOftalmologia2;
    private javax.swing.JTextField txtPerimetroToraxico;
    private javax.swing.JTextField txtPsicologia;
    private javax.swing.JTextField txtRadiografiaTorax;
    private javax.swing.JTextField txtTestFatSomnolencia;
    private javax.swing.JTextField txtTriaje;
    private javax.swing.JTextField txtUsoRespirador;
    // End of variables declaration//GEN-END:variables
}
