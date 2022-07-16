/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class Eliminar extends javax.swing.JInternalFrame {
      clsFunciones  oFunc = new clsFunciones();
    clsConnection oConn = new clsConnection();
    clsOperacionesUsuarios oPu = new clsOperacionesUsuarios();
            javax.swing.ImageIcon oIconoSi = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/chek.gif"));
        javax.swing.ImageIcon oIconoNo = new javax.swing.ImageIcon(ClassLoader.getSystemResource("imagenes/xx.png"));
        javax.swing.ImageIcon oNo = null;
    public Eliminar() {
        initComponents();
        Limpiar2();
        txtNorden.requestFocus();
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
        //
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
        vSql(txtFichaConstanciaS,lblConstanciaSalud,"constancia_salud_marsa",Nro,btnConstanciaSalud);
        vSql(txtFichaMedica,lblFichaMedica,"fmedica_covid_marsa",Nro,btnFichaMedica);
        vSql(txtFResultadoPP,lblFResultadoPP,"ficha_pruebas_rapidas_covidf100",Nro,btnFResultadoPP);
        vSql(txtConstanciaAlta,lblConstanciaAlta,"constancia_alta_marsa",Nro,btnConstanciaAlta);
        vSql(txtConsentimientoI,lblConsentimientoI,"consentimiento_informado_covid",Nro,btnConsentimientoI);
        vSql(txtCertificadoM,lblCertificadoM,"certificadoMedico",Nro,btnCertificadoM);
        vSql(txtConstancia,lblConstancia,"constancia_tamizaje_covid19",Nro,btnConstancia);       
        vSql(txtConstaTamM,lblConstaTamM,"const_tamizaje_covid19_marza",Nro,btnConstaTamM);       
        vSql(txtRegPP,lblRegPP,"pruebas_rapidas_covid19",Nro,btnRegPP);       
        vSql(txtConstMedica,lblConstMedica,"constancia_medica_covid19",Nro,btnConstMedica);       
        vSql(txtCartaComp,lblCartaComp,"carta_compromiso_aislamiento",Nro,btnCartaComp);       
        vSql(txtResultPP,lblResultPP,"resultados_pruebas_rapidas",Nro,btnResultPP);       
        vSql(txtFichaSinto,lblFichaSinto,"ficha_sintomatologica_covid19",Nro,btnFichaSinto);  
        vSql(txtConstEncont,lblConstEncont,"constancia_encofrados",Nro,btnConstEncont);       
        vSql(txtHojaRef,lblHojaRef,"hoja_referencia",Nro,btnHojaRef);       
        vSql(txtIndicaMedic,lblIndicaMedic,"indicacion_medica_covid",Nro,btnIndicaMedic);       
        vSql(txtConstAltaEpid,lblConstAltaEpid,"constancia_alta_epidemiologica",Nro,btnConstAltaEpid);   
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
            lbl.setIcon(oIconoSi);
            txt.setText("PASADO");
            txt.setForeground(new java.awt.Color(51, 153, 0));
            sboton.setEnabled(true);
            }else{
               lbl.setIcon(oIconoNo);
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
    lblTriaje.setIcon(oNo);
    lblLabClinico.setIcon(oNo);
    lblElectrocardiograma.setIcon(oNo);
    lblRadiografiaTorax.setIcon(oNo);
    lblFichaAudiologica.setIcon(oNo);
    lblAudiometria.setIcon(oNo);
    lblEspirometria.setIcon(oNo);
    lblOdontograma.setIcon(oNo);
    lblPsicologia.setIcon(oNo);
    lblAnexo7D.setIcon(oNo);
    lblHistorialOcupacional.setIcon(oNo);
    lblFichaAPatologicos.setIcon(oNo);
    lblCuestionarioNordico.setIcon(oNo);
    lblCertificacionAltura.setIcon(oNo);
    lblConsentimientoDosaje.setIcon(oNo);
    lblSAS.setIcon(oNo);
    lblAnexo7C.setIcon(oNo);
    lblExRxSanguineos.setIcon(oNo);
    lblPerimetroToraxico.setIcon(oNo);
    lblOftalmologia.setIcon(oNo);
    //modificacion
    lblCertTrabAltBarrick.setIcon(oNo);
    lblCertCondVehBarrick.setIcon(oNo);
    lblUsoRespirador.setIcon(oNo);
    lblAcctitudMedOcupa.setIcon(oNo);
    lblFichaOIT.setIcon(oNo);
    lblCuestAudiometria.setIcon(oNo);
    lblInformeAudiom.setIcon(oNo);
    lblMusculoEsqueletico.setIcon(oNo);
    lblFichaMedicaSR.setIcon(oNo);
    lblFichaMedica.setIcon(oNo);
    lblFResultadoPP.setIcon(oNo);
    lblConstanciaSalud.setIcon(oNo);
    lblConstanciaAlta.setIcon(oNo);
    lblConsentimientoI.setIcon(oNo);
    lblCertificadoM.setIcon(oNo);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        txtFichaConstanciaS = new javax.swing.JTextField();
        lblConstanciaSalud = new javax.swing.JLabel();
        btnConstanciaSalud = new javax.swing.JButton();
        jLabel169 = new javax.swing.JLabel();
        txtFichaMedica = new javax.swing.JTextField();
        lblFichaMedica = new javax.swing.JLabel();
        btnFichaMedica = new javax.swing.JButton();
        jLabel170 = new javax.swing.JLabel();
        txtFResultadoPP = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        txtConstanciaAlta = new javax.swing.JTextField();
        btnConstanciaAlta = new javax.swing.JButton();
        btnFResultadoPP = new javax.swing.JButton();
        lblConstanciaAlta = new javax.swing.JLabel();
        lblFResultadoPP = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        btnCertificadoM = new javax.swing.JButton();
        btnConsentimientoI = new javax.swing.JButton();
        txtConsentimientoI = new javax.swing.JTextField();
        txtCertificadoM = new javax.swing.JTextField();
        lblCertificadoM = new javax.swing.JLabel();
        lblConsentimientoI = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        txtConstancia = new javax.swing.JTextField();
        lblConstancia = new javax.swing.JLabel();
        btnConstancia = new javax.swing.JButton();
        btnConstaTamM = new javax.swing.JButton();
        txtConstaTamM = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        lblConstaTamM = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        txtRegPP = new javax.swing.JTextField();
        lblRegPP = new javax.swing.JLabel();
        btnRegPP = new javax.swing.JButton();
        jLabel177 = new javax.swing.JLabel();
        txtConstMedica = new javax.swing.JTextField();
        lblConstMedica = new javax.swing.JLabel();
        btnConstMedica = new javax.swing.JButton();
        jLabel178 = new javax.swing.JLabel();
        txtCartaComp = new javax.swing.JTextField();
        lblCartaComp = new javax.swing.JLabel();
        btnCartaComp = new javax.swing.JButton();
        jLabel179 = new javax.swing.JLabel();
        txtFichaSinto = new javax.swing.JTextField();
        lblFichaSinto = new javax.swing.JLabel();
        btnFichaSinto = new javax.swing.JButton();
        btnConstEncont = new javax.swing.JButton();
        txtConstEncont = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        lblConstEncont = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        txtHojaRef = new javax.swing.JTextField();
        lblHojaRef = new javax.swing.JLabel();
        btnHojaRef = new javax.swing.JButton();
        jLabel182 = new javax.swing.JLabel();
        txtIndicaMedic = new javax.swing.JTextField();
        lblIndicaMedic = new javax.swing.JLabel();
        btnIndicaMedic = new javax.swing.JButton();
        jLabel183 = new javax.swing.JLabel();
        txtConstAltaEpid = new javax.swing.JTextField();
        lblConstAltaEpid = new javax.swing.JLabel();
        btnConstAltaEpid = new javax.swing.JButton();
        jLabel184 = new javax.swing.JLabel();
        txtResultPP = new javax.swing.JTextField();
        lblResultPP = new javax.swing.JLabel();
        btnResultPP = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
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
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Eliminar Registros de Pacientes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        jLabel1.setText("Nro Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre :");

        txtNombre.setEditable(false);

        jLabel3.setText("Examen :");

        txtExamen.setEditable(false);
        txtExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamenActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel143.setText("Hist. Ocupacional : ");

        txtHistoriaOcupacional.setEditable(false);
        txtHistoriaOcupacional.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHistoriaOcupacional.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCuestionarioNordico.setEditable(false);
        txtCuestionarioNordico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestionarioNordico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOdontograma.setEditable(false);
        txtOdontograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOdontograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel141.setText("Anexo 16-A:");

        txtAnexo7D.setEditable(false);
        txtAnexo7D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAnexo7D.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel138.setText("Psicologia :");

        txtPsicologia.setEditable(false);
        txtPsicologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPsicologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTriaje.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAudiologica.setPreferredSize(new java.awt.Dimension(13, 11));

        lblElectrocardiograma.setPreferredSize(new java.awt.Dimension(13, 11));

        lblLabClinico.setPreferredSize(new java.awt.Dimension(13, 11));

        lblOdontograma.setPreferredSize(new java.awt.Dimension(13, 11));

        lblEspirometria.setPreferredSize(new java.awt.Dimension(13, 11));

        lblAnexo7D.setPreferredSize(new java.awt.Dimension(13, 11));

        lblPsicologia.setPreferredSize(new java.awt.Dimension(13, 11));

        lblHistorialOcupacional.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel132.setText("Ficha Audiologica :");

        txtRadiografiaTorax.setEditable(false);
        txtRadiografiaTorax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRadiografiaTorax.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel134.setText("Espirometria :");

        txtFichaAudiologica.setEditable(false);
        txtFichaAudiologica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaAudiologica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel137.setText("Odontograma :");

        txtEspirometria.setEditable(false);
        txtEspirometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEspirometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel128.setText("Electrocardiograma :");

        txtLabClinico.setEditable(false);
        txtLabClinico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtLabClinico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel130.setText("Rx. Torax P.A:");

        txtElectrocardiograma.setEditable(false);
        txtElectrocardiograma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtElectrocardiograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblConsentimientoDosaje.setPreferredSize(new java.awt.Dimension(13, 11));

        lblCuestionarioNordico.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaAPatologicos.setPreferredSize(new java.awt.Dimension(13, 11));

        lblRadiografiaTorax.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel126.setText("Lab. Clinico :");

        txtTriaje.setEditable(false);
        txtTriaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTriaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel124.setText("Triaje :");

        jLabel150.setText("Consentimiento Dosaje :");

        jLabel151.setText("Ficha Ant. Patológicos :");

        txtConsentimientoDosaje.setEditable(false);
        txtConsentimientoDosaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsentimientoDosaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel145.setText("Cuestionario Nórdico :");

        txtAntPatologicos.setEditable(false);
        txtAntPatologicos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAntPatologicos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });

        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });

        btnElectro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnElectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectroActionPerformed(evt);
            }
        });

        btnRadiografia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnRadiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiografiaActionPerformed(evt);
            }
        });

        btnAudiologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnAudiologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiologiaActionPerformed(evt);
            }
        });

        btnEspirometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEspirometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspirometriaActionPerformed(evt);
            }
        });

        btnOdontograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnOdontograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdontogramaActionPerformed(evt);
            }
        });

        btnPsicologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnPsicologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsicologiaActionPerformed(evt);
            }
        });

        btnAnexo7D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnAnexo7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7DActionPerformed(evt);
            }
        });

        btnHistoriaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnHistoriaOcupacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaOcupacionalActionPerformed(evt);
            }
        });

        btnFichaAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFichaAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaAPActionPerformed(evt);
            }
        });

        btnCuestionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnCuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestionarioActionPerformed(evt);
            }
        });

        btnDosaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnDosaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosajeActionPerformed(evt);
            }
        });

        jLabel139.setText("Ex. Rx Sanguineos :");

        lblExRxSanguineos.setPreferredSize(new java.awt.Dimension(13, 11));

        txtExRxSanguineos.setEditable(false);
        txtExRxSanguineos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtExRxSanguineos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnExRxSanguineos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnExRxSanguineos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExRxSanguineosActionPerformed(evt);
            }
        });

        jLabel153.setText("Oftalmología :");

        txtOftalmologia.setEditable(false);
        txtOftalmologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOftalmologia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOftalmologia.setPreferredSize(new java.awt.Dimension(13, 11));

        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologiaActionPerformed(evt);
            }
        });

        txtAnexo7C.setEditable(false);
        txtAnexo7C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAnexo7C.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel154.setText("Anexo 16 :");

        lblAnexo7C.setPreferredSize(new java.awt.Dimension(13, 11));

        btnAnexo7C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnAnexo7C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexo7CActionPerformed(evt);
            }
        });

        txtAudiometria.setEditable(false);
        txtAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAudiometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel133.setText("Audiometria:");

        btnAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnAudiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudiometriaActionPerformed(evt);
            }
        });

        lblAudiometria.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel158.setText("Uso de Respiradores:");

        txtUsoRespirador.setEditable(false);
        txtUsoRespirador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUsoRespirador.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblUsoRespirador.setPreferredSize(new java.awt.Dimension(13, 11));

        btnUsoRespirador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnUsoRespirador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsoRespiradorActionPerformed(evt);
            }
        });

        jLabel159.setText("Actitud Med.Ocupacional:");

        txtAcctitudMedOcupa.setEditable(false);
        txtAcctitudMedOcupa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAcctitudMedOcupa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblAcctitudMedOcupa.setPreferredSize(new java.awt.Dimension(13, 11));

        btnAcctitudMedOcupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnAcctitudMedOcupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcctitudMedOcupaActionPerformed(evt);
            }
        });

        jLabel160.setText("Ficha OIT:");

        txtFichaOIT.setEditable(false);
        txtFichaOIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaOIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFichaOIT.setPreferredSize(new java.awt.Dimension(13, 11));

        btnFichaOIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFichaOIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaOITActionPerformed(evt);
            }
        });

        btnActulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });

        jLabel161.setText("Ev.MuscoloEsqueletica :");

        lblMusculoEsqueletico.setPreferredSize(new java.awt.Dimension(13, 11));

        txtMusculoEsqueletico.setEditable(false);
        txtMusculoEsqueletico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMusculoEsqueletico.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnMusculoEsqueletico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnMusculoEsqueletico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusculoEsqueleticoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fichas Sin Restricción"));

        jLabel162.setText("F.Medica ");

        txtFichaMedicaSR.setEditable(false);
        txtFichaMedicaSR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaMedicaSR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFichaMedicaSR.setPreferredSize(new java.awt.Dimension(13, 11));

        btnFichaMedicaSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnFAptitudSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnFAptitudAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFAptitudAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAptitudAgroActionPerformed(evt);
            }
        });

        btnFichaMedicaAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFichaMedicaAgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaAgroActionPerformed(evt);
            }
        });

        lblFAptitudAgro.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFichaMedicaAgro.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel166.setText("F.Med Agro");

        btnFAptitudAnexo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFAptitudAnexo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAptitudAnexo02ActionPerformed(evt);
            }
        });

        btnFichaAnexo02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("COVID MARZA"));

        jLabel168.setText("Constancia Salud");

        txtFichaConstanciaS.setEditable(false);
        txtFichaConstanciaS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaConstanciaS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblConstanciaSalud.setPreferredSize(new java.awt.Dimension(13, 11));

        btnConstanciaSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstanciaSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstanciaSaludActionPerformed(evt);
            }
        });

        jLabel169.setText("Ficha Medica");

        txtFichaMedica.setEditable(false);
        txtFichaMedica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaMedica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFichaMedica.setPreferredSize(new java.awt.Dimension(13, 11));

        btnFichaMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFichaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaMedicaActionPerformed(evt);
            }
        });

        jLabel170.setText("F.Resultado PP");

        txtFResultadoPP.setEditable(false);
        txtFResultadoPP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFResultadoPP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel171.setText("Constancia Alta");

        txtConstanciaAlta.setEditable(false);
        txtConstanciaAlta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConstanciaAlta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnConstanciaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstanciaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstanciaAltaActionPerformed(evt);
            }
        });

        btnFResultadoPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFResultadoPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFResultadoPPActionPerformed(evt);
            }
        });

        lblConstanciaAlta.setPreferredSize(new java.awt.Dimension(13, 11));

        lblFResultadoPP.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel172.setText("Consentimiento I");

        btnCertificadoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnCertificadoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificadoMActionPerformed(evt);
            }
        });

        btnConsentimientoI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConsentimientoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsentimientoIActionPerformed(evt);
            }
        });

        txtConsentimientoI.setEditable(false);
        txtConsentimientoI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConsentimientoI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCertificadoM.setEditable(false);
        txtCertificadoM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertificadoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCertificadoM.setPreferredSize(new java.awt.Dimension(13, 11));

        lblConsentimientoI.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel173.setText("Certificado M");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel168)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFichaConstanciaS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblConstanciaSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConstanciaSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel169)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel173)
                            .addComponent(jLabel170)
                            .addComponent(jLabel171)
                            .addComponent(jLabel172))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCertificadoM, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFResultadoPP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConstanciaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsentimientoI, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCertificadoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFResultadoPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConstanciaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConsentimientoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCertificadoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFResultadoPP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConstanciaAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsentimientoI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel168)
                    .addComponent(txtFichaConstanciaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConstanciaSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConstanciaSalud))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel169)
                    .addComponent(txtFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFichaMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFichaMedica))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel170)
                    .addComponent(txtFResultadoPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFResultadoPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFResultadoPP))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel171)
                    .addComponent(txtConstanciaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConstanciaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConstanciaAlta))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel172)
                    .addComponent(txtConsentimientoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsentimientoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsentimientoI))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel173)
                    .addComponent(txtCertificadoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertificadoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertificadoM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("COVID-19"));

        jLabel174.setText("Constancia");

        txtConstancia.setEditable(false);
        txtConstancia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConstancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblConstancia.setPreferredSize(new java.awt.Dimension(13, 11));

        btnConstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstanciaActionPerformed(evt);
            }
        });

        btnConstaTamM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstaTamM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstaTamMActionPerformed(evt);
            }
        });

        txtConstaTamM.setEditable(false);
        txtConstaTamM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConstaTamM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel175.setText("Constancia Tamizaje Marsa");

        lblConstaTamM.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel176.setText("Registro prueba rápidas");

        txtRegPP.setEditable(false);
        txtRegPP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRegPP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblRegPP.setPreferredSize(new java.awt.Dimension(13, 11));

        btnRegPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnRegPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPPActionPerformed(evt);
            }
        });

        jLabel177.setText("Constancia Médica ");

        txtConstMedica.setEditable(false);
        txtConstMedica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConstMedica.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblConstMedica.setPreferredSize(new java.awt.Dimension(13, 11));

        btnConstMedica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstMedicaActionPerformed(evt);
            }
        });

        jLabel178.setText("Carta Compromiso");

        txtCartaComp.setEditable(false);
        txtCartaComp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCartaComp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCartaComp.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCartaComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnCartaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaCompActionPerformed(evt);
            }
        });

        jLabel179.setText("Ficha Sintomatologica ");

        txtFichaSinto.setEditable(false);
        txtFichaSinto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFichaSinto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFichaSinto.setPreferredSize(new java.awt.Dimension(13, 11));

        btnFichaSinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnFichaSinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaSintoActionPerformed(evt);
            }
        });

        btnConstEncont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstEncont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstEncontActionPerformed(evt);
            }
        });

        txtConstEncont.setEditable(false);
        txtConstEncont.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConstEncont.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel180.setText("Constancia Encofrados");

        lblConstEncont.setPreferredSize(new java.awt.Dimension(13, 11));

        jLabel181.setText("Hoja de Referencia");

        txtHojaRef.setEditable(false);
        txtHojaRef.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtHojaRef.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblHojaRef.setPreferredSize(new java.awt.Dimension(13, 11));

        btnHojaRef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnHojaRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHojaRefActionPerformed(evt);
            }
        });

        jLabel182.setText("Indicaciones Médicas");

        txtIndicaMedic.setEditable(false);
        txtIndicaMedic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIndicaMedic.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblIndicaMedic.setPreferredSize(new java.awt.Dimension(13, 11));

        btnIndicaMedic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnIndicaMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicaMedicActionPerformed(evt);
            }
        });

        jLabel183.setText("Constancia de Alta");

        txtConstAltaEpid.setEditable(false);
        txtConstAltaEpid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtConstAltaEpid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblConstAltaEpid.setPreferredSize(new java.awt.Dimension(13, 11));

        btnConstAltaEpid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnConstAltaEpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstAltaEpidActionPerformed(evt);
            }
        });

        jLabel184.setText("Resultados Prueba Rapida");

        txtResultPP.setEditable(false);
        txtResultPP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtResultPP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblResultPP.setPreferredSize(new java.awt.Dimension(13, 11));

        btnResultPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnResultPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultPPActionPerformed(evt);
            }
        });

        jLabel185.setText("Epídemiologica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResultPP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResultPP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel176)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRegPP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRegPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegPP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConstMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConstMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConstMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel174)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel175)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtConstaTamM, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblConstaTamM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnConstaTamM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel178)
                                .addGap(46, 46, 46)
                                .addComponent(txtCartaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCartaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(btnCartaComp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel181)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHojaRef, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHojaRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHojaRef, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel182)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIndicaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIndicaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIndicaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel183)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConstAltaEpid, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConstAltaEpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConstAltaEpid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel179)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFichaSinto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFichaSinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFichaSinto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel180)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtConstEncont, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblConstEncont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConstEncont, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel185)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel179)
                            .addComponent(txtFichaSinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFichaSinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaSinto))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel180)
                            .addComponent(txtConstEncont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConstEncont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConstEncont))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel181)
                            .addComponent(txtHojaRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHojaRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHojaRef))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel182)
                            .addComponent(txtIndicaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIndicaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIndicaMedic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCartaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel183)
                                .addComponent(txtConstAltaEpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblConstAltaEpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConstAltaEpid))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel174)
                            .addComponent(txtConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConstancia))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel175)
                            .addComponent(txtConstaTamM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConstaTamM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConstaTamM))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel176)
                            .addComponent(txtRegPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegPP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel178)
                                .addComponent(txtCartaComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCartaComp))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel177)
                            .addComponent(txtConstMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConstMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConstMedica))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel184)
                        .addComponent(txtResultPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblResultPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResultPP))
                    .addComponent(jLabel185))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros Formatos"));
        jPanel4.setForeground(new java.awt.Color(0, 255, 204));
        jPanel4.setName("FD"); // NOI18N

        lblCuestAudiometria.setPreferredSize(new java.awt.Dimension(13, 11));

        txtCuestAudiometria.setEditable(false);
        txtCuestAudiometria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCuestAudiometria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel140.setText("Cuest. Audiometria:");

        btnCuestAudiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnInformeAudiom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnPerimetroToraxico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnPerimetroToraxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroToraxicoActionPerformed(evt);
            }
        });

        jLabel147.setText("Audiometria Boroo: ");

        txtAudiometria2021.setEditable(false);
        txtAudiometria2021.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAudiometria2021.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAudiometria2021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnEvMuscEsqueletico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnCuestCalidadSueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnCuestCalidadSueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuestCalidadSueñoActionPerformed(evt);
            }
        });

        lblTestFatSomnolencia.setPreferredSize(new java.awt.Dimension(13, 11));

        btnTestFatSomnolencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnEvalOftalmologica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnEvalOftalmologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvalOftalmologicaActionPerformed(evt);
            }
        });

        btnCertManipuladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel140)
                                .addGap(4, 4, 4)
                                .addComponent(txtCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCuestAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel142)
                                .addGap(2, 2, 2)
                                .addComponent(txtInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lblInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInformeAudiom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel188)
                            .addGap(4, 4, 4)
                            .addComponent(txtCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCertManipuladores, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel147)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAudiometria2021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                    .addComponent(jLabel187)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEvalOftalmologica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel152)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnPerimetroToraxico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajos en Altura"));

        jLabel155.setText("Cert.Trab.Altura(Barrik):");

        txtCertTrabAltBarrick.setEditable(false);
        txtCertTrabAltBarrick.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCertTrabAltBarrick.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCertTrabAltBarrick.setPreferredSize(new java.awt.Dimension(13, 11));

        btnCertTrabAltBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnCertiAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnCertiAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertiAlturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCertiAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel144)
                            .addComponent(lblCertificacionAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtCerTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCertiAltura))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Conducción de Vehiculos"));

        jLabel146.setText("Ficha S.A.S :");

        txtDetencionSAS.setEditable(false);
        txtDetencionSAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDetencionSAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSAS.setPreferredSize(new java.awt.Dimension(13, 11));

        btnSas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
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

        btnCertCondVehBarrick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xx.png"))); // NOI18N
        btnCertCondVehBarrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertCondVehBarrickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDetencionSAS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel157)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCertCondVehBarrick, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        jLabel125.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel125.setText("EXAMEN OCUPACIONAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel143)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtHistoriaOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblHistorialOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnHistoriaOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel151)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAntPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblFichaAPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnFichaAP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel145)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnCuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel161)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMusculoEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMusculoEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnMusculoEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel153)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel159)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAcctitudMedOcupa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblAcctitudMedOcupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnAcctitudMedOcupa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel134)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnAudiologia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnRadiografia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel160)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFichaOIT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblFichaOIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnFichaOIT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel139)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel137)
                                                .addComponent(jLabel138))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(txtOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(txtPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addComponent(jLabel125))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel158)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUsoRespirador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblUsoRespirador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUsoRespirador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel141)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel150)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel154)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAnexo7C, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAnexo7C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAnexo7C, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnElectro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActulizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnLimpiar)
                    .addComponent(btnActulizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel2)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel124)
                            .addComponent(lblTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTriaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel126)
                            .addComponent(lblLabClinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLaboratorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel130)
                            .addComponent(lblRadiografiaTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRadiografia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel132)
                            .addComponent(lblFichaAudiologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAudiologia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAudiometria)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAudiometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel133))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel134)
                                        .addComponent(txtEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnEspirometria))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEspirometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel137)
                                .addComponent(txtOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPsicologia)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel138)
                                    .addComponent(txtPsicologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtFichaOIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFichaOIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaOIT)
                            .addComponent(jLabel160))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblExRxSanguineos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExRxSanguineos)
                            .addComponent(jLabel139))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtAntPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFichaAPatologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaAP)
                            .addComponent(jLabel151))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel143)
                            .addComponent(txtHistoriaOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHistorialOcupacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHistoriaOcupacional))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCuestionarioNordico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel145)
                            .addComponent(btnCuestionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel161)
                            .addComponent(txtMusculoEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMusculoEsqueletico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMusculoEsqueletico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel153)
                            .addComponent(txtOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOftalmologia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel159)
                            .addComponent(txtAcctitudMedOcupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcctitudMedOcupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcctitudMedOcupa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel158)
                            .addComponent(txtUsoRespirador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsoRespirador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsoRespirador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel141)
                            .addComponent(txtAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnexo7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnexo7D))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel150)
                            .addComponent(txtConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConsentimientoDosaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDosaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAnexo7C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel154))
                            .addComponent(lblAnexo7C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnexo7C))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel128)
                            .addComponent(lblElectrocardiograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnElectro))))
                .addGap(25, 25, 25))
        );

        jPanel4.getAccessibleContext().setAccessibleName("pROBAR");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
       verifica(txtNorden.getText().toString());
      //verifica2();
       
    }//GEN-LAST:event_txtNordenActionPerformed
