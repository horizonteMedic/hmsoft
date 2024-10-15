/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.toedter.calendar.JDateChooser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.json.JSONObject;
import sun.misc.BASE64Decoder;

/**
 *
 * @author admin
 */
public class clsOperacionesUsuarios {
    clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    public boolean eDatos(JTextField txt,String From,String OptionPane,JTextField nRo){
              boolean bResultado=false;
         int seleccion = JOptionPane.showOptionDialog(null, // Componente padre
    "¿Desea Eliminar Registro de "+OptionPane+"?", //Mensaje
    "Seleccione una opción", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,    // null para icono por defecto.
    new Object[] { "Si", "No"},   
    "Si");
    if (seleccion != -1)
    {
   if((seleccion + 1)==1)
   {
      if(txt.getText().toString().equals("PASADO")){
        String triaje ="DELETE FROM "+From+" WHERE n_orden="+nRo.getText().toString();
        if(oConn.FnBoolQueryExecuteUpdate(triaje)){
            oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
            bResultado = true;
            
        }else{oFunc.SubSistemaMensajeInformacion("No se pudo Eliminar Registro");bResultado = true;}            
   }
   }
   else
   {
      // PRESIONO NO
     }
    }  
    
    return bResultado;
    }
     public void print(Integer cod, String Reporte, String Title){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+Reporte;
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle(Title);
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex){
                    //Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                     oFunc.SubSistemaMensajeError("No se pudo Cargar el Reporte : "+ Reporte);
                }
     }
     
          public void prinDigitalizadoSelloEmpleado(Integer cod, String nameJasper, String Title, String nameTable) throws IOException{
                String dniUsuario=consultarDni(nameTable, String.valueOf(cod));
                String base64Sello=""; 
       try {

           base64Sello=consumirApiSello(String.valueOf(dniUsuario));           
       } catch (Exception ex) {
           Logger.getLogger(clsOperacionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
       }

                
        Map parameters = new HashMap();
        parameters.put("Norden", cod);

              if(!base64Sello.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Sello);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Sello",stream);             
              }       
                
                  try 
                {       String direccionReporte="";
                    if( base64Sello.contains("OTROJASPER")){
                     direccionReporte= System.getProperty("user.dir")+File.separator+"reportes"+File.separator+nameJasper+".jasper";
                     }
                    else
                     direccionReporte= System.getProperty("user.dir")+File.separator+"reportes"+File.separator+nameJasper+"_Digitalizado.jasper";
                        
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle(Title);
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex){
                    //Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                     oFunc.SubSistemaMensajeError("No se pudo Cargar el Reporte : "+ nameJasper);
                }
     }
          
          public void prinDigitalizadoEmpleadoPaciente(Integer cod, String nameJasper, String Title, String nameTable) throws IOException{
                 String dniUsuario=consultarDni(nameTable, String.valueOf(cod));
                String dniPaciente=consultarDniPaciente(nameTable, "n_orden", String.valueOf(cod));
                String base64Huella="";
                String base64FirmaP="";
                String base64Sello=""; 
       try {
           base64Huella = consumirApiHuella(dniPaciente);
           base64FirmaP=consumirApiFirmaEmp(dniPaciente);
           base64Sello=consumirApiSello(String.valueOf(dniUsuario));           
       } catch (Exception ex) {
           Logger.getLogger(clsOperacionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
       }

                
        Map parameters = new HashMap();
        parameters.put("Norden", cod);
               if(!base64Huella.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Huella);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("HuellaP",stream);             
              }
              if(!base64FirmaP.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64FirmaP);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("FirmaP",stream);             
              }
              if(!base64Sello.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Sello);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Sello",stream);             
              }    
                
                  try 
                {       String direccionReporte="";
                    if(base64Huella.contains("OTROJASPER") || base64FirmaP.contains("OTROJASPER") || base64Sello.contains("OTROJASPER")){
                     direccionReporte= System.getProperty("user.dir")+File.separator+"reportes"+File.separator+nameJasper+".jasper";
                     }
                    else
                     direccionReporte= System.getProperty("user.dir")+File.separator+"reportes"+File.separator+nameJasper+"_Digitalizado.jasper";
                        
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle(Title);
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex){
                    //Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                     oFunc.SubSistemaMensajeError("No se pudo Cargar el Reporte : "+ nameJasper);
                }
     }
          
                    
          
          
     
       public void print1(String cod, String Reporte, String Title){
                
                Map parameters = new HashMap(); 
                parameters.put("CARTA",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+Reporte;
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle(Title);
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex){
                    //Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                     oFunc.SubSistemaMensajeError("No se pudo Cargar el Reporte : "+ Reporte);
                }
     }
