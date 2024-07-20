/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Caja.RegistrarCliente;
import Caja.Reporteador;
import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author PC-HORIZONTE MEDIC
 */
public class Contabilidad extends javax.swing.JInternalFrame {

    /**
     * Creates new form Contabilidad
     */
    clsConnection oConn1 = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
    DefaultTableModel model,model1;
    String num, agregarConsulta = "";
    int codigosede, pkprotocolo, codigo_norden, operacion;
    String nomsede, rucempresa, nombreempresa, ruccontrata, nombrecontrata;
    Ingreso objet = new Ingreso();
    public Contabilidad() {
        initComponents();
       sbCargarOcupacional("");
       sbCargarContabilidad("");
       cargarContratas();
       cargarEmpresas();
         AutoCompleteDecorator.decorate(this.contrata);
         AutoCompleteDecorator.decorate(this.empresa);
//         cPersonalizada("");
    }
private void cargarContratas(){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="SELECT UPPER(razon_contrata) AS razon_contrata FROM contratas;";
                
                if (oConn1.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn1.setResult.next())
                        {
                            // Obtiene los datos de la Consulta
                            contrata.addItem(oConn1.setResult.getString ("razon_contrata"));
                            
                        }
                        
                        // Cierra Resultados
                        oConn1.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
                contrata.setSelectedIndex(0);
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }
}
  private void cargarEmpresas(){
            try {
                String sQuery;
                // Prepara el Query
                sQuery ="SELECT UPPER(razon_empresa) AS razon_empresa FROM empresas";
                
                if (oConn1.FnBoolQueryExecute(sQuery))
                {
                    try
                    {
                        // Verifica resultados
                        while (oConn1.setResult.next())
                        {
                            // Obtiene los datos de la Consulta
                            empresa.addItem(oConn1.setResult.getString ("razon_empresa"));
                            
                        }
                        
                        // Cierra Resultados
                        oConn1.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        //JOptionPane.showMessageDialorootPane,ex);
                        oFunc.SubSistemaMensajeInformacion(ex.toString());
                        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // selecciona
                empresa.setSelectedIndex(0);
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Fhasta = new com.toedter.calendar.JDateChooser();
        Fdesde = new com.toedter.calendar.JDateChooser();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        jCheckBox11 = new javax.swing.JCheckBox();
        txtBuscarCod = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        btnExportarExel = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNorden = new javax.swing.JTextField();
        txtNFactura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechaFac = new com.toedter.calendar.JDateChooser();
        FechaVenc = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtMontoFac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNOperac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBancoEmis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPagoCuenta = new javax.swing.JTextField();
        cboEstado = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FechPago = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Fhasta1 = new com.toedter.calendar.JDateChooser();
        Fdesde1 = new com.toedter.calendar.JDateChooser();
        btnMostrar1 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarNombre1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtBuscarCod1 = new javax.swing.JTextField();
        btnExportarExel1 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbReporte1 = new javax.swing.JTable();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        contrata = new javax.swing.JComboBox();
        empresa = new javax.swing.JComboBox();

        setClosable(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personalizada"));

        jLabel18.setText("Desde :");

        jLabel19.setText("Hasta :");

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre :");

        txtBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarNombreMousePressed(evt);
            }
        });
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        jCheckBox11.setSelected(true);
        jCheckBox11.setText("Solo mi sede");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        txtBuscarCod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarCodMousePressed(evt);
            }
        });
        txtBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCodActionPerformed(evt);
            }
        });
        txtBuscarCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodKeyReleased(evt);
            }
        });

        jLabel41.setText("Codigo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fhasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(btnMostrar)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fhasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnLimpiar1)
                    .addComponent(jCheckBox11)
                    .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
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
        tbReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbReporteMousePressed(evt);
            }
        });
        tbReporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbReporteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbReporteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbReporte);

        jTabbedPane1.addTab("CARGA MASIVA", jScrollPane1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Contabilidad "));

        jLabel1.setText("N° Factura");

        jLabel2.setText("Fecha Fac.");

        jLabel3.setText("N° Orden");

        jLabel5.setText("Fecha Venc.");

        jLabel6.setText("Monto Fac.");

        jLabel7.setText("N° Operac.");

        jLabel8.setText("Banco Emisor");

        jLabel9.setText("Pago Cuenta");

        cboEstado.setEditable(true);
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDIENTE", "PAGADO" }));
        cboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEstadoItemStateChanged(evt);
            }
        });
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Estado");

        jLabel11.setText("Fecha Pago");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        jScrollPane2.setViewportView(txtObservaciones);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton2.setText("Grabar/ Actualizar Pago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(txtPagoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FechaFac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(FechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNOperac, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMontoFac, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBancoEmis, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(FechPago, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addComponent(FechaFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(FechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMontoFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNOperac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBancoEmis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPagoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(FechPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnExportarExel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExportarExel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("CARGA MASIVA");

        jTabbedPane2.addTab("REGISTRO FACTURAS", jPanel3);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personalizada"));

        jLabel20.setText("Desde :");

        jLabel21.setText("Hasta :");

        btnMostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar1.setText("Mostrar");
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });

        btnLimpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Nombre :");

        txtBuscarNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarNombre1MousePressed(evt);
            }
        });
        txtBuscarNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombre1ActionPerformed(evt);
            }
        });
        txtBuscarNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombre1KeyReleased(evt);
            }
        });

        jLabel42.setText("Codigo:");

        txtBuscarCod1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarCod1MousePressed(evt);
            }
        });
        txtBuscarCod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCod1ActionPerformed(evt);
            }
        });
        txtBuscarCod1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCod1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(19, 19, 19)
                        .addComponent(txtBuscarNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarCod1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fhasta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Fdesde1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fdesde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(btnMostrar1)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel12))
                        .addComponent(txtBuscarNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fhasta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(btnLimpiar2)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscarCod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnExportarExel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel1.setText("Exportar");
        btnExportarExel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExel1ActionPerformed(evt);
            }
        });

        tbReporte1.setModel(new javax.swing.table.DefaultTableModel(
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
        tbReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbReporte1MousePressed(evt);
            }
        });
        tbReporte1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbReporte1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbReporte1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbReporte1);

        jTabbedPane3.addTab("REPORTE CONTABILIDAD", jScrollPane3);

        jCheckBox12.setSelected(true);
        jCheckBox12.setText("Solo mi sede");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jLabel13.setText("Empresa :");

        jLabel14.setText("Contrata :");

        contrata.setEditable(true);
        contrata.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        contrata.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                contrataPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        contrata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contrataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contrataMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrataMousePressed(evt);
            }
        });
        contrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrataActionPerformed(evt);
            }
        });
        contrata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contrataKeyPressed(evt);
            }
        });

        empresa.setEditable(true);
        empresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        empresa.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                empresaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empresaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empresaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empresaMousePressed(evt);
            }
        });
        empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaActionPerformed(evt);
            }
        });
        empresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empresaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnExportarExel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrata, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExportarExel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(contrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("REPORTES", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreMousePressed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        sbCargarOcupacional(txtBuscarNombre.getText().toString());
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void tbReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReporteMousePressed
        if (evt.getClickCount() == 1) {
//            AltaDesabilitar();
            Integer cod = Integer.valueOf(tbReporte.getValueAt(tbReporte.getSelectedRow(), 0).toString());
            String Sql = "select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,n.razon_empresa,n.razon_contrata,n.nom_examen,\n" +
"       n.precio_po,n. precio_adic,n.tipo_pago,n.autoriza,n.n_operacion,n.txtobserv1, n.txtobserv2,c_n_orden, c.c_n_factura, c.c_fecha_facv, \n" +
"       c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco, c.c_cuenta,c.c_estado, c.c_fecha_pago, c.c_observaciones\n" +
"FROM datos_paciente AS d \n" +
"INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n" +
"INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden)"
                        + "WHERE c.c_n_orden = " + cod + agregarConsulta;
            //      System.out.println("la consulta es:"+Sql);

            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    
                    txtNorden.setText(oConn1.setResult.getString("c_n_orden"));
                    FechaFac.setDate(oConn1.setResult.getDate("c_fecha_facv"));
                    FechaVenc.setDate(oConn1.setResult.getDate("c_fecha_venc")); 
                    txtMontoFac.setText(oConn1.setResult.getString("c_monto_fac"));
                    txtNOperac.setText(oConn1.setResult.getString("c_num_ope"));
                    txtPagoCuenta.setText(oConn1.setResult.getString("c_cuenta"));
                    cboEstado.setSelectedItem(oConn1.setResult.getString("c_estado"));
                    FechPago.setDate(oConn1.setResult.getDate("c_fecha_pago"));
                    txtObservaciones.setText(oConn1.setResult.getString("c_observaciones"));
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_tbReporteMousePressed

    private void tbReporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbReporteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbReporteKeyPressed

    private void tbReporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbReporteKeyReleased
        
    }//GEN-LAST:event_tbReporteKeyReleased

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        if (jCheckBox11.isSelected()) {
            agregarConsulta = "";
            agregarConsulta = " and n.cod_sede=" + codigosede;
        } else {
            agregarConsulta = "";
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void cboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEstadoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoItemStateChanged

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ActualizarReporte();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        cPersonalizada();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        LimpiarPersonalizado();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed

        if(this.tbReporte.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(tbReporte);
    }//GEN-LAST:event_btnExportarExelActionPerformed

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
        // TODO add your handling code here:
        cPersonalizada1();
    }//GEN-LAST:event_btnMostrar1ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        // TODO add your handling code here:
        LimpiarPersonalizado1();
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void txtBuscarNombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombre1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombre1MousePressed

    private void txtBuscarNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombre1ActionPerformed

    private void txtBuscarNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombre1KeyReleased
        // TODO add your handling code here:
        sbCargarContabilidad(txtBuscarNombre1.getText().toString());
    }//GEN-LAST:event_txtBuscarNombre1KeyReleased

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void btnExportarExel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExel1ActionPerformed
        // TODO add your handling code here:
        if(this.tbReporte1.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        generar(tbReporte1);
    }//GEN-LAST:event_btnExportarExel1ActionPerformed

    private void tbReporte1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReporte1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbReporte1MousePressed

    private void tbReporte1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbReporte1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbReporte1KeyPressed

    private void tbReporte1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbReporte1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbReporte1KeyReleased

    private void txtBuscarCodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodMousePressed
        // sbCargarOcupacional(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodMousePressed

    private void txtBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCodActionPerformed
        sbCargarOcupacional(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodActionPerformed

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased

        sbCargarOcupacional(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void txtBuscarCod1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCod1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCod1MousePressed

    private void txtBuscarCod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCod1ActionPerformed

    private void txtBuscarCod1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCod1KeyReleased
        // TODO add your handling code here:
        sbCargarContabilidad(txtBuscarCod1.getText());
    }//GEN-LAST:event_txtBuscarCod1KeyReleased

    private void contrataPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_contrataPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_contrataPopupMenuWillBecomeInvisible

    private void contrataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrataMouseClicked

    }//GEN-LAST:event_contrataMouseClicked

    private void contrataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrataMouseEntered

    }//GEN-LAST:event_contrataMouseEntered

    private void contrataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrataMousePressed

    }//GEN-LAST:event_contrataMousePressed

    private void contrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrataActionPerformed

    }//GEN-LAST:event_contrataActionPerformed

    private void contrataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrataKeyPressed

    }//GEN-LAST:event_contrataKeyPressed

    private void empresaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_empresaPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_empresaPopupMenuWillBecomeInvisible

    private void empresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaMouseClicked

    }//GEN-LAST:event_empresaMouseClicked

    private void empresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaMouseEntered

    }//GEN-LAST:event_empresaMouseEntered

    private void empresaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaMousePressed

    }//GEN-LAST:event_empresaMousePressed

    private void empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaActionPerformed

    }//GEN-LAST:event_empresaActionPerformed

    private void empresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empresaKeyPressed

    }//GEN-LAST:event_empresaKeyPressed
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private void cPersonalizada(String valor){
         try {        
             model = new DefaultTableModel() {
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     if (columnIndex == 9) {

                         return true;
                     }

                     if (columnIndex == 10) {
//                    sumar();
                         return true;
                     } else {
                         return false;
                     }
                 }
             };
              String vSql="select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,n.razon_empresa,n.razon_contrata,n.nom_examen,\n"
                         + "n.precio_po,n. precio_adic,n.tipo_pago,n.autoriza,n.n_operacion,n.txtobserv1, n.txtobserv2, c.c_n_factura, c.c_fecha_facv, \n"
                         + "c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                         + "FROM datos_paciente AS d \n"
                         + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                         + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden)\n";
                         
                     vSql +=" WHERE fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                 
                     vSql +=" AND fecha_apertura_po<= '"+Fhasta.getDate().toString()+"'";
               
             //oFunc.SubSistemaMensajeInformacion(vSql);
             
             if (oConn1.FnBoolQueryExecute(vSql))
             {
                 try  {
                     java.sql.ResultSetMetaData rsmt = oConn1.setResult.getMetaData();
                     int CantidaColumnas = rsmt.getColumnCount();
                     for (int i = 1; i <= CantidaColumnas; i++) {
                         model.addColumn(rsmt.getColumnLabel(i));
                     }
                     while (oConn1.setResult.next())
                     {
                         Object [] Fila = new Object[CantidaColumnas];
                         
                         for (int i = 0; i < CantidaColumnas; i++) {
                             Fila[i] = oConn1.setResult.getObject(i+1);
//                             if(i==3){
//                                 Fila[i]=formato.format(oConn1.setResult.getDate("FECHAEMISION"));
//                             }
                             
//                             if(i==10){
//                                 if(oConn1.setResult.getDate("FECHACANCELACION")!= null){
//                                     Fila[i]= formato.format(oConn1.setResult.getDate("FECHACANCELACION"));
//                                 }else{
//                                     Fila[i]= " ";
//                                 }
//                             }
                             
                             
                             
                         }
                         model.addRow(Fila);
                     }
                     tbReporte.setDefaultRenderer(Object.class, new MyCellRenderer());
//                     tbReporte = autoResizeColWidth(tbReporte, model);
                     tbReporte.setModel(model);
                     tabla();
                 }
                 catch (SQLException ex)
                 {
                     oFunc.SubSistemaMensajeError(ex.toString());
                     Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             oConn1.setResult.close();
             oConn1.sqlStmt.close();
         } catch (SQLException ex) {
             Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
         }

    }
    void sbCargarOcupacional(String valor) {
        try {  
            String[] titulos = {"N°Orden", "Nombres", "Fecha", "Empresa", "Contrata", "T.Examen","Precio_exa","Precio_Adic.","Tipo_Pago","Autoriza","N°ope","Obser1","Obser2","Estado"};
            String[] registros = new String[14];
            model = new DefaultTableModel(null, titulos) {
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     if (columnIndex == 5) {
                         return true;
                     }
                     if (columnIndex == 6) {
//                    sumar();
                         return true;
                     } else{
                         return false;
                     }
                     
                 }
             };
            String Sql;
            if (!txtBuscarCod.getText().isEmpty()) {
                // System.out.println("si es este el error ");
                Sql = "select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,n.razon_empresa,n.razon_contrata,n.nom_examen,\n"
                        + "       n.precio_po,n. precio_adic,n.tipo_pago,n.autoriza,n.n_operacion,n.txtobserv1, n.txtobserv2, c.c_n_factura, c.c_fecha_facv, \n"
                        + "       c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                        + "FROM datos_paciente AS d \n"
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                        + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden)"
                        + "where n.n_orden=" + valor + agregarConsulta;
            } else {
                Sql = "select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,n.razon_empresa,n.razon_contrata,n.nom_examen,\n"
                        + "       n.precio_po,n. precio_adic,n.tipo_pago,n.autoriza,n.n_operacion,n.txtobserv1, n.txtobserv2, c.c_n_factura, c.c_fecha_facv, \n"
                        + "       c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                        + "FROM datos_paciente AS d \n"
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                        + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden) "
                        + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%" + valor + "%' " + agregarConsulta
                        + " order by n.n_orden desc limit 100";
            }
                System.out.println("la consulta es:"+Sql);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            if (oConn1.FnBoolQueryExecute(Sql)) {
                try {
                    while (oConn1.setResult.next()) {
                        registros[0] = oConn1.setResult.getString("n_orden");
                        registros[1] = oConn1.setResult.getString("nombres");
                        registros[2] = formato.format(oConn1.setResult.getDate("fecha_apertura_po"));
                        registros[3] = oConn1.setResult.getString("razon_empresa");
                        registros[4] = oConn1.setResult.getString("razon_contrata");
                        String exa = oConn1.setResult.getString("nom_examen");
                        registros[5] = exa;
                        registros[6] = oConn1.setResult.getString("precio_po");
                        registros[7]= oConn1.setResult.getString("precio_adic");
                        registros[8] = oConn1.setResult.getString("tipo_pago");
                        registros[9] = oConn1.setResult.getString("autoriza");
                        registros[10] = oConn1.setResult.getString("n_operacion");
                        registros[11] = oConn1.setResult.getString("txtobserv1");
                        registros[12] = oConn1.setResult.getString("txtobserv2");
                        registros[13] = oConn1.setResult.getString("c_estado");
                        tbReporte.setDefaultRenderer(Object.class, new MyCellRenderer());
                        model.addRow(registros);
                    }
                    // Coloca el Modelo de Nueva Cuenta
                    tbReporte.setModel(model);
                    tabla();
                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    void sbCargarContabilidad(String valor) {
        try {  
            String[] titulos1 = {"N°Orden", "Nombres","Empresa", "Contrata", "T.Examen","N° Factura","F.Factura","F.Vencimiento","M.Facturado","N°ope","Banco","N°Cuenta","Estado","F.Pago", "Observ"};
            String[] registros1 = new String[15];
            model1 = new DefaultTableModel(null, titulos1) {
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                 }
             };
            String Sql;
            if (!txtBuscarCod1.getText().isEmpty()) {
                // System.out.println("si es este el error ");
                Sql = "select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres,n.razon_empresa,n.razon_contrata,n.nom_examen,c.c_n_factura, c.c_fecha_facv, \n"
                        + "       c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco,c.c_cuenta, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                        + "FROM datos_paciente AS d \n"
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                        + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden)"
                        + "where n.n_orden=" + valor + agregarConsulta;
            } else {
                Sql = "select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres,n.razon_empresa,n.razon_contrata,n.nom_examen,c.c_n_factura, c.c_fecha_facv, \n"
                        + "       c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco,c.c_cuenta, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                        + "FROM datos_paciente AS d \n"
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                        + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden) "
                        + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%" + valor + "%' " + agregarConsulta
                        + " order by n.n_orden desc limit 100";
            }
                System.out.println("la consulta es:"+Sql);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            if (oConn1.FnBoolQueryExecute(Sql)) {
                try {
                    while (oConn1.setResult.next()) {
                        registros1[0] = oConn1.setResult.getString("n_orden");
                        registros1[1] = oConn1.setResult.getString("nombres");
                        registros1[2] = oConn1.setResult.getString("razon_empresa");
                        registros1[3] = oConn1.setResult.getString("razon_contrata");
                        String exa = oConn1.setResult.getString("nom_examen");
                        registros1[4] = exa;
                        registros1[5] = oConn1.setResult.getString("c_n_factura");
                        registros1[6]= oConn1.setResult.getString("c_fecha_facv");
                        registros1[7] = oConn1.setResult.getString("c_fecha_venc");
                        registros1[8] = oConn1.setResult.getString("c_monto_fac");
                        registros1[9] = oConn1.setResult.getString("c_num_ope");
                        registros1[10] = oConn1.setResult.getString("c_banco");
                        registros1[11] = oConn1.setResult.getString("c_cuenta");
                        registros1[12] = oConn1.setResult.getString("c_estado");
                        registros1[13] = oConn1.setResult.getString("c_fecha_pago");
                        registros1[14] = oConn1.setResult.getString("c_observaciones");
                        
                        tbReporte1.setDefaultRenderer(Object.class, new MyCellRenderer1());
                        model1.addRow(registros1);
                    }
                    // Coloca el Modelo de Nueva Cuenta
                    tbReporte1.setModel(model1);
                    tabla1();
                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public class MyCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            boolean valid = String.valueOf(table.getValueAt(row, 13)).equals("PAGADO");
            boolean valid0 = String.valueOf(table.getValueAt(row, 13)).equals("PENDIENTE");
            component.setBackground(valid ? Color.green : valid0 ? Color.ORANGE : Color.WHITE);
            
//        component.setForeground(valid ? Color.blue : Color.white);
            return component;
        }
    }
public class MyCellRenderer1 extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            boolean valid = String.valueOf(table.getValueAt(row, 12)).equals("PAGADO");
            boolean valid0 = String.valueOf(table.getValueAt(row, 12)).equals("PENDIENTE");
            component.setBackground(valid ? Color.green : valid0 ? Color.ORANGE : Color.WHITE);
            
//        component.setForeground(valid ? Color.blue : Color.white);
            return component;
        }
    }
    void tabla() {
        tbReporte.setFont(new java.awt.Font("Tahoma", 0, 11));
        tbReporte.setModel(model);
        tbReporte.setSelectionForeground(Color.BLUE);
        tbReporte.getColumnModel().getColumn(0).setPreferredWidth(30);
//      tbOcupacional.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbReporte.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbReporte.getTableHeader().setReorderingAllowed(false);
        
        
    }
     void tabla1() {
        
        tbReporte1.setFont(new java.awt.Font("Tahoma", 0, 11));
        tbReporte1.setModel(model1);
        tbReporte1.setSelectionForeground(Color.BLUE);
        tbReporte1.getColumnModel().getColumn(0).setPreferredWidth(30);
//      tbOcupacional.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbReporte1.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbReporte1.getTableHeader().setReorderingAllowed(false);
        
    }
    public void valorsede() {
        try {
            jCheckBox11.setSelected(true);
            nomsede = objet.nombresede;
            jLabel48.setText(nomsede);
            String sQuery;
            // Prepara el Query
            sQuery = "select cod_sede from sede where nombre_sede= '" + nomsede + "';";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {
                        // Obtiene los datos de la Consulta
                        codigosede = oConn1.setResult.getInt("cod_sede");
                    }
                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeInformacion(ex.toString());
                    Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            agregarConsulta = " and n.cod_sede=" + codigosede;
            agregarConsulta += " ";
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void LimpiarPersonalizado(){
    txtBuscarNombre.setText(null);
    txtBuscarCod.setText(null);
    Fhasta.setDate(null);
    Fdesde.setDate(null);
         sbCargarOcupacional("");
    
    }
     private void LimpiarPersonalizado1(){
    txtBuscarNombre1.setText(null);
    txtBuscarCod1.setText(null);
    Fhasta1.setDate(null);
    Fdesde1.setDate(null);
    empresa.setSelectedIndex(0);
    contrata.setSelectedIndex(0);
         sbCargarContabilidad("");
    
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
     
     void cPersonalizada() {
        try {  
            String[] titulos = {"N°Orden", "Nombres", "Fecha", "Empresa", "Contrata", "T.Examen","Precio_exa","Precio_Adic.","Tipo_Pago","Autoriza","N°ope","Obser1","Obser2","Estado"};
            String[] registros = new String[14];
            model = new DefaultTableModel(null, titulos) {
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                     if (columnIndex == 5) {
                         return true;
                     }
                     if (columnIndex == 6) {
//                    sumar();
                         return true;
                     } else{
                         return false;
                     }
                     
                 }
             };
            String vSql="select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,n.razon_empresa,n.razon_contrata,n.nom_examen,\n"
                         + "n.precio_po::numeric,n. precio_adic::numeric,n.tipo_pago,n.autoriza,n.n_operacion,n.txtobserv1, n.txtobserv2, c.c_n_factura, c.c_fecha_facv, \n"
                         + "c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                         + "FROM datos_paciente AS d \n"
                         + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                         + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden)\n";
                         
                     vSql +=" WHERE fecha_apertura_po >= '"+Fdesde.getDate().toString()+"'";
                 
                     vSql +=" AND fecha_apertura_po<= '"+Fhasta.getDate().toString()+"'";
                System.out.println("la consulta es:"+vSql);
            if (oConn1.FnBoolQueryExecute(vSql)) {
                try {
                    while (oConn1.setResult.next()) {
                        registros[0] = oConn1.setResult.getString("n_orden");
                        registros[1] = oConn1.setResult.getString("nombres");
                        registros[2] = formato.format(oConn1.setResult.getDate("fecha_apertura_po"));
                        registros[3] = oConn1.setResult.getString("razon_empresa");
                        registros[4] = oConn1.setResult.getString("razon_contrata");
                        String exa = oConn1.setResult.getString("nom_examen");
                        registros[5] = exa;
                        registros[6] = oConn1.setResult.getString("precio_po");
                        registros[7]= oConn1.setResult.getString("precio_adic");
                        registros[8] = oConn1.setResult.getString("tipo_pago");
                        registros[9] = oConn1.setResult.getString("autoriza");
                        registros[10] = oConn1.setResult.getString("n_operacion");
                        registros[11] = oConn1.setResult.getString("txtobserv1");
                        registros[12] = oConn1.setResult.getString("txtobserv2");
                        registros[13] = oConn1.setResult.getString("c_estado");
                        tbReporte.setDefaultRenderer(Object.class, new MyCellRenderer());
                        model.addRow(registros);
                    }
                    // Coloca el Modelo de Nueva Cuenta
                    tbReporte.setModel(model);
                    tabla();
                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     void cPersonalizada1() {
         try {  
            String[] titulos = {"N°Orden", "Nombres","Empresa", "Contrata", "T.Examen","N° Factura","F.Factura","F.Vencimiento","M.Facturado","N°ope","Banco","N°Cuenta","Estado","F.Pago"};
            String[] registros = new String[15];
            model1 = new DefaultTableModel(null, titulos) {
                 @Override
                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                 }
             };
            String Sql;
                // System.out.println("si es este el error ");
                Sql = "select n.n_orden, d.nombres_pa||' '||d.apellidos_pa AS nombres,n.fecha_apertura_po,n.razon_empresa,n.razon_contrata,n.nom_examen,c.c_n_factura, c.c_fecha_facv, \n"
                        + "       c.c_fecha_venc, c.c_monto_fac,c.c_num_ope, c.c_banco,c.c_cuenta, c.c_estado, c.c_fecha_pago, c.c_observaciones\n"
                        + "FROM datos_paciente AS d \n"
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n"
                        + "INNER JOIN contabilidad AS c ON (c.c_n_orden = n.n_orden)";
                Sql +=" WHERE n.fecha_apertura_po >= '"+Fdesde1.getDate().toString()+"'";
                Sql +=" AND n.fecha_apertura_po <= '"+Fhasta1.getDate().toString()+"'";
                if(empresa.getSelectedItem().toString().length()>1 && contrata.getSelectedItem().toString().length()<1)
                     Sql +=" AND n.razon_empresa = '"+empresa.getSelectedItem().toString()+"'";
                if(empresa.getSelectedItem().toString().length()<1 && contrata.getSelectedItem().toString().length()>1)
                     Sql +=" AND n.razon_contrata = '"+contrata.getSelectedItem().toString()+"'";
                if(empresa.getSelectedItem().toString().length()>1 && contrata.getSelectedItem().toString().length()>1)
                     Sql +=" AND n.razon_empresa = '"+empresa.getSelectedItem().toString()+"' AND "+ "n.razon_contrata = '"+contrata.getSelectedItem().toString()+"'";
                System.out.println("la consulta es:"+Sql);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                           

            if (oConn1.FnBoolQueryExecute(Sql)) {
                try {
                    while (oConn1.setResult.next()) {
                        registros[0] = oConn1.setResult.getString("n_orden");
                        registros[1] = oConn1.setResult.getString("nombres");
                        registros[2] = oConn1.setResult.getString("razon_empresa");
                        registros[3] = oConn1.setResult.getString("razon_contrata");
                        String exa = oConn1.setResult.getString("nom_examen");
                        registros[4] = exa;
                        registros[5] = oConn1.setResult.getString("c_n_factura");
                        registros[6]= oConn1.setResult.getString("c_fecha_facv");
                        registros[7] = oConn1.setResult.getString("c_fecha_venc");
                        registros[8] = oConn1.setResult.getString("c_monto_fac");
                        registros[9] = oConn1.setResult.getString("c_num_ope");
                        registros[10] = oConn1.setResult.getString("c_banco");
                        registros[11] = oConn1.setResult.getString("c_cuenta");
                        registros[12] = oConn1.setResult.getString("c_estado");
                        registros[13] = oConn1.setResult.getString("c_fecha_pago");
                        registros[14] = oConn1.setResult.getString("c_observaciones");
                        tbReporte1.setDefaultRenderer(Object.class, new MyCellRenderer1());
                        model1.addRow(registros);
                    }
                    // Coloca el Modelo de Nueva Cuenta
                    tbReporte1.setModel(model1);
                    tabla1();
                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Audiometria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }

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
     private void ActualizarReporte(){
//        // Para los resultados
        
        // Para la sentencia Sql
         if (ValidarConta()) {
             String insert;
        String values ; 
        // Query para actualizar el Folio
       insert = "UPDATE contabilidad\n" ;
       values=" SET c_n_factura='"+txtNFactura.getText()+"'";
       if(FechaFac.getDate()!=null){
           values +=",c_fecha_facv='"+FechaFac.getDate()+"' ";
       }else{
           values += ", c_fecha_facv=null";
       }
       if(FechaFac.getDate()!=null){
           values +=",c_fecha_venc='"+FechaVenc.getDate()+"' ";
       }else{
           values += ", c_fecha_venc=null";
       }
       values +=",c_monto_fac='"+txtMontoFac.getText()+"'" ;
       values +=",c_num_ope='"+txtNOperac.getText()+"'";
       values +=",c_banco='"+txtBancoEmis.getText()+"'";
       values +=",c_cuenta='"+txtPagoCuenta.getText()+"'";
       values +=",c_estado='"+cboEstado.getSelectedItem()+"'";
       if(FechPago.getDate()!=null){
           values +=",c_fecha_pago='"+FechPago.getDate()+"'";
       }else{
           values += ", c_fecha_pago=null";
       }
       values +=",c_observaciones='"+txtObservaciones.getText()+"'";
       values+=" where c_n_orden='"+txtNorden.getText()+"'";
         System.out.println(insert + values);
        if (oConn1.FnBoolQueryExecuteUpdate(insert +values)){
            oFunc.SubSistemaMensajeInformacion("SE ACTUALIZO CORRECTAMENTE");
            sbCargarOcupacional("");
        }
         try {
             oConn1.setResult.close();
             oConn1.sqlStmt.close();
         } catch (SQLException ex) {
             Logger.getLogger(Contabilidad.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
             
    }
      private boolean ValidarConta() {

        boolean bResultado = true;
        if (txtNOperac.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese N° operacion");
            bResultado = false;
        }
        return bResultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser Fdesde1;
    private com.toedter.calendar.JDateChooser FechPago;
    private com.toedter.calendar.JDateChooser FechaFac;
    private com.toedter.calendar.JDateChooser FechaVenc;
    private com.toedter.calendar.JDateChooser Fhasta;
    private com.toedter.calendar.JDateChooser Fhasta1;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnExportarExel1;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox contrata;
    private javax.swing.JComboBox empresa;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tbReporte;
    private javax.swing.JTable tbReporte1;
    private javax.swing.JTextField txtBancoEmis;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtBuscarCod1;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtBuscarNombre1;
    private javax.swing.JTextField txtMontoFac;
    private javax.swing.JTextField txtNFactura;
    private javax.swing.JTextField txtNOperac;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPagoCuenta;
    // End of variables declaration//GEN-END:variables
}
