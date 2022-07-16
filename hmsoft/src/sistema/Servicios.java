/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.Comprobantes;
import Caja.Ticket;
import Caja.hoteles;
import Caja.prtocolos;
import Caja.ticketAsistencial;
import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Horizonte Medic
 */
public class Servicios extends javax.swing.JFrame {
   clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    DefaultTableModel ticket;
      DefaultTableModel model;

    /**
     * Creates new form Servicios
     */
    public Servicios() {
        initComponents();
        CargarServicios();
        CargarDoctor();
        CargarServicios();
        setLocationRelativeTo(null);
        fecha();
        AutoCompleteDecorator.decorate(this.jComboBox1);
        AutoCompleteDecorator.decorate(this.jComboBox2);
        jComboBox2.setSelectedItem(clsGlobales.sNomOperador);
        jTextField2.setVisible(false);
        timer.start();

        sbTicket();
        jRadioButton4.setSelected(true);
        jComboBox1.setSelectedItem("CONSULTA MEDICA");
        popuptable();

    }
    
    Timer timer = new Timer (1000, new ActionListener ()
{

    @Override
    public void actionPerformed(ActionEvent e)
{
Date HorNew = new Date();
SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
String FfechaSystemA = fechaforma.format(HorNew);

GestorTime.setFfechaSystem(FfechaSystemA);

jTextField7.setText(GestorTime.getFfechaSystem());
}
});
   
    
            public void popuptable(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Eliminar Registro");
    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =tbTicket.getSelectedRow();
       System.out.println("la fila es:"+a);
     
    String id= (String) tbTicket.getValueAt(a,0);
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
        tblDatos.removeRow(a);
        
     
               JOptionPane.showMessageDialog(null, "SERVICIO ELIMINADO (X)");
                    
        }
    
    });    
    popupMenu.add(menuItem1);
    tbTicket.setComponentPopupMenu(popupMenu);
  
    }  
       
    
private void fecha(){
Date dateHoy = new Date();
Date fechaact=null;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("la fechaa:"+formato.format(dateHoy));
        try {
            fechaact=formato.parse(formato.format(dateHoy).toString());
        } catch (ParseException ex) {
            Logger.getLogger(ticketAsistencial.class.getName()).log(Level.SEVERE, null, ex);
        }
//Fdesde.setDateFormatString(formato.format(dateHoy).toString());
Fdesde.setDate(fechaact);
}


