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
import Clases.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DATPersona extends Conexion {

    Connection con;

    public DATPersona() throws SQLException {
        this.con = getConexion();
    }

    /*Método que permite realizar el registro de los datos hacia la base de datos
    Hace uso de una de las formas para enviar los datos a la Base dee Datos, en este caso PreparedStatement.
    El método es boolean, permite retornar true o false en caso de que el registro sea exitoso o no.
    Si visualiza no se envia el ID como parámetro, debido a que esto en la base está como Autonumérico
    Al metodo llega, un objeto
     */

    public boolean Registrar(Persona per) throws SQLException {
        PreparedStatement ps = null;

        String sql = "INSERT INTO personas (DNI, nombres, telefono, direccion, edad, sexo  ) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, per.getDNI());
            ps.setString(2, per.getNombres());
            ps.setString(3, per.getTelefono());
            ps.setString(4, per.getDireccion());
            ps.setInt(5, per.getEdad());
            ps.setString(6, per.getSexo());

            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            
              
       
               System.err.println(e.getMessage());
                }
            
            
            return false;
//        } finally {
//            try {
//                    con.close();
//                } 
//            catch (SQLException e) {
//                System.err.println(e.getMessage());
//            }
        }
    

    public ResultSet Buscar1(int id) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String sql
                = "SELECT * FROM personas WHERE DNI = " + id + "";

        try {
            rs = st.executeQuery(sql);
            System.out.println(rs.getRow());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }

    /*
     */
    public ResultSet Buscar2(String nom) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * from personas WHERE DNI = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            rs = ps.executeQuery();
            System.out.println(rs.getRow());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }

    public ResultSet BuscarTodos() throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * from personas";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }

    
    
    public boolean Modificar(Persona per) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE personas SET DNI=?, nombres=?, telefono=?, direccion=?, edad=?, sexo=?"
                + "WHERE DNI=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, per.getDNI());
            ps.setString(2, per.getNombres());
            ps.setString(3, per.getTelefono());
            ps.setString(4, per.getDireccion());
            ps.setInt(5, per.getEdad());
            ps.setString(6, per.getSexo());
           ps.setInt(7, per.getDNI());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

    public boolean Eliminar(String ide) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM personas WHERE DNI=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ide);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
    }

}
