/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import Caja.RegistrarCliente;
import Clases.clsConnection;
import Clases.clsFunciones;
import Clases.clsGlobales;
import Clases.clsOperacionesUsuarios;
import autocomplete.AutoCompleteDBLink;
import autocomplete.AutoTextComplete;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
import sun.misc.BASE64Decoder;

/**
 *
 * @author admin
 */
public final class PsicoCuestionarioBerlin extends javax.swing.JInternalFrame {

    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
    DefaultTableModel model;
 String a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="", a9="";
   public PsicoCuestionarioBerlin() {
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
        FechaEvaluacion = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        grado_estudio = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
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
        jLabel80 = new javax.swing.JLabel();
        criterio_Apnea_obstructiva_sueño = new javax.swing.JTextField();
        criterio_Fatiga_somnolencia = new javax.swing.JTextField();
        criterio_Hipertension_arterial = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        analisis_foda_forta_oport = new javax.swing.JTextField();
        analisis_foda_amenaz_debili = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imprimir = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        perf_cumple = new javax.swing.JRadioButton();
        perf_no_cumple = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("INFORME PSICOLÓGICO DE CUESTIONARIO DE BERLIN");

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

        FechaEvaluacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaEvaluacionPropertyChange(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Fecha Entrevista :");

        jLabel2.setText("Grado de Instruccion:");

        grado_estudio.setEditable(false);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnEditar)
                        .addComponent(jLabel23))
                    .addComponent(FechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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
        jLabel14.setText("1.- APNEA OBSTRUCTIVA DEL SUEÑO");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setText("2.- FATIGA Y SOMNOLENCIA");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel80.setText("3.- HIPERTENSIÓN ARTERIAL");

        criterio_Apnea_obstructiva_sueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_Apnea_obstructiva_sueñoActionPerformed(evt);
            }
        });

        criterio_Fatiga_somnolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_Fatiga_somnolenciaActionPerformed(evt);
            }
        });

        criterio_Hipertension_arterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_Hipertension_arterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel80)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criterio_Apnea_obstructiva_sueño, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(criterio_Fatiga_somnolencia, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(criterio_Hipertension_arterial, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(criterio_Apnea_obstructiva_sueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(criterio_Fatiga_somnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(criterio_Hipertension_arterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
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
                    .addComponent(analisis_foda_forta_oport, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(analisis_foda_amenaz_debili, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
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

        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
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
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CONCLUSIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        bgAprobo.add(perf_cumple);
        perf_cumple.setText("APTO");

        bgAprobo.add(perf_no_cumple);
        perf_no_cumple.setText("NO APTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(perf_cumple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perf_no_cumple)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perf_cumple)
                    .addComponent(perf_no_cumple))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(182, 182, 182))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jScrollPane8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Informe", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarNombreExamen(){
        

    }
     public boolean OrdenImp() {

        boolean bResultado = false;
        if (!imprimir.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from cuestionario_Berlin Where n_orden =" + imprimir.getText();

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
    } private com.toedter.calendar.JDateChooser FechaNacimiento;
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
        if(!n_orden.getText().isEmpty()){
        String sCodigo=n_orden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE cuestionario_Berlin\n" ;
        strSqlStmt += " SET  "
                
                + "criterio_Apnea_obstructiva_sueño='"+criterio_Apnea_obstructiva_sueño.getText()+"', "
                + "criterio_Fatiga_somnolencia='"+criterio_Fatiga_somnolencia.getText()+"', "
                + "criterio_Hipertension_arterial='"+criterio_Hipertension_arterial.getText()+"', "
                + "analisis_foda_forta_oport='"+analisis_foda_forta_oport.getText()+"', "
                + "analisis_foda_amenaz_debili='"+analisis_foda_amenaz_debili.getText()+"', "
                + "observaciones='"+observaciones.getText()+"',"
                + "recomendaciones='"+recomendaciones.getText()+"', "
                + "perf_cumple='"+perf_cumple.isSelected()+"', "
                + "perf_no_cumple='"+perf_no_cumple.isSelected()+"' "
                
                + " WHERE n_orden='" + sCodigo + "'";
                System.out.println(strSqlStmt);
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
                Logger.getLogger(PsicoCuestionarioBerlin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
       }
        else 
            oFunc.SubSistemaMensajeError("Debe ingresar un codigo para actualizar");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!n_orden.getText().isEmpty()){
            if(!OrdenExiste()){
                if (validar()){
                    String Sql ="INSERT INTO cuestionario_Berlin(\n" +
                    " n_orden, criterio_Apnea_obstructiva_sueño ,criterio_Fatiga_somnolencia, criterio_Hipertension_arterial,\n" +     
                    "  analisis_foda_forta_oport,\n" +
                    "  analisis_foda_amenaz_debili ,\n" +
                    "  observaciones,\n" +
                    "  recomendaciones,\n" +
                    "  perf_cumple,\n" +
                    "  perf_no_cumple,user_registro )" ;
                    Sql+="Values('"
                    +n_orden.getText()+"','"                                                                          
                    +criterio_Apnea_obstructiva_sueño.getText()+ "','"
                    +criterio_Fatiga_somnolencia.getText()+"','"
                    +criterio_Hipertension_arterial.getText()+"','"
                    +analisis_foda_forta_oport.getText()+"','"
                    +analisis_foda_amenaz_debili.getText()+"','"
                    +observaciones.getText()+"','"
                    +recomendaciones.getText()+"','"
                    +perf_cumple.isSelected()+"','"
                    +perf_no_cumple.isSelected()+"','"+clsGlobales.sUser+"')";
                    //oFunc.SubSistemaMensajeInformacion(Sql);
                    if (oConn.FnBoolQueryExecuteUpdate(Sql)){
                        oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                        imprimir(Integer.valueOf(n_orden.getText()));
                        n_orden.setEnabled(true);
                        n_orden.requestFocus();
                        limpiar();
                        try {
                            oConn.sqlStmt.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(PsicoCuestionarioBerlin.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if(!n_orden.getText().isEmpty()){        
        String Sql="select d.nombres_pa,d.apellidos_pa, d.nivel_est_pa, d.cod_pa, d.fecha_nacimiento_pa ,EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad, "
                +"n.cargo_de ,n.razon_empresa,n.fecha_apertura_po,cb.*"
                +" FROM datos_paciente AS d\n" 
                +"INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) \n" 
                +"INNER JOIN cuestionario_Berlin as cb ON (n.n_orden=cb.n_orden)" 
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
                FechaEvaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));                
                criterio_Apnea_obstructiva_sueño.setText(oConn.setResult.getString("criterio_Apnea_obstructiva_sueño"));
                criterio_Fatiga_somnolencia.setText(oConn.setResult.getString("criterio_Fatiga_somnolencia"));
                criterio_Hipertension_arterial.setText(oConn.setResult.getString("criterio_Hipertension_arterial"));
                analisis_foda_forta_oport.setText(oConn.setResult.getString("analisis_foda_forta_oport"));
                analisis_foda_amenaz_debili.setText(oConn.setResult.getString("analisis_foda_amenaz_debili"));
                observaciones.setText(oConn.setResult.getString("observaciones"));
                recomendaciones.setText(oConn.setResult.getString("recomendaciones"));
                perf_cumple.setSelected(oConn.setResult.getBoolean("perf_cumple"));
                perf_no_cumple.setSelected(oConn.setResult.getBoolean("perf_no_cumple"));
                btnAgregar.setEnabled(false);
                FechaEvaluacion.setEnabled(false);
                FechaEvaluacion.setEnabled(false);
                nombres.setEnabled(false);
                edad.setEnabled(false);                    
                grado_estudio.setEnabled(false);
                empresa.setEnabled(false);
                cargo.setEnabled(false);
                    

            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Registro");
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Informe Psicologico Cuestionario Berlin:" + ex.getMessage().toString());
        }
       }
       else
            oFunc.SubSistemaMensajeError("debes ingresar un codigo");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void FechaEvaluacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaEvaluacionPropertyChange
        n_orden.requestFocus();
    }//GEN-LAST:event_FechaEvaluacionPropertyChange

    private void n_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ordenActionPerformed
        if(!n_orden.getText().isEmpty()){
            if(!oPe.nOrden(n_orden, "cuestionario_Berlin"))  {
                FechaNacimiento = new com.toedter.calendar.JDateChooser();
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
                    //no editables
                    n_orden.setEnabled(false);                    
                    FechaEvaluacion.setEnabled(false);
                    nombres.setEnabled(false);
                    apellidos.setEnabled(false); 
                    edad.setEnabled(false);                    
                    grado_estudio.setEnabled(false);
                    empresa.setEnabled(false);
                    cargo.setEnabled(false);
                    //habilitar guardar cuando finalizaco un registro  y desea agregar otro 
                    btnAgregar.setEnabled(true);
                    
                    
                    
                    FechaEvaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("informe de Cuestionario Berlin:" + ex.getMessage());
            }
        }
            else
                oFunc.SubSistemaMensajeInformacion("Ya existe este registro ");
      }
    }//GEN-LAST:event_n_ordenActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        if(OrdenImp()){
            try {
                print (Integer.valueOf(imprimir.getText()));
            } catch (IOException ex) {
                Logger.getLogger(PsicoCuestionarioBerlin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
           oFunc.SubSistemaMensajeError("Codigo no existe"); 
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void criterio_Apnea_obstructiva_sueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_Apnea_obstructiva_sueñoActionPerformed
        // TODO add your handling code here:
        criterio_Fatiga_somnolencia.requestFocus();
    }//GEN-LAST:event_criterio_Apnea_obstructiva_sueñoActionPerformed

    private void criterio_Fatiga_somnolenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_Fatiga_somnolenciaActionPerformed
        // TODO add your handling code here:
        criterio_Hipertension_arterial.requestFocus();
        
    }//GEN-LAST:event_criterio_Fatiga_somnolenciaActionPerformed

    private void criterio_Hipertension_arterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_Hipertension_arterialActionPerformed
        // TODO add your handling code here:
        analisis_foda_forta_oport.requestFocus();
    }//GEN-LAST:event_criterio_Hipertension_arterialActionPerformed

    private void analisis_foda_forta_oportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisis_foda_forta_oportActionPerformed
        // TODO add your handling code here:
        analisis_foda_amenaz_debili.requestFocus();
    }//GEN-LAST:event_analisis_foda_forta_oportActionPerformed

    private void analisis_foda_amenaz_debiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisis_foda_amenaz_debiliActionPerformed
        // TODO add your handling code here:
        observaciones.requestFocus();
    }//GEN-LAST:event_analisis_foda_amenaz_debiliActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEvaluacion;
    private javax.swing.JTextField analisis_foda_amenaz_debili;
    private javax.swing.JTextField analisis_foda_forta_oport;
    private javax.swing.JTextField apellidos;
    private javax.swing.ButtonGroup bgAprobo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField criterio_Apnea_obstructiva_sueño;
    private javax.swing.JTextField criterio_Fatiga_somnolencia;
    private javax.swing.JTextField criterio_Hipertension_arterial;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField empresa;
    private javax.swing.JTextField grado_estudio;
    private javax.swing.JTextField imprimir;
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
    private javax.swing.JLabel jLabel80;
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
        FechaEvaluacion.setDate(null);
        
        /*criterio_Apnea_obstructiva_sueño.setText(null);
        criterio_Fatiga_somnolencia.setText(null);
        criterio_Hipertension_arterial.setText(null);
        analisis_foda_forta_oport.setText(null);
        analisis_foda_amenaz_debili.setText(null);
        observaciones.setText(null);
        recomendaciones.setText(null);
        bgAprobo.clearSelection();*/
        imprimir.setText(null);
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
if (((JTextField)FechaEvaluacion.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
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
        sQuery  = "Select n_orden from cuestionario_Berlin Where n_orden="+n_orden.getText();
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



 private void print(Integer cod) throws IOException{
        String dniUsuario=oPe.consultarDni("cuestionario_Berlin", String.valueOf(cod));
                String base64Sello=""; 
       try {

           base64Sello=oPe.consumirApiSello(String.valueOf(dniUsuario));           
       } catch (Exception ex) {
           Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
       }

                
        Map parameters = new HashMap();
        parameters.put("Norden", cod);

              if(!base64Sello.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Sello);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Sello",stream);             
              }   
                    try 
                {    
                    String master="";
                   if( base64Sello.contains("OTROJASPER")){
                       master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"INFORME_PSICOLÓGICO_DE_CUESTIONARIO_DE_BERLIN.jasper";                 
                    }
                   else{
                       master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"INFORME_PSICOLÓGICO_DE_CUESTIONARIO_DE_BERLIN_Digitalizado.jasper";  
                   }
            

            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte InformePsicologicoCuestionarioBerlin.");
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
       try {
           printer(num);
       } catch (IOException ex) {
           Logger.getLogger(PsicoCuestionarioBerlin.class.getName()).log(Level.SEVERE, null, ex);
       }
      
   }
   else
   {
      // PRESIONO NO
     }
    }

}

private void printer(Integer cod) throws IOException {
        String dniUsuario=oPe.consultarDni("cuestionario_Berlin", String.valueOf(cod));
                String base64Sello=""; 
       try {

           base64Sello=oPe.consumirApiSello(String.valueOf(dniUsuario));           
       } catch (Exception ex) {
           Logger.getLogger(AntecedentesPatologicos.class.getName()).log(Level.SEVERE, null, ex);
       }

                
        Map parameters = new HashMap();
        parameters.put("Norden", cod);

              if(!base64Sello.contains("OTROJASPER"))
              {
                BufferedImage image = null;
                byte[] imageByte;

                BASE64Decoder decoder = new BASE64Decoder();
                    imageByte = decoder.decodeBuffer(base64Sello);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();
                
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(image, "png", baos); 
                InputStream stream = new ByteArrayInputStream(baos.toByteArray());
                
                
                parameters.put("Sello",stream);             
              }   
                    try 
                {    
                    String master="";
                   if( base64Sello.contains("OTROJASPER")){
                       master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"INFORME_PSICOLÓGICO_DE_CUESTIONARIO_DE_BERLIN.jasper";                 
                    }
                   else{
                       master = System.getProperty("user.dir")+File.separator+"reportes"+File.separator+"INFORME_PSICOLÓGICO_DE_CUESTIONARIO_DE_BERLIN_Digitalizado.jasper";  
                   }
            
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
