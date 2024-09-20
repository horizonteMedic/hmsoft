package Digitalizacion;

import Clases.clsGlobales;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import sun.misc.BASE64Encoder;

/**
 *
 * @author jesus
 */



public class CapturaHuella extends javax.swing.JFrame {
    private int r,g,b;
    private Color color;
    int umbral = 127;// 
    /** Creates new form CapturaHuella */
    public CapturaHuella() {
        try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Imposible modificar el tema visual", "Lookandfeel inválido.",
         JOptionPane.ERROR_MESSAGE);
         }
        initComponents();
        txtArea.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panHuellas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblImagenHuella = new javax.swing.JLabel();
        panBtns = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Captura de huella del personal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panHuellas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huella Digital Capturada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panHuellas.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblImagenHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panHuellas.add(jPanel1, java.awt.BorderLayout.CENTER);

        panBtns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBtnsLayout = new javax.swing.GroupLayout(panBtns);
        panBtns.setLayout(panBtnsLayout);
        panBtnsLayout.setHorizontalGroup(
            panBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBtnsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panBtnsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panBtnsLayout.setVerticalGroup(
            panBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBtnsLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerificar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panBtns, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panHuellas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panHuellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Iniciar();
        start();
        EstadoHuellas();
        btnGuardar.setEnabled(false);
        //btnIdentificar.setEnabled(false);
        btnVerificar.setEnabled(false);
        //btnSalir.grabFocus();

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        stop();
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      // guardarHuella();
      
      Icon iconLabel=lblImagenHuella.getIcon();
            
   //  BufferedImage bimage = new BufferedImage(imagenGlobal.getWidth(null), imagenGlobal.getHeight(null), BufferedImage.TYPE_INT_ARGB);
      BufferedImage escalaGrises = iconToImage(iconLabel);

        int pregunta= JOptionPane.showConfirmDialog(this," ¿Guardar fotografia?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(pregunta==0){//presiono si
        File salidaImagen= new File("C:\\hmsoft\\huella.jpg");   
        try{
            ImageIO.write(escalaGrises,"jpg",salidaImagen);
            JOptionPane.showMessageDialog(this, "imagen guardada: "+salidaImagen.getAbsolutePath());
               comunirApiRegistroArchivoEmpleado("huella",clsGlobales.sDniPaciente,imageToBase64String(escalaGrises,"jpeg"));
       
            
        }catch(IOException e){
        System.out.println("el eror es:"+e);
        } catch (Exception ex) {
              Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
          }
        }   
        
       Reclutador.clear();
       lblImagenHuella.getIcon();
       lblImagenHuella.setIcon(null);
      // System.exit(0);

    }//GEN-LAST:event_btnGuardarActionPerformed
    
           public void comunirApiRegistroArchivoEmpleado(String path, String dniEmp,String base64String) throws Exception {
         String p1 = null,p2 = null,p3 = null,
                 p4 = null,p5 = null,p6 = null,
                 p7 = null,p8 = null,p9 = null,p10 = null, 
                 p11 = null,p12 = null,p13 = null,
                 p14 = null,p15 = null,p16 = null,p17 = null,p18 = null; 
         try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/registrarArchivoEmpleado");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
  
//            System.out.println(Sql);
            String jsonInputString = "{\n" +
                                    "   \"ruta\": null,\n" +
                                    "   \"nombreArchivo\":\""+path+"\",\n" +
                                    "   \"dni\":"+dniEmp+",\n" +
                                    "  \"extension\": \".jpg\",\n" +
                                    "  \"tipoArchivo\":\"HUELLA\",\n" +
                                    "  \"base64\":\""+base64String+"\"}";
            System.out.println(jsonInputString);
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                    System.out.println("Response: " + response.toString());
                   
               
            }
 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    
    
    public static String imageToBase64String(BufferedImage image, String type) {
        String ret = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, type, bos);
            byte[] bytes = bos.toByteArray();
            BASE64Encoder encoder = new BASE64Encoder();
            ret = encoder.encode(bytes);
            ret = ret.replace(System.lineSeparator(), "");
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return ret;
    }
    
    private BufferedImage iconToImage(Icon icon){

    
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        icon.paintIcon(null, image.getGraphics(), 0, 0);
        return image;
    
}
   public BufferedImage set_Blanco_y_Negro(BufferedImage f){
        BufferedImage bn = new BufferedImage(f.getWidth(),f.getHeight(), BufferedImage.TYPE_BYTE_BINARY);        
        //se traspasan los colores Pixel a Pixel
        for(int i=0;i<f.getWidth();i++){
          for(int j=0;j<f.getHeight();j++){
               color = new Color(f.getRGB(i, j));
               //se extraen los valores RGB
                r = color.getRed();
                g = color.getGreen();
                b = color.getBlue();
                //dependiendo del valor del umbral, se van separando los
                // valores RGB a 0 y 255  
                r =(r>umbral)? 255: 0;
                g =(g>umbral)? 255: 0;
                b =(b>umbral)? 255: 0;
                bn.setRGB(i, j, new Color(r,g,b).getRGB());            
          }
        }        
        return bn;
   }
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
    String nombre = JOptionPane.showInputDialog("Nombre del personal a verificar");
