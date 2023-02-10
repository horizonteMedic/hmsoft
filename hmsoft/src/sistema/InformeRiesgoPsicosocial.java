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
public final class InformeRiesgoPsicosocial extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;

   public InformeRiesgoPsicosocial(){
      initComponents();
      //new ajTextArea.autocompleterText(atxtIntelectual, "razon_empresa", "empresas");
  
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
        txtNorden = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        FechaEx = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        txtExamen = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txtImprimir = new javax.swing.JTextField();
        btnImprimir5 = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtRecomendaciones = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        chkApto = new javax.swing.JCheckBox();
        chkNoApto = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        chk1RPF = new javax.swing.JCheckBox();
        chk1RPP = new javax.swing.JCheckBox();
        chk1RPD = new javax.swing.JCheckBox();
        chk2RPF = new javax.swing.JCheckBox();
        chk2RPP = new javax.swing.JCheckBox();
        chk2RPD = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        chk3RPF = new javax.swing.JCheckBox();
        chk3RPP = new javax.swing.JCheckBox();
        chk3RPD = new javax.swing.JCheckBox();
        jLabel106 = new javax.swing.JLabel();
        chk4RPF = new javax.swing.JCheckBox();
        chk4RPP = new javax.swing.JCheckBox();
        chk4RPD = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        chk5RPF = new javax.swing.JCheckBox();
        chk5RPP = new javax.swing.JCheckBox();
        chk5RPD = new javax.swing.JCheckBox();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtAnalisisResultados = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Informe riesgo Psicosocial");

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Aptitud"));

        jLabel116.setText("Nº Orden :");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });
        txtNorden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNordenKeyTyped(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        FechaEx.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaExPropertyChange(evt);
            }
        });

        jLabel117.setText("Fecha :");

        jLabel118.setText("Nombres y Apellidos :");

        jLabel119.setText("DNI :");

        jLabel120.setText("Edad :");

        jLabel123.setText("Examen: ");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addComponent(jLabel116)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel117)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FechaEx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel119)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel120)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel123)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar)
                        .addComponent(jLabel117))
                    .addComponent(FechaEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123)
                    .addComponent(txtExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPRIMIR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
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
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir5)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(btnImprimir5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel121.setText("RECOMENDACIONES");

        txtRecomendaciones.setColumns(20);
        txtRecomendaciones.setRows(5);
        jScrollPane14.setViewportView(txtRecomendaciones);

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

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Conclusión"));

        bgConclusion.add(chkApto);
        chkApto.setText("CUMPLE CON EL PERFIL");
        chkApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAptoActionPerformed(evt);
            }
        });

        bgConclusion.add(chkNoApto);
        chkNoApto.setText("NO CUMPLE CON EL PERFIL ");
        chkNoApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoAptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkApto)
                    .addComponent(chkNoApto))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkApto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkNoApto))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel90.setText("1- Exigencias psicológicas");

        bg1.add(chk1RPF);
        chk1RPF.setText("FAVORABLE");
        chk1RPF.setToolTipText("");
        chk1RPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1RPFActionPerformed(evt);
            }
        });

        bg1.add(chk1RPP);
        chk1RPP.setText("PROMEDIO");
        chk1RPP.setToolTipText("");
        chk1RPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1RPPActionPerformed(evt);
            }
        });

        bg1.add(chk1RPD);
        chk1RPD.setText("DESFAVORABLE");
        chk1RPD.setToolTipText("");
        chk1RPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1RPDActionPerformed(evt);
            }
        });

        bg2.add(chk2RPF);
        chk2RPF.setText("FAVORABLE");
        chk2RPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2RPFActionPerformed(evt);
            }
        });

        bg2.add(chk2RPP);
        chk2RPP.setText("PROMEDIO");
        chk2RPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2RPPActionPerformed(evt);
            }
        });

        bg2.add(chk2RPD);
        chk2RPD.setText("DESFAVORABLE");
        chk2RPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2RPDActionPerformed(evt);
            }
        });

        jLabel101.setText("2- Trabajo activo y posibilidades de desarrollo ");

        jLabel103.setText("3- Apoyo social");

        bg3.add(chk3RPF);
        chk3RPF.setText("FAVORABLE");
        chk3RPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3RPFActionPerformed(evt);
            }
        });

        bg3.add(chk3RPP);
        chk3RPP.setText("PROMEDIO");
        chk3RPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3RPPActionPerformed(evt);
            }
        });

        bg3.add(chk3RPD);
        chk3RPD.setText("DESFAVORABLE");
        chk3RPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3RPDActionPerformed(evt);
            }
        });

        jLabel106.setText("4- Compensaciones");

        bg4.add(chk4RPF);
        chk4RPF.setText("FAVORABLE");
        chk4RPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4RPFActionPerformed(evt);
            }
        });

        bg4.add(chk4RPP);
        chk4RPP.setText("PROMEDIO");
        chk4RPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4RPPActionPerformed(evt);
            }
        });

        bg4.add(chk4RPD);
        chk4RPD.setText("DESFAVORABLE");
        chk4RPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4RPDActionPerformed(evt);
            }
        });

        jLabel107.setText("5- Doble presencia");

        bg5.add(chk5RPF);
        chk5RPF.setText("FAVORABLE");
        chk5RPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5RPFActionPerformed(evt);
            }
        });

        bg5.add(chk5RPP);
        chk5RPP.setText("PROMEDIO");
        chk5RPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5RPPActionPerformed(evt);
            }
        });

        bg5.add(chk5RPD);
        chk5RPD.setText("DESFAVORABLE");
        chk5RPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5RPDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(chk1RPF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk1RPP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chk1RPD, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(chk2RPD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                        .addComponent(chk5RPF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk5RPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                        .addComponent(chk4RPF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk4RPP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chk4RPD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chk5RPD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(264, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                .addComponent(chk2RPF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk2RPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                .addComponent(chk3RPF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk3RPP, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk3RPD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(273, 273, 273))))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk1RPF)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk1RPP)
                        .addComponent(chk1RPD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk2RPF)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk2RPP)
                        .addComponent(chk2RPD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk3RPF)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk3RPP)
                        .addComponent(chk3RPD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk4RPF)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk4RPP)
                        .addComponent(chk4RPD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk5RPF)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk5RPP)
                        .addComponent(chk5RPD)))
                .addGap(5, 5, 5))
        );

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel122.setText("ANÁLISIS Y RESULTADOS");

        txtAnalisisResultados.setColumns(20);
        txtAnalisisResultados.setRows(5);
        jScrollPane15.setViewportView(txtAnalisisResultados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RIESGOS PSICOSOCIALES", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnActualizar)
                        .addGap(28, 28, 28)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
        if(!txtNorden.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from informe_riesgos_psicosociales where n_orden="+txtNorden.getText();
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
              printer(Integer.valueOf(txtNorden.getText().toString()));
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
        txtNorden.setText("");
        txtNombres.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        FechaEx.setDate(null);
        txtExamen.setText("");
        txtAnalisisResultados.setText("");
        txtRecomendaciones.setText("");
        
        bg1.clearSelection();
        bg2.clearSelection();
        bg3.clearSelection();
        bg4.clearSelection();
        
        bg5.clearSelection();
       
        bgConclusion.clearSelection();
        txtNorden.requestFocus();
        
    }
    public void Actualizar(){
            String sCodigo=txtNorden.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE  informe_riesgos_psicosociales\n" +
                    " SET fecha='"+FechaEx.getDate()+"',"+
                   "        chk1rpf='"+chk1RPF.isSelected()+"',"+
                   "        chk1rpp='"+chk1RPP.isSelected()+"',"+
                   "        chk1rpd='"+chk1RPD.isSelected()+"',"+
                    "       chk2rpf='"+chk2RPF.isSelected()+"',"+
                    "        chk2rpp='"+chk2RPP.isSelected()+"',"+
                    "        chk2rpd='"+chk2RPD.isSelected()+"',"+
                    "        chk3rpf='"+chk3RPF.isSelected()+"',"+
                    "        chk3rpp='"+chk3RPP.isSelected()+"',"+
                    "        chk3rpd='"+chk3RPD.isSelected()+"',"+
                    "        chk4rpf='"+chk4RPF.isSelected()+"',"+
                    "        chk4rpp='"+chk4RPP.isSelected()+"',"+
                    "        chk4rpd='"+chk4RPD.isSelected()+"',"+
                    "        chk5rpf='"+chk5RPF.isSelected()+"',"+
                    "        chk5rpp='"+chk5RPP.isSelected()+"',"+
                    "        chk5rpd='"+chk5RPD.isSelected()+"',"+
                   "        txtanalisis='"+txtAnalisisResultados.getText()+"',"+
                   "        txtrecomendaciones='"+txtRecomendaciones.getText()+"',"+
                   "        apto='"+chkApto.isSelected()+"',"+
                   "        noapto='"+chkNoApto.isSelected()+"'"+
                    " WHERE n_orden="+sCodigo+";";
               //  System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimir();
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InformeRiesgoPsicosocial.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }
    
    private boolean Grabar() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO informe_riesgos_psicosociales(\n" +
"            n_orden, fecha, chk1rpf, chk1rpp, chk1rpd, chk2rpf, chk2rpp, \n" +
"            chk2rpd, chk3rpf, chk3rpp, chk3rpd, chk4rpf, chk4rpp, chk4rpd, \n" +
"            chk5rpf, chk5rpp, chk5rpd, txtanalisis, txtrecomendaciones, apto, \n" +
"            noapto)";       
            strSqlStmt+= " values("+ txtNorden.getText()+",'"+
                    FechaEx.getDate()+ "','"+
                    chk1RPF.isSelected()+"','"+
                    chk1RPP.isSelected()+"','"+    
                    chk1RPD.isSelected()+"','"+
                    
                    chk2RPF.isSelected()+"','"+
                    chk2RPP.isSelected()+"','"+    
                    chk2RPD.isSelected()+"','"+
                   
                    chk3RPF.isSelected()+"','"+
                    chk3RPP.isSelected()+"','"+    
                    chk3RPD.isSelected()+"','"+
                   
                    chk4RPF.isSelected()+"','"+
                    chk4RPP.isSelected()+"','"+    
                    chk4RPD.isSelected()+"','"+
                    chk5RPF.isSelected()+"','"+    
                    chk5RPP.isSelected()+"','"+
                    chk5RPD.isSelected()+"','"+
                    txtAnalisisResultados.getText()+"','"+
                    txtRecomendaciones.getText()+"','"+
                    chkApto.isSelected()+"','"+          
                    chkNoApto.isSelected()+"'"+  
                    " ) ";
           // System.out.println(strSqlStmt);
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                    oFunc.SubSistemaMensajeInformacion("Examen Registrada");
                    
                   bResult = true;
                   oConn.sqlStmt.close();
               }
                return bResult;       
        }
    
       private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("Norden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Informe_Riesgos_Psicosociales.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint jasperPrint= JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    
                  JasperPrintManager.printReport(jasperPrint,true);
                  
                   } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
       private void print(Integer cod){

                Map parameters = new HashMap(); 
                parameters.put("Norden",cod);             
                
                  try 
                {
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"Informe_Riesgos_Psicosociales.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO DE PSICOLOGIA");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
    private boolean validar(){
        boolean bResultado=true;

            if (((JTextField)FechaEx.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        // TODO add your handling code here:
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
            if(!OrdenExiste()){
                String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,"
                + "d.sexo_pa,n.tipoprueba, n.nom_examen "
                + "FROM datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                + "WHERE n.n_orden ='"+txtNorden.getText() +"'";
                oConn.FnBoolQueryExecute(Sql);
                try {
                    if (oConn.setResult.next()) {
                        txtNombres.setText(oConn.setResult.getString("nombre"));
                        txtDni.setText(oConn.setResult.getString("cod_pa"));
                        FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                        txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar())) +" AÑOS" );
                        txtExamen.setText(oConn.setResult.getString("nom_examen"));
                        oPe.fecha(FechaEx);
                        //   oPe.fecha(FechaHotel);

                    }else{
                        oFunc.SubSistemaMensajeError("No se encuentra Algunos Registros necesarios(Alta en Ex-Ocupacionales)");
                    }
                    oConn.setResult.close();
                } catch (SQLException ex) {
                    oFunc.SubSistemaMensajeInformacion("psicologia:" + ex.getMessage().toString());}
            }else{
                oFunc.SubSistemaMensajeError("N° orden regitrado");
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtNordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNordenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNordenKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        JDateChooser FechaNacimiento = new com.toedter.calendar.JDateChooser();
        if(!txtNorden.getText().isEmpty()){
          
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombre, d.fecha_nacimiento_pa ,n.nom_examen,"
                    + "fecha, chk1rpf, chk1rpp, chk1rpd, chk2rpf, chk2rpp, \n" +
"       chk2rpd, chk3rpf, chk3rpp, chk3rpd, chk4rpf, chk4rpp, chk4rpd, \n" +
"       chk5rpf, chk5rpp, chk5rpd, txtanalisis, txtrecomendaciones, apto, \n" +
"       noapto " +
"                            FROM datos_paciente AS d     \n" +
"                            LEFT JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)     \n" +
"                            LEFT JOIN informe_riesgos_psicosociales AS ps ON (ps.n_orden = n.n_orden)  \n" +
"                            WHERE   n.n_orden ="+txtNorden.getText()+";";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombres.setText(oConn.setResult.getString("nombre"));
                    txtDni.setText(oConn.setResult.getString("cod_pa"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    txtEdad.setText(String.valueOf(oFunc.calcularEdad(FechaNacimiento.getCalendar()))+" AÑOS" );
                    txtExamen.setText(oConn.setResult.getString("nom_examen"));
                    
                    FechaEx.setDate(oConn.setResult.getDate("fecha"));
                    chk1RPF.setSelected(oConn.setResult.getBoolean("chk1rpf"));
                    chk1RPP.setSelected(oConn.setResult.getBoolean("chk1rpp"));
                    chk1RPD.setSelected(oConn.setResult.getBoolean("chk1rpd"));
                    
                    chk2RPF.setSelected(oConn.setResult.getBoolean("chk2rpf"));
                    chk2RPP.setSelected(oConn.setResult.getBoolean("chk2rpp"));
                    chk2RPD.setSelected(oConn.setResult.getBoolean("chk2rpd"));
                    chk3RPF.setSelected(oConn.setResult.getBoolean("chk3rpf"));
                    chk3RPP.setSelected(oConn.setResult.getBoolean("chk3rpp"));
                    chk3RPD.setSelected(oConn.setResult.getBoolean("chk3rpd"));
                    
                    chk4RPF.setSelected(oConn.setResult.getBoolean("chk4rpf"));
                    chk4RPP.setSelected(oConn.setResult.getBoolean("chk4rpp"));
                    chk4RPD.setSelected(oConn.setResult.getBoolean("chk4rpd"));
                    chk5RPF.setSelected(oConn.setResult.getBoolean("chk5rpf"));
                    chk5RPP.setSelected(oConn.setResult.getBoolean("chk5rpp"));
                    chk5RPD.setSelected(oConn.setResult.getBoolean("chk5rpd"));
                    
                    txtAnalisisResultados.setText(oConn.setResult.getString("txtanalisis"));
                    txtRecomendaciones.setText(oConn.setResult.getString("txtrecomendaciones"));
                    chkApto.setSelected(oConn.setResult.getBoolean("apto"));
                    chkNoApto.setSelected(oConn.setResult.getBoolean("noapto"));
                    
                    //jTextField9.setText(oConn.setResult.getString("valorigg"));
                }else{
                    oFunc.SubSistemaMensajeError("N° orden no registrado");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Informe Psicolaboral Anual:" + ex.getMessage().toString());}
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void FechaExPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaExPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaExPropertyChange

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed
        // TODO add your handling code here:
        print (Integer.parseInt(txtImprimir.getText()));
    }//GEN-LAST:event_txtImprimirActionPerformed

    private void btnImprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir5ActionPerformed
        // TODO add your handling code here:
        print (Integer.parseInt(txtImprimir.getText()));
    }//GEN-LAST:event_btnImprimir5ActionPerformed

    private void chkNoAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoAptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNoAptoActionPerformed

    private void chkAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAptoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(OrdenExiste()){
             Actualizar();
             limpiar();
        }
        else{
            if(!txtNorden.getText().isEmpty()){
                try {
                    if(validar()){
                        if(Grabar()){
                            imprimir();
                            limpiar();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InformeRiesgoPsicosocial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chk1RPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1RPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1RPFActionPerformed

    private void chk1RPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1RPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1RPPActionPerformed

    private void chk2RPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2RPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2RPFActionPerformed

    private void chk2RPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2RPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2RPPActionPerformed

    private void chk2RPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2RPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2RPDActionPerformed

    private void chk3RPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3RPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3RPFActionPerformed

    private void chk3RPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3RPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3RPPActionPerformed

    private void chk3RPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3RPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3RPDActionPerformed

    private void chk4RPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4RPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4RPFActionPerformed

    private void chk4RPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4RPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4RPPActionPerformed

    private void chk4RPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4RPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4RPDActionPerformed

    private void chk1RPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1RPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1RPDActionPerformed

    private void chk5RPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5RPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk5RPFActionPerformed

    private void chk5RPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5RPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk5RPPActionPerformed

    private void chk5RPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5RPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk5RPDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEx;
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
    private javax.swing.JCheckBox chk1RPD;
    private javax.swing.JCheckBox chk1RPF;
    private javax.swing.JCheckBox chk1RPP;
    private javax.swing.JCheckBox chk2RPD;
    private javax.swing.JCheckBox chk2RPF;
    private javax.swing.JCheckBox chk2RPP;
    private javax.swing.JCheckBox chk3RPD;
    private javax.swing.JCheckBox chk3RPF;
    private javax.swing.JCheckBox chk3RPP;
    private javax.swing.JCheckBox chk4RPD;
    private javax.swing.JCheckBox chk4RPF;
    private javax.swing.JCheckBox chk4RPP;
    private javax.swing.JCheckBox chk5RPD;
    private javax.swing.JCheckBox chk5RPF;
    private javax.swing.JCheckBox chk5RPP;
    private javax.swing.JCheckBox chkApto;
    private javax.swing.JCheckBox chkNoApto;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAnalisisResultados;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtExamen;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextArea txtRecomendaciones;
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
