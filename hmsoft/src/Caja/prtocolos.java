/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;

import Clases.clsConnection;
import Clases.clsFunciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import sistema.Ingreso;

/**
 *
 * @author USER
 */
public class prtocolos extends javax.swing.JFrame {
clsFunciones  oFunc = new clsFunciones();
clsConnection oConn = new clsConnection();
         DefaultTableModel model;
int pkprotocolo=0,pkservicio=0,laEdad=0;
String nameservis="",nameproto="",idprotocoloservicio;
String nombreServicio="",nombreProtocolo="",preciototal="";
String precioReal="0", precioBase="0",idservicio="0",idprotocolo="0",observaciones="";
int operacion=0;

    /**
     * Creates new form prtocolos
     */
    public prtocolos() {
        initComponents();
            setLocationRelativeTo(null);

        mostrar();
        mostrar2();
        popuptable();
        popuptable2();
        popuptable3();
        jTextFieldPrecioTotal.setText("0");
                    jTextField1.setEditable(false);
        cargarServicios();
        cargarProtocolos();
         AutoCompleteDecorator.decorate(this.cboProtocolo);
                  AutoCompleteDecorator.decorate(this.cboServicio);


    }
       public void popuptable(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Eliminar Registro");
        JMenuItem menuItem2=new JMenuItem("Actualizar Registro");

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            operacion=3;
     int a =tabla.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     idservicio= (String) tabla.getValueAt(a,0);
     System.out.println("la id es :"+idservicio);
     
           funcionoservicio();
               JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    mostrar();
        }
    
    });   
    
    menuItem2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            operacion=2;
     int a =tabla.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     idservicio= (String) tabla.getValueAt(a,0);
       nombreServicio=(String) tabla.getValueAt(a,1);
        precioBase=(String) tabla.getValueAt(a,2);
        precioReal=(String) tabla.getValueAt(a,3);
        observaciones=(String) tabla.getValueAt(a,4);
     System.out.println("la id es :"+idservicio);
     
           funcionoservicio();
               JOptionPane.showMessageDialog(null, "Registro Actualizado");
                    mostrar();
        }
    
    });
    popupMenu.add(menuItem1);   
    popupMenu.add(menuItem2);

    tabla.setComponentPopupMenu(popupMenu);
  
    }  
       
             public void popuptable2(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Eliminar Registro");
        JMenuItem menuItem2=new JMenuItem("Actualizar Registro");

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            operacion=3;
     int a =tabla1.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     idprotocolo= (String) tabla1.getValueAt(a,0);
   //  System.out.println("la id es :"+idprotocolo);
     
           funcionprotocolo();
               JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    mostrar2();
        }
    
    });   
      menuItem2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            operacion=2;
     int a =tabla1.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     idprotocolo= (String) tabla1.getValueAt(a,0);
          nombreProtocolo= (String) tabla1.getValueAt(a,1);
           preciototal= (String) tabla1.getValueAt(a,2);

   //  System.out.println("la id es :"+idprotocolo);
     
           funcionprotocolo();
               JOptionPane.showMessageDialog(null, "Registro Actualizado");
                    mostrar2();
        }
    
    });   
    

    popupMenu.add(menuItem1);   
    popupMenu.add(menuItem2);

    tabla1.setComponentPopupMenu(popupMenu);
  
    }   
            public void popuptable3(){
    JPopupMenu popupMenu=new JPopupMenu();
    JMenuItem menuItem1=new JMenuItem("Eliminar Registro");
       JMenuItem menuItem2=new JMenuItem("Actualizar Registro");

    menuItem1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            operacion=3;
     int a =tabla2.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     idprotocoloservicio= (String) tabla2.getValueAt(a,0);
   //  System.out.println("la id es :"+idprotocolo);
     
           funcionprotocoloservicio();
               JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    mostrar3();
        }
    
    });   
     menuItem2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            operacion=2;
     int a =tabla2.getSelectedRow();
       System.out.println("la fila es:"+a);
     
     idprotocoloservicio= (String) tabla2.getValueAt(a,0);
   //  System.out.println("la id es :"+idprotocolo);
     String servis=(String) tabla2.getValueAt(a,2);
     laEdad=Integer.parseInt((String) tabla2.getValueAt(a,3));   
             calcularServicio1(servis);
           funcionprotocoloservicio();
               JOptionPane.showMessageDialog(null, "Registro Actualizado");
                    mostrar3();
        }
    
    });   
    

    popupMenu.add(menuItem1);   
    popupMenu.add(menuItem2);  

    tabla2.setComponentPopupMenu(popupMenu);
  
    }    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldpb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldpr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldObserv = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecioTotal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cboProtocolo = new javax.swing.JComboBox();
        cboServicio = new javax.swing.JComboBox();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        jLabel1.setText("SERVICIOS");

        jLabel2.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel2.setText("Nombre Servicio:");

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextFieldNombre.setToolTipText("");
        jTextFieldNombre.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel3.setText("Precio Base:");

        jTextFieldpb.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel4.setText("Precio Real:");

        jTextFieldpr.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Servicio", "Precio Base", "Precio Real", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        jButton3.setText("Exportar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel7.setText("Observaciones:");

        jTextFieldObserv.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jTextFieldObserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldpr, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextFieldpb)
                                .addComponent(jTextFieldNombre))
                            .addComponent(jTextFieldObserv, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(113, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldpb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldpr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldObserv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Servicios", jPanel2);

        jLabel5.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel5.setText("Nombre Protocolo:");

        jTextFieldNombre1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextFieldNombre1.setToolTipText("");
        jTextFieldNombre1.setVerifyInputWhenFocusTarget(false);

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Mostrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        jButton6.setText("Exportar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        jLabel6.setText("PROTOCOLOS");

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre Protocolos", "Precio Total Protocolo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jLabel8.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel8.setText("Precio Total Protocolo:");

        jTextFieldPrecioTotal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextFieldPrecioTotal.setToolTipText("");
        jTextFieldPrecioTotal.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPrecioTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre1))
                        .addGap(18, 84, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton5)
                    .addComponent(jTextFieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton6)
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Protocolos", jPanel3);

        cboProtocolo.setEditable(true);
        cboProtocolo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Protocolo" }));
        cboProtocolo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboProtocoloPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProtocoloActionPerformed(evt);
            }
        });
        cboProtocolo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboProtocoloKeyPressed(evt);
            }
        });

        cboServicio.setEditable(true);
        cboServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Servicio" }));
        cboServicio.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboServicioPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicioActionPerformed(evt);
            }
        });
        cboServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboServicioKeyPressed(evt);
            }
        });

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDProtocolo servicio", "Nombre Protocolos", "Nombre Servicio", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla2);

        jButton7.setText("Mostrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excel.png"))); // NOI18N
        jButton8.setText("Exportar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField1.setText("0");

        jLabel11.setText("Edad:");

        jLabel12.setText("La edad si el servicio es \"CONDICIONAL\"");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregar)
                            .addComponent(jButton7))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(cboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Asignar Servicios", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void cargarProtocolos(){
    try {        
        String sQuery;
        // Prepara el Query
        sQuery ="select nombreprotocolo from protocolo";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                while (oConn.setResult.next())
                {
                    // Obtiene los datos de la Consulta
                    cboProtocolo.addItem(oConn.setResult.getString ("nombreprotocolo"));
                    
                }
                
                // Cierra Resultados
                oConn.setResult.close();
            }
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        // cboProtocolo.setSelectedItem(seded);
        cboProtocolo.setSelectedIndex(0);
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }



}
   private void calcularProtocolos(){
    try {        
        String sQuery;
        // Prepara el Query
        sQuery ="select idprotocolo from protocolo where nombreprotocolo='"+cboProtocolo.getSelectedItem()+"'";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                while (oConn.setResult.next())
                {
                    // Obtiene los datos de la Consulta
                    pkprotocolo=oConn.setResult.getInt ("idprotocolo");
                    
                }
                
                // Cierra Resultados
                oConn.setResult.close();
            }
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }

        
        


}
 private void cargarServicios(){
    try {        
        String sQuery;
        // Prepara el Query
        sQuery ="select nombreservicio from servicios";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                while (oConn.setResult.next())
                {
                    // Obtiene los datos de la Consulta
                    cboServicio.addItem(oConn.setResult.getString ("nombreservicio"));
                    
                }
                
                // Cierra Resultados
                oConn.setResult.close();
            }
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // selecciona
        // cboProtocolo.setSelectedItem(seded);
        cboServicio.setSelectedIndex(0);
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }



}
     private void calcularServicio(){
    try {        
        String sQuery;
        // Prepara el Query
        sQuery ="select idservicio from servicios where nombreservicio='"+cboServicio.getSelectedItem()+"'";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                while (oConn.setResult.next())
                {
                    // Obtiene los datos de la Consulta
                    pkservicio=oConn.setResult.getInt("idservicio");
                    
                }
                
                // Cierra Resultados
                oConn.setResult.close();
            }
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }

        
    


}
       private void calcularServicio1(String servicio){
    try {        
        String sQuery;
        // Prepara el Query
        sQuery ="select idservicio from servicios where nombreservicio='"+servicio+"'";
        
        if (oConn.FnBoolQueryExecute(sQuery))
        {
            try 
            {
                // Verifica resultados
                while (oConn.setResult.next())
                {
                    // Obtiene los datos de la Consulta
                    pkservicio=oConn.setResult.getInt("idservicio");
                    
                }
                
                // Cierra Resultados
                oConn.setResult.close();
            }
            catch (SQLException ex) 
            {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeInformacion(ex.toString());
                Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }

        
    


}
    
    public void limpiar(){
   jTextFieldNombre.setText("");
   jTextFieldNombre1.setText("");
   jTextFieldpb.setText("");
   jTextFieldpr.setText(""); 
   jTextFieldPrecioTotal.setText("");
   jTextFieldObserv.setText("");
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   if(!jTextFieldNombre.getText().isEmpty())
     {
     if(!OrdenExisteIn()){   
        operacion=1;
        nombreServicio=jTextFieldNombre.getText().trim();
        precioBase=jTextFieldpb.getText().trim();
        precioReal=jTextFieldpr.getText().trim();
        observaciones=jTextFieldObserv.getText().trim();
        funcionoservicio();
        limpiar();
        
     }
     else 
          JOptionPane.showMessageDialog(null, "YA EXISTE UN REGISTRO CON EL MISMO NOMBRE");
     }
     else 
     JOptionPane.showMessageDialog(null, "LLENE LOS DATOS PARA PODER REGISTRAR");
     mostrar();    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    mostrar();    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        generar(tabla);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   if(!jTextFieldNombre1.getText().isEmpty())
     {
     if(!OrdenExisteIn2()){   
        operacion=1;
        nombreProtocolo=jTextFieldNombre1.getText().trim();
        preciototal=jTextFieldPrecioTotal.getText().trim();
        funcionprotocolo();
        limpiar();
        
     }
     else 
          JOptionPane.showMessageDialog(null, "YA EXISTE UN REGISTRO CON EL MISMO NOMBRE");
     }
     else 
     JOptionPane.showMessageDialog(null, "LLENE LOS DATOS PARA PODER REGISTRAR");
   jTextFieldPrecioTotal.setText("0");
     mostrar2();     }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrar2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        generar(tabla1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cboProtocoloPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboProtocoloPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProtocoloPopupMenuWillBecomeInvisible

    private void cboProtocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProtocoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProtocoloActionPerformed

    private void cboProtocoloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboProtocoloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProtocoloKeyPressed

    private void cboServicioPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboServicioPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicioPopupMenuWillBecomeInvisible

    private void cboServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServicioActionPerformed
        if(cboServicio.getSelectedItem().toString().contains("CONDICIONAL"))
        {
        
        jTextField1.setEditable(true);
        }
        else 
            jTextField1.setEditable(false);
        
    }//GEN-LAST:event_cboServicioActionPerformed

    private void cboServicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboServicioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicioKeyPressed

    private void jTextFieldObservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
     calcularServicio();
     calcularProtocolos();
     laEdad= Integer.parseInt(jTextField1.getText());   
        if(pkprotocolo>=1)
     {
              if(pkservicio>=1)
              {
     if(!OrdenExisteIn3()){   
        operacion=1;
        System.out.println("llegooooo");
        nameservis=cboServicio.getSelectedItem().toString();
        nameproto=cboProtocolo.getSelectedItem().toString();
        funcionprotocoloservicio();
        //limpiar();
        
     }
     else 
          JOptionPane.showMessageDialog(null, "YA EXISTE UN REGISTRO CON EL MISMO NOMBRE");
              }
              else 
              JOptionPane.showMessageDialog(null, "ASIGNE UN SERVICIO");
 
              }
     else 
     JOptionPane.showMessageDialog(null, "ASIGNE UN PROTOCOLO");
     mostrar3(); 
                 jTextField1.setEditable(false);

    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    mostrar3();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
generar(tabla2);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarVentana();// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
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

        public void funcionoservicio(){
            
    try {
        String sql="select spFuncionServicios("+idservicio+",'"+nombreServicio+"',"+precioBase+","+precioReal+","
                +operacion+",'"+observaciones+"')";
        oConn.FnBoolQueryExecute(sql);
        
        System.out.println(sql);
        operacion=0;
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
     public void funcionprotocolo(){
    try {
        if(preciototal.length()>=1)
            preciototal=preciototal;
        else
            preciototal="0";
        String sql="select spFuncionProtocolos("+idprotocolo+",'"+nombreProtocolo+"',"
                +operacion+","+preciototal+")";
        oConn.FnBoolQueryExecute(sql);
        
        System.out.println(sql);
        operacion=0;
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }

    }    
     
     public void funcionprotocoloservicio(){
     
    try {
        String sql="select spFuncionProtocoloServicio("+idprotocoloservicio+","+pkprotocolo+","
                +pkservicio+","+operacion+","+laEdad+")";
        oConn.FnBoolQueryExecute(sql);
        System.out.println(sql);
        operacion=0;
        jTextField1.setText("0");
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }

    }    
            
        
    public void mostrar(){
           
    try {
        String [] titulos={"Cod","Nombre del servico","Precio base","Precio Real","Observaciones"};
        String [] registros = new String[5];
        String sql="select idservicio,nombreservicio,preciobase,precioreal,observaciones from servicios";
         
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
                    registros[0]= oConn.setResult.getString("idservicio");
                    registros[1]= oConn.setResult.getString("nombreservicio");
                    registros[2]= oConn.setResult.getString("preciobase");
                    registros[3]= oConn.setResult.getString("precioreal");
                    registros[4]= oConn.setResult.getString("observaciones");
                    
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
                Logger.getLogger(hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }


}
    
    public void ajustarTamañoTabla(){
    tabla.getColumn("Cod").setMaxWidth(50); 
    tabla.getColumn("Nombre del servico").setMinWidth(230);
    tabla.getColumn("Nombre del servico").setMaxWidth(230);
    tabla.getColumn("Precio base").setMinWidth(82);
    tabla.getColumn("Precio base").setMaxWidth(82);
    tabla.getColumn("Precio Real").setMinWidth(82);
    tabla.getColumn("Precio Real").setMaxWidth(82);

    }
      public void ajustarTamañoTabla2(){
    tabla1.getColumn("Codigo").setMaxWidth(60); 
    tabla1.getColumn("Codigo").setMinWidth(60);
   

    }
    public void mostrar2(){
           
    try {
        String [] titulos={"Codigo","Nombre del protocolo","Precio Total Protocolo"};
        String [] registros = new String[3];
        String sql="select idprotocolo,nombreprotocolo,preciototal from protocolo";
        
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
                    registros[0]= oConn.setResult.getString("idprotocolo");
                    registros[1]= oConn.setResult.getString("nombreprotocolo");
                    registros[2]= oConn.setResult.getString("preciototal");
                    
                    model.addRow(registros);
                }
                //  System.out.println("registro 0"+registros[0]);
                
                
                tabla1.setModel(model);
                ajustarTamañoTabla2();
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
    
       public void ajustarTamañoTabla3(){
    tabla2.getColumn("Codigo").setMaxWidth(60); 
    tabla2.getColumn("Codigo").setMinWidth(60);
   

    }
      public void mostrar3(){
          calcularServicio();
     calcularProtocolos(); 
 String [] titulos={"Codigo","Nombre del protocolo","Nombre Servicio","Edad"};
    String [] registros = new String[4];
    String sql="select idprotocoloservicio,nombreprotocolo,nombreservicio,ps.edad from protocoloServicio as ps inner join protocolo as p on ps.idprotocolo=p.idprotocolo \n" +
"inner join servicios as s on ps.idservicio=s.idservicio   where p.idprotocolo="+pkprotocolo +" order by idprotocoloservicio";
    System.out.println(sql);
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
                    registros[0]= oConn.setResult.getString("idprotocoloservicio");
                    registros[1]= oConn.setResult.getString("nombreprotocolo");
                    registros[2]= oConn.setResult.getString("nombreservicio");
                     registros[3]= oConn.setResult.getString("edad");    
                     model.addRow(registros);
                }
               //  System.out.println("registro 0"+registros[0]);
                 
                 
                  tabla2.setModel(model);
                ajustarTamañoTabla3();
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
    try {
        oConn.sqlStmt.close();
        oConn.setResult.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }
        


}
   
      
      public void cerrarVentana(){
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
    try {
        oConn.sqlStmt.close();
    } catch (SQLException ex) {
        Logger.getLogger(prtocolos.class.getName()).log(Level.SEVERE, null, ex);
    }
  
    this.dispose();
      //  System.exit(0);

    }
      
         public boolean OrdenExisteIn()
    {
        boolean bResultado=false;
        if(!jTextFieldNombre.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select * from servicios Where nombreServicio ='"+jTextFieldNombre.getText().toString()+"'";
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.sqlStmt.close();
            oConn.setResult.close();

        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     } 
    
           public boolean OrdenExisteIn2()
    {
        boolean bResultado=false;
        if(!jTextFieldNombre1.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select * from protocolo Where nombreprotocolo ='"+jTextFieldNombre1.getText().toString()+"'";
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.sqlStmt.close();
        oConn.setResult.close();

        } catch (SQLException ex) {
        }
        }       
        return bResultado;
     }  
             public boolean OrdenExisteIn3()
    {
        boolean bResultado=false;
        if(pkprotocolo>=1){
        String sQuery;
        sQuery  = "Select * from protocoloServicio Where idprotocolo ="+pkprotocolo+" and idservicio="+pkservicio;
        System.out.println("orden existe 3");
        System.out.println(sQuery);
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
//             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
//             txtNorden.setText(null);
            }
            oConn.sqlStmt.close();
        oConn.setResult.close();

        } catch (SQLException ex) {
        }
        }       
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
            java.util.logging.Logger.getLogger(prtocolos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prtocolos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prtocolos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prtocolos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prtocolos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboProtocolo;
    private javax.swing.JComboBox cboServicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldObserv;
    private javax.swing.JTextField jTextFieldPrecioTotal;
    private javax.swing.JTextField jTextFieldpb;
    private javax.swing.JTextField jTextFieldpr;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