//    verificarHuella(nombre);
    Reclutador.clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       btnGuardar.setEnabled(false);
       txtArea.setText(null);
       Reclutador.clear();
       Lector = DPFPGlobal.getCaptureFactory().createCapture();
       Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
       Verificador = DPFPGlobal.getVerificationFactory().createVerification();
       DPFPTemplate template;
        //   Lector.stopCapture();
        // lblImagenHuella.getIcon();
       lblImagenHuella.setIcon(null);    
       txtArea.setText("");
       Iniciar();
       start();
       EstadoHuellas();
    }//GEN-LAST:event_jButton1ActionPerformed

//Varible que permite iniciar el dispositivo de lector de huella conectado
// con sus distintos metodos.
private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();

//Varible que permite establecer las capturas de la huellas, para determina sus caracteristicas
// y poder estimar la creacion de un template de la huella para luego poder guardarla
private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();

//Esta variable tambien captura una huella del lector y crea sus caracteristcas para auntetificarla
// o verificarla con alguna guarda en la BD
private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();

//Variable que para crear el template de la huella luego de que se hallan creado las caracteriticas
// necesarias de la huella si no ha ocurrido ningun problema
private DPFPTemplate template;
public static String TEMPLATE_PROPERTY = "template";
protected void Iniciar(){
    int contado=1;
   Lector.addDataListener(new DPFPDataAdapter() {
    @Override public void dataAcquired(final DPFPDataEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("La Huella Digital ha sido Capturada con exito!!");
    ProcesarCaptura(e.getSample());
    }});}
   });

   Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
    @Override public void readerConnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El Sensor de Huella Digital esta Activado o Conectado");
    }});}
    @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El Sensor de Huella Digital esta Desactivado o no Conectado");
    }});}
   });

   Lector.addSensorListener(new DPFPSensorAdapter() {
    @Override public void fingerTouched(final DPFPSensorEvent e) {
        
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    
    EnviarTexto("El dedo ha sido colocado sobre el Lector de Huella - ");
    
    }});}
    @Override public void fingerGone(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El dedo ha sido quitado del Lector de Huella");
    }});}
   });

   Lector.addErrorListener(new DPFPErrorAdapter(){
    public void errorReader(final DPFPErrorEvent e){
    SwingUtilities.invokeLater(new Runnable() {  public void run() {
    EnviarTexto("Error: "+e.getError());
    }});}
   });
   contado++;
}

public DPFPFeatureSet featuresinscripcion;
public DPFPFeatureSet featuresverificacion;
public  void ProcesarCaptura(DPFPSample sample)
 {
 // Procesar la muestra de la huella y crear un conjunto de características con el propósito de inscripción.
 featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);

 // Procesar la muestra de la huella y crear un conjunto de características con el propósito de verificacion.
 featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

 // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
 if (featuresinscripcion != null)
     try{
     System.out.println("Las Caracteristicas de la Huella han sido creada");
     Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear

     // Dibuja la huella dactilar capturada.
     Image image=CrearImagenHuella(sample);
     DibujarHuella(image);

     //btnVerificar.setEnabled(true);
     //btnIdentificar.setEnabled(true);

     }catch (DPFPImageQualityException ex) {
     System.err.println("Error: "+ex.getMessage());
     }

     finally {
     EstadoHuellas();
     // Comprueba si la plantilla se ha creado.
	switch(Reclutador.getTemplateStatus())
        {
            case TEMPLATE_STATUS_READY:	// informe de éxito y detiene  la captura de huellas
	    stop();
            setTemplate(Reclutador.getTemplate());
	    EnviarTexto("Listo la huella ha sido capturada correctamente ahora puede guardarla");
	    //btnIdentificar.setEnabled(false);
            btnVerificar.setEnabled(true);
            btnGuardar.setEnabled(true);
            btnGuardar.grabFocus();
            break;

	    case TEMPLATE_STATUS_FAILED: // informe de fallas y reiniciar la captura de huellas
	    Reclutador.clear();
            stop();
	    EstadoHuellas();
	    setTemplate(null);
	    JOptionPane.showMessageDialog(CapturaHuella.this, "La Plantilla de la Huella no pudo ser creada, Repita el Proceso", "Inscripcion de Huellas Dactilares", JOptionPane.ERROR_MESSAGE);
	    start();
	    break;
	}
	     }
}

 public  DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
     DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
     try {
      return extractor.createFeatureSet(sample, purpose);
     } catch (DPFPImageQualityException e) {
      return null;
     }
}

  public  Image CrearImagenHuella(DPFPSample sample) {
	return DPFPGlobal.getSampleConversionFactory().createImage(sample);
}

  public void DibujarHuella(Image image) {
        lblImagenHuella.setIcon(new ImageIcon(
        image.getScaledInstance(lblImagenHuella.getWidth(), lblImagenHuella.getHeight(), Image.SCALE_DEFAULT)));
        repaint();
 }

