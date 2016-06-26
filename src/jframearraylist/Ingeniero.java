/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframearraylist;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class Ingeniero extends Persona{

    public Ingeniero(ArrayList Nombre, ArrayList Edad) {
        super(Nombre, Edad);
    }

    @Override
    public void IngresarNombre(String nombres) {
     super.Nombre.add(nombres);
     
    }

    @Override
    public void IngresarEdad(int edad) {
        super.Edad.add(edad);
    }

    @Override
    public void EliminarNombre(String nombres) {
     super.Nombre.remove(super.Nombre.indexOf(nombres));
     
    }

    @Override
    public void EliminarEdad(int edad) {
       super.Edad.remove(super.Edad.indexOf(edad));
    }

    @Override
    public String BuscarNombre(String nombres) {
      String buscarnombre="";
      if(super.Nombre.contains(nombres)==true) {
          buscarnombre=super.Nombre.get(super.Nombre.indexOf(nombres)).toString();
          
      }
      else {
          buscarnombre="No existe nombre";
      }
      return buscarnombre;
    }

    @Override
    public int BuscarEdad(int edad) {
    int buscaredad=0;
    if(super.Edad.contains(edad)==true) {
        buscaredad=Integer.parseInt(super.Edad.get(super.Edad.indexOf(edad)).toString());
    }
    else {
        
        buscaredad=0;
    }
    return buscaredad;
    }
    
    
    
    
}