private javax.swing.JTextField oRs;
public JTextField oConsultar(String selec, String from, JTextField norden){
    oRs = new javax.swing.JTextField();
    String oSql ="SELECT "+selec+" FROM "+from+" WHERE n_orden ='"+norden.getText().toString()+"'";
    oConn.FnBoolQueryExecute(oSql);
    try {
                    if (oConn.setResult.next()) {                        
                        oRs.setText(oConn.setResult.getString(selec));                   
                        
                       
                    }
                    oConn.setResult.close();
            } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Error:" + ex.getMessage().toString());
            }
    
return oRs;

}
public boolean eSubRegistros(JTextField txt,String From,String where,JTextField nRo){
              boolean bResultado=false;
    
      if(txt.getText().toString().equals("PASADO")){
        String triaje ="DELETE FROM "+From+" WHERE "+where+"="+nRo.getText().toString();
        if(oConn.FnBoolQueryExecuteUpdate(triaje)){
            //oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
            bResultado = true;
            
        }else{bResultado = true;}            
    
    
   
    }
 return bResultado;
}
public boolean nOrden(JTextField n, String t ){
  boolean bResultado = false;
    if (!n.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from "+ t +" Where n_orden =" + n.getText().toString();

            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;
                   // oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                   // n.setText(null);
                }

                // Cierro los Resultados
                oConn.setResult.close();

            } catch (SQLException ex) {
            }
        }
  return bResultado;
}

public boolean validar(JTextField n, String t, String columna ){
  boolean bResultado = false;
    if (!n.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select "+columna+" from "+ t +" Where " + columna+" =" + n.getText().toString();
              System.out.println(sQuery);
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;
                   // oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                   // n.setText(null);
                }

                // Cierro los Resultados
                oConn.setResult.close();

            } catch (SQLException ex) {
            }
        }
  return bResultado;
}

