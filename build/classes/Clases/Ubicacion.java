/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author snaker
 */
public class Ubicacion {
    int id_ubi , idcontg;
    double latitud, longitud;

    public Ubicacion(int idcontg, double latitud, double longitud) {
        this.idcontg = idcontg;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Ubicacion(int id_ubi, int idcontg, double latitud, double longitud) {
        this.id_ubi = id_ubi;
        this.idcontg = idcontg;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getId_ubi() {
        return id_ubi;
    }

    public int getIdcontg() {
        return idcontg;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setId_ubi(int id_ubi) {
        this.id_ubi = id_ubi;
    }

    public void setIdcontg(int idcontg) {
        this.idcontg = idcontg;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
}
