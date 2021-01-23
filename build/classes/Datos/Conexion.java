/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author snaker
 */
import java.sql.Connection;
;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/*Clase que se usa para gestionar la conexion a la base, aqui debe ubicar lo que corresponda a su base de datos
en el caso de que el usuario y clave sean las mismas o no la tenga debe modificar en esta sección.
Como se usa MySQL este se levanta en el puerto 3306, por ello se lo ubica*/


public class Conexion {

 
    private final  String us = "mapcovi_snake";//String usuario = "root";
    private final  String pass = ")Uz=[k}tmC6i";//String clave = "root";
    private final  String url= "jdbc:mysql://www.mapcovi.rf.gd/mapcovi_covi?&useSSL=false";
    //"jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    // url ;
    public Connection getConexion() throws SQLException {
   
      
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.us,this.pass );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Perece que no esta Conecado a Internet "
                    + "conetate e intentalo de nuevo");
            con.close();
            System.exit(0);
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return con;
        
    }
        
    
}
     
       

   
     // String MySQLURL = "jdbc:mysql:///mapcovi_mapas?cloudSqlInstance=java-maps-297117:us-east1:sqlgoogle&user=root&password=dataGoogle756&useSSL=false";
     
     
  
    

