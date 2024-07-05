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
public final class PsicologiaInformeAdicionaldeFobias extends javax.swing.JInternalFrame {
    clsConnection oConn = new clsConnection();
   clsFunciones  oFunc = new clsFunciones();
   clsOperacionesUsuarios oPe = new clsOperacionesUsuarios();
   String[]aintelectual = new String[]{};
   DefaultTableModel model;
   public PsicologiaInformeAdicionaldeFobias() {
      initComponents();

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        FechaEvaluacion = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        grado_estudio = new javax.swing.JTextField();
        EDITAR = new javax.swing.JButton();
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
        criterio_inteligencia = new javax.swing.JTextField();
        criterio_fobias = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        analisis_foda_forta_oport = new javax.swing.JTextField();
        analisis_foda_amenaz_debili = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imprimir = new javax.swing.JTextField();
        IMPRIMIR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Conclusion_apto = new javax.swing.JRadioButton();
        conclusion_no_apto = new javax.swing.JRadioButton();

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
        jLabel23.setText("Fecha Evaluacion :");

        jLabel2.setText("Grado de Estudios:");

        jLabel24.setText("años");

        grado_estudio.setEditable(false);

        EDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        EDITAR.setText("Editar");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(grado_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EDITAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(n_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EDITAR)
                        .addComponent(jLabel23))
                    .addComponent(FechaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(grado_estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel12.setText("Empresa :");

        jLabel13.setText("Cargo  :");

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
                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
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
        jLabel14.setText("1.- Inteligencia");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setText("2.- Fobias");

        criterio_inteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_inteligenciaActionPerformed(evt);
            }
        });

