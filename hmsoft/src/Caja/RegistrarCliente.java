package Caja;

import Clases.DisableSSLVerification;
import Clases.GestorTime;
import Clases.clsConnection;
import Clases.clsFunciones;
import autocomplete.ajTextField;
import autocomplete.ajTextFieldConsulta;
import autocomplete.ajTextFieldInteger;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import sistema.Audiometria;
import sistema.Ingreso;
import static sistema.Ingreso.nombresede;
import sistema.Odontograma;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.Icon;
import net.sf.jasperreports.engine.JasperPrintManager;
//import org.apache.axis.AxisProperties;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Richard García Zárate
 */
public final class RegistrarCliente extends javax.swing.JInternalFrame {

    clsFunciones oFunc = new clsFunciones();
    clsConnection oConn1 = new clsConnection();
    Ingreso objet = new Ingreso();
    String urlfotoreniec = "";
    String nomsede, rucempresa, nombreempresa, ruccontrata, nombrecontrata;
    int codigosede, pkprotocolo, codigo_norden, operacion;
    public static AddOcupacion addOcupacion;
    public static AgregarEmpresa addEmpresa;
    public static AgregarProtocolo addProtocolo;
    public static AgregarContrata addContrata;
    public static AddCargos addExEn;
    public static AddArea addExmedico;
    public static AddMineralEx addMineralEx;
    public static AddAlturaPo addAlturaPo;
    public static VerUltimoRegistro verUltimoRegistro;
    public static addAreaOcupacioal areaOcupacional;
    String num, agregarConsulta = "";

    String dni;
    DefaultTableModel model;
    // String[]empresas = new String[]{};
    // String[]contratas = new String[]{};

    public RegistrarCliente() {
        super();
        initComponents();

        fecha();
        jtRegistroGeneral.setIconAt(0, new ImageIcon(ClassLoader.getSystemResource("imagenes/agegar.png")));
        jtRegistroGeneral.setIconAt(1, new ImageIcon(ClassLoader.getSystemResource("imagenes/reportes.png")));
        deshabilitar();
        AltaDesabilitar();
        deshabilitarbotones();
        CargarServicios();
        valorsede();
        CargarProfesionOcupacion();
        cboProfesion.setSelectedIndex(-1);
        CargarAlturaPo();
        CargarExplotacion();
        CargarMineralEx();
        CargarAreaOcupacional();
        cargarEmpresas();
//        new ajTextField.autocompleterText(txtEmpresa, "razon_empresa", "empresas");
//        new ajTextField.autocompleterText(txtContrata, "razon_contrata", "contratas");
        new ajTextField.autocompleterText(txtCargoDesempenar, "ocupacion_pa", "ocupaciones_pa");
        new ajTextFieldConsulta.autocompleterText(txtMedico, "select nombre_user||' '||apellido_user as nombre FROM usuarios WHERE CONCAT(nombre_user,' ',apellido_user)");
        new ajTextFieldInteger.autocompleterText(txtDniAlta, "cod_pa", "datos_paciente");
        AutoCompleteDecorator.decorate(this.cboProfesion);
        AutoCompleteDecorator.decorate(this.cboDepartamento);
        AutoCompleteDecorator.decorate(this.cboProvincia);
        AutoCompleteDecorator.decorate(this.cboDistrito);
        AutoCompleteDecorator.decorate(this.cboSexo);
        AutoCompleteDecorator.decorate(this.cboEstadoCivil);
        AutoCompleteDecorator.decorate(this.cboNivelEstudio);
        AutoCompleteDecorator.decorate(this.cboExamenMedico);
        AutoCompleteDecorator.decorate(this.cboMineralExp);
        AutoCompleteDecorator.decorate(this.cboExplotacion);
        AutoCompleteDecorator.decorate(this.cboAltura);
        AutoCompleteDecorator.decorate(this.cboArea);
        AutoCompleteDecorator.decorate(this.cboEmpresa);
        AutoCompleteDecorator.decorate(this.cboFormaPago);
        cboMineralExp.setSelectedIndex(-1);
        cboExplotacion.setSelectedIndex(-1);
        cboAltura.setSelectedIndex(-1);
        cboArea.setSelectedIndex(-1);
        cboFormaPago.setSelectedIndex(-1);
        btnAgregar.setEnabled(false);
        timer.start();
        cboExamenMedico.setSelectedIndex(-1);
        sbCargarOcupacional("");
        txtNumColor.setText("1");
        hBotones(false);
        CargarTipoExamenes();
//        ocultarOpcionesCovid();
//        autorizarCertificado();
        CargarinfoHotel();
        cargarContratas();

        cargarProtocolos();
        AutoCompleteDecorator.decorate(this.jComboBoxProtocolos);
        AutoCompleteDecorator.decorate(this.cboAutorizacion);
        cboAutorizacion.setSelectedIndex(-1);
        cboEmpresa.setSelectedIndex(-1);
        cboContrata.setSelectedIndex(-1);

        // valorsede();
        AutoCompleteDecorator.decorate(this.cboContrata);
        //   AutoCompleteDecorator.decorate(this.cboEmpresas);
        // cboContratas.setVisible(false);
        // cboEmpresas.setVisible(false);
        //  txtEmpresa.setVisible(false);
        //txtContrata.setVisible(false);

    }
    
    public void autorizarCertificado() {

        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

                public void checkClientTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {

                }

                public void checkServerTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                }
            }
        };

