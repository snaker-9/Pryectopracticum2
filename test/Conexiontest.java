
import Datos.Conexion;
import GUI.JFpersona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
//String url = "
   public class Conexiontest {

  
   
    public static void main(String[] args) {
      

        String url= "jdbc:mysql://www.mapcovi.rf.gd:3306/mapcovi_covi?&useSSL=false";
     // String MySQLURL = "jdbc:mysql:///mapcovi_mapas?cloudSqlInstance=java-maps-297117:us-east1:sqlgoogle&user=root&password=dataGoogle756&useSSL=false";
      String us = "mapcovi_mapas";
      
               String pass = "VlB40QoLdDcgf";
    //  String pass = ")Uz=[k}tmC6i";
      Connection con = null;
      try {
         con = DriverManager.getConnection(url,us,pass);
         if (con != null) {
            System.out.println("Database connection is successful !!!!");
         }
      } catch (SQLException e) {
      }
   }
}
    
   
  

 

