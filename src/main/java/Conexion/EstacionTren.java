/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EstacionTren extends javax.swing.JFrame {
 Conexion con=new Conexion();
    Connection Conexion=con.conectarmysql();
    PreparedStatement GuardarDatos;
    public EstacionTren() {
        initComponents();     
    }
public void GuardarEstacion(){
        
        String Insertar="INSERT INTO Estacion(NombreEstacion,ciudadEstacion,idtren)values(?,?,?)";
      
        try {
            GuardarDatos=Conexion.prepareCall(Insertar);
            GuardarDatos.setString(1, jTextFieldNomreEstacion.getText());
            GuardarDatos.setString(2, jTextFieldCiudad.getText());
            GuardarDatos.setString(3, TXTID.getText());
            GuardarDatos.executeUpdate();
            JOptionPane.showMessageDialog( null,"Los datos se agregaron a la base de datos correctamente EN LA TABLA ESTACION");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al ingresar datos EN LA TABLA ESTACION: "+ e.toString());
        }
    }
    public void GuardarTrayectoria(){
        String Insertar="insert into trayectoria(id_estacion,DistanciaRecorrida,tiempo)values(?,?,?)";
        
       
        try {
            GuardarDatos=Conexion.prepareCall(Insertar);
            GuardarDatos.setString(1, TXTID.getText() );
            GuardarDatos.setString(2, jTextFieldDistancia.getText());
            GuardarDatos.setString(3,jTextFieldTiempo.getText());
            GuardarDatos.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Agregados Correctamente A LA TABLA TRAYECTORIA");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"error Agregar Datos A LA TABLA TRAYECTORIA "+e.toString());
        }
        
        
    }
    // metodo pasajero
     public void GuardarPasajero(){
        
        String Insertar="insert into Pasajero(NombrePasajero,telefono,email,idFactura)values(?,?,?,?);";
      
        try {
            GuardarDatos=Conexion.prepareCall(Insertar);
            
            GuardarDatos.setString(1,txtNombrePasajero.getText() );
            GuardarDatos.setString(2,txtTelefono.getText());
            GuardarDatos.setString(3, txtEmail.getText());
            GuardarDatos.setString(4, TXTID.getText());
            GuardarDatos.executeUpdate();
            
            JOptionPane.showMessageDialog( null,"Los datos se agregaron a la base de datos correctamente a la TABLA PASAJERO");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al ingresar datos EN TABLA PASAJERO"+ e.toString());
        }
    }
     
     // motodo tren
     public void GuardarTren(){
        
        String Insertar="insert into Tren(idViaje,nombreTren,tipoTren)values(?,?,?);";
         String TipoTren=(String) jComboBoxTipoTrem.getSelectedItem();
      
        try {
            GuardarDatos=Conexion.prepareCall(Insertar);
           
            GuardarDatos.setString(1,TXTID.getText() );
            GuardarDatos.setString(2,txtNombreTren.getText());
            GuardarDatos.setString(3, TipoTren);
            GuardarDatos.executeUpdate();
            
            JOptionPane.showMessageDialog( null,"Los datos se agregaron a la base de datos correctamente a la TABLA TREN");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al ingresar datos EN TABLA TREN"+ e.toString());
        }
    }
     // MOTODO VIAJE
      public void GuardarViaje(){
        
        String Insertar="insert into viaje(rutaViaje,tiempoViaje,TipoViaje,id_Pasajero)values(?,?,?,?);";
       
         String RutaViaje=(String) jComboBoxRutaViaje.getSelectedItem();
         String TipoViaje=(String) jComboBoxTipoViaje.getSelectedItem();
      
        try {
            GuardarDatos=Conexion.prepareCall(Insertar);
          
            GuardarDatos.setString(1,RutaViaje );
            GuardarDatos.setString(2,TXTTIEMPOVIAJE.getText());
            GuardarDatos.setString(3, TipoViaje);
            GuardarDatos.setString(4, TXTID.getText());
            GuardarDatos.executeUpdate();
            
            JOptionPane.showMessageDialog( null,"Los datos se agregaron a la base de datos correctamente a la TABLA VIAJE");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al ingresar datos EN TABLA VIAJE"+ e.toString());
        }
    }
      // metodo factura
       public void GuardarFactura(){
        
        String Insertar="insert into Factura(TipoViajeFacturado)values(?);";
       
        
         
         String TipoViajeFActurado=(String) jComboBoxTIPOVIAJEFACTURADO.getSelectedItem();
      
        try {
            GuardarDatos=Conexion.prepareCall(Insertar);
            
            GuardarDatos.setString(1, TipoViajeFActurado);
         
            GuardarDatos.executeUpdate();
            
            JOptionPane.showMessageDialog( null,"Los datos se agregaron a la base de datos correctamente a la TABLA FACTURA");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al ingresar datos EN TABLA FACTURA"+ e.toString());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        estacion = new javax.swing.JLabel();
        jTextFieldNomreEstacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ciudad = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        distancia = new javax.swing.JLabel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        tiempo = new javax.swing.JLabel();
        jTextFieldTiempo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        nombre = new javax.swing.JLabel();
        txtNombrePasajero = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        ruta = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jComboBoxRutaViaje = new javax.swing.JComboBox<>();
        tiempoviaje = new javax.swing.JLabel();
        TXTTIEMPOVIAJE = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tipo = new javax.swing.JLabel();
        jComboBoxTipoViaje = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jComboBoxTIPOVIAJEFACTURADO = new javax.swing.JComboBox<>();
        jSeparator11 = new javax.swing.JSeparator();
        factura = new javax.swing.JLabel();
        TXTID = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        txtNombreTren = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        ruta1 = new javax.swing.JLabel();
        jComboBoxTipoTrem = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(960, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("x");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FERRO EXPRES");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 660, 40));

        jButton1.setBackground(new java.awt.Color(39, 27, 3));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jButton1.setText("REGISTRAR ");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 137, 210, -1));

        estacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        estacion.setForeground(new java.awt.Color(255, 255, 255));
        estacion.setText("NOMBRE ESTACION");
        bg.add(estacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 40));

        jTextFieldNomreEstacion.setBackground(new java.awt.Color(60, 63, 65));
        jTextFieldNomreEstacion.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNomreEstacion.setText("INGRESE NOMBRE ESTACION");
        jTextFieldNomreEstacion.setBorder(null);
        bg.add(jTextFieldNomreEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 106, 210, 30));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 10));

        ciudad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ciudad.setForeground(new java.awt.Color(255, 255, 255));
        ciudad.setText("NOMBRE CIUDAD ");
        bg.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 40));

        jTextFieldCiudad.setBackground(new java.awt.Color(60, 63, 65));
        jTextFieldCiudad.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCiudad.setText("INGRESE NOMBRE CIUDAD ");
        jTextFieldCiudad.setBorder(null);
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        bg.add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 146, 210, 30));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 210, 10));

        distancia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        distancia.setForeground(new java.awt.Color(255, 255, 255));
        distancia.setText("DISTANCIA ESTACION");
        bg.add(distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 40));

        jTextFieldDistancia.setBackground(new java.awt.Color(60, 63, 65));
        jTextFieldDistancia.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldDistancia.setText("INGRESE DISTANCIA ESTACION");
        jTextFieldDistancia.setBorder(null);
        jTextFieldDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDistanciaActionPerformed(evt);
            }
        });
        bg.add(jTextFieldDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 186, 210, 30));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, 10));

        tiempo.setBackground(new java.awt.Color(102, 255, 255));
        tiempo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setText("TIEMPO ESTIMADO");
        bg.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        jTextFieldTiempo.setBackground(new java.awt.Color(60, 63, 65));
        jTextFieldTiempo.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTiempo.setText("INGRESE DISTANCIA ESTACION");
        jTextFieldTiempo.setBorder(null);
        jTextFieldTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTiempoActionPerformed(evt);
            }
        });
        bg.add(jTextFieldTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 226, 210, 30));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 210, 10));

        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("NOMBRE PASAJERO");
        bg.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 40));

        txtNombrePasajero.setBackground(new java.awt.Color(60, 63, 65));
        txtNombrePasajero.setForeground(new java.awt.Color(153, 153, 153));
        txtNombrePasajero.setText("INGRESE NOMBRE PASAJERO");
        txtNombrePasajero.setBorder(null);
        txtNombrePasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePasajeroActionPerformed(evt);
            }
        });
        bg.add(txtNombrePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 266, 210, 30));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 210, 10));

        telefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setText("TELEFONO PASAJERO");
        telefono.setToolTipText("");
        bg.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 40));

        txtTelefono.setBackground(new java.awt.Color(60, 63, 65));
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("INGRESE  TELEFONO PASAJERO");
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        bg.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 306, 210, 30));

        correo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("CORREO PASAJERO");
        correo.setToolTipText("");
        bg.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 40));

        txtEmail.setBackground(new java.awt.Color(60, 63, 65));
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("INGRESE CORREO PASAJERO");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        bg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 346, 210, 20));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 210, 10));

        ruta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ruta.setForeground(new java.awt.Color(255, 255, 255));
        ruta.setText(" RUTA DEL TREN");
        ruta.setToolTipText("");
        bg.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 150, 40));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 210, 10));

        jComboBoxRutaViaje.setBackground(new java.awt.Color(60, 63, 65));
        jComboBoxRutaViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE SU RUTA DE VIAJE", "GUATEMALA A QUETZALTENANDO ", "QUETZALTENANDO A RETALHULEU", "RETALHULEU A QUETZALTENANGO", "COATEPEQUE A TECUN UMAN", "ESCUINTLA A GUATEMALA" }));
        jComboBoxRutaViaje.setBorder(null);
        bg.add(jComboBoxRutaViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 210, 30));

        tiempoviaje.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tiempoviaje.setForeground(new java.awt.Color(255, 255, 255));
        tiempoviaje.setText("TIEMPO VIAJE");
        tiempoviaje.setToolTipText("");
        bg.add(tiempoviaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 40));

        TXTTIEMPOVIAJE.setBackground(new java.awt.Color(60, 63, 65));
        TXTTIEMPOVIAJE.setForeground(new java.awt.Color(153, 153, 153));
        TXTTIEMPOVIAJE.setText("INGRESE TIEMPO VIAJE");
        TXTTIEMPOVIAJE.setBorder(null);
        TXTTIEMPOVIAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTTIEMPOVIAJEActionPerformed(evt);
            }
        });
        bg.add(TXTTIEMPOVIAJE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 506, 210, 20));
        bg.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 210, 10));

        tipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipo.setForeground(new java.awt.Color(255, 255, 255));
        tipo.setText("TIPO VIAJE");
        tipo.setToolTipText("");
        bg.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 90, 40));

        jComboBoxTipoViaje.setBackground(new java.awt.Color(60, 63, 65));
        jComboBoxTipoViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE SU TIPO DE VIAJE", "PREMIUN ", "ECONOMICO ", "PASAJE BARATO" }));
        jComboBoxTipoViaje.setBorder(null);
        bg.add(jComboBoxTipoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 210, 30));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 210, 10));

        jComboBoxTIPOVIAJEFACTURADO.setBackground(new java.awt.Color(60, 63, 65));
        jComboBoxTIPOVIAJEFACTURADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE TIPO DE VIAJE FACTURADO", "PAGO CON TVP", "POR TRANSACCION BANCARIA", "PAGO DE TARJETA ", "PAGO EN LINEA", " " }));
        jComboBoxTIPOVIAJEFACTURADO.setBorder(null);
        bg.add(jComboBoxTIPOVIAJEFACTURADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 250, 30));
        bg.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 250, 10));

        factura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        factura.setForeground(new java.awt.Color(255, 255, 255));
        factura.setText("FACTURA");
        factura.setToolTipText("");
        bg.add(factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 90, 40));

        TXTID.setBackground(new java.awt.Color(60, 63, 65));
        TXTID.setForeground(new java.awt.Color(153, 153, 153));
        TXTID.setText("INGRESE ID");
        TXTID.setBorder(null);
        TXTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIDActionPerformed(evt);
            }
        });
        bg.add(TXTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 616, 210, 30));
        bg.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 210, 10));

        ID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");
        ID.setToolTipText("");
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 90, 40));

        correo1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correo1.setForeground(new java.awt.Color(255, 255, 255));
        correo1.setText("NOMBRE  TREN");
        correo1.setToolTipText("");
        bg.add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 40));

        txtNombreTren.setBackground(new java.awt.Color(60, 63, 65));
        txtNombreTren.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreTren.setText("INGRESE EL NOMBRE DEL TREN");
        txtNombreTren.setBorder(null);
        txtNombreTren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTrenActionPerformed(evt);
            }
        });
        bg.add(txtNombreTren, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 376, 210, 30));
        bg.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 210, 10));

        ruta1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ruta1.setForeground(new java.awt.Color(255, 255, 255));
        ruta1.setText("TIPO TREN");
        ruta1.setToolTipText("");
        bg.add(ruta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 150, 40));

        jComboBoxTipoTrem.setBackground(new java.awt.Color(60, 63, 65));
        jComboBoxTipoTrem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE TIPO DE TREN", "TREN DE CORTA DISTANCIA", "TREN DE LARGA DISTANCIA", "TREN DE LEVITACION MAGNETICA" }));
        jComboBoxTipoTrem.setBorder(null);
        jComboBoxTipoTrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTremActionPerformed(evt);
            }
        });
        bg.add(jComboBoxTipoTrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 210, 30));
        bg.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 200, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tren.jpg"))); // NOI18N
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 480, 740));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/tren.jpg"))); // NOI18N
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -30, 480, 720));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 920, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoTremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoTremActionPerformed

    private void txtNombreTrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTrenActionPerformed

    private void TXTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDActionPerformed

    private void TXTTIEMPOVIAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTTIEMPOVIAJEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTTIEMPOVIAJEActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombrePasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePasajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePasajeroActionPerformed

    private void jTextFieldTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTiempoActionPerformed

    private void jTextFieldDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDistanciaActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        GuardarFactura();
        GuardarPasajero();
        GuardarViaje();
        GuardarTren();
        GuardarEstacion();
        GuardarTrayectoria();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        JOptionPane.showMessageDialog(null,"Saliendo ");

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EstacionTren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstacionTren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstacionTren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstacionTren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstacionTren().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTTIEMPOVIAJE;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel ciudad;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel distancia;
    private javax.swing.JLabel estacion;
    private javax.swing.JLabel factura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxRutaViaje;
    private javax.swing.JComboBox<String> jComboBoxTIPOVIAJEFACTURADO;
    private javax.swing.JComboBox<String> jComboBoxTipoTrem;
    private javax.swing.JComboBox<String> jComboBoxTipoViaje;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldNomreEstacion;
    private javax.swing.JTextField jTextFieldTiempo;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ruta;
    private javax.swing.JLabel ruta1;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tiempo;
    private javax.swing.JLabel tiempoviaje;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombrePasajero;
    private javax.swing.JTextField txtNombreTren;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
