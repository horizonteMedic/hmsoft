/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;

import Clases.ExportarExel;
import Clases.clsConnection;
import Clases.clsFunciones;
import autocomplete.ajTextField;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
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
import sistema.Audiometria;
import sistema.Ingreso;
 

/**
 *
 * @author Administrador
 */
public class Reporteador extends javax.swing.JInternalFrame {
        DefaultTableModel model;        
   clsConnection oConn = new clsConnection();
         clsFunciones  oFunc = new clsFunciones();
         Ingreso objet= new Ingreso();
          String nomsede,nombre;
            String contrata,empresa;
          String agregarConsulta=" ",laconsulta=" ",tipofecha=" ",agregarConsulta1="";
          int marcador=1,verificador=1;
   int codigosede;
    public Reporteador() {
        initComponents();
        valorsede();
        personalizado(false);
        Columnas(true);   
        cargarContratas();
        cargarEmpresas();
         AutoCompleteDecorator.decorate(this.cboContratas);
         AutoCompleteDecorator.decorate(this.cboEmpresas);
         txtEmpresa.setVisible(false);
         txtContrata.setVisible(false);
       // new ajTextField.autocompleterText(txtEmpresa, "razon_empresa", "empresas");
      // new ajTextField.autocompleterText(txtContrata, "razon_contrata", "contratas");
    }
    private void LimpiarPersonalizado(){
    txtContrata.setText(null);
    txtEmpresa.setText(null);
    Fhasta.setDate(null);
    Fdesde.setDate(null);
    if(chkPersonalizada.isSelected()== true){
        txtContrata.requestFocus();
    }
    
    }
    private void cargarContratas(){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="SELECT UPPER(razon_contrata) AS razon_contrata FROM contratas;";
                
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
                            // Obtiene los datos de la Consulta
                            cboContratas.addItem(oConn.setResult.getString ("razon_contrata"));
                            
                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
                cboContratas.setSelectedIndex(0);
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
}
  private void cargarEmpresas(){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="SELECT UPPER(razon_empresa) AS razon_empresa FROM empresas";
                
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
                            // Obtiene los datos de la Consulta
                            cboEmpresas.addItem(oConn.setResult.getString ("razon_empresa"));
                            
                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
                cboEmpresas.setSelectedIndex(0);
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
}


    private void personalizado(boolean t){
    txtContrata.setEditable(t);
    txtEmpresa.setEditable(t);
    Fdesde.setEnabled(t);
    Fhasta.setEnabled(t);
    btnMostrar.setEnabled(t);
    btnLimpiar.setEnabled(t);
    chkContratista.setEnabled(t);
    chkEmpresa.setEnabled(t);
    
    }
    private void servicio(boolean t){
     lblNservicio.setVisible(t);
     txtOrdenServicio.setVisible(t);
     btnBuscar.setVisible(t);
     if(lblNservicio.isVisible()){
         txtOrdenServicio.requestFocus();
     }
    }
    private void Columnas(boolean t){
    chk1.setSelected(true);
    chk2.setSelected(true);
    chk3.setSelected(true);
    chk4.setSelected(true);
    chk5.setSelected(true);
    chk6.setSelected(true);
    chk7.setSelected(true);
    chk8.setSelected(true);
    chk9.setSelected(true);
    chk10.setSelected(true);
    chk11.setSelected(true);
    chk12.setSelected(true);
    chk13.setSelected(true);
    chk14.setSelected(true);
    chk15.setSelected(true);
    chk16.setSelected(true);
    
    }
    
