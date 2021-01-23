/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Contagio;
import Clases.Ubicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author snake
 */
public class DATContagio extends Conexion {

    Connection con;

    public DATContagio() throws SQLException {
        this.con = getConexion();
    }

    public boolean Registrar(Contagio cnt, int idper) {
        PreparedStatement ps = null;

        String sql = "INSERT INTO contagio(idPersona, fechacontagio, fincontagio,latitud, longitud) "
                + "VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idper);
            ps.setDate(2, cnt.getFechacontagio());
            ps.setDate(3, cnt.getFincontagio());
            ps.setDouble(4,cnt.getLat());
            ps.setDouble(5,cnt.getLon());

            //  ps.setString(4, cnt.getGeolacalizacion());
            ps.execute();
            ps.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
//        } finally {
//            try {
//                    con.close();
//                } 
//            catch (SQLException e) {
//                System.err.println(e.getMessage());
//            }
        }
    }

    public ResultSet Buscar1(int id) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = null;
        String sql = "SELECT * FROM contagio WHERE idcontagio = " + id + "";
        try {
            rs = st.executeQuery(sql);
            System.out.println(rs.getRow());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }

    public ResultSet Buscar2(String nombre) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * from contagio WHERE idPersona = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
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
        String sql = "SELECT * from contagio";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
    }

    public boolean Modificar(Contagio cnt) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE contagio SET  fechacontagio=?, fincontagio=?,latitud=?, longitud=?"
                + "WHERE idPersona=?";
        try {
            ps = con.prepareStatement(sql);
           
            ps.setDate(1, cnt.getFechacontagio());
            ps.setDate(2, cnt.getFincontagio());
            ps.setDouble(3,cnt.getLat());
            ps.setDouble(4,cnt.getLon());
           ps.setInt(5, cnt.getPersona());
          
            ps.execute();
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }
        return false;
    }

    public boolean Eliminar(int id) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM contagio WHERE idcontagio=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (Exception e) {
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

    public ResultSet join() throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT  u.id_ubi, u.idcontagio, c.idpersona , c.fechacontagio, c.fincontagio , u.latidud, u.longitud\n" +
"FROM ubicacion u\n" +
" JOIN contagio c\n" +
"    on   c.idcontagio =  u.idcontagio;";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println(rs.getRow());
        } catch (SQLException e) {
            System.err.println(e);
        }
        return rs;
       
    }

}
