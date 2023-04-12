/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel Arriola
 */
public class Conexion {
    Connection conexion=null;
    String usuario="root";
  String contraseña="joelarriola";
  String bd="EstacionTren01";
  String ip="localhost";
  String puerto="3306";
  String Cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public  Connection conectarmysql() {
       
        try {
             // String Cadena="jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd;
            Class.forName("com.mysql.cj.jdbc.Driver");
              conexion=DriverManager.getConnection(Cadena,usuario,contraseña);
           
            JOptionPane.showMessageDialog(null,"Se realizo la conexion con exito a la BASE DE DATOS");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la conexion "+ e.toString());
            System.out.println("un mensaje");
             System.out.println("Mensaje 2");
        }
        
        return conexion;
    }
    
    
}