private void verifica2(){
 String nro = txtNorden.getText().toString();
       if(!txtNorden.getText().isEmpty()){
        if(oFunc.sConsultas("audiometria_po", "n_orden", nro)== true && oFunc.sConsultas("ficha_audiologica", "n_orden",nro)== true ){
            vSql(txtFichaAudiologica,lblFichaAudiologica, "ficha_audiologica", nro,btnAudiologia);                              
        }  else{
        lblFichaAudiologica.setIcon(oIconoNo);
        btnAudiologia.setEnabled(false);
        txtFichaAudiologica.setText("POR PASAR");
        txtFichaAudiologica.setForeground(new java.awt.Color(204, 0, 0));
        
        } 
        
       }

}

public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
          try {
              oConn.sqlStmt.close();
          } catch (SQLException ex) {
              Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
          }
  
    this.dispose();
      //  System.exit(0);

    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar2();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void btnTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriajeActionPerformed
        if(oPu.eDatos(txtTriaje, "triaje", "Triaje", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnTriajeActionPerformed
    private void btnLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorioActionPerformed
        if(oPu.eDatos(txtLabClinico, "lab_clinico", "Laboratorio Clinico", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnLaboratorioActionPerformed
    private void btnElectroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectroActionPerformed
        if(oPu.eDatos(txtElectrocardiograma, "informe_electrocardiograma", "Electrocardiograma", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnElectroActionPerformed
    private void btnRadiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiografiaActionPerformed
        if(oPu.eDatos(txtRadiografiaTorax, "radiografia_torax", "Examenes Radiograficos", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnRadiografiaActionPerformed
    private void btnAudiologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudiologiaActionPerformed
        if(oPu.eDatos(txtFichaAudiologica, "ficha_audiologica", "Ficha Audiometria", txtNorden)){verifica(txtNorden.getText().toString()); //verifica2();}
        if(oPu.eDatos(txtFichaAudiologica, "audiometria_po", "Examen Audiometrico", txtNorden)){verifica(txtNorden.getText().toString()); }}//verifica2();}
    }//GEN-LAST:event_btnAudiologiaActionPerformed
    private void btnEspirometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspirometriaActionPerformed
         if(oPu.eDatos(txtEspirometria, "funcion_abs", "Espirometria", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnEspirometriaActionPerformed
    private void btnOdontogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdontogramaActionPerformed
         if(oPu.eDatos(txtOdontograma, "odontograma", "Odontograma", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnOdontogramaActionPerformed
    private void btnPsicologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsicologiaActionPerformed
         if(oPu.eDatos(txtPsicologia, "informe_psicologico", "Psicologia", txtNorden)){verifica(txtNorden.getText().toString());}
    }//GEN-LAST:event_btnPsicologiaActionPerformed
    private void btnAnexo7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexo7DActionPerformed
        if(oPu.eDatos(txtAnexo7D, "anexo16a", "Anexo 7D", txtNorden)){verifica(txtNorden.getText().toString());}        
    }//GEN-LAST:event_btnAnexo7DActionPerformed
    private void btnHistoriaOcupacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaOcupacionalActionPerformed
        if(oPu.eSubRegistros(txtHistoriaOcupacional, "historia_oc_detalle","cod_ho", oPu.oConsultar("cod_ho", "historia_oc_info", txtNorden))){
        if(oPu.eDatos(txtHistoriaOcupacional, "historia_oc_info", "Historia Ocupacional info", txtNorden)){verifica(txtNorden.getText().toString());
        }
        }        
    }//GEN-LAST:event_btnHistoriaOcupacionalActionPerformed

    private void btnFichaAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaAPActionPerformed
       if(oPu.eSubRegistros(txtAntPatologicos, "antecedentes_patologicos_quirurgicos","cod_ap", oPu.oConsultar("cod_ap", "antecedentes_patologicos", txtNorden))){
        if(oPu.eDatos(txtAntPatologicos, "antecedentes_patologicos", "Antecedentes Patologicos", txtNorden)){verifica(txtNorden.getText().toString());
        }
        }  
    }//GEN-LAST:event_btnFichaAPActionPerformed

    private void btnCuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuestionarioActionPerformed
       if(oPu.eDatos(txtCuestionarioNordico, "cuestionario_nordico", "Cuestionario Nordico", txtNorden)){verifica(txtNorden.getText().toString());} 
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
         if(oPu.eDatos(txtExRxSanguineos, "ex_radiograficos_sanguineos", "Examenes Radiograficos Sanguineos", txtNorden)){verifica(txtNorden.getText().toString());}
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
         if(oPu.eDatos(txtFichaOIT, "oit", "Ficha OIT", txtNorden)){verifica(txtNorden.getText().toString());}
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

    private void btnConstanciaSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstanciaSaludActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnConstanciaSaludActionPerformed

    private void btnFichaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaMedicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFichaMedicaActionPerformed

    private void btnConstanciaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstanciaAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstanciaAltaActionPerformed

    private void btnFResultadoPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFResultadoPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFResultadoPPActionPerformed

    private void btnCertificadoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificadoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCertificadoMActionPerformed

    private void btnConsentimientoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsentimientoIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsentimientoIActionPerformed

    private void txtExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamenActionPerformed

    private void btnConstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstanciaActionPerformed

    private void btnConstaTamMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstaTamMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstaTamMActionPerformed

    private void btnRegPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegPPActionPerformed

    private void btnConstMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstMedicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstMedicaActionPerformed

    private void btnCartaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCartaCompActionPerformed

    private void btnFichaSintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaSintoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFichaSintoActionPerformed

    private void btnConstEncontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstEncontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstEncontActionPerformed

    private void btnHojaRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHojaRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHojaRefActionPerformed

    private void btnIndicaMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicaMedicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIndicaMedicActionPerformed

    private void btnConstAltaEpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstAltaEpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConstAltaEpidActionPerformed

    private void btnResultPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultPPActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        cerrarVentana();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcctitudMedOcupa;
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnAnexo7C;
    private javax.swing.JButton btnAnexo7D;
    private javax.swing.JButton btnAudiologia;
    private javax.swing.JButton btnAudiometria;
    private javax.swing.JButton btnAudiometria2021;
    private javax.swing.JButton btnCartaComp;
    private javax.swing.JButton btnCertCondVehBarrick;
    private javax.swing.JButton btnCertManipuladores;
    private javax.swing.JButton btnCertTrabAltBarrick;
    private javax.swing.JButton btnCertiAltura;
    private javax.swing.JButton btnCertificadoM;
    private javax.swing.JButton btnConsentimientoI;
    private javax.swing.JButton btnConstAltaEpid;
    private javax.swing.JButton btnConstEncont;
    private javax.swing.JButton btnConstMedica;
    private javax.swing.JButton btnConstaTamM;
    private javax.swing.JButton btnConstancia;
    private javax.swing.JButton btnConstanciaAlta;
    private javax.swing.JButton btnConstanciaSalud;
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
    private javax.swing.JButton btnFResultadoPP;
    private javax.swing.JButton btnFichaAP;
    private javax.swing.JButton btnFichaAnexo02;
    private javax.swing.JButton btnFichaMedica;
    private javax.swing.JButton btnFichaMedicaAgro;
    private javax.swing.JButton btnFichaMedicaSR;
    private javax.swing.JButton btnFichaOIT;
    private javax.swing.JButton btnFichaSinto;
    private javax.swing.JButton btnHistoriaOcupacional;
    private javax.swing.JButton btnHojaRef;
    private javax.swing.JButton btnIndicaMedic;
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
    private javax.swing.JButton btnRegPP;
    private javax.swing.JButton btnResultPP;
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
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAcctitudMedOcupa;
    private javax.swing.JLabel lblAnexo7C;
    private javax.swing.JLabel lblAnexo7D;
    private javax.swing.JLabel lblAudiometria;
    private javax.swing.JLabel lblAudiometria2021;
    private javax.swing.JLabel lblCartaComp;
    private javax.swing.JLabel lblCertCondVehBarrick;
    private javax.swing.JLabel lblCertManipuladores;
    private javax.swing.JLabel lblCertTrabAltBarrick;
    private javax.swing.JLabel lblCertificacionAltura;
    private javax.swing.JLabel lblCertificadoM;
    private javax.swing.JLabel lblConsentimientoDosaje;
    private javax.swing.JLabel lblConsentimientoI;
    private javax.swing.JLabel lblConstAltaEpid;
    private javax.swing.JLabel lblConstEncont;
    private javax.swing.JLabel lblConstMedica;
    private javax.swing.JLabel lblConstaTamM;
    private javax.swing.JLabel lblConstancia;
    private javax.swing.JLabel lblConstanciaAlta;
    private javax.swing.JLabel lblConstanciaSalud;
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
    private javax.swing.JLabel lblFResultadoPP;
    private javax.swing.JLabel lblFichaAPatologicos;
    private javax.swing.JLabel lblFichaAnexo02;
    private javax.swing.JLabel lblFichaAudiologica;
    private javax.swing.JLabel lblFichaMedica;
    private javax.swing.JLabel lblFichaMedicaAgro;
    private javax.swing.JLabel lblFichaMedicaSR;
    private javax.swing.JLabel lblFichaOIT;
    private javax.swing.JLabel lblFichaSinto;
    private javax.swing.JLabel lblHistorialOcupacional;
    private javax.swing.JLabel lblHojaRef;
    private javax.swing.JLabel lblIndicaMedic;
    private javax.swing.JLabel lblInformeAudiom;
    private javax.swing.JLabel lblLabClinico;
    private javax.swing.JLabel lblMusculoEsqueletico;
    private javax.swing.JLabel lblOdontograma;
    private javax.swing.JLabel lblOftalmologia;
    private javax.swing.JLabel lblOftalmologia2;
    private javax.swing.JLabel lblPerimetroToraxico;
    private javax.swing.JLabel lblPsicologia;
    private javax.swing.JLabel lblRadiografiaTorax;
    private javax.swing.JLabel lblRegPP;
    private javax.swing.JLabel lblResultPP;
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
    private javax.swing.JTextField txtCartaComp;
    private javax.swing.JTextField txtCerTrabajo;
    private javax.swing.JTextField txtCertCondVehBarrick;
    private javax.swing.JTextField txtCertManipuladores;
    private javax.swing.JTextField txtCertTrabAltBarrick;
    private javax.swing.JTextField txtCertificadoM;
    private javax.swing.JTextField txtConsentimientoDosaje;
    private javax.swing.JTextField txtConsentimientoI;
    private javax.swing.JTextField txtConstAltaEpid;
    private javax.swing.JTextField txtConstEncont;
    private javax.swing.JTextField txtConstMedica;
    private javax.swing.JTextField txtConstaTamM;
    private javax.swing.JTextField txtConstancia;
    private javax.swing.JTextField txtConstanciaAlta;
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
    private javax.swing.JTextField txtFResultadoPP;
    private javax.swing.JTextField txtFichaAnexo02;
    private javax.swing.JTextField txtFichaAudiologica;
    private javax.swing.JTextField txtFichaConstanciaS;
    private javax.swing.JTextField txtFichaMedica;
    private javax.swing.JTextField txtFichaMedicaAgro;
    private javax.swing.JTextField txtFichaMedicaSR;
    private javax.swing.JTextField txtFichaOIT;
    private javax.swing.JTextField txtFichaSinto;
    private javax.swing.JTextField txtHistoriaOcupacional;
    private javax.swing.JTextField txtHojaRef;
    private javax.swing.JTextField txtIndicaMedic;
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
    private javax.swing.JTextField txtRegPP;
    private javax.swing.JTextField txtResultPP;
    private javax.swing.JTextField txtTestFatSomnolencia;
    private javax.swing.JTextField txtTriaje;
    private javax.swing.JTextField txtUsoRespirador;
    // End of variables declaration//GEN-END:variables
}
