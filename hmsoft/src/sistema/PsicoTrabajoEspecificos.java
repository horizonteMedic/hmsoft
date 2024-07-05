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
public final class PsicoTrabajoEspecificos extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;

   public PsicoTrabajoEspecificos() {
      initComponents();
      llenarNombreExamen();
      

   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAprobo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        n_orden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        fechaevaluacion = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        grado_estudio = new javax.swing.JTextField();
        Editar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        empresa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        recomendaciones = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        criterio_Nivel_alert_riesgo = new javax.swing.JTextField();
        criterio_Nivel_psicomotrocidad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        analisis_foda_forta_oport = new javax.swing.JTextField();
        analisis_foda_amenaz_debili = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        IMPRIMIR = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        perf_cumple = new javax.swing.JRadioButton();
        perf_no_cumple = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Informe Psicológico");

        jPanel5.setForeground(new java.awt.Color(102, 102, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Necesarios"));

        jLabel1.setText("Nro Orden:");

        n_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_ordenActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombres:");

        nombres.setEditable(false);
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos:");

        apellidos.setEditable(false);

        jLabel8.setText("Edad:");

        edad.setEditable(false);

        fechaevaluacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaevaluacionPropertyChange(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Fecha Entrevista :");

        jLabel2.setText("Grado de Instruccion:");

        grado_estudio.setEditable(false);

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
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
                        .addGap(58, 58, 58)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grado_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaevaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Editar)
                        .addComponent(jLabel23))
                    .addComponent(fechaevaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(grado_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel12.setText("Empresa");

        jLabel13.setText("Cargo");

        cargo.setEditable(false);

        empresa.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        observaciones.setColumns(20);
        observaciones.setRows(5);
        observaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                observacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                observacionesFocusLost(evt);
            }
        });
        observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                observacionesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(observaciones);
        observaciones.getAccessibleContext().setAccessibleName("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("OBSERVACIONES");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregar.setMnemonic('g');
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnActualizar.setMnemonic('i');
        btnActualizar.setText("Actualizar");
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

        recomendaciones.setColumns(20);
        recomendaciones.setRows(5);
        recomendaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recomendacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                recomendacionesFocusLost(evt);
            }
        });
        recomendaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recomendacionesKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(recomendaciones);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRITERIOS PSICOLÓGICOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("1.-NIVEL DE ALERTA ANTE EL RIESGO");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setText("2.- NIVEL DE PSICOMOTRICIDAD ");

        criterio_Nivel_alert_riesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_Nivel_alert_riesgoActionPerformed(evt);
            }
        });

        criterio_Nivel_psicomotrocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_Nivel_psicomotrocidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criterio_Nivel_alert_riesgo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(criterio_Nivel_psicomotrocidad))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(criterio_Nivel_alert_riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(criterio_Nivel_psicomotrocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANÁLISIS FODA ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Fortalezas / Oportunidades");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Amenazas / Debilidades: ");

        analisis_foda_forta_oport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis_foda_forta_oportActionPerformed(evt);
            }
        });

        analisis_foda_amenaz_debili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis_foda_amenaz_debiliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analisis_foda_forta_oport)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(analisis_foda_amenaz_debili))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel18)
                .addGap(5, 5, 5)
                .addComponent(analisis_foda_forta_oport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(5, 5, 5)
                .addComponent(analisis_foda_amenaz_debili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("RECOMENDACIONES");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("IMPRIMIR"));

        IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(IMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CONCLUSIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        bgAprobo.add(perf_cumple);
        perf_cumple.setText("APTO");

        bgAprobo.add(perf_no_cumple);
        perf_no_cumple.setText("NO APTO");
        perf_no_cumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perf_no_cumpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perf_cumple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perf_no_cumple)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perf_cumple)
                    .addComponent(perf_no_cumple))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(182, 182, 182))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 45, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Informe", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarNombreExamen(){
        

    }
     public boolean OrdenImp() {

        boolean bResultado = false;
        if (!IMPRIMIR.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from Especificos Where n_orden =" + IMPRIMIR.getText();

            //Ejecuta el Query
            oConn.FnBoolQueryExecute(sQuery);

            // Capturo el Error
            try {

                // Verifico que haya habido resultados
                if (oConn.setResult.next()) {
                    // Resultado
                    bResultado = true;
                }

                // Cierro los Resultados
                oConn.sqlStmt.close();

            } catch (SQLException ex) {

            }
        }
        return bResultado;
    } 
    private void recomendacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recomendacionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_recomendacionesKeyReleased

    private void recomendacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recomendacionesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_recomendacionesFocusLost

    private void recomendacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recomendacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_recomendacionesFocusGained

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String sCodigo=n_orden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE Especificos\n" ;
        strSqlStmt += "   SET  "
                + "fechaevaluacion='"+fechaevaluacion.getDate()+"', "                
                + "criterio_Nivel_alert_riesgo='"+criterio_Nivel_alert_riesgo.getText()+"', "
                + "criterio_Nivel_psicomotrocidad='"+criterio_Nivel_psicomotrocidad.getText()+"', "
                + "txtfortalezaso='"+analisis_foda_forta_oport.getText()+"', "
                + "analisis_foda_forta_oport='"+analisis_foda_amenaz_debili.getText()+"', "
                + "observaciones='"+observaciones.getText()+"',"
                + "recomendaciones='"+recomendaciones.getText()+"', "
                + "perf_cumple='"+perf_cumple.isSelected()+"', "
                + "perf_no_cumple='"+perf_no_cumple.isSelected()+"' "
                
                + " WHERE n_orden='" + sCodigo + "'";

        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            imprimir(Integer.valueOf(n_orden.getText()));
            limpiar();
            n_orden.setEnabled(true);
            n_orden.requestFocus();
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(PsicoTrabajoEspecificos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!n_orden.getText().isEmpty()){
            if(!OrdenExiste()){
                if (validar()){
                    String Sql ="INSERT INTO Especificos(\n" +
"            n_orden, criterio_Nivel_alert_riesgo, criterio_Nivel_psicomotrocidad, analisis_foda_forta_oport, analisis_foda_amenaz_debili, observaciones, \n" +
"            recomendaciones, perf_cumple, perf_no_cumple,  \n" +
"            adpto, noadpto)" ;
                    Sql+="Values('"+n_orden.getText()+"','"+fechaevaluacion.getDate()+"','"
                    
                    +criterio_Nivel_alert_riesgo.getText()+ "','"
                    +criterio_Nivel_psicomotrocidad.getText()+"','"                    
                    +analisis_foda_forta_oport.getText()+"','"
                    +analisis_foda_amenaz_debili.getText()+"','"
                    +observaciones.getText()+"','"
                    +recomendaciones.getText()+"','"
                    +perf_cumple.isSelected()+"','"
                    +perf_no_cumple.isSelected()+"')";
                    //oFunc.SubSistemaMensajeInformacion(Sql);
                    if (oConn.FnBoolQueryExecuteUpdate(Sql)){
                        //oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                        imprimir(Integer.valueOf(n_orden.getText()));
                        n_orden.setEnabled(true);
                        n_orden.requestFocus();
                        limpiar();
                        try {
                            oConn.sqlStmt.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(PsicoTrabajoEspecificos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
                }else{oFunc.SubSistemaMensajeError("Ingrese Información Faltante");}
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_observacionesKeyReleased
        
    }//GEN-LAST:event_observacionesKeyReleased

    private void observacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_observacionesFocusLost
        observaciones.setBackground(Color.WHITE);
    }//GEN-LAST:event_observacionesFocusLost

    private void observacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_observacionesFocusGained

    }//GEN-LAST:event_observacionesFocusGained

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if(!n_orden.getText().isEmpty()){        
        String Sql="select d.nombres_pa,d.apellidos_pa, d.nivel_est_pa, d.cod_pa, d.fecha_nacimiento_pa ,EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad, "
                +"n.cargo_de ,n.razon_empresa,n.fecha_apertura_po,f.*"
                +" FROM datos_paciente AS d\n" 
                +"INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) \n" 
                +"INNER JOIN Especificos as f ON (n.n_orden=f.n_orden)" 
                +"WHERE n.n_orden ='"+n_orden.getText()+"'";
            System.out.println(Sql);
            oConn.FnBoolQueryExecute(Sql);
        try {
            if (oConn.setResult.next()) {
                nombres.setText(oConn.setResult.getString("nombres_pa"));
                apellidos.setText(oConn.setResult.getString("apellidos_pa"));
                grado_estudio.setText(oConn.setResult.getString("nivel_est_pa"));
                empresa.setText(oConn.setResult.getString("razon_empresa"));
                cargo.setText(oConn.setResult.getString("cargo_de"));
                edad.setText(oConn.setResult.getString("edad"));
                fechaevaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                criterio_Nivel_alert_riesgo.setText(oConn.setResult.getString("criterio_Nivel_alert_riesgo"));
                criterio_Nivel_psicomotrocidad.setText(oConn.setResult.getString("criterio_Nivel_psicomotrocidad"));             
                analisis_foda_forta_oport.setText(oConn.setResult.getString("analisis_foda_forta_oport"));
                analisis_foda_amenaz_debili.setText(oConn.setResult.getString("analisis_foda_amenaz_debili"));
                observaciones.setText(oConn.setResult.getString("observaciones"));
                recomendaciones.setText(oConn.setResult.getString("recomendaciones"));
                perf_cumple.setSelected(oConn.setResult.getBoolean("Conclusiones_apto"));
                perf_no_cumple.setSelected(oConn.setResult.getBoolean("conclusiones_no_apto"));
                btnAgregar.setEnabled(false);
                

            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Registro");
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion(" informe de Especificos :" + ex.getMessage());
        }
        }
        else
            oFunc.SubSistemaMensajeError("debes ingresar un codigo");
    }//GEN-LAST:event_EditarActionPerformed

    private void fechaevaluacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaevaluacionPropertyChange
        fechaevaluacion.requestFocus();
    }//GEN-LAST:event_fechaevaluacionPropertyChange

    private void n_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ordenActionPerformed
        if(!n_orden.getText().isEmpty()){
            if(!oPe.nOrden(n_orden, "Especificos"))  {
                fechaevaluacion = new com.toedter.calendar.JDateChooser();
                String Sql="select d.nombres_pa,d.apellidos_pa , d.nivel_est_pa, d.cod_pa, d.fecha_nacimiento_pa , "
                + "n.cargo_de ,n.razon_empresa, EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad, n.fecha_apertura_po from datos_paciente AS d "
                + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) WHERE n.n_orden ='"+n_orden.getText()+"'";
                oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    nombres.setText(oConn.setResult.getString("nombres_pa"));
                    apellidos.setText(oConn.setResult.getString("apellidos_pa"));
                    grado_estudio.setText(oConn.setResult.getString("nivel_est_pa"));
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
                oFunc.SubSistemaMensajeInformacion("fobias:" + ex.getMessage());
            }
        }
            else
                oFunc.SubSistemaMensajeInformacion("Ya existe este registro en fobias ");
      }
    }//GEN-LAST:event_n_ordenActionPerformed

    private void IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMPRIMIRActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        if(OrdenImp()){
           print (Integer.valueOf(IMPRIMIR.getText()));
        }else{
           oFunc.SubSistemaMensajeError("Codigo no existe"); 
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void criterio_Nivel_alert_riesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_Nivel_alert_riesgoActionPerformed
        // TODO add your handling code here:
        criterio_Nivel_alert_riesgo.requestFocus();
    }//GEN-LAST:event_criterio_Nivel_alert_riesgoActionPerformed

    private void criterio_Nivel_psicomotrocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_Nivel_psicomotrocidadActionPerformed
        // TODO add your handling code here:
        criterio_Nivel_psicomotrocidad.requestFocus();
        
    }//GEN-LAST:event_criterio_Nivel_psicomotrocidadActionPerformed

    private void analisis_foda_forta_oportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisis_foda_forta_oportActionPerformed
        // TODO add your handling code here:
        analisis_foda_forta_oport.requestFocus();
    }//GEN-LAST:event_analisis_foda_forta_oportActionPerformed

    private void analisis_foda_amenaz_debiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisis_foda_amenaz_debiliActionPerformed
        // TODO add your handling code here:
        analisis_foda_amenaz_debili.requestFocus();
    }//GEN-LAST:event_analisis_foda_amenaz_debiliActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void perf_no_cumpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perf_no_cumpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perf_no_cumpleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JTextField IMPRIMIR;
    private javax.swing.JTextField analisis_foda_amenaz_debili;
    private javax.swing.JTextField analisis_foda_forta_oport;
    private javax.swing.JTextField apellidos;
    private javax.swing.ButtonGroup bgAprobo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField criterio_Nivel_alert_riesgo;
    private javax.swing.JTextField criterio_Nivel_psicomotrocidad;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField empresa;
    private com.toedter.calendar.JDateChooser fechaevaluacion;
    private javax.swing.JTextField grado_estudio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField n_orden;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JRadioButton perf_cumple;
    private javax.swing.JRadioButton perf_no_cumple;
    private javax.swing.JTextArea recomendaciones;
    // End of variables declaration//GEN-END:variables
    public void limpiar() {
        n_orden.setText(null);        
        nombres.setText(null);
        apellidos.setText(null);        
        edad.setText(null);        
        empresa.setText(null);
        cargo.setText(null);
        grado_estudio.setText(null);        
        criterio_Nivel_alert_riesgo.setText(null);
        criterio_Nivel_psicomotrocidad.setText(null);        
        analisis_foda_forta_oport.setText(null);
        analisis_foda_amenaz_debili.setText(null);
        observaciones.setText(null);
        recomendaciones.setText(null);
        fechaevaluacion.setDate(null);        
        n_orden.setEnabled(true);
        n_orden.requestFocus();
    }

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
private boolean validar(){
boolean bResultado=true;
if (((JTextField)fechaevaluacion.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Entrevista");bResultado = false;}
    if(n_orden.getText().isEmpty()){bResultado = false;}
    if(edad.getText().isEmpty()){bResultado = false;}
   
    if(observaciones.getText().isEmpty()){bResultado = false;}
    
    if(!bgAprobo.getSelection().isSelected()){
        oFunc.SubSistemaMensajeError("Seleccione si aprobo o no aprobo");
        bResultado = false;}
 
   return bResultado;
}

public boolean OrdenExiste()
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from Especificos Where n_orden="+n_orden.getText();
        oConn.FnBoolQueryExecute(sQuery);
        try {
            if (oConn.setResult.next())
            {
                bResultado = true;
             oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
             limpiar();
            }
            oConn.setResult.close();
            
        } catch (SQLException ex) {
         }
        return bResultado;        
    }



 private void print(Integer cod){
  //Integer n;
               //n = Integer.parseInt(txtNorden.getText());
                //Pasamos parametros al reporte Jasper. 
                Map parameters = new HashMap(); 

                // Coloco los valores en los parámetros
                parameters.put("n_orden",cod);             
                

                try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/agregarEspecificos.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte Especificos.");
                //System.exit(2);
            } 

            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } 
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }        
                 


                    // Genera el reporte usando el objeto JasperReport e indicando la conexion
                    JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);
                    //JasperPrint myPrint = JasperFillManager.fillReport(myReport, null,new JREmptyDataSource());

                    // Visualiza el Reporte
                  
                    JasperViewer.viewReport(myPrint,false);
                    

                } catch (JRException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        
 
 }
 private void imprimir(Integer num){
     
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Desea Imprimir Ficha ?", //Mensaje
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
      printer(num);
      
   }
   else
   {
      // PRESIONO NO
     }
    }

}

private void printer(Integer cod) {
        Map parameters = new HashMap();
        parameters.put("n_orden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/agregarinforme.jasper";

            System.out.println("master" + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del ficha psicologica.");
                //System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }
            JasperPrint myPrint = JasperFillManager.fillReport(masterReport,parameters,clsConnection.oConnection);

                    JasperViewer.viewReport(myPrint,true);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parameters, clsConnection.oConnection);
            JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
