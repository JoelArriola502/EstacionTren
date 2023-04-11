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
public class conectar {
          Connection conectar=null;
  String usuario="root";
  String contraseña="joelarriola";
  String bd="Usuario";
  String ip="localhost";
  String puerto="3306";
  String Cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
  public Connection esatblecerConnection(){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
        
         
          conectar=DriverManager.getConnection(Cadena,usuario,contraseña);
          JOptionPane.showMessageDialog(null,"Se Conecto Correctamente a la base de datos");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Erro al conectar a la base de datos, error"+e.toString());
      }
      return conectar;
  }
    
}
