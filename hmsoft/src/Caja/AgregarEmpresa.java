package Caja;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;
/**
 *
 * @author Richard Garcia
 */
public final class AgregarEmpresa extends javax.swing.JDialog {
    public static RegistrarCliente registrar;
       clsFunciones  oFunc = new clsFunciones();
      clsConnection oConn = new clsConnection();
      String[]veDatos = new String[]{};
     DefaultTableModel model;
   
     BufferedImage buf=null;
     String fullText;
     String razonsocial,primerafila;
     String direccion;
     int controlador;
    public AgregarEmpresa(RegistrarCliente parent, boolean modal) {
        //super(parent, modal);
        AgregarEmpresa.registrar = parent;
        this.setModal(modal);
        initComponents();
        Limpiar();
      //  iniciar();
       sbTablaEmpresa();
       sbCargarDatosEmpresa("");
       desactivarBotones();
          setLocationRelativeTo(this);
        KeyboardFocusManager kb = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kb.addKeyEventPostProcessor(new KeyEventPostProcessor(){
            @Override
            public boolean postProcessKeyEvent(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE && this != null){
                       dispose();
                    return false;
                }
                return true;
            }
});
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefonos = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarRazonSocial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpresas = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agrege su Empresa y ESC para Cerrar");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agregar Empresa"));

        jLabel1.setText("RUC:");

        jLabel2.setText("Razón Social :");

        jLabel3.setText("Dirección :");

        jLabel4.setText("Teléfonos :");

        jLabel5.setText("Responsable :");

        jLabel6.setText("Email :");

        txtRUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRUCMouseClicked(evt);
            }
        });
        txtRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUCActionPerformed(evt);
            }
        });
        txtRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUCKeyTyped(evt);
            }
        });

        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });

        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDireccionMouseClicked(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonosMouseClicked(evt);
            }
        });
        txtTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonosActionPerformed(evt);
            }
        });

        txtResponsable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResponsableMouseClicked(evt);
            }
        });
        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });

        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setMnemonic('l');
        btnActualizar.setText("Acualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnEliminar.setMnemonic('e');
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("Razón Social :");

        txtBuscarRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRazonSocialKeyReleased(evt);
            }
        });

        tbEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbEmpresas.getTableHeader().setReorderingAllowed(false);
        tbEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbEmpresasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbEmpresas);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setMnemonic('c');
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        jButton1.setText("Exportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtResponsable)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(255, 255, 255))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)))
                        .addGap(16, 16, 16)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       txtEmail.setText(txtEmail.getText().replaceAll(" +", " ").trim());
        if(txtRUC.getText().isEmpty()| txtRazonSocial.getText().isEmpty())
        {
            oFunc.SubSistemaMensajeError("Los datos RUC y Razón Social so Necesarios");
            }   
    else{
        AgregarEmpresa();
        Limpiar();
        
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String sCodigo;
        String sQuery;
      //  int iResult;
        
       
        // Valida que esté seleccionado  un dato
        if (tbEmpresas.getSelectedRow()>=0)
        {
             // Confirmación de la Eliminación
             if (oFunc.fnIntSistemaPregunta("Desea realmente eliminar el Registro")==JOptionPane.YES_OPTION)
             {     
                // Variable para el modelo de la tabla
                DefaultTableModel tblDatos = (DefaultTableModel) tbEmpresas.getModel();

                // Obtengo el Codigo de la celda
                sCodigo = tblDatos.getValueAt(tbEmpresas.getSelectedRow(),0).toString();

                // Prepara el Query para Borrar
                sQuery = "Delete from empresas Where ruc_empresa='"+sCodigo+"'";

                if (oConn.FnBoolQueryExecuteUpdate(sQuery))
                   oFunc.SubSistemaMensajeInformacion("El Producto ha sido eliminado");
                Limpiar();

                // Carga los productos al terminar        
                sbCargarDatosEmpresa("");
             }
        }
        else
            oFunc.SubSistemaMensajeError("Seleccione un Producto");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCKeyTyped
        int key = evt.getKeyChar();
    boolean numeros = (key >= 48 && key <= 57 )||key==10 ||key==8;
       
    if (!numeros )
    {
        if(key==10 && txtRUC.getText().length()==11){
            txtRazonSocial.requestFocus();    
        }else{
           evt.consume();
        oFunc.SubSistemaMensajeError("SOLO ADMITE NUMEROS"); 
        }
    }
       if (txtRUC.getSelectedText() != null) { // See if they selected something 
           String s = txtRUC.getSelectedText();
//        oFunc.SubSistemaMensajeInformacion(s);
        }else{
        if(txtRUC.getText().trim().length()==11){
//            txtRUC.requestFocus();
            evt.consume();
          if(OrdenExiste()){oFunc.SubSistemaMensajeError("RUC REGISTRADO");}
          
        }
       }
    }//GEN-LAST:event_txtRUCKeyTyped

    private void txtBuscarRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRazonSocialKeyReleased
         sbCargarDatosEmpresa(txtBuscarRazonSocial.getText());
    }//GEN-LAST:event_txtBuscarRazonSocialKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
          Limpiar();
          desactivarBotones();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbEmpresasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpresasMousePressed
       String sCodigo;
       String sConsulta; 
         DefaultTableModel tblDatos = (DefaultTableModel) tbEmpresas.getModel();
         sCodigo = tblDatos.getValueAt(tbEmpresas.getSelectedRow(),0).toString();
         sConsulta="select * from empresas where ruc_empresa ='"+sCodigo+ "'";
         if (oConn.FnBoolQueryExecute(sConsulta))
        {
            try 
            {
                // Verifica resultados
                 while (oConn.setResult.next())
                 {
                     
                     // Obtiene los datos de la Consulta
                     txtRUC.setText(oConn.setResult.getString ("ruc_empresa"));
                     txtRazonSocial.setText(oConn.setResult.getString ("razon_empresa"));
                     txtDireccion.setText(oConn.setResult.getString ("direccion_empresa"));
                     txtTelefonos.setText(oConn.setResult.getString ("telefono_empresa"));
                     txtResponsable.setText(oConn.setResult.getString ("responsable_empresa"));
                     txtEmail.setText(oConn.setResult.getString ("email_empresa"));
                       btnAgregar.setEnabled(false);
                       btnActualizar.setEnabled(true);
                     
                 }
                 
               
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(rootPane,ex);
                Logger.getLogger(AgregarEmpresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (evt.getClickCount() == 2) 
        {  
            String razon  = tblDatos.getValueAt(tbEmpresas.getSelectedRow(),1).toString();
            registrar.addempresa(razon);
            Limpiar();
            dispose();
            
        }
        activarBotones();
    }//GEN-LAST:event_tbEmpresasMousePressed

 public void calcular(){
    String pasar;
    pasar=primerafila.substring(13, primerafila.length()-1);
    txtRazonSocial.setText(pasar.trim());
    txtDireccion.setText(direccion.trim());
    }
  
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

}


    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
  dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
       update();
    }//GEN-LAST:event_btnActualizarMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(!txtRUC.getText().isEmpty()){
        update();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUCActionPerformed
       if (!OrdenExiste()){
            if (txtRUC.getText().trim().length() < 11) {
                oFunc.SubSistemaMensajeError("REVISAR RUC");
                txtRUC.requestFocus();
            } else {
                activarBotones();
                txtRazonSocial.requestFocus();
            }
        } else {
           oFunc.SubSistemaMensajeError("RUC REGISTRADO");   
        }
    }//GEN-LAST:event_txtRUCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generar(tbEmpresas);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRUCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRUCMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtRUCMouseClicked

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed
       txtDireccion.requestFocus();        // TODO add your handling code here:
     txtRazonSocial.setText(txtRazonSocial.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtRazonSocialActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
         txtTelefonos.requestFocus();        // TODO add your handling code here:
    txtDireccion.setText(txtDireccion.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonosActionPerformed
        txtResponsable.requestFocus();        // TODO add your handling code here:
       txtTelefonos.setText(txtTelefonos.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtTelefonosActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        btnAgregar.requestFocusInWindow();        // TODO add your handling code here:
txtEmail.setText(txtEmail.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        // TODO add your handling code here:
        txtEmail.requestFocus();        // TODO add your handling code here:
     txtResponsable.setText(txtResponsable.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        if (txtRazonSocial.getText().isEmpty()) {
            if (k == 32) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "No puede ingresar Espacios!!!", "Ventana Error Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtRazonSocialKeyTyped

    private void txtDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMouseClicked
        // TODO add your handling code here:
        txtRazonSocial.setText(txtRazonSocial.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtDireccionMouseClicked

    private void txtTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonosMouseClicked
        // TODO add your handling code here:
        txtDireccion.setText(txtDireccion.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtTelefonosMouseClicked

    private void txtResponsableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResponsableMouseClicked
        // TODO add your handling code here:
         txtTelefonos.setText(txtTelefonos.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtResponsableMouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        // TODO add your handling code here:
        txtResponsable.setText(txtResponsable.getText().replaceAll(" +", " ").trim());
    }//GEN-LAST:event_txtEmailMouseClicked
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(AgregarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                AgregarEmpresa dialog = new AgregarEmpresa(registrar, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEmpresas;
    private javax.swing.JTextField txtBuscarRazonSocial;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTelefonos;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
txtBuscarRazonSocial.setText(null);
txtRUC.setText(null);
txtRazonSocial.setText(null);
txtDireccion.setText(null);
txtTelefonos.setText(null);
txtResponsable.setText(null);
txtEmail.setText(null);
sbCargarDatosEmpresa("");
txtRUC.requestFocus();
btnActualizar.setEnabled(false);
btnAgregar.setEnabled(true);

}
public void AgregarEmpresa(){
String strSqlStmt;
             String Query ;
            strSqlStmt="Insert INTO empresas (";
            Query="Values('";
             if (txtRUC.getText().trim().length()>= 1 ){
              strSqlStmt += "ruc_empresa";
              Query += txtRUC.getText().toString()+ "'";
            } 
            if (txtRazonSocial.getText().trim().length()> 1 ){
              strSqlStmt+= ",razon_empresa";
              Query+= ",'" + txtRazonSocial.getText().toString()+"'"; 
            }
            if (txtDireccion.getText().trim().length()> 1 ){
              strSqlStmt+= ",direccion_empresa";
              Query+= ",'" + txtDireccion.getText().toString()+"'"; 
            }
            if (txtTelefonos.getText().trim().length()> 1 ){
              strSqlStmt+= ",telefono_empresa";
              Query+= ",'" + txtTelefonos.getText().toString()+"'"; 
            }
            if (txtResponsable.getText().trim().length()> 1 ){
              strSqlStmt+= ",responsable_empresa";
              Query+= ",'" + txtResponsable.getText().toString()+"'"; 
            }
            if (txtEmail.getText().trim().length()> 1 ){
              strSqlStmt+= ",email_empresa";
              Query+= ",'" + txtEmail.getText().toString()+"'"; 
            }
            
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
             oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");}
             
             else {
                 oFunc.SubSistemaMensajeError("Imposible registrar RUC: "+txtRUC.getText()+"Puede que se encuentre Duplicaco ");
             
             }
 }
void sbCargarDatosEmpresa(String valor){
    String [] titulos={"RUC","Raz. Social","Dirección"};
    String [] registros = new String[3];
    String sql="select ruc_empresa, razon_empresa, direccion_empresa from empresas where CONCAT(ruc_empresa,' ',razon_empresa) LIKE '%"+valor+"%' ORDER BY razon_empresa";
      model = new DefaultTableModel(null,titulos);       
    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("ruc_empresa");
                    registros[1]= oConn.setResult.getString("razon_empresa");
                    registros[2]= oConn.setResult.getString("direccion_empresa");
                     model.addRow(registros);
                }
                 
                  // Coloca el Modelo de Nueva Cuenta
                  tbEmpresas.setModel(model);
                
             
                 // Cierra Resultados
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
private void sbTablaEmpresa        ()
    {
        // Declaro un modelo de datos
        DefaultTableModel modelo = new DefaultTableModel();      
                
        // Añadimos columnas al modelo de datos
        modelo.addColumn("RUC");
        modelo.addColumn("Raz. Social");
        modelo.addColumn("Dirección");
       
                
        // Coloca el Modelo en la Tabla
        tbEmpresas.setModel(modelo);
        
        // Directamente
        tbEmpresas.getColumn("RUC").setWidth(3);     
        tbEmpresas.getColumn("Raz. Social").setWidth(140);
        tbEmpresas.getColumn("Raz. Social").setPreferredWidth(140);
        tbEmpresas.getColumn("Dirección").setWidth(40);
        tbEmpresas.getColumn("Dirección").setPreferredWidth(40);
      
        
        tbEmpresas.setFont(new java.awt.Font("Tahoma", 0, 11)); 
       
        // Alinear a la derecha las cantidades y precios
        DefaultTableCellRenderer cellAlinear = new DefaultTableCellRenderer();
        
        // Asignamos el Alineamiento Horizontal a la derecha
        cellAlinear.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // Asignamos la Variable de celda de alineamiento a cada una de las columnas a alinear
        tbEmpresas.getColumnModel().getColumn(0).setCellRenderer(cellAlinear);
        tbEmpresas.getColumnModel().getColumn(1).setCellRenderer(cellAlinear);
        tbEmpresas.getColumnModel().getColumn(2).setCellRenderer(cellAlinear);
        // Color de los Encabezados
        //jtTicket.getTableHeader().setBackground(Color.lightGray);
        //jtTicket.getTableHeader().setForeground(Color.blue);
        tbEmpresas.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 11)); 
   
        // Remueve la Columna de la Vista
        //jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(4));
                
    }
private void update(){
   
        String strSqlStmt ="UPDATE empresas "
        + "SET razon_empresa='"+txtRazonSocial.getText().toString()+
                "', direccion_empresa='"+txtDireccion.getText().toString()+
                "', telefono_empresa='"+txtTelefonos.getText().toString()+
                "', responsable_empresa='"+txtResponsable.getText().toString()+
                "', email_empresa='"+txtEmail.getText().toString()+ 
                "' WHERE ruc_empresa = '"+txtRUC.getText().toString()+"'";
        oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
           sbCargarDatosEmpresa("");
          oFunc.SubSistemaMensajeInformacion("Actualizado Correctamente");
        
          Limpiar();
        
          }
    
}
void activarBotones(){
    txtRazonSocial.setEnabled(true);
    txtDireccion.setEnabled(true);
    txtTelefonos.setEnabled(true);
    txtResponsable.setEnabled(true);
    txtEmail.setEnabled(true);
    txtRazonSocial.requestFocus();
}
void desactivarBotones(){
    txtRazonSocial.setEnabled(false);
    txtDireccion.setEnabled(false);
    txtTelefonos.setEnabled(false);
    txtResponsable.setEnabled(false);
    txtEmail.setEnabled(false);
    txtRUC.requestFocus();
}
public boolean OrdenExiste(){
        boolean bResultado=false;
        if(!txtRUC.getText().isEmpty()){
        String sQuery;

        sQuery  = "Select ruc_empresa from empresas Where ruc_empresa ='"+txtRUC.getText()+"'";
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
        return bResultado;
        }
}
