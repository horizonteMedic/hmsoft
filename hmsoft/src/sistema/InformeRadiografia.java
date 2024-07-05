/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsOperacionesUsuarios;
import autocomplete.AutoCompleteDBLink;
import autocomplete.AutoTextComplete;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdom.Parent;

/**
 *
 * @author admin
 */
public final class InformeRadiografia extends javax.swing.JInternalFrame {

   clsConnection oConn = new clsConnection();
   String tipo_radio = "";
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;

   public InformeRadiografia(){
      initComponents();
      
  
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        bg2 = new javax.swing.ButtonGroup();
        bg3 = new javax.swing.ButtonGroup();
        bg4 = new javax.swing.ButtonGroup();
        bg5 = new javax.swing.ButtonGroup();
        bgConclusion = new javax.swing.ButtonGroup();
        jPanel28 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        n_orden = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        imprimir = new javax.swing.JTextField();
        btnImprimir5 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        conclu = new javax.swing.JTextArea();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        info_general = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        lumbar = new javax.swing.JCheckBox();
        lumbosacro = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Radiografia Columna");

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel116.setText("Nº Orden :");

        n_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_ordenActionPerformed(evt);
            }
        });
        n_orden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n_ordenKeyTyped(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        Fecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaPropertyChange(evt);
            }
        });

        jLabel117.setText("Fecha :");

        jLabel118.setText("Nombres y Apellidos :");

        jLabel119.setText("DNI :");

        jLabel120.setText("Edad :");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar)
                        .addComponent(jLabel117))
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPRIMIR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        btnImprimir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir5)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnImprimir5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setMnemonic('i');
        btnActualizar.setText("guardar y actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        conclu.setColumns(20);
        conclu.setRows(5);
        jScrollPane15.setViewportView(conclu);

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel122.setText("CONCLUSIÓN :");

        info_general.setColumns(20);
        info_general.setRows(5);
        jScrollPane14.setViewportView(info_general);

        jLabel121.setText("INFORME:");

        lumbar.setText("LUMBAR");
        lumbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumbarActionPerformed(evt);
            }
        });

        lumbosacro.setText("LUMBOSACRO");
        lumbosacro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumbosacroActionPerformed(evt);
            }
        });

        jLabel1.setText("El estudio Radiografico representado en incidencia frontal y lateral muestra:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lumbar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lumbosacro))
                            .addComponent(jLabel1)
                            .addComponent(jLabel122))
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lumbar)
                    .addComponent(lumbosacro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RADIOGRAFIA DE COLUMNA", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnActualizar)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTabbedPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean OrdenExiste()
     {
        boolean bResultado=false;
        if(!n_orden.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from radiografia where n_orden="+n_orden.getText();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
                
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            
            oConn.setResult.close();
        } catch (SQLException ex) {
        }
        }       
        return bResultado;
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
              printer(Integer.valueOf(n_orden.getText().toString()));
               im = true;
           }
           else
           {
              // PRESIONO NO
             }
            }
            return im;

        }
    public void limpiar() {
        
        n_orden.setText("");
        nombres.setText("");        
        dni.setText("");
        Fecha.setDate(null);
        edad.setText("");
        lumbar.setSelected(false);
        lumbosacro.setSelected(false);
        info_general.setText("");        
        conclu.setText("");
        imprimir.setText("");        
        n_orden.requestFocus();
        
    }
    public void Actualizar(){
            String sCodigo=n_orden.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE  radiografia\n" +
                  " SET "       +" tipo_radio='"+tipo_radio+"',"+                   
                  "        info_general='"+info_general.getText()+"',"+
                  "        conclu='"+conclu.getText()+"'"+
                
                    " WHERE n_orden="+sCodigo+";";
                //System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimir();
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InformeRadiografia.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }
    
    private boolean Grabar() throws SQLException{
        boolean bResult = false;
        
        String strSqlStmt ="INSERT INTO radiografia(\n" +
"            n_orden, tipo_radio ,info_general , conclu )"; 
        
            strSqlStmt+= " values("+ n_orden.getText()+",'"+
                                       
                    tipo_radio+"','"+              
                    info_general.getText()+"','"+
                    conclu.getText()+"'"+                    
                    " ) ";

             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
               
                   oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   oConn.sqlStmt.close();
               }
                return bResult;       
        }
    
       private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("n_orden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"RAYOSX1.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
       private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("n_orden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"RAYOSX1.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO DE RADIOGRAFIA");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
    private boolean validar(){
        boolean bResultado=true;

            if (((JTextField)Fecha.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
    private void n_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ordenActionPerformed
       
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!n_orden.getText().isEmpty()){
            if(!OrdenExiste()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombres, d.fecha_nacimiento_pa ,"
                + "n.fecha_apertura_po  "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+n_orden.getText() +"'";
                // System.out.println(Sql);
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        nombres.setText(oConn.setResult.getString("nombres"));
                        dni.setText(oConn.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        edad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) +" AÑOS" );
                        Fecha.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                        //oPe.fecha(Fecha);
                        nombres.setEnabled(false);
                        dni.setEnabled(false);
                        Fecha.setEnabled(false);
                        edad.setEnabled(false);
                        

                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios");
                    }
                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("radiografia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("N° orden regitrado");
            }
        }
    }//GEN-LAST:event_n_ordenActionPerformed

    private void n_ordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_ordenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_n_ordenKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!n_orden.getText().isEmpty()){          
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombres, d.fecha_nacimiento_pa ,n.fecha_apertura_po ,"
                    + "tipo_radio, info_general,  conclu\n" +
"                            FROM datos_paciente AS d \n" +
"                            INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)     \n" +
"                            INNER JOIN radiografia AS rad ON (rad.n_orden = n.n_orden)  \n" +
"                            WHERE   n.n_orden ="+n_orden.getText()+";";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    nombres.setText(oConn.setResult.getString("nombres"));
                    dni.setText(oConn.setResult.getString("cod_pa")); 
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    edad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar()))+" AÑOS" );                    
                    tipo_radio=oConn.setResult.getString("tipo_radio").toUpperCase();
                    if (tipo_radio.contains("LUMBAR"))
                        lumbar.setSelected(true);
                    if (tipo_radio.contains("LUMBOSACRO"))
                        lumbosacro.setSelected(true);
                    info_general.setText(oConn.setResult.getString("info_general"));
                    conclu.setText(oConn.setResult.getString("conclu"));
                    //no editable
                    edad.setEnabled(false);
                    dni.setEnabled(false);
                    nombres.setEnabled(false);                              
                    Fecha.setEnabled(false); 
                    Fecha.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    
                    
                    
                }else{
                    oFunc.SubSistemaMensajeError("N° orden no registrado");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Informe radiografia:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void FechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaPropertyChange

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
        print (Integer.parseInt(imprimir.getText()));
    }//GEN-LAST:event_imprimirActionPerformed

    private void btnImprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir5ActionPerformed
        // TODO add your handling code here:
        print (Integer.parseInt(imprimir.getText()));
    }//GEN-LAST:event_btnImprimir5ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(OrdenExiste()){
             Actualizar();
             limpiar();
        }
        else{
            if(!n_orden.getText().isEmpty()){
                try {
                    if(validar()){
                        if(Grabar()){
                            imprimir();
                            limpiar();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InformeRadiografia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void lumbosacroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumbosacroActionPerformed
        if (lumbosacro.isSelected())
        {
            tipo_radio ="LUMBOSACRO";
            lumbar.setSelected(false);
        }
    }//GEN-LAST:event_lumbosacroActionPerformed

    private void lumbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumbarActionPerformed
        if (lumbar.isSelected())
        {
            tipo_radio ="LUMBAR";
            lumbosacro.setSelected(false);
        }
    }//GEN-LAST:event_lumbarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.ButtonGroup bg2;
    private javax.swing.ButtonGroup bg3;
    private javax.swing.ButtonGroup bg4;
    private javax.swing.ButtonGroup bg5;
    private javax.swing.ButtonGroup bgConclusion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir5;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextArea conclu;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField imprimir;
    private javax.swing.JTextArea info_general;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox lumbar;
    private javax.swing.JCheckBox lumbosacro;
    private javax.swing.JTextField n_orden;
    private javax.swing.JTextField nombres;
    // End of variables declaration//GEN-END:variables

public int calcularEdad(Calendar fechaNac){
    
    Calendar today = Calendar.getInstance();
    int diay = today.get(Calendar.YEAR);
    int fechay = fechaNac.get(Calendar.YEAR);
    int diff_year = diay - fechay;
    int diam = today.get(Calendar.MONTH);
    int fecham = fechaNac.get(Calendar.MONTH);
    int diff_month = diam - fecham;
    int dia = today.get(Calendar.DAY_OF_MONTH);
    int fecha = fechaNac.get(Calendar.DAY_OF_MONTH);
    int diff_day = dia - fecha;
    //Si está en ese año pero todavía no los ha cumplido
    if(diff_month<0 || (diff_month==0 && diff_day<0)){
        int factor=1;
        diff_year = diff_year - factor;
    }
    return diff_year;
}




}