public  void EstadoHuellas(){
	EnviarTexto("Muestra de Huellas Restantes para Guardar "+ Reclutador.getFeaturesNeeded());
}

public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
}

public  void start(){
	Lector.startCapture();
	EnviarTexto("Utilizando el Lector de Huella Dactilar ");
}

public  void stop(){
        Lector.stopCapture();
        EnviarTexto("No se está usando el Lector de Huella Dactilar ");
}

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
	this.template = template;
	firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapturaHuella().setVisible(true);
            }
        });
    }
    

//ConexionBD con=new ConexionBD();
 /*
  * Guarda los datos de la huella digital actual en la base de datos
  */
    
   /*
    public void guardarHuella(){
     //Obtiene los datos del template de la huella actual
     ByteArrayInputStream datosHuella = new ByteArrayInputStream(template.serialize());
     Integer tamañoHuella=template.serialize().length;
     //Pregunta el nombre de la persona a la cual corresponde dicha huella
     String nombre = JOptionPane.showInputDialog("ingresa la clave");
     try {
     //Establece los valores para la sentencia SQL
     //Connection c=con.conectar(); //establece la conexion con la BD

      //PreparedStatement updatePersonal = c.prepareStatement("UPDATE personal set huella=? WHERE clave=?");
        //updatePersonal.setBinaryStream(1, datosHuella,tamañoHuella);
        updatePersonal.setBinaryStream(1, datosHuella,tamañoHuella);
        updatePersonal.setString(2,nombre);
        updatePersonal.execute();
        updatePersonal.close();

     JOptionPane.showMessageDialog(null,"Huella Guardada Correctamente");
     con.desconectar();

     btnGuardar.setEnabled(false);
     //btnVerificar.grabFocus();
     } catch (SQLException ex) {
     //Si ocurre un error lo indica en la consola
     System.err.println("Error al guardar los datos de la huella.");
     }finally{
     con.desconectar();
     }
   }
*/
/**
* Verifica la huella digital actual contra otra en la base de datos
*/
   /* 
 public void verificarHuella(String nom) {
    try {
    //Establece los valores para la sentencia SQL
    Connection c=con.conectar();
    //Obtiene la plantilla correspondiente a la persona indicada
    PreparedStatement verificarStmt = c.prepareStatement("SELECT huella FROM personal WHERE nombre=?");
    verificarStmt.setString(1,nom);
    ResultSet rs = verificarStmt.executeQuery();

    //Si se encuentra el nombre en la base de datos
    if (rs.next()){
    //Lee la plantilla de la base de datos
    byte templateBuffer[] = rs.getBytes("huella");
    //Crea una nueva plantilla a partir de la guardada en la base de datos
    DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
    //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
    setTemplate(referenceTemplate);

    // Compara las caracteriticas de la huella recientemente capturda con la
    // plantilla guardada al usuario especifico en la base de datos
    DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());

    //compara las plantilas (actual vs bd)
    if (result.isVerified())
    JOptionPane.showMessageDialog(null, "Las huella capturada coinciden con la de "+nom,"Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
    else
    JOptionPane.showMessageDialog(null, "No corresponde la huella con "+nom, "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);

    //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
    } else {
    JOptionPane.showMessageDialog(null, "No existe un registro de huella para "+nom, "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
    }
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos de la huella.");
    }finally{
       con.desconectar();
    }
   }

 
 */
 
 
 /**
  * Identifica a una persona registrada por medio de su huella digital
  */
 
 /*
  public void identificarHuella() throws IOException{
     try {
       //Establece los valores para la sentencia SQL
       Connection c=con.conectar();

       //Obtiene todas las huellas de la bd
       PreparedStatement identificarStmt = c.prepareStatement("SELECT nombre,huella FROM personal");
       ResultSet rs = identificarStmt.executeQuery();

       //Si se encuentra el nombre en la base de datos
       while(rs.next()){
       //Lee la plantilla de la base de datos
       byte templateBuffer[] = rs.getBytes("huella");
       String nombre=rs.getString("nombre");
       //Crea una nueva plantilla a partir de la guardada en la base de datos
       DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
       //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
       setTemplate(referenceTemplate);
       // Compara las caracteriticas de la huella recientemente capturda con la
       // alguna plantilla guardada en la base de datos que coincide con ese tipo
       DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());
       //compara las plantilas (actual vs bd)
       //Si encuentra correspondencia dibuja el mapa
       //e indica el nombre de la persona que coincidió.
       if (result.isVerified()){
       //crea la imagen de los datos guardado de las huellas guardadas en la base de datos
       JOptionPane.showMessageDialog(null, "Las huella capturada es de "+nombre,"Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
       return;
                               }
       }
       //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
       JOptionPane.showMessageDialog(null, "No existe ningún registro que coincida con la huella", "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
       setTemplate(null);
       } catch (SQLException e) {
       //Si ocurre un error lo indica en la consola
       System.err.println("Error al identificar huella dactilar."+e.getMessage());
       }finally{
       con.desconectar();
       }
   }
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenHuella;
    private javax.swing.JPanel panBtns;
    private javax.swing.JPanel panHuellas;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
