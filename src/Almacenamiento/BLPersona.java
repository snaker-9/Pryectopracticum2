/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenamiento;


import Clases.Persona;
import Datos.DATPersona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author snake
 */
public class BLPersona {

    Datos.DATPersona ManejaPer;

    public BLPersona() throws SQLException {
        this.ManejaPer = new DATPersona();
    }

    /*Método que envia a guardar datos en la BDD
    El tipo de dato de retorno es boolean, esto significa que si se inserta
    el retorno es true, caso contrario false*/
    public boolean Registrar(Persona per) throws SQLException {
        return ManejaPer.Registrar(per);
    }

    public ArrayList<Persona> Buscar2(String nom) throws SQLException {
        ArrayList<Persona> lstp;
        lstp = new ArrayList<>();
        ResultSet rs;
        /*Para enviar a buscar a la capa DataAcessLogic usando Statement*/
        //rs = ManejadorProducto.Buscar1(strCod);
        /*Para enviar a buscar a la capa DataAcessLogic usando PreparedStatement*/
        rs = ManejaPer.Buscar2(nom);
        while (rs.next()) {
           
            int strcedu = rs.getInt("DNI");
            String strNombres = rs.getString("nombres");
            String telf = rs.getString("telefono");
            String direccion = rs.getString("direccion");
            int edad = rs.getInt("edad");

            String sexo = rs.getString("sexo");

            Persona per = new Persona( strcedu, strNombres, telf, direccion, edad, sexo);
            lstp.add(per);
        }

        return (lstp);

    }

    public ArrayList<Persona> Buscar1(int id) throws SQLException {
        ArrayList<Persona> lstp;
        lstp = new ArrayList<>();
        ResultSet rs;
        /*Para enviar a buscar a la capa DataAcessLogic usando Statement*/
        //rs = ManejadorProducto.Buscar1(strCod);
        /*Para enviar a buscar a la capa DataAcessLogic usando PreparedStatement*/
        rs = ManejaPer.Buscar1(id);
        while (rs.next()) {
        
            int strcedu = rs.getInt("DNI");
            String strNombres = rs.getString("nombres");
            String telf = rs.getString("telefono");
            String direccion = rs.getString("direccion");
            int edad = rs.getInt("edad");
            String sexo = rs.getString("sexo");

            Persona per = new Persona(strcedu, strNombres, telf, direccion, edad, sexo);
            lstp.add(per);
        }

        return (lstp);

    }

    public ArrayList<Persona> BuscarTodos() throws SQLException {
        ArrayList<Persona> lstp = new ArrayList<>();
        ResultSet rs;
        /*Para enviar a buscar a la capa DataAcessLogic usando Statement*/
        //rs = ManejadorProducto.Buscar1(strCod);
        /*Para enviar a buscar a la capa DataAcessLogic usando PreparedStatement*/
        rs = ManejaPer.BuscarTodos();
        while (rs.next()) {
         
            int strcedu = rs.getInt("DNI");
            String strNombres = rs.getString("nombres");
            String telf = rs.getString("telefono");
            String direccion = rs.getString("direccion");
            int edad = rs.getInt("edad");

            String sexo = rs.getString("sexo");

            Persona per = new Persona( strcedu, strNombres, telf,
                    direccion, edad, sexo);
            lstp.add(per);
        }

        return (lstp);
    }

    public boolean Modificar(Persona per) throws SQLException {
        return ManejaPer.Modificar(per);
    }

    public boolean Eliminar(String id) throws SQLException {
        return ManejaPer.Eliminar(id);

    }

}

