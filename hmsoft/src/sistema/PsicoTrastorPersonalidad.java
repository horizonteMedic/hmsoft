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
public final class PsicoTrastorPersonalidad extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;

   public PsicoTrastorPersonalidad(){
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
        btnEditar = new javax.swing.JButton();
        fechaevaluacion = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        grado_estudios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        imprimir = new javax.swing.JTextField();
        imprimir1 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        interpretacion_parainoide = new javax.swing.JTextArea();
        Actualizar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        perf_cumple = new javax.swing.JCheckBox();
        perf_no_cumple = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        grup_a_paranoide_bajo = new javax.swing.JCheckBox();
        grup_a_paranoide_medio = new javax.swing.JCheckBox();
        grup_a_paranoide_alto = new javax.swing.JCheckBox();
        grup_a_esquizoide_bajo = new javax.swing.JCheckBox();
        grup_a_esquizoide_medio = new javax.swing.JCheckBox();
        grup_a_esquizoide_alto = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        grup_a_esquizotipico_bajo = new javax.swing.JCheckBox();
        grup_a_esquizotipico_medio = new javax.swing.JCheckBox();
        grup_a_esquizotipico_alto = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel31 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        grup_c_anancastico_bajo = new javax.swing.JCheckBox();
        grup_c_anancastico_medio = new javax.swing.JCheckBox();
        grup_c_anancastico_alto = new javax.swing.JCheckBox();
        grup_c_dependiente_bajo = new javax.swing.JCheckBox();
        grup_c_dependiente_medio = new javax.swing.JCheckBox();
        grup_c_dependiente_alto = new javax.swing.JCheckBox();
        grup_c_ansioso_medio = new javax.swing.JCheckBox();
        grup_c_ansioso_alto = new javax.swing.JCheckBox();
        grup_c_ansioso_bajo = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        grup_b_histrionico_bajo = new javax.swing.JCheckBox();
        grup_b_histrionico_medio = new javax.swing.JCheckBox();
        grup_b_histrionico_alto = new javax.swing.JCheckBox();
        grup_b_antisocial_bajo = new javax.swing.JCheckBox();
        grup_b_antisocial_medio = new javax.swing.JCheckBox();
        grup_b_antisocial_alto = new javax.swing.JCheckBox();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        grup_b_narcicista_bajo = new javax.swing.JCheckBox();
        grup_b_narcicista_medio = new javax.swing.JCheckBox();
        grup_b_narcicista_alto = new javax.swing.JCheckBox();
        jLabel111 = new javax.swing.JLabel();
        grup_b_inesta_emoci_subtip_impul_bajo = new javax.swing.JCheckBox();
        grup_b_inesta_emoci_subtip_impul_medio = new javax.swing.JCheckBox();
        grup_b_inesta_emoci_subtip_impul_alto = new javax.swing.JCheckBox();
        jLabel112 = new javax.swing.JLabel();
        grup_b_emoci_subtip_lim_bajo = new javax.swing.JCheckBox();
        grup_b_emoci_subtip_lim_medio = new javax.swing.JCheckBox();
        grup_b_emoci_subtip_lim_alto = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        analisis_resulta = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        recomendacion = new javax.swing.JTextArea();
        jLabel126 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Informe Psicolaboral");

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

        fechaevaluacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaevaluacionPropertyChange(evt);
            }
        });

        jLabel117.setText("Fecha Evaluacion :");

        jLabel118.setText("Nombres y Apellidos :");

        jLabel120.setText("Edad :");

        jLabel124.setText("Cargo : ");

        grado_estudios.setText(" ");

        jLabel1.setText("Empresa :");

        cargo.setText(" ");

        jLabel125.setText("Grado de Instruccion : ");

        empresa.setText(" ");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grado_estudios, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaevaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaevaluacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar)
                        .addComponent(jLabel117)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(grado_estudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        imprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        imprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir1ActionPerformed(evt);
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
                .addComponent(imprimir1)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel122.setText("RECOMENDACIONES");

        interpretacion_parainoide.setColumns(20);
        interpretacion_parainoide.setRows(5);
        jScrollPane14.setViewportView(interpretacion_parainoide);

        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        Actualizar.setMnemonic('i');
        Actualizar.setText("Agregar y actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        limpiar.setMnemonic('l');
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Conclusión"));

        bgConclusion.add(perf_cumple);
        perf_cumple.setText("CUMPLE CON EL PERFIL");
        perf_cumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perf_cumpleActionPerformed(evt);
            }
        });

        bgConclusion.add(perf_no_cumple);
        perf_no_cumple.setText("NO CUMPLE CON EL PERFIL ");
        perf_no_cumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perf_no_cumpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perf_cumple)
                    .addComponent(perf_no_cumple))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perf_cumple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perf_no_cumple))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("ASPECTOS INTELECTUALES"));

        jLabel90.setText("1-PARANOIDE");

        bgEE.add(grup_a_paranoide_bajo);
        grup_a_paranoide_bajo.setText("Bajo");
        grup_a_paranoide_bajo.setToolTipText("");
        grup_a_paranoide_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_paranoide_bajoActionPerformed(evt);
            }
        });

        bgEE.add(grup_a_paranoide_medio);
        grup_a_paranoide_medio.setText("Medio");
        grup_a_paranoide_medio.setToolTipText("");
        grup_a_paranoide_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_paranoide_medioActionPerformed(evt);
            }
        });

        bgEE.add(grup_a_paranoide_alto);
        grup_a_paranoide_alto.setText("Alto");
        grup_a_paranoide_alto.setToolTipText("");
        grup_a_paranoide_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_paranoide_altoActionPerformed(evt);
            }
        });

        bgTF.add(grup_a_esquizoide_bajo);
        grup_a_esquizoide_bajo.setText("Bajo");
        grup_a_esquizoide_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_esquizoide_bajoActionPerformed(evt);
            }
        });

        bgTF.add(grup_a_esquizoide_medio);
        grup_a_esquizoide_medio.setText("Medio");
        grup_a_esquizoide_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_esquizoide_medioActionPerformed(evt);
            }
        });

        bgTF.add(grup_a_esquizoide_alto);
        grup_a_esquizoide_alto.setText("Alto");
        grup_a_esquizoide_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_esquizoide_altoActionPerformed(evt);
            }
        });

        jLabel101.setText("2- ESQUIZOIDE");

        jLabel103.setText("3- ESQUIZOTÍPICO");

        bgAUTOESTIMA.add(grup_a_esquizotipico_bajo);
        grup_a_esquizotipico_bajo.setText("Bajo");
        grup_a_esquizotipico_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_esquizotipico_bajoActionPerformed(evt);
            }
        });

        bgAUTOESTIMA.add(grup_a_esquizotipico_medio);
        grup_a_esquizotipico_medio.setText("Medio");
        grup_a_esquizotipico_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_esquizotipico_medioActionPerformed(evt);
            }
        });

        bgAUTOESTIMA.add(grup_a_esquizotipico_alto);
        grup_a_esquizotipico_alto.setText("Alto");
        grup_a_esquizotipico_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_a_esquizotipico_altoActionPerformed(evt);
            }
        });

        jLabel2.setText("GRUPO A");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                    .addComponent(grup_a_esquizotipico_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(grup_a_esquizotipico_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(grup_a_esquizotipico_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                    .addComponent(grup_a_esquizoide_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(grup_a_esquizoide_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(grup_a_esquizoide_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                    .addComponent(grup_a_paranoide_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(grup_a_paranoide_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(grup_a_paranoide_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grup_a_paranoide_bajo)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grup_a_paranoide_medio)
                        .addComponent(grup_a_paranoide_alto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grup_a_esquizoide_bajo)
                        .addComponent(grup_a_esquizoide_medio))
                    .addComponent(grup_a_esquizoide_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grup_a_esquizotipico_bajo)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grup_a_esquizotipico_alto)
                        .addComponent(grup_a_esquizotipico_medio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO B"));

        jLabel89.setText("2- DEPENDIENTE");

        jLabel99.setText("1- ANANCÁSTICO");

        jLabel102.setText("3- ANSIOSO");

        grup_c_anancastico_bajo.setText("Bajo");
        grup_c_anancastico_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_anancastico_bajoActionPerformed(evt);
            }
        });

        grup_c_anancastico_medio.setText("Medio");
        grup_c_anancastico_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_anancastico_medioActionPerformed(evt);
            }
        });

        grup_c_anancastico_alto.setText("Alto");
        grup_c_anancastico_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_anancastico_altoActionPerformed(evt);
            }
        });

        grup_c_dependiente_bajo.setText("Bajo");
        grup_c_dependiente_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_dependiente_bajoActionPerformed(evt);
            }
        });

        grup_c_dependiente_medio.setText("Medio");
        grup_c_dependiente_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_dependiente_medioActionPerformed(evt);
            }
        });

        grup_c_dependiente_alto.setText("Alto");
        grup_c_dependiente_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_dependiente_altoActionPerformed(evt);
            }
        });

        grup_c_ansioso_medio.setText("Medio");
        grup_c_ansioso_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_ansioso_medioActionPerformed(evt);
            }
        });

        grup_c_ansioso_alto.setText("Alto");
        grup_c_ansioso_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_ansioso_altoActionPerformed(evt);
            }
        });

        grup_c_ansioso_bajo.setText("Bajo");
        grup_c_ansioso_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_c_ansioso_bajoActionPerformed(evt);
            }
        });

        jLabel3.setText("GRUPO C");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                    .addComponent(grup_c_ansioso_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(grup_c_ansioso_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(grup_c_ansioso_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                    .addComponent(grup_c_dependiente_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(grup_c_dependiente_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(grup_c_dependiente_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel31Layout.createSequentialGroup()
                                    .addComponent(grup_c_anancastico_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(grup_c_anancastico_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(grup_c_anancastico_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grup_c_anancastico_bajo)
                    .addComponent(grup_c_anancastico_medio)
                    .addComponent(grup_c_anancastico_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grup_c_dependiente_bajo)
                    .addComponent(grup_c_dependiente_medio)
                    .addComponent(grup_c_dependiente_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grup_c_ansioso_bajo)
                    .addComponent(grup_c_ansioso_medio)
                    .addComponent(grup_c_ansioso_alto))
                .addContainerGap())
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO B"));

        jLabel91.setText("1- HISTRIÓNICO");

        bgAPSI1.add(grup_b_histrionico_bajo);
        grup_b_histrionico_bajo.setText("Bajo");
        grup_b_histrionico_bajo.setToolTipText("");
        grup_b_histrionico_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_histrionico_bajoActionPerformed(evt);
            }
        });

        bgAPSI1.add(grup_b_histrionico_medio);
        grup_b_histrionico_medio.setText("Medio");
        grup_b_histrionico_medio.setToolTipText("");
        grup_b_histrionico_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_histrionico_medioActionPerformed(evt);
            }
        });

        bgAPSI1.add(grup_b_histrionico_alto);
        grup_b_histrionico_alto.setText("Alto");
        grup_b_histrionico_alto.setToolTipText("");
        grup_b_histrionico_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_histrionico_altoActionPerformed(evt);
            }
        });

        bgAPSI2.add(grup_b_antisocial_bajo);
        grup_b_antisocial_bajo.setText("Bajo");
        grup_b_antisocial_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_antisocial_bajoActionPerformed(evt);
            }
        });

        bgAPSI2.add(grup_b_antisocial_medio);
        grup_b_antisocial_medio.setText("Medio");
        grup_b_antisocial_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_antisocial_medioActionPerformed(evt);
            }
        });

        bgAPSI2.add(grup_b_antisocial_alto);
        grup_b_antisocial_alto.setText("Alto");
        grup_b_antisocial_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_antisocial_altoActionPerformed(evt);
            }
        });

        jLabel109.setText("2- ANTISOCIAL");

        jLabel110.setText("3- NARCICISTA");

        bgAPSI3.add(grup_b_narcicista_bajo);
        grup_b_narcicista_bajo.setText("Bajo");
        grup_b_narcicista_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_narcicista_bajoActionPerformed(evt);
            }
        });

        bgAPSI3.add(grup_b_narcicista_medio);
        grup_b_narcicista_medio.setText("Medio");
        grup_b_narcicista_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_narcicista_medioActionPerformed(evt);
            }
        });

        bgAPSI3.add(grup_b_narcicista_alto);
        grup_b_narcicista_alto.setText("Alto");
        grup_b_narcicista_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_narcicista_altoActionPerformed(evt);
            }
        });

        jLabel111.setText("4- T. INESTABILIDAD EMOCIONAL SUBTIPO IMPULSIVO   ");

        bgAPSI4.add(grup_b_inesta_emoci_subtip_impul_bajo);
        grup_b_inesta_emoci_subtip_impul_bajo.setText("Bajo");
        grup_b_inesta_emoci_subtip_impul_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_inesta_emoci_subtip_impul_bajoActionPerformed(evt);
            }
        });

        bgAPSI4.add(grup_b_inesta_emoci_subtip_impul_medio);
        grup_b_inesta_emoci_subtip_impul_medio.setText("Medio");
        grup_b_inesta_emoci_subtip_impul_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_inesta_emoci_subtip_impul_medioActionPerformed(evt);
            }
        });

        bgAPSI4.add(grup_b_inesta_emoci_subtip_impul_alto);
        grup_b_inesta_emoci_subtip_impul_alto.setText("Alto");
        grup_b_inesta_emoci_subtip_impul_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_inesta_emoci_subtip_impul_altoActionPerformed(evt);
            }
        });

        jLabel112.setText("5- T. INTESTABILIDAD EMOCIONAL SUBTIPO LÍMITE ");

        bgAPSI5.add(grup_b_emoci_subtip_lim_bajo);
        grup_b_emoci_subtip_lim_bajo.setText("Bajo");
        grup_b_emoci_subtip_lim_bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_emoci_subtip_lim_bajoActionPerformed(evt);
            }
        });

        bgAPSI5.add(grup_b_emoci_subtip_lim_medio);
        grup_b_emoci_subtip_lim_medio.setText("Medio");
        grup_b_emoci_subtip_lim_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_emoci_subtip_lim_medioActionPerformed(evt);
            }
        });

        bgAPSI5.add(grup_b_emoci_subtip_lim_alto);
        grup_b_emoci_subtip_lim_alto.setText("Alto");
        grup_b_emoci_subtip_lim_alto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grup_b_emoci_subtip_lim_altoActionPerformed(evt);
            }
        });

        jLabel4.setText("GRUPO B");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(grup_b_emoci_subtip_lim_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(grup_b_emoci_subtip_lim_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(grup_b_emoci_subtip_lim_alto))
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel111))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(grup_b_antisocial_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(grup_b_antisocial_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grup_b_antisocial_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel32Layout.createSequentialGroup()
                                    .addComponent(grup_b_histrionico_bajo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(grup_b_histrionico_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(grup_b_histrionico_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(grup_b_inesta_emoci_subtip_impul_bajo)
                                .addGap(45, 45, 45)
                                .addComponent(grup_b_inesta_emoci_subtip_impul_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(grup_b_inesta_emoci_subtip_impul_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(grup_b_narcicista_bajo)
                                .addGap(41, 41, 41)
                                .addComponent(grup_b_narcicista_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(grup_b_narcicista_alto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grup_b_histrionico_bajo)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grup_b_histrionico_medio)
                        .addComponent(grup_b_histrionico_alto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grup_b_antisocial_bajo)
                    .addComponent(grup_b_antisocial_medio)
                    .addComponent(grup_b_antisocial_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grup_b_narcicista_bajo)
                    .addComponent(grup_b_narcicista_medio)
                    .addComponent(grup_b_narcicista_alto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grup_b_inesta_emoci_subtip_impul_bajo)
                    .addComponent(grup_b_inesta_emoci_subtip_impul_medio)
                    .addComponent(grup_b_inesta_emoci_subtip_impul_alto))
                .addGap(2, 2, 2)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grup_b_emoci_subtip_lim_bajo)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grup_b_emoci_subtip_lim_medio)
                        .addComponent(grup_b_emoci_subtip_lim_alto)))
                .addGap(30, 30, 30))
        );

        jLabel121.setText("ANALISIS Y RESULTADOS");

        analisis_resulta.setColumns(20);
        analisis_resulta.setRows(5);
        jScrollPane15.setViewportView(analisis_resulta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel30.getAccessibleContext().setAccessibleName("");
        jPanel31.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("ASPECTOS A EVALUAR", jPanel2);

        jLabel123.setText("INTERPRETACION ");

        recomendacion.setColumns(20);
        recomendacion.setRows(5);
        jScrollPane16.setViewportView(recomendacion);

        jLabel126.setText("PARANOIDE :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122)
                            .addComponent(jLabel123)
                            .addComponent(jLabel126)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Actualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(limpiar))
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Actualizar)
                            .addComponent(limpiar))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean OrdenExiste()
     {
        boolean bResultado=false;
        if(!n_orden.getText().isEmpty()){
        String sQuery;
        sQuery  = "Select n_orden from trastornos_personalidad where n_orden="+n_orden.getText().toString();
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
        edad.setText("");
        cargo.setText("");
        empresa.setText("");
        grado_estudios.setText("");
        fechaevaluacion.setDate(null);
        analisis_resulta.setText("");
//GRUPO A         
        grup_a_paranoide_bajo.setSelected(false);
        grup_a_paranoide_medio.setSelected(false); 
        grup_a_paranoide_alto.setSelected(false);
        grup_a_esquizoide_bajo.setSelected(false);
        grup_a_esquizoide_medio.setSelected(false);
        grup_a_esquizoide_alto.setSelected(false);
        grup_a_esquizotipico_bajo.setSelected(false);
        grup_a_esquizotipico_medio.setSelected(false); 
        grup_a_esquizotipico_alto.setSelected(false); 
// GRUPO B
        grup_b_histrionico_bajo.setSelected(false); 
        grup_b_histrionico_medio.setSelected(false); 
        grup_b_histrionico_alto.setSelected(false);
        grup_b_antisocial_bajo.setSelected(false); 
        grup_b_antisocial_medio.setSelected(false); 
        grup_b_antisocial_alto.setSelected(false);
        grup_b_narcicista_bajo.setSelected(false); 
        grup_b_narcicista_medio.setSelected(false); 
        grup_b_narcicista_alto.setSelected(false);
        grup_b_inesta_emoci_subtip_impul_bajo.setSelected(false); 
        grup_b_inesta_emoci_subtip_impul_medio.setSelected(false); 
        grup_b_inesta_emoci_subtip_impul_alto.setSelected(false);
        grup_b_emoci_subtip_lim_bajo.setSelected(false); 
        grup_b_emoci_subtip_lim_medio.setSelected(false); 
        grup_b_emoci_subtip_lim_alto.setSelected(false);
        //GRUPO C
        grup_c_anancastico_bajo.setSelected(false); 
        grup_c_anancastico_medio.setSelected(false);  
        grup_c_anancastico_alto.setSelected(false);        
        grup_c_dependiente_bajo.setSelected(false);  
        grup_c_dependiente_medio.setSelected(false);  
        grup_c_dependiente_alto.setSelected(false);        
        grup_c_ansioso_bajo.setSelected(false);  
        grup_c_ansioso_medio.setSelected(false);  
        grup_c_ansioso_alto.setSelected(false);
        // PARTE TEXT
        recomendacion.setText("");  
        perf_cumple.setSelected(false);  
        perf_no_cumple.setSelected(false); 
        interpretacion_parainoide.setText("");                  
    }
    
    // boton actualizar 
    public void Actualizar(){
            String sCodigo=n_orden.getText();
            String strSqlStmt;
            strSqlStmt="UPDATE  trastornos_personalidad\n" +
                    " SET "+
                    //GRUPO A
                   "        grup_a_paranoide_bajo='"+grup_a_paranoide_bajo.isSelected()+"',"+
                   "        grup_a_paranoide_medio='"+grup_a_paranoide_medio.isSelected()+"',"+
                   "        grup_a_paranoide_alto='"+grup_a_paranoide_alto.isSelected()+"',"+
                    
                    "        grup_a_esquizoide_bajo='"+grup_a_esquizoide_bajo.isSelected()+"',"+
                    "        grup_a_esquizoide_medio='"+grup_a_esquizoide_medio.isSelected()+"',"+
                    "        grup_a_esquizoide_alto='"+grup_a_esquizoide_alto.isSelected()+"',"+
               
                    "        grup_a_esquizotipico_bajo='"+grup_a_esquizotipico_bajo.isSelected()+"',"+
                    "        grup_a_esquizotipico_medio='"+grup_a_esquizotipico_medio.isSelected()+"',"+
                    "        grup_a_esquizotipico_alto='"+grup_a_esquizotipico_alto.isSelected()+"',"+
                    // GRUPO B
                    "        grup_b_histrionico_bajo='"+grup_b_histrionico_bajo.isSelected()+"',"+
                    "        grup_b_histrionico_medio='"+grup_b_histrionico_medio.isSelected()+"',"+
                    "        grup_b_histrionico_alto='"+grup_b_histrionico_alto.isSelected()+"',"+
                    
                    "        grup_b_antisocial_bajo='"+grup_b_antisocial_bajo.isSelected()+"',"+
                    "        grup_b_antisocial_medio='"+grup_b_antisocial_medio.isSelected()+"',"+
                    "        grup_b_antisocial_alto='"+grup_b_antisocial_alto.isSelected()+"',"+
                    
                    "        grup_b_narcicista_bajo='"+grup_b_narcicista_bajo.isSelected()+"',"+
                    "        grup_b_narcicista_medio='"+grup_b_narcicista_medio.isSelected()+"',"+
                    "        grup_b_narcicista_alto='"+grup_b_narcicista_alto.isSelected()+"',"+
                    
                    "        grup_b_inesta_emoci_subtip_impul_bajo='"+grup_b_inesta_emoci_subtip_impul_bajo.isSelected()+"',"+
                    "        grup_b_inesta_emoci_subtip_impul_medio='"+grup_b_inesta_emoci_subtip_impul_medio.isSelected()+"',"+
                    "        grup_b_inesta_emoci_subtip_impul_alto='"+grup_b_inesta_emoci_subtip_impul_alto.isSelected()+"',"+
                   
                    "        grup_b_emoci_subtip_lim_bajo='"+grup_b_emoci_subtip_lim_bajo.isSelected()+"',"+
                    "        grup_b_emoci_subtip_lim_medio='"+grup_b_emoci_subtip_lim_medio.isSelected()+"',"+
                    "        grup_b_emoci_subtip_lim_alto='"+grup_b_emoci_subtip_lim_alto.isSelected()+"',"+
                   
                    //GROP C
                    "        grup_c_anancastico_bajo='"+grup_c_anancastico_bajo.isSelected()+"',"+
                    "        grup_c_anancastico_medio='"+grup_c_anancastico_medio.isSelected()+"',"+
                    "        grup_c_anancastico_alto='"+grup_c_anancastico_alto.isSelected()+"',"+
                    
                    "        grup_c_dependiente_bajo='"+grup_c_dependiente_bajo.isSelected()+"',"+
                    "        grup_c_dependiente_medio='"+grup_c_dependiente_medio.isSelected()+"',"+
                    "        grup_c_dependiente_alto='"+grup_c_dependiente_alto.isSelected()+"',"+
                    
                    "        grup_c_ansioso_bajo='"+grup_c_ansioso_bajo.isSelected()+"',"+
                    "        grup_c_ansioso_medio='"+grup_c_ansioso_medio.isSelected()+"',"+
                    "        grup_c_ansioso_alto='"+grup_c_ansioso_alto.isSelected()+"',"+                   
                    // PART TEXT
                    "        analisis_resulta='"+analisis_resulta.getText()+"',"+
                    "        recomendacion='"+recomendacion.getText()+"',"+
                    "        perf_cumple='"+perf_cumple.isSelected()+"',"+
                    "        perf_no_cumple='"+perf_no_cumple.isSelected()+"'"+                    
                    "        interpretacion_parainoide='"+interpretacion_parainoide.getText()+"',"+                   
                    " WHERE n_orden="+sCodigo+";";
               //  System.out.println(strSqlStmt);
            //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
            if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                imprimir();
                try {
                    oConn.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PsicoTrastorPersonalidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
    }
    
    private boolean Grabar() throws SQLException{
        boolean bResult = false;
        String strSqlStmt ="INSERT INTO trastornos_personalidad(\n" +
        " n_orden,\n" +
        "  grup_a_paranoide_bajo,\n" + 
        "  grup_a_paranoide_medio,\n" +
        "  grup_a_paranoide_alto,\n" +
                
        "  grup_a_esquizoide_bajo,\n" +
        "  grup_a_esquizoide_medio,\n" +
        "  grup_a_esquizoide_alto,\n" +
                
        "  grup_a_esquizotipico_bajo,\n" +
        "  grup_a_esquizotipico_medio,\n" +
        "  grup_a_esquizotipico_alto,\n" +
                
        "  grup_b_histrionico_bajo,\n" +
        "  grup_b_histrionico_medio,\n" +
        "  grup_b_histrionico_alto,\n" +
                
        "  grup_b_antisocial_bajo,\n" +
        "  grup_b_antisocial_medio,\n" +
        "  grup_b_antisocial_alto,\n" +
                
        "  grup_b_narcicista_bajo,\n" +
        "  grup_b_narcicista_medio,\n" +
        "  grup_b_narcicista_alto,\n" +
                
        "  grup_b_inesta_emoci_subtip_impul_bajo,\n" +
        "  grup_b_inesta_emoci_subtip_impul_medio,\n" +
        "  grup_b_inesta_emoci_subtip_impul_alto,\n" +
                
        "  grup_b_emoci_subtip_lim_bajo,\n" +
        "  grup_b_emoci_subtip_lim_medio,\n" +
        "  grup_b_emoci_subtip_lim_alto,\n" +
                
        "  grup_c_anancastico_bajo,\n" +
        "  grup_c_anancastico_medio,\n" +
        "  grup_c_anancastico_alto,\n" +
                
        "  grup_c_dependiente_bajo,\n" +
        "  grup_c_dependiente_medio,\n" +
        "  grup_c_dependiente_alto,\n" +
                
        "  grup_c_ansioso_bajo,\n" +
        "  grup_c_ansioso_medio,\n" +
        "  grup_c_ansioso_alto,\n" +
                
        "  analisis_resulta,\n" +
        "  recomendacion,\n" +
        "  perf_cumple,\n" +
        "  perf_no_cumple,\n" +
        "  interpretacion_parainoide)";       
       strSqlStmt+= " values("+ n_orden.getText()+",'"+
                    fechaevaluacion.getDate()+ "','"+
                    grup_a_paranoide_bajo.isSelected()+"','"+
                    grup_a_paranoide_medio.isSelected()+"','"+
                    grup_a_paranoide_alto.isSelected()+"','"+
               
                    grup_a_esquizoide_bajo.isSelected()+"','"+
                    grup_a_esquizoide_medio.isSelected()+"','"+
                    grup_a_esquizoide_alto.isSelected()+"','"+
               
                    grup_a_esquizotipico_bajo.isSelected()+"','"+
                    grup_a_esquizotipico_medio.isSelected()+"','"+
                    grup_a_esquizotipico_alto.isSelected()+"','"+
               
                    grup_b_histrionico_bajo.isSelected()+"','"+
                    grup_b_histrionico_medio.isSelected()+"','"+
                    grup_b_histrionico_alto.isSelected()+"','"+
               
                    grup_b_antisocial_bajo.isSelected()+"','"+
                    grup_b_antisocial_medio.isSelected()+"','"+
                    grup_b_antisocial_alto.isSelected()+"','"+
               
                    grup_b_narcicista_bajo.isSelected()+"','"+               
                    grup_b_narcicista_medio.isSelected()+"','"+
                    grup_b_narcicista_alto.isSelected()+"','"+
               
                    grup_b_inesta_emoci_subtip_impul_bajo.isSelected()+"','"+
                    grup_b_inesta_emoci_subtip_impul_medio.isSelected()+"','"+
                    grup_b_inesta_emoci_subtip_impul_alto.isSelected()+"','"+
               
                    grup_b_emoci_subtip_lim_bajo.isSelected()+"','"+
                    grup_b_emoci_subtip_lim_medio.isSelected()+"','"+
                    grup_b_emoci_subtip_lim_alto.isSelected()+"','"+
               
                    grup_c_anancastico_bajo.isSelected()+"','"+
                    grup_c_anancastico_medio.isSelected()+"','"+
                    grup_c_anancastico_alto.isSelected()+"','"+
               
                    grup_c_dependiente_bajo.isSelected()+"','"+
                    grup_c_dependiente_medio.isSelected()+"','"+
                    grup_c_dependiente_alto.isSelected()+"','"+
               
                    grup_c_ansioso_bajo.isSelected()+"','"+
                    grup_c_ansioso_medio.isSelected()+"','"+
                    grup_c_ansioso_alto.isSelected()+"','"+
                    
                    analisis_resulta.getText()+"','"+
                    interpretacion_parainoide.getText()+"','"+
                    perf_cumple.isSelected()+"','"+          
                    perf_no_cumple.isSelected()+"'"+  
                    " ) ";
                    System.out.println(strSqlStmt);
//        oFunc.SubSistemaMensajeError(strSqlStmt);
             if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)){
//                   oConn.setResult.next();
                   oFunc.SubSistemaMensajeInformacion("Examen Registrado exitosamente");
                    
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"agregar informe.jasper";
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
                    String direccionReporte = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"agregarinforme.jasper";
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

            if (((JTextField)fechaevaluacion.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
                {oFunc.SubSistemaMensajeError("Ingrese Fecha ");bResultado = false;}

           return bResultado;
}
    private void n_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ordenActionPerformed
        // boton codigo con Enter
        if(!n_orden.getText().isEmpty()){
            if(!oPe.nOrden(n_orden, "trastornos_personalidad"))  {
                JDateChooser fechaevaluacion = new com.toedter.calendar.JDateChooser();
                String Sql="select d.nombres_pa||' '||d.apellidos_pa as nombres, d.nivel_est_pa, d.cod_pa, d.fecha_nacimiento_pa , "
                + "n.cargo_de ,n.razon_empresa, EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad, n.fecha_apertura_po from datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) WHERE n.n_orden ='"+n_orden.getText()+"'";
                oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    nombres.setText(oConn.setResult.getString("nombres"));
                    grado_estudios.setText(oConn.setResult.getString("nivel_est_pa"));
                    cargo.setText(oConn.setResult.getString("cargo_de"));
                    empresa.setText(oConn.setResult.getString("razon_empresa"));
                    edad.setText(oConn.setResult.getString("edad"));
                    n_orden.setEnabled(false);
                    perf_cumple.setSelected(true);                  
                    fechaevaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Informe Psicologico:" + ex.getMessage());
            }
        }else
                oFunc.SubSistemaMensajeInformacion("Ya existe este registro en Test Salamanca ");
      }
    }//GEN-LAST:event_n_ordenActionPerformed

    private void n_ordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_ordenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_n_ordenKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //boton Editar
        if(!n_orden.getText().isEmpty()){
            String Sql="SELECT d.cod_pa, d.nombres_pa||' '||d.apellidos_pa as nombres , d.fecha_nacimiento_pa,EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad,"                                   
                    +"d.nivel_est_pa, n.cargo_de ,n.razon_empresa,n.fecha_apertura_po,ar.*"
                    +"  FROM datos_paciente AS d \n" 
                    +"  INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa)\n" 
                    +"  INNER JOIN trastornos_personalidad AS ar ON (ar.n_orden = n.n_orden)\n" 
                    +"  WHERE   n.n_orden ="+n_orden.getText()+";";
            System.out.println(Sql);
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    nombres.setText(oConn.setResult.getString("nombres"));
                    //edad.setText(String.valueOf(oFunc.calcularEdad(fecha_nacimiento_pa.getCalendar()))+"edad" ); // fecha_nacimiento_pa se tendria que cambiar ?
                    edad.setText(oConn.setResult.getString("edad"));
                    cargo.setText(oConn.setResult.getString("cargo_de"));
                    empresa.setText(oConn.setResult.getString("razon_empresa"));
                    grado_estudios.setText(oConn.setResult.getString("nivel_est_pa"));
                    fechaevaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                    
                    grup_a_paranoide_bajo.setSelected(oConn.setResult.getBoolean("grup_a_paranoide_bajo"));
                    grup_a_paranoide_medio.setSelected(oConn.setResult.getBoolean("grup_a_paranoide_medio"));
                    grup_a_paranoide_alto.setSelected(oConn.setResult.getBoolean("grup_a_paranoide_alto"));
                    
                    grup_a_esquizoide_bajo.setSelected(oConn.setResult.getBoolean("grup_a_esquizoide_bajo"));
                    grup_a_esquizoide_medio.setSelected(oConn.setResult.getBoolean("grup_a_esquizoide_medio"));
                    grup_a_esquizoide_alto.setSelected(oConn.setResult.getBoolean("grup_a_esquizoide_alto"));
                    
                    grup_a_esquizotipico_bajo.setSelected(oConn.setResult.getBoolean("grup_a_esquizotipico_bajo"));
                    grup_a_esquizotipico_medio.setSelected(oConn.setResult.getBoolean("grup_a_esquizotipico_medio"));
                    grup_a_esquizotipico_alto.setSelected(oConn.setResult.getBoolean("grup_a_esquizotipico_alto"));
                    
                    grup_b_histrionico_bajo.setSelected(oConn.setResult.getBoolean("grup_b_histrionico_bajo"));
                    grup_b_histrionico_medio.setSelected(oConn.setResult.getBoolean("grup_b_histrionico_medio"));
                    grup_b_histrionico_alto.setSelected(oConn.setResult.getBoolean("grup_b_histrionico_alto"));
                    
                    grup_b_antisocial_bajo.setSelected(oConn.setResult.getBoolean("grup_b_antisocial_bajo"));
                    grup_b_antisocial_medio.setSelected(oConn.setResult.getBoolean("grup_b_antisocial_medio"));
                    grup_b_antisocial_alto.setSelected(oConn.setResult.getBoolean("grup_b_antisocial_alto"));
                   
                    grup_b_narcicista_bajo.setSelected(oConn.setResult.getBoolean("grup_b_narcicista_bajo"));
                    grup_b_narcicista_medio.setSelected(oConn.setResult.getBoolean("grup_b_narcicista_medio"));
                    grup_b_narcicista_alto.setSelected(oConn.setResult.getBoolean("grup_b_narcicista_alto"));
                    
                    grup_b_inesta_emoci_subtip_impul_bajo.setSelected(oConn.setResult.getBoolean("grup_b_inesta_emoci_subtip_impul_bajo"));
                    grup_b_inesta_emoci_subtip_impul_medio.setSelected(oConn.setResult.getBoolean("grup_b_inesta_emoci_subtip_impul_medio"));
                    grup_b_inesta_emoci_subtip_impul_alto.setSelected(oConn.setResult.getBoolean("grup_b_inesta_emoci_subtip_impul_alto"));
                    
                    grup_b_emoci_subtip_lim_bajo.setSelected(oConn.setResult.getBoolean("grup_b_emoci_subtip_lim_bajo"));
                    grup_b_emoci_subtip_lim_medio.setSelected(oConn.setResult.getBoolean("grup_b_emoci_subtip_lim_medio"));
                    grup_b_emoci_subtip_lim_alto.setSelected(oConn.setResult.getBoolean("grup_b_emoci_subtip_lim_alto"));
                    
                    grup_c_anancastico_bajo.setSelected(oConn.setResult.getBoolean("grup_c_anancastico_bajo"));
                    grup_c_anancastico_medio.setSelected(oConn.setResult.getBoolean("grup_c_anancastico_medio"));
                    grup_c_anancastico_alto.setSelected(oConn.setResult.getBoolean("grup_c_anancastico_alto"));
                    
                    grup_c_dependiente_bajo.setSelected(oConn.setResult.getBoolean("grup_c_dependiente_bajo"));
                    grup_c_dependiente_medio.setSelected(oConn.setResult.getBoolean("grup_c_dependiente_medio"));
                    grup_c_dependiente_alto.setSelected(oConn.setResult.getBoolean("grup_c_dependiente_alto"));
                    
                    grup_c_ansioso_bajo.setSelected(oConn.setResult.getBoolean("grup_c_ansioso_bajo"));
                    grup_c_ansioso_medio.setSelected(oConn.setResult.getBoolean("grup_c_ansioso_medio"));
                    grup_c_ansioso_alto.setSelected(oConn.setResult.getBoolean("grup_c_ansioso_alto"));
                    
                    analisis_resulta.setText(oConn.setResult.getString("analisis_resulta"));
                    recomendacion.setText(oConn.setResult.getString("recomendacion"));
                    perf_cumple.setSelected(oConn.setResult.getBoolean("perf_cumple"));
                    perf_no_cumple.setSelected(oConn.setResult.getBoolean("perf_no_cumple"));
                    interpretacion_parainoide.setText(oConn.setResult.getString("interpretacion_parainoide"));

                    
                    //jTextField9.setText(oConn.setResult.getString("valorigg"));
                }else{
                oFunc.SubSistemaMensajeError("N° orden no resgistrado");
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion(" informe de Test Salamanca:" + ex.getMessage());
        }
        }
        else
            oFunc.SubSistemaMensajeError("debes ingresar un codigo");
                                          
    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void fechaevaluacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaevaluacionPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaevaluacionPropertyChange

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
        print (Integer.valueOf(imprimir.getText()));
    }//GEN-LAST:event_imprimirActionPerformed

    private void imprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir1ActionPerformed
        // TODO add your handling code here:
        print (Integer.valueOf(imprimir.getText()));
    }//GEN-LAST:event_imprimir1ActionPerformed

    private void perf_no_cumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perf_no_cumpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perf_no_cumpleActionPerformed

    private void perf_cumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perf_cumpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perf_cumpleActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
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
                    Logger.getLogger(PsicoTrastorPersonalidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void grup_a_paranoide_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_paranoide_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_paranoide_bajoActionPerformed

    private void grup_a_paranoide_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_paranoide_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_paranoide_medioActionPerformed

    private void grup_a_paranoide_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_paranoide_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_paranoide_altoActionPerformed

    private void grup_a_esquizoide_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_esquizoide_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_esquizoide_bajoActionPerformed

    private void grup_a_esquizoide_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_esquizoide_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_esquizoide_medioActionPerformed

    private void grup_a_esquizoide_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_esquizoide_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_esquizoide_altoActionPerformed

    private void grup_a_esquizotipico_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_esquizotipico_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_esquizotipico_bajoActionPerformed

    private void grup_a_esquizotipico_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_esquizotipico_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_esquizotipico_medioActionPerformed

    private void grup_a_esquizotipico_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_a_esquizotipico_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_a_esquizotipico_altoActionPerformed

    private void grup_c_anancastico_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_anancastico_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_anancastico_bajoActionPerformed

    private void grup_c_anancastico_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_anancastico_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_anancastico_medioActionPerformed

    private void grup_c_anancastico_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_anancastico_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_anancastico_altoActionPerformed

    private void grup_c_dependiente_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_dependiente_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_dependiente_bajoActionPerformed

    private void grup_c_dependiente_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_dependiente_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_dependiente_medioActionPerformed

    private void grup_c_dependiente_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_dependiente_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_dependiente_altoActionPerformed

    private void grup_c_ansioso_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_ansioso_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_ansioso_medioActionPerformed

    private void grup_c_ansioso_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_ansioso_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_ansioso_altoActionPerformed

    private void grup_c_ansioso_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_c_ansioso_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_c_ansioso_bajoActionPerformed

    private void grup_b_emoci_subtip_lim_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_emoci_subtip_lim_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_emoci_subtip_lim_altoActionPerformed

    private void grup_b_emoci_subtip_lim_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_emoci_subtip_lim_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_emoci_subtip_lim_medioActionPerformed

    private void grup_b_emoci_subtip_lim_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_emoci_subtip_lim_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_emoci_subtip_lim_bajoActionPerformed

    private void grup_b_inesta_emoci_subtip_impul_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_inesta_emoci_subtip_impul_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_inesta_emoci_subtip_impul_altoActionPerformed

    private void grup_b_inesta_emoci_subtip_impul_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_inesta_emoci_subtip_impul_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_inesta_emoci_subtip_impul_medioActionPerformed

    private void grup_b_inesta_emoci_subtip_impul_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_inesta_emoci_subtip_impul_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_inesta_emoci_subtip_impul_bajoActionPerformed

    private void grup_b_narcicista_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_narcicista_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_narcicista_altoActionPerformed

    private void grup_b_narcicista_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_narcicista_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_narcicista_medioActionPerformed

    private void grup_b_narcicista_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_narcicista_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_narcicista_bajoActionPerformed

    private void grup_b_antisocial_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_antisocial_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_antisocial_altoActionPerformed

    private void grup_b_antisocial_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_antisocial_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_antisocial_medioActionPerformed

    private void grup_b_antisocial_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_antisocial_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_antisocial_bajoActionPerformed

    private void grup_b_histrionico_altoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_histrionico_altoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_histrionico_altoActionPerformed

    private void grup_b_histrionico_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_histrionico_medioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_histrionico_medioActionPerformed

    private void grup_b_histrionico_bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grup_b_histrionico_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grup_b_histrionico_bajoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextArea analisis_resulta;
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField empresa;
    private com.toedter.calendar.JDateChooser fechaevaluacion;
    private javax.swing.JTextField grado_estudios;
    private javax.swing.JCheckBox grup_a_esquizoide_alto;
    private javax.swing.JCheckBox grup_a_esquizoide_bajo;
    private javax.swing.JCheckBox grup_a_esquizoide_medio;
    private javax.swing.JCheckBox grup_a_esquizotipico_alto;
    private javax.swing.JCheckBox grup_a_esquizotipico_bajo;
    private javax.swing.JCheckBox grup_a_esquizotipico_medio;
    private javax.swing.JCheckBox grup_a_paranoide_alto;
    private javax.swing.JCheckBox grup_a_paranoide_bajo;
    private javax.swing.JCheckBox grup_a_paranoide_medio;
    private javax.swing.JCheckBox grup_b_antisocial_alto;
    private javax.swing.JCheckBox grup_b_antisocial_bajo;
    private javax.swing.JCheckBox grup_b_antisocial_medio;
    private javax.swing.JCheckBox grup_b_emoci_subtip_lim_alto;
    private javax.swing.JCheckBox grup_b_emoci_subtip_lim_bajo;
    private javax.swing.JCheckBox grup_b_emoci_subtip_lim_medio;
    private javax.swing.JCheckBox grup_b_histrionico_alto;
    private javax.swing.JCheckBox grup_b_histrionico_bajo;
    private javax.swing.JCheckBox grup_b_histrionico_medio;
    private javax.swing.JCheckBox grup_b_inesta_emoci_subtip_impul_alto;
    private javax.swing.JCheckBox grup_b_inesta_emoci_subtip_impul_bajo;
    private javax.swing.JCheckBox grup_b_inesta_emoci_subtip_impul_medio;
    private javax.swing.JCheckBox grup_b_narcicista_alto;
    private javax.swing.JCheckBox grup_b_narcicista_bajo;
    private javax.swing.JCheckBox grup_b_narcicista_medio;
    private javax.swing.JCheckBox grup_c_anancastico_alto;
    private javax.swing.JCheckBox grup_c_anancastico_bajo;
    private javax.swing.JCheckBox grup_c_anancastico_medio;
    private javax.swing.JCheckBox grup_c_ansioso_alto;
    private javax.swing.JCheckBox grup_c_ansioso_bajo;
    private javax.swing.JCheckBox grup_c_ansioso_medio;
    private javax.swing.JCheckBox grup_c_dependiente_alto;
    private javax.swing.JCheckBox grup_c_dependiente_bajo;
    private javax.swing.JCheckBox grup_c_dependiente_medio;
    private javax.swing.JTextField imprimir;
    private javax.swing.JButton imprimir1;
    private javax.swing.JTextArea interpretacion_parainoide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel28;
    private static javax.swing.JPanel jPanel30;
    private static javax.swing.JPanel jPanel31;
    private static transient javax.swing.JPanel jPanel32;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField n_orden;
    private javax.swing.JTextField nombres;
    private javax.swing.JCheckBox perf_cumple;
    private javax.swing.JCheckBox perf_no_cumple;
    private javax.swing.JTextArea recomendacion;
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