private void CargarServicios(){
  String Consulta;    
    Consulta = "select descripcion from servicios_generales ORDER BY  descripcion ";
        if (oConn.FnBoolQueryExecute(Consulta))
        {
            try 
            {
                while (oConn.setResult.next())
                 {                     
                   jComboBox1.addItem(oConn.setResult.getString ("descripcion"));                     
                 }
                    oConn.setResult.close();
                    oConn.sqlStmt.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
               // oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

 public void sbServicioAgrega()
    {

        double decPrecio;

        // Variable para el modelo de la tabla
        DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();

        // Prepara los datos vacios iniciales
        Object [] oFila = new Object[7];
        
        // Para el Query
        String sQuery;
        
        // Valida que haya algo en el Codigo
        if (! jTextField2.getText().trim().isEmpty())
        {
            // Prepara el Query
            sQuery  = "select cod_servicio,descripcion,precio::money::numeric ,unidad from servicios_generales where cod_servicio ='"+jTextField2.getText().toString()+"'";

            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {
               if (oConn.setResult.next())
                {       
                        oFila[0]=oConn.setResult.getString("cod_servicio");
                        oFila[1]=jTextField4.getText().toString().trim();
                        oFila[2]=oConn.setResult.getString("unidad");
                        oFila[3]=oConn.setResult.getString("descripcion");
                    // oFila[4]=oFunc.convertir(Double.valueOf(txtPrecioT.getText().toString()));
                       // oFila[4]=oFunc.convertir(Double.valueOf(txtPrecioT.getText().toString()));  
                      
                       // System.out.println("el mensaje es en fila 4 con txt"+oFila[4]);
                        //oFila[4]=oFunc.convertir(Double.valueOf(oConn.setResult.getString("precio")));
                     // 
                     oFila[4]=jTextField3.getText().toString();     
                       System.out.println("el mensaje es en fila 4 con txt "+oFila[4]);
                        
                  decPrecio = oConn.setResult.getDouble("precio");
                  System.out.println("el dec precio "+decPrecio);
                  // decPrecio =Double.valueOf(txtPrecioT.getText().toString());
                   //  System.out.println("el dec precio "+decPrecio);

                        Double Total = decPrecio; 
                        tblDatos.insertRow(0, oFila);  
                        tbTicket.setModel(tblDatos);
                     //  jTextField8.setText(oFunc.convertir(Total));
                }
                else 
                {
                    oFunc.SubSistemaMensajeError("No se agrego correctamente");
                    
                }

                // Cierro los Resultados
                oConn.setResult.close();
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeError("Boleta de venta:"+ex.getMessage().toString());
            }
        }
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTicket = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarFicha = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Fdesde = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setTitle("Servicios");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("DIAGNOSTICO:");
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        jLabel4.setText("OBSERVACION:");
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        jLabel5.setText("SERVICIOS:");
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 420, 80));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jInternalFrame1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 420, 80));

        jComboBox1.setEditable(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 280, -1));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        Agregar.setMnemonic('a');
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 130, 30));

        tbTicket.setBackground(new java.awt.Color(204, 255, 204));
        tbTicket.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbTicket);

        jInternalFrame1.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 600, 100));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 130, 30));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 130, 30));

        btnGuardarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnGuardarFicha.setText("Guardar");
        btnGuardarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFichaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnGuardarFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, 130, 30));

        jLabel6.setText("MÉDICO:");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jComboBox2.setEditable(true);
        jInternalFrame1.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 420, -1));

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);

        jInternalFrame1.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 460, 420));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("HISTORIAL MEDICO");
        jInternalFrame1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 100, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 390, -1));

        jLabel16.setText("Hora:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 20));
        jPanel1.add(Fdesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, -1));

        jLabel15.setText("Fecha:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, -1));

        jLabel2.setText("Edad :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel14.setText("Apellidos:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel1.setText("Nombres :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 390, -1));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setText("D.N.I.");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3.setText("Historia Clínica");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnNuevo.setMnemonic('n');
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 40, 30));

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 460, 140));

        jLabel8.setText("Cod. Servicio:");
        jInternalFrame1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jTextField2.setDragEnabled(true);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 90, -1));

        jLabel10.setText("Precio:");
        jInternalFrame1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, -1, -1));
        jInternalFrame1.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 70, -1));

        jLabel11.setText("Unidad:");
        jInternalFrame1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 420, -1, -1));

        jTextField4.setText("1");
        jInternalFrame1.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 40, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Nro Ticket:"));
        jPanel7.setForeground(new java.awt.Color(0, 153, 102));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("00000-00000");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jInternalFrame1.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 470, 100));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed

    }//GEN-LAST:event_txtApellidosActionPerformed

  private void CargarDoctor(){
    String Consulta;    
    Consulta = "select nombre_user||' '||apellido_user as nombre FROM usuarios  ";
        if (oConn.FnBoolQueryExecute(Consulta))
        {
            try 
            {
                while (oConn.setResult.next())
                 {                     
                   jComboBox2.addItem(oConn.setResult.getString ("nombre"));                     
                 }
                    oConn.setResult.close();
                    oConn.sqlStmt.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}  
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
sbServicioAgrega();    
jTextField4.setText("1");
    }//GEN-LAST:event_AgregarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
      print(jTextField12.getText().toString().trim());

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
limpiarConsulta();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiarConsulta(){
    txtNombre.setText("");
    txtApellidos.setText("");
    jTextField1.setText("");
    jTextArea1.setText("");
    jTextArea2.setText("");
    jTextField12.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
   int a = tbTicket.getRowCount()-1;
                 DefaultTableModel tblDatos = (DefaultTableModel) tbTicket.getModel();
        for (int i = a; i >= 0; i--) {          
        tblDatos.removeRow(tblDatos.getRowCount()-1);
        }
    
    }
    private void btnGuardarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFichaActionPerformed
        insertarConsulta();
        contenidoConsultDetalle();
        imprimir();
        limpiarConsulta();
    }//GEN-LAST:event_btnGuardarFichaActionPerformed
     
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
   {  //  System.out.println("el numero es "+Integer.valueOf(num));
        print1(jTextField12.getText().toString().trim());
   //   printer(Integer.valueOf(txtNorden.getText().toString()));
       im = true;
   }
   else
   {
      // PRESIONO NO
     }
    }
    return im;

}
    
    public void insertarConsulta(){
    String query="insert into consulta_asistencial (nro_ticket,\n" +
"medico, \n" +
"diagnostico,\n" +
"observaciones,fecha,hora) values ('"+jTextField12.getText().toString().trim()+"','"+
        jComboBox2.getSelectedItem().toString().trim()+
        "','"+jTextArea1.getText().toString().trim()+"','"+jTextArea2.getText().toString().trim()+"','"
            +Fdesde.getDate().toString().trim()+"','"+jTextField7.getText().toString().trim()+"')";
      try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
            oFunc.SubSistemaMensajeError("Se registro con Exito");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
      public void contenidoConsultDetalle()
    {
        // Para los resultados
        
        // Variable para las filas de la Tabla de Productos
        int iFila;
        
        // Variables para los diferentes datos
        String sCodigo, sDescripcion, sPrecioU,sPrecioT,sDescuento, sCantidad, sUnidad;
        
        // Para la sentencia Sql
        String strSqlStmt; // Para el Query
        
        // Ciclo para grabar el detalle de la venta
        for(iFila = 0; iFila < tbTicket.getRowCount();iFila++)
        {
            //Obtiene dato contenido en una celda de la tabla
            sCodigo = tbTicket.getModel().getValueAt(iFila, 0).toString();
            sCantidad = tbTicket.getModel().getValueAt(iFila, 1).toString();
            sUnidad = tbTicket.getModel().getValueAt(iFila, 2).toString();
            sDescripcion = tbTicket.getModel().getValueAt(iFila, 3).toString();
            sPrecioU = tbTicket.getModel().getValueAt(iFila, 4).toString();

                    // Prepara Query para grabar venta detalle
                    strSqlStmt = " insert into consulta_asistencial_detalle ";
                    strSqlStmt = strSqlStmt + "(cod_servicio,";
                    strSqlStmt = strSqlStmt + " nro_ticket,";
                    strSqlStmt = strSqlStmt + " precio,";
                    strSqlStmt = strSqlStmt + " unidad)";
                    strSqlStmt = strSqlStmt + " Values (";
                    strSqlStmt = strSqlStmt + "'"+sCodigo.toString()+"'";
                    strSqlStmt = strSqlStmt + ",'"+jTextField12.getText().toString().trim()+"'";
                    strSqlStmt = strSqlStmt + ",'"+sPrecioU.toString()+"'";
                    strSqlStmt = strSqlStmt + ","+sCantidad.toString()+")";
                    System.out.println(strSqlStmt);
                    // Ejecuta la Sentencia
                    if ( oConn.FnBoolQueryExecuteUpdate(strSqlStmt))
                    {
                        try {
                            // break;
                            oConn.sqlStmt.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
          
        
        }
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jRadioButton4.isSelected())
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed
 public void mostrar(){
           
    try {
        String [] titulos={"NRO TICKET","FECHA","MEDICO"};
        String [] registros = new String[3];
        String sql="select ca.nro_ticket,ca.fecha,ca.medico from consulta_asistencial AS ca\n" +
"inner join ticket_g as tg on ca.nro_ticket=tg.nro_ticket inner join paciente_asistencial\n" +
"as pa on tg.cod_pa=pa.cod_pa where tg.cod_pa=(select cod_pa from ticket_g where nro_ticket='"+jTextField12.getText().toString().trim()+"')";
         
        model = new DefaultTableModel(null,titulos)
        {@Override
        public boolean isCellEditable (int fila, int columna) {
            if (columna== 0)
                return false;
            return true;
        }
        };
        
        if (oConn.FnBoolQueryExecute(sql))
        {
            try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("nro_ticket");
                    registros[1]= oConn.setResult.getString("fecha");
                    registros[2]= oConn.setResult.getString("medico");
            
                    
                    model.addRow(registros);
                }
                System.out.println("registro 0"+registros[0]);
                
                tabla.setModel(model);
                //tabla.getColumn("Codigo").setPreferredWidth(10);
                
                
                oConn.setResult.close();
                //   System.out.println("la cantida de filas en hotel es"+tabla.getRowCount());
                
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }


}
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
      if(jRadioButton3.isSelected())
        jRadioButton4.setSelected(false);    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
           if(jRadioButton4.isSelected())
        {
           if(OrdenExiste_dni())
           {
           mostrar_paciente_dni();
           mostrar();
                         
           }
           else
     JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA ESE DNI REGISTRADO");

        }
        else
        {
            if(OrdenExiste_hp())
            {
                mostrar_paciente_hp();
              mostrar();

            }
            else
            {
                 JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA REGISTROS DE ESA HISTORIA C.");

            }
            
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
private void sbTicket(){
         // Declaro un modelo de datos
   ticket = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            if (columnIndex == 1) {
                return true;
            } else {
                return false;
            }
        }

    };
        ticket.addTableModelListener(new TableModelListener(){
            @Override
                    public void tableChanged(TableModelEvent e) {
                       if(e.getColumn() == 1){
                        //sumar();
                    }
                        }
                });
        // Añadimos columnas al modelo de datos
        ticket.addColumn("Cod");
        ticket.addColumn("Cant");
        ticket.addColumn("Unidad");
        ticket.addColumn("Descripción");
        ticket.addColumn("P.Unitario");
    
                
        // Coloca el Modelo en la Tabla
        tbTicket.setModel(ticket);
        
        // Directamente
        tbTicket.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(1).setPreferredWidth(5);
        tbTicket.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbTicket.getColumnModel().getColumn(3).setPreferredWidth(255);
        tbTicket.getColumnModel().getColumn(4).setPreferredWidth(10);
  
        tbTicket.getTableHeader().setReorderingAllowed(false);
        tbTicket.getTableHeader().setResizingAllowed(false);

       // tbBoleta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbTicket.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);        
        tbTicket.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(3).setCellRenderer(cellAlinear);
        tbTicket.getColumnModel().getColumn(4).setCellRenderer(cellAlinear);

        
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
mostrar_datos_servicio();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
           if (evt.getClickCount() == 2) {
       //     System.out.println("va entrar en el cod de 2 click");
            String cod = String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                        System.out.println("el cod es:"+cod);

       print(cod);
        //    System.out.println("paso en print");

        }
    }//GEN-LAST:event_tablaMousePressed
       private void print(String cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "fichaMedicaAsistencial.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("HISTORIA DEL PACIENTE");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                   
                 } catch (JRException ex) {
                    Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
       private void print1(String cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "fichaMedicaAsistencial.jasper";
                        //JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        //JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                      JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint,true);

                        
                       // JasperViewer viewer = new JasperViewer(myPrint, false);
                        //viewer.setTitle("HISTORIA DEL PACIENTE");
                        // viewer.setAlwaysOnTop(true);
                       // viewer.setVisible(true);
                   
                 } catch (JRException ex) {
                    Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 } 
       
    public void mostrar_datos_servicio(){
     
        String sQuery;

        sQuery  = "Select * from servicios_generales Where descripcion ='"+jComboBox1.getSelectedItem().toString()+"'";
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                 jTextField2.setText(oConn.setResult.getString("cod_servicio"));
                    jTextField3.setText(oConn.setResult.getString("precio"));
           
                 
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        
    }   
    public void mostrar_paciente_dni(){
     
        String sQuery;

        sQuery  = "Select *,tg.nro_ticket from paciente_asistencial as pa inner join ticket_g as tg on pa.cod_pa=tg.cod_pa Where tg.cod_pa ="+jTextField5.getText().toString().trim()
               +" order by tg.nro_ticket desc limit 1" ;
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                 txtNombre.setText(oConn.setResult.getString("nombres"));
                    txtApellidos.setText(oConn.setResult.getString("apellidos"));
                    jTextField1.setText(oConn.setResult.getString("edad"));
                    jTextField12.setText(oConn.setResult.getString("nro_ticket"));
                 
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        
    }
     
    public void mostrar_paciente_hp(){
     
        String sQuery;

        sQuery  = "Select *,nro_ticket from paciente_asistencial as pa inner join ticket_g as tg on pa.cod_pa=tg.cod_pa Where historia_clinica ="+jTextField5.getText().toString().trim()
                +"order by tg.nro_ticket desc limit 1 ";
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                 txtNombre.setText(oConn.setResult.getString("nombres"));
                    txtApellidos.setText(oConn.setResult.getString("apellidos"));
                    jTextField1.setText(oConn.setResult.getString("edad"));
                    jTextField12.setText(oConn.setResult.getString("nro_ticket"));
                 
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        
    }
    public boolean OrdenExiste_dni()
    {
        boolean bResultado=false;
        if(!jTextField5.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select cod_pa from paciente_asistencial Where cod_pa ="+jTextField5.getText().toString().trim();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        }
        else
                  JOptionPane.showMessageDialog(null, "NO SE LLENO EL CAMPO DE DNI/Historia P");
        return bResultado;
        }
      public boolean OrdenExiste_hp()
    {
        boolean bResultado=false;
        if(!jTextField5.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select historia_clinica from paciente_asistencial Where historia_clinica ="+jTextField5.getText().toString().trim();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        }
        else
                  JOptionPane.showMessageDialog(null, "NO SE LLENO EL CAMPO DE DNI/Historia P.");
        return bResultado;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private com.toedter.calendar.JDateChooser Fdesde;
    private javax.swing.JButton btnGuardarFicha;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tbTicket;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
