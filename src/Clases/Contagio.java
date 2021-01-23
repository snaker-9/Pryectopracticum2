/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

/**
 *
 * @author snaker
 */
public class Contagio {

    private static final long serialVersionUID = 1L;

    private int idcont;
    private int persona;
    private Date fechacontagio;
    private Date fincontagio;//desde la fecha de contagio

    int idubi;
    double lat,lon;

    public Contagio(int idcont, int persona, Date fechacontagio, Date fincontagio, double lat, double lon) {
        this.idcont = idcont;
        this.persona = persona;
        this.fechacontagio = fechacontagio;
        this.fincontagio = fincontagio;
        this.lat = lat;
        this.lon = lon;
    }
    

    public Contagio(int idcont, int persona, Date fechacontagio, Date fincontagio) {
        this.idcont = idcont;
        this.persona = persona;
        this.fechacontagio = fechacontagio;
        this.fincontagio = fincontagio;

    }

    public Contagio(int idcont, Date fechacontagio, Date fincontagio) {
        this.idcont = idcont;

        this.fechacontagio = fechacontagio;
        this.fincontagio = fincontagio;
    }

    public Contagio(Date fechacontagio) {
        this.fechacontagio = fechacontagio;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Contagio(int idcont, int persona, Date fechacontagio, Date fincontagio, int idubi, double lat, double lon) {
        this.idcont = idcont;
        this.persona = persona;
        this.fechacontagio = fechacontagio;
        this.fincontagio = fincontagio;
        this.idubi = idubi;
        this.lat = lat;
        this.lon = lon;
    }


    public Contagio(int Id, int idcontg, double lat, double log) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Contagio(int idp, Date sql, Date sql2, double lat, double logn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Contagio(int i, int idp, java.util.Date date1, java.util.Date date2, double lat, double logn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Contagio(int i, int idp, SimpleDateFormat formatter, java.util.Date date2, double lat, double logn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Contagio(int i, int idp, SimpleDateFormat formatter, SimpleDateFormat formatter2, double lat, double logn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Contagio(int i, int idp, String date1, String date2, double lat, double logn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "---CONTAGIO--- \n" + "Id: " + idcont + "\n" + "Fecha de Contagio: " + fechacontagio + "\n"
                + "Fin de Aislamiento: " + fincontagio;
        //To change body of generated methods, choose Tools | Templates.
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getIdcont() {
        return idcont;
    }

    public int getPersona() {
        return persona;
    }

    public Date getFechacontagio() {
        return fechacontagio;
    }

    public Date getFincontagio() {
        return fincontagio;
    }

    public void setFechacontagio(Date fechacontagio) {
        this.fechacontagio = fechacontagio;
    }

    public void setFincontagio(Date fincontagio) {
        this.fincontagio = fincontagio;
    }

    

    public void setIdcont(int idcont) {
        this.idcont = idcont;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

}