public boolean oFinalizado(JTextField n){
    boolean bResultado;
  
    String oSql="UPDATE n_orden_ocupacional SET estado_ex='FINALIZADO' WHERE n_orden ='"+n.getText().toString()+"'";
   
    if(oConn.FnBoolQueryExecuteUpdate(oSql)){
            //oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
            bResultado = true;
            
        }else{bResultado = false;}
     return bResultado;
}
    public void fecha(JDateChooser fecha) {
        Date dateHoy = new Date();
        // SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        fecha.setDate(dateHoy);

    }
 // obtiene el dni del usuario
    public String consultarDni( String tabla, String columna ){
  String bResultado = "";
            String sQuery;

            sQuery = "select dni_user from usuarios where UPPER(usuario_user)=(select TRIM(UPPER(user_registro)) from "+tabla+" where n_orden="+columna+");";
              System.out.println(sQuery);
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = oConn.setResult.getString("dni_user");
                   // oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                   // n.setText(null);
                }

                // Cierro los Resultados
                oConn.setResult.close();

            } catch (SQLException ex) {
            }
        
  return bResultado;
}
      
    // obtiene el dni del paciente 
      public String consultarDniPaciente( String nameTabla, String nombreColumna, String valorColumna ){
  String bResultado = "";
            String sQuery;

            sQuery = "select cod_pa from n_orden_ocupacional where n_orden=(select "+nombreColumna+" from "+nameTabla+" where "+nombreColumna+"="+valorColumna+" );";
              System.out.println(sQuery);
            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = oConn.setResult.getString("cod_pa");
                   // oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                   // n.setText(null);
                }

                // Cierro los Resultados
                oConn.setResult.close();

            } catch (SQLException ex) {
            }
        
  return bResultado;
}
      
      
    
    public String consumirApiSello(String dni) throws Exception {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
      String base64Sello=null;
         try {
            Digitalizacion.DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/detalleArchivoEmpleado/"+dni+"/SELLOFIRMA");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);


            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
                      if(code!=500){
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                System.out.println("Response line: " + responseLine.trim());
                    response.append(responseLine.trim());
                }
                  System.out.println("Response: " + response.toString());
                     JSONObject objectJson = new JSONObject(response.toString());
                  System.out.println("Response: " + objectJson);
                  System.out.println("Response: " + objectJson.getString("base64"));
                     
         
                     base64Sello=(objectJson.getString("base64"));
                 


                    /*
                    System.out.println("el campo es:"+objectJson.getLong("id_resp"));
                    
                    System.out.println("el campo es:"+objectJson.getString("rucEmpresa"));
                    System.out.println("el campo es:"+objectJson.getString("rucContrata"));
                    System.out.println("el campo es:"+objectJson.getString("cargo"));
                    System.out.println("el campo es:"+objectJson.getString("area"));
                    System.out.println("el campo es:"+objectJson.getString("tipoExamen"));
                    System.out.println("el campo es:"+objectJson.getString("fechaReserva"));
                      */
            }
            
          
            }
            else
                        base64Sello="OTROJASPER";

                      
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
         return base64Sello;
    }
         
      
      public String consumirApiHuella(String dni) throws Exception {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
      String base64Huella=null;
         try {
            Digitalizacion.DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/detalleArchivoEmpleado/"+dni+"/HUELLA");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);


            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
                      if(code!=500){
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                System.out.println("Response line: " + responseLine.trim());
                    response.append(responseLine.trim());
                }
                  System.out.println("Response: " + response.toString());
                     JSONObject objectJson = new JSONObject(response.toString());
                  System.out.println("Response: " + objectJson);
                  System.out.println("Response: " + objectJson.getString("base64"));
                     
         
                     base64Huella=(objectJson.getString("base64"));
                 


                    /*
                    System.out.println("el campo es:"+objectJson.getLong("id_resp"));
                    
                    System.out.println("el campo es:"+objectJson.getString("rucEmpresa"));
                    System.out.println("el campo es:"+objectJson.getString("rucContrata"));
                    System.out.println("el campo es:"+objectJson.getString("cargo"));
                    System.out.println("el campo es:"+objectJson.getString("area"));
                    System.out.println("el campo es:"+objectJson.getString("tipoExamen"));
                    System.out.println("el campo es:"+objectJson.getString("fechaReserva"));
                      */
            }
            
            
            }
            else
                        base64Huella="OTROJASPER";

                      
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
         return base64Huella;
    }
         
      public String consumirApiFirmaEmp(String dni) throws Exception {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
      String base64FirmaE=null;
         try {
            Digitalizacion.DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/detalleArchivoEmpleado/"+dni+"/FIRMAP");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);


            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
                      if(code!=500){
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                System.out.println("Response line: " + responseLine.trim());
                    response.append(responseLine.trim());
                }
                  System.out.println("Response: " + response.toString());
                     JSONObject objectJson = new JSONObject(response.toString());
                  System.out.println("Response: " + objectJson);
                  System.out.println("Response: " + objectJson.getString("base64"));
                     
         
                     base64FirmaE=(objectJson.getString("base64"));
                 


                    /*
                    System.out.println("el campo es:"+objectJson.getLong("id_resp"));
                    
                    System.out.println("el campo es:"+objectJson.getString("rucEmpresa"));
                    System.out.println("el campo es:"+objectJson.getString("rucContrata"));
                    System.out.println("el campo es:"+objectJson.getString("cargo"));
                    System.out.println("el campo es:"+objectJson.getString("area"));
                    System.out.println("el campo es:"+objectJson.getString("tipoExamen"));
                    System.out.println("el campo es:"+objectJson.getString("fechaReserva"));
                      */
            }
            
            
            }
            else
                        base64FirmaE="OTROJASPER";

                      
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
         return base64FirmaE;
    }
      
    
}