        criterio_fobias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_fobiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criterio_inteligencia, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criterio_fobias)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(criterio_inteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(criterio_fobias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        IMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(IMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CONCLUSIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        bgAprobo.add(Conclusion_apto);
        Conclusion_apto.setText("APTO");
        Conclusion_apto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conclusion_aptoActionPerformed(evt);
            }
        });

        bgAprobo.add(conclusion_no_apto);
        conclusion_no_apto.setText("NO APTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Conclusion_apto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(conclusion_no_apto)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Conclusion_apto)
                    .addComponent(conclusion_no_apto))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
     public boolean OrdenImp() {

        boolean bResultado = false;
        if (!imprimir.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from fobias Where n_orden =" + imprimir.getText();

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
     private com.toedter.calendar.JDateChooser FechaNacimiento;
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
        strSqlStmt="UPDATE fobias\n" ;
        strSqlStmt += " SET "                
                + "criterio_inteligencia='"+criterio_inteligencia.getText()+"', "
                + "criterio_fobias='"+criterio_fobias.getText()+"', "
                + "analisis_foda_forta_oport='"+analisis_foda_forta_oport.getText()+"', "
                + "analisis_foda_amenaz_debili='"+analisis_foda_amenaz_debili.getText()+"', "
                + "observaciones='"+observaciones.getText()+"',"
                + "recomendaciones='"+recomendaciones.getText()+"', "
                + "conclusiones_apto='"+Conclusion_apto.isSelected()+"', "
                + "conclusiones_no_apto='"+conclusion_no_apto.isSelected()+"' "              
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
                Logger.getLogger(PsicologiaInformeAdicionaldeFobias.class.getName()).log(Level.SEVERE, null, ex);
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
                    String Sql ="INSERT INTO fobias(\n" 
                            + " n_orden, \n" +
                             "criterio_inteligencia, criterio_fobias, analisis_foda_forta_oport,analisis_foda_amenaz_debili, \n"
                            + " observaciones, recomendaciones, \n" +
                             "Conclusiones_apto, conclusiones_no_apto)" ;
                    Sql+="Values('"
                    +n_orden.getText()+"','"                    
                    +criterio_inteligencia.getText()+ "','"
                    +criterio_fobias.getText()+"','"
                    +analisis_foda_forta_oport.getText()+"','"
                    +analisis_foda_amenaz_debili.getText()+"','"
                    +observaciones.getText()+"','"
                    +recomendaciones.getText()+"','"
                    +Conclusion_apto.isSelected()+"','"
                    +conclusion_no_apto.isSelected()+"')";
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
                            Logger.getLogger(PsicologiaInformeAdicionaldeFobias.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
                }else{oFunc.SubSistemaMensajeError("Ingrese Información Faltante");}
            }
            
        }
        else
        {oFunc.SubSistemaMensajeError("Debe ingresar un codigo");}
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_observacionesKeyReleased
        
    }//GEN-LAST:event_observacionesKeyReleased

    private void observacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_observacionesFocusLost
        observaciones.setBackground(Color.WHITE);
    }//GEN-LAST:event_observacionesFocusLost

    private void observacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_observacionesFocusGained

    }//GEN-LAST:event_observacionesFocusGained

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        if(!n_orden.getText().isEmpty()){        
        String Sql="select d.nombres_pa,d.apellidos_pa, d.nivel_est_pa, d.cod_pa, d.fecha_nacimiento_pa ,EXTRACT(YEAR FROM age(current_date,d.fecha_nacimiento_pa)) AS  edad, "
                +"n.cargo_de ,n.razon_empresa,n.fecha_apertura_po,f.*"
                +" FROM datos_paciente AS d\n" 
                +"INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa=n.cod_pa) \n" 
                +"INNER JOIN fobias as f ON (n.n_orden=f.n_orden)" 
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
                criterio_inteligencia.setText(oConn.setResult.getString("criterio_inteligencia"));
                criterio_fobias.setText(oConn.setResult.getString("criterio_fobias"));             
                analisis_foda_forta_oport.setText(oConn.setResult.getString("analisis_foda_forta_oport"));
                analisis_foda_amenaz_debili.setText(oConn.setResult.getString("analisis_foda_amenaz_debili"));
                observaciones.setText(oConn.setResult.getString("observaciones"));
                recomendaciones.setText(oConn.setResult.getString("recomendaciones"));
                Conclusion_apto.setSelected(oConn.setResult.getBoolean("Conclusiones_apto"));
                conclusion_no_apto.setSelected(oConn.setResult.getBoolean("conclusiones_no_apto"));
                btnAgregar.setEnabled(false);
                

            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Registro");
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion(" informe de fobias :" + ex.getMessage());
        }
        }
        else
            oFunc.SubSistemaMensajeError("debes ingresar un codigo");
    }//GEN-LAST:event_EDITARActionPerformed

    private void FechaEvaluacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaEvaluacionPropertyChange
        n_orden.requestFocus();
    }//GEN-LAST:event_FechaEvaluacionPropertyChange

    private void n_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_ordenActionPerformed
        if(!n_orden.getText().isEmpty()){
            if(!oPe.nOrden(n_orden, "fobias"))  {
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
                    n_orden.setEnabled(false);
                    Conclusion_apto.setSelected(true);
                    criterio_inteligencia.requestFocus();
                    
                    FechaEvaluacion.setDate(oConn.setResult.getDate("fecha_apertura_po"));
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
    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
            
    }//GEN-LAST:event_imprimirActionPerformed

    private void IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRActionPerformed
        // TODO add your handling code here:
        if(OrdenImp()){
           print (Integer.valueOf(imprimir.getText()));
        }else{
           oFunc.SubSistemaMensajeError("Codigo no existe"); 
        }
    }//GEN-LAST:event_IMPRIMIRActionPerformed

    private void criterio_inteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_inteligenciaActionPerformed
        // TODO add your handling code here:
        criterio_inteligencia.requestFocus();
    }//GEN-LAST:event_criterio_inteligenciaActionPerformed

    private void criterio_fobiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criterio_fobiasActionPerformed
        // TODO add your handling code here:
        criterio_fobias.requestFocus();
        
    }//GEN-LAST:event_criterio_fobiasActionPerformed

    private void analisis_foda_forta_oportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisis_foda_forta_oportActionPerformed
        // TODO add your handling code here:
        analisis_foda_amenaz_debili.requestFocus();
    }//GEN-LAST:event_analisis_foda_forta_oportActionPerformed

    private void analisis_foda_amenaz_debiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisis_foda_amenaz_debiliActionPerformed
        // TODO add your handling code here:
        observaciones.requestFocus();
    }//GEN-LAST:event_analisis_foda_amenaz_debiliActionPerformed

    private void Conclusion_aptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conclusion_aptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Conclusion_aptoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Conclusion_apto;
    private javax.swing.JButton EDITAR;
    private com.toedter.calendar.JDateChooser FechaEvaluacion;
    private javax.swing.JButton IMPRIMIR;
    private javax.swing.JTextField analisis_foda_amenaz_debili;
    private javax.swing.JTextField analisis_foda_forta_oport;
    private javax.swing.JTextField apellidos;
    private javax.swing.ButtonGroup bgAprobo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cargo;
    private javax.swing.JRadioButton conclusion_no_apto;
    private javax.swing.JTextField criterio_fobias;
    private javax.swing.JTextField criterio_inteligencia;
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
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField n_orden;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JTextArea recomendaciones;
    // End of variables declaration//GEN-END:variables
    public void limpiar() {
        n_orden.setText(null);
        recomendaciones.setText("");
        nombres.setText(null);
        apellidos.setText(null);
        edad.setText(null);
        empresa.setText(null);
        cargo.setText(null);
        grado_estudio.setText(null);
        criterio_inteligencia.setText(null);
        criterio_fobias.setText(null);
        analisis_foda_forta_oport.setText(null);
        analisis_foda_amenaz_debili.setText(null);
        observaciones.setText(null);
        recomendaciones.setText(null);
        FechaEvaluacion.setDate(null);
        bgAprobo.clearSelection();
        n_orden.setEnabled(true);
        n_orden.requestFocus();
        btnAgregar.setEnabled(true);
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
        sQuery  = "Select n_orden from fobias Where n_orden="+n_orden.getText();
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
                                "/reportes/INFORME_ADICIONAL_DE_FOBIAS.jasper";
            
            System.out.println("master" + master);
            if (master == null) 
            {                
                System.out.println("No encuentro el archivo del reporte InformePsicologico.");
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
                    + "/reportes/INFORME_ADICIONAL_DE_FOBIAS.jasper";

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
