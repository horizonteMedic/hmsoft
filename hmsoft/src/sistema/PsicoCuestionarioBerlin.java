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
        txtNorden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        FechaEntrevista = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNivelEstudios = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCargoDesempenar = new javax.swing.JTextField();
        txtOcupación = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxtObservaciones = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        atxtRecomendaciones = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtEscala = new javax.swing.JTextField();
        txtSomnolencia = new javax.swing.JTextField();
        txtIntensiad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtFortalezasO = new javax.swing.JTextField();
        txtAmenazasD = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtImprimir = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbApto = new javax.swing.JRadioButton();
        rbNoApto = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Informe Psicológico");

        jPanel5.setForeground(new java.awt.Color(102, 102, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Necesarios"));

        jLabel1.setText("Nro Orden:");

        txtNorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNordenActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombres:");

        txtNombres.setEditable(false);
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos:");

        txtApellidos.setEditable(false);

        jLabel8.setText("Edad:");

        txtEdad.setEditable(false);

        FechaEntrevista.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaEntrevistaPropertyChange(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Fecha Entrevista :");

        jLabel2.setText("Grado de Instruccion:");

        txtNivelEstudios.setEditable(false);

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
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FechaEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar)
                        .addComponent(jLabel23))
                    .addComponent(FechaEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Laborales"));

        jLabel12.setText("Empresa");

        jLabel13.setText("Cargo");

        txtCargoDesempenar.setEditable(false);

        txtOcupación.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupación, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtOcupación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        atxtObservaciones.setColumns(20);
        atxtObservaciones.setRows(5);
        atxtObservaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atxtObservacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atxtObservacionesFocusLost(evt);
            }
        });
        atxtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atxtObservacionesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(atxtObservaciones);
        atxtObservaciones.getAccessibleContext().setAccessibleName("");

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

        atxtRecomendaciones.setColumns(20);
        atxtRecomendaciones.setRows(5);
        atxtRecomendaciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                atxtRecomendacionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                atxtRecomendacionesFocusLost(evt);
            }
        });
        atxtRecomendaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                atxtRecomendacionesKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(atxtRecomendaciones);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRITERIOS PSICOLÓGICOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("1.- APNEA OBSTRUCTIVA DEL SUEÑO");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setText("2.- FATIGA Y SOMNOLENCIA");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel80.setText("3.- HIPERTENSIÓN ARTERIAL");

        txtEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscalaActionPerformed(evt);
            }
        });

        txtSomnolencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSomnolenciaActionPerformed(evt);
            }
        });

        txtIntensiad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntensiadActionPerformed(evt);
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
                    .addComponent(txtEscala)
                    .addComponent(txtSomnolencia)
                    .addComponent(txtIntensiad, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtSomnolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(txtIntensiad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ANÁLISIS FODA ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Fortalezas / Oportunidades");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Amenazas / Debilidades: ");

        txtFortalezasO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFortalezasOActionPerformed(evt);
            }
        });

        txtAmenazasD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmenazasDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFortalezasO)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAmenazasD))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel18)
                .addGap(5, 5, 5)
                .addComponent(txtFortalezasO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(5, 5, 5)
                .addComponent(txtAmenazasD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("RECOMENDACIONES");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("IMPRIMIR"));

        txtImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImprimirActionPerformed(evt);
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
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(txtImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CONCLUSIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        bgAprobo.add(rbApto);
        rbApto.setText("APTO");

        bgAprobo.add(rbNoApto);
        rbNoApto.setText("NO APTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbApto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbNoApto)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbApto)
                    .addComponent(rbNoApto))
                .addGap(0, 0, Short.MAX_VALUE))
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
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 9, Short.MAX_VALUE))))
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
                .addContainerGap())
        );

        jTabbedPane1.addTab("Informe", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarNombreExamen(){
        

    }
     public boolean OrdenImp() {

        boolean bResultado = false;
        if (!txtImprimir.getText().isEmpty()) {
            String sQuery;

            sQuery = "Select n_orden from informe_psicologico_estres Where n_orden =" + txtImprimir.getText();

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
    private void atxtRecomendacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atxtRecomendacionesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_atxtRecomendacionesKeyReleased

    private void atxtRecomendacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtRecomendacionesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_atxtRecomendacionesFocusLost

    private void atxtRecomendacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtRecomendacionesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_atxtRecomendacionesFocusGained

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String sCodigo=txtNorden.getText();
        String strSqlStmt;
        strSqlStmt="UPDATE informe_psicologico_estres\n" ;
        strSqlStmt += "   SET  "
                + "fecha='"+FechaEntrevista.getDate()+"', "
                
                + "txtescala='"+txtEscala.getText()+"', "
                + "txtsomnolencia='"+txtSomnolencia.getText()+"', "
                + "txttestfatiga='"+txtIntensiad.getText()+"', "
                + "txtfortalezaso='"+txtFortalezasO.getText()+"', "
                + "txtamenazasd='"+txtAmenazasD.getText()+"', "
                + "txtoservaciones='"+atxtObservaciones.getText()+"',"
                + "txtrecomendacion='"+atxtRecomendaciones.getText()+"', "
                + "adpto='"+rbApto.isSelected()+"', "
                + "noadpto='"+rbNoApto.isSelected()+"' "
                
                + " WHERE n_orden='" + sCodigo + "'";

        //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
        if (oConn.FnBoolQueryExecuteUpdate(strSqlStmt)) {
            oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
            imprimir(Integer.valueOf(txtNorden.getText()));
            limpiar();
            txtNorden.setEnabled(true);
            txtNorden.requestFocus();
            try {
                oConn.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(PsicoInfoConductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtNorden.getText().isEmpty()){
            if(!OrdenExiste()){
                if (validar()){
                    String Sql ="INSERT INTO informe_psicologico_estres(\n" +
"            n_orden, fecha, nombre_examen, txtescala, txtsomnolencia, txttestfatiga, \n" +
"            txtfortalezaso, txtamenazasd, txtoservaciones, txtrecomendacion, \n" +
"            adpto, noadpto)" ;
                    Sql+="Values('"+txtNorden.getText()+"','"+FechaEntrevista.getDate()+"','"
                    
                    +txtEscala.getText()+ "','"
                    +txtSomnolencia.getText()+"','"
                    +txtIntensiad.getText()+"','"
                    +txtFortalezasO.getText()+"','"
                    +txtAmenazasD.getText()+"','"
                    +atxtObservaciones.getText()+"','"
                    +atxtRecomendaciones.getText()+"','"
                    +rbApto.isSelected()+"','"
                    +rbNoApto.isSelected()+"')";
                    //oFunc.SubSistemaMensajeInformacion(Sql);
                    if (oConn.FnBoolQueryExecuteUpdate(Sql)){
                        //oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                        imprimir(Integer.valueOf(txtNorden.getText()));
                        txtNorden.setEnabled(true);
                        txtNorden.requestFocus();
                        limpiar();
                        try {
                            oConn.sqlStmt.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(PsicoInfoConductor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");}
                }else{oFunc.SubSistemaMensajeError("Ingrese Información Faltante");}
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void atxtObservacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atxtObservacionesKeyReleased
        
    }//GEN-LAST:event_atxtObservacionesKeyReleased

    private void atxtObservacionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtObservacionesFocusLost
        atxtObservaciones.setBackground(Color.WHITE);
    }//GEN-LAST:event_atxtObservacionesFocusLost

    private void atxtObservacionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_atxtObservacionesFocusGained

    }//GEN-LAST:event_atxtObservacionesFocusGained

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String Sql="select d.nombres_pa,d.apellidos_pa,"
        + "d.fecha_nacimiento_pa,d.lugar_nac_pa,"
        + "d.direccion_pa,d.estado_civil_pa,"
        + "d.nivel_est_pa,d.ocupacion_pa,"
        + "n.cargo_de,i.fecha, i.nombre_examen, i.txtescala, i.txtsomnolencia, i.txttestfatiga, \n" +
"       i.txtfortalezaso, i.txtamenazasd, i.txtoservaciones, i.txtrecomendacion, \n" +
"       i.adpto, i.noadpto "
        + "From datos_paciente as d "
        + "inner join n_orden_ocupacional as n on(d.cod_pa = n.cod_pa) "
        + "inner join informe_psicologico_estres as i on(n.n_orden = i.n_orden) "
        + "where  n.n_orden ='"+txtNorden.getText()+"'";
        oConn.FnBoolQueryExecute(Sql);
        try {
            if (oConn.setResult.next()) {
                txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
               
                txtOcupación.setText(oConn.setResult.getString("ocupacion_pa"));
                txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
               
                FechaEntrevista.setDate(oConn.setResult.getDate("fecha"));
                
                txtEscala.setText(oConn.setResult.getString("txtescala"));
                txtSomnolencia.setText(oConn.setResult.getString("txtsomnolencia"));
                txtIntensiad.setText(oConn.setResult.getString("txttestfatiga"));
                txtFortalezasO.setText(oConn.setResult.getString("txtfortalezaso"));
                txtAmenazasD.setText(oConn.setResult.getString("txtamenazasd"));
                atxtObservaciones.setText(oConn.setResult.getString("txtoservaciones"));
                atxtRecomendaciones.setText(oConn.setResult.getString("txtrecomendacion"));;
                rbApto.setSelected(oConn.setResult.getBoolean("adpto"));
                rbNoApto.setSelected(oConn.setResult.getBoolean("noadpto"));

            }else{
                oFunc.SubSistemaMensajeError("No se encuentra Registro");
            }
            oConn.setResult.close();
        } catch (SQLException ex) {
            oFunc.SubSistemaMensajeInformacion("Informe Psicologico estrés:" + ex.getMessage().toString());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void FechaEntrevistaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaEntrevistaPropertyChange
        txtNorden.requestFocus();
    }//GEN-LAST:event_FechaEntrevistaPropertyChange

    private void txtNordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNordenActionPerformed
        if(!OrdenExiste()){
            String Sql="select datos_paciente.nombres_pa,datos_paciente.apellidos_pa,"
            + "datos_paciente.fecha_nacimiento_pa,datos_paciente.lugar_nac_pa,"
            + "datos_paciente.direccion_pa,datos_paciente.estado_civil_pa,"
            + "datos_paciente.nivel_est_pa,datos_paciente.ocupacion_pa,"
            + "n_orden_ocupacional.cargo_de "
            + "From datos_paciente,n_orden_ocupacional "
            + "where datos_paciente.cod_pa = n_orden_ocupacional.cod_pa and n_orden_ocupacional.n_orden ='"+txtNorden.getText()+"'";
            oConn.FnBoolQueryExecute(Sql);
            try {
                if (oConn.setResult.next()) {
                    txtNombres.setText(oConn.setResult.getString("nombres_pa"));
                    txtApellidos.setText(oConn.setResult.getString("apellidos_pa"));
                    
                    txtNivelEstudios.setText(oConn.setResult.getString("nivel_est_pa"));
                    txtOcupación.setText(oConn.setResult.getString("ocupacion_pa"));
                    txtCargoDesempenar.setText(oConn.setResult.getString("cargo_de"));
                    
                    txtNorden.setEnabled(false);
                    oPe.fecha(FechaEntrevista);

                    
                    txtEscala.requestFocus();
                }else{
                    oFunc.SubSistemaMensajeError("No se encuentra Registro: \n 1- Intente de nuevo \n 2- Si el error sigue Registre Usuario o \n    Aperture EX-Preocupacional de new");
                }
                oConn.setResult.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Oftalmologia:" + ex.getMessage().toString());
            }
        }
    }//GEN-LAST:event_txtNordenActionPerformed

    private void txtImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImprimirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        if(OrdenImp()){
           print (Integer.valueOf(txtImprimir.getText()));
        }else{
           oFunc.SubSistemaMensajeError("Codigo no existe"); 
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscalaActionPerformed
        // TODO add your handling code here:
        txtSomnolencia.requestFocus();
    }//GEN-LAST:event_txtEscalaActionPerformed

    private void txtSomnolenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSomnolenciaActionPerformed
        // TODO add your handling code here:
        txtIntensiad.requestFocus();
        
    }//GEN-LAST:event_txtSomnolenciaActionPerformed

    private void txtIntensiadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntensiadActionPerformed
        // TODO add your handling code here:
        txtFortalezasO.requestFocus();
    }//GEN-LAST:event_txtIntensiadActionPerformed

    private void txtFortalezasOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFortalezasOActionPerformed
        // TODO add your handling code here:
        txtAmenazasD.requestFocus();
    }//GEN-LAST:event_txtFortalezasOActionPerformed

    private void txtAmenazasDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmenazasDActionPerformed
        // TODO add your handling code here:
        atxtObservaciones.requestFocus();
    }//GEN-LAST:event_txtAmenazasDActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEntrevista;
    private javax.swing.JTextArea atxtObservaciones;
    private javax.swing.JTextArea atxtRecomendaciones;
    private javax.swing.ButtonGroup bgAprobo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
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
    private javax.swing.JRadioButton rbApto;
    private javax.swing.JRadioButton rbNoApto;
    private javax.swing.JTextField txtAmenazasD;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargoDesempenar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEscala;
    private javax.swing.JTextField txtFortalezasO;
    private javax.swing.JTextField txtImprimir;
    private javax.swing.JTextField txtIntensiad;
    private javax.swing.JTextField txtNivelEstudios;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNorden;
    private javax.swing.JTextField txtOcupación;
    private javax.swing.JTextField txtSomnolencia;
    // End of variables declaration//GEN-END:variables
    public void limpiar() {
        txtNorden.setText(null);
        atxtRecomendaciones.setText("");
        txtNombres.setText(null);
        txtApellidos.setText(null);
        
        txtEdad.setText(null);
        
        txtOcupación.setText(null);
        txtCargoDesempenar.setText(null);
        txtNivelEstudios.setText(null);
        
        txtEscala.setText(null);
        txtSomnolencia.setText(null);
        txtIntensiad.setText(null);
        txtFortalezasO.setText(null);
        txtAmenazasD.setText(null);
        atxtObservaciones.setText(null);
        atxtRecomendaciones.setText(null);
        FechaEntrevista.setDate(null);
        
        bgAprobo.clearSelection();
        txtNorden.setEnabled(true);
        txtNorden.requestFocus();
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
if (((JTextField)FechaEntrevista.getDateEditor().getUiComponent()).getText().trim().length()< 2 ) 
        {oFunc.SubSistemaMensajeError("Ingrese Fecha de Entrevista");bResultado = false;}
    if(txtNorden.getText().isEmpty()){bResultado = false;}
    if(txtEdad.getText().isEmpty()){bResultado = false;}
   
    if(atxtObservaciones.getText().isEmpty()){bResultado = false;}
    
    if(!bgAprobo.getSelection().isSelected()){
        oFunc.SubSistemaMensajeError("Seleccione si aprobo o no aprobo");
        bResultado = false;}
 
   return bResultado;
}

public boolean OrdenExiste()
    {
        boolean bResultado=false;
        String sQuery;
        sQuery  = "Select n_orden from informe_psicologico_estres Where n_orden="+txtNorden.getText();
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
                parameters.put("Norden",cod);             
                

                try 
                {
                    String master = System.getProperty("user.dir") +
                                "/reportes/InformePsicologicoAdecoEstres.jasper";
            
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
        parameters.put("Norden", cod);
        try {
            String master = System.getProperty("user.dir")
                    + "/reportes/InformePsicologicoAdecoEstres.jasper";

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
