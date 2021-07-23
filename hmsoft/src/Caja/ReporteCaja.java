/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;

import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
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
import sistema.Servicios;

/**
 *
 * @author Horizonte Medic
 */
public class ReporteCaja extends javax.swing.JFrame {
  clsConnection oConn = new clsConnection();
    clsFunciones oFunc = new clsFunciones();
      int marcador=1,verificador=1;
    DefaultTableModel model;
    /**
     * Creates new form ReporteCaja
     */
    public ReporteCaja() {
                         initComponents();
                         jTextField8.setEditable(false);
                        jRadioButton4.setSelected(true);
                        AutoCompleteDecorator.decorate(this.jComboBox2);

                        jComboBox2.setSelectedItem(clsGlobales.sNomOperador);
                        jTextField7.setEditable(false);
                fecha();
                CargarServicios();
                jComboBox1.setSelectedIndex(-1);
                codEgresosField.setVisible(false);
                 timer.start();
                setLocationRelativeTo(null);
                popuptable();
                mostrar_egresos();
                CargarDoctoCaja();

    }
           public void popuptable(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("AGREGAR");
    JMenuItem menuItem2=new JMenuItem("QUITAR");
    JMenuItem menuItem3=new JMenuItem("AGREGAR TODO");
    JMenuItem menuItem4=new JMenuItem("QUITAR TODO");
    

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =tabla.getSelectedRow();
       System.out.println("la fila es:"+a);
     
    String id= (String) tabla.getValueAt(a,0);
      String preciod= (String) tabla.getValueAt(a,4);
    agregar_servicios_caja(preciod,id);    
     mostrar();
          
        }
    
    });   
      menuItem2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =tabla.getSelectedRow();
       System.out.println("la fila es:"+a);
     
    String id= (String) tabla.getValueAt(a,0);
      String preciod= (String) tabla.getValueAt(a,4);
    quitar_servicios_caja(preciod,id);    
     mostrar();
          
        }
    
    });   
         menuItem3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =tabla.getSelectedRow();
       System.out.println("la fila es:"+a);
     
    String id=jTextField9.getText().toString().trim();
      String preciod= (String) tabla.getValueAt(a,4);
    agregarTodos_servicios_caja(preciod,id);    
     mostrar();
          
        }
    
    });   
        menuItem4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
     int a =tabla.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     
    String id=jTextField9.getText().toString().trim();
      String preciod= (String) tabla.getValueAt(a,4);
    quitarTodos_servicios_caja(preciod,id);    
     mostrar();
          
        }
    
    });      
         
    popupMenu.add(menuItem1);
    popupMenu.add(menuItem2);
    popupMenu.add(menuItem3);
    popupMenu.add(menuItem4);

    tabla.setComponentPopupMenu(popupMenu);
  
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        btnGuardarFicha = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Fdesde = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        codEgresosField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnExportarExel = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cboContratas = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fdesde2 = new com.toedter.calendar.JDateChooser();
        Fhasta = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setTitle("Repotes Ingresos/Egresos");
        jInternalFrame1.setVisible(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 940, 270));

        jTextField8.setFont(new java.awt.Font("Engravers MT", 3, 24)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 190, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("TOTAL:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, 20));

        jTextField9.setFont(new java.awt.Font("Dialog", 3, 26)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 153, 153));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 230, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ticket:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setText("D.N.I.");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3.setText("Historia Clínica");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 130, -1));

        jLabel18.setText("Nombres:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 320, -1));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 320, -1));

        jLabel21.setText("Apellidos:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnNuevo.setMnemonic('n');
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 40, 30));

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 130, 30));

        btnGuardarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnGuardarFicha.setText("Guardar");
        btnGuardarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFichaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 130, 30));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 130, 30));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("CON PRECIO");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jCheckBox2.setText("SIN PRECIO");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        jTabbedPane1.addTab("Caja", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("EGRESOS");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 180, 50));

        jLabel8.setText("Responsable:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jComboBox2.setEditable(true);
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 290, -1));

        jLabel9.setText("Hora:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        jPanel4.add(Fdesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, -1));

        jLabel10.setText("S/.");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, -1));

        jLabel11.setText("Descripción:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 360, 100));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla2MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabla2);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 570, 280));

        jLabel12.setText("Fecha:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 100, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        codEgresosField.setEnabled(false);
        jPanel4.add(codEgresosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 950, 430));

        jTabbedPane1.addTab("Egresos", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExportarExel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        btnExportarExel.setText("Exportar");
        btnExportarExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExelActionPerformed(evt);
            }
        });
        jPanel3.add(btnExportarExel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 140, -1));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 170, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 950, 230));

        jLabel2.setText("Servicios:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cboContratas.setEditable(true);
        cboContratas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CAJA EGRESOS ", "CAJA ASISTENCIAL", "CAJA TOTAL" }));
        cboContratas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboContratasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
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
        jPanel3.add(cboContratas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 280, -1));

        jLabel4.setText("Desde :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setText("Hasta :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel3.add(Fdesde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));
        jPanel3.add(Fhasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));

        jLabel6.setText("TIPO DE REPORTE:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jComboBox1.setEditable(true);
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 330, -1));

        jTabbedPane1.addTab("Caja Reportes", jPanel3);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExelActionPerformed
            generar(jTable2);
    }//GEN-LAST:event_btnExportarExelActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrar21();
    }//GEN-LAST:event_btnMostrarActionPerformed
  public void mostrar21(){
           
 String [] titulos={"clave","responsable","fecha","hora","precio","descripcion"};
    String [] registros = new String[6];
  String sql="select *from caja_egresos where fecha between '"+Fdesde2.getDate().toString()+"' and '"+
        Fhasta.getDate().toString()+"' ";
  model = new DefaultTableModel(null,titulos);  
                       System.out.println("paso el model");

    if (oConn.FnBoolQueryExecute(sql))
        {
             try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("id_clave");
                    registros[1]= oConn.setResult.getString("reponsable");
                    registros[2]= oConn.setResult.getString("fecha");
                    registros[3]= oConn.setResult.getString("hora");
                    registros[4]= oConn.setResult.getString("precio");
                     registros[5]= oConn.setResult.getString("descripcion");
                    
                     model.addRow(registros);
                }
                 System.out.println("registro 0"+registros[0]);
                 
                 
                  jTable2.setModel(model);
                
                 oConn.setResult.close();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(sede.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          try {
              oConn.setResult.close();
              oConn.sqlStmt.close();
          } catch (SQLException ex) {
              Logger.getLogger(sede.class.getName()).log(Level.SEVERE, null, ex);
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
    public void consulta(){
    try{
     model = new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }};
String sql="select *from caja_egresos where between '"+Fdesde2.getDate().toString()+"' and '"+
        Fhasta.getDate().toString()+"' ";
  if (oConn.FnBoolQueryExecute(sql))
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
                        jTable2 = autoResizeColWidth(jTable2, model);
                        jTable2.setModel(model);
                        oConn.setResult.close();
                    }
                    catch (SQLException ex)
                    {
                        oFunc.SubSistemaMensajeError(ex.toString());
                        Logger.getLogger(ReporteCaja.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Reporteador.class.getName()).log(Level.SEVERE, null, ex);
            }

}
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertarEgresos();
            limpiarCaja();
                mostrar_egresos();
          btnActualizar.setEnabled(true);
    btnGuardar.setEnabled(false);
    
    }//GEN-LAST:event_btnGuardarActionPerformed
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
marcador=1;
}


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    limpiarCaja();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiarCaja(){
    jTextField1.setText("");
    jTextArea1.setText("");
  codEgresosField.setText("");
    }
    
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
      if(jRadioButton4.isSelected())
          jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
         if(jRadioButton3.isSelected())
          jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed
 public void agregar_servicios_caja(String preci,String cod ){

    String query="update consulta_asistencial_detalle set precio='"+preci+"',estado='AGREGADO' where id_const_det="+cod;
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE AGREGO CON EXITO");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
  public void agregarTodos_servicios_caja(String preci,String cod ){

    String query="update consulta_asistencial_detalle set estado='AGREGADO' where nro_ticket='"+cod+"'";
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE AGREGO TODO CON EXITO");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
 
  public void quitar_servicios_caja(String preci,String cod ){

    String query="update consulta_asistencial_detalle set precio='"+preci+"',estado='PENDIENTE' where id_const_det="+cod;
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE QUITO SERVICIO CON EXITO");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
   public void quitarTodos_servicios_caja(String preci,String cod ){

    String query="update consulta_asistencial_detalle set estado='PENDIENTE' where nro_Ticket='"+cod+"'";
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE QUITO TODOS LOS SERVICIO CON EXITO");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
      public void AgregarCambios_servicios_caja(String cod ){

    String query="update consulta_asistencial_detalle set verificar=1 where nro_Ticket='"+cod+"' and  estado='AGREGADO' ";
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE GUARDO CON EXITO LOS CAMBIOS");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
          public void AgregarCambios_servicios_caja_verificiar(String cod ){

    String query="update consulta_asistencial_detalle set verificar=0 where nro_Ticket='"+cod+"' and  estado='PENDIENTE' ";
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE GUARDO CON EXITO LOS CAMBIOS");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
            if(jRadioButton4.isSelected())
        {
           if(OrdenExiste_dni())
           {
           mostrar_paciente_dni();
                         
           }
           else
     JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA ESE DNI REGISTRADO");

        }
        else
        {
            if(OrdenExiste_hp())
            {
                mostrar_paciente_hp();
              

            }
            else
            {
                 JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA REGISTROS DE ESA HISTORIA C.");

            }
            
        }
    }//GEN-LAST:event_jTextField5ActionPerformed
   public void insertarEgresos( ){

    String query="insert into caja_egresos (reponsable,\n" +
"fecha,\n" +
"hora,\n" +
"precio,\n" +
"descripcion)values('"+jComboBox2.getSelectedItem().toString().trim()+"','"+
            Fdesde.getDate().toString().trim()+"','"+
            jTextField7.getText().toString().trim()+"','"+
            jTextField1.getText().toString().trim()+
            "','"+jTextArea1.getText().toString().trim()+"') ";
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE REGISTRO LA ENTRADA CON EXITO");
                }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
   
        public void Actualizar_egresos_caja(){

    String query="update caja_egresos set reponsable='"+jComboBox2.getSelectedItem().toString().trim()+"',fecha='"+
            Fdesde.getDate().toString().trim()+"',hora='"+
            jTextField7.getText().toString().trim()+"',precio='"+
            jTextField1.getText().toString().trim()+ "',descripcion='"+
            jTextArea1.getText().toString().trim()+
            "'  where id_clave="+codEgresosField.getText().toString();
            try {
          System.out.println("la coonsulta:"+query);
                if (oConn.FnBoolQueryExecuteUpdate(query)){
                    oFunc.SubSistemaMensajeInformacion("SE ACTUALIZO CON EXITO ");
                }else{
                    oFunc.SubSistemaMensajeError("No se ppudo actualizar el registro");
                }
                oConn.setResult.close();
                    oConn.sqlStmt.close();
            } catch (Exception e) {
            }
    
    }
   
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
mostrar();
Cargar_nombres();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
       mostrar();
       Cargar_nombres();
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiarCajaAdmisnitrarServicios();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnGuardarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFichaActionPerformed
    String val=jTextField9.getText().toString().trim();
        AgregarCambios_servicios_caja(val);
        AgregarCambios_servicios_caja_verificiar(val);
        imprimir();
        limpiarCajaAdmisnitrarServicios();   
        
    }//GEN-LAST:event_btnGuardarFichaActionPerformed
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

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       if(jCheckBox1.isSelected())
           print(jTextField9.getText().toString().trim());
       else
        printt(jTextField9.getText().toString().trim());


    }//GEN-LAST:event_btnImprimirActionPerformed
 private void print(String cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "cajaTicket.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("TICKET ASISTENCIAL");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                   
                 } catch (JRException ex) {
                    Logger.getLogger(ticketAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
   private void printt(String cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "cajaTicketSin.jasper";
                        JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                        JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                        JasperViewer viewer = new JasperViewer(myPrint, false);
                        viewer.setTitle("TICKET ASISTENCIAL");
                        // viewer.setAlwaysOnTop(true);
                        viewer.setVisible(true);
                   
                 } catch (JRException ex) {
                    Logger.getLogger(ticketAsistencial.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
 
 }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      if(jCheckBox1.isSelected())
          jCheckBox2.setSelected(false);
          
    }//GEN-LAST:event_jCheckBox1ActionPerformed
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
       if(jCheckBox1.isSelected())
        print1(jTextField9.getText().toString().trim());
       else
                   print2(jTextField9.getText().toString().trim());

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
     private void print1(String cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "cajaTicket.jasper";
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
     private void print2(String cod){
                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                try 
                {
                        String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "cajaTicketSin.jasper";
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
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
          if(jCheckBox2.isSelected())
          jCheckBox1.setSelected(false);
          
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    
  private void CargarDoctoCaja(){
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
                Logger.getLogger(ReporteCaja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
} 
    private void Cargar_nombres(){
    String Consulta;    
    Consulta = "select pa.nombres,pa.apellidos from ticket_g as tg inner join paciente_asistencial as pa\n" +
"on tg.cod_pa=pa.cod_pa where tg.nro_ticket='"+jTextField9.getText().toString().trim()+"';";
        if (oConn.FnBoolQueryExecute(Consulta))
        {
            try 
            {
                while (oConn.setResult.next())
                 {         
                     jTextField11.setText(oConn.setResult.getString ("nombres"));
                     jTextField10.setText(oConn.setResult.getString ("apellidos"));

                 }
                    oConn.setResult.close();
                    oConn.sqlStmt.close();
            } 
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(ReporteCaja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
} 
     
    public void mostrar_egresos(){
           
    try {
        String [] titulos={"ID_CLAVE","RESPONSABLE","FECHA","HORA","PRECIO","DESCRIPCION"};
        String [] registros = new String[6];
        String sql="select * from caja_egresos";        
        model = new DefaultTableModel(null,titulos)
        {@Override
        public boolean isCellEditable (int fila, int columna) {
            if (columna!=20)
                return false;
            return true;
        }
        };
        
        if (oConn.FnBoolQueryExecute(sql))
        {
            try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("id_clave");
                    registros[1]= oConn.setResult.getString("reponsable");
                    registros[2]= oConn.setResult.getString("fecha");
                    registros[3]= oConn.setResult.getString("hora");
                    registros[4]= oConn.setResult.getString("precio");
                    registros[5]= oConn.setResult.getString("descripcion");

                    
                    model.addRow(registros);
                }
                System.out.println("registro 0"+registros[0]);
                
                tabla2.setModel(model);
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
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Actualizar_egresos_caja();   
        limpiarCaja();
                mostrar_egresos();
  btnActualizar.setEnabled(false);
    btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tabla2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MousePressed
          if (evt.getClickCount() == 2) {
       //     System.out.println("va entrar en el cod de 2 click");
            String cod = tabla2.getValueAt(tabla2.getSelectedRow(), 0).toString();
            String resp = tabla2.getValueAt(tabla2.getSelectedRow(), 1).toString();
            String precio = tabla2.getValueAt(tabla2.getSelectedRow(), 4).toString();
            String descripcion = tabla2.getValueAt(tabla2.getSelectedRow(), 5).toString();
     
            codEgresosField.setText(cod);
            jComboBox2.setSelectedItem(resp);
jTextField1.setText(precio);
jTextArea1.setText(descripcion);
 btnGuardar.setEnabled(false);
 btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_tabla2MousePressed
    public void limpiarCajaAdmisnitrarServicios(){
    jTextField9.setText("");
    jTextField5.setText("");
    jTextField11.setText("");
    jTextField10.setText("");
    jTextField8.setText("");
       int a = tabla.getRowCount()-1;
                 DefaultTableModel tblDatos = (DefaultTableModel) tabla.getModel();
        for (int i = a; i >= 0; i--) {          
        tblDatos.removeRow(tblDatos.getRowCount()-1);
        }
    }
    public void ajustarTamañoTabla(){
    tabla.getColumn("ID_CLAVE").setMaxWidth(50); 
    tabla.getColumn("COD_SERV").setMinWidth(50);
    tabla.getColumn("DESCRIPCION").setMinWidth(360);
    tabla.getColumn("UNIDAD").setMinWidth(60);
    tabla.getColumn("PRECIO").setMinWidth(62);
    tabla.getColumn("ESTADO").setMinWidth(150);

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
    
       public void mostrar_paciente_dni(){
     
        String sQuery;

        sQuery  = "Select *,tg.nro_ticket from paciente_asistencial as pa inner join ticket_g as tg on pa.cod_pa=tg.cod_pa Where tg.cod_pa ="+jTextField5.getText().toString().trim()
               +" order by tg.nro_ticket desc limit 1" ;
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                 jTextField11.setText(oConn.setResult.getString("nombres"));
                    jTextField10.setText(oConn.setResult.getString("apellidos"));
                    jTextField9.setText(oConn.setResult.getString("nro_ticket"));
                 
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        
    }
       
       
       
       public void mostrar(){
           
    try {
        String [] titulos={"ID_CLAVE","COD_SERV","DESCRIPCION","UNIDAD","PRECIO","ESTADO"};
        String [] registros = new String[6];
        String sql="SELECT cad.id_const_det,cad.cod_servicio,cad.precio,cad.unidad,sg.descripcion,cad.estado FROM consulta_asistencial_detalle AS cad\n" +
"inner join servicios_generales as sg on cad.cod_servicio=sg.cod_servicio where cad.nro_ticket='"+jTextField9.getText().toString().trim()+"'";
         
        model = new DefaultTableModel(null,titulos)
        {@Override
        public boolean isCellEditable (int fila, int columna) {
            if (columna!= 4)
                return false;
            return true;
        }
        };
        
        if (oConn.FnBoolQueryExecute(sql))
        {
            try  {
                
                while (oConn.setResult.next())
                {
                    registros[0]= oConn.setResult.getString("id_const_det");
                    registros[1]= oConn.setResult.getString("cod_servicio");
                    registros[2]= oConn.setResult.getString("descripcion");
                    registros[3]= oConn.setResult.getString("unidad");
                    registros[4]= oConn.setResult.getString("precio");
                    registros[5]= oConn.setResult.getString("estado");
            
                    
                    model.addRow(registros);
                }
                System.out.println("registro 0"+registros[0]);
                
                tabla.setModel(model);
                //tabla.getColumn("Codigo").setPreferredWidth(10);
                ajustarTamañoTabla();
                
                oConn.setResult.close();
                //   System.out.println("la cantida de filas en hotel es"+tabla.getRowCount());
                
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(ReporteCaja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mostrar_totalApagar();
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
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
                  jTextField11.setText(oConn.setResult.getString("nombres"));
                    jTextField10.setText(oConn.setResult.getString("apellidos"));
                    jTextField9.setText(oConn.setResult.getString("nro_ticket"));
                 
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        
    }
     public void mostrar_totalApagar(){
     
        String sQuery;

        sQuery  = "select SUM(precio) as suma from consulta_asistencial_detalle where estado='AGREGADO' "
                + "AND nro_ticket='"+jTextField9.getText().toString().trim()+"';";
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                  jTextField8.setText(oConn.setResult.getString("suma"));
         
                 
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            else 
                jTextField8.setText("0");
            oConn.setResult.close();
            oConn.sqlStmt.close();
        } catch (SQLException ex) {
         
        }
        
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
            java.util.logging.Logger.getLogger(ReporteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fdesde;
    private com.toedter.calendar.JDateChooser Fdesde2;
    private com.toedter.calendar.JDateChooser Fhasta;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnExportarExel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarFicha;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboContratas;
    private javax.swing.JTextField codEgresosField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
