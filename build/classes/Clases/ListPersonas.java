/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.JList;

/**
 *
 * @author snaker
 */
public class ListPersonas extends AbstractListModel {

    private ArrayList lista = new ArrayList<>();

    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Persona p = (Persona) lista.get(index);
        return p.getNombres();
    }

    public void addPersona(Persona p) {
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
       public void deleteall2(List l) {
        lista.removeAll(lista);
        //this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
    public void deleteall()
    { 
        lista.removeAll(lista);
        //this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
   public void delete(Persona p) {
        lista.remove(p);
        //this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
    public Persona getPersona(int index) {
        return (Persona) lista.get(index);
    }

   
       

   

}

