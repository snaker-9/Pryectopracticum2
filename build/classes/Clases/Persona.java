/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.logging.Logger;


    
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    private int idPersona;
    private int DNI;
    private String nombres;
    private String telefono;
    private String direccion;
    private int edad;
    private String sexo;
    

 
    public Persona(int DNI, String nombres, String telefono, String direccion, int edad, String sexo) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.sexo = sexo;
    }
    

    public Persona(int intId, int idcontg, double lat, double lon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona(String cedu, String nombres, String cel, String direccion, int edad, String sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public Persona getPersona(Persona per){
        return per;
    }

    @Override
    public String toString() {
        return "****PERSONA****\n"
                +"Cedula: " +DNI +"\n"
                +"Nombres: "+ nombres+"\n"
                + "Telefono: "+ telefono +"\n"
                + "Direccion: " + direccion + "\n"
                +"Edad: " + edad + "\n"
                +"Sexo: " + sexo ;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
 
   
 
    public int getIdPersona() {
        return idPersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  



    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

 
  

    public String getNombres() {
        return nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   
}    