    public void valorsede(){
                     

            try {
                nomsede=objet.nombresede;
                System.out.println("pintar label::"+nomsede);
                jLabel1.setText(nomsede);
                nombre=nomsede;
                chk17.setSelected(true);
                // jLabel48.setText(nomsede);
                jCheckBox1.setSelected(true);
                String sQuery;
                // Prepara el Query
                sQuery ="select cod_sede from sede where nombre_sede= '"+nomsede+"';";
                
                if (oConn.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn.setResult.next())
                        {
                            // Obtiene los datos de la Consulta
                            codigosede=oConn.setResult.getInt("cod_sede");
                            jLabel1.setText(nomsede);
                        }
                        
                        // Cierra Resultados
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                agregarConsulta=" and n.cod_sede="+codigosede;
                agregarConsulta1=" and n_orden_ocupacional.cod_sede="+codigosede;
                System.out.println(":"+agregarConsulta);
                oConn.sqlStmt.close();
                //  agregarConsulta+=" "; 
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void cOrdenServicio(){
               
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="SELECT n.n_orden AS FICHA, ";
                if(chk1.isSelected()== true){
                    vSql += "n.nom_examen AS EXAMEN,";
                }
                if(chk9.isSelected()== true){
                    vSql += "n.n_fisttest as FISTTEST,";
                }
                if(chk10.isSelected()== true){
                    vSql += "n.n_psicosen as PSICOSENSO, ";
                }
                if(chk11.isSelected()== true){
                    vSql+= "n.n_testaltura as TESTALTURA, ";
                }
                if(chk13.isSelected()== true){
                    vSql+= "n.visual_compl as VISUALCOMPL, ";
                }
                if(chk14.isSelected()== true){
                    vSql+= "n.trab_calientes as TRABENCALIENTE, ";
                }
                if(chk15.isSelected()== true){
                    vSql+= "n.tipoprueba as TipoExamenCovid, ";
                }
                if(chk16.isSelected()== true){
                    vSql+= "n.chkcovid2 as COVID2, ";
                }
                if(chk17.isSelected()== true){
                    vSql+= "n.manip_alimentos as MANIPULADORALIMENTOS, ";
                }
                if(chk2.isSelected()== true){
                    vSql += "d.cod_pa AS DNI,";
                }
                if(chk3.isSelected()== true){
                    vSql += "d.nombres_pa||' '||d.apellidos_pa AS NOMBRES, ";
                }
                if(chk4.isSelected()== true){
                    vSql+= "n.cargo_de AS CARGO, ";
                }
                if(chk5.isSelected()== true){
                    vSql+= "n.fecha_apertura_po AS FECHA, ";
                }
                
                if(chk7.isSelected()== true){
                    vSql+= "n.razon_contrata AS CONTRATA, ";
                }
                if(chk8.isSelected()== true){
                    vSql+= "n.razon_empresa AS EMPRESA, ";
                }
                if(chk6.isSelected()== true){
                    vSql+= "n.tipo_pago AS TIPOPAGO, ";
                }
                vSql+= "n.precio_po::numeric AS PRECIO "
                        
                        + "FROM n_orden_ocupacional AS n "
                        + "LEFT JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa) "
                        + "LEFT JOIN lab_clinico AS l ON (n.n_orden = l.n_orden)"
                        + "WHERE n.o_servicio ="+txtOrdenServicio.getText().toString();
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];
                            for (int i = 0; i < CantidaColumnas; i++) {
                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        tbReporte.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
    public void consultaAlta(){
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                
                String vSql=" select noo.n_orden, concat(dp.nombres_pa,' ',dp.apellidos_pa) as DatosPersonales,\n" +
                        "        dp.cod_pa as dni,\n" +
                        "		noo.razon_empresa,noo.razon_contrata,\n" +
                        "		cam.fecha_examen as fechaAlta, noo.fecha_apertura_po as fechaIngreso,\n" +
                        "			( case when cam.fecha_actua is null then 'sin actulizar'\n" +
                        "		 else cast(cam.fecha_actua as text)\n" +
                        "		 end )as fechaAltaActualizada\n" +
                        " from datos_paciente as dp inner join n_orden_ocupacional as noo on dp.cod_pa=noo.cod_pa\n" +
                        " inner join constancia_alta_marsa as cam on noo.n_orden=cam.n_orden "
                        +laconsulta
                        ;
                
                System.out.println("consulta:"+vSql);
                //oFunc.SubSistemaMensajeInformacion(vSql);      
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];
                            
                            for (int i = 0; i < CantidaColumnas; i++) {
                                
                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        tbReporte.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
    
    
    
    public boolean convertir(boolean pase){
    boolean retornado=true;
    if(pase=true)
        retornado=false;
    return retornado;
    
    
    }
    private void cPersonalizada(){
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                
                String vSql="SELECT  n.n_orden AS FICHA ";
                if(chk5.isSelected()== true){
                    vSql+= ",n.fecha_apertura_po AS FECHAEMO ";
                }
                if(chk3.isSelected()== true){
                    vSql += ",d.nombres_pa||' '||d.apellidos_pa AS NOMBRES ";
                }
                if(chk2.isSelected()== true){
                    vSql += ",d.cod_pa AS DNI ";
                }
                vSql+=",d.fecha_nacimiento_pa AS FECHANACIMIENTO ";
                vSql+=",obtener_edad(d.fecha_nacimiento_pa,n.fecha_apertura_po) as EDAD";
                vSql+=",d.direccion_pa as DIRECCIÓN";
                vSql+=",d.cel_pa as CELULAR";
                if(chk4.isSelected()== true){
                    vSql+= ",n.cargo_de AS CARGO ";
                }
                
                if(chk7.isSelected()== true){
                    vSql+= ",n.razon_contrata AS CONTRATA ";
                }
                if(chk8.isSelected()== true){
                    vSql+= ",n.razon_empresa AS EMPRESA ";
                }
                if(chk1.isSelected()== true){
                    vSql += ",n.nom_examen AS EXAMEN ";
                }
                vSql+= ",n.txtobserv1 AS OBSERV1 ";
                vSql+= ",n.txtobserv2 AS OBSERV2 ";
                if(chk9.isSelected()== true){
                    vSql += ",n.n_fisttest as FISTTEST ";
                }
                if(chk10.isSelected()== true){
                    vSql += ",n.n_psicosen as PSICOSENSO ";
                }
                if(chk11.isSelected()== true){
                    vSql+= ",n.n_testaltura as TESTALTURA ";
                }
                if(chk13.isSelected()== true){
                    vSql+= ",n.visual_compl as VISUALCOMPL ";
                }
                if(chk14.isSelected()== true){
                    vSql+= ",n.trab_calientes as TRABENCALIENTE ";
                }
                if(chk15.isSelected()== true){
                    vSql+= ",n.tipoprueba as TIPO_PRUEBA_COVID";
                }
                //   if(chk16.isSelected()== true){
                //  vSql+= ",n.chkcovid2 as COVID2 ";
                //  }
                if(chk17.isSelected()== true){
                    vSql+= ",n.manip_alimentos as MANIPULADORALIMENTOS ";
                }
                if(chk12.isSelected()== true){
                    vSql += ",CASE WHEN ie.n_orden is not null  AND n.nom_examen ='ANEXO-7D' "
                            + "THEN 'true' ELSE 'false' END AS EKG ";
                }
                vSql+=",CASE WHEN l.chko = 'TRUE' THEN 'O'"
                        + "       WHEN l.chka = 'TRUE' THEN 'A'\n" +
                        "         WHEN l.chkb = 'TRUE' THEN 'B'\n" +
                        "         WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n" +
                        "  CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n" +
                        "      WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS GRUPOFACTOR ";
                vSql+=",  CASE  WHEN o.n_orden is not null THEN 'Observado'\n" +
                        "                   WHEN ca.chkapto = 'TRUE' THEN 'Apto"
                        + "'\n" +
                        "                   WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  \n" +
                        "                   WHEN ac.no_apto = 'TRUE' THEN 'No Apto' \n" +
                        "                   WHEN a.no_apto = 'TRUE' THEN 'No Apto'\n" +
                        "                   WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto'\n" +
                        "                   WHEN cma.p_no1 = 'TRUE' THEN 'No Apto'\n" +
                        "WHEN bc.chk_no = 'TRUE' THEN 'No Apto'\n" +
                        
                        "		        WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                        "                   WHEN ba.chk_observado = 'TRUE' THEN 'Observado' END as condicion ";
                
                if(chk6.isSelected()== true){
                    vSql+= ",n.tipo_pago AS TIPOPAGO ";
                }
                vSql+= ",n.precio_po::numeric AS PRECIO "
                        +", (case when n.cod_sede=1 then 'TRUJILLO' "
                        + " WHEN n.cod_sede=2 then 'Huamachuco' "
                        + " WHEN n.cod_sede=4 then 'Trujillo-Pierola' "
                        + " WHEN n.cod_sede=3 then 'Huancayo' "
                        + " end ) as SEDE "
                        + "FROM n_orden_ocupacional AS n "
                        + "LEFT JOIN datos_paciente AS d ON (n.cod_pa = d.cod_pa) "
                        + "LEFT JOIN lab_clinico AS l ON (n.n_orden = l.n_orden) "
                        + "LEFT JOIN informe_electrocardiograma AS ie ON (n.n_orden = ie.n_orden)  "
                        +" LEFT JOIN certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden)"
                        +" left join anexo7d as a ON (a.n_orden=n.n_orden)"
                        +" left join anexoc as ac ON (ac.n_orden=n.n_orden)"
                        +" left join observaciones as o ON (o.n_orden=n.n_orden)"
                        +" left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
                        +" left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"
                        +" left join certificacion_medica_altura as cma ON (cma.n_orden=n.n_orden) ";
                if(cboContratas.getSelectedItem().toString().length()>2)
                    contrata=cboContratas.getSelectedItem().toString();
                else
                    contrata="";
                if(cboEmpresas.getSelectedItem().toString().length()>2)
                    empresa=cboEmpresas.getSelectedItem().toString();
                else
                    empresa="";
                //  if(cboContratas.getSelectedIndex()>=1){
                vSql +="WHERE UPPER(n.razon_contrata) like UPPER('%"+contrata+"%') ";
                //   contrata=" ";
                // }
                // else
                //    contrata=" where ";
                // if(cboContratas.getSelectedIndex()>=1 && cboEmpresas.getSelectedIndex()>=1){
                //     vSql +=" AND ";
                // }
                // if(cboContratas.getSelectedIndex()>=1 && cboEmpresas.getSelectedIndex()>=1){
                //     vSql +=" WHERE ";
                // }
                // if(cboEmpresas.getSelectedIndex()>=1){
                vSql += " AND UPPER(n.razon_empresa) like UPPER('%"+empresa+"%')";
                // }
                if(chkRepTestAltura.isSelected()){
                    vSql +=" and n.n_testaltura = 'true'";
                }
                if(chkRepPsicosen.isSelected()){
                    vSql +=" and n.n_psicosen = 'true'";
                }
                if(chkRepVisualCompl.isSelected()){
                    vSql +=" and n.visual_compl = 'true'";
                }
                if(chkRepTrabCal.isSelected()){
                    vSql +=" and n.trab_calientes = 'true'";
                }
                //  if(chkRepCovid1.isSelected()){
                //     vSql +=" and n.chkcovid1 = 'true'";
                // }
                //  if(chkRepCovid2.isSelected()){
                //     vSql +=" and n.chkcovid2 = 'true'";
                // }
                if(chkRepManipAlimen.isSelected()){
                    vSql +=" and n.manip_alimentos = 'true'";
                }
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 )
                {
                    
                    //  if (((JTextField)cboEmpresas.getText().trim().length()> 2 )
                    
                    //  if(cboEmpresas.getItemCount()==0 && cboContratas.getItemCount()==0 ){
                    //       vSql +=" WHERE n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                    //  }else{
                    vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                    //  }
                    
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 )
                {
                    vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                
                
                vSql+=" " +agregarConsulta;
                System.out.println("consulta:"+vSql);
                //oFunc.SubSistemaMensajeInformacion(vSql);      
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];
                            
                            for (int i = 0; i < CantidaColumnas; i++) {
                                
                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        tbReporte.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
   
    private void cPersonalizadaadecco(){
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                
                String vSql="SELECT n_orden_ocupacional.n_orden AS CODIGO,\n" +
                        "      'HORIZONTE MEDIC' AS PROVEEDOR,\n" +
                        "	  n_orden_ocupacional.cod_pa AS DNI,\n" +
                        "	  n_orden_ocupacional.fecha_apertura_po  as FECHA,\n" +
                        "       datos_paciente.nombres_pa ||' '||datos_paciente.apellidos_pa AS APELLIDOS_NOMBRES,\n" +
                        "	   datos_paciente.cel_pa AS CELULAR,\n" +
                        "       obtener_edad(datos_paciente.fecha_nacimiento_pa,n_orden_ocupacional.fecha_apertura_po) AS EDAD,\n" +
                        "	   (CASE WHEN n_orden_ocupacional.razon_empresa='ADECCO PERÚ S.A.' THEN 'AP'\n" +
                        "	   WHEN n_orden_ocupacional.razon_empresa='ADECCO CONSULTING S.A.' THEN 'AC'\n" +
                        "	   END\n" +
                        "	   ) AS DESTINO,\n" +
                        "       \n" +
                        "                        n_orden_ocupacional.razon_contrata AS EMPRESA1,\n" +
                        "						n_orden_ocupacional.cargo_de AS PUESTO_CARGO,\n" +
                        "						n_orden_ocupacional.nom_examen AS TIPO_EXAMEN,\n" +
                        "						(CASE WHEN a16.apto_si='TRUE' THEN 'APTO'\n" +
                        "						 WHEN a16.apto_no='TRUE' THEN 'NO APTO'\n" +
                        "						  WHEN a16.apto_re='TRUE' THEN 'APTO CON RESTRICCION'\n" +
                        "						 ELSE 'N/A'\n" +
                        "						end) AS APTITUD,\n" +
                        "						(case  when a16.n_orden is null then 'N/A'\n" +
                        "						ELSE a16.txtrestricciones END\n" +
                        "						)AS DETALLE_RESTRICCION,\n" +
                        "                        (CASE \n" +
                        "                        WHEN a16.txtobservacionesfm is null THEN 'N/A'\n" +
                        "                        ELSE a16.txtobservacionesfm\n" +
                        "                        END) AS DETALLE_OBSERVACIONES,\n" +
                        "						(CASE WHEN  n_orden_ocupacional.nom_examen='COVID-19' THEN 	reactivoono(n_orden_ocupacional.n_orden)\n" +
                        "						ELSE 'N/A' END\n" +
                        "						) PRUEBA_RAPIDA,\n" +
                        "						(CASE WHEN  n_orden_ocupacional.nom_examen='PRUEBA CUALITATIVA ANTIGENOS' THEN 	reactivoono(n_orden_ocupacional.n_orden)\n" +
                        "						WHEN  n_orden_ocupacional.nom_examen='PRUEBA CUANTITATIVA ANTIGENOS' THEN 	reactivoono(n_orden_ocupacional.n_orden)\n" +
                        "						\n" +
                        "						 ELSE 'N/A' END\n" +
                        "						) PRUEBA_ANTIGENOS,\n" +
                        "						(CASE WHEN  pm.n_orden IS NULL THEN 'N/A'\n" +
                        "						\n" +
                        "						 ELSE pm.resultado END\n" +
                        "						) PRUEBA_MOLECULARES,n_orden_ocupacional.fecha_apertura_po  as FECHA_VENCIMIENTO\n" +
                        "						\n" +
                        "                        FROM n_orden_ocupacional\n" +
                        "                        LEFT JOIN datos_paciente ON n_orden_ocupacional.cod_pa = datos_paciente.cod_pa \n" +
                        "                        LEFT JOIN sede ON n_orden_ocupacional.cod_sede = sede.cod_sede\n" +
                        "                        LEFT JOIN constancia_salud_marsa ON n_orden_ocupacional.n_orden = constancia_salud_marsa.n_orden\n" +
                        "                        LEFT JOIN constancia_salud_marsa1 ON n_orden_ocupacional.n_orden = constancia_salud_marsa1.n_orden\n" +
                        "				\n" +
                        "						LEFT JOIN triaje ON n_orden_ocupacional.n_orden = triaje.n_orden\n" +
                        "                        LEFT JOIN examen_inmunologico ON n_orden_ocupacional.n_orden = examen_inmunologico.n_orden\n" +
                        "                    LEFT JOIN anexo_agroindustrial as a16 on n_orden_ocupacional.n_orden=a16.n_orden\n" +
                        "					LEFT JOIN prueba_moleculares AS pm on n_orden_ocupacional.n_orden=pm.n_orden "+
                        "					WHERE\n" +
                        "					n_orden_ocupacional.razon_empresa like '%ADECCO%' \n" ;
                if(cboContratas.getSelectedItem().toString().length()>2)
                    contrata=cboContratas.getSelectedItem().toString();
                else
                    contrata="";
                if(cboEmpresas.getSelectedItem().toString().length()>2)
                    empresa=cboEmpresas.getSelectedItem().toString();
                else
                    empresa="";
                //  if(cboContratas.getSelectedIndex()>=1){
                vSql +="AND UPPER(n_orden_ocupacional.razon_contrata) like UPPER('%"+contrata+"%') ";
                
                vSql += " AND UPPER(n_orden_ocupacional.razon_empresa) like UPPER('%"+empresa+"%')";
                
                
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 )
                {
                    
                    //  if (((JTextField)cboEmpresas.getText().trim().length()> 2 )
                    
                    //  if(cboEmpresas.getItemCount()==0 && cboContratas.getItemCount()==0 ){
                    //       vSql +=" WHERE n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                    //  }else{
                    vSql +=" AND n_orden_ocupacional.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                    //  }
                    
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 )
                {
                    vSql +=" AND n_orden_ocupacional.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                
                
                vSql+=" " +agregarConsulta1;
                System.out.println("consulta:"+vSql);
                //oFunc.SubSistemaMensajeInformacion(vSql);      
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];

                            for (int i = 0; i < CantidaColumnas; i++) {

                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        tbReporte.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex) 
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
   
    
    private void cAntigenos(){
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
              
                String vSql="SELECT n_orden_ocupacional.n_orden AS EXAM_COD_ATENCION,\n" +
" LPAD(n_orden_ocupacional.cod_pa::text, 8, '0')AS DNI,\n" +
" datos_paciente.nombres_pa ||' '||datos_paciente.apellidos_pa AS PACIENTE,\n" +
" datos_paciente.fecha_nacimiento_pa AS FECHANACIMIENTO,\n" +
" obtener_edad(datos_paciente.fecha_nacimiento_pa,n_orden_ocupacional.fecha_apertura_po) AS EDAD,\n" +
" datos_paciente.direccion_pa as DIRECCIÓN,datos_paciente.cel_pa as CELULAR,n_orden_ocupacional.cargo_de AS CARGO,\n" +
" n_orden_ocupacional.razon_empresa AS EMPRESA,\n" +
"n_orden_ocupacional.razon_contrata AS CONTRATA,\n" +
"n_orden_ocupacional.fecha_apertura_po AS FECHA_REGISTRO,\n" +
"						 n_orden_ocupacional.nom_examen AS  NOMBRE_EXAMEN\n" +
",\n" +
"                        (CASE\n" +
"    WHEN UPPER(n_orden_ocupacional.nom_examen)='COVID-19' and constancia_salud_marsa.chk_asintomatico = true THEN 'ASINTOMATICO'\n" +
"        WHEN UPPER(n_orden_ocupacional.nom_examen)='COVID-19' and constancia_salud_marsa.chk_sintomatico = true THEN 'SINTOMATICO'\n" +
"       WHEN UPPER(n_orden_ocupacional.nom_examen)='PRUEBA CUALITATIVA ANTIGENOS' and constancia_salud_marsa1.chk_sintomatico = true THEN 'SINTOMATICO'\n" +
"       WHEN UPPER(n_orden_ocupacional.nom_examen)='PRUEBA CUALITATIVA ANTIGENOS' and constancia_salud_marsa1.chk_asintomatico = true THEN 'ASINTOMATICO'\n" +
"       WHEN UPPER(n_orden_ocupacional.nom_examen)='PRUEBA CUANTITATIVA ANTIGENOS' and constancia_salud_marsa1.chk_sintomatico = true THEN 'SINTOMATICO'\n" +
"       WHEN UPPER(n_orden_ocupacional.nom_examen)='PRUEBA CUANTITATIVA ANTIGENOS' and constancia_salud_marsa1.chk_asintomatico = true THEN 'ASINTOMATICO'\n" +
"						 END) AS SINTOMATOLOGIA,        \n" +
"                        triaje.sat_02 AS SPO2,\n" +
"                        examen_inmunologico.cbomarca AS MARCATEST,\n" +
"						n_orden_ocupacional.txtobserv1 AS OBSERV1 ,n_orden_ocupacional.txtobserv2 AS OBSERV2,\n" +
"						                         n_orden_ocupacional.tipoprueba AS NUMERO_PRUEBA,\n" +
"                    	reactivoono(n_orden_ocupacional.n_orden) as RESULTADO_PRUEBA_COVID,\n" +
"						n_orden_ocupacional.tipo_pago AS TIPOPAGO ,n_orden_ocupacional.precio_po::numeric AS PRECIO_INGRESADO,\n" +
"						sppreciomarsa(n_orden_ocupacional.n_orden) as Precio_Marsa,sede.nombre_sede AS ESTABLECIMIENTO "
                        
                        +
                        "                        FROM n_orden_ocupacional\n" +
                        "                        LEFT JOIN datos_paciente ON n_orden_ocupacional.cod_pa = datos_paciente.cod_pa \n" +
                        "                        LEFT JOIN sede ON n_orden_ocupacional.cod_sede = sede.cod_sede\n" +
                        "                        LEFT JOIN constancia_salud_marsa ON n_orden_ocupacional.n_orden = constancia_salud_marsa.n_orden\n" +
                        "                        LEFT JOIN constancia_salud_marsa1 ON n_orden_ocupacional.n_orden = constancia_salud_marsa1.n_orden\n" +
                        "					    LEFT JOIN fmedica_covid_marsa ON n_orden_ocupacional.n_orden = fmedica_covid_marsa.n_orden\n" +
                        "                        LEFT JOIN fmedica_covid_marsa1 ON n_orden_ocupacional.n_orden = fmedica_covid_marsa1.n_orden\n" +
                        "\n" +
                        "						LEFT JOIN triaje ON n_orden_ocupacional.n_orden = triaje.n_orden\n" +
                        "                        LEFT JOIN examen_inmunologico ON n_orden_ocupacional.n_orden = examen_inmunologico.n_orden\n ";
                if(cboContratas.getSelectedItem().toString().length()>2)
                    contrata=cboContratas.getSelectedItem().toString();
                else
                    contrata="";
                if(cboEmpresas.getSelectedItem().toString().length()>2)
                    empresa=cboEmpresas.getSelectedItem().toString();
                else
                    empresa="";
              //  vSql +="  WHERE UPPER(n_orden_ocupacional.nom_examen) like '%ANTIGENOS%'  AND  ";
                vSql +="  WHERE UPPER(n_orden_ocupacional.razon_contrata) like UPPER('%"+contrata+"%') ";
                
                vSql += " AND UPPER(n_orden_ocupacional.razon_empresa) like UPPER('%"+empresa+"%')";
                
                
                
                vSql+=" AND\n" +
                        "        ((n_orden_ocupacional.fecha_apertura_po BETWEEN '"+Fdesde.getDate().toString()+"' AND '"+Fhasta.getDate().toString()+"')\n" +
                        "	or (n_orden_ocupacional.fecha_apertura_po BETWEEN '"+Fdesde.getDate().toString()+"' AND '"+Fhasta.getDate().toString()+"')\n" +
                        "						 )  ";
                
                
                
                
                vSql+=" " +agregarConsulta1 +"  order by NUMERO_PRUEBA,RESULTADO_PRUEBA_COVID ";
                System.out.println("consulta:"+vSql);
                //oFunc.SubSistemaMensajeInformacion(vSql);      
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];
                            
                            for (int i = 0; i < CantidaColumnas; i++) {
                                
                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        tbReporte.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
    
    private void cPersonalizada1(){
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                
                String vSql="select \n" +
                        "n.fecha_apertura_po as fecha, dp.cod_pa, CONCAT(dp.apellidos_pa,' ',dp.nombres_pa) as ApellidosNombres,\n" +
                        "dp.ocupacion_pa as Puesto, splistadoNombres(n.n_orden) as TipoEvaluacion,n.protocolo,n.n_orden NroContrato,\n" +
                        "n.razon_contrata as Cliente,\n" +
                        "( CASE WHEN n.razon_empresa='ADECCO PERÚ S.A.' THEN 'AP'\n" +
                        "		WHEN n.razon_empresa='ADECCO CONSULTING S.A.' THEN 'AC'\n" +
                        "        ELSE n.razon_empresa END\n" +
                        ") TIPO\n" +
                        ", spsumaSERVICIOS(n.n_orden) as Importe\n" +
                        "from historialclienteprotocolo as hcp inner join n_orden_ocupacional as n on hcp.n_orden=n.n_orden\n" +
                        "left join \n" +
                        "datos_paciente as dp on n.cod_pa=dp.cod_pa ";
                if(cboContratas.getSelectedItem().toString().length()>2)
                    contrata=cboContratas.getSelectedItem().toString();
                else
                    contrata="";
                if(cboEmpresas.getSelectedItem().toString().length()>2)
                    empresa=cboEmpresas.getSelectedItem().toString();
                else
                    empresa="";
                
                vSql +=" WHERE upper(n.razon_contrata) like upper('%"+contrata+"%') ";
                
                vSql += " AND upper(n.razon_empresa) like upper('%"+empresa+"%')";
                
                
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 )
                {
                    
                    //  if (((JTextField)cboEmpresas.getText().trim().length()> 2 )
                    
                    //  if(cboEmpresas.getItemCount()==0 && cboContratas.getItemCount()==0 ){
                    //       vSql +=" WHERE n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                    //  }else{
                    vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                    //  }
                    
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 )
                {
                    vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                
                
                vSql+=" " +agregarConsulta;
                
                vSql+="   group by fecha,dp.cod_pa,ApellidosNombres,Puesto,TipoEvaluacion,n.protocolo,NroContrato,\n" +
                        " Cliente,razon_empresa,Importe,TIPO";
                System.out.println("consulta:"+vSql);
                //oFunc.SubSistemaMensajeInformacion(vSql);      
                if (oConn.FnBoolQueryExecute(vSql))
                {
                    try  {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next())
                        {
                            Object [] Fila = new Object[CantidaColumnas];
                            
                            for (int i = 0; i < CantidaColumnas; i++) {
                                
                                Fila[i] = oConn.setResult.getObject(i+1);
                            }
                            model.addRow(Fila);
                        }
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        tbReporte.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTipoReporte = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        btnExportarExel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContrata = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fhasta = new com.toedter.calendar.JDateChooser();
        Fdesde = new com.toedter.calendar.JDateChooser();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        chkContratista = new javax.swing.JCheckBox();
        chkEmpresa = new javax.swing.JCheckBox();
        cboContratas = new javax.swing.JComboBox();
        cboEmpresas = new javax.swing.JComboBox();
        pgExportar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        chkOservicio = new javax.swing.JCheckBox();
        chkPersonalizada = new javax.swing.JCheckBox();
        txtOrdenServicio = new javax.swing.JTextField();
        lblNservicio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        chk9 = new javax.swing.JCheckBox();
        chk10 = new javax.swing.JCheckBox();
        chk11 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk13 = new javax.swing.JCheckBox();
        chk14 = new javax.swing.JCheckBox();
        chk15 = new javax.swing.JCheckBox();
        chk16 = new javax.swing.JCheckBox();
        chk17 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtRuc = new javax.swing.JTextField();
        chkRepTestAltura = new javax.swing.JCheckBox();
        chkRepPsicosen = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        btnRepDiario = new javax.swing.JButton();
        btnRepSemanal = new javax.swing.JButton();
        chkRepVisualCompl = new javax.swing.JCheckBox();
        chkRepTrabCal = new javax.swing.JCheckBox();
        chkRepCovid1 = new javax.swing.JCheckBox();
        chkRepCovid2 = new javax.swing.JCheckBox();
        chkRepManipAlimen = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jCheckBoxIngres0 = new javax.swing.JCheckBox();
        jCheckBoxAlta = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMostrar1 = new javax.swing.JButton();
        jCheckBoxAntigeno = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Reporte para control Interno e Impresion detallada");
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

        tbReporte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbReporte);

        jTabbedPane1.addTab("Reporte", jScrollPane1);

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personalizada"));

        jLabel2.setText("Contratista :");

        jLabel3.setText("Empresa  :");

        txtContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrataActionPerformed(evt);
            }
        });

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        jLabel4.setText("Desde :");

        jLabel5.setText("Hasta :");

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        chkContratista.setSelected(true);
        chkContratista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkContratistaActionPerformed(evt);
            }
        });

        chkEmpresa.setSelected(true);
        chkEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmpresaActionPerformed(evt);
            }
        });

        cboContratas.setEditable(true);
        cboContratas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cboContratas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboContratasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboContratas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboContratasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboContratasMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboContratasMousePressed(evt);
            }
        });
        cboContratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContratasActionPerformed(evt);
            }
        });
        cboContratas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboContratasKeyPressed(evt);
            }
        });

        cboEmpresas.setEditable(true);
        cboEmpresas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cboEmpresas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboEmpresasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEmpresasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboEmpresasMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboEmpresasMousePressed(evt);
            }
        });
        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        cboEmpresas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboEmpresasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkContratista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContrata)
                    .addComponent(txtEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fhasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnMostrar)
                    .addComponent(chkContratista)
                    .addComponent(cboContratas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Fhasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnLimpiar)
                            .addComponent(chkEmpresa))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Busqueda"));

        btTipoReporte.add(chkOservicio);
        chkOservicio.setSelected(true);
        chkOservicio.setText("Orden servicio");
        chkOservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOservicioActionPerformed(evt);
            }
        });

        btTipoReporte.add(chkPersonalizada);
        chkPersonalizada.setText("Personalizada");
        chkPersonalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPersonalizadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkOservicio)
                .addGap(18, 18, 18)
                .addComponent(chkPersonalizada)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkOservicio)
                    .addComponent(chkPersonalizada))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        txtOrdenServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenServicioActionPerformed(evt);
            }
        });

        lblNservicio.setText("# Servicio :");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Columnas"));

        chk1.setText("T. Examen");

        chk2.setText("DNI");

        chk3.setText("Nombres");

        chk4.setText("Cargo");

        chk5.setText("Fecha");

        chk6.setText("Tipo Pago");

        chk7.setText("Contrata");

        chk8.setText("Empresa");

        chk9.setText("Fist-Test");

        chk10.setText("Psicosen");

        chk11.setText("Test-Altura");

        chk12.setText("EKG");

        chk13.setText("Visual-Compl");

        chk14.setText("Trab-Calientes");

        chk15.setText("Covid1");

        chk16.setText("Covid2");

        chk17.setText("Manip-Alimentos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chk1)
                        .addGap(2, 2, 2)
                        .addComponent(chk9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk10))
                    .addComponent(chk14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chk13)
                        .addGap(18, 18, 18)
                        .addComponent(chk15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chk11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk8)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chk3)
                    .addComponent(chk2)
                    .addComponent(chk1)
                    .addComponent(chk4)
                    .addComponent(chk5)
                    .addComponent(chk6)
                    .addComponent(chk7)
                    .addComponent(chk8)
                    .addComponent(chk9)
                    .addComponent(chk10)
                    .addComponent(chk11)
                    .addComponent(chk12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk13)
                    .addComponent(chk14)
                    .addComponent(chk15)
                    .addComponent(chk16)
                    .addComponent(chk17)))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        jButton2.setText("Vista detallada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton3.setText("Nuevo reporte");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        chkRepTestAltura.setText("TEST DE ALTURA ");

        chkRepPsicosen.setText("PSICOSENSOMETRICO");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte Obrainsa"));

        btnRepDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnRepDiario.setText("R.Diario");
        btnRepDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepDiarioActionPerformed(evt);
            }
        });

        btnRepSemanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnRepSemanal.setText("R.Semanal");
        btnRepSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepSemanalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRepDiario)
                    .addComponent(btnRepSemanal))
                .addGap(2, 2, 2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnRepDiario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRepSemanal)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        chkRepVisualCompl.setText("VISUAL-COMPLEMENTARIO");

        chkRepTrabCal.setText("TRAB-EN-CALIENTE");
        chkRepTrabCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRepTrabCalActionPerformed(evt);
            }
        });

        chkRepCovid1.setText("COVID-19-1");
        chkRepCovid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRepCovid1ActionPerformed(evt);
            }
        });

        chkRepCovid2.setText("COVID-19-2");
        chkRepCovid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRepCovid2ActionPerformed(evt);
            }
        });

        chkRepManipAlimen.setText("MANIP-ALIMEN");
        chkRepManipAlimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRepManipAlimenActionPerformed(evt);
            }
        });

        jButton1.setText("R.Covid-marza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("REPORTE COVID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Solo mi sede");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));
        jPanel5.setForeground(new java.awt.Color(0, 153, 153));

        jButton5.setText("C. ALTA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBoxIngres0.setText("F. INGRESO");
        jCheckBoxIngres0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxIngres0ActionPerformed(evt);
            }
        });

        jCheckBoxAlta.setText("F. ALTA");
        jCheckBoxAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton5)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxAlta)
                            .addComponent(jCheckBoxIngres0))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton5)
                .addGap(12, 12, 12)
                .addComponent(jCheckBoxIngres0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAlta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(102, 0, 0));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));

        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("SEDE:");

        btnMostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar1.setText("PROTOCOLO");
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });

        jCheckBoxAntigeno.setText("ANTIG MARSA");

        jCheckBox2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(102, 0, 0));
        jCheckBox2.setText("ADECCO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(chkRepTestAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkRepPsicosen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkRepVisualCompl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkRepTrabCal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkRepCovid1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkRepCovid2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkRepManipAlimen))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(lblNservicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(225, 225, 225)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnMostrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBoxAntigeno)
                                                    .addComponent(jCheckBox1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton4))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgExportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportarExel)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtOrdenServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNservicio))
                                    .addComponent(txtRuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxAntigeno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrar1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkRepTestAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRepPsicosen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRepVisualCompl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRepTrabCal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRepCovid1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRepCovid2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRepManipAlimen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExportarExel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addGap(2, 2, 2)
                        .addComponent(pgExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPersonalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPersonalizadaActionPerformed
       personalizado(true);
      servicio(false);
      txtOrdenServicio.setText(null);
      txtContrata.requestFocus();
    }//GEN-LAST:event_chkPersonalizadaActionPerformed

    private void chkOservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOservicioActionPerformed
      personalizado(false);
      servicio(true);
      LimpiarPersonalizado();
    }//GEN-LAST:event_chkOservicioActionPerformed

    private void txtContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrataActionPerformed
        txtEmpresa.requestFocus();
    }//GEN-LAST:event_txtContrataActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        txtContrata.requestFocus();
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarPersonalizado();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
             txtOrdenServicio.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       if(!txtOrdenServicio.getText().isEmpty()){
           cOrdenServicio();
       }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed
//        if(this.tbReporte.getRowCount()==0){
//            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//        JFileChooser chooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de exel", "xls");
//        chooser.setFileFilter(filter);
//        chooser.setDialogTitle("Guardar archivo");
//        chooser.setMultiSelectionEnabled(false);
//        chooser.setAcceptAllFileFilterUsed(false);
//        if(chooser.showSaveDialog(null)== JFileChooser.APPROVE_OPTION){
//            List<JTable> tb = new ArrayList<>();
//            List<String> nom = new ArrayList<>();
//        tb.add(tbReporte);
//        nom.add("socios");
//        String file=chooser.getSelectedFile().toString().concat(".xls");
//        try{
//            ExportarExel e = new ExportarExel(new File(file), tb, nom);
//            if(e.export()){
//                JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel.","Reportes",JOptionPane.INFORMATION_MESSAGE);
//            }
//        }catch (Exception ex){
//            JOptionPane.showMessageDialog(null, "Hubo un error"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
//        
//        }
//        
//        }
        if(this.tbReporte.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(tbReporte);
    }//GEN-LAST:event_btnExportarExelActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       if(jCheckBox2.isSelected())
        cPersonalizadaadecco();
        else{
        if(jCheckBoxAntigeno.isSelected())
        cAntigenos();
    else
        cPersonalizada();
                
                }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void chkContratistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkContratistaActionPerformed
        if(chkContratista.isSelected()== false){txtContrata.setText(null); txtContrata.setEditable(false);
        }else{txtContrata.setEditable(true);}
    }//GEN-LAST:event_chkContratistaActionPerformed

    private void chkEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEmpresaActionPerformed
        if(chkEmpresa.isSelected()== false){txtEmpresa.setText(null); txtEmpresa.setEditable(false);
        }else{txtEmpresa.setEditable(true);}
    }//GEN-LAST:event_chkEmpresaActionPerformed

    private void txtOrdenServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenServicioActionPerformed
         if(!txtOrdenServicio.getText().isEmpty()){
           cOrdenServicio();
       }
    }//GEN-LAST:event_txtOrdenServicioActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        ReporteFechas(Fdesde.getDate(), Fhasta.getDate());
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRepDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepDiarioActionPerformed
       
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="select n.n_orden, CASE  WHEN n.n_orden is not null THEN 'HORIZONTE MEDIC' END CLINICA,\n" +
                        "       n.fecha_apertura_po as FECHA,d.cod_pa as DNI,obtener_edad(d.fecha_nacimiento_pa,n.fecha_apertura_po) as EDAD,\n" +
                        "       d.apellidos_pa||', '||nombres_pa AS NOMBRES,n.cargo_de as ocupacion,\n" +
                        "       n.razon_empresa AS EMPRESA,n.razon_contrata AS contrata,CASE  WHEN n.razon_empresa is not null THEN 'SAUSACOCHA' END SEDE,\n" +
                        "       n.nom_examen as TIPO,\n" +
                        "       CASE  WHEN o.n_orden is not null THEN 'Observado'\n" +
                        "                   WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  \n" +
                        "                   WHEN ac.no_apto = 'TRUE' THEN 'No Apto' \n" +
                        "                   WHEN a.no_apto = 'TRUE' THEN 'No Apto'\n" +
                        "                   WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto'\n" +
                        "                   WHEN cma.p_no1 = 'TRUE' THEN 'No Apto'\n" +
                        "		    WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                        "                   WHEN ba.chk_observado = 'TRUE' THEN 'Observado' END as RESULTADO,\n" +
                        "        CASE WHEN i.aprobo_inf = 'TRUE' THEN 'APTO'\n" +
                        "             WHEN i.desaprobo_inf = 'TRUE' THEN 'NO APTO' END AS PSICOLOGICO,\n" +
                        "                   m.txtobservacionesfm as DIAGNOSTICO\n" +
                        "        From datos_paciente as d\n" +
                        "        inner join n_orden_ocupacional  as n ON (d.cod_pa = n.cod_pa)\n" +
                        "        left join anexo7c as m ON (m.n_orden=n.n_orden)\n" +
                        "        left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden)\n" +
                        "        left join anexo7d as a ON (a.n_orden=n.n_orden)\n" +
                        "        left join anexoc as ac ON (ac.n_orden=n.n_orden)\n" +
                        "        left join observaciones as o ON (o.n_orden=n.n_orden)\n" +
                        "        left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)\n" +
                        "        left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)   \n" +
                        "        left join certificacion_medica_altura as cma ON (cma.n_orden=n.n_orden) \n" +
                        "        left join informe_psicologico as i ON (i.n_orden=n.n_orden) \n"
                        + "WHERE n.razon_empresa='"+cboEmpresas.getSelectedItem().toString()+"' "
                        + "and n.razon_contrata='"+cboContratas.getSelectedItem().toString()+"' ";
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                vSql+="order by n_orden asc";                     //oFunc.SubSistemaMensajeInformacion(vSql);
                if (oConn.FnBoolQueryExecute(vSql)) {
                    try {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next()) {
                            Object[] Fila = new Object[CantidaColumnas];
                            for (int i = 0; i < CantidaColumnas; i++) {
                                Fila[i] = oConn.setResult.getObject(i + 1);
                            }
                            model.addRow(Fila);
                        }
                        
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        
                        tbReporte.setModel(model);
                        
                        oConn.setResult.close();
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_btnRepDiarioActionPerformed

    private void btnRepSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepSemanalActionPerformed
            try {
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="select n.n_orden,CASE  WHEN n.n_orden is not null THEN 'HORIZONTE MEDIC' END ESTABLECIMIENTO,\n" +
                        "     CASE  WHEN n.razon_empresa is not null THEN 'SAUSACOCHA' END UNIDAD,\n" +
                        "     n.razon_empresa AS EMPRESA,n.razon_contrata AS contrata,d.cod_pa as DNI,"
                        + "obtener_edad(d.fecha_nacimiento_pa,n.fecha_apertura_po) as EDAD,d.apellidos_pa||', '||nombres_pa AS NOMBRES,\n" +
                        "       n.cargo_de as ocupacion,n.fecha_apertura_po as \"FECHA DE EVALUACION\",n.nom_examen as TIPO,\n" +
                        "             CASE  WHEN o.n_orden is not null THEN 'Observado'\n" +
                        "                   WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        "                   WHEN cma.p_si1 = 'TRUE' THEN 'Apto'\n" +
                        "                   WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  \n" +
                        "                   WHEN ac.no_apto = 'TRUE' THEN 'No Apto' \n" +
                        "                   WHEN a.no_apto = 'TRUE' THEN 'No Apto'\n" +
                        "                   WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto'\n" +
                        "                   WHEN cma.p_no1 = 'TRUE' THEN 'No Apto'\n" +
                        "		   WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                        "                   WHEN ba.chk_observado = 'TRUE' THEN 'Observado' END as \"RESULTADO DE EVALUACION\",\n" +
                        "	CASE  WHEN n.n_orden is not null THEN '' END CIE,\n" +
                        "                   m.txtobservacionesfm as DIAGNOSTICO,ca.atxtrestricciones as OBSERVACION\n" +
                        "            From datos_paciente as d\n" +
                        "            inner join n_orden_ocupacional  as n ON (d.cod_pa = n.cod_pa)\n" +
                        "            left join anexo7c as m ON (m.n_orden=n.n_orden)\n" +
                        "            left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden)\n" +
                        "            left join anexo7d as a ON (a.n_orden=n.n_orden)\n" +
                        "            left join anexoc as ac ON (ac.n_orden=n.n_orden)\n" +
                        "            left join observaciones as o ON (o.n_orden=n.n_orden)\n" +
                        "            left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)\n" +
                        "            left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)   \n" +
                        "            left join certificacion_medica_altura as cma ON (cma.n_orden=n.n_orden) \n"
                        + "WHERE n.razon_empresa='"+cboEmpresas.getSelectedItem().toString()+"' "
                        + "and n.razon_contrata='"+cboContratas.getSelectedItem().toString()+"'";
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                vSql+="order by n_orden asc";
                //oFunc.SubSistemaMensajeInformacion(vSql);
                if (oConn.FnBoolQueryExecute(vSql)) {
                    try {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next()) {
                            Object[] Fila = new Object[CantidaColumnas];
                            for (int i = 0; i < CantidaColumnas; i++) {
                                Fila[i] = oConn.setResult.getObject(i + 1);
                            }
                            model.addRow(Fila);
                        }
                        
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        
                        tbReporte.setModel(model);
                        
                        oConn.setResult.close();
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_btnRepSemanalActionPerformed

    private void chkRepTrabCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRepTrabCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRepTrabCalActionPerformed

    private void chkRepCovid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRepCovid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRepCovid1ActionPerformed

    private void chkRepCovid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRepCovid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRepCovid2ActionPerformed

    private void chkRepManipAlimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRepManipAlimenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRepManipAlimenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
                // TODO add your handling code here:
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="SELECT n.n_orden,fecha_apertura_po, d.apellidos_pa, d.nombres_pa,d.cod_pa, n.cargo_de,n.razon_empresa, n.razon_contrata,n.nom_examen,  \n" +
                        "CASE WHEN n.tipoprueba = 'P1' THEN 'Prueba 1' \n" +
                        "     WHEN n.tipoprueba = 'P2' THEN 'Prueba 2' \n" +
                        "     WHEN n.tipoprueba = 'P3' THEN 'Prueba 3' \n" +
                        "     WHEN n.tipoprueba = 'PA' THEN 'PA' \n" +
                        "     WHEN n.tipoprueba = 'PCON' THEN 'PCON' \n" +
                        "     WHEN n.tipoprueba = 'AE' THEN 'ALTA EPIDEMIALOGICA' \n" +
                        "     WHEN n.tipoprueba = 'PC' THEN 'Prueba C' ELSE 'N/A'  END AS NUMEXACOVID, \n" +
                        "CASE WHEN l.chkigm_reactivo = 'TRUE' THEN 'POSITIVO' \n" +
                        "     WHEN l.chkigm_noreactivo = 'TRUE' THEN 'NEGATIVO'  END AS IGM, \n" +
                        "CASE WHEN l.chkigg_reactivo = 'TRUE' THEN 'POSITIVO' \n" +
                        "     WHEN l.chkigg_noreactivo = 'TRUE' THEN 'NEGATIVO'  END AS IGG,\n" +
                        "	 \n" +
                        "	 concat('IGM: ',(CASE WHEN l.chkigm_reactivo = 'TRUE' THEN 'POSITIVO' \n" +
                        "     WHEN l.chkigm_noreactivo = 'TRUE' THEN 'NEGATIVO' END ),\n" +
                        "			'-IGG: ',(CASE WHEN l.chkigg_reactivo = 'TRUE' THEN 'POSITIVO' \n" +
                        "     WHEN l.chkigg_noreactivo = 'TRUE' THEN 'NEGATIVO' END),\n" +
                        "		 (case when cs.chk_asintomatico=true then' ASINTOMATICO' end),\n" +
                        "		(case when cs.chk_sintomatico=true THEN '- SINTOMATICO, Con sintomas como: ' END ),\n" +
                        "			(case when cs.chks1=true THEN 'TOS,' END ),\n" +
                        "			(case when cs.chks2=true THEN 'DOLOR DE GARGANTA,' END ),\n" +
                        "			(case when cs.chks3=true THEN 'CONGESTION NASAL,' END ),\n" +
                        "			(case when cs.chks4=true THEN 'DIFICULTAD RESPIRATORIA,' END ),\n" +
                        "			(case when cs.chks5=true THEN 'FIEBRE/ESCALOFRIO,' END ),\n" +
                        "			(case when cs.chks6=true THEN 'MALESTAR GENERAL,' END ),\n" +
                        "			(case when cs.chks7=true THEN 'DIARREA,' END ),\n" +
                        "			(case when cs.chks8=true THEN 'NAUSEAS / VOMITOS,' END ),\n" +
                        "			(case when cs.chks9=true THEN 'CEFALEA,' END ),\n" +
                        "			(case when cs.chks10=true THEN 'IRRITABILIDAD/CONFUSION,' END ),\n" +
                        "			(case when cs.chks11=true THEN 'DOLOR,' END ),\n" +
                        "			(case when cs.chks12=true THEN 'EXPECTORACION,' END ),\n" +
                        "			(case when cs.chks13=true THEN 'PERDIDA DE OLFATO Y GUSTO,' END ),\n" +
                        "			',',\n" +
                        "			(case when c.txtobservaciones is not null THEN c.txtobservaciones END )) as observaciones\n" +
                        ", (case when n.cod_sede=1 then 'TRUJILLO' "
                        + " WHEN n.cod_sede=2 then 'Huamachuco' "
                        + " WHEN n.cod_sede=4 then 'Trujillo-Pierola' "
                        + " WHEN n.cod_sede=3 then 'Huancayo' "
                        + " end ) as SEDE , n.nom_examen "+
                        
                        "FROM datos_paciente as d \n" +
                        "INNER JOIN n_orden_ocupacional AS n ON (n.cod_pa = d.cod_pa) \n" +
                        "LEFT JOIN examen_inmunologico AS l ON (n.n_orden=l.n_orden) \n" +
                        "LEFT JOIN const_tamizaje_covid19_marza AS c ON (n.n_orden=c.n_orden)\n" +
                        "left join constancia_salud_marsa as cs on (n.n_orden=cs.n_orden) ";
                if(cboContratas.getSelectedItem().toString().length()>2)
                    contrata=cboContratas.getSelectedItem().toString();
                else
                    contrata="";
                if(cboEmpresas.getSelectedItem().toString().length()>2)
                    empresa=cboEmpresas.getSelectedItem().toString();
                else
                    empresa="";
                vSql +="WHERE upper(n.razon_contrata) like upper('%"+contrata+"%') ";
                vSql += " AND upper(n.razon_empresa) like upper('%"+empresa+"%')";
                
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                
                vSql+="  "+agregarConsulta+" order by n.n_orden asc";                     //oFunc.SubSistemaMensajeInformacion(vSql);
                System.out.println("la consulta aplicada es:"+vSql);
                if (oConn.FnBoolQueryExecute(vSql)) {
                    try {
                        java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                        int CantidaColumnas = rsmt.getColumnCount();
                        for (int i = 1; i <= CantidaColumnas; i++) {
                            model.addColumn(rsmt.getColumnLabel(i));
                        }
                        while (oConn.setResult.next()) {
                            Object[] Fila = new Object[CantidaColumnas];
                            for (int i = 0; i < CantidaColumnas; i++) {
                                Fila[i] = oConn.setResult.getObject(i + 1);
                            }
                            model.addRow(Fila);
                        }
                        
                        tbReporte = autoResizeColWidth(tbReporte, model);
                        
                        tbReporte.setModel(model);
                        
                        oConn.setResult.close();
                    } catch (SQLException ex) {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            try {
                // TODO add your handling code here:
                model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
                String vSql="SELECT n.n_orden,n.nom_examen,CASE WHEN  n.tipoprueba = 'P1' THEN 'Prueba 1' \n" +
                        "     WHEN n.tipoprueba = 'P2' THEN 'Prueba 2'\n" +
                        "     WHEN n.tipoprueba = 'PA' THEN 'Prueba de anticuerpos' \n" +
                        "     WHEN n.tipoprueba = 'AE' THEN 'ALTA EPIDEMIALOGICA' \n" +
                        "     WHEN n.tipoprueba = 'P3' THEN 'Prueba 3'\n" +
                        "     WHEN n.tipoprueba = 'PCON' THEN 'PCON'\n" +
                        "             WHEN n.tipoprueba = 'PC' THEN 'Prueba C' ELSE 'N/A' END AS NUMPRUEBA,\n" +
                        "       CASE WHEN n.n_orden is not null THEN 'DNI' ELSE '.' END AS TIPODOC,\n" +
                        "             d.cod_pa,d.apellidos_pa,d.nombres_pa,d.direccion_pa, \n" +
                        "        d.fecha_nacimiento_pa,d.cel_pa, n.razon_empresa,n.razon_contrata,n.cargo_de,\n" +
                        "        CASE WHEN n.n_orden is not null THEN 'POLICLINICO HORIZONTE MEDIC' ELSE '.' END AS UBICACION,\n" +
                        "        n.fecha_apertura_po AS FECHAPRUEBA, \n" +
                        "        CASE WHEN n.n_orden is not null THEN 'PRUEBA RAPIDA' ELSE '.' END AS TIPOPRUEBA,\n" +
                        "        CASE WHEN i.chkigm_reactivo ='TRUE' THEN '+' \n" +
                        "             WHEN i.chkigg_reactivo ='TRUE' THEN '+' \n" +
                        "             WHEN i.chkigm_noreactivo ='TRUE' THEN '-' \n" +
                        "             WHEN i.chkigg_noreactivo ='TRUE' THEN '-' ELSE '.' END AS RESULTADO,\n" +
                        "        CASE WHEN f.apto_si ='TRUE' THEN 'APTO'  \n" +
                        "              WHEN f.apto_no ='TRUE' THEN 'NO APTO' END AS DESCRIPCIONRESULTADO1,\n" +
                        "        CASE WHEN i.chkigm_reactivo ='TRUE' AND i.chkigg_reactivo ='TRUE' THEN 'IGM/IGG'  \n" +
                        "              WHEN i.chkigm_reactivo ='TRUE' THEN 'IGM' \n" +
                        "             WHEN i.chkigg_reactivo ='TRUE' THEN 'IGG'  END AS DESCRIPCIONRESULTADO2,\n" +
                        "        CASE WHEN c.chk_asintomatico ='TRUE' THEN 'ASINTOMÁTICO' \n" +
                        "             WHEN c.chk_sintomatico ='TRUE' THEN 'SINTOMATICO' ELSE '.' END AS SINTOMATOLOGIA,\n" +
                        "       t.sat_02 as saturación,\n" +
                        "       CASE WHEN n.n_orden is not null THEN 'CELLEX Q RAPID TEST' ELSE '.' END AS MARCATEST,\n" +
                        "       CASE WHEN n.n_orden is not null THEN 'INMUNOCROMATOGRAFIA' ELSE '.' END AS TIPOREACTIVO,\n" +
                        "        CASE WHEN i.chkigm_reactivo ='TRUE' THEN 'POSITIVO' \n" +
                        "             WHEN i.chkigm_noreactivo ='TRUE' THEN 'NEGATIVO' ELSE '.' END AS IGM,\n" +
                        "        CASE WHEN i.chkigg_reactivo ='TRUE' THEN 'POSITIVO' \n" +
                        "         WHEN i.chkigg_noreactivo ='TRUE' THEN 'NEGATIVO' ELSE '.' END AS IGG,\n" +
                        
                        "	 concat('IGM: ',(CASE WHEN i.chkigm_reactivo = 'TRUE' THEN 'POSITIVO' \n" +
                        "     WHEN i.chkigm_noreactivo = 'TRUE' THEN 'NEGATIVO' END ),\n" +
                        "			'-IGG: ',(CASE WHEN i.chkigg_reactivo = 'TRUE' THEN 'POSITIVO' \n" +
                        "     WHEN i.chkigg_noreactivo = 'TRUE' THEN 'NEGATIVO' END),\n" +
                        "		 (case when c.chk_asintomatico=true then' ASINTOMATICO' end),\n" +
                        "		(case when c.chk_sintomatico=true THEN '- SINTOMATICO, Con sintomas como: ' END ),\n" +
                        "			(case when c.chks1=true THEN 'TOS,' END ),\n" +
                        "			(case when c.chks2=true THEN 'DOLOR DE GARGANTA,' END ),\n" +
                        "			(case when c.chks3=true THEN 'CONGESTION NASAL,' END ),\n" +
                        "			(case when c.chks4=true THEN 'DIFICULTAD RESPIRATORIA,' END ),\n" +
                        "			(case when c.chks5=true THEN 'FIEBRE/ESCALOFRIO,' END ),\n" +
                        "			(case when c.chks6=true THEN 'MALESTAR GENERAL,' END ),\n" +
                        "			(case when c.chks7=true THEN 'DIARREA,' END ),\n" +
                        "			(case when c.chks8=true THEN 'NAUSEAS / VOMITOS,' END ),\n" +
                        "			(case when c.chks9=true THEN 'CEFALEA,' END ),\n" +
                        "			(case when c.chks10=true THEN 'IRRITABILIDAD/CONFUSION,' END ),\n" +
                        "			(case when c.chks11=true THEN 'DOLOR,' END ),\n" +
                        "			(case when c.chks12=true THEN 'EXPECTORACION,' END ),\n" +
                        "			(case when c.chks13=true THEN 'PERDIDA DE OLFATO Y GUSTO,' END ),\n" +
                        "			',',\n" +
                        "			(case when f.txtdiagnostico is not null THEN f.txtdiagnostico END )) as Diagnostico\n" +
                        ", (case when n.cod_sede=1 then 'TRUJILLO' "
                        + " WHEN n.cod_sede=2 then 'Huamachuco' "
                        + " WHEN n.cod_sede=4 then 'Trujillo-Pierola' "
                        + " WHEN n.cod_sede=3 then 'Huancayo' "
                        + "end ) as SEDE "+
                        "  FROM datos_paciente AS d\n" +
                        " INNER JOIN n_orden_ocupacional as n on(d.cod_pa=n.cod_pa)\n" +
                        " LEFT JOIN examen_inmunologico as i on(n.n_orden=i.n_orden)\n" +
                        " LEFT JOIN constancia_salud_marsa as c on(n.n_orden=c.n_orden)\n" +
                        " LEFT JOIN triaje as t ON(n.n_orden = t.n_orden)\n" +
                        " LEFT JOIN fmedica_covid_marsa as f ON(n.n_orden = f.n_orden)\n  ";
                if(cboContratas.getSelectedItem().toString().length()>2)
                    contrata=cboContratas.getSelectedItem().toString();
                else
                    contrata="";
                if(cboEmpresas.getSelectedItem().toString().length()>2)
                    empresa=cboEmpresas.getSelectedItem().toString();
                else
                    empresa="";
                vSql +=" WHERE upper(n.razon_contrata) like upper('%"+contrata+"%') ";
                vSql += " AND upper(n.razon_empresa) like upper('%"+empresa+"%')";
                if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                }
                if (((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2 ) {
                    vSql +=" AND n.fecha_apertura_po <= '"+Fhasta.getDate().toString()+"'";
                }
                
                //vSql+="and n.nom_examen='COVID-19' order by n.n_orden asc";
                vSql+="AND (n.nom_examen='COVID-19 CUANTITATIVA' or n.nom_examen='COVID-19' "
                        + " or UPPER(n.nom_examen) LIKE '%ANTIGENO%'  or UPPER(n.nom_examen) LIKE '%ANTICUERPO%') "+
                        agregarConsulta+" order by n.n_orden asc";
                System.out.println("la consulta aplicada es:"+vSql);
            //
            //oFunc.SubSistemaMensajeInformacion(vSql);
            if (oConn.FnBoolQueryExecute(vSql)) {
                try {
                    java.sql.ResultSetMetaData rsmt = oConn.setResult.getMetaData();
                    int CantidaColumnas = rsmt.getColumnCount();
                    for (int i = 1; i <= CantidaColumnas; i++) {
                        model.addColumn(rsmt.getColumnLabel(i));
                    }
                    while (oConn.setResult.next()) {
                        Object[] Fila = new Object[CantidaColumnas];
                        for (int i = 0; i < CantidaColumnas; i++) {
                            Fila[i] = oConn.setResult.getObject(i + 1);
                        }
                        model.addRow(Fila);
                    }

                    tbReporte = autoResizeColWidth(tbReporte, model);

                    tbReporte.setModel(model);

                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected())
       {   nomsede=nombre;
           agregarConsulta="";
           agregarConsulta=" and n.cod_sede="+codigosede;
            agregarConsulta1="";
                      agregarConsulta1=" and n_orden_ocupacional.cod_sede="+codigosede;

       } 
       else
       {
           nomsede="Todas las sedes";
           agregarConsulta="";
           agregarConsulta1="";
       }
           
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cboContratasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboContratasPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboContratasPopupMenuWillBecomeInvisible

    private void cboContratasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContratasMouseClicked
      
    }//GEN-LAST:event_cboContratasMouseClicked

    private void cboContratasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContratasMouseEntered
    
    }//GEN-LAST:event_cboContratasMouseEntered

    private void cboContratasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContratasMousePressed
        
    }//GEN-LAST:event_cboContratasMousePressed

    private void cboContratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContratasActionPerformed
     
    }//GEN-LAST:event_cboContratasActionPerformed

    private void cboContratasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboContratasKeyPressed

    }//GEN-LAST:event_cboContratasKeyPressed

    private void cboEmpresasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboEmpresasPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboEmpresasPopupMenuWillBecomeInvisible

    private void cboEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresasMouseClicked
      
    }//GEN-LAST:event_cboEmpresasMouseClicked

    private void cboEmpresasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresasMouseEntered
   
    }//GEN-LAST:event_cboEmpresasMouseEntered

    private void cboEmpresasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEmpresasMousePressed
     
    }//GEN-LAST:event_cboEmpresasMousePressed

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
   
    }//GEN-LAST:event_cboEmpresasActionPerformed

    private void cboEmpresasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEmpresasKeyPressed

    }//GEN-LAST:event_cboEmpresasKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          if(jCheckBoxIngres0.isSelected()==true)
    {jCheckBoxAlta.setSelected(false);
    laconsulta=" where  noo.fecha_apertura_po>= '"+Fdesde.getDate().toString()+"' and noo.fecha_apertura_po<='"
            +Fhasta.getDate().toString()+"' order  by noo.fecha_apertura_po  ";
    tipofecha=" agrupado por fecha de ingreso ";
    }  
          if(jCheckBoxAlta.isSelected()==true)
        {jCheckBoxIngres0.setSelected(false);   
        laconsulta=" where cam.fecha_examen>= '"+Fdesde.getDate().toString()+"' and cam.fecha_examen<='"
            +Fhasta.getDate().toString()+"' order  by cam.fecha_examen ";
            tipofecha=" agrupado por fecha de alta ";
        }  
        if (((JTextField)Fdesde.getDateEditor().getUiComponent()).getText().trim().length()> 2 
                 || ((JTextField)Fhasta.getDateEditor().getUiComponent()).getText().trim().length()> 2)  
           {
                 if(jCheckBoxIngres0.isSelected()==true || jCheckBoxAlta.isSelected()==true)
                     consultaAlta();
                else 
                JOptionPane.showMessageDialog(null, "FALTA MARCAR PORQUE FECHA BUSCAR");
           }
           else 
                JOptionPane.showMessageDialog(null, "DEBE DE INGRESAR LAS FECHA DESDE Y HASTA");
           
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBoxIngres0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxIngres0ActionPerformed
    if(jCheckBoxIngres0.isSelected()==true)
    {jCheckBoxAlta.setSelected(false);
    laconsulta=" where  noo.fecha_apertura_po>= '"+Fdesde.getDate().toString()+"' and noo.fecha_apertura_po<='"
            +Fhasta.getDate().toString()+"' order  by noo.fecha_apertura_po  ";
    tipofecha=" agrupado por fecha de ingreso ";
    }

    }//GEN-LAST:event_jCheckBoxIngres0ActionPerformed

    private void jCheckBoxAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAltaActionPerformed
        if(jCheckBoxAlta.isSelected()==true)
        {jCheckBoxIngres0.setSelected(false);   
        laconsulta=" where cam.fecha_examen>= '"+Fdesde.getDate().toString()+"' and cam.fecha_examen<='"
            +Fhasta.getDate().toString()+"' order  by cam.fecha_examen ";
            tipofecha=" agrupado por fecha de alta ";
        }
    }//GEN-LAST:event_jCheckBoxAltaActionPerformed

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
       cPersonalizada1();
    }//GEN-LAST:event_btnMostrar1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarVentana();        // TODO add your handling code here:
            try {
                oConn.oConnection.close();
                 System.out.println("cierra reportedorrrrrrrrrrrrrrrr");
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_formInternalFrameClosing
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
fuente.setFontHeightInPoints((short)8);         
fuente.setFontName(HSSFFont.FONT_ARIAL);
fuente.setColor(IndexedColors.WHITE.getIndex());
fuente.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
///////////
fuente2.setFontHeightInPoints((short)7);         
fuente2.setFontName(HSSFFont.FONT_ARIAL);
fuente2.setColor(IndexedColors.BLACK.getIndex());

///////////////////
HSSFCellStyle estiloCelda = libro.createCellStyle();
HSSFCellStyle estiloCelda2 = libro.createCellStyle();

estiloCelda.setWrapText(true);
estiloCelda.setAlignment(HSSFCellStyle. ALIGN_CENTER);
estiloCelda.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
estiloCelda.setFont(fuente);
/////////////////////
estiloCelda2.setWrapText(true);
estiloCelda2.setAlignment(HSSFCellStyle. ALIGN_LEFT);
estiloCelda2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
estiloCelda2.setFont(fuente2);
//////////////////
// También, podemos establecer bordes...
estiloCelda.setBorderBottom(HSSFCellStyle.BORDER_THIN);
estiloCelda.setBottomBorderColor((short)8);
estiloCelda.setBorderLeft(HSSFCellStyle.BORDER_THIN);
estiloCelda.setLeftBorderColor((short)8);
estiloCelda.setBorderRight(HSSFCellStyle.BORDER_THIN);
estiloCelda.setRightBorderColor((short)8);
estiloCelda.setBorderTop(HSSFCellStyle.BORDER_THIN);
estiloCelda.setTopBorderColor((short)8);
//////////
estiloCelda2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setBottomBorderColor((short)8);
estiloCelda2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setLeftBorderColor((short)8);
estiloCelda2.setBorderRight(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setRightBorderColor((short)8);
estiloCelda2.setBorderTop(HSSFCellStyle.BORDER_THIN);
estiloCelda2.setTopBorderColor((short)8);
///////////////////////
estiloCelda.setFillForegroundColor(IndexedColors.DARK_BLUE.getIndex());
estiloCelda.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
///////////////////////////////
        // oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getColumnCount()));
            //   oFunc.SubSistemaMensajeInformacion(String.valueOf(table.getRowCount()));
            
            for (int i = 0; i < table.getRowCount() ; i++) {
                
               if (i == 0) {
                   HSSFRow fila = hoja.createRow(i);
                 for (int j = 0; j < table.getColumnCount() ; j++) {
                     
                        HSSFCell celda = fila.createCell(j);
                        celda.setCellValue(new HSSFRichTextString(table.getColumnModel().getColumn(j).getHeaderValue().toString().toUpperCase()));
                       celda.setCellStyle(estiloCelda);
                   if(marcador==1){
                       HSSFCell celda12 = fila.createCell(12);
                        celda12.setCellValue(new HSSFRichTextString("SEDE:".toUpperCase()));
                       celda12.setCellStyle(estiloCelda2);
                     HSSFCell celda13 = fila.createCell(13);
                        celda13.setCellValue(new HSSFRichTextString(nomsede.toUpperCase()));
                       celda13.setCellStyle(estiloCelda2);
                       marcador=3;
                   }
                    if(verificador==1){
                       HSSFCell celda12 = fila.createCell(12);
                        celda12.setCellValue(new HSSFRichTextString("agrupado por:".toUpperCase()));
                       celda12.setCellStyle(estiloCelda2);
                     HSSFCell celda13 = fila.createCell(13);
                        celda13.setCellValue(new HSSFRichTextString(tipofecha.toUpperCase()));
                       celda13.setCellStyle(estiloCelda2);
                       verificador=3;
                   }
                   
                   }
              } //else {
                    HSSFRow fila = hoja.createRow(i+1);
                    for (int j = 0; j < table.getColumnCount() ; j++) {
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
marcador=1;
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.ButtonGroup btTipoReporte;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JButton btnRepDiario;
    private javax.swing.JButton btnRepSemanal;
    private javax.swing.JComboBox cboContratas;
    private javax.swing.JComboBox cboEmpresas;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk10;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk16;
    private javax.swing.JCheckBox chk17;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JCheckBox chk9;
    private javax.swing.JCheckBox chkContratista;
    private javax.swing.JCheckBox chkEmpresa;
    private javax.swing.JCheckBox chkOservicio;
    private javax.swing.JCheckBox chkPersonalizada;
    private javax.swing.JCheckBox chkRepCovid1;
    private javax.swing.JCheckBox chkRepCovid2;
    private javax.swing.JCheckBox chkRepManipAlimen;
    private javax.swing.JCheckBox chkRepPsicosen;
    private javax.swing.JCheckBox chkRepTestAltura;
    private javax.swing.JCheckBox chkRepTrabCal;
    private javax.swing.JCheckBox chkRepVisualCompl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBoxAlta;
    private javax.swing.JCheckBox jCheckBoxAntigeno;
    private javax.swing.JCheckBox jCheckBoxIngres0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNservicio;
    private javax.swing.JProgressBar pgExportar;
    private javax.swing.JTable tbReporte;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtOrdenServicio;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables

  public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
  
    this.dispose();
      //  System.exit(0);

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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"ReporteAtendidos.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("Ficha 'Reporte por Fechas'");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
   void Condicion(){
            try {
                String dato;
                String sql="";
                sql ="select n.nom_examen,n.cargo_de,"
                        + "ca.n_orden as aptitud,ca.fecha,ca.horasalida,a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc,"
                        + "bc.n_orden as conduccion,ba.n_orden as altura,  "
                        + "CASE  WHEN ca.chkapto = 'TRUE' THEN 'Apto'\n" +
                        " WHEN ca.chkapto_restriccion = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        " WHEN ca.chkno_apto = 'TRUE' THEN 'No Apto'  END as estado, \n"
                        + "CASE  WHEN ac.apto = 'TRUE' THEN 'Apto'\n" +
                        " WHEN ac.no_apto = 'TRUE' THEN 'No Apto' END as estadoac, \n"
                        + "CASE  WHEN a.apto = 'TRUE' THEN 'Apto'\n" +
                        " WHEN a.no_apto = 'TRUE' THEN 'No Apto' END as estadoad,"
                        + "CASE  WHEN bc.chk_si = 'TRUE' THEN 'Apto'\n" +
                        " WHEN bc.chk_observado = 'TRUE' THEN 'Observado'\n" +
                        " WHEN bc.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        " WHEN bc.chk_no = 'TRUE' THEN 'No Apto' END as estadobc,"
                        + "CASE  WHEN ba.chk_si = 'TRUE' THEN 'Apto'\n" +
                        " WHEN ba.chk_observado = 'TRUE' THEN 'Observado'\n" +
                        " WHEN ba.chk_apto_r = 'TRUE' THEN 'Apto con Restriccion'\n" +
                        " WHEN ba.chk_no_apto = 'TRUE' THEN 'No Apto' END as estadoba,"
                        + " o.examenes \n"
                        + "From datos_paciente "
                        + "inner join n_orden_ocupacional as n ON (datos_paciente.cod_pa = n.cod_pa)"
                        +" left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden)"
                        +" left join anexo7d as a ON (a.n_orden=n.n_orden)"
                        +" left join anexoc as ac ON (ac.n_orden=n.n_orden)"
                        +" left join observaciones as o ON (o.n_orden=n.n_orden)"
                        +" left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"     
                        +" left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"
//            + "where n.n_orden='"+valor+"'"
                        + "ORDER BY n.n_orden desc ";
                
                
                if (oConn.FnBoolQueryExecute(sql))
                {
                    try  {
                        
                        while (oConn.setResult.next())
                        {
                            
                            String exa=oConn.setResult.getString("nom_examen");
                            String s=oConn.setResult.getString("aptitud");
                            String a=oConn.setResult.getString("anexo7d");
                            String o=oConn.setResult.getString("observados");
                            String ac=oConn.setResult.getString("anexoc");
                            String bc=oConn.setResult.getString("conduccion");
                            String ba=oConn.setResult.getString("altura");
                            
                            if( o!= null){
                                dato= "Observado";
                            }else if(s != null ){
                                dato= oConn.setResult.getString("estado");
                            }else if( a != null && "ANEXO-7D".equals(exa)){
                                dato= oConn.setResult.getString("estadoad");
                            }else  if( ac!= null && "ANEXO-C".equals(exa)){
                                dato= oConn.setResult.getString("estadoac");
                            }else if( bc!= null && "PSICOSENSOMETRIA".equals(exa)){
                                dato= oConn.setResult.getString("estadobc");
                            }else if( ba!= null && "TEST-ALTURA".equals(exa)){
                                dato= oConn.setResult.getString("estadoba");
                            }
                            
                        }
                        
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)                    
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeError(ex.toString());
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
