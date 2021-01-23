/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenamiento;

import Clases.Contagio;
import Clases.Persona;
import Datos.DATContagio;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author snaker
 */
public class Blcontagio {

    Datos.DATContagio manejaContagio;

    public Blcontagio() throws SQLException {
        this.manejaContagio = new DATContagio();
    }

    public boolean Registrarcontagio(Contagio contg, int idper) throws SQLException {
        return manejaContagio.Registrar(contg, idper);
    }

    public ArrayList<Contagio> BuscarTodos() throws SQLException {
        ArrayList<Contagio> lstp = new ArrayList<>();
        ResultSet rs;

        rs = manejaContagio.BuscarTodos();
        while (rs.next()) {
            int Id = rs.getInt("idcontagio");
            int Idp = rs.getInt("idPersona");
            Date date = rs.getDate("fechacontagio");
            Date date2 = rs.getDate("fincontagio");
            double lat = rs.getDouble("latitud");
            double lon = rs.getDouble("longitud");


            Contagio contg = new Contagio(Id, Idp, date, date2,lat, lon);
            lstp.add(contg);
        }

        return (lstp);
    }
public ArrayList<Contagio> Joinn() throws SQLException {
        ArrayList<Contagio> lstp = new ArrayList<>();
        ResultSet rs;

        rs = manejaContagio.join();
        while (rs.next()) {
            int Id = rs.getInt("idcontagio");
            int Idp = rs.getInt("idPersona");
            Date date = rs.getDate("fechacontagio");
            Date date2 = rs.getDate("fincontagio");
            int Idubi= rs.getInt("id_ubi");
            double lat = rs.getDouble("latidud");
            double log = rs.getDouble("longitud");
            

            Contagio contg = new Contagio(Id, Idp, date, date2,Idubi,lat,log);
            lstp.add(contg);
        }

        return (lstp);
    }
    public ArrayList<Contagio> BuscarContagio(int idper) throws SQLException {
        ArrayList<Contagio> lstcontg;
        lstcontg = new ArrayList<>();
        ResultSet rs;
        /*Cuando el valor del criterio desde la UI es diferente a -1 es porque
        existe un criterio de búsqueda entonces entra al primer condicional, 
        caso contrario quiere decir que recupere todos los catalogos.
        Con esto evitamos crear varios métodos para recuperar la misma cantidad de datos
         */
        if (idper != -1) {
            rs = manejaContagio.Buscar1(idper);
        } else {
            rs = manejaContagio.BuscarTodos();
        }
        while (rs.next()) {
            int intId = rs.getInt("idcontagio");
            int idpers = rs.getInt("idPersona");
            Date fechacontagio = rs.getDate("fechacontagio");
            Date fechafin = rs.getDate("fincontagio");
            double lat = rs.getDouble("latitud");
            double log = rs.getDouble("longitud");
            

           
            Contagio contg = new Contagio(intId, idpers, fechacontagio,
                    fechafin,lat,log);
            lstcontg.add(contg);
        }
        return (lstcontg);
    }

    public boolean ModificarContagio(Contagio contg) throws SQLException {
        return manejaContagio.Modificar(contg);
    }

    public boolean EliminarCOntagio(int id) throws SQLException {
        return manejaContagio.Eliminar(id);

    }
}
