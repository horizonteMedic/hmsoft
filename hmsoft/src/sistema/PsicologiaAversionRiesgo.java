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
public final class PsicologiaAversionRiesgo extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;
    private JDateChooser FechaNacimiento;

   public PsicologiaAversionRiesgo(){
      initComponents();
      //new ajTextArea.autocompleterText(atxtIntelectual, "razon_empresa", "empresas");
  
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgR = new javax.swing.ButtonGroup();
        bgM = new javax.swing.ButtonGroup();
        bgAC = new javax.swing.ButtonGroup();
        bgCVM = new javax.swing.ButtonGroup();
        bgOE = new javax.swing.ButtonGroup();
        bgCV = new javax.swing.ButtonGroup();
        bgEE = new javax.swing.ButtonGroup();
        bgTF = new javax.swing.ButtonGroup();
        bgAUTOESTIMA = new javax.swing.ButtonGroup();
        bgASERTIVIDAD = new javax.swing.ButtonGroup();
        bgAP5 = new javax.swing.ButtonGroup();
        bgAP6 = new javax.swing.ButtonGroup();
        bgAC1 = new javax.swing.ButtonGroup();
        bgAPSI1 = new javax.swing.ButtonGroup();
        bgAPSI2 = new javax.swing.ButtonGroup();
        bgAPSI3 = new javax.swing.ButtonGroup();
        bgAPSI4 = new javax.swing.ButtonGroup();
        bgAPSI5 = new javax.swing.ButtonGroup();
        bgAPSI6 = new javax.swing.ButtonGroup();
        bgAPSI7 = new javax.swing.ButtonGroup();
        bgAPSI8 = new javax.swing.ButtonGroup();
        bgConclusion = new javax.swing.ButtonGroup();
        jPanel28 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        n_orden = new javax.swing.JTextField();
        EDITAR = new javax.swing.JButton();
        FechaEvaluacion = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        GradoDeEstudios = new javax.swing.JLabel();
        grado_estudio = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        imprimir = new javax.swing.JTextField();
        btnImprimir5 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        analisis_resultados = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        recomendaciones = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        conclusiones_cumple = new javax.swing.JCheckBox();
        conclusiones_no_cumple = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        asp_Intel_Pract_Func_bajo = new javax.swing.JCheckBox();
        asp_Intel_Pract_Func_medio = new javax.swing.JCheckBox();
        asp_Intel_Pract_Func_alto = new javax.swing.JCheckBox();
        asp_Intel_Recur_bajo = new javax.swing.JCheckBox();
        asp_Intel_Recur_medio = new javax.swing.JCheckBox();
        asp_Intel_Recur_alto = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        asp_Intel_atenci_conc_bajo = new javax.swing.JCheckBox();
        asp_Intel_atenci_conc_medio = new javax.swing.JCheckBox();
        asp_Intel_atenci_conc_alto = new javax.swing.JCheckBox();
        jPanel31 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        asp_emoc_estabil_emoc_mad_bajo = new javax.swing.JCheckBox();
        asp_emoc_estabil_emoc_mad_medio = new javax.swing.JCheckBox();
        asp_emoc_estabil_emoc_mad_alto = new javax.swing.JCheckBox();
        asp_Flexib_manj_emoc_bajo = new javax.swing.JCheckBox();
        asp_Flexib_manj_emoc_medio = new javax.swing.JCheckBox();
        asp_Flexib_manj_emoc_alto = new javax.swing.JCheckBox();
        asp_ctrl_impul_medio = new javax.swing.JCheckBox();
        asp_ctrl_impul_alto = new javax.swing.JCheckBox();
        asp_ctrl_impul_bajo = new javax.swing.JCheckBox();
        jPanel32 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        comp_especf_cap_subor_bajo = new javax.swing.JCheckBox();
        comp_especf_cap_subor_medio = new javax.swing.JCheckBox();
        comp_especf_cap_subor_alto = new javax.swing.JCheckBox();
        comp_especf_Adec_nor_proced_bajo = new javax.swing.JCheckBox();
        comp_especf_Adec_nor_proced_medio = new javax.swing.JCheckBox();
        comp_especf_Adec_nor_proced_alto = new javax.swing.JCheckBox();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        comp_especf_Considera_terceros_bajo = new javax.swing.JCheckBox();
        comp_especf_Considera_terceros_medio = new javax.swing.JCheckBox();
        comp_especf_Considera_terceros_alto = new javax.swing.JCheckBox();
        jLabel111 = new javax.swing.JLabel();
        comp_especf_Autonomia_trabajar_bajo = new javax.swing.JCheckBox();
        comp_especf_Autonomia_trabajar_medio = new javax.swing.JCheckBox();
        comp_especf_Autonomia_trabajar_alto = new javax.swing.JCheckBox();
        jLabel112 = new javax.swing.JLabel();
        comp_especf_proactividad_bajo = new javax.swing.JCheckBox();
        comp_especf_proactividad_medio = new javax.swing.JCheckBox();
        comp_especf_proactividad_alto = new javax.swing.JCheckBox();
        jLabel113 = new javax.swing.JLabel();
        comp_especf_Cap_trabjo_bajo_presion_bajo = new javax.swing.JCheckBox();
        comp_especf_Cap_trabjo_bajo_presion_medio = new javax.swing.JCheckBox();
        comp_especf_Cap_trabjo_bajo_presion_alto = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        comp_especf_Cap_Evaluar_riesgos_bajo = new javax.swing.JCheckBox();
        comp_especf_Cap_Evaluar_riesgos_medio = new javax.swing.JCheckBox();
        comp_especf_Cap_Evaluar_riesgos_alto = new javax.swing.JCheckBox();
        jLabel93 = new javax.swing.JLabel();
        comp_especf_Mot_por_car_bajo = new javax.swing.JCheckBox();
        comp_especf_Mot_por_car_medio = new javax.swing.JCheckBox();
        comp_especf_Mot_por_car_alto = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("INFORME DE EVALUACIÓN PSICOLÓGICA DE AVERSIÓN AL RIESGO");

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

        EDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        EDITAR.setText("Editar");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        FechaEvaluacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaEvaluacionPropertyChange(evt);
            }
        });

        jLabel117.setText("Fecha Evaluacion :");

        jLabel118.setText("Nombres y Apellidos :");

        jLabel120.setText("Edad :");

        jLabel124.setText("Cargo : ");

        empresa.setText(" ");

        jLabel1.setText("Empresa :");

        cargo.setText(" ");

        GradoDeEstudios.setText("Grado de Instruccion :");

        grado_estudio.setText(" ");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EDITAR)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GradoDeEstudios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grado_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaEvaluacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EDITAR)
                        .addComponent(jLabel117)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GradoDeEstudios)
                    .addComponent(grado_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(btnImprimir5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel122.setText("RECOMENDACIONES");

        analisis_resultados.setColumns(20);
        analisis_resultados.setRows(5);
        jScrollPane15.setViewportView(analisis_resultados);

        jLabel121.setText("ANALISIS Y RESULTADOS");

        recomendaciones.setColumns(20);
        recomendaciones.setRows(5);
        jScrollPane14.setViewportView(recomendaciones);

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

        conclusiones_cumple.setText("CUMPLE CON EL PERFIL");
        conclusiones_cumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conclusiones_cumpleActionPerformed(evt);
            }
        });

        conclusiones_no_cumple.setText("NO CUMPLE CON EL PERFIL ");
        conclusiones_no_cumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conclusiones_no_cumpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conclusiones_cumple)
                    .addComponent(conclusiones_no_cumple))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conclusiones_cumple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(conclusiones_no_cumple))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS INTELECTUALES"));

        jLabel90.setText("1-Practica y Funcional ");

        asp_Intel_Pract_Func_bajo.setText("Bajo");
        asp_Intel_Pract_Func_bajo.setToolTipText("");
        asp_Intel_Pract_Func_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_Pract_Func_bajoActionPerformed(evt);
            }
        });

        asp_Intel_Pract_Func_medio.setText("Medio");
        asp_Intel_Pract_Func_medio.setToolTipText("");
        asp_Intel_Pract_Func_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_Pract_Func_medioActionPerformed(evt);
            }
        });

        asp_Intel_Pract_Func_alto.setText("Alto");
        asp_Intel_Pract_Func_alto.setToolTipText("");
        asp_Intel_Pract_Func_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_Pract_Func_altoActionPerformed(evt);
            }
        });

        asp_Intel_Recur_bajo.setText("Bajo");
        asp_Intel_Recur_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_Recur_bajoActionPerformed(evt);
            }
        });

        asp_Intel_Recur_medio.setText("Medio");
        asp_Intel_Recur_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_Recur_medioActionPerformed(evt);
            }
        });

        asp_Intel_Recur_alto.setText("Alto");
        asp_Intel_Recur_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_Recur_altoActionPerformed(evt);
            }
        });

        jLabel101.setText("2- Recursividad");

        jLabel103.setText("3- Capacidad de atención y concentración ");

        asp_Intel_atenci_conc_bajo.setText("Bajo");
        asp_Intel_atenci_conc_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_atenci_conc_bajoActionPerformed(evt);
            }
        });

        asp_Intel_atenci_conc_medio.setText("Medio");
        asp_Intel_atenci_conc_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_atenci_conc_medioActionPerformed(evt);
            }
        });

        asp_Intel_atenci_conc_alto.setText("Alto");
        asp_Intel_atenci_conc_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Intel_atenci_conc_altoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                            .addComponent(asp_Intel_atenci_conc_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(asp_Intel_atenci_conc_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asp_Intel_atenci_conc_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addComponent(asp_Intel_Recur_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(asp_Intel_Recur_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asp_Intel_Recur_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addComponent(asp_Intel_Pract_Func_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(asp_Intel_Pract_Func_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(asp_Intel_Pract_Func_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asp_Intel_Pract_Func_bajo)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asp_Intel_Pract_Func_medio)
                        .addComponent(asp_Intel_Pract_Func_alto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asp_Intel_Recur_bajo)
                        .addComponent(asp_Intel_Recur_medio))
                    .addComponent(asp_Intel_Recur_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asp_Intel_atenci_conc_bajo)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asp_Intel_atenci_conc_alto)
                        .addComponent(asp_Intel_atenci_conc_medio)))
                .addGap(17, 17, 17))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS EMOCIONALES"));

        jLabel89.setText("2- Flexibilidad en el manejo de las emociones ");

        jLabel99.setText("1- Estabilidad emocional – madurez");

        jLabel102.setText("3- Control de impulsos ");

        asp_emoc_estabil_emoc_mad_bajo.setText("Bajo");
        asp_emoc_estabil_emoc_mad_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_emoc_estabil_emoc_mad_bajoActionPerformed(evt);
            }
        });

        asp_emoc_estabil_emoc_mad_medio.setText("Medio");
        asp_emoc_estabil_emoc_mad_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_emoc_estabil_emoc_mad_medioActionPerformed(evt);
            }
        });

        asp_emoc_estabil_emoc_mad_alto.setText("Alto");
        asp_emoc_estabil_emoc_mad_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_emoc_estabil_emoc_mad_altoActionPerformed(evt);
            }
        });

        asp_Flexib_manj_emoc_bajo.setText("Bajo");
        asp_Flexib_manj_emoc_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Flexib_manj_emoc_bajoActionPerformed(evt);
            }
        });

        asp_Flexib_manj_emoc_medio.setText("Medio");
        asp_Flexib_manj_emoc_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Flexib_manj_emoc_medioActionPerformed(evt);
            }
        });

        asp_Flexib_manj_emoc_alto.setText("Alto");
        asp_Flexib_manj_emoc_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_Flexib_manj_emoc_altoActionPerformed(evt);
            }
        });

        asp_ctrl_impul_medio.setText("Medio");
        asp_ctrl_impul_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_ctrl_impul_medioActionPerformed(evt);
            }
        });

        asp_ctrl_impul_alto.setText("Alto");
        asp_ctrl_impul_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_ctrl_impul_altoActionPerformed(evt);
            }
        });

        asp_ctrl_impul_bajo.setText("Bajo");
        asp_ctrl_impul_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asp_ctrl_impul_bajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(asp_ctrl_impul_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asp_ctrl_impul_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(asp_ctrl_impul_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(asp_Flexib_manj_emoc_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asp_Flexib_manj_emoc_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(asp_Flexib_manj_emoc_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel31Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel31Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(asp_emoc_estabil_emoc_mad_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(asp_emoc_estabil_emoc_mad_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(asp_emoc_estabil_emoc_mad_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asp_emoc_estabil_emoc_mad_bajo)
                    .addComponent(asp_emoc_estabil_emoc_mad_medio)
                    .addComponent(asp_emoc_estabil_emoc_mad_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addGap(5, 5, 5)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asp_Flexib_manj_emoc_bajo)
                    .addComponent(asp_Flexib_manj_emoc_medio)
                    .addComponent(asp_Flexib_manj_emoc_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asp_ctrl_impul_bajo)
                    .addComponent(asp_ctrl_impul_medio)
                    .addComponent(asp_ctrl_impul_alto))
                .addContainerGap())
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("COMP. ESP. CONDUCTA SEGURA"));

        jLabel91.setText("1- Capacidad de subordinación ");

        comp_especf_cap_subor_bajo.setText("Bajo");
        comp_especf_cap_subor_bajo.setToolTipText("");
        comp_especf_cap_subor_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_cap_subor_bajoActionPerformed(evt);
            }
        });

        comp_especf_cap_subor_medio.setText("Medio");
        comp_especf_cap_subor_medio.setToolTipText("");
        comp_especf_cap_subor_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_cap_subor_medioActionPerformed(evt);
            }
        });

        comp_especf_cap_subor_alto.setText("Alto");
        comp_especf_cap_subor_alto.setToolTipText("");
        comp_especf_cap_subor_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_cap_subor_altoActionPerformed(evt);
            }
        });

        comp_especf_Adec_nor_proced_bajo.setText("Bajo");
        comp_especf_Adec_nor_proced_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Adec_nor_proced_bajoActionPerformed(evt);
            }
        });

        comp_especf_Adec_nor_proced_medio.setText("Medio");
        comp_especf_Adec_nor_proced_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Adec_nor_proced_medioActionPerformed(evt);
            }
        });

        comp_especf_Adec_nor_proced_alto.setText("Alto");
        comp_especf_Adec_nor_proced_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Adec_nor_proced_altoActionPerformed(evt);
            }
        });

        jLabel109.setText("2- Adecuación a las normas y procedimientos ");

        jLabel110.setText("3- Consideración de terceros ");

        comp_especf_Considera_terceros_bajo.setText("Bajo");
        comp_especf_Considera_terceros_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Considera_terceros_bajoActionPerformed(evt);
            }
        });

        comp_especf_Considera_terceros_medio.setText("Medio");
        comp_especf_Considera_terceros_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Considera_terceros_medioActionPerformed(evt);
            }
        });

        comp_especf_Considera_terceros_alto.setText("Alto");
        comp_especf_Considera_terceros_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Considera_terceros_altoActionPerformed(evt);
            }
        });

        jLabel111.setText("4- Autonomía para trabajar  ");

        comp_especf_Autonomia_trabajar_bajo.setText("Bajo");
        comp_especf_Autonomia_trabajar_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Autonomia_trabajar_bajoActionPerformed(evt);
            }
        });

        comp_especf_Autonomia_trabajar_medio.setText("Medio");
        comp_especf_Autonomia_trabajar_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Autonomia_trabajar_medioActionPerformed(evt);
            }
        });

        comp_especf_Autonomia_trabajar_alto.setText("Alto");
        comp_especf_Autonomia_trabajar_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Autonomia_trabajar_altoActionPerformed(evt);
            }
        });

        jLabel112.setText("5- Proactividad ");

        comp_especf_proactividad_bajo.setText("Bajo");
        comp_especf_proactividad_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_proactividad_bajoActionPerformed(evt);
            }
        });

        comp_especf_proactividad_medio.setText("Medio");
        comp_especf_proactividad_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_proactividad_medioActionPerformed(evt);
            }
        });

        comp_especf_proactividad_alto.setText("Alto");
        comp_especf_proactividad_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_proactividad_altoActionPerformed(evt);
            }
        });

        jLabel113.setText("6- Capacidad para trabajar bajo presión ");

        comp_especf_Cap_trabjo_bajo_presion_bajo.setText("Bajo");
        comp_especf_Cap_trabjo_bajo_presion_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Cap_trabjo_bajo_presion_bajoActionPerformed(evt);
            }
        });

        comp_especf_Cap_trabjo_bajo_presion_medio.setText("Medio");
        comp_especf_Cap_trabjo_bajo_presion_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Cap_trabjo_bajo_presion_medioActionPerformed(evt);
            }
        });

        comp_especf_Cap_trabjo_bajo_presion_alto.setText("Alto");
        comp_especf_Cap_trabjo_bajo_presion_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Cap_trabjo_bajo_presion_altoActionPerformed(evt);
            }
        });

        jLabel92.setText("7- Capacidad para evaluar riesgos ");

        comp_especf_Cap_Evaluar_riesgos_bajo.setText("Bajo");
        comp_especf_Cap_Evaluar_riesgos_bajo.setToolTipText("");
        comp_especf_Cap_Evaluar_riesgos_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Cap_Evaluar_riesgos_bajoActionPerformed(evt);
            }
        });

        comp_especf_Cap_Evaluar_riesgos_medio.setText("Medio");
        comp_especf_Cap_Evaluar_riesgos_medio.setToolTipText("");
        comp_especf_Cap_Evaluar_riesgos_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Cap_Evaluar_riesgos_medioActionPerformed(evt);
            }
        });

        comp_especf_Cap_Evaluar_riesgos_alto.setText("Alto");
        comp_especf_Cap_Evaluar_riesgos_alto.setToolTipText("");
        comp_especf_Cap_Evaluar_riesgos_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Cap_Evaluar_riesgos_altoActionPerformed(evt);
            }
        });

        jLabel93.setText("8- Motivación por el cargo ");

        comp_especf_Mot_por_car_bajo.setText("Bajo");
        comp_especf_Mot_por_car_bajo.setToolTipText("");
        comp_especf_Mot_por_car_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Mot_por_car_bajoActionPerformed(evt);
            }
        });

        comp_especf_Mot_por_car_medio.setText("Medio");
        comp_especf_Mot_por_car_medio.setToolTipText("");
        comp_especf_Mot_por_car_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Mot_por_car_medioActionPerformed(evt);
            }
        });

        comp_especf_Mot_por_car_alto.setText("Alto");
        comp_especf_Mot_por_car_alto.setToolTipText("");
        comp_especf_Mot_por_car_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp_especf_Mot_por_car_altoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel32Layout.createSequentialGroup()
                            .addComponent(comp_especf_cap_subor_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comp_especf_cap_subor_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(comp_especf_cap_subor_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                                    .addComponent(comp_especf_Autonomia_trabajar_bajo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comp_especf_Autonomia_trabajar_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                                    .addComponent(comp_especf_Considera_terceros_bajo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comp_especf_Considera_terceros_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comp_especf_Considera_terceros_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comp_especf_proactividad_alto)
                                    .addComponent(comp_especf_Autonomia_trabajar_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel32Layout.createSequentialGroup()
                            .addComponent(comp_especf_Adec_nor_proced_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(comp_especf_Adec_nor_proced_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comp_especf_Adec_nor_proced_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                            .addComponent(comp_especf_proactividad_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comp_especf_proactividad_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78))
                        .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                            .addComponent(comp_especf_Mot_por_car_bajo)
                            .addGap(36, 36, 36)
                            .addComponent(comp_especf_Mot_por_car_medio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comp_especf_Mot_por_car_alto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                            .addComponent(comp_especf_Cap_Evaluar_riesgos_bajo)
                            .addGap(36, 36, 36)
                            .addComponent(comp_especf_Cap_Evaluar_riesgos_medio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comp_especf_Cap_Evaluar_riesgos_alto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel32Layout.createSequentialGroup()
                            .addComponent(comp_especf_Cap_trabjo_bajo_presion_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(comp_especf_Cap_trabjo_bajo_presion_medio)
                            .addGap(35, 35, 35)
                            .addComponent(comp_especf_Cap_trabjo_bajo_presion_alto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comp_especf_cap_subor_bajo)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comp_especf_cap_subor_medio)
                        .addComponent(comp_especf_cap_subor_alto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp_especf_Adec_nor_proced_bajo)
                    .addComponent(comp_especf_Adec_nor_proced_medio)
                    .addComponent(comp_especf_Adec_nor_proced_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp_especf_Considera_terceros_bajo)
                    .addComponent(comp_especf_Considera_terceros_medio)
                    .addComponent(comp_especf_Considera_terceros_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comp_especf_Autonomia_trabajar_bajo)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comp_especf_Autonomia_trabajar_alto)
                        .addComponent(comp_especf_Autonomia_trabajar_medio)))
                .addGap(2, 2, 2)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comp_especf_proactividad_bajo)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comp_especf_proactividad_medio)
                        .addComponent(comp_especf_proactividad_alto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp_especf_Cap_trabjo_bajo_presion_bajo)
                    .addComponent(comp_especf_Cap_trabjo_bajo_presion_medio)
                    .addComponent(comp_especf_Cap_trabjo_bajo_presion_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp_especf_Cap_Evaluar_riesgos_bajo)
                    .addComponent(comp_especf_Cap_Evaluar_riesgos_medio)
                    .addComponent(comp_especf_Cap_Evaluar_riesgos_alto))
                .addGap(0, 0, 0)
                .addComponent(jLabel93)
                .addGap(0, 0, 0)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp_especf_Mot_por_car_bajo)
                    .addComponent(comp_especf_Mot_por_car_medio)
                    .addComponent(comp_especf_Mot_por_car_alto))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel30.getAccessibleContext().setAccessibleName("");
        jPanel31.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("ASPECTOS A EVALUAR", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane15)
                                    .addComponent(jScrollPane14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel122)
                                            .addComponent(jLabel121))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar)
                                .addGap(32, 32, 32)
                                .addComponent(btnLimpiar)
                                .addGap(22, 22, 22)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnActualizar))
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean OrdenExiste()
     {
        boolean bResultado=false;
        if(!n_orden.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from Aversionalriesgo where n_orden="+n_orden.getText();
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
              printer(Integer.valueOf(n_orden.getText()));
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
        edad.setText(null);
        empresa.setText(null);
        cargo.setText(null);
        grado_estudio.setText(null);       
        FechaEvaluacion.setDate(null);  
       // n_orden.setEnabled(true);
        
        asp_Intel_Pract_Func_bajo.setSelected(false); 
        asp_Intel_Pract_Func_medio.setSelected(false);        
        asp_Intel_Pract_Func_alto.setSelected(false);        
        asp_Intel_Recur_bajo.setSelected(false); 
        asp_Intel_Recur_medio.setSelected(false); 
        asp_Intel_Recur_alto.setSelected(false); 
        asp_Intel_atenci_conc_bajo.setSelected(false); 
        asp_Intel_atenci_conc_medio.setSelected(false); 
        asp_Intel_atenci_conc_alto.setSelected(false);
        asp_emoc_estabil_emoc_mad_bajo.setSelected(false); 
        asp_emoc_estabil_emoc_mad_medio.setSelected(false); 
        asp_emoc_estabil_emoc_mad_alto.setSelected(false);
        asp_Flexib_manj_emoc_bajo.setSelected(false); 
        asp_Flexib_manj_emoc_medio.setSelected(false); 
        asp_Flexib_manj_emoc_alto.setSelected(false);
        asp_ctrl_impul_bajo.setSelected(false); 
        asp_ctrl_impul_medio.setSelected(false); 
        asp_ctrl_impul_alto.setSelected(false);
        comp_especf_cap_subor_bajo.setSelected(false); 
        comp_especf_cap_subor_medio.setSelected(false); 
        comp_especf_cap_subor_alto.setSelected(false);
        comp_especf_Adec_nor_proced_bajo.setSelected(false); 
        comp_especf_Adec_nor_proced_medio.setSelected(false); 
        comp_especf_Adec_nor_proced_alto.setSelected(false);
        comp_especf_Considera_terceros_bajo.setSelected(false); 
        comp_especf_Considera_terceros_medio.setSelected(false); 
        comp_especf_Considera_terceros_alto.setSelected(false);
        comp_especf_Autonomia_trabajar_bajo.setSelected(false); 
        comp_especf_Autonomia_trabajar_medio.setSelected(false); 
        comp_especf_Autonomia_trabajar_alto.setSelected(false);
        comp_especf_proactividad_bajo.setSelected(false); 
        comp_especf_proactividad_medio.setSelected(false); 
        comp_especf_proactividad_alto.setSelected(false);
        comp_especf_Cap_trabjo_bajo_presion_bajo.setSelected(false); 
        comp_especf_Cap_trabjo_bajo_presion_medio.setSelected(false); 
        comp_especf_Cap_trabjo_bajo_presion_alto.setSelected(false);
        comp_especf_Cap_Evaluar_riesgos_bajo.setSelected(false); 
        comp_especf_Cap_Evaluar_riesgos_medio.setSelected(false); 
        comp_especf_Cap_Evaluar_riesgos_alto.setSelected(false);
        comp_especf_Mot_por_car_bajo.setSelected(false); 
        comp_especf_Mot_por_car_medio.setSelected(false); 
        comp_especf_Mot_por_car_alto.setSelected(false);
        analisis_resultados.setText(""); 
        recomendaciones.setText(""); 
        conclusiones_cumple.setSelected(false); 
        conclusiones_no_cumple.setSelected(false);
        imprimir.setText("");
        n_orden.requestFocus();
        
    }
    
    public void Actualizar(){
       String sCodigo=n_orden.getText();
       if(!n_orden.getText().isEmpty()){
                if(validar()){
            String strSqlStmt;
             String Query ;
            strSqlStmt="UPDATE Aversionalriesgo ";
            Query="SET ";            
                Query += "asp_Intel_Pract_Func_bajo='"+asp_Intel_Pract_Func_bajo.isSelected()+ "'";
                Query += ",asp_Intel_Pract_Func_medio='"+asp_Intel_Pract_Func_medio.isSelected()+ "'";
                Query += ",asp_Intel_Pract_Func_alto='"+asp_Intel_Pract_Func_alto.isSelected()+ "'";

                Query += ",asp_Intel_Recur_bajo='"+asp_Intel_Recur_bajo.isSelected()+ "'";
                Query += ",asp_Intel_Recur_medio='"+asp_Intel_Recur_medio.isSelected()+ "'";
                Query += ",asp_Intel_Recur_alto='"+asp_Intel_Recur_alto.isSelected()+ "'";

                Query += ",asp_Intel_atenci_conc_bajo='"+asp_Intel_atenci_conc_bajo.isSelected()+ "'";
                Query += ",asp_Intel_atenci_conc_medio='"+asp_Intel_atenci_conc_medio.isSelected()+ "'";
                Query += ",asp_Intel_atenci_conc_alto='"+asp_Intel_atenci_conc_alto.isSelected()+ "'";
                
                Query += ",asp_emoc_estabil_emoc_mad_bajo='"+asp_emoc_estabil_emoc_mad_bajo.isSelected()+ "'";
                Query += ",asp_emoc_estabil_emoc_mad_medio='"+asp_emoc_estabil_emoc_mad_medio.isSelected()+ "'";
                Query += ",asp_emoc_estabil_emoc_mad_alto='"+asp_emoc_estabil_emoc_mad_alto.isSelected()+ "'";
                
                Query += ",asp_Flexib_manj_emoc_bajo='"+asp_Flexib_manj_emoc_bajo.isSelected()+ "'";
                Query += ",asp_Flexib_manj_emoc_medio='"+asp_Flexib_manj_emoc_medio.isSelected()+ "'";
                Query += ",asp_Flexib_manj_emoc_alto='"+asp_Flexib_manj_emoc_alto.isSelected()+ "'";
                
                Query += ",asp_ctrl_impul_bajo='"+asp_ctrl_impul_bajo.isSelected()+ "'";
                Query += ",asp_ctrl_impul_medio='"+asp_ctrl_impul_medio.isSelected()+ "'";
                Query += ",asp_ctrl_impul_alto='"+asp_ctrl_impul_alto.isSelected()+ "'";

                Query += ",comp_especf_cap_subor_bajo='"+comp_especf_cap_subor_bajo.isSelected()+ "'";
                Query += ",comp_especf_cap_subor_medio='"+comp_especf_cap_subor_medio.isSelected()+ "'";
                Query += ",comp_especf_cap_subor_alto='"+comp_especf_cap_subor_alto.isSelected()+ "'";             
                
                Query += ",comp_especf_Adec_nor_proced_bajo='"+comp_especf_Adec_nor_proced_bajo.isSelected()+ "'";
                Query += ",comp_especf_Adec_nor_proced_medio='"+comp_especf_Adec_nor_proced_medio.isSelected()+ "'";
                Query += ",comp_especf_Adec_nor_proced_alto='"+comp_especf_Adec_nor_proced_alto.isSelected()+ "'";

                Query += ",comp_especf_Considera_terceros_bajo='"+comp_especf_Considera_terceros_bajo.isSelected()+ "'";
                Query += ",comp_especf_Considera_terceros_medio='"+comp_especf_Considera_terceros_medio.isSelected()+ "'";
                Query += ",comp_especf_Considera_terceros_alto='"+comp_especf_Considera_terceros_alto.isSelected()+ "'";

                Query += ",comp_especf_Autonomia_trabajar_bajo='"+comp_especf_Autonomia_trabajar_bajo.isSelected()+ "'";
                Query += ",comp_especf_Autonomia_trabajar_medio='"+comp_especf_Autonomia_trabajar_medio.isSelected()+ "'";
                Query += ",comp_especf_Autonomia_trabajar_alto='"+comp_especf_Autonomia_trabajar_alto.isSelected()+ "'";

                Query += ",comp_especf_proactividad_bajo='"+comp_especf_proactividad_bajo.isSelected()+ "'";
                Query += ",comp_especf_proactividad_medio='"+comp_especf_proactividad_medio.isSelected()+ "'";
                Query += ",comp_especf_proactividad_alto='"+comp_especf_proactividad_alto.isSelected()+ "'";

                Query += ",comp_especf_Cap_trabjo_bajo_presion_bajo='"+comp_especf_Cap_trabjo_bajo_presion_bajo.isSelected()+ "'";
                Query += ",comp_especf_Cap_trabjo_bajo_presion_medio='"+comp_especf_Cap_trabjo_bajo_presion_medio.isSelected()+ "'";
                Query += ",comp_especf_Cap_trabjo_bajo_presion_alto='"+comp_especf_Cap_trabjo_bajo_presion_alto.isSelected()+ "'";

                Query += ",comp_especf_Cap_Evaluar_riesgos_bajo='"+comp_especf_Cap_Evaluar_riesgos_bajo.isSelected()+ "'";
                Query += ",comp_especf_Cap_Evaluar_riesgos_medio='"+comp_especf_Cap_Evaluar_riesgos_medio.isSelected()+ "'";
                Query += ",comp_especf_Cap_Evaluar_riesgos_alto='"+comp_especf_Cap_Evaluar_riesgos_alto.isSelected()+ "'";
           
                Query += ",comp_especf_Mot_por_car_bajo='"+comp_especf_Mot_por_car_bajo.isSelected()+ "'";
                Query += ",comp_especf_Mot_por_car_medio='"+comp_especf_Mot_por_car_medio.isSelected()+ "'";
                Query += ",comp_especf_Mot_por_car_alto='"+comp_especf_Mot_por_car_alto.isSelected()+ "'";
     
                Query += ",analisis_resultados='"+analisis_resultados.getText()+ "'";
                Query += ",recomendaciones='"+recomendaciones.getText()+ "'";
                Query += ",conclusiones_cumple='"+conclusiones_cumple.isSelected()+ "'";
                Query += ",conclusiones_no_cumple='"+conclusiones_no_cumple.isSelected()+ "'";
                
                Query +=   " WHERE n_orden='"+ sCodigo +"'";
                System.out.println("El comando es :" + strSqlStmt + Query );
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt + Query )) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimir();
                limpiar();
            }else{
             oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
               }
                    try {
                        oConn.sqlStmt.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(EvaluacionMusculoEsqueletica.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        
        }else {  oFunc.SubSistemaMensajeError("Llene los Campos correctamente");
        n_orden.requestFocus();}
        
  
   }     

    
    private void Grabar() {
        if(!n_orden.getText().isEmpty()){
                 if(!oPe.nOrden(n_orden, "Aversionalriesgo")){
                if(validar()){
            String strSqlStmt;
            String Query ;       
            strSqlStmt ="INSERT INTO Aversionalriesgo(";
            Query="Values(";
                if (!n_orden.getText().isEmpty() )
                {strSqlStmt += "n_orden";Query += n_orden.getText();}
            
                strSqlStmt += ",asp_Intel_Pract_Func_bajo";Query += ",'"+asp_Intel_Pract_Func_bajo.isSelected()+"'";            
                strSqlStmt += ",asp_Intel_Pract_Func_medio";Query += ",'"+asp_Intel_Pract_Func_medio.isSelected()+"'";   
                strSqlStmt += ",asp_Intel_Pract_Func_alto";Query += ",'"+asp_Intel_Pract_Func_alto.isSelected()+"'";
                    
                strSqlStmt += ",asp_Intel_Recur_bajo";Query += ",'"+    asp_Intel_Recur_bajo.isSelected()+"'";
                strSqlStmt += ",asp_Intel_Recur_medio";Query += ",'"+    asp_Intel_Recur_medio.isSelected()+"'";    
                strSqlStmt += ",asp_Intel_Recur_alto";Query += ",'"+    asp_Intel_Recur_alto.isSelected()+"'";
                    
                strSqlStmt += ",asp_Intel_atenci_conc_bajo";Query += ",'"+    asp_Intel_atenci_conc_bajo.isSelected()+"'";
                strSqlStmt += ",asp_Intel_atenci_conc_medio";Query += ",'"+    asp_Intel_atenci_conc_medio.isSelected()+"'";   
                strSqlStmt += ",asp_Intel_atenci_conc_alto";Query += ",'"+    asp_Intel_atenci_conc_alto.isSelected()+"'";
                    
                strSqlStmt += ",asp_emoc_estabil_emoc_mad_bajo";Query += ",'"+    asp_emoc_estabil_emoc_mad_bajo.isSelected()+"'"; 
                strSqlStmt += ",asp_emoc_estabil_emoc_mad_medio";Query += ",'"+    asp_emoc_estabil_emoc_mad_medio.isSelected()+"'";  
                strSqlStmt += ",asp_emoc_estabil_emoc_mad_alto";Query += ",'"+    asp_emoc_estabil_emoc_mad_alto.isSelected()+"'"; 

                strSqlStmt += ",asp_Flexib_manj_emoc_bajo";Query += ",'"+    asp_Flexib_manj_emoc_bajo.isSelected()+"'"; 
                strSqlStmt += ",asp_Flexib_manj_emoc_medio";Query += ",'"+    asp_Flexib_manj_emoc_medio.isSelected()+"'";  
                strSqlStmt += ",asp_Flexib_manj_emoc_alto";Query += ",'"+    asp_Flexib_manj_emoc_alto.isSelected()+"'";  

                strSqlStmt += ",asp_ctrl_impul_bajo";Query += ",'"+    asp_ctrl_impul_bajo.isSelected()+"'";  
                strSqlStmt += ",asp_ctrl_impul_medio";Query += ",'"+    asp_ctrl_impul_medio.isSelected()+"'"; 
                strSqlStmt += ",asp_ctrl_impul_alto";Query += ",'"+    asp_ctrl_impul_alto.isSelected()+"'"; 
                    
                strSqlStmt += ",comp_especf_cap_subor_bajo";Query += ",'"+    comp_especf_cap_subor_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_cap_subor_medio";Query += ",'"+    comp_especf_cap_subor_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_cap_subor_alto";Query += ",'"+    comp_especf_cap_subor_alto.isSelected()+"'";
                   
                strSqlStmt += ",comp_especf_Adec_nor_proced_bajo";Query += ",'"+    comp_especf_Adec_nor_proced_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_Adec_nor_proced_medio";Query += ",'"+    comp_especf_Adec_nor_proced_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_Adec_nor_proced_alto";Query += ",'"+    comp_especf_Adec_nor_proced_alto.isSelected()+"'";
                    
                strSqlStmt += ",comp_especf_Considera_terceros_bajo";Query += ",'"+    comp_especf_Considera_terceros_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_Considera_terceros_medio";Query += ",'"+    comp_especf_Considera_terceros_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_Considera_terceros_alto";Query += ",'"+    comp_especf_Considera_terceros_alto.isSelected()+"'";
                    
                strSqlStmt += ",comp_especf_Autonomia_trabajar_bajo";Query += ",'"+    comp_especf_Autonomia_trabajar_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_Autonomia_trabajar_medio";Query += ",'"+    comp_especf_Autonomia_trabajar_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_Autonomia_trabajar_alto";Query += ",'"+    comp_especf_Autonomia_trabajar_alto.isSelected()+"'";
                    
                strSqlStmt += ",comp_especf_proactividad_bajo";Query += ",'"+    comp_especf_proactividad_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_proactividad_medio";Query += ",'"+    comp_especf_proactividad_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_proactividad_alto";Query += ",'"+    comp_especf_proactividad_alto.isSelected()+"'";
                    
                strSqlStmt += ",comp_especf_Cap_trabjo_bajo_presion_bajo";Query += ",'"+    comp_especf_Cap_trabjo_bajo_presion_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_Cap_trabjo_bajo_presion_medio";Query += ",'"+    comp_especf_Cap_trabjo_bajo_presion_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_Cap_trabjo_bajo_presion_alto";Query += ",'"+    comp_especf_Cap_trabjo_bajo_presion_alto.isSelected()+"'";
                    
                strSqlStmt += ",comp_especf_Cap_Evaluar_riesgos_bajo";Query += ",'"+    comp_especf_Cap_Evaluar_riesgos_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_Cap_Evaluar_riesgos_medio";Query += ",'"+    comp_especf_Cap_Evaluar_riesgos_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_Cap_Evaluar_riesgos_alto";Query += ",'"+   comp_especf_Cap_Evaluar_riesgos_alto.isSelected()+"'";
                    
                strSqlStmt += ",comp_especf_Mot_por_car_bajo";Query += ",'"+    comp_especf_Mot_por_car_bajo.isSelected()+"'";
                strSqlStmt += ",comp_especf_Mot_por_car_medio";Query += ",'"+    comp_especf_Mot_por_car_medio.isSelected()+"'";    
                strSqlStmt += ",comp_especf_Mot_por_car_alto";Query += ",'"+    comp_especf_Mot_por_car_alto.isSelected()+"'";
                    
                strSqlStmt += ",analisis_resultados";Query += ",'"+    analisis_resultados.getText()+"'";
                strSqlStmt += ",recomendaciones";Query += ",'"+    recomendaciones.getText()+"'";
                strSqlStmt += ",conclusiones_cumple";Query += ",'"+    conclusiones_cumple.isSelected()+"'";         
                strSqlStmt += ",conclusiones_no_cumple";Query += ",'"+    conclusiones_no_cumple.isSelected()+"'";  
                    
                System.out.println("el comando es: " + strSqlStmt.concat(") ") + Query.concat(")"));
//        
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))){
//                   
                oFunc.SubSistemaMensajeInformacion("Examen Registrado Exitosamente");
                    
                   imprimir();
                   limpiar();
               }else{
                    oFunc.SubSistemaMensajeError("No se pudo registrar ");
                       }
                    try
                        {
                        oConn.sqlStmt.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(EvaluacionMusculoEsqueletica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        
                }else {  oFunc.SubSistemaMensajeError("Llene los Campos correctamente");
                 n_orden.requestFocus();}
            }
    }
   
       private void printer(Integer cod){
                 Map parameters = new HashMap(); 
                parameters.put("n_orden",cod);      
                    try 
                {                     
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"INFORME_DE_EVALUACIÓN_PSICOLÓGICA_DE_AVERSIÓN_AL_RIESGO.jasper";
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"INFORME_DE_EVALUACIÓN_PSICOLÓGICA_DE_AVERSIÓN_AL_RIESGO.jasper";
                    JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                    JasperPrint myPrint = JasperFillManager.fillReport(myReport,parameters,clsConnection.oConnection);
                    JasperViewer viewer = new JasperViewer(myPrint, false);
                    viewer.setTitle("FORMATO DE AVERSION AL RIESGO");
                   // viewer.setAlwaysOnTop(true);
                    viewer.setVisible(true);
                 } catch (JRException ex) {
                    Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
    private boolean validar(){
        boolean bResultado=true;

            if (((JTextField)FechaEvaluacion.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
    private void n_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ordenActionPerformed
        // boton N_orden espacio
        if(!n_orden.getText().isEmpty()){
            if(!oPe.nOrden(n_orden, "Aversionalriesgo"))  {
                FechaNacimiento = new com.toedter.calendar.JDateChooser();
                String Sql="select n.n_orden, d.nombres_pa||' '||d.apellidos_pa as nombres, d.nivel_est_pa, d.cod_pa, d.fecha_nacimiento_pa , "
                + "n.cargo_de ,n.razon_empresa, EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad, n.fecha_apertura_po from datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) WHERE n.n_orden ='"+n_orden.getText()+"'";
                oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    nombres.setText(oConn.setResult.getString("nombres"));
                    grado_estudio.setText(oConn.setResult.getString("nivel_est_pa"));
                    cargo.setText(oConn.setResult.getString("cargo_de"));
                    empresa.setText(oConn.setResult.getString("razon_empresa"));
                    edad.setText(oConn.setResult.getString("edad"));
                    FechaNacimiento.setDate(oConn.setResult.getDate("fecha_nacimiento_pa"));
                    
                    conclusiones_cumple.setSelected(true);
                    FechaEvaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    FechaEvaluacion.setEnabled(false);
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("PsicologiaAversionRiesgo:" + ex.getMessage());
            }
        }
            else
                oFunc.SubSistemaMensajeInformacion("Ya existe este registro en Aversion de Riesgo ");
      }
    }//GEN-LAST:event_n_ordenActionPerformed

    private void n_ordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_ordenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_n_ordenKeyTyped

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        // TODO add your handling code here:
        if(!n_orden.getText().isEmpty()){
            String Sql="select n.n_orden, d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombres, d.fecha_nacimiento_pa,EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad,"                                   
                    +"n.cargo_de ,n.razon_empresa,nivel_est_pa,n.fecha_apertura_po,ar.*"
                    +"  FROM datos_paciente AS d \n" 
                    +"  INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n" 
                    +"  INNER JOIN Aversionalriesgo AS ar ON (ar.n_orden = n.n_orden)\n" 
                    +"  WHERE   n.n_orden ="+n_orden.getText()+";";
            System.out.println(Sql);
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    nombres.setText(oConn.setResult.getString("nombres"));
                    edad.setText(oConn.setResult.getString("edad") );
                    FechaEvaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    grado_estudio.setText(oConn.setResult.getString("nivel_est_pa"));
                    empresa.setText(oConn.setResult.getString("razon_empresa"));
                    cargo.setText(oConn.setResult.getString("cargo_de"));
                    
                    asp_Intel_Pract_Func_bajo.setSelected(oConn.setResult.getBoolean("asp_Intel_Pract_Func_bajo"));
                    asp_Intel_Pract_Func_medio.setSelected(oConn.setResult.getBoolean("asp_Intel_Pract_Func_medio"));
                    asp_Intel_Pract_Func_alto.setSelected(oConn.setResult.getBoolean("asp_Intel_Pract_Func_alto"));
          
                    asp_Intel_Recur_bajo.setSelected(oConn.setResult.getBoolean("asp_Intel_Recur_bajo"));
                    asp_Intel_Recur_medio.setSelected(oConn.setResult.getBoolean("asp_Intel_Recur_medio"));
                    asp_Intel_Recur_alto.setSelected(oConn.setResult.getBoolean("asp_Intel_Recur_alto"));
          
                    asp_Intel_atenci_conc_bajo.setSelected(oConn.setResult.getBoolean("asp_Intel_atenci_conc_bajo"));
                    asp_Intel_atenci_conc_medio.setSelected(oConn.setResult.getBoolean("asp_Intel_atenci_conc_medio"));
                    asp_Intel_atenci_conc_alto.setSelected(oConn.setResult.getBoolean("asp_Intel_atenci_conc_alto"));
                    
                    asp_emoc_estabil_emoc_mad_bajo.setSelected(oConn.setResult.getBoolean("asp_emoc_estabil_emoc_mad_bajo")); 
                    asp_emoc_estabil_emoc_mad_medio.setSelected(oConn.setResult.getBoolean("asp_emoc_estabil_emoc_mad_medio")); 
                    asp_emoc_estabil_emoc_mad_alto.setSelected(oConn.setResult.getBoolean("asp_emoc_estabil_emoc_mad_alto")); 

                    asp_Flexib_manj_emoc_bajo.setSelected(oConn.setResult.getBoolean("asp_Flexib_manj_emoc_bajo")); 
                    asp_Flexib_manj_emoc_medio.setSelected(oConn.setResult.getBoolean("asp_Flexib_manj_emoc_medio")); 
                    asp_Flexib_manj_emoc_alto.setSelected(oConn.setResult.getBoolean("asp_Flexib_manj_emoc_alto")); 

                    asp_ctrl_impul_bajo.setSelected(oConn.setResult.getBoolean("asp_ctrl_impul_bajo")); 
                    asp_ctrl_impul_medio.setSelected(oConn.setResult.getBoolean("asp_ctrl_impul_medio")); 
                    asp_ctrl_impul_alto.setSelected(oConn.setResult.getBoolean("asp_ctrl_impul_alto")); 
                
                    comp_especf_cap_subor_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_cap_subor_bajo"));
                    comp_especf_cap_subor_medio.setSelected(oConn.setResult.getBoolean("comp_especf_cap_subor_medio"));
                    comp_especf_cap_subor_alto.setSelected(oConn.setResult.getBoolean("comp_especf_cap_subor_alto"));
       
                    comp_especf_Adec_nor_proced_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_Adec_nor_proced_bajo"));
                    comp_especf_Adec_nor_proced_medio.setSelected(oConn.setResult.getBoolean("comp_especf_Adec_nor_proced_medio"));
                    comp_especf_Adec_nor_proced_alto.setSelected(oConn.setResult.getBoolean("comp_especf_Adec_nor_proced_alto"));
                
                    comp_especf_Considera_terceros_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_Considera_terceros_bajo"));
                    comp_especf_Considera_terceros_medio.setSelected(oConn.setResult.getBoolean("comp_especf_Considera_terceros_medio"));
                    comp_especf_Considera_terceros_alto.setSelected(oConn.setResult.getBoolean("comp_especf_Considera_terceros_alto"));
              
                    comp_especf_Autonomia_trabajar_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_Autonomia_trabajar_bajo"));
                    comp_especf_Autonomia_trabajar_medio.setSelected(oConn.setResult.getBoolean("comp_especf_Autonomia_trabajar_medio"));
                    comp_especf_Autonomia_trabajar_alto.setSelected(oConn.setResult.getBoolean("comp_especf_Autonomia_trabajar_alto"));
                 
                    comp_especf_proactividad_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_proactividad_bajo"));
                    comp_especf_proactividad_medio.setSelected(oConn.setResult.getBoolean("comp_especf_proactividad_medio"));
                    comp_especf_proactividad_alto.setSelected(oConn.setResult.getBoolean("comp_especf_proactividad_alto"));
                 
                    comp_especf_Cap_trabjo_bajo_presion_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_Cap_trabjo_bajo_presion_bajo"));
                    comp_especf_Cap_trabjo_bajo_presion_medio.setSelected(oConn.setResult.getBoolean("comp_especf_Cap_trabjo_bajo_presion_medio"));
                    comp_especf_Cap_trabjo_bajo_presion_alto.setSelected(oConn.setResult.getBoolean("comp_especf_Cap_trabjo_bajo_presion_alto"));
                
                    comp_especf_Cap_Evaluar_riesgos_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_Cap_Evaluar_riesgos_bajo"));
                    comp_especf_Cap_Evaluar_riesgos_medio.setSelected(oConn.setResult.getBoolean("comp_especf_Cap_Evaluar_riesgos_medio"));
                    comp_especf_Cap_Evaluar_riesgos_alto.setSelected(oConn.setResult.getBoolean("comp_especf_Cap_Evaluar_riesgos_alto"));
                   
                    comp_especf_Mot_por_car_bajo.setSelected(oConn.setResult.getBoolean("comp_especf_Mot_por_car_bajo"));
                    comp_especf_Mot_por_car_medio.setSelected(oConn.setResult.getBoolean("comp_especf_Mot_por_car_medio"));
                    comp_especf_Mot_por_car_alto.setSelected(oConn.setResult.getBoolean("comp_especf_Mot_por_car_alto"));
                   
                    analisis_resultados.setText(oConn.setResult.getString("analisis_resultados"));
                    recomendaciones.setText(oConn.setResult.getString("recomendaciones"));
                    conclusiones_cumple.setSelected(oConn.setResult.getBoolean("conclusiones_cumple"));
                    conclusiones_no_cumple.setSelected(oConn.setResult.getBoolean("conclusiones_no_cumple"));
                    
                    nombres.setEnabled(false);
                    edad.setEnabled(false);
                    FechaEvaluacion.setEnabled(false);
                    grado_estudio.setEnabled(false);
                    empresa.setEnabled(false);
                    cargo.setEnabled(false);
                    FechaEvaluacion.setEnabled(false);
                    
                    
                    //jTextField9.setText(oConn.setResult.getString("valorigg"));
                }else{
                oFunc.SubSistemaMensajeError("No se encuentra Registro");
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion(" informe de Aversion Riesgos :" + ex.getMessage());
        }
        }
        else
            oFunc.SubSistemaMensajeError("debes ingresar un codigo");
                                          
    }//GEN-LAST:event_EDITARActionPerformed

    private void FechaEvaluacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaEvaluacionPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaEvaluacionPropertyChange

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
        print (Integer.valueOf(imprimir.getText()));
    }//GEN-LAST:event_imprimirActionPerformed

    private void btnImprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir5ActionPerformed
        // TODO add your handling code here:
        print (Integer.valueOf(imprimir.getText()));
    }//GEN-LAST:event_btnImprimir5ActionPerformed

    private void conclusiones_no_cumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conclusiones_no_cumpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conclusiones_no_cumpleActionPerformed

    private void conclusiones_cumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conclusiones_cumpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conclusiones_cumpleActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    if(oPe.nOrden(n_orden, "Aversionalriesgo"))  {
        Actualizar();
       }else{
        Grabar();
       }    
         
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void asp_Intel_Pract_Func_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_Pract_Func_bajoActionPerformed
       if (asp_Intel_Pract_Func_bajo.isSelected())
        {
        asp_Intel_Pract_Func_alto.setSelected(false);
        asp_Intel_Pract_Func_medio.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_Pract_Func_bajoActionPerformed

    private void asp_Intel_Pract_Func_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_Pract_Func_medioActionPerformed
        if (asp_Intel_Pract_Func_medio.isSelected())
        {
        asp_Intel_Pract_Func_alto.setSelected(false);
        asp_Intel_Pract_Func_bajo.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_Pract_Func_medioActionPerformed

    private void asp_Intel_Pract_Func_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_Pract_Func_altoActionPerformed
        if (asp_Intel_Pract_Func_alto.isSelected())
        {
        asp_Intel_Pract_Func_medio.setSelected(false);
        asp_Intel_Pract_Func_bajo.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_Pract_Func_altoActionPerformed

    private void asp_Intel_Recur_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_Recur_bajoActionPerformed
        if (asp_Intel_Recur_bajo.isSelected())
        {
        asp_Intel_Recur_alto.setSelected(false);
        asp_Intel_Recur_medio.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_Recur_bajoActionPerformed

    private void asp_Intel_Recur_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_Recur_medioActionPerformed
        if (asp_Intel_Recur_medio.isSelected())
        {
        asp_Intel_Recur_alto.setSelected(false);
        asp_Intel_Recur_bajo.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_Recur_medioActionPerformed

    private void asp_Intel_Recur_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_Recur_altoActionPerformed
        if (asp_Intel_Recur_alto.isSelected())
        {
        asp_Intel_Recur_medio.setSelected(false);
        asp_Intel_Recur_bajo.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_Recur_altoActionPerformed

    private void asp_Intel_atenci_conc_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_atenci_conc_bajoActionPerformed
        if (asp_Intel_atenci_conc_bajo.isSelected())
        {
        asp_Intel_atenci_conc_medio.setSelected(false);
        asp_Intel_atenci_conc_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_atenci_conc_bajoActionPerformed

    private void asp_Intel_atenci_conc_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_atenci_conc_medioActionPerformed
        if (asp_Intel_atenci_conc_medio.isSelected())
        {
        asp_Intel_atenci_conc_bajo.setSelected(false);
        asp_Intel_atenci_conc_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_atenci_conc_medioActionPerformed

    private void asp_Intel_atenci_conc_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Intel_atenci_conc_altoActionPerformed
        if (asp_Intel_atenci_conc_alto.isSelected())
        {
        asp_Intel_atenci_conc_bajo.setSelected(false);
        asp_Intel_atenci_conc_medio.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Intel_atenci_conc_altoActionPerformed

    private void asp_emoc_estabil_emoc_mad_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_emoc_estabil_emoc_mad_bajoActionPerformed
        if (asp_emoc_estabil_emoc_mad_bajo.isSelected())
        {
        asp_emoc_estabil_emoc_mad_medio.setSelected(false);
        asp_emoc_estabil_emoc_mad_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_emoc_estabil_emoc_mad_bajoActionPerformed

    private void asp_emoc_estabil_emoc_mad_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_emoc_estabil_emoc_mad_medioActionPerformed
        if (asp_emoc_estabil_emoc_mad_medio.isSelected())
        {
        asp_emoc_estabil_emoc_mad_bajo.setSelected(false);
        asp_emoc_estabil_emoc_mad_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_emoc_estabil_emoc_mad_medioActionPerformed

    private void asp_emoc_estabil_emoc_mad_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_emoc_estabil_emoc_mad_altoActionPerformed
        if (asp_emoc_estabil_emoc_mad_alto.isSelected())
        {
        asp_emoc_estabil_emoc_mad_bajo.setSelected(false);
        asp_emoc_estabil_emoc_mad_medio.setSelected(false);        
        }
    }//GEN-LAST:event_asp_emoc_estabil_emoc_mad_altoActionPerformed

    private void asp_Flexib_manj_emoc_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Flexib_manj_emoc_bajoActionPerformed
        if (asp_Flexib_manj_emoc_bajo.isSelected())
        {
        asp_Flexib_manj_emoc_medio.setSelected(false);
        asp_Flexib_manj_emoc_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Flexib_manj_emoc_bajoActionPerformed

    private void asp_Flexib_manj_emoc_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Flexib_manj_emoc_medioActionPerformed
        if (asp_Flexib_manj_emoc_medio.isSelected())
        {
        asp_Flexib_manj_emoc_bajo.setSelected(false);
        asp_Flexib_manj_emoc_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Flexib_manj_emoc_medioActionPerformed

    private void asp_Flexib_manj_emoc_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_Flexib_manj_emoc_altoActionPerformed
        if (asp_Flexib_manj_emoc_alto.isSelected())
        {
        asp_Flexib_manj_emoc_bajo.setSelected(false);
        asp_Flexib_manj_emoc_medio.setSelected(false);        
        }
    }//GEN-LAST:event_asp_Flexib_manj_emoc_altoActionPerformed

    private void asp_ctrl_impul_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_ctrl_impul_medioActionPerformed
        if (asp_ctrl_impul_medio.isSelected())
        {
        asp_ctrl_impul_alto.setSelected(false);
        asp_ctrl_impul_bajo.setSelected(false);        
        }
    }//GEN-LAST:event_asp_ctrl_impul_medioActionPerformed

    private void asp_ctrl_impul_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_ctrl_impul_altoActionPerformed
        if (asp_ctrl_impul_alto.isSelected())
        {
        asp_ctrl_impul_medio.setSelected(false);
        asp_ctrl_impul_bajo.setSelected(false);        
        }
    }//GEN-LAST:event_asp_ctrl_impul_altoActionPerformed

    private void asp_ctrl_impul_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asp_ctrl_impul_bajoActionPerformed
        if (asp_ctrl_impul_bajo.isSelected())
        {
        asp_ctrl_impul_medio.setSelected(false);
        asp_ctrl_impul_alto.setSelected(false);        
        }
    }//GEN-LAST:event_asp_ctrl_impul_bajoActionPerformed

    private void comp_especf_Mot_por_car_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Mot_por_car_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Mot_por_car_altoActionPerformed

    private void comp_especf_Mot_por_car_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Mot_por_car_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Mot_por_car_medioActionPerformed

    private void comp_especf_Mot_por_car_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Mot_por_car_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Mot_por_car_bajoActionPerformed

    private void comp_especf_Cap_Evaluar_riesgos_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Cap_Evaluar_riesgos_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Cap_Evaluar_riesgos_altoActionPerformed

    private void comp_especf_Cap_Evaluar_riesgos_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Cap_Evaluar_riesgos_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Cap_Evaluar_riesgos_medioActionPerformed

    private void comp_especf_Cap_Evaluar_riesgos_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Cap_Evaluar_riesgos_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Cap_Evaluar_riesgos_bajoActionPerformed

    private void comp_especf_Cap_trabjo_bajo_presion_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Cap_trabjo_bajo_presion_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Cap_trabjo_bajo_presion_altoActionPerformed

    private void comp_especf_Cap_trabjo_bajo_presion_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Cap_trabjo_bajo_presion_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Cap_trabjo_bajo_presion_medioActionPerformed

    private void comp_especf_Cap_trabjo_bajo_presion_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Cap_trabjo_bajo_presion_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Cap_trabjo_bajo_presion_bajoActionPerformed

    private void comp_especf_proactividad_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_proactividad_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_proactividad_altoActionPerformed

    private void comp_especf_proactividad_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_proactividad_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_proactividad_medioActionPerformed

    private void comp_especf_proactividad_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_proactividad_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_proactividad_bajoActionPerformed

    private void comp_especf_Autonomia_trabajar_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Autonomia_trabajar_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Autonomia_trabajar_altoActionPerformed

    private void comp_especf_Autonomia_trabajar_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Autonomia_trabajar_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Autonomia_trabajar_medioActionPerformed

    private void comp_especf_Autonomia_trabajar_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Autonomia_trabajar_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Autonomia_trabajar_bajoActionPerformed

    private void comp_especf_Considera_terceros_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Considera_terceros_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Considera_terceros_altoActionPerformed

    private void comp_especf_Considera_terceros_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Considera_terceros_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Considera_terceros_medioActionPerformed

    private void comp_especf_Considera_terceros_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Considera_terceros_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Considera_terceros_bajoActionPerformed

    private void comp_especf_Adec_nor_proced_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Adec_nor_proced_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Adec_nor_proced_altoActionPerformed

    private void comp_especf_Adec_nor_proced_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Adec_nor_proced_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Adec_nor_proced_medioActionPerformed

    private void comp_especf_Adec_nor_proced_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_Adec_nor_proced_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_Adec_nor_proced_bajoActionPerformed

    private void comp_especf_cap_subor_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_cap_subor_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_cap_subor_altoActionPerformed

    private void comp_especf_cap_subor_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_cap_subor_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_cap_subor_medioActionPerformed

    private void comp_especf_cap_subor_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp_especf_cap_subor_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp_especf_cap_subor_bajoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDITAR;
    private com.toedter.calendar.JDateChooser FechaEvaluacion;
    private javax.swing.JLabel GradoDeEstudios;
    private javax.swing.JTextArea analisis_resultados;
    private javax.swing.JCheckBox asp_Flexib_manj_emoc_alto;
    private javax.swing.JCheckBox asp_Flexib_manj_emoc_bajo;
    private javax.swing.JCheckBox asp_Flexib_manj_emoc_medio;
    private javax.swing.JCheckBox asp_Intel_Pract_Func_alto;
    private javax.swing.JCheckBox asp_Intel_Pract_Func_bajo;
    private javax.swing.JCheckBox asp_Intel_Pract_Func_medio;
    private javax.swing.JCheckBox asp_Intel_Recur_alto;
    private javax.swing.JCheckBox asp_Intel_Recur_bajo;
    private javax.swing.JCheckBox asp_Intel_Recur_medio;
    private javax.swing.JCheckBox asp_Intel_atenci_conc_alto;
    private javax.swing.JCheckBox asp_Intel_atenci_conc_bajo;
    private javax.swing.JCheckBox asp_Intel_atenci_conc_medio;
    private javax.swing.JCheckBox asp_ctrl_impul_alto;
    private javax.swing.JCheckBox asp_ctrl_impul_bajo;
    private javax.swing.JCheckBox asp_ctrl_impul_medio;
    private javax.swing.JCheckBox asp_emoc_estabil_emoc_mad_alto;
    private javax.swing.JCheckBox asp_emoc_estabil_emoc_mad_bajo;
    private javax.swing.JCheckBox asp_emoc_estabil_emoc_mad_medio;
    private javax.swing.ButtonGroup bgAC;
    private javax.swing.ButtonGroup bgAC1;
    private javax.swing.ButtonGroup bgAP5;
    private javax.swing.ButtonGroup bgAP6;
    private javax.swing.ButtonGroup bgAPSI1;
    private javax.swing.ButtonGroup bgAPSI2;
    private javax.swing.ButtonGroup bgAPSI3;
    private javax.swing.ButtonGroup bgAPSI4;
    private javax.swing.ButtonGroup bgAPSI5;
    private javax.swing.ButtonGroup bgAPSI6;
    private javax.swing.ButtonGroup bgAPSI7;
    private javax.swing.ButtonGroup bgAPSI8;
    private javax.swing.ButtonGroup bgASERTIVIDAD;
    private javax.swing.ButtonGroup bgAUTOESTIMA;
    private javax.swing.ButtonGroup bgCV;
    private javax.swing.ButtonGroup bgCVM;
    private javax.swing.ButtonGroup bgConclusion;
    private javax.swing.ButtonGroup bgEE;
    private javax.swing.ButtonGroup bgM;
    private javax.swing.ButtonGroup bgOE;
    private javax.swing.ButtonGroup bgR;
    private javax.swing.ButtonGroup bgTF;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnImprimir5;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cargo;
    private javax.swing.JCheckBox comp_especf_Adec_nor_proced_alto;
    private javax.swing.JCheckBox comp_especf_Adec_nor_proced_bajo;
    private javax.swing.JCheckBox comp_especf_Adec_nor_proced_medio;
    private javax.swing.JCheckBox comp_especf_Autonomia_trabajar_alto;
    private javax.swing.JCheckBox comp_especf_Autonomia_trabajar_bajo;
    private javax.swing.JCheckBox comp_especf_Autonomia_trabajar_medio;
    private javax.swing.JCheckBox comp_especf_Cap_Evaluar_riesgos_alto;
    private javax.swing.JCheckBox comp_especf_Cap_Evaluar_riesgos_bajo;
    private javax.swing.JCheckBox comp_especf_Cap_Evaluar_riesgos_medio;
    private javax.swing.JCheckBox comp_especf_Cap_trabjo_bajo_presion_alto;
    private javax.swing.JCheckBox comp_especf_Cap_trabjo_bajo_presion_bajo;
    private javax.swing.JCheckBox comp_especf_Cap_trabjo_bajo_presion_medio;
    private javax.swing.JCheckBox comp_especf_Considera_terceros_alto;
    private javax.swing.JCheckBox comp_especf_Considera_terceros_bajo;
    private javax.swing.JCheckBox comp_especf_Considera_terceros_medio;
    private javax.swing.JCheckBox comp_especf_Mot_por_car_alto;
    private javax.swing.JCheckBox comp_especf_Mot_por_car_bajo;
    private javax.swing.JCheckBox comp_especf_Mot_por_car_medio;
    private javax.swing.JCheckBox comp_especf_cap_subor_alto;
    private javax.swing.JCheckBox comp_especf_cap_subor_bajo;
    private javax.swing.JCheckBox comp_especf_cap_subor_medio;
    private javax.swing.JCheckBox comp_especf_proactividad_alto;
    private javax.swing.JCheckBox comp_especf_proactividad_bajo;
    private javax.swing.JCheckBox comp_especf_proactividad_medio;
    private javax.swing.JCheckBox conclusiones_cumple;
    private javax.swing.JCheckBox conclusiones_no_cumple;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField empresa;
    private javax.swing.JTextField grado_estudio;
    private javax.swing.JTextField imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField n_orden;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextArea recomendaciones;
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