// Install the all-trusting trust manager 
        try {
            SSLContext sc = SSLContext.getInstance("ssl");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (GeneralSecurityException e) {
        }
        // Now you can access an https URL without having the certificate in the truststore 
        try {
            URL url = new URL("https://api.reniec.cloud/dni/");
        } catch (MalformedURLException e) {
        }
    }

    private void calcularProtocolos() {
        try {
            String sQuery;
            // Prepara el Query
            sQuery = "select idprotocolo from protocolo where nombreprotocolo='" + jComboBoxProtocolos.getSelectedItem() + "'";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {
                        // Obtiene los datos de la Consulta
                        pkprotocolo = oConn1.setResult.getInt("idprotocolo");

                    }

                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeInformacion(ex.toString());
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void spFuncionHistorialClienteProtocolo() {

        String sql = "select spFuncionHistorialClienteProtocolo(" + num + "," + pkprotocolo + ","
                + operacion + ")";
        oConn1.FnBoolQueryExecute(sql);
        System.out.println(sql);
        operacion = 0;
        try {
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void funcion3() {
        try {
            String url = "https://servicios.innovated.xyz/reniec/api/reniec?dni=" + txtDni.getText().toString();
            String name = "java2novice";
            String password = "Simple4u!";
            String authString = name + ":" + password;

            Client restClient = Client.create();
            WebResource webResource = restClient.resource(url);
            ClientResponse resp = webResource.accept("application/json")
                    .header("Authorization", "MVG0102TOM20")
                    .get(ClientResponse.class);
            if (resp.getStatus() != 200) {
                System.err.println("Unable to connect to the server");
            }
            String output = resp.getEntity(String.class);

            // String result = IOUtils.toString(in, "UTF-8");
            JSONObject myResponse = new JSONObject(output);
            //   System.out.println("el resultado:"+myResponse);
            JSONObject myResponse2 = myResponse.getJSONObject("result");

            // System.out.println("RESPUESTA es: "+myResponse2.toString());
            //   codeee=myResponse2.get("code").toString();
            // System.out.println("apellidos paterno: "+myResponse.get("apellido_paterno").toString().replace("&Uuml;","Ü") );
            // System.out.println("apellidos materno: "+myResponse.get("apellido_materno").toString().replace("&Uuml;","Ü") );
            // System.out.println("nombres: "+myResponse.get("nombres").toString().replace("&Uuml;","Ü") );
            txtNombre.setText(myResponse2.get("preNombres").toString());
            txtApellidos.setText(myResponse2.get("apePaterno").toString() + " " + myResponse2.get("apeMaterno").toString());
//            FechaNacimiento.setDate(ParseFecha(myResponse2.get("feNacimiento").toString()));
//            cboSexo.setSelectedItem(myResponse2.get("sexo").toString());
//            txtLugarNacimiento.setText(myResponse2.get("departamento").toString()+"-"+myResponse2.get("provincia").toString());
//            cboNivelEstudio.setSelectedItem(myResponse2.get("gradoInstruccion").toString());
//            cboEstadoCivil.setSelectedItem(myResponse2.get("estadoCivil").toString());
//            txtDireccion.setText(myResponse2.get("desDireccion").toString());
//            cboDepartamento.setSelectedItem(myResponse2.get("depaDireccion").toString());
//            cboProvincia.setSelectedItem(myResponse2.get("provDireccion").toString());
//            cboDistrito.setSelectedItem(myResponse2.get("distDireccion").toString());    
            // JSONObject myResponse3 = myResponse2.getJSONObject("imagenes");
            //    urlfotoreniec=myResponse3.get("foto").toString();
//System.out.println("response: "+output);
            // Image image = null;

            //URL url1 = new URL(urlfotoreniec);
            //         try {
            //           image = ImageIO.read(url1);
            //          Icon icon = new ImageIcon(image);
            //                     jLabel49.setIcon(icon);
            //    } catch (IOException ex) {
            //       Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            //   }
        } catch (JSONException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public void comunirApiReniecDesconocida() {

        String query_url = "https://api.reniec.cloud/dni/" + txtDni.getText();
        String codeee = "", json = "";
        //   System.out.println("el codigo json es: "+json);
        try {
//AxisProperties.setProperty("axis.socketSecureFactory","org.apache.axis.components.net.SunFakeTrustSocketFactory");

            URL url = new URL(query_url);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setDoOutput(true);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");
            String input = json;
            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            InputStream in = new BufferedInputStream(conn.getInputStream());
            String result = IOUtils.toString(in, "UTF-8");
            JSONObject myResponse = new JSONObject(result);
            //   System.out.println("el resultado:"+myResponse);
            // JSONObject myResponse2 = myResponse.getJSONObject("data");
            // System.out.println("RESPUESTA es: "+myResponse2.toString());
            //   codeee=myResponse2.get("code").toString();
            // System.out.println("apellidos paterno: "+myResponse.get("apellido_paterno").toString().replace("&Uuml;","Ü") );
            // System.out.println("apellidos materno: "+myResponse.get("apellido_materno").toString().replace("&Uuml;","Ü") );
            // System.out.println("nombres: "+myResponse.get("nombres").toString().replace("&Uuml;","Ü") );
            txtNombre.setText(limpiarCaracteresEspeciales(myResponse.get("nombres").toString()));
            txtApellidos.setText(limpiarCaracteresEspeciales(myResponse.get("apellido_paterno").toString() + " " + myResponse.get("apellido_materno").toString()));
            // resultado=myResponse2.get("message").toString();
            //  insertar(a2,a3,codeee,resultado);
            // System.out.println("el resultado:"+resultado);

            in.close();
            conn.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String limpiarCaracteresEspeciales(String data) {

//System.out.println("la data es:"+data);
        String retornar = "";
        retornar = data.replace("&Uuml;", "Ü");
//System.out.println("la retornar es:"+retornar);
        retornar = retornar.replace("&Ntilde;", "Ñ");

        return retornar;
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
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            agregarConsulta = " and n.cod_sede=" + codigosede;
            agregarConsulta += " ";
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void hBotones(boolean btn) {
        BtnActualizarEx.setVisible(btn);
        // BtnEditarEx.setEnabled(btn);
        BtnEditarEx.setVisible(btn);
        btnGuardarAperturar.setVisible(!btn);

    }

    public void MostrarAddAreaOcupacional() {
        areaOcupacional = new addAreaOcupacioal(this, true);
        areaOcupacional.setVisible(true);

    }

    public void MostrarAddArea() {
        addExmedico = new AddArea(this, true);
        addExmedico.setVisible(true);

    }

    public void MostrarAddCargos() {
        addExEn = new AddCargos(this, true);
        addExEn.setVisible(true);

    }

    public void MostrarUltimoRegistro() {
        verUltimoRegistro = new VerUltimoRegistro(this, true);
        verUltimoRegistro.setVisible(true);

    }

    public void MostrarAddMineralEx() {
        addMineralEx = new AddMineralEx(this, true);
        addMineralEx.setVisible(true);

    }

    public void MostrarAddAlturaPo() {
        addAlturaPo = new AddAlturaPo(this, true);
        addAlturaPo.setVisible(true);

    }

    public void MostrarAddOcupacion() {
        addOcupacion = new AddOcupacion(this, true);
        addOcupacion.setVisible(true);

    }

    public void MostrarEmpresa() {
        addEmpresa = new AgregarEmpresa(this, true);
        addEmpresa.setVisible(true);
    }

    public void MostrarContrata() {
        addContrata = new AgregarContrata(this, true);
        addContrata.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        btGS = new javax.swing.ButtonGroup();
        bgFS = new javax.swing.ButtonGroup();
        jtRegistroGeneral = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cboSexo = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        txtLugarNacimiento = new javax.swing.JTextField();
        cboNivelEstudio = new javax.swing.JComboBox();
        cboProfesion = new javax.swing.JComboBox();
        cboEstadoCivil = new javax.swing.JComboBox();
        txtDireccion = new javax.swing.JTextField();
        cboDepartamento = new javax.swing.JComboBox();
        cboProvincia = new javax.swing.JComboBox();
        cboDistrito = new javax.swing.JComboBox();
        cboCaserio = new javax.swing.JComboBox();
        txtTelefonoCasa = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnAddOcupacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ckbSinDni = new javax.swing.JCheckBox();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtCaserio = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtHistorial = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtContrata = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnAddOcupacion1 = new javax.swing.JLabel();
        btnAddOcupacion2 = new javax.swing.JLabel();
        cboEmpresa = new javax.swing.JComboBox<>();
        cboContrata = new javax.swing.JComboBox<>();
        jpOcupacional = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cboExamenMedico = new javax.swing.JComboBox();
        btnMineralEx = new javax.swing.JLabel();
        cboExplotacion = new javax.swing.JComboBox();
        cboMineralExp = new javax.swing.JComboBox();
        cboAltura = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        chkPrecio = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtFechaAlta = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtCargoDesempenar = new javax.swing.JTextField();
        btnAreaOcupacional = new javax.swing.JLabel();
        btnCargo = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtObserv1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtObserv2 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        cboFormaPago = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        chkAltaFist = new javax.swing.JCheckBox();
        chkAltaPsicosen = new javax.swing.JCheckBox();
        chkAltaTestAltura = new javax.swing.JCheckBox();
        chkAltaTrabCal = new javax.swing.JCheckBox();
        chkAltaVisualCom = new javax.swing.JCheckBox();
        chkAltaManipAlimen = new javax.swing.JCheckBox();
        jLabel51 = new javax.swing.JLabel();
        txtPrecioAdicional = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        cboAutorizacion = new javax.swing.JComboBox();
        jComboBoxProtocolos = new javax.swing.JComboBox<>();
        btnAddOcupacion3 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtNOperacion = new javax.swing.JTextField();
        chkAltaHerrMan = new javax.swing.JCheckBox();
        chkAltaRXCLumba = new javax.swing.JCheckBox();
        chkAltaRXCDorso = new javax.swing.JCheckBox();
        chkAltaRXCLumbo = new javax.swing.JCheckBox();
        chkAltaPlomoS = new javax.swing.JCheckBox();
        chkAltaMercO = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtNombresAlta = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtApellidosAlta = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnGuardarAperturar = new javax.swing.JButton();
        btnLimpiarApertura = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOcupacional = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        txtNorden = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtMedico = new javax.swing.JTextField();
        txtDniAlta = new javax.swing.JTextField();
        BtnEditarEx = new javax.swing.JButton();
        BtnActualizarEx = new javax.swing.JButton();
        txtGS = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtGrupoSan = new javax.swing.JTextField();
        txtFactorSan = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtBuscarCod = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cboTipoExamen = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxHotel = new javax.swing.JComboBox<>();
        jCheckBox11 = new javax.swing.JCheckBox();
        chkimport = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        txtNumColor = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        txtNorden1 = new javax.swing.JTextField();
        btnLimpiar1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Pacientes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnCerrar.setMnemonic('c');
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        btnGrabar.setMnemonic('g');
        btnGrabar.setText("Grabar");
        btnGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGrabarMouseClicked(evt);
            }
        });
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel12.setText("(*)Prof / Ocupación:");

        jLabel11.setText("(*)Nivel Estudio:");

        jLabel10.setText("(*)Lugar Nacimiento:");

        jLabel8.setText("Email:");

        jLabel7.setText("(*)Sexo:");

        jLabel6.setText("(*)Fecha Nacimiento:");

        jLabel2.setText("(*)Dirección Habitual :");

        jLabel1.setText("(*)Nombres :");

        jLabel13.setText("Estado Civil:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cboSexo.setEditable(true);
        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));
        cboSexo.setSelectedIndex(-1);
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtLugarNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarNacimientoActionPerformed(evt);
            }
        });

        cboNivelEstudio.setEditable(true);
        cboNivelEstudio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANALFABETO", "PRIMARIA COMPLETA", "PRIMARIA INCOMPLETA", "SECUNDARIA COMPLETA", "SECUNDARIA INCOMPLETA", "UNIVERSITARIO", "TECNICO" }));
        cboNivelEstudio.setSelectedIndex(-1);
        cboNivelEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelEstudioActionPerformed(evt);
            }
        });

        cboProfesion.setEditable(true);
        cboProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProfesionActionPerformed(evt);
            }
        });

        cboEstadoCivil.setEditable(true);
        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO", "CONVIVIENTE" }));
        cboEstadoCivil.setSelectedIndex(-1);
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        cboDepartamento.setEditable(true);
        cboDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMAZONAS", "CAJAMARCA", "TUMBES", "LORETO", "PIURA", "LAMBAYEQUE", "SAN MARTIN", "LA LIBERTAD", "UCAYALI", "ANCASH", "HUANUCO", "PASCO", "JUNIN", "LIMA", "HUANCAVELICA", "AYACUCHO", "ICA", "AREQUIPA", "MOQUEGUA", "MADRE DE DIOS", "CUSCO", "APURIMAC", "PUNO", "TACNA" }));
        cboDepartamento.setSelectedIndex(-1);
        cboDepartamento.setToolTipText("");
        cboDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDepartamentoItemStateChanged(evt);
            }
        });
        cboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartamentoActionPerformed(evt);
            }
        });

        cboProvincia.setEditable(true);
        cboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciaItemStateChanged(evt);
            }
        });
        cboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProvinciaActionPerformed(evt);
            }
        });

        cboDistrito.setEditable(true);
        cboDistrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cboDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDistritoActionPerformed(evt);
            }
        });

        cboCaserio.setEditable(true);
        cboCaserio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        txtTelefonoCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoCasaActionPerformed(evt);
            }
        });

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel20.setText("(*)DNI /LM:");

        btnAddOcupacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacionMouseClicked(evt);
            }
        });

        jLabel3.setText("Casa:");

        jLabel5.setText("Celular:");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telefono.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/celular.png"))); // NOI18N

        jLabel24.setText("    (*)Departameto:");

        jLabel25.setText(" (*)   Provincia:");

        jLabel26.setText("    Distrito:");

        jLabel27.setText("    Caserio:");

        ckbSinDni.setText("Sin DNI");
        ckbSinDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSinDniActionPerformed(evt);
            }
        });

        FechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaNacimientoPropertyChange(evt);
            }
        });

        jLabel14.setText("(*)Apellidos:");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaActionPerformed(evt);
            }
        });

        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        txtCaserio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaserioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel24)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cboCaserio, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                            .addComponent(cboDistrito, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                            .addComponent(cboProvincia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProvincia)
                                            .addComponent(txtDistrito)
                                            .addComponent(txtCaserio)))
                                    .addComponent(cboDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 251, Short.MAX_VALUE)
                                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(5, 5, 5)
                                .addComponent(ckbSinDni)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboNivelEstudio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboProfesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jLabel20))
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtTelefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel1)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel14)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel20)
                                .addComponent(ckbSinDni)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNivelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(btnAddOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel24))
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel26))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel27))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboCaserio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCaserio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTelefonoCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel23))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5))
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        btnEditar.setMnemonic('e');
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnAgregar.setMnemonic('a');
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtHistorial.setEditable(false);
        txtHistorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHistorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHistorial.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "N° Historial"));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnNuevo.setMnemonic('n');
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnLimpiar.setMnemonic('l');
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imagen"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camactualizar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel34.setText("Fecha Registro:");

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel40.setText("Hora Registro:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(873, 873, 873)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(txtHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar)
                                        .addGap(11, 11, 11)
                                        .addComponent(btnLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGrabar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCerrar))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 125, Short.MAX_VALUE))
        );

        jtRegistroGeneral.addTab("Registro Clientes en General", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(377, 83));
        jPanel2.setMinimumSize(new java.awt.Dimension(377, 83));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Empresa :");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        txtEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpresaMouseClicked(evt);
            }
        });
        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });
        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyReleased(evt);
            }
        });

        txtContrata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrataMouseClicked(evt);
            }
        });
        txtContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrataActionPerformed(evt);
            }
        });
        txtContrata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrataKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Contrata :");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        btnAddOcupacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacion1MouseClicked(evt);
            }
        });

        btnAddOcupacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacion2MouseClicked(evt);
            }
        });

        cboEmpresa.setEditable(true);
        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });

        cboContrata.setEditable(true);
        cboContrata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboContrataMouseClicked(evt);
            }
        });
        cboContrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboContrataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContrata)
                    .addComponent(txtEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEmpresa, 0, 442, Short.MAX_VALUE)
                    .addComponent(cboContrata, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOcupacion1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddOcupacion2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddOcupacion1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAddOcupacion2)
                            .addComponent(txtContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(cboContrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15))
                .addGap(5, 5, 5))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 540, 60));

        jpOcupacional.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Área  Pre- Ocupacional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Explotación en :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Altura :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Mineral Exp. :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Tipo Examen :");

        cboExamenMedico.setEditable(true);
        cboExamenMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboExamenMedico.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboExamenMedicoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboExamenMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboExamenMedicoActionPerformed(evt);
            }
        });

        btnMineralEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnMineralEx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMineralExMouseClicked(evt);
            }
        });

        cboExplotacion.setEditable(true);
        cboExplotacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboExplotacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboExplotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboExplotacionActionPerformed(evt);
            }
        });

        cboMineralExp.setEditable(true);
        cboMineralExp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboMineralExpPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboMineralExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMineralExpActionPerformed(evt);
            }
        });

        cboAltura.setEditable(true);
        cboAltura.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboAlturaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAlturaActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel43.setText("Precio Exa.Médico :");

        txtPrecio.setEditable(false);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        chkPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPrecioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha Apertura:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Area :");

        cboArea.setEditable(true);
        cboArea.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboAreaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cargo  :");

        txtCargoDesempenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoDesempenarActionPerformed(evt);
            }
        });

        btnAreaOcupacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAreaOcupacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAreaOcupacionalMouseClicked(evt);
            }
        });

        btnCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargoMouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("Observ.1 :");

        txtObserv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObserv1ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Observ.2 :");

        txtObserv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObserv2ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Forma pago:");

        cboFormaPago.setEditable(true);
        cboFormaPago.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cboFormaPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CONTADO", "CREDITO", "TRANSFERENCIA O DEPOSITO", "YAPE", "PLIN", "DESCONOCE" }));
        cboFormaPago.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboFormaPagoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboFormaPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboFormaPagoMouseClicked(evt);
            }
        });
        cboFormaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFormaPagoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Exa. Adicional :");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });

        chkAltaFist.setText("FIST-TEST");
        chkAltaFist.setToolTipText("FIST-TEST");
        chkAltaFist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chkAltaFistMousePressed(evt);
            }
        });
        chkAltaFist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaFistActionPerformed(evt);
            }
        });

        chkAltaPsicosen.setText("PSICOSEN");
        chkAltaPsicosen.setToolTipText("PSICOSENSOMETRIA");
        chkAltaPsicosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaPsicosenActionPerformed(evt);
            }
        });

        chkAltaTestAltura.setText("T. ALTURA");
        chkAltaTestAltura.setToolTipText("TEST ALTURA");
        chkAltaTestAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaTestAlturaActionPerformed(evt);
            }
        });

        chkAltaTrabCal.setText("T. CAL");
        chkAltaTrabCal.setToolTipText("TRABAJOS EN CALIENTE");
        chkAltaTrabCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaTrabCalActionPerformed(evt);
            }
        });

        chkAltaVisualCom.setText("VIS. COMPL");
        chkAltaVisualCom.setToolTipText("VISUAL COMPLEMENTARIO");
        chkAltaVisualCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaVisualComActionPerformed(evt);
            }
        });

        chkAltaManipAlimen.setText("M.ALIM.");
        chkAltaManipAlimen.setToolTipText("MANIPULADOR DE ALIMENTOS");
        chkAltaManipAlimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaManipAlimenActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel51.setText("Precio Exa.Adicional :");

        txtPrecioAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioAdicionalActionPerformed(evt);
            }
        });
        txtPrecioAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioAdicionalKeyTyped(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel52.setText("Autorizado por:");

        cboAutorizacion.setEditable(true);
        cboAutorizacion.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        cboAutorizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CORREO DE EMPRESA", "WHATSAPP DE EMPRESA", "CELULAR EMPRESA", "CARLOS", "DR. ARTEMIO", "LEONARDO", "LILIANA", "KASANDRA", "OTRO" }));
        cboAutorizacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboAutorizacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboAutorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAutorizacionActionPerformed(evt);
            }
        });

        jComboBoxProtocolos.setBackground(new java.awt.Color(255, 102, 102));
        jComboBoxProtocolos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Protocolo" }));

        btnAddOcupacion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAddOcupacion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddOcupacion3MouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("Protocolo :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel54.setText("N° Operación");

        txtNOperacion.setEnabled(false);
        txtNOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOperacionActionPerformed(evt);
            }
        });
        txtNOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNOperacionKeyTyped(evt);
            }
        });

        chkAltaHerrMan.setText("H.MAN");
        chkAltaHerrMan.setToolTipText("HERRAMIENTAS MANUALES");
        chkAltaHerrMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaHerrManActionPerformed(evt);
            }
        });

        chkAltaRXCLumba.setText("RX.C.LUMBA");
        chkAltaRXCLumba.setToolTipText("RX COLUMNA LUMBAR F y L ");
        chkAltaRXCLumba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaRXCLumbaActionPerformed(evt);
            }
        });

        chkAltaRXCDorso.setText("RX.C.DORSO");
        chkAltaRXCDorso.setToolTipText("RX COLUMNA DORSOLUMBAR F y L");
        chkAltaRXCDorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaRXCDorsoActionPerformed(evt);
            }
        });

        chkAltaRXCLumbo.setText("RX.C.LUMBO");
        chkAltaRXCLumbo.setToolTipText("RX COLUMNA  LUMBOSACRA F y L ");
        chkAltaRXCLumbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaRXCLumboActionPerformed(evt);
            }
        });

        chkAltaPlomoS.setText("PLOMO S.");
        chkAltaPlomoS.setToolTipText("PLOMO EN SANGRE");
        chkAltaPlomoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaPlomoSActionPerformed(evt);
            }
        });

        chkAltaMercO.setText("MER.O");
        chkAltaMercO.setToolTipText("MERCURIO EN ORINA");
        chkAltaMercO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAltaMercOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpOcupacionalLayout = new javax.swing.GroupLayout(jpOcupacional);
        jpOcupacional.setLayout(jpOcupacionalLayout);
        jpOcupacionalLayout.setHorizontalGroup(
            jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel30))
                                .addGap(2, 2, 2))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcupacionalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAltaRXCLumba)
                            .addComponent(chkAltaRXCLumbo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcupacionalLayout.createSequentialGroup()
                        .addComponent(cboExplotacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcupacionalLayout.createSequentialGroup()
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboExamenMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMineralExp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboAltura, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboArea, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(3, 3, 3)
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMineralEx)
                            .addComponent(btnAreaOcupacional, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargo))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOcupacionalLayout.createSequentialGroup()
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxProtocolos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtObserv2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObserv1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddOcupacion3)
                        .addContainerGap())
                    .addGroup(jpOcupacionalLayout.createSequentialGroup()
                        .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNOperacion))
                            .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                    .addComponent(chkAltaFist)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkAltaPsicosen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkAltaTestAltura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkAltaTrabCal))
                                .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrecioAdicional, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                    .addGap(1, 1, 1)
                                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                            .addComponent(chkPrecio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel50)
                                            .addGap(2, 2, 2)
                                            .addComponent(cboFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(cboAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkAltaVisualCom)
                                        .addComponent(chkAltaPlomoS))
                                    .addGap(0, 0, 0)
                                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkAltaMercO)
                                        .addGroup(jpOcupacionalLayout.createSequentialGroup()
                                            .addComponent(chkAltaManipAlimen)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chkAltaHerrMan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chkAltaRXCDorso))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpOcupacionalLayout.setVerticalGroup(
            jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOcupacionalLayout.createSequentialGroup()
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCargo)
                    .addComponent(txtCargoDesempenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(btnAreaOcupacional))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboExamenMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(chkAltaFist, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaPsicosen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaTestAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaTrabCal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAltaVisualCom, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaManipAlimen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaHerrMan, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaRXCDorso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaRXCLumbo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAltaRXCLumba, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaPlomoS, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAltaMercO, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboExplotacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnMineralEx)
                    .addComponent(cboMineralExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(2, 2, 2)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(3, 3, 3)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(cboAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtObserv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtObserv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOcupacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxProtocolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53))
                    .addComponent(btnAddOcupacion3))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel6.add(jpOcupacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 207, 430, 390));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("DNI :");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Nombres :");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, -1, -1));

        txtNombresAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresAltaActionPerformed(evt);
            }
        });
        txtNombresAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresAltaKeyReleased(evt);
            }
        });
        jPanel6.add(txtNombresAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Apellidos :");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        txtApellidosAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosAltaActionPerformed(evt);
            }
        });
        txtApellidosAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosAltaKeyReleased(evt);
            }
        });
        jPanel6.add(txtApellidosAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha y Hora"));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel38.setText("Hora :");

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel36.setText("Fecha :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 2, -1, 58));

        btnGuardarAperturar.setBackground(new java.awt.Color(0, 255, 255));
        btnGuardarAperturar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarAperturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agegar.png"))); // NOI18N
        btnGuardarAperturar.setText("Agregar");
        btnGuardarAperturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAperturarActionPerformed(evt);
            }
        });
        jPanel6.add(btnGuardarAperturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, 40));

        btnLimpiarApertura.setBackground(java.awt.Color.yellow);
        btnLimpiarApertura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarApertura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarApertura.setText("Limpiar");
        btnLimpiarApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAperturaActionPerformed(evt);
            }
        });
        jPanel6.add(btnLimpiarApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 110, 40));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 0, -1, 600));

        tbOcupacional.setModel(new javax.swing.table.DefaultTableModel(
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
        tbOcupacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbOcupacionalMousePressed(evt);
            }
        });
        tbOcupacional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbOcupacionalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbOcupacionalKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbOcupacional);

        jTabbedPane1.addTab("Ultimos Agregados & Hoja de Ruta", jScrollPane1);

        jPanel6.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 86, 700, 510));

        jLabel4.setText("Nombre :");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 64, -1, -1));

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
        jPanel6.add(txtBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 332, -1));

        txtNorden.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNorden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNorden.setText("0");
        txtNorden.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nro de Orden"));
        jPanel6.add(txtNorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 110, 63));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Medico Ocupacional a cargo del Examen :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMedicoMouseClicked(evt);
            }
        });
        txtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoActionPerformed(evt);
            }
        });
        txtMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedicoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(txtMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, -1));

        txtDniAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniAltaActionPerformed(evt);
            }
        });
        txtDniAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniAltaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniAltaKeyTyped(evt);
            }
        });
        jPanel6.add(txtDniAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 2, 98, -1));

        BtnEditarEx.setBackground(new java.awt.Color(51, 102, 0));
        BtnEditarEx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEditarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        BtnEditarEx.setText("Habilitar");
        BtnEditarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarExActionPerformed(evt);
            }
        });
        jPanel6.add(BtnEditarEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 110, 40));

        BtnActualizarEx.setBackground(new java.awt.Color(204, 153, 0));
        BtnActualizarEx.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizarEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar.png"))); // NOI18N
        BtnActualizarEx.setText("Actualizar");
        BtnActualizarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarExActionPerformed(evt);
            }
        });
        jPanel6.add(BtnActualizarEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 110, 40));

        txtGS.setEditable(false);
        txtGS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGSActionPerformed(evt);
            }
        });
        jPanel6.add(txtGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 2, 58, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("G.Sang.");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        txtGrupoSan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(txtGrupoSan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 39, -1));

        txtFactorSan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(txtFactorSan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 26, -1));

        jLabel41.setText("Codigo:");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 64, -1, -1));

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
        jPanel6.add(txtBuscarCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 60, 69, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sede Clinica"));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, 50));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("--");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 130, 40));

        cboTipoExamen.setEditable(true);
        cboTipoExamen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
        cboTipoExamen.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboTipoExamenPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboTipoExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboTipoExamenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboTipoExamenMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboTipoExamenMousePressed(evt);
            }
        });
        cboTipoExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoExamenActionPerformed(evt);
            }
        });
        cboTipoExamen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboTipoExamenKeyPressed(evt);
            }
        });
        jPanel6.add(cboTipoExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 152, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("TIPO PRUEBA");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, 20));

        jComboBoxHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A" }));
        jPanel6.add(jComboBoxHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 124, -1));

        jCheckBox11.setText("Solo mi sede");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 24, -1, -1));

        btGS.add(chkimport);
        chkimport.setText("Importar");
        chkimport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkimportActionPerformed(evt);
            }
        });
        jPanel6.add(chkimport, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 7, -1, 15));

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(0, 0, 153));
        jCheckBox12.setText("REGISTRO RAPIDO");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));
        jPanel6.add(txtNumColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 42, 24));

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("SINCRONIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, -1, -1));

        jtRegistroGeneral.addTab("Aperturar Examenes Pre - Ocupacionales", jPanel6);

        jLabel45.setText("Nro Orden :");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Examenes"));

        jCheckBox1.setText("Lab.Clinico");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Electrocardiograma");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Audiologia");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("Audiometria");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Espirometria");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Rayos X");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Certificado de Altura");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Odontologia");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("Oftalmologia");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("Psicologia");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        txtNorden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNorden1ActionPerformed(evt);
            }
        });

        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNorden1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1196, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNorden1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(btnLimpiar1))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jtRegistroGeneral.addTab("Examenes que no pasa paciente ", jPanel10);

        getContentPane().add(jtRegistroGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 2, 1280, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartamentoActionPerformed

        cboDepartamento.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtProvincia.requestFocus();
            }
        });
    }//GEN-LAST:event_cboDepartamentoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtApellidos.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        cboSexo.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtEmail.requestFocus();
            }
        });
    }//GEN-LAST:event_cboSexoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtLugarNacimiento.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cboNivelEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelEstudioActionPerformed
        cboNivelEstudio.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cboProfesion.requestFocus();
            }
        });
    }//GEN-LAST:event_cboNivelEstudioActionPerformed

    private void txtLugarNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarNacimientoActionPerformed
        cboNivelEstudio.requestFocus();
    }//GEN-LAST:event_txtLugarNacimientoActionPerformed

    private void cboProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProfesionActionPerformed
        cboProfesion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // departamentos();
                cboEstadoCivil.requestFocus();
            }
        });
    }//GEN-LAST:event_cboProfesionActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // txtTelefonoCasa.requestFocus();
        cboEstadoCivil.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                 departamentos();
                txtTelefonoCasa.requestFocus();
            }
        });
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void txtTelefonoCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoCasaActionPerformed
        txtCelular.requestFocus();
    }//GEN-LAST:event_txtTelefonoCasaActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        cboDepartamento.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void cboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProvinciaActionPerformed
        departamentos();
        cboProvincia.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboDistrito.requestFocus();
            }
        });
    }//GEN-LAST:event_cboProvinciaActionPerformed

    private void cboDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDistritoActionPerformed
//        departamentos();
        cboDistrito.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cboCaserio.requestFocus();
            }
        });
    }//GEN-LAST:event_cboDistritoActionPerformed

    private void cboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciaItemStateChanged

    }//GEN-LAST:event_cboProvinciaItemStateChanged

    private void cboDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDepartamentoItemStateChanged
        // cboProvincia.removeAllItems();
        //departamentos();
    }//GEN-LAST:event_cboDepartamentoItemStateChanged

    private void ckbSinDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSinDniActionPerformed
        if (ckbSinDni.isSelected()) {

            txtDni.setEnabled(false);
            CargarProfesionOcupacion();
            habilitar();
            limpiar();
            deshabilitarbotones();
            generarcod();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(true);

        } else {
            btnAgregar.setEnabled(false);
            txtDni.setEnabled(true);
            limpiar();
            deshabilitar();
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_ckbSinDniActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        deshabilitar();
        btnEditar.setEnabled(false);
        btnGrabar.setEnabled(false);
        btnAgregar.setEnabled(false);
        ckbSinDni.setEnabled(true);
        txtHistorial.setVisible(false);
        txtDni.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitar();
        btnGrabar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    public void cboOcupacion(String Ocupacion) {
        cboProfesion.setSelectedItem(Ocupacion);
    }

    public void cboMineral(String Ocupacion) {
        cboMineralExp.setSelectedItem(Ocupacion);
    }

    public void txtCargo(String Ocupacion) {
        txtCargoDesempenar.setText(Ocupacion);
    }

    public void cboAreaOcupacional(String Ocupacion) {
        cboArea.setSelectedItem(Ocupacion);
    }

    void cargardatos() {
        try {
            CargarProfesionOcupacion();
            cboProfesion.setSelectedIndex(-1);
            String sQuery;
            sQuery = "SELECT * from datos_paciente where cod_pa='" + txtDni.getText() + "'";
            oConn1.FnBoolQueryExecute(sQuery);
            try {
                if (oConn1.setResult.next()) {
                    deshabilitar();
                    ckbSinDni.setEnabled(false);

                    //FechaNacimiento.setEnabled(true);
                    //Calendar fecha = new GregorianCalendar();
                    txtNombre.setText(oConn1.setResult.getString("nombres_pa"));
                    FechaNacimiento.setDate(oConn1.setResult.getDate("fecha_nacimiento_pa"));
                    txtApellidos.setText(oConn1.setResult.getString("apellidos_pa"));
                    cboSexo.setSelectedItem(oConn1.setResult.getString("sexo_pa"));

                    txtEmail.setText(oConn1.setResult.getString("email_pa"));
                    txtLugarNacimiento.setText(oConn1.setResult.getString("lugar_nac_pa"));
                    cboNivelEstudio.setSelectedItem(oConn1.setResult.getString("nivel_est_pa"));
                    cboProfesion.setSelectedItem(oConn1.setResult.getString("ocupacion_pa"));
                    cboEstadoCivil.setSelectedItem(oConn1.setResult.getString("estado_civil_pa"));
                    txtDireccion.setText(oConn1.setResult.getString("direccion_pa"));
                    cboDepartamento.setSelectedItem(oConn1.setResult.getString("departamento_pa"));
                    cboProvincia.setSelectedItem(oConn1.setResult.getString("provincia_pa"));
                    txtProvincia.setText(oConn1.setResult.getString("provincia_pa"));
                    cboDistrito.setSelectedItem(oConn1.setResult.getString("distrito_pa"));
                    txtDistrito.setText(oConn1.setResult.getString("distrito_pa"));
                    cboCaserio.setSelectedItem(oConn1.setResult.getString("caserio_pa"));
                    txtCaserio.setText(oConn1.setResult.getString("caserio_pa"));
                    txtTelefonoCasa.setText(oConn1.setResult.getString("tel_casa_pa"));
                    txtCelular.setText(oConn1.setResult.getString("cel_pa"));
                    txtHistorial.setText(oConn1.setResult.getString("historial_pa"));
                    btnAgregar.setEnabled(false);
                    txtDni.setEnabled(false);
                    btnLimpiar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnEditar.setEnabled(true);
                    btnGrabar.setEnabled(false);
                    txtHistorial.setVisible(true);
                    btnLimpiar.setEnabled(false);

                    btnGrabar.setEnabled(true);

                } else {
                    habilitar();
                    //txtDni.setText("");
                    txtNombre.requestFocus();
                    btnAgregar.setEnabled(true);

//                    funcion3();
//                    comunirApiReniecDesconocida();
                    btnLimpiar.setEnabled(true);
                    deshabilitarbotones();
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                oFunc.SubSistemaMensajeInformacion("Cod Paciente:" + ex.getMessage().toString());
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        deshabilitar();
        btnAgregar.setEnabled(false);
        txtDni.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!txtNorden.getText().isEmpty()) {
            if (ValidarRegistro()) {

                String strSqlStmt;
                String Query;
                strSqlStmt = "Insert INTO datos_paciente (";
                Query = "Values('";
                if (txtDni.getText().trim().length() >= 1) {
                    strSqlStmt += "cod_pa";
                    Query += txtDni.getText().toString() + "'";
                }
                if (txtNombre.getText().trim().length() > 1) {
                    strSqlStmt += ",nombres_pa";
                    Query += ",'" + txtNombre.getText().toString() + "'";
                }
                if (txtApellidos.getText().trim().length() > 1) {
                    strSqlStmt += ",apellidos_pa";
                    Query += ",'" + txtApellidos.getText().toString() + "'";
                }
                if (((JTextField) FechaNacimiento.getDateEditor().getUiComponent()).getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_nacimiento_pa";
                    Query += ",'" + FechaNacimiento.getDate().toGMTString() + "'";
                }
                if (cboSexo.getSelectedIndex() >= 0) {

                    strSqlStmt += ",sexo_pa";
                    Query += ",'" + cboSexo.getSelectedItem().toString() + "'";
                }

                if (txtEmail.getText().trim().length() > 1) {
                    strSqlStmt += ",email_pa";
                    Query += ",'" + txtEmail.getText().toString() + "'";
                }
                if (txtLugarNacimiento.getText().trim().length() > 1) {
                    strSqlStmt += ",lugar_nac_pa";
                    Query += ",'" + txtLugarNacimiento.getText().toString() + "'";
                }
                if (cboNivelEstudio.getSelectedIndex() >= 0) {
                    strSqlStmt += ",nivel_est_pa";
                    Query += ",'" + cboNivelEstudio.getSelectedItem().toString() + "'";
                }
                if (cboProfesion.getSelectedIndex() >= 0) {
                    strSqlStmt += ",ocupacion_pa";
                    Query += ",'" + cboProfesion.getSelectedItem().toString() + "'";
                }
                if (cboEstadoCivil.getSelectedIndex() >= 0) {
                    strSqlStmt += ",estado_civil_pa";
                    Query += ",'" + cboEstadoCivil.getSelectedItem().toString() + "'";
                }
                if (txtDireccion.getText().trim().length() > 1) {
                    strSqlStmt += ",direccion_pa";
                    Query += ",'" + txtDireccion.getText().toString() + "'";
                }
                if (cboDepartamento.getSelectedIndex() >= 0) {
                    strSqlStmt += ",departamento_pa";
                    Query += ",'" + cboDepartamento.getSelectedItem().toString() + "'";
                }
                if (txtProvincia.getText().trim().length() > 1) {
                    strSqlStmt += ",provincia_pa";
                    Query += ",'" + txtProvincia.getText() + "'";
                }
                if (txtDistrito.getText().trim().length() > 1) {
                    strSqlStmt += ",distrito_pa";
                    Query += ",'" + txtDistrito.getText() + "'";
                }
                if (txtCaserio.getText().trim().length() > 1) {
                    strSqlStmt += ",caserio_pa";
                    Query += ",'" + txtCaserio.getText()+ "'";
                }
                if (txtTelefonoCasa.getText().trim().length() > 1) {
                    strSqlStmt += ",tel_casa_pa";
                    Query += ",'" + txtTelefonoCasa.getText().toString() + "'";
                }
                // if (txtTelefonoTrabajo.getText().trim().length()> 1 ){
                //   strSqlStmt+= ",tel_trabajo_pa";
                //   Query+= ",'"+txtTelefonoTrabajo.getText().toString()+ "'";
                //  }
                if (txtCelular.getText().trim().length() > 1) {
                    strSqlStmt += ",cel_pa";
                    Query += ",'" + txtCelular.getText().toString() + "'";
                }
                if (txtFecha.getText().trim().length() > 1) {
                    strSqlStmt += ",fecha_registro_pa";
                    Query += ",'" + txtFecha.getText().toString() + "'";
                }

                if (txtHora.getText().trim().length() > 1) {
                    strSqlStmt += ",hora_registro_pa";
                    Query += ",'" + txtHora.getText().toString() + "'";
                }
                if (ckbSinDni.isSelected()) {
                    strSqlStmt += ",cod_aleatorio_pa";
                    Query += ",'" + txtDni.getText().toString() + "'";

                }
                //              oFunc.SubSistemaMensajeInformacion(strSqlStmt.concat(") ") + Query.concat(")"));  
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") ") + Query.concat(")"))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");
                    limpiar();
                    deshabilitar();
                    btnAgregar.setEnabled(false);
                    txtDni.requestFocus();
                    ckbSinDni.setSelected(false);

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");

                }
                try {
                    //       System.out.println(strSqlStmt);
                    oConn1.sqlStmt.close();
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

        jtRegistroGeneral.setSelectedIndex(1);
        LimpiarAlta();
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        agregaractualizar();
        jtRegistroGeneral.setSelectedIndex(1);
        LimpiarAlta();
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAddOcupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacionMouseClicked
        MostrarAddOcupacion();
    }//GEN-LAST:event_btnAddOcupacionMouseClicked

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        FechaNacimiento.requestFocusInWindow();
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnAddOcupacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacion1MouseClicked
        MostrarAgregarEmpresa();
    }//GEN-LAST:event_btnAddOcupacion1MouseClicked

    private void btnAddOcupacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacion2MouseClicked
        MostrarAgregarContrata();
    }//GEN-LAST:event_btnAddOcupacion2MouseClicked

    private void txtEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyReleased
        txtEmpresa.setText(txtEmpresa.getText().toUpperCase());
    }//GEN-LAST:event_txtEmpresaKeyReleased

    private void txtContrataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrataKeyReleased
        txtContrata.setText(txtContrata.getText().toUpperCase());

    }//GEN-LAST:event_txtContrataKeyReleased
    public boolean ExiteEmpresa() {
        boolean bResultado = false;
        String sQuery;
        sQuery = "Select razon_empresa from empresas Where razon_empresa='" + cboEmpresa.getSelectedItem() + "'";
        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn1.setResult.next()) {
                // Resultado
                bResultado = true;
            }
            // Cierro los Resultados
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
        }
        return bResultado;
    }

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        if (ExiteEmpresa()) {
            txtContrata.requestFocus();
        } else {
            oFunc.SubSistemaMensajeError("EMPRESA NO REGISTRADA. DEBE REGISTRAR");
        }

    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnMineralExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMineralExMouseClicked
        MostrarAddMineralEx();
    }//GEN-LAST:event_btnMineralExMouseClicked

    private void txtNombresAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresAltaActionPerformed

    private void txtNombresAltaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresAltaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresAltaKeyReleased

    private void txtApellidosAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosAltaActionPerformed

    private void txtApellidosAltaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosAltaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosAltaKeyReleased

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txtDni.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated
    public boolean ExiteContrata() {
        boolean bResultado = false;
        String sQuery;
        sQuery = "Select razon_contrata from contratas Where razon_contrata='" + cboContrata.getSelectedItem() + "'";
        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn1.setResult.next()) {
                // Resultado
                bResultado = true;
            }
            // Cierro los Resultados
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
        }
        return bResultado;
    }
    private void txtContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrataActionPerformed
        if (ExiteContrata()) {
            txtMedico.requestFocus();
        } else {
            oFunc.SubSistemaMensajeError("CONTRATA NO REGISTRADA. DEBE REGISTRAR.");
        }

    }//GEN-LAST:event_txtContrataActionPerformed

    private void chkPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPrecioActionPerformed
        if (chkPrecio.isSelected()) {
            txtPrecio.setEnabled(true);
            txtPrecio.setEditable(true);

        } else {
            txtPrecio.setEnabled(false);
            txtPrecio.setEditable(false);
        }
    }//GEN-LAST:event_chkPrecioActionPerformed

    private void cboExamenMedicoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboExamenMedicoPopupMenuWillBecomeInvisible
        try {
            if (cboExamenMedico.getSelectedIndex() <= -1) {
                oFunc.SubSistemaMensajeError("Seleccione Servicio");
            } else {
                String sql = "select precio_examen from examen_medico_ocupacional where nom_examen ='" + cboExamenMedico.getSelectedItem().toString() + "'";
                oConn1.FnBoolQueryExecute(sql);
                try {
                    if (oConn1.setResult.next()) {
                        txtPrecio.setText(oConn1.setResult.getString("precio_examen"));
                    }
                    oConn1.setResult.close();
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {

                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboExamenMedicoPopupMenuWillBecomeInvisible

    private void cboExamenMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboExamenMedicoActionPerformed
        cboExamenMedico.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboExamenMedico.getSelectedIndex() <= -1) {

                } else {

                    cboExplotacion.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboExamenMedicoActionPerformed

    private void cboExplotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboExplotacionActionPerformed
        cboExplotacion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboExplotacion.getSelectedIndex() <= -1) {

                } else {

                    cboMineralExp.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboExplotacionActionPerformed

    private void cboExplotacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboExplotacionPopupMenuWillBecomeInvisible
        if (cboExplotacion.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Seleccione Explotación de Mineral");
        }
    }//GEN-LAST:event_cboExplotacionPopupMenuWillBecomeInvisible

    private void cboMineralExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMineralExpActionPerformed
        cboMineralExp.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboMineralExp.getSelectedIndex() <= -1) {

                } else {

                    cboAltura.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboMineralExpActionPerformed
    public void agregarAltaEpidemiologica(String numero) {
        try {
            String sConsulta;
            sConsulta = "select spAgregarPE(" + numero + ");";
            if (oConn1.FnBoolQueryExecute(sConsulta)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {

                        // Obtiene los datos de la Consulta
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void agregarcontabilidad(String numero) {
        try {
            String sConsulta;
            sConsulta = "select spagregarconta(" + numero + ");";
            if (oConn1.FnBoolQueryExecute(sConsulta)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {

                        // Obtiene los datos de la Consulta
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void cboMineralExpPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboMineralExpPopupMenuWillBecomeInvisible
        if (cboMineralExp.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese / Seleccione Mineral Explotado");
        }
    }//GEN-LAST:event_cboMineralExpPopupMenuWillBecomeInvisible

    private void cboAlturaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboAlturaPopupMenuWillBecomeInvisible
        if (cboAltura.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese / seleccione Altura de Labor");
        }
    }//GEN-LAST:event_cboAlturaPopupMenuWillBecomeInvisible

    private void btnLimpiarAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAperturaActionPerformed
        LimpiarAlta();
    }//GEN-LAST:event_btnLimpiarAperturaActionPerformed

    private void LimpiarAlta() {
        AltaDesabilitar();
        AltaLimpiar();
        txtDniAlta.setEditable(true);
        hBotones(false);
        txtNumColor.setText(null);
        txtGS.setText(null);
        txtGrupoSan.setText(null);
        txtFactorSan.setText(null);
        bgFS.clearSelection();
        btGS.clearSelection();
        txtDniAlta.requestFocus();
    }
    public void insertarRegistros() {
        operacion = 1;
        if (ValidarAlta()) {
            try {
                String Sql = "INSERT INTO n_orden_ocupacional(cod_pa, razon_empresa, razon_contrata,"
                        + " nom_ex, altura_po,mineral_po, fecha_apertura_po,nom_examen,precio_po,cargo_de,n_medico,n_hora,area_o,"
                        + "tipo_pago,n_fisttest,n_psicosen,n_testaltura,color,gruposan,grupofactorsan,cod_clinica,visual_compl,"
                        + "trab_calientes,manip_alimentos,txtobserv1,txtobserv2,tipoPrueba,cod_sede,nombrehotel,protocolo,"
                        + "precio_adic,autoriza,n_operacion, herra_manuales, \n" 
                        + "       rxc_dorso_lumbar, rxc_lumbar, rxc_lumbosacra, rxc_plomos, mercurioo)";//
                Sql += " Values ('" + txtDniAlta.getText().toString() + "','"
                        + cboEmpresa.getSelectedItem().toString() + "','"
                        + cboContrata.getSelectedItem().toString() + "','";
                       if (jCheckBox12.isSelected()) {
                    Sql += "','','','";
                } else {
                    Sql += cboExplotacion.getSelectedItem().toString() + "','"
                            + cboAltura.getSelectedItem().toString() + "','"
                            + cboMineralExp.getSelectedItem().toString() + "','";
                }
                Sql +=txtFechaAlta.getDate().toString() + "','"
                        + cboExamenMedico.getSelectedItem().toString() + "','"
                        + txtPrecio.getText().toString() + "','"
                        + txtCargoDesempenar.getText().toString() + "','"
                        + txtMedico.getText().toString() + "','"
                        + lblHora.getText().toString() + "','";
                        if(jCheckBox12.isSelected()){
                          Sql +="','" ;
                        }else{
                           Sql += cboArea.getSelectedItem().toString() + "','" ;
                        }
                       Sql +=cboFormaPago.getSelectedItem() + "','"
                        + chkAltaFist.isSelected() + "','"
                        + chkAltaPsicosen.isSelected() + "','"
                        + chkAltaTestAltura.isSelected() + "','"
                        + txtNumColor.getText().toString() + "','"
                        + txtGS.getText().toString() + "','"
                        + txtGrupoSan.getText().toString().concat(txtFactorSan.getText().toString()) + "','"
                        + jLabel44.getText().toString() + "','"
                        + chkAltaVisualCom.isSelected() + "','"
                        + chkAltaTrabCal.isSelected() + "','"
                        //                      + chkAltaCovid1.isSelected() + "','"
                        //                      + chkAltaCovid2.isSelected() + "','"
                        + chkAltaManipAlimen.isSelected() + "','"
                        + txtObserv1.getText() + "','"
                        + txtObserv2.getText() + "'" + ",'"
                        + cboTipoExamen.getSelectedItem().toString() + "',"
                        + codigosede + ",'" + jComboBoxHotel.getSelectedItem().toString() + "','"
                        + jComboBoxProtocolos.getSelectedItem().toString() + "','"
                        + txtPrecioAdicional.getText().toString() + "','";
                        if(jCheckBox12.isSelected()){
                           Sql+=""+ "','";
                        } else{
                            Sql+= cboAutorizacion.getSelectedItem().toString()+ "','";
                        }      
                        Sql+= txtNOperacion.getText() + "','" 
                              + chkAltaHerrMan.isSelected() + "','" 
                              + chkAltaRXCDorso.isSelected() + "','" 
                              + chkAltaRXCLumba.isSelected() + "','" 
                              + chkAltaRXCLumbo.isSelected() + "','" 
                              + chkAltaPlomoS.isSelected() + "','" 
                              +chkAltaMercO.isSelected() ;
                        Sql+= "') RETURNING n_orden;";
                //oFunc.SubSistemaMensajeError(Sql);
                System.out.println(Sql);
                if (oConn1.FnBoolQueryExecute(Sql)) {
                    try {
                        oConn1.setResult.next();
                        num = oConn1.setResult.getString("n_orden");
                        txtNorden1.setText(num);
                        oFunc.SubSistemaMensajeInformacion("Alta Correctamente\nSu numero de Orden es :** " + num + " **");
                        agregarAltaEpidemiologica(num);
                        agregarcontabilidad(num);
                        if (jComboBoxProtocolos.getSelectedItem().toString().contains("N/A")) {
                            operacion = 0;
                        } else {
                            calcularProtocolos();
                            spFuncionHistorialClienteProtocolo();
                        }
                        imprimir();
                        AltaDesabilitar();
                        AltaLimpiar();
                        txtDniAlta.setEditable(true);
                        txtDniAlta.requestFocus();
                        sbCargarOcupacional("");
                    } catch (SQLException ex) {
                        Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    oFunc.SubSistemaMensajeError("No se pudo dar de Alta");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            oFunc.SubSistemaMensajeError("Llene todos los Campos");
        }
    }
    private void btnGuardarAperturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAperturarActionPerformed
        insertarRegistros();
        
    }//GEN-LAST:event_btnGuardarAperturarActionPerformed
    private boolean imprimir() {
        boolean im = false;
        int seleccion = JOptionPane.showOptionDialog(
                this, // Componente padre
                "¿Desea Imprimir?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"}, // null para YES, NO y CANCEL
                "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {  //  System.out.println("el numero es "+Integer.valueOf(num));
                printer(Integer.valueOf(num));
                //   printer(Integer.valueOf(txtNorden.getText().toString()));
                im = true;
            } else {
                // PRESIONO NO
            }
        }
        return im;

    }

    public void cerrarVentana() {
        // JOptionPane.showMessageDialog(null, "probando para cerrar el stament");
        System.out.println("cerro esta ventana");
        try {
            if (oConn1.setResult != null) {
                oConn1.setResult.close();
            }

            if (oConn1.sqlStmt != null) {
                oConn1.sqlStmt.close();
            }
            // if (oConn1.oConnection != null) 
            //
            //  oConn1.oConnection.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
        //  System.exit(0);

    }

    public boolean OrdenExiste() {
        boolean bResultado = false;

        String sQuery;

        sQuery = "Select n_orden from n_orden_ocupacional Where n_orden=" + txtDniAlta.getText().toString();

        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);

        // Capturo el Error
        try {

            // Verifico que haya habido resultados
            if (oConn1.setResult.next()) {
                // Resultado
                bResultado = true;
                //    oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                limpiar();
            }

            // Cierro los Resultados
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {

        }

        return bResultado;

    }

    public boolean OrdenExiste1() {
        boolean bResultado = false;

        String sQuery;
        //System.out.println("enro al orden existe 1");

        sQuery = "Select n_orden from n_orden_ocupacional Where cod_pa=" + txtDniAlta.getText().toString() + "";

        //System.out.println("paso al orden existe 1");
        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);

        // Capturo el Error
        try {

            // Verifico que haya habido resultados
            if (oConn1.setResult.next()) {
                // Resultado
                bResultado = true;

                //  oFunc.SubSistemaMensajeError("Número de Orden Utilizado");
                // System.out.println("el valor de bresutltado antes "+bResultado);
                //limpiar();
            }

            // Cierro los Resultados
            oConn1.setResult.close();
            //        System.out.println("el valor de bresutltado"+bResultado);
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {

        }

        return bResultado;

    }


    private void cboAreaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboAreaPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAreaPopupMenuWillBecomeInvisible

    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
        cboArea.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboArea.getSelectedIndex() <= -1) {

                } else {

                    cboExamenMedico.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboAreaActionPerformed

    private void btnAreaOcupacionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAreaOcupacionalMouseClicked
        MostrarAddArea();
    }//GEN-LAST:event_btnAreaOcupacionalMouseClicked

    private void txtCargoDesempenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoDesempenarActionPerformed
        cboArea.requestFocus();
    }//GEN-LAST:event_txtCargoDesempenarActionPerformed

    private void cboAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAlturaActionPerformed
        cboAltura.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboAltura.getSelectedIndex() <= -1) {

                } else {

                    txtPrecioAdicional.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboAlturaActionPerformed

    private void FechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaNacimientoPropertyChange
        if (((JTextField) FechaNacimiento.getDateEditor().getUiComponent()).getText().trim().length() > 2) {

            cboSexo.requestFocus();
        }
    }//GEN-LAST:event_FechaNacimientoPropertyChange

    private void btnCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargoMouseClicked
        MostrarAddCargos();
    }//GEN-LAST:event_btnCargoMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        if (txtDni.getText().length() <= 10) {
            cargardatos();
            dni = txtDni.getText().toString();
        } else {
            oFunc.SubSistemaMensajeError("Es correcto el DNI?");
        }
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int limite = 10;
        {
            if (txtDni.getText().length() == limite) {
                evt.consume();
            }
        }
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        sbCargarOcupacional(txtBuscarNombre.getText().toString());
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void txtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoActionPerformed
        if (ExiteEmpresa()) {
            txtCargoDesempenar.requestFocus();
        } else {
            oFunc.SubSistemaMensajeError("EMPRESA NO REGISTRADA. DEBE REGISTRAR");
            cboEmpresa.requestFocus();
            txtMedico.setText(null);
        }
        if (ExiteContrata()) {
             if (ExiteEmpresa()) {
                txtCargoDesempenar.requestFocus();
             }else{
                 cboEmpresa.requestFocus();
                 txtMedico.setText(null);
             }
        } else {
            oFunc.SubSistemaMensajeError("CONTRATA NO REGISTRADA. DEBE REGISTRAR");
            cboContrata.requestFocus();
            txtMedico.setText(null);
        }
    }//GEN-LAST:event_txtMedicoActionPerformed

    private void txtDniAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniAltaActionPerformed
        if (txtDniAlta.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese DNI de Trabajador");
        } else {
//            if (!OrdenExiste()) {

//                System.out.println("pasoe el orden existe");
            String sql;
//                sql = "select nombres_pa, apellidos_pa from datos_paciente where cod_pa ='" + txtDniAlta.getText().toString() + "'";
//                sql="select dp.nombres_pa, dp.apellidos_pa,count(l.fecha_lab) as pasado,l.chko ,l.chka ,l.chkb ,l.chkab, \n" +
//"                        l.rbrhpositivo ,l.rbrhnegativo from datos_paciente as dp\n" +
//"                        inner join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) \n" +
//"                        inner join lab_clinico as l on(n.n_orden=l.n_orden) \n" +
//"                         where dp.cod_pa ='" + txtDniAlta.getText().toString() + "'"+
//"                         group by dp.nombres_pa, dp.apellidos_pa,l.chko ,l.chka ,l.chkb ,l.chkab, \n" +
//"                        l.rbrhpositivo ,l.rbrhnegativo";
            sql = "select dp.nombres_pa, dp.apellidos_pa,max(l.fecha_lab) as pasado,\n"
                    + "CASE WHEN l.chko = 'TRUE' THEN 'O'\n"
                    + " WHEN l.chka = 'TRUE' THEN 'A'\n"
                    + " WHEN l.chkb = 'TRUE' THEN 'B'\n"
                    + " WHEN l.chkab = 'TRUE' THEN 'AB' ELSE '.' END ||''|| \n"
                    + " CASE WHEN l.rbrhpositivo ='TRUE' THEN '+' \n"
                    + " WHEN l.rbrhnegativo = 'TRUE' THEN '-' END AS Grupoyfactor  \n"
                    + " from datos_paciente as dp\n"
                    + " left join n_orden_ocupacional AS n ON(dp.cod_pa = n.cod_pa) \n"
                    + " left join lab_clinico as l on(n.n_orden=l.n_orden) \n"
                    + " where dp.cod_pa ='" + txtDniAlta.getText().toString() + "' "
                    + "group by dp.nombres_pa, dp.apellidos_pa,l.chko ,l.chka ,l.chkb ,l.chkab, \n"
                    + "l.rbrhpositivo ,l.rbrhnegativo limit 1";
            oConn1.FnBoolQueryExecute(sql);
            try {
                if (oConn1.setResult.next()) {

                    txtNombresAlta.setText(oConn1.setResult.getString("nombres_pa"));
                    txtApellidosAlta.setText(oConn1.setResult.getString("apellidos_pa"));
                    String gs = oConn1.setResult.getString("Grupoyfactor");
                    oFunc.SubSistemaMensajeError(gs);
                    if (gs != null) {
                        txtGS.setText(gs);
                    } else {
                        txtGS.setText("null");
                    }
                    AltaHabilitar();
                    
                    CargarNorden();

                    NumColor();

                    cboEmpresa.requestFocus();
                    txtEmpresa.setText("");
                    txtContrata.setText("");
                    txtDniAlta.setEditable(false);
                    fecha();
                } else {

                    oFunc.SubSistemaMensajeError("Si es la primera vez \n Rebe de Registar este Paciente \n   Clic en en la Imagen");
                    AltaDesabilitar();
                    AltaLimpiar();
                    txtDniAlta.requestFocus();
                }

                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialorootPane,ex);
                oFunc.SubSistemaMensajeError(ex.toString());
                Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
            //   System.out.println("apunto de entrar al orden existe 1");

            if (OrdenExiste1()) {
                // System.out.println("apunto de cargar datos");
                // cargarDatosPaciente();

            }

//            }
        }
    }//GEN-LAST:event_txtDniAltaActionPerformed
    public void cargarDatosPaciente() {
        //     System.out.println("enro para cargar datos");
        jComboBoxHotel.setSelectedIndex(0);
        // AltaDesabilitar();
        Integer cod = Integer.valueOf(txtDniAlta.getText().toString());
        //   System.out.println("el valor de cod es:"+cod);
        String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
                + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
                + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
                + "n.visual_compl,n.trab_calientes,manip_alimentos,txtobserv1,txtobserv2,"
                + "n.gruposan,n.color,n.grupofactorsan,n.cod_clinica,n.tipoprueba,n.nombrehotel,"
                + "n.precio_adic,n.autoriza,n_operacion, n.herra_manuales, \n" +
"                      n.rxc_dorso_lumbar,  n.rxc_lumbar,  n.rxc_lumbosacra,  n.rxc_plomos,  n.mercurioo  "
                + "FROM n_orden_ocupacional AS n  "
                + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
                + "WHERE n.cod_pa = " + cod + agregarConsulta + " order by n_orden desc limit 1;";
        //     System.out.println("la consulta es:"+Sql);
        oConn1.FnBoolQueryExecute(Sql);
        try {
            if (oConn1.setResult.next()) {
                txtDniAlta.setText(oConn1.setResult.getString("cod_pa"));
                txtNombresAlta.setText(oConn1.setResult.getString("nombres_pa"));
                txtApellidosAlta.setText(oConn1.setResult.getString("apellidos_pa"));
                cboEmpresa.setSelectedItem(oConn1.setResult.getString("razon_empresa"));
                cboContrata.setSelectedItem(oConn1.setResult.getString("razon_contrata"));
                txtMedico.setText(oConn1.setResult.getString("n_medico"));
                txtCargoDesempenar.setText(oConn1.setResult.getString("cargo_de"));
                cboArea.setSelectedItem(oConn1.setResult.getString("area_o"));
                cboExamenMedico.setSelectedItem(oConn1.setResult.getString("nom_examen"));
                cboExplotacion.setSelectedItem(oConn1.setResult.getString("nom_ex"));
                cboMineralExp.setSelectedItem(oConn1.setResult.getString("mineral_po"));
                cboAltura.setSelectedItem(oConn1.setResult.getString("altura_po"));
                txtPrecio.setText(oConn1.setResult.getString("precio_po"));
                //  txtFechaAlta.setDate(oConn.setResult.getDate("fecha_apertura_po"));
                // txtNorden.setText(oConn.setResult.getString("n_orden"));
                cboTipoExamen.setSelectedItem(oConn1.setResult.getString("tipoprueba"));
                jComboBoxHotel.setSelectedItem(oConn1.setResult.getString("nombrehotel"));
                if (cboTipoExamen.getSelectedItem().toString().equals("PC")) {
                    jComboBoxHotel.setEnabled(true);
                } else {
                    jComboBoxHotel.setEnabled(false);
                }
                cboFormaPago.setSelectedItem(oConn1.setResult.getString("tipo_pago"));

                chkAltaFist.setSelected(oConn1.setResult.getBoolean("n_fisttest"));
                chkAltaPsicosen.setSelected(oConn1.setResult.getBoolean("n_psicosen"));
                chkAltaTestAltura.setSelected(oConn1.setResult.getBoolean("n_testaltura"));
                chkAltaVisualCom.setSelected(oConn1.setResult.getBoolean("visual_compl"));
                chkAltaTrabCal.setSelected(oConn1.setResult.getBoolean("trab_calientes"));
//                    chkAltaCovid1.setSelected(oConn1.setResult.getBoolean("chkcovid1"));
//                    chkAltaCovid2.setSelected(oConn1.setResult.getBoolean("chkcovid2"));
                txtGS.setText(oConn1.setResult.getString("gruposan"));
                txtNumColor.setText(oConn1.setResult.getString("color"));
                txtGrupoSan.setText(oConn1.setResult.getString("grupofactorsan"));
                jLabel44.setText(oConn1.setResult.getString("cod_clinica"));
                chkAltaManipAlimen.setSelected(oConn1.setResult.getBoolean("manip_alimentos"));
                txtObserv1.setText(oConn1.setResult.getString("txtobserv1"));
                txtObserv2.setText(oConn1.setResult.getString("txtobserv2"));
                txtPrecioAdicional.setText(oConn1.setResult.getString("precio_adic"));
                cboAutorizacion.setSelectedItem(oConn1.setResult.getString("autoriza"));
                txtNOperacion.setText(oConn1.setResult.getString("n_operacion"));
                chkAltaHerrMan.setSelected(oConn1.setResult.getBoolean("herra_manuales"));
                    chkAltaRXCDorso.setSelected(oConn1.setResult.getBoolean("rxc_dorso_lumbar"));
                    chkAltaRXCLumba.setSelected(oConn1.setResult.getBoolean("rxc_lumbar"));
                    chkAltaRXCLumbo.setSelected(oConn1.setResult.getBoolean("rxc_lumbosacra"));
                    chkAltaPlomoS.setSelected(oConn1.setResult.getBoolean("rxc_plomos"));
                    chkAltaMercO.setSelected(oConn1.setResult.getBoolean("mercurioo"));
                
                if (nomsede.equals("Trujillo")) {
                    jLabel44.setText(txtNorden.getText() + " - T");
                } else {
                    jLabel44.setText(txtNorden.getText() + " - H");
                }
                txtDniAlta.setEditable(false);
                // hBotones(true);

            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (Exception e) {
        }
        fecha1();
    }
    private void txtDniAltaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniAltaKeyReleased
        if (evt.getKeyCode() == 112) // F1 = 112
        {
            MostrarUltimoRegistro();
        }
    }//GEN-LAST:event_txtDniAltaKeyReleased

    private void txtDniAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniAltaKeyTyped
        oFunc.NoLetras(evt);
    }//GEN-LAST:event_txtDniAltaKeyTyped

    private void tbOcupacionalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOcupacionalMousePressed

        try {
            if (evt.getClickCount() == 2) {
                //     System.out.println("va entrar en el cod de 2 click");
                Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
                System.out.println("el cod es:" + cod);

                print(cod);
                //    System.out.println("paso en print");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if (evt.getClickCount() == 1) {

            jComboBoxHotel.setSelectedIndex(0);
            AltaDesabilitar();
            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
                    + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
                    + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
                    + "n.visual_compl,n.trab_calientes,chkcovid1,chkcovid2,manip_alimentos,txtobserv1,txtobserv2,"
                    + "n.gruposan,n.color,n.grupofactorsan,n.cod_clinica,n.tipoprueba,n.nombrehotel,n.protocolo,"
                    + "n.precio_adic,n.autoriza,n_operacion, n.herra_manuales, \n" +
"                      n.rxc_dorso_lumbar,  n.rxc_lumbar,  n.rxc_lumbosacra,  n.rxc_plomos,  n.mercurioo "
                    + "FROM n_orden_ocupacional AS n  "
                    + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
                    + "WHERE n.n_orden = " + cod + agregarConsulta;
            //      System.out.println("la consulta es:"+Sql);

            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    txtDniAlta.setText(oConn1.setResult.getString("cod_pa"));
                    txtNombresAlta.setText(oConn1.setResult.getString("nombres_pa"));
                    txtApellidosAlta.setText(oConn1.setResult.getString("apellidos_pa"));
                    cboEmpresa.setSelectedItem(oConn1.setResult.getString("razon_empresa"));
                    cboContrata.setSelectedItem(oConn1.setResult.getString("razon_contrata"));
                    txtMedico.setText(oConn1.setResult.getString("n_medico"));
                    txtCargoDesempenar.setText(oConn1.setResult.getString("cargo_de"));
                    cboArea.setSelectedItem(oConn1.setResult.getString("area_o"));
                    cboExamenMedico.setSelectedItem(oConn1.setResult.getString("nom_examen"));
                    cboExplotacion.setSelectedItem(oConn1.setResult.getString("nom_ex"));
                    cboMineralExp.setSelectedItem(oConn1.setResult.getString("mineral_po"));
                    cboAltura.setSelectedItem(oConn1.setResult.getString("altura_po"));
                    txtPrecio.setText(oConn1.setResult.getString("precio_po"));
                    txtFechaAlta.setDate(oConn1.setResult.getDate("fecha_apertura_po"));
                    txtNorden.setText(oConn1.setResult.getString("n_orden"));
                    cboTipoExamen.setSelectedItem(oConn1.setResult.getString("tipoprueba"));
                    jComboBoxHotel.setSelectedItem(oConn1.setResult.getString("nombrehotel"));
                    jComboBoxProtocolos.setSelectedItem(oConn1.setResult.getString("protocolo"));

                    if (cboTipoExamen.getSelectedItem().toString().equals("PC")) {
                        jComboBoxHotel.setEnabled(true);
                    } else {
                        jComboBoxHotel.setEnabled(false);
                    }
                    cboFormaPago.setSelectedItem(oConn1.setResult.getString("tipo_pago"));
                    chkAltaFist.setSelected(oConn1.setResult.getBoolean("n_fisttest"));
                    chkAltaPsicosen.setSelected(oConn1.setResult.getBoolean("n_psicosen"));
                    chkAltaTestAltura.setSelected(oConn1.setResult.getBoolean("n_testaltura"));
                    chkAltaVisualCom.setSelected(oConn1.setResult.getBoolean("visual_compl"));
                    chkAltaTrabCal.setSelected(oConn1.setResult.getBoolean("trab_calientes"));
//                    chkAltaCovid1.setSelected(oConn1.setResult.getBoolean("chkcovid1"));
//                    chkAltaCovid2.setSelected(oConn1.setResult.getBoolean("chkcovid2"));
                    txtGS.setText(oConn1.setResult.getString("gruposan"));
                    txtNumColor.setText(oConn1.setResult.getString("color"));
                    txtGrupoSan.setText(oConn1.setResult.getString("grupofactorsan"));
                    jLabel44.setText(oConn1.setResult.getString("cod_clinica"));
                    System.out.println("codigo clinico es:" + jLabel44.getText());
                    chkAltaManipAlimen.setSelected(oConn1.setResult.getBoolean("manip_alimentos"));
                    txtObserv1.setText(oConn1.setResult.getString("txtobserv1"));
                    txtObserv2.setText(oConn1.setResult.getString("txtobserv2"));
                    txtPrecioAdicional.setText(oConn1.setResult.getString("precio_adic"));
                    cboAutorizacion.setSelectedItem(oConn1.setResult.getString("autoriza"));
                    if (nomsede.equals("Trujillo")) {
                        jLabel44.setText(txtNorden.getText() + " - T");
                    } else {
                        jLabel44.setText(txtNorden.getText() + " - H");
                    }
                    txtNOperacion.setText(oConn1.setResult.getString("n_operacion"));
                    chkAltaHerrMan.setSelected(oConn1.setResult.getBoolean("herra_manuales"));
                    chkAltaRXCDorso.setSelected(oConn1.setResult.getBoolean("rxc_dorso_lumbar"));
                    chkAltaRXCLumba.setSelected(oConn1.setResult.getBoolean("rxc_lumbar"));
                    chkAltaRXCLumbo.setSelected(oConn1.setResult.getBoolean("rxc_lumbosacra"));
                    chkAltaPlomoS.setSelected(oConn1.setResult.getBoolean("rxc_plomos"));
                    chkAltaMercO.setSelected(oConn1.setResult.getBoolean("mercurioo"));
                    txtDniAlta.setEditable(false);
                    hBotones(true);

                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_tbOcupacionalMousePressed

    private void BtnEditarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarExActionPerformed
        txtEmpresa.setEnabled(true);
        txtContrata.setEnabled(true);
        cboEmpresa.setEnabled(true);
        cboContrata.setEnabled(true);
        txtMedico.setEnabled(true);
        txtCargoDesempenar.setEnabled(true);
        cboArea.setEnabled(true);
        cboExamenMedico.setEnabled(true);
        cboExplotacion.setEnabled(true);
        cboMineralExp.setEnabled(true);
        cboAltura.setEnabled(true);
        chkAltaFist.setEnabled(true);
        chkAltaPsicosen.setEnabled(true);
        chkAltaTestAltura.setEnabled(true);
        chkAltaVisualCom.setEnabled(true);
        chkAltaTrabCal.setEnabled(true);
        cboFormaPago.setEnabled(true);
//        chkAltaCovid1.setEnabled(true);
//        chkAltaCovid2.setEnabled(true);
        chkAltaManipAlimen.setEnabled(true);
        chkAltaHerrMan.setEnabled(true);
        chkAltaRXCDorso.setEnabled(true);
        chkAltaRXCLumba.setEnabled(true);
        chkAltaRXCLumbo.setEnabled(true);
        chkAltaPlomoS.setEnabled(true);
        chkAltaMercO.setEnabled(true);
        txtObserv1.setEnabled(true);
        txtObserv2.setEnabled(true);
        txtPrecioAdicional.setEnabled(true);
        cboAutorizacion.setEnabled(true);
        txtNOperacion.setEnabled(true);
        jComboBoxProtocolos.setEnabled(true);
        //cboSedeClinica.setEnabled(true);
        txtFechaAlta.setEnabled(true);


    }//GEN-LAST:event_BtnEditarExActionPerformed

    private void BtnActualizarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarExActionPerformed
        if (ValidarAlta()) {
            try {
                operacion = 2;
                String sCodigo;
                String strSqlStmt;
                strSqlStmt = "UPDATE n_orden_ocupacional "
                        + "SET razon_empresa='" + cboEmpresa.getSelectedItem().toString() + "', razon_contrata='" + cboContrata.getSelectedItem().toString() + "', nom_ex='" + cboExplotacion.getSelectedItem().toString() + "', "
                        + "altura_po='" + cboAltura.getSelectedItem().toString() + "', mineral_po='" + cboMineralExp.getSelectedItem().toString() + "', fecha_apertura_po='" + txtFechaAlta.getDate().toString()
                        + "',precio_po='" + txtPrecio.getText().toString() + "', "
                        + "nom_examen='" + cboExamenMedico.getSelectedItem().toString() + "', cargo_de='" + txtCargoDesempenar.getText().toString() + "', area_o='" + cboArea.getSelectedItem().toString() + "', "
                        + "n_medico='" + txtMedico.getText().toString() + "', tipo_pago='" + cboFormaPago.getSelectedItem() + "', "
                        + "n_fisttest='" + chkAltaFist.isSelected() + "',n_psicosen='" + chkAltaPsicosen.isSelected()
                        + "',n_testaltura='" + chkAltaTestAltura.isSelected() + "',"
                        + "color='" + txtNumColor.getText().toString() + "',"
                        + "grupofactorsan='" + txtGrupoSan.getText().toString().concat(txtFactorSan.getText().toString()) + "',"
                        + "cod_clinica='" + jLabel44.getText().toString() + "',"
                        + "visual_compl='" + chkAltaVisualCom.isSelected() + "',"
                        + "trab_calientes='" + chkAltaTrabCal.isSelected() + "',"
                        //                    + "chkcovid1='"+ chkAltaCovid1.isSelected() +"',"
                        //                    + "chkcovid2='"+ chkAltaCovid2.isSelected() +"',"
                        + "manip_alimentos='" + chkAltaManipAlimen.isSelected() + "',"
                        + "txtobserv1='" + txtObserv1.getText() + "',"
                        + "txtobserv2='" + txtObserv2.getText() + "',"
                        + "tipoPrueba='" + cboTipoExamen.getSelectedItem().toString() + "',"
                        + "nombrehotel='" + jComboBoxHotel.getSelectedItem().toString() + "', "
                        + "protocolo='" + jComboBoxProtocolos.getSelectedItem().toString() + "',"
                        + "precio_adic='" + txtPrecioAdicional.getText() + "', "
                        + "autoriza='" + cboAutorizacion.getSelectedItem().toString() + "',"
                        + "n_operacion='" + txtNOperacion.getText()  + "',"
                         + "herra_manuales='" + chkAltaHerrMan.isSelected()  + "',"
                         + "rxc_dorso_lumbar='" + chkAltaRXCDorso.isSelected()  + "',"
                         + "rxc_lumbar='" + chkAltaRXCLumba.isSelected()  + "',"
                         + "rxc_lumbosacra='" + chkAltaRXCLumbo.isSelected()  + "',"
                         + "rxc_plomos='" + chkAltaPlomoS.isSelected()  + "',"
                        + "mercurioo='" + chkAltaMercO.isSelected() + "'";
//                        sCodigo = txtNorden.getText();
                sCodigo = tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString();
                strSqlStmt += " Where n_orden = " + sCodigo + "";
                num = txtNorden.getText();
                if (jComboBoxProtocolos.getSelectedItem().toString().contains("N/A")) {
                    operacion = 0;
                } else {
                    calcularProtocolos();
                    spFuncionHistorialClienteProtocolo();
                }
                //oFunc.SubSistemaMensajeInformacion(strSqlStmt);
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                    oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                    agregarAltaEpidemiologica(txtNorden.getText());
                    AltaDesabilitar();

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
                sbCargarOcupacional("");

            } catch (SQLException ex) {
                Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            oFunc.SubSistemaMensajeError("Llene todos los Campos");
        }
    }//GEN-LAST:event_BtnActualizarExActionPerformed

    private void chkAltaTestAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaTestAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaTestAlturaActionPerformed

    private void chkAltaPsicosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaPsicosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaPsicosenActionPerformed

    private void chkAltaFistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaFistActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chkAltaFistActionPerformed

    private void tbOcupacionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbOcupacionalKeyReleased
        if (evt.getKeyCode() == 40 || evt.getKeyCode() == 38) {
            AltaDesabilitar();
            Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
            String Sql = "SELECT d.nombres_pa,d.apellidos_pa ,n.n_orden, n.cod_pa, n.razon_empresa, n.razon_contrata, n.nom_ex, n.altura_po, "
                    + "n.mineral_po, n.fecha_apertura_po, n.precio_po, n.estado_ex, n.nom_examen, "
                    + "n.cargo_de, n.area_o, n.n_medico, n_hora,n.tipo_pago,n.n_fisttest,n.n_psicosen,n.n_testaltura,"
                    + "visual_compl,trab_calientes,manip_alimentos,txtobserv1,txtobserv2,"
                    + "n.color,n.gruposan,n.grupofactorsan,n.cod_clinica,n.tipoprueba,n.nombrehotel,n.protocolo,"
                    + "n.precio_adic,n.autoriza, n_operacion, n.herra_manuales, \n" +
"                      n.rxc_dorso_lumbar,  n.rxc_lumbar,  n.rxc_lumbosacra,  n.rxc_plomos,  n.mercurioo "
                    + "FROM n_orden_ocupacional AS n  "
                    + "INNER JOIN datos_paciente AS d ON(n.cod_pa = d.cod_pa) "
                    + "WHERE n.n_orden = " + cod + agregarConsulta;
            //      System.out.println("la consulta es:"+Sql);

            oConn1.FnBoolQueryExecute(Sql);
            try {
                if (oConn1.setResult.next()) {
                    txtDniAlta.setText(oConn1.setResult.getString("cod_pa"));
                    txtNombresAlta.setText(oConn1.setResult.getString("nombres_pa"));
                    txtApellidosAlta.setText(oConn1.setResult.getString("apellidos_pa"));
                    cboEmpresa.setSelectedItem(oConn1.setResult.getString("razon_empresa"));
                    cboContrata.setSelectedItem(oConn1.setResult.getString("razon_contrata"));
                    txtMedico.setText(oConn1.setResult.getString("n_medico"));
                    txtCargoDesempenar.setText(oConn1.setResult.getString("cargo_de"));
                    cboArea.setSelectedItem(oConn1.setResult.getString("area_o"));
                    cboExamenMedico.setSelectedItem(oConn1.setResult.getString("nom_examen"));
                    cboExplotacion.setSelectedItem(oConn1.setResult.getString("nom_ex"));
                    cboMineralExp.setSelectedItem(oConn1.setResult.getString("mineral_po"));
                    cboAltura.setSelectedItem(oConn1.setResult.getString("altura_po"));
                    txtPrecio.setText(oConn1.setResult.getString("precio_po"));
                    txtFechaAlta.setDate(oConn1.setResult.getDate("fecha_apertura_po"));
                    txtNorden.setText(oConn1.setResult.getString("n_orden"));
                    cboFormaPago.setSelectedItem(oConn1.setResult.getString("tipo_pago"));
                    chkAltaFist.setSelected(oConn1.setResult.getBoolean("n_fisttest"));
                    chkAltaPsicosen.setSelected(oConn1.setResult.getBoolean("n_psicosen"));
                    chkAltaTestAltura.setSelected(oConn1.setResult.getBoolean("n_testaltura"));
                    chkAltaVisualCom.setSelected(oConn1.setResult.getBoolean("visual_compl"));
                    chkAltaTrabCal.setSelected(oConn1.setResult.getBoolean("trab_calientes"));
//                    chkAltaCovid1.setSelected(oConn1.sementos"));tResult.getBoolean("chkcovid1"));
//                    chkAltaCovid2.setSelected(oConn1.setResult.getBoolean("chkcovid2"));
                    chkAltaManipAlimen.setSelected(oConn1.setResult.getBoolean("manip_alimentos"));
                    txtNumColor.setText(oConn1.setResult.getString("color"));
                    txtGrupoSan.setText(oConn1.setResult.getString("grupofactorsan"));
                    jLabel44.setText(oConn1.setResult.getString("cod_clinica"));
                    txtObserv1.setText(oConn1.setResult.getString("txtobserv1"));
                    txtObserv2.setText(oConn1.setResult.getString("txtobserv2"));
                    cboTipoExamen.setSelectedItem(oConn1.setResult.getString("tipoprueba"));
                    jComboBoxProtocolos.setSelectedItem(oConn1.setResult.getString("protocolo"));
                    txtPrecioAdicional.setText(oConn1.setResult.getString("precio_adic"));
                    cboAutorizacion.setSelectedItem(oConn1.setResult.getString("autoriza"));
                    txtNOperacion.setText(oConn1.setResult.getString("n_operacion"));
                    chkAltaHerrMan.setSelected(oConn1.setResult.getBoolean("herra_manuales"));
                    chkAltaRXCDorso.setSelected(oConn1.setResult.getBoolean("rxc_dorso_lumbar"));
                    chkAltaRXCLumba.setSelected(oConn1.setResult.getBoolean("rxc_lumbar"));
                    chkAltaRXCLumbo.setSelected(oConn1.setResult.getBoolean("rxc_lumbosacra"));
                    chkAltaPlomoS.setSelected(oConn1.setResult.getBoolean("rxc_plomos"));
                    chkAltaMercO.setSelected(oConn1.setResult.getBoolean("mercurioo"));
                    if (nomsede.equals("Trujillo")) {
                        jLabel44.setText(txtNorden.getText() + " - T");
                    } else {
                        jLabel44.setText(txtNorden.getText() + " - H");
                    }
                    txtDniAlta.setEditable(false);
                    hBotones(true);

                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tbOcupacionalKeyReleased

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        jtRegistroGeneral.setSelectedIndex(1);
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseClicked
        jtRegistroGeneral.setSelectedIndex(1);
        txtDniAlta.setText(dni);
        txtDniAlta.requestFocus();
    }//GEN-LAST:event_btnGrabarMouseClicked

    private void txtBuscarCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodKeyReleased

        sbCargarOcupacional(txtBuscarCod.getText());

    }//GEN-LAST:event_txtBuscarCodKeyReleased

    private void txtNorden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNorden1ActionPerformed

        limpiarChk();
    }//GEN-LAST:event_txtNorden1ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "perimetro_toracico";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO perimetro_toracico(\n"
                    + "            n_orden, t_pelicula, fecha_perimetro)"
                    + " VALUES ('" + txtNorden1.getText() + "', 'NO PASO EXAMEN','" + lblFecha.getText() + "'";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox6.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "funcion_abs";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO funcion_abs(\n"
                    + "            n_orden, fecha_abs, interpretacion)"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "','NO PASO EXAMEN'";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.sqlStmt.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox5.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "audiometria_po";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO audiometria_po(\n"
                    + "            n_orden, fecha_au)"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "'";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "ficha_audiologica";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO ficha_audiologica("
                    + "            n_orden, fecha_examen, txtconclusiones)"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "','NO PASA EXAMEN' ";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "informe_electrocardiograma";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO informe_electrocardiograma(\n"
                    + "            n_orden, fecha_informe, hallazgo)\n"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "','NO PASA EXAMEN' ";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    public boolean elimina(String From) {
        boolean bResultado = false;
        int seleccion = JOptionPane.showOptionDialog(null, // Componente padre
                "¿Codigo Registrado Desea Eliminar?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Si", "No"},
                "Si");
        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                try {
                    String triaje = "DELETE FROM " + From + " WHERE n_orden=" + txtNorden1.getText();
                    if (oConn1.FnBoolQueryExecuteUpdate(triaje)) {
                        oFunc.SubSistemaMensajeInformacion("Eliminado Correctamente");
                        bResultado = true;
                        try {
                            oConn1.sqlStmt.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        oFunc.SubSistemaMensajeInformacion("No se pudo Eliminar Registro");
                        bResultado = true;
                    }
                    oConn1.setResult.close();
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // PRESIONO NO
            }
        }

        return bResultado;
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "lab_clinico";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO lab_clinico(\n"
                    + "tipo_servicio,n_orden, fecha_lab)"
                    + " VALUES ('NO PASO EXAMEN', '" + txtNorden1.getText() + "','" + lblFecha.getText() + "' ";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);

            jCheckBox1.setSelected(false);
        }


    }//GEN-LAST:event_jCheckBox1ActionPerformed
    public boolean OrdenExiste(String tabla, String orden) {
        boolean bResultado = false;
        String sQuery;
        sQuery = "Select n_orden from " + tabla + " Where n_orden=" + orden;
        //Ejecuta el Query
        oConn1.FnBoolQueryExecute(sQuery);
        // Capturo el Error
        try {
            // Verifico que haya habido resultados
            if (oConn1.setResult.next()) {
                // Resultado
                bResultado = true;
            }
            // Cierro los Resultados
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {

        }
        return bResultado;

    }
    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "certificacion_medica_altura";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO certificacion_medica_altura(\n"
                    + "            n_orden, fecha_certificacion,dni_user,observaciones)"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "','42664426','NO PASO EXAMEN' ";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        limpiarChk();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "odontograma";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO odontograma(\n"
                    + "            n_orden, fecha_od,txtobservaciones)"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "','NO PASO EXAMEN'";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "oftalmologia";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO oftalmologia(\n"
                    + "            n_orden, e_oculares, fecha_of)"
                    + " VALUES ('" + txtNorden1.getText() + "', 'NO PASO EXAMEN','" + lblFecha.getText() + "'";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void chkAltaVisualComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaVisualComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaVisualComActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        String tab;
        tab = "informe_psicologico";
        if (!OrdenExiste(tab, txtNorden1.getText())) {
            String strSqlStmt;
            strSqlStmt = "INSERT INTO informe_psicologico(\n"
                    + "            n_orden, fecha_entrevista,edad_inf,recomendaciones)"
                    + " VALUES ('" + txtNorden1.getText() + "', '" + lblFecha.getText() + "','0','NO PASO EXAMEN'";
            try {
                if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt.concat(") "))) {
                    oFunc.SubSistemaMensajeInformacion("Se ha registrado la Entrada con Éxito");

                } else {
                    oFunc.SubSistemaMensajeError("No se pudo registrar La Entrada");
                }
                oConn1.setResult.close();
                oConn1.sqlStmt.close();
            } catch (Exception e) {
            }
        } else {
            elimina(tab);
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void chkAltaTrabCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaTrabCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaTrabCalActionPerformed

    private void chkAltaManipAlimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaManipAlimenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaManipAlimenActionPerformed

    private void txtObserv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObserv1ActionPerformed
        // TODO add your handling code here:
        txtObserv2.requestFocus();
    }//GEN-LAST:event_txtObserv1ActionPerformed

    private void txtObserv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObserv2ActionPerformed
        // TODO add your handling code here:
        btnGrabar.requestFocus();
    }//GEN-LAST:event_txtObserv2ActionPerformed

    private void CargarinfoHotel() {
        try {
            jComboBoxHotel.setEnabled(false);
            String sQuery;
            // Prepara el Query
            sQuery = " select nombrehotel from infohoteles;";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {
                        // Obtiene los datos de la Consulta
                        jComboBoxHotel.addItem(oConn1.setResult.getString("nombrehotel"));

                    }

                    // Cierra Resultados
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeInformacion(ex.toString());
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();

            // selecciona
            cboTipoExamen.setSelectedIndex(0);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CargarTipoExamenes() {
        try {
            String sQuery;
            // Prepara el Query
            sQuery = "select descripcion from tipoPruebas;";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {
                        // Obtiene los datos de la Consulta
                        cboTipoExamen.addItem(oConn1.setResult.getString("descripcion"));

                    }

                    // Cierra Resultados
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeInformacion(ex.toString());
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();

            // selecciona
            cboTipoExamen.setSelectedIndex(1);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cboTipoExamenPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboTipoExamenPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cboTipoExamenPopupMenuWillBecomeInvisible

    private void cboTipoExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoExamenActionPerformed
        cboTipoExamen.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboTipoExamen.getSelectedIndex() <= -1) {

                } else {

                    //            txtpass.requestFocus();
                }

            }
        });
    }//GEN-LAST:event_cboTipoExamenActionPerformed

    private void cboTipoExamenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboTipoExamenKeyPressed

    }//GEN-LAST:event_cboTipoExamenKeyPressed

    private void tbOcupacionalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbOcupacionalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbOcupacionalKeyPressed

    private void txtBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCodActionPerformed
        sbCargarOcupacional(txtBuscarCod.getText());
    }//GEN-LAST:event_txtBuscarCodActionPerformed

    private void txtBuscarCodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodMousePressed
        // sbCargarOcupacional(txtBuscarCod.getText());   
    }//GEN-LAST:event_txtBuscarCodMousePressed

    private void txtBuscarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreMousePressed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void cboTipoExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTipoExamenMouseClicked
        if (cboTipoExamen.getSelectedItem().toString().equals("PC")) {
            jComboBoxHotel.setEnabled(true);
        } else {
            jComboBoxHotel.setEnabled(false);
        }

    }//GEN-LAST:event_cboTipoExamenMouseClicked

    private void cboTipoExamenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTipoExamenMousePressed
        if (cboTipoExamen.getSelectedItem().toString().equals("PC"))
            jComboBoxHotel.setEnabled(true);
        else
            jComboBoxHotel.setEnabled(false);
    }//GEN-LAST:event_cboTipoExamenMousePressed
    private void cargarProtocolos() {
        try {
            String sQuery;
            // Prepara el Query
            sQuery = "select nombreprotocolo from protocolo";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    // Verifica resultados
                    while (oConn1.setResult.next()) {
                        // Obtiene los datos de la Consulta
                        jComboBoxProtocolos.addItem(oConn1.setResult.getString("nombreprotocolo"));
                    }
                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeInformacion(ex.toString());
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
            // selecciona
            // cboProtocolo.setSelectedItem(seded);
            jComboBoxProtocolos.setSelectedIndex(0);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void cboTipoExamenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTipoExamenMouseEntered
        if (cboTipoExamen.getSelectedItem().toString().equals("PC"))
            jComboBoxHotel.setEnabled(true);
        else
            jComboBoxHotel.setEnabled(false);
    }//GEN-LAST:event_cboTipoExamenMouseEntered

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        if (jCheckBox11.isSelected()) {
            agregarConsulta = "";
            agregarConsulta = " and n.cod_sede=" + codigosede;
            sbCargarOcupacional("");
        } else {
            agregarConsulta = "";
            sbCargarOcupacional("");
        }

    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void txtGSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGSActionPerformed

    private void chkimportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkimportActionPerformed
        if (chkimport.isSelected()) {
            cargarDatosPaciente();
        }
    }//GEN-LAST:event_chkimportActionPerformed

    private void txtEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyPressed

    }//GEN-LAST:event_txtEmpresaKeyPressed

    private void txtEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpresaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String entradaUsuario = JOptionPane.showInputDialog("Introduzca Ruc de la empresa:");
        System.out.println(entradaUsuario);
        rucempresa = entradaUsuario;
        CargarEmpreaRuc();
        if (nombreempresa.length() > 1) {
            JOptionPane.showMessageDialog(null, nombreempresa);
            cboEmpresa.setSelectedItem(nombreempresa);

        } else {
            JOptionPane.showMessageDialog(null, "NO HAY EMPRESA");
        }

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        String entradaUsuario = JOptionPane.showInputDialog("Introduzca Ruc de la Contrata:");
        ruccontrata = entradaUsuario;
        CargarContrataRuc();
        if (nombrecontrata.length() > 1) {
            JOptionPane.showMessageDialog(null, nombrecontrata);
            cboContrata.setSelectedItem(nombrecontrata);

        } else {
            JOptionPane.showMessageDialog(null, "NO HAY CONTRATA");
        }

    }//GEN-LAST:event_jLabel16MouseClicked

    private void btnAddOcupacion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddOcupacion3MouseClicked
        MostrarAgregarProtocolo();
    }//GEN-LAST:event_btnAddOcupacion3MouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarVentana();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboFormaPagoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboFormaPagoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboFormaPagoPopupMenuWillBecomeInvisible

    private void cboFormaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFormaPagoActionPerformed
        // TODO add your handling code here:
        cboFormaPago.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboFormaPago.getSelectedIndex() <= -1) {

                }else if(cboFormaPago.getSelectedIndex() == 2) {
                    txtNOperacion.requestFocusInWindow();
                    txtNOperacion.setEnabled(true);
                }else {
                    cboAutorizacion.requestFocusInWindow();
                    
                }

            }
        });
    }//GEN-LAST:event_cboFormaPagoActionPerformed

    private void txtPrecioAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioAdicionalActionPerformed
        // TODO add your handling code here:
        cboFormaPago.requestFocus();
    }//GEN-LAST:event_txtPrecioAdicionalActionPerformed

    private void cboAutorizacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboAutorizacionPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAutorizacionPopupMenuWillBecomeInvisible

    private void cboAutorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAutorizacionActionPerformed
        // TODO add your handling code here:
        cboAutorizacion.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboAutorizacion.getSelectedIndex() <= -1) {

                } else {
                    txtObserv1.requestFocusInWindow();
                }

            }
        });
    }//GEN-LAST:event_cboAutorizacionActionPerformed

    private void cboFormaPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboFormaPagoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cboFormaPagoMouseClicked

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = (key >= 46 && key <= 57);
        if (numeros) {
            if(key==46){
                String dato=txtPrecioAdicional.getText();
                int trama=dato.length();
                for (int i = 0; i <= trama; i++) {
                    if(dato.contains("."))
                        evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                }
            }if(key==47){
                evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
           
        }else{
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            evt.consume();
//            oFunc.SubSistemaMensajeError("SOLO ADMITE NUMEROS");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioAdicionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioAdicionalKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = (key >= 46 && key <= 57);

        if (numeros) {
            if(key==46){
                String dato=txtPrecioAdicional.getText();
                int trama=dato.length();
                for (int i = 0; i <= trama; i++) {
                    if(dato.contains("."))
                        evt.setKeyChar((char)KeyEvent.VK_CLEAR);
                }
            }if(key==47){
                evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
           
        }else{
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            evt.consume();
//            oFunc.SubSistemaMensajeError("SOLO ADMITE NUMEROS");
        }
    }//GEN-LAST:event_txtPrecioAdicionalKeyTyped

    private void txtContrataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrataMouseClicked
        // TODO add your handling code here:
        if (ExiteEmpresa()) {
            txtContrata.requestFocus();
        } else {
            oFunc.SubSistemaMensajeError("EMPRESA NO REGISTRADA. DEBE REGISTRAR");
            txtEmpresa.requestFocus();
        }
    }//GEN-LAST:event_txtContrataMouseClicked

    private void txtMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicoKeyPressed

    private void txtMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMedicoMouseClicked
        // TODO add your handling code here:
        if (ExiteEmpresa()) {
            if (ExiteContrata()) {
                txtMedico.requestFocus();
             }else{
                 cboEmpresa.requestFocus();
                 txtMedico.setText(null);
             }
        } else {
            oFunc.SubSistemaMensajeError("EMPRESA NO REGISTRADA. DEBE REGISTRAR");
            cboEmpresa.requestFocus();
            txtMedico.setText(null);
        }
        if (ExiteContrata()) {
             if (ExiteEmpresa()) {
                txtMedico.requestFocus();
             }else{
                 cboEmpresa.requestFocus();
                 txtMedico.setText(null);
             }
        } else {
            oFunc.SubSistemaMensajeError("CONTRATA NO REGISTRADA. DEBE REGISTRAR");
            cboContrata.requestFocus();
            txtMedico.setText(null);
        }
    }//GEN-LAST:event_txtMedicoMouseClicked

    private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
        // TODO add your handling code here:
        
        cboEmpresa.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
    
               if (cboEmpresa.getSelectedIndex() <= -1) {
                   cboEmpresa.getEditor().getEditorComponent().setBackground(Color.red);
        ((JTextField) cboEmpresa.getEditor().getEditorComponent()).setOpaque(true);
//        cargarEmpresas();
                } else {
                    cboContrata.requestFocus();
                    cboEmpresa.getEditor().getEditorComponent().setBackground(Color.WHITE);
        ((JTextField) cboEmpresa.getEditor().getEditorComponent()).setOpaque(true);
                }
               
            }
        });
    }//GEN-LAST:event_cboEmpresaActionPerformed

    private void cboContrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboContrataActionPerformed
        // TODO add your handling code here:
        cboContrata.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cboContrata.getSelectedIndex() <= -1) {
                    cboContrata.getEditor().getEditorComponent().setBackground(Color.red);
        ((JTextField) cboContrata.getEditor().getEditorComponent()).setOpaque(true);
//        cargarEmpresas();
                } else {
                    txtMedico.requestFocus();
                    cboContrata.getEditor().getEditorComponent().setBackground(Color.WHITE);
        ((JTextField) cboContrata.getEditor().getEditorComponent()).setOpaque(true);
                }
                
            }
        });
    }//GEN-LAST:event_cboContrataActionPerformed

    private void cboContrataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboContrataMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cboContrataMouseClicked

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox12.isSelected()) {
            txtCargoDesempenar.setEnabled(false);
            cboArea.setEnabled(false);
            cboAltura.setEnabled(false);
            cboMineralExp.setEnabled(false);
            cboExplotacion.setEnabled(false);
            txtMedico.setEnabled(false);
            txtPrecioAdicional.setEnabled(false);
            cboAutorizacion.setEnabled(false);
            cboFormaPago.setSelectedIndex(1);
            cboEmpresa.setSelectedItem("MINERA AURIFERA RETAMAS S.A.");
            cboExamenMedico.setSelectedItem("PRUEBA CUALITATIVA ANTIGENOS");
            cboContrata.requestFocus();
        } else {
            txtCargoDesempenar.setEnabled(true);
            cboArea.setEnabled(true);
            cboAltura.setEnabled(true);
            cboMineralExp.setEnabled(true);
            cboExplotacion.setEnabled(true);
            txtMedico.setEnabled(true);
            txtPrecioAdicional.setEnabled(true);
            cboAutorizacion.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void txtNOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOperacionActionPerformed
        // TODO add your handling code here:
        cboAutorizacion.requestFocusInWindow();
    }//GEN-LAST:event_txtNOperacionActionPerformed

    private void txtNOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNOperacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOperacionKeyTyped

    private void txtProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaActionPerformed
        // TODO add your handling code here:
        txtDistrito.requestFocus();
    }//GEN-LAST:event_txtProvinciaActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
        txtCaserio.requestFocus();
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void txtCaserioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaserioActionPerformed
        // TODO add your handling code here:
        txtCelular.requestFocus();
    }//GEN-LAST:event_txtCaserioActionPerformed

    private void chkAltaHerrManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaHerrManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaHerrManActionPerformed

    private void chkAltaRXCLumbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaRXCLumbaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaRXCLumbaActionPerformed

    private void chkAltaRXCDorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaRXCDorsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaRXCDorsoActionPerformed

    private void chkAltaRXCLumboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaRXCLumboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaRXCLumboActionPerformed

    private void chkAltaPlomoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaPlomoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaPlomoSActionPerformed

    private void chkAltaMercOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAltaMercOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAltaMercOActionPerformed

    private void chkAltaFistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkAltaFistMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_chkAltaFistMousePressed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel22MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     try {
             comunirApi();
             gabrarHistoria();
    } catch (Exception ex) {
             Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void printer(Integer cod) {

        Map parameters = new HashMap();
        parameters.put("Norden", cod);

        try {
            String c = cboExamenMedico.getSelectedItem().toString();
            String empresa = cboEmpresa.getSelectedItem().toString().trim();
            if (("MINERA BARRICK MISQUICHILCA SA".equals(empresa) && "RETIRO".equals(c)) || "LA ARENA S.A.".equals(empresa) && "RETIRO".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ReporteExamenR.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            } else if ("ANUAL".equals(c) || "PRE-OCUPACIONAL".equals(c) || "RETIRO".equals(c) || "REUBICACION".equals(c)|| "REINCORPORACION".equals(c)) {

               String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ReporteExamen1.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);
            }
            
            if ("TEST-ALTURA".equals(c) && !chkAltaPsicosen.isSelected() && "LA ARENA S.A.".equals(empresa)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            } else if ("TEST-ALTURA".equals(c) && !chkAltaPsicosen.isSelected()) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura2.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            }

            if ("PSICOSENSOMETRIA".equals(c) && !chkAltaTestAltura.isSelected() || "FIST-TEST".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Psicosensometria.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            }
            if (("TEST-ALTURA".equals(c) && chkAltaPsicosen.isSelected()) || ("PSICOSENSOMETRIA".equals(c) && chkAltaTestAltura.isSelected())) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura1.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            }
            if ("ANEXO 16A".equals(c) || "ANEXO-C".equals(c) || "ANEXO-7D".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Admision7D.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            }
            if ("COVID-19".equals(c) || "ALTA-EPIDEMIOLOGICA".equals(c) || "COVID-19 CUANTITATIVA".equals(c)
                    || c.contains("CUALITATIVA ANTI") || c.contains("CUANTITATIVA ANTI")
                    || "PRUEBA CUANTITATIVA ANTIGENOS".equals(c) || c.contains("PRUEBA CUALITATIVA ANTIGENOS+CONSULTA MEDICA")
                    || c.contains("CONSTANCIA DE ALTA MEDICA + DESCANSO MEDICO") || c.contains("MOLECULAR")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Covid19.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("LABORATORIO CLINICO") || c.equals("CONSULTA MEDICA")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "labClinico.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta de Laboratorio Clinico");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("RAYOS X")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "RayosX.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta de Laboratorio Clinico");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("ECOGRAFIAS") ) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ECOGRAFIA.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta de Laboratorio Clinico");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if ("FACTORES DE RIESGO".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "factoresRiesgo.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta factores de riesgo");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if ("SUCAMEC LICENCIA DE ARMAS".equals(c) || "SUCAMEC FOTOCHECK".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "sucamec.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta sucamec");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if ("ASISTENCIAL".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Asistencial.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta Asistencial");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if ("MANIPULADOR-ALIMENTOS".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ManipuladorAlimentos.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperPrintManager.printReport(myPrint, true);

                //JasperViewer viewer = new JasperViewer(myPrint, false);
                //viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                //viewer.setVisible(true);
            }

        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void print(Integer cod) {

        Map parameters = new HashMap();
        parameters.put("Norden", cod);

        try {
            String c = cboExamenMedico.getSelectedItem().toString();
            String empresa = cboEmpresa.getSelectedItem().toString();
            if (("MINERA BARRICK MISQUICHILCA SA".equals(empresa) && "RETIRO".equals(c)) || "LA ARENA S.A.".equals(empresa) && "RETIRO".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ReporteExamenR.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                //  JasperPrintManager.printReport(myPrint,true);

                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                //viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            } else if ("ANUAL".equals(c) || "PRE-OCUPACIONAL".equals(c) || "RETIRO".equals(c) || "REUBICACION".equals(c)|| "REINCORPORACION".equals(c)) {

                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ReporteExamen1.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }

            if ("TEST-ALTURA".equals(c) && !chkAltaPsicosen.isSelected() && "LA ARENA S.A.".equals(empresa)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            } else if ("TEST-ALTURA".equals(c) && !chkAltaPsicosen.isSelected()) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura2.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }

            if ("PSICOSENSOMETRIA".equals(c) && !chkAltaTestAltura.isSelected() || "FIST-TEST".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Psicosensometria.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            if (("TEST-ALTURA".equals(c) && chkAltaPsicosen.isSelected()) || ("PSICOSENSOMETRIA".equals(c) && chkAltaTestAltura.isSelected())) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "TestAltura1.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            if ("ANEXO 16A".equals(c) || "ANEXO-C".equals(c) || "ANEXO-7D".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Admision7D.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            if ("COVID-19".equals(c) || "ALTA-EPIDEMIOLOGICA".equals(c) || "COVID-19 CUANTITATIVA".equals(c)
                    || c.contains("CUALITATIVA ANTI") || c.contains("CUANTITATIVA ANTI")
                    || "PRUEBA CUANTITATIVA ANTIGENOS".equals(c) || c.contains("ANTIGENOS")
                    || c.contains("CONSTANCIA DE ALTA MEDICA + DESCANSO MEDICO") || c.contains("MOLECULAR")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Covid19.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            if ("MANIPULADOR-ALIMENTOS".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ManipuladorAlimentos.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);
                JasperViewer viewer = new JasperViewer(myPrint, false);
                viewer.setTitle("Hoja de Ruta EXAMENES OCUPACIONALES");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
            }
            if (c.contains("FACTORES DE RIESGO")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "factoresRiesgo.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta factores de riesgo");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("LABORATORIO CLINICO") || c.equals("CONSULTA MEDICA")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "labClinico.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta de Laboratorio Clinico");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("RAYOS X")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "RayosX.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta de Laboratorio Clinico");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("ECOGRAFIAS") ) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "ECOGRAFIA.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta de Laboratorio Clinico");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if ("SUCAMEC LICENCIA DE ARMAS".equals(c) || "SUCAMEC FOTOCHECK".equals(c)) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "sucamec.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta sucamec");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
            if (c.contains("ASISTENCIAL")) {
                String direccionReporte = System.getProperty("user.dir") + File.separator + "reportes" + File.separator + "Asistencial.jasper";
                JasperReport myReport = (JasperReport) JRLoader.loadObjectFromFile(direccionReporte);
                JasperPrint myPrint = JasperFillManager.fillReport(myReport, parameters, clsConnection.oConnection);

                JasperViewer viewer = new JasperViewer(myPrint, false);

                viewer.setTitle("Hoja de Ruta Asistencial");
                // viewer.setAlwaysOnTop(true);
                viewer.setVisible(true);
                JasperPrintManager.printReport(myPrint, true);

            }
        } catch (JRException ex) {
            Logger.getLogger(Odontograma.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addcontrata(String sDatos) {
        cboContrata.setSelectedItem(sDatos);

    }

    public void addDni(String sDatos) {
        txtDniAlta.setText(sDatos);
        cboEmpresa.requestFocus();
    }

    public void addNombre(String sDatos) {
        txtNombresAlta.setText(sDatos);
        cboEmpresa.requestFocus();
    }

    public void addApellido(String sDatos) {
        txtApellidosAlta.setText(sDatos);
        cboEmpresa.requestFocus();
    }

    public void addempresa(String sDatos) {
        cboEmpresa.setSelectedItem(sDatos);

    }

    public void addprotocolo(String sDatos) {
        jComboBoxProtocolos.setSelectedItem(sDatos);

    }

    public void MostrarAgregarEmpresa() {
        addEmpresa = new AgregarEmpresa(this, true);
        addEmpresa.setVisible(true);

    }

    public void MostrarAgregarProtocolo() {
        addProtocolo = new AgregarProtocolo(this, true);
        addProtocolo.setVisible(true);

    }

    public void MostrarAgregarContrata() {
        addContrata = new AgregarContrata(this, true);
        addContrata.setVisible(true);

    }

    private void agregaractualizar() {

        try {
            String strSqlStmt;
            strSqlStmt = "Update datos_paciente set nombres_pa = '" + txtNombre.getText()
                    + "',apellidos_pa = '" + txtApellidos.getText()
                    + "',fecha_nacimiento_pa = '" + FechaNacimiento.getDate().toGMTString()
                    + "',sexo_pa = '" + cboSexo.getSelectedItem().toString()
                    + "',email_pa = '" + txtEmail.getText()
                    + "',lugar_nac_pa = '" + txtLugarNacimiento.getText()
                    + "',nivel_est_pa = '" + cboNivelEstudio.getSelectedItem().toString()
                    + "',ocupacion_pa = '" + cboProfesion.getSelectedItem().toString()
                    + "',estado_civil_pa = '" + cboEstadoCivil.getSelectedItem().toString()
                    + "',direccion_pa = '" + txtDireccion.getText()
                    + "',departamento_pa = '" + cboDepartamento.getSelectedItem().toString()
                    + "',provincia_pa = '" + txtProvincia.getText()
                    + "',distrito_pa = '" + txtDistrito.getText()
                    + "',caserio_pa = '" + txtCaserio.getText()
                    + "',tel_casa_pa = '" + txtTelefonoCasa.getText()
                    + //"',tel_trabajo_pa = '"+txtTelefonoTrabajo.getText()+
                    "',cel_pa = '" + txtCelular.getText();
            strSqlStmt += "' Where cod_pa = '" + txtDni.getText() + "'";

            if (oConn1.FnBoolQueryExecuteUpdate(strSqlStmt)) {
                limpiar();
                deshabilitar();
                btnAgregar.setEnabled(false);
                txtDni.requestFocus();
                ckbSinDni.setSelected(false);
                oFunc.SubSistemaMensajeInformacion("Se ha actualizado la Entrada con Éxito");
                try {
                    oConn1.sqlStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                oFunc.SubSistemaMensajeError("No se pudo Agregar La Entrada");
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//////////////////////////////////////////////////////////////////////////////////////////////

    void sbCargarOcupacional(String valor) {

        try {
            String[] titulos = {"N°Orden", "Nombres", "Fecha", "Empresa", "Contrata", "T.Examen", "F.Aptitud"};
            String[] registros = new String[7];
            model = new DefaultTableModel(null, titulos) {
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            };
            String Sql;
            if (!txtBuscarCod.getText().isEmpty()) {
                // System.out.println("si es este el error ");
                Sql = "select d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,"
                        + "n.n_orden,n.razon_empresa,n.razon_contrata,n.nom_examen,ca.n_orden as aptitud,"
                        + "a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc, "
                        + "bc.n_orden as conduccion,ba.n_orden as altura,csm.n_orden as covid,ctc.n_orden as tamizaje  "
                        + "FROM datos_paciente AS d "
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                        + "left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden) "
                        + " left join anexo7d as a ON (a.n_orden=n.n_orden)"
                        + " left join anexoc as ac ON (ac.n_orden=n.n_orden)"
                        + " left join observaciones as o ON (o.n_orden=n.n_orden)\n"
                        + " left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
                        + " left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"
                        + " left join constancia_salud_marsa as csm ON (csm.n_orden=n.n_orden)"
                        + " left join constancia_tamizaje_covid19 as ctc ON (n.n_orden=ctc.n_orden)"
                        + "where n.n_orden=" + valor + agregarConsulta;
            } else {
                Sql = "select d.nombres_pa||' '||d.apellidos_pa AS nombres, n.fecha_apertura_po,"
                        + "n.n_orden,n.razon_empresa,n.razon_contrata,n.nom_examen,ca.n_orden as aptitud,"
                        + "a.n_orden as anexo7d,o.n_orden as observados,ac.n_orden as anexoc, "
                        + "bc.n_orden as conduccion,ba.n_orden as altura,csm.n_orden as covid,ctc.n_orden as tamizaje  "
                        + "FROM datos_paciente AS d "
                        + "INNER JOIN n_orden_ocupacional AS n ON (d.cod_pa = n.cod_pa) "
                        + "left join certificado_aptitud_medico_ocupacional as ca ON (ca.n_orden=n.n_orden) "
                        + " left join anexo7d as a ON (a.n_orden=n.n_orden)"
                        + " left join anexoc as ac ON (ac.n_orden=n.n_orden)"
                        + " left join observaciones as o ON (o.n_orden=n.n_orden)\n"
                        + " left join b_certificado_conduccion as bc ON (bc.n_orden=n.n_orden)"
                        + " left join b_certificado_altura as ba ON (ba.n_orden=n.n_orden)"
                        + " left join constancia_salud_marsa as csm ON (csm.n_orden=n.n_orden)"
                        + " left join constancia_tamizaje_covid19 as ctc ON (n.n_orden=ctc.n_orden)"
                        + "where CONCAT(nombres_pa,' ',apellidos_pa) LIKE '%" + valor + "%' " + agregarConsulta
                        + " order by n.n_orden desc limit 40";
            }
            //    System.out.println("la consulta es:"+Sql);
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
                        String s = oConn1.setResult.getString("aptitud");
                        String a = oConn1.setResult.getString("anexo7d");
                        String o = oConn1.setResult.getString("observados");
                        String ac = oConn1.setResult.getString("anexoc");
                        String bc = oConn1.setResult.getString("conduccion");
                        String ba = oConn1.setResult.getString("altura");
                        String csm = oConn1.setResult.getString("covid");
                        String ctc = oConn1.setResult.getString("tamizaje");
                        if (s != null) {
                            registros[6] = "COMPLETO";
                        } else if (a != null && "ANEXO-7D".equals(exa)) {
                            registros[6] = "COMPLETO";
                        } else if (o != null) {
                            registros[6] = "OBSERVADO";
                        } else if (ac != null && "ANEXO-C".equals(exa)) {
                            registros[6] = "COMPLETO";
                        } else if (bc != null && "PSICOSENSOMETRIA".equals(exa)) {
                            registros[6] = "COMPLETO";
                        } else if (ba != null && "TEST-ALTURA".equals(exa)) {
                            registros[6] = "COMPLETO";
                        } else if (csm != null && ("COVID-19".equals(exa) || "COVID-19 CUANTITATIVA".equals(exa))) {
                            registros[6] = "COMPLETO";
                        } else if (ctc != null && ("COVID-19".equals(exa) || "COVID-19 CUANTITATIVA".equals(exa))) {
                            registros[6] = "COMPLETO";
                        } else {
                            registros[6] = "FALTA";
                        }
                        tbOcupacional.setDefaultRenderer(Object.class, new MyCellRenderer());
                        model.addRow(registros);
                    }

                    // Coloca el Modelo de Nueva Cuenta
                    tbOcupacional.setModel(model);
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
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public class MyCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            boolean valid = String.valueOf(table.getValueAt(row, 6)).equals("COMPLETO");
            boolean valid1 = String.valueOf(table.getValueAt(row, 6)).equals("OBSERVADO");
            component.setBackground(valid ? Color.green : valid1 ? Color.ORANGE : Color.RED);

//        component.setForeground(valid ? Color.blue : Color.white);
            return component;
        }
    }

    void tabla() {
        tbOcupacional.setFont(new java.awt.Font("Tahoma", 0, 11));
        tbOcupacional.setModel(model);
        tbOcupacional.setSelectionForeground(Color.BLUE);
        tbOcupacional.getColumnModel().getColumn(0).setPreferredWidth(30);
//      tbOcupacional.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbOcupacional.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbOcupacional.getTableHeader().setReorderingAllowed(false);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarEx;
    private javax.swing.JButton BtnEditarEx;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.ButtonGroup bgFS;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.ButtonGroup btGS;
    private javax.swing.JLabel btnAddOcupacion;
    private javax.swing.JLabel btnAddOcupacion1;
    private javax.swing.JLabel btnAddOcupacion2;
    private javax.swing.JLabel btnAddOcupacion3;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel btnAreaOcupacional;
    private javax.swing.JLabel btnCargo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnGuardarAperturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiarApertura;
    private javax.swing.JLabel btnMineralEx;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboAltura;
    private javax.swing.JComboBox cboArea;
    private javax.swing.JComboBox cboAutorizacion;
    private javax.swing.JComboBox cboCaserio;
    private javax.swing.JComboBox<String> cboContrata;
    private javax.swing.JComboBox cboDepartamento;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox<String> cboEmpresa;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JComboBox cboExamenMedico;
    private javax.swing.JComboBox cboExplotacion;
    private javax.swing.JComboBox cboFormaPago;
    private javax.swing.JComboBox cboMineralExp;
    private javax.swing.JComboBox cboNivelEstudio;
    private javax.swing.JComboBox cboProfesion;
    private javax.swing.JComboBox cboProvincia;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JComboBox cboTipoExamen;
    private javax.swing.JCheckBox chkAltaFist;
    private javax.swing.JCheckBox chkAltaHerrMan;
    private javax.swing.JCheckBox chkAltaManipAlimen;
    private javax.swing.JCheckBox chkAltaMercO;
    private javax.swing.JCheckBox chkAltaPlomoS;
    private javax.swing.JCheckBox chkAltaPsicosen;
    private javax.swing.JCheckBox chkAltaRXCDorso;
    private javax.swing.JCheckBox chkAltaRXCLumba;
    private javax.swing.JCheckBox chkAltaRXCLumbo;
    private javax.swing.JCheckBox chkAltaTestAltura;
    private javax.swing.JCheckBox chkAltaTrabCal;
    private javax.swing.JCheckBox chkAltaVisualCom;
    private javax.swing.JCheckBox chkPrecio;
    private javax.swing.JCheckBox chkimport;
    private javax.swing.JCheckBox ckbSinDni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBoxHotel;
    private javax.swing.JComboBox<String> jComboBoxProtocolos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpOcupacional;
    private javax.swing.JTabbedPane jtRegistroGeneral;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable tbOcupacional;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosAlta;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtCargoDesempenar;
    private javax.swing.JTextField txtCaserio;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContrata;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniAlta;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtFactorSan;
    private javax.swing.JLabel txtFecha;
    private com.toedter.calendar.JDateChooser txtFechaAlta;
    private javax.swing.JTextField txtGS;
    private javax.swing.JTextField txtGrupoSan;
    private javax.swing.JTextField txtHistorial;
    private javax.swing.JLabel txtHora;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNOperacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombresAlta;
    private javax.swing.JLabel txtNorden;
    private javax.swing.JTextField txtNorden1;
    private javax.swing.JLabel txtNumColor;
    private javax.swing.JTextField txtObserv1;
    private javax.swing.JTextField txtObserv2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioAdicional;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefonoCasa;
    // End of variables declaration//GEN-END:variables
    public void fecha() {
        Date dateHoy = new Date();
//Date dateHora = new Date();    
        // Variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("hh:mm:ss a");
        // Inicializa Folio y Fecha
        lblFecha.setText(formato.format(dateHoy));
        // lblHora.setText(FormatoHora.format(dateHora));
        txtFecha.setText(formato.format(dateHoy));
        // txtHora.setText(FormatoHora.format(dateHora));
        txtFechaAlta.setDate(dateHoy);

    }

    public void fecha1() {
        Date dateHoy = new Date();
//Date dateHora = new Date();    
        // Variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat FormatoHora = new SimpleDateFormat("hh:mm:ss a");
        // Inicializa Folio y Fecha
        //    lblFecha.setText(formato.format(dateHoy));
        // lblHora.setText(FormatoHora.format(dateHora));
        //    txtFecha.setText(formato.format(dateHoy));
        // txtHora.setText(FormatoHora.format(dateHora));
        txtFechaAlta.setDate(dateHoy);
    }
    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date HorNew = new Date();
            SimpleDateFormat fechaforma = new SimpleDateFormat("hh:mm:ss a");
            String FfechaSystemA = fechaforma.format(HorNew);

            GestorTime.setFfechaSystem(FfechaSystemA);
            lblHora.setText(GestorTime.getFfechaSystem());
            txtHora.setText(GestorTime.getFfechaSystem());
        }
    });

    public void CargarProfesionOcupacion() {
        try {
            cboProfesion.removeAllItems();
            String sQuery;
            // Prepara el Query
            sQuery = "SELECT ocupacion_pa FROM ocupaciones_pa";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {

                    while (oConn1.setResult.next()) {
                        cboProfesion.addItem(oConn1.setResult.getString("ocupacion_pa"));

                    }

                    // Cierra Resultados
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());

                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CargarAreaOcupacional() {
        try {
            cboArea.removeAllItems();
            String sQuery;
            // Prepara el Query
            sQuery = "SELECT area_o FROM area_ocupacional";

            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {

                    while (oConn1.setResult.next()) {
                        cboArea.addItem(oConn1.setResult.getString("area_o"));

                    }

                    // Cierra Resultados
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());

                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarEmpresas() {
        try {
            cboEmpresa.removeAllItems();
            String sQuery;
            // Prepara el Query
            sQuery = "SELECT razon_empresa FROM empresas";
            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    while (oConn1.setResult.next()) {
                        cboEmpresa.addItem(oConn1.setResult.getString("razon_empresa"));
                    }
                    // Cierra Resultados
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarContratas() {
        try {
            cboContrata.removeAllItems();
            String sQuery;
            // Prepara el Query
            sQuery = "SELECT razon_contrata FROM contratas";
            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    while (oConn1.setResult.next()) {
                        cboContrata.addItem(oConn1.setResult.getString("razon_contrata"));
                    }
                    // Cierra Resultados
                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean ValidarRegistro() {
        // Variable de Resultado
        boolean bResultado = true;

        if (txtDni.getText().isEmpty()) {
            bResultado = false;
        } else if (txtNombre.getText().isEmpty()) {
            bResultado = false;
        } else if (txtApellidos.getText().isEmpty()) {
            bResultado = false;
        } else if (((JTextField) FechaNacimiento.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha de Nacimiento");
            bResultado = false;
        } else if (cboSexo.getSelectedIndex() <= -1) {
            bResultado = false;
        } else if (txtLugarNacimiento.getText().trim().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Lugar de Nacimiento");
            bResultado = false;
        } else if (cboNivelEstudio.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese Nivel de Estudio");
            bResultado = false;
        } else if (cboProfesion.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese Profesión");
            bResultado = false;
        } else if (cboEstadoCivil.getSelectedIndex() <= -1) {
            oFunc.SubSistemaMensajeError("Ingrese Estado Civil");
            bResultado = false;
        } else if (txtDireccion.getText().trim().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese su Dirección");
            bResultado = false;
        } else if (cboDepartamento.getEditor().getItem().toString().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Departamento");
            bResultado = false;
        } else if (txtDistrito.getText().trim().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese Distrito");
            bResultado = false;
        } else if (txtTelefonoCasa.getText().isEmpty() && txtCelular.getText().isEmpty()) {
            oFunc.SubSistemaMensajeError("Ingrese número Fijo i/o Celular");
            bResultado = false;
        }

        return bResultado;
    }

    private void generarcod() {
        try {
            String sQuery;
            sQuery = "SELECT count(cod_aleatorio_pa)+1 as aleatorio from datos_paciente";
            if (oConn1.FnBoolQueryExecute(sQuery)) {
                try {
                    while (oConn1.setResult.next()) {
                        txtDni.setText(oConn1.setResult.getString("aleatorio"));
                    }
                    oConn1.setResult.close();
                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();

            //    txtDni.setBackground(Color.lightGray);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deshabilitarbotones() {
        txtHistorial.setVisible(false);
        btnEditar.setEnabled(false);
        btnGrabar.setEnabled(false);
        btnNuevo.setEnabled(false);

    }

    private void deshabilitar() {

        txtDni.setEnabled(true);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        //txtTelefonoTrabajo.setEnabled(false);
        txtTelefonoCasa.setEnabled(false);
        btnEditar.setEnabled(true);
        txtLugarNacimiento.setEnabled(false);
        txtEmail.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCelular.setEnabled(false);
        cboSexo.setEnabled(false);
        cboProvincia.setEnabled(false);
        txtProvincia.setEnabled(false);
        cboProfesion.setEnabled(false);
        cboNivelEstudio.setEnabled(false);
        cboEstadoCivil.setEnabled(false);
        cboDistrito.setEnabled(false);
        txtDistrito.setEnabled(false);
        cboDepartamento.setEnabled(false);
        cboCaserio.setEnabled(false);
        txtCaserio.setEnabled(false);
        btnAddOcupacion.setVisible(false);
        FechaNacimiento.setEnabled(false);
        txtGrupoSan.setEnabled(false);
        txtFactorSan.setEnabled(false);

    }

    private void limpiar() {
        txtDni.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        // txtTelefonoTrabajo.setText("");
        txtTelefonoCasa.setText("");

        txtLugarNacimiento.setText("");
        txtEmail.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        cboSexo.setSelectedIndex(-1);
        cboProvincia.setSelectedIndex(-1);
        txtProvincia.setText(null);
        cboProfesion.setSelectedIndex(-1);
        cboNivelEstudio.setSelectedIndex(-1);
        cboEstadoCivil.setSelectedIndex(-1);
        cboDistrito.setSelectedIndex(-1);
        txtDistrito.setText(null);
        cboDepartamento.setSelectedIndex(-1);
        cboCaserio.setSelectedIndex(-1);
        txtCaserio.setText(null);
        FechaNacimiento.setDate(null);
        txtHistorial.setText("");
    }

    private void habilitar() {
        txtDni.setEnabled(false);
        txtApellidos.setEnabled(true);
        txtNombre.setEnabled(true);
        // txtTelefonoTrabajo.setEnabled(true);
        txtTelefonoCasa.setEnabled(true);

        txtLugarNacimiento.setEnabled(true);
        txtEmail.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCelular.setEnabled(true);
        cboSexo.setEnabled(true);
        cboProvincia.setEnabled(true);
        txtProvincia.setEnabled(true);
        cboProfesion.setEnabled(true);
        cboNivelEstudio.setEnabled(true);
        cboEstadoCivil.setEnabled(true);
        cboDistrito.setEnabled(true);
        txtDistrito.setEnabled(true);
        cboDepartamento.setEnabled(true);
        cboCaserio.setEnabled(true);
        txtCaserio.setEnabled(true);
        btnAddOcupacion.setVisible(true);
        FechaNacimiento.setEnabled(true);
        txtGrupoSan.setEnabled(true);
        txtFactorSan.setEnabled(true);

    }

    private void departamentos() {

        switch ((String) cboDepartamento.getSelectedItem()) {
            case "HUANCAVELICA":
                cboProvincia.addItem("HUANCAVELICA");
                cboProvincia.addItem("ACOBAMBA");
                cboProvincia.addItem("ANGARAES");
                cboProvincia.addItem("CASTROVIRREYNA");
                cboProvincia.addItem("CHURCAMPA");
                cboProvincia.addItem("HUAYTARA");
                cboProvincia.addItem("TAYACAJA");
                break;
            case "AMAZONAS":
                cboProvincia.addItem("CHACHAPOYAS");
                cboProvincia.addItem("BAGUA");
                cboProvincia.addItem("BONGARA");
                cboProvincia.addItem("CONDORCANQUI");
                cboProvincia.addItem("LUYA");
                cboProvincia.addItem("RODRIGUEZ DE MENDOZA");
                cboProvincia.addItem("UTCUBAMBA");
                break;
            case "CAJAMARCA":
                cboProvincia.addItem("SAN IGNACIO");
                cboProvincia.addItem("JAEN");
                cboProvincia.addItem("CUTERVO");
                cboProvincia.addItem("CHOTA");
                cboProvincia.addItem("SANTA CRUZ");
                cboProvincia.addItem("HUALGAYOC");
                cboProvincia.addItem("CELENDIN");
                cboProvincia.addItem("SAN PABLO");
                cboProvincia.addItem("SAN MIGUEL");
                cboProvincia.addItem("CONTUMAZA");
                cboProvincia.addItem("CAJAMARCA");
                cboProvincia.addItem("CAJABAMBA");
                cboProvincia.addItem("SAN MARCOS");
                break;
            case "TUMBES":
                cboProvincia.addItem("TUMBES");
                break;
            case "LORETO":
                System.out.println("Mayo");
                break;
            case "PIURA":
                System.out.println("Junio");
                break;
            case "LAMBAYEQUE":
                System.out.println("Julio");
                break;
            case "SAN MARTIN":
                System.out.println("Agosto");
                break;
            case "LA LIBERTAD":
                cboProvincia.addItem("TRUJILLO");
                cboProvincia.addItem("ASCOPE");
                cboProvincia.addItem("BOLIVAR");
                cboProvincia.addItem("CHEPEN");
                cboProvincia.addItem("JULCAN");
                cboProvincia.addItem("OTUZCO");
                cboProvincia.addItem("PACASMAYO");
                cboProvincia.addItem("PATAZ");
                cboProvincia.addItem("SANCHEZ CARRION");
                cboProvincia.addItem("SANTIAGO DE CHUCO");
                cboProvincia.addItem("GRAN CHIMU");
                cboProvincia.addItem("VIRU");
                break;
            case "UCAYALI":
                System.out.println("Octubre");
                break;
            case "ANCASH":
                System.out.println("Noviembre");
                break;
            case "HUANUCO":
                System.out.println("Diciembre");
                break;
            case "PASCO":
                System.out.println("Diciembre");
                break;
            case "JUNIN":
                System.out.println("Diciembre");
                break;
            case "AYACUCHO":
                System.out.println("Diciembre");
                break;
            case "LIMA":
                System.out.println("Diciembre");
                break;
            case "ICA":
                System.out.println("Diciembre");
                break;
            case "AREQUIPA":
                System.out.println("Diciembre");
                break;
            case "MOQUEGUA":
                System.out.println("Diciembre");
                break;
            case "MADRE DE DIOS":
                System.out.println("Diciembre");
                break;
            case "CUSCO":
                System.out.println("Diciembre");
                break;
            case "APURIMAC":
                System.out.println("Diciembre");
                break;
            case "PUNO":
                System.out.println("Diciembre");
                break;
            case "TACNA":
                System.out.println("Diciembre");
                break;

        }
    }

    private void CargarServicios() {
        try {
            String Consulta;

            Consulta = "select nom_examen from examen_medico_ocupacional ";
            if (oConn1.FnBoolQueryExecute(Consulta)) {
                try {
                    while (oConn1.setResult.next()) {

                        cboExamenMedico.addItem(oConn1.setResult.getString("nom_examen"));
                    }

                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CargarEmpreaRuc() {
        try {
            String Consulta;

            Consulta = "select razon_empresa from empresas where ruc_empresa= '" + rucempresa + "'";
            if (oConn1.FnBoolQueryExecute(Consulta)) {
                try {
                    while (oConn1.setResult.next()) {

                        nombreempresa = oConn1.setResult.getString("razon_empresa");
                    }

                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CargarContrataRuc() {
        try {
            String Consulta;

            Consulta = "select razon_contrata from contratas where ruc_contrata= '" + ruccontrata + "'";
            System.out.println(Consulta);
            if (oConn1.FnBoolQueryExecute(Consulta)) {
                try {
                    while (oConn1.setResult.next()) {

                        nombrecontrata = oConn1.setResult.getString("razon_contrata");
                    }

                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CargarAlturaPo() {
        try {
            String Consulta;

            Consulta = "select altura_po from altura_po ";
            if (oConn1.FnBoolQueryExecute(Consulta)) {
                try {
                    while (oConn1.setResult.next()) {

                        cboAltura.addItem(oConn1.setResult.getString("altura_po"));
                    }

                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CargarExplotacion() {
        try {
            String Consulta;

            Consulta = "select nom_ex from explotacion_en_po ";
            if (oConn1.FnBoolQueryExecute(Consulta)) {
                try {
                    while (oConn1.setResult.next()) {

                        cboExplotacion.addItem(oConn1.setResult.getString("nom_ex"));
                    }

                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CargarMineralEx() {
        try {
            String Consulta;

            Consulta = "select mineral_po from mineral_ex_po ";
            if (oConn1.FnBoolQueryExecute(Consulta)) {
                try {
                    while (oConn1.setResult.next()) {

                        cboMineralExp.addItem(oConn1.setResult.getString("mineral_po"));
                    }

                    oConn1.setResult.close();
                } catch (SQLException ex) {
                    //JOptionPane.showMessageDialorootPane,ex);
                    oFunc.SubSistemaMensajeError(ex.toString());
                    Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AltaDesabilitar() {
        txtEmpresa.setEnabled(false);
        txtContrata.setEnabled(false);
        txtNombresAlta.setEnabled(false);
        txtCargoDesempenar.setEnabled(false);
        txtApellidosAlta.setEnabled(false);
        cboArea.setEnabled(false);
        cboAltura.setEnabled(false);
        cboMineralExp.setEnabled(false);
        cboExplotacion.setEnabled(false);
        cboExamenMedico.setEnabled(false);
        cboFormaPago.setEnabled(false);
        txtObserv1.setEnabled(false);
        txtObserv2.setEnabled(false);
        jComboBoxProtocolos.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtPrecioAdicional.setEnabled(false);
        cboAutorizacion.setEnabled(false);
        txtNorden.setEnabled(false);
        txtMedico.setEnabled(false);
        txtFechaAlta.setEnabled(false);
        chkAltaFist.setEnabled(false);
        chkAltaPsicosen.setEnabled(false);
        chkAltaTestAltura.setEnabled(false);
        chkAltaVisualCom.setEnabled(false);
        chkAltaTrabCal.setEnabled(false);
//        chkAltaCovid1.setEnabled(false);
//        chkAltaCovid2.setEnabled(false);
        chkAltaManipAlimen.setEnabled(false);
        chkAltaHerrMan.setEnabled(false);
        chkAltaRXCDorso.setEnabled(false);
        chkAltaRXCLumba.setEnabled(false);
        chkAltaRXCLumbo.setEnabled(false);
        chkAltaPlomoS.setEnabled(false);
        chkAltaMercO.setEnabled(false);
        txtPrecioAdicional.setEnabled(false);
        cboAutorizacion.setEnabled(false);
        // cboSedeClinica.setEnabled(false);  
        cboEmpresa.setEnabled(false);
        cboContrata.setEnabled(false);
        txtNOperacion.setEnabled(false);
    }

    public void AltaHabilitar() {
        txtCargoDesempenar.setEnabled(true);
        cboArea.setEnabled(true);
        jpOcupacional.setEnabled(true);
        cboEmpresa.setEnabled(true);
        cboContrata.setEnabled(true);
        txtEmpresa.setEnabled(true);
        txtContrata.setEnabled(true);
        txtNombresAlta.setEnabled(true);
        txtApellidosAlta.setEnabled(true);
        cboAltura.setEnabled(true);
        cboMineralExp.setEnabled(true);
        cboExplotacion.setEnabled(true);
        cboExamenMedico.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtNorden.setEnabled(true);
        txtMedico.setEnabled(true);
        txtFechaAlta.setEnabled(true);
        cboFormaPago.setEnabled(true);
        txtDniAlta.setEditable(true);
        chkAltaFist.setEnabled(true);
        chkAltaPsicosen.setEnabled(true);
        chkAltaTestAltura.setEnabled(true);
        chkAltaVisualCom.setEnabled(true);
        chkAltaTrabCal.setEnabled(true);
//        chkAltaCovid1.setEnabled(true);
//        chkAltaCovid2.setEnabled(true);
        chkAltaManipAlimen.setEnabled(true);
        chkAltaHerrMan.setEnabled(true);
        chkAltaRXCDorso.setEnabled(true);
        chkAltaRXCLumba.setEnabled(true);
        chkAltaRXCLumbo.setEnabled(true);
        chkAltaPlomoS.setEnabled(true);
        chkAltaMercO.setEnabled(true);
        txtGrupoSan.setEnabled(true);
        txtFactorSan.setEnabled(true);
//        cboSedeClinica.setEnabled(true);
        txtObserv1.setEnabled(true);
        txtObserv2.setEnabled(true);
        jComboBoxProtocolos.setEnabled(true);
        txtPrecioAdicional.setEnabled(true);
        cboAutorizacion.setEnabled(true);
        
    }

    public void AltaLimpiar() {
        txtDniAlta.setText(null);
        jLabel44.setText(null);
        txtEmpresa.setText(null);
        txtContrata.setText(null);
        txtNombresAlta.setText(null);
        txtApellidosAlta.setText(null);
        cboAltura.setSelectedIndex(-1);
        cboMineralExp.setSelectedIndex(-1);
        cboExplotacion.setSelectedIndex(-1);
        cboExamenMedico.setSelectedIndex(-1);
        cboEmpresa.setSelectedIndex(-1);
        cboContrata.setSelectedIndex(-1);
        jComboBoxHotel.setSelectedIndex(0);
        cboArea.setSelectedIndex(-1);
        cboFormaPago.setSelectedIndex(-1);
        txtCargoDesempenar.setText(null);
        txtNorden.setText(null);
        txtMedico.setText(null);
        txtFechaAlta.setDate(null);
        txtPrecio.setText(null);
        txtPrecioAdicional.setText(null);
        txtNorden.setText("0");
        chkAltaFist.setSelected(false);
        chkAltaPsicosen.setSelected(false);
        chkAltaTestAltura.setSelected(false);
        chkAltaVisualCom.setSelected(false);
        chkAltaTrabCal.setEnabled(false);
//        chkAltaCovid1.setEnabled(false);
//        chkAltaCovid2.setEnabled(false);
        chkAltaManipAlimen.setEnabled(false);
        chkAltaHerrMan.setEnabled(false);
        chkAltaRXCDorso.setEnabled(false);
        chkAltaRXCLumba.setEnabled(false);
        chkAltaRXCLumbo.setEnabled(false);
        chkAltaPlomoS.setEnabled(false);
        chkAltaMercO.setEnabled(false);
        txtGrupoSan.setText(null);
        txtFactorSan.setText(null);
        txtObserv1.setText(null);
        txtObserv2.setText(null);
        jComboBoxProtocolos.setSelectedIndex(0);
        cboAutorizacion.setSelectedIndex(0);
        jCheckBox12.setSelected(false);
        txtNOperacion.setText(null);
    }

    private void CargarNorden() {
        String sql = "SELECT max(n_orden)+1 as cod from n_orden_ocupacional";
        oConn1.FnBoolQueryExecute(sql);
        try {
            if (oConn1.setResult.next()) {
                txtNorden.setText(oConn1.setResult.getString("cod"));
                if (nomsede.equals("Trujillo")) {
                    jLabel44.setText(txtNorden.getText() + " - T");
                } else {
                    jLabel44.setText(txtNorden.getText() + " - H");
                }
            } else {

            }

            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void NumColor() {
        String sql = "SELECT max(color)+1 as cod from n_orden_ocupacional\n"
                + "where fecha_apertura_po='" + lblFecha.getText().toString() + "'";
        oConn1.FnBoolQueryExecute(sql);

        int numc;
        String n;
        try {
            if (oConn1.setResult.next()) {
                n = oConn1.setResult.getString("cod");
                if (n != null) {
                    numc = Integer.parseInt(n);
                    txtNumColor.setText(String.valueOf(numc));
                } else {
                    txtNumColor.setText("1");
                }
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialorootPane,ex);
            oFunc.SubSistemaMensajeError(ex.toString());
            Logger.getLogger(Comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean ValidarAlta() {

        boolean bResultado = true;
        if (txtDniAlta.getText().isEmpty()) {
            bResultado = false;
        }
//         if (txtEmpresa.getText().toString().trim().isEmpty()) {
//            bResultado = false;
//        }
//        if (txtContrata.getText().toString().trim().isEmpty()) {
//            bResultado = false;
//        }
        if (cboEmpresa.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (cboContrata.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (cboExamenMedico.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (cboFormaPago.getSelectedIndex() <= -1) {
            bResultado = false;
        }
        if (!jCheckBox12.isSelected()) {
            if (cboAltura.getSelectedIndex() <= -1) {
                bResultado = false;
            }
            if (cboExplotacion.getSelectedIndex() <= -1) {
                bResultado = false;
            }
            if (cboMineralExp.getSelectedIndex() <= -1) {
                bResultado = false;
            }
            if (chkAltaFist.isSelected() || chkAltaPsicosen.isSelected()
                    || chkAltaTestAltura.isSelected() || chkAltaTrabCal.isSelected()
                    || chkAltaVisualCom.isSelected() || chkAltaManipAlimen.isSelected()) {
                if ("S/.0.00".equals(txtPrecioAdicional.getText()) || "0".equals(txtPrecioAdicional.getText()) || txtPrecioAdicional.getText().isEmpty()) {
                    oFunc.SubSistemaMensajeError("Ingrese monto cobrado por examen adicional");
                    txtPrecioAdicional.requestFocus();
                    bResultado = false;
                }
            }
            if (cboAutorizacion.getSelectedIndex() <= -1) {
                bResultado = false;
            }
            if (cboFormaPago.getSelectedItem() != "CREDITO") {
                if ("S/.0.00".equals(txtPrecio.getText()) || "0".equals(txtPrecio.getText()) || "".equals(txtPrecio.getText())) {
                    oFunc.SubSistemaMensajeError("Ingrese monto cobrado por examen");
                    txtPrecio.requestFocus();
                    bResultado = false;
                }
            }
        }
        if (((JTextField) txtFechaAlta.getDateEditor().getUiComponent()).getText().trim().length() < 2) {
            oFunc.SubSistemaMensajeError("Ingrese Fecha");
            bResultado = false;
        }
        return bResultado;
    }

    public void limpiarChk() {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
    }
   public void comunirApi() throws Exception {
         String p1 = null,p2 = null,p3 = null,
                 p4 = null,p5 = null,p6 = null,
                 p7 = null,p8 = null,p9 = null,p10 = null, 
                 p11 = null,p12 = null,p13 = null,
                 p14 = null,p15 = null,p16 = null,p17 = null,p18 = null; 
         try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/datosPacienteNP");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            String Sql;
                Sql = "SELECT cod_pa, nombres_pa, fecha_nacimiento_pa, sexo_pa, email_pa, lugar_nac_pa, \n"
                    + "       nivel_est_pa, ocupacion_pa, estado_civil_pa, direccion_pa, departamento_pa, \n"
                    + "       provincia_pa, distrito_pa, caserio_pa, foto_pa, cod_aleatorio_pa, \n"
                    + "       historial_pa, tel_casa_pa, tel_trabajo_pa, cel_pa, fecha_registro_pa, \n"
                    + "       apellidos_pa, hora_registro_pa\n"
                    + "  FROM datos_paciente\n"
                    + "  where cod_pa="+txtDniAlta.getText();
           oConn1.FnBoolQueryExecute(Sql);
                    if (oConn1.setResult.next()) {
                         p1 = oConn1.setResult.getString("cod_pa");
                         p2= oConn1.setResult.getString("nombres_pa");
                         p3 = oConn1.setResult.getString("fecha_nacimiento_pa");
                         p4 = oConn1.setResult.getString("sexo_pa");
                         p5 = oConn1.setResult.getString("email_pa");
                         p6 = oConn1.setResult.getString("lugar_nac_pa");
                         p7 = oConn1.setResult.getString("nivel_est_pa");
                         p8 = oConn1.setResult.getString("ocupacion_pa");
                         p9 = oConn1.setResult.getString("estado_civil_pa");
                         p10 = oConn1.setResult.getString("direccion_pa");
                         p11 = oConn1.setResult.getString("departamento_pa");
                         p12 = oConn1.setResult.getString("provincia_pa");
                         p13 = oConn1.setResult.getString("distrito_pa");
                         p14 = oConn1.setResult.getString("caserio_pa");
                         p15 = oConn1.setResult.getString("cel_pa");
                         p16 = oConn1.setResult.getString("fecha_registro_pa");
                         p17 = oConn1.setResult.getString("apellidos_pa");
                         p18 = oConn1.setResult.getString("hora_registro_pa");
            }
//            System.out.println(Sql);
            String jsonInputString = "{ \"codPa\":\""+ p1+ "\", "
                    + "\"nombresPa\":\""+ p2+ "\","
                    + "\"fechaNaciminetoPa\": \""+ p3+ "\","
                    + "\"sexoPa\": \""+ p4 + "\","
                    + "\"emailPa\": \""+ p5 + "\","
                    + "\"lugarNacPa\": \""+ p6 + "\","
                    + "\"nivelEstPa\": \""+ p7 + "\","
                    + "\"ocupacionPa\": \""+ p8+ "\","
                    + "\"estadoCivilPa\": \""+ p9 + "\","
                    + "\"direccionPa\": \""+p10 + "\","
                    + "\"departamentoPa\": \""+ p11 + "\","
                    + "\"provinciaPa\": \""+ p12 + "\","
                    + "\"distritoPa\": \""+ p13 + "\","
                    + "\"caserioPA\": \""+ p14+ "\","
                    + "\"fotoPa\": null ,"
                    + "\"codAleatorioPa\": null,"
                    + "\"telCasaPa\": null,"
                    + "\"telTrabajoPa\": null,"
                    + "\"celPa\": \""+ p15 + "\","
                    + "\"fechaRegistroPa\": \""+ p16+ "\","
                    + "\"apellidosPa\": \""+ p17 + "\","
                    + "\"horaRegistroPa\": \""+ p18+ "\","
                    + "\"tipoDoc\": 1}";
            System.out.println(jsonInputString);
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                    System.out.println("Response: " + response.toString());
                   
               
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
   public void gabrarHistoria() throws Exception {
         Integer cod = Integer.valueOf(tbOcupacional.getValueAt(tbOcupacional.getSelectedRow(), 0).toString());
       try {
            DisableSSLVerification.disableSSL();  
            URL url = new URL("https://hmintegracion.azurewebsites.net/api/v01/st/registros/historiaClinica");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            String Sql;
            Sql = "SELECT n_orden, cod_pa, razon_empresa, razon_contrata, nom_ex, altura_po, \n"
                    + "       mineral_po, fecha_apertura_po, precio_po, estado_ex, nom_examen, \n"
                    + "       cargo_de, area_o, n_medico, n_hora, tipo_pago, n_fisttest, n_psicosen, \n"
                    + "       n_testaltura, color, gruposan, grupofactorsan, cod_clinica, visual_compl, \n"
                    + "       trab_calientes, chkcovid1, chkcovid2, manip_alimentos, txtobserv1, \n"
                    + "       txtobserv2, cod_sede, tipo_prueba_covid, tipoprueba, nombrehotel, \n"
                    + "       protocolo, precio_adic, autoriza, n_operacion, herra_manuales, \n"
                    + "       rxc_dorso_lumbar, rxc_lumbar, rxc_lumbosacra, rxc_plomos, mercurioo "
                    + "  FROM n_orden_ocupacional\n"
                    + "  where n_orden='"+cod+"'";
            oConn1.FnBoolQueryExecute(Sql);
            if (oConn1.setResult.next()) {
                oConn1.setResult.getString("n_orden");
                oConn1.setResult.getString("cod_pa");
                oConn1.setResult.getString("razon_empresa");
                oConn1.setResult.getString("razon_contrata");
                oConn1.setResult.getString("nom_ex");
                oConn1.setResult.getString("altura_po");
                oConn1.setResult.getString("mineral_po");
                oConn1.setResult.getString("fecha_apertura_po");
                oConn1.setResult.getString("precio_po");
                oConn1.setResult.getString("estado_ex");
                oConn1.setResult.getString("nom_examen");
                oConn1.setResult.getString("cargo_de");
                oConn1.setResult.getString("area_o");
                oConn1.setResult.getString("n_medico");
                oConn1.setResult.getString("n_hora");
                oConn1.setResult.getString("tipo_pago");
                oConn1.setResult.getBoolean("n_fisttest");
                oConn1.setResult.getBoolean("n_psicosen");
                oConn1.setResult.getBoolean("n_testaltura");
                oConn1.setResult.getString("color");
                oConn1.setResult.getString("gruposan");
                oConn1.setResult.getString("grupofactorsan");
                oConn1.setResult.getString("cod_clinica");
                oConn1.setResult.getBoolean("visual_compl");
                oConn1.setResult.getBoolean("trab_calientes");
                oConn1.setResult.getBoolean("chkcovid1");
                oConn1.setResult.getBoolean("chkcovid2");
                oConn1.setResult.getBoolean("manip_alimentos");
                oConn1.setResult.getString("txtobserv1");
                oConn1.setResult.getString("txtobserv2");
                oConn1.setResult.getString("cod_sede");
                oConn1.setResult.getString("tipo_prueba_covid");
                oConn1.setResult.getString("tipoprueba");
                oConn1.setResult.getString("nombrehotel");
                oConn1.setResult.getString("protocolo");
                oConn1.setResult.getString("precio_adic");
                oConn1.setResult.getString("autoriza");
                oConn1.setResult.getString("n_operacion");
                oConn1.setResult.getBoolean("herra_manuales");
                oConn1.setResult.getBoolean("rxc_dorso_lumbar");
                oConn1.setResult.getBoolean("rxc_lumbar");
                oConn1.setResult.getBoolean("rxc_lumbosacra");
                oConn1.setResult.getBoolean("rxc_plomos");
                oConn1.setResult.getBoolean("mercurioo");
            }
//            System.out.println(Sql);
            String jsonInputString = "{\n"
                    + "   \"n_orden\":" + oConn1.setResult.getString("n_orden") + ",\n"
                    + "    \"codPa\":" + oConn1.setResult.getString("cod_pa") + ",\n"
                    + "    \"razonEmpresa\":\"" + oConn1.setResult.getString("razon_empresa") + "\",\n"
                    + "    \"razonContrata\": \"" + oConn1.setResult.getString("razon_contrata") + "\",\n"
                    + "    \"nomEx\": \"" + oConn1.setResult.getString("nom_ex") + "\",\n"
                    + "    \"alturaPo\": \"" + oConn1.setResult.getString("altura_po") + "\",\n"
                    + "    \"mineralPo\": \"" + oConn1.setResult.getString("mineral_po") + "\",\n"
                    + "    \"fechaAperturaPo\": \"" + oConn1.setResult.getString("fecha_apertura_po") + "\",\n"
                    + "    \"precioPo\": \"" + oConn1.setResult.getString("precio_po") + "\",\n"
                    + "    \"estadoEx\": \"" + oConn1.setResult.getString("estado_ex") + "\",\n"
                    + "    \"nomExamen\":\"" + oConn1.setResult.getString("nom_examen") + "\",\n"
                    + "    \"cargoDe\": \"" + oConn1.setResult.getString("cargo_de") + "\",\n"
                    + "    \"areaO\": \"" + oConn1.setResult.getString("area_o") + "\",\n"
                    + "    \"n_medico\": \"" + oConn1.setResult.getString("n_medico") + "\",\n"
                    + "    \"n_hora\": \"" + oConn1.setResult.getString("n_hora") + "\",\n"
                    + "    \"tipoPago\": \"" + oConn1.setResult.getString("tipo_pago") + "\",\n"
                    + "    \"n_fisttest\": " + oConn1.setResult.getBoolean("n_fisttest") + ",\n"
                    + "    \"n_psicosen\": " + oConn1.setResult.getBoolean("n_psicosen") + ",\n"
                    + "    \"n_testaltura\": " + oConn1.setResult.getBoolean("n_testaltura") + ",\n"
                    + "    \"color\": " + oConn1.setResult.getString("color") + ",\n"
                    + "    \"grupoSan\": \"" + oConn1.setResult.getString("gruposan") + "\",\n"
                    + "    \"grupoFactorSan\": \"" + oConn1.setResult.getString("grupofactorsan") + "\",\n"
                    + "    \"codClinica\": \"" + oConn1.setResult.getString("cod_clinica") + "\",\n"
                    + "    \"visualCompl\": " + oConn1.setResult.getBoolean("visual_compl") + ",\n"
                    + "    \"trabCalientes\": " + oConn1.setResult.getBoolean("trab_calientes") + ",\n"
                    + "    \"chk_covid1\": " + oConn1.setResult.getBoolean("chkcovid1") + ",\n"
                    + "    \"chk_covid2\": " + oConn1.setResult.getBoolean("chkcovid2") + ",\n"
                    + "    \"manipAlimentos\": " + oConn1.setResult.getBoolean("manip_alimentos") + ",\n"
                    + "    \"textObserv1\": \"" + oConn1.setResult.getString("txtobserv1") + "\",\n"
                    + "    \"textObserv2\": \"" + oConn1.setResult.getString("txtobserv2") + "\",\n"
                    + "    \"codSede\": 2,\n"
                    + "    \"tipoPruebaCovid\": \"" + oConn1.setResult.getString("tipo_prueba_covid") + "\",\n"
                    + "    \"tipoPrueba\": \"" + oConn1.setResult.getString("tipoprueba") + "\",\n"
                    + "    \"nombreHotel\": \"" + oConn1.setResult.getString("nombrehotel") + "\",\n"
                    + "    \"protocolo\": \"" + oConn1.setResult.getString("protocolo") + "\",\n"
                    + "    \"precioAdic\": \"" + oConn1.setResult.getString("precio_adic") + "\",\n"
                    + "    \"autoriza\": \"" + oConn1.setResult.getString("autoriza") + "\",\n"
                    + "    \"n_operacion\": \"" + oConn1.setResult.getString("n_operacion") + "\",\n"
                    + "    \"herraManuales\": " + oConn1.setResult.getBoolean("herra_manuales") + ",\n"
                    + "    \"rxcDorsoLumbar\": " + oConn1.setResult.getBoolean("rxc_dorso_lumbar") + ",\n"
                    + "    \"rxcKLumbar\": " + oConn1.setResult.getBoolean("rxc_lumbar") + ",\n"
                    + "    \"rxcLumbosacra\": " + oConn1.setResult.getBoolean("rxc_lumbosacra") + ",\n"
                    + "    \"rxcPlomos\": " + oConn1.setResult.getBoolean("rxc_plomos") + ",\n"
                    + "    \"mercurioo\": " + oConn1.setResult.getBoolean("mercurioo") + ",\n"
                    + "    \"referencia\": \"" + oConn1.setResult.getString("n_orden") + "\"\n"
                    + "\n"
                    + "}";
            System.out.println(jsonInputString);
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int code = con.getResponseCode();
            System.out.println("Response Code: " + code);
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                    System.out.println("hh: " + response.toString());
                }
                System.out.println("Response: " + response.toString());
                oFunc.SubSistemaMensajeInformacion("Se sincronizo correctamente");
            }catch(Exception e){
                e.printStackTrace();
            }
            oConn1.setResult.close();
            oConn1.sqlStmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